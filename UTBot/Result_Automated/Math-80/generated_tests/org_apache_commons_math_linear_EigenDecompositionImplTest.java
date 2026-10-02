package org.apache.commons.math.linear;

import org.junit.Test;
import java.lang.reflect.Method;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_linear_EigenDecompositionImplTest {
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getSolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSolver()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.executesCondition {@code (eigenvectors == null): False}
 * @utbot.returnsFrom {@code return new Solver(realEigenvalues, imagEigenvalues, eigenvectors);}
 *  */
    @Test
    public void testGetSolver_EigenvectorsNotEqualsNull() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        org.apache.commons.math.linear.ArrayRealVector[] eigenvectors = {null};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors", eigenvectors);
        
        Object actual = eigenDecompositionImpl.getSolver();
        
        Object expected = createInstance("org.apache.commons.math.linear.EigenDecompositionImpl$Solver");
        setField(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors", eigenvectors);
        
        double[] actualRealEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues"));
        assertNull(actualRealEigenvalues);
        
        double[] actualImagEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "imagEigenvalues"));
        assertNull(actualImagEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] expectedEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        org.apache.commons.math.linear.ArrayRealVector[] actualEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        int expectedEigenvectorsSize = expectedEigenvectors.length;
        assertEquals(expectedEigenvectorsSize, actualEigenvectors.length);
        assertTrue(deepEquals(expectedEigenvectors, actualEigenvectors));
        
        org.apache.commons.math.linear.ArrayRealVector[] eigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        ArrayRealVector finalEigenDecompositionImplEigenvectors0 = ((ArrayRealVector) get(eigenDecompositionImplEigenvectors, 0));
        
        assertNull(finalEigenDecompositionImplEigenvectors0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSolver()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowNegativeArraySizeException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1705)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.225073858507202E-308, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = new double[12];
        realEigenvalues[5] = 2.0000000000000004;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowNullPointerException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1700)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowNullPointerException_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.225073858507202E-308, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowNullPointerException_2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowNullPointerException_3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetSolver_ThrowNullPointerException_4() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.2250738585072014E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSolver()
    
    @Test
    public void testGetSolver1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = new double[14];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        Object actual = eigenDecompositionImpl.getSolver();
        
        Object expected = createInstance("org.apache.commons.math.linear.EigenDecompositionImpl$Solver");
        setField(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues", realEigenvalues);
        org.apache.commons.math.linear.ArrayRealVector[] eigenvectors = new org.apache.commons.math.linear.ArrayRealVector[1];
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {1.0};
        arrayRealVector.data = data;
        eigenvectors[0] = arrayRealVector;
        setField(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors", eigenvectors);
        
        double[] expectedRealEigenvalues = ((double[]) getFieldValue(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues"));
        double[] actualRealEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues"));
        int expectedRealEigenvaluesSize = expectedRealEigenvalues.length;
        assertEquals(expectedRealEigenvaluesSize, actualRealEigenvalues.length);
        assertArrayEquals(expectedRealEigenvalues, actualRealEigenvalues, 1.0E-6);
        
        double[] actualImagEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "imagEigenvalues"));
        assertNull(actualImagEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] expectedEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        org.apache.commons.math.linear.ArrayRealVector[] actualEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        int expectedEigenvectorsSize = expectedEigenvectors.length;
        assertEquals(expectedEigenvectorsSize, actualEigenvectors.length);
        assertTrue(deepEquals(expectedEigenvectors, actualEigenvectors));
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork2, 3));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork3, 4));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork4, 1.0E-6);
    }
    
    @Test
    public void testGetSolver2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        Object actual = eigenDecompositionImpl.getSolver();
        
        Object expected = createInstance("org.apache.commons.math.linear.EigenDecompositionImpl$Solver");
        setField(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues", realEigenvalues);
        org.apache.commons.math.linear.ArrayRealVector[] eigenvectors = new org.apache.commons.math.linear.ArrayRealVector[2];
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {java.lang.Double.NaN, java.lang.Double.NaN};
        arrayRealVector.data = data;
        eigenvectors[0] = arrayRealVector;
        ArrayRealVector arrayRealVector1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {-0.0, 1.0};
        arrayRealVector1.data = data1;
        eigenvectors[1] = arrayRealVector1;
        setField(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors", eigenvectors);
        
        double[] expectedRealEigenvalues = ((double[]) getFieldValue(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues"));
        double[] actualRealEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues"));
        int expectedRealEigenvaluesSize = expectedRealEigenvalues.length;
        assertEquals(expectedRealEigenvaluesSize, actualRealEigenvalues.length);
        assertArrayEquals(expectedRealEigenvalues, actualRealEigenvalues, 1.0E-6);
        
        double[] actualImagEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "imagEigenvalues"));
        assertNull(actualImagEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] expectedEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        org.apache.commons.math.linear.ArrayRealVector[] actualEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        int expectedEigenvectorsSize = expectedEigenvectors.length;
        assertEquals(expectedEigenvectorsSize, actualEigenvectors.length);
        assertTrue(deepEquals(expectedEigenvectors, actualEigenvectors));
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork2, 3));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork3, 4));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork4, 6));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork5, 7));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork6, 9));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork7, 10));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        org.junit.Assert.assertEquals(-0.5, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.5, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    
    @Test
    public void testGetSolver3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        Object actual = eigenDecompositionImpl.getSolver();
        
        Object expected = createInstance("org.apache.commons.math.linear.EigenDecompositionImpl$Solver");
        setField(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues", realEigenvalues);
        org.apache.commons.math.linear.ArrayRealVector[] eigenvectors = new org.apache.commons.math.linear.ArrayRealVector[2];
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {java.lang.Double.NaN, java.lang.Double.NaN};
        arrayRealVector.data = data;
        eigenvectors[0] = arrayRealVector;
        ArrayRealVector arrayRealVector1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {java.lang.Double.NaN, java.lang.Double.NaN};
        arrayRealVector1.data = data1;
        eigenvectors[1] = arrayRealVector1;
        setField(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors", eigenvectors);
        
        double[] expectedRealEigenvalues = ((double[]) getFieldValue(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues"));
        double[] actualRealEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues"));
        int expectedRealEigenvaluesSize = expectedRealEigenvalues.length;
        assertEquals(expectedRealEigenvaluesSize, actualRealEigenvalues.length);
        assertArrayEquals(expectedRealEigenvalues, actualRealEigenvalues, 1.0E-6);
        
        double[] actualImagEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "imagEigenvalues"));
        assertNull(actualImagEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] expectedEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        org.apache.commons.math.linear.ArrayRealVector[] actualEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        int expectedEigenvectorsSize = expectedEigenvectors.length;
        assertEquals(expectedEigenvectorsSize, actualEigenvectors.length);
        assertTrue(deepEquals(expectedEigenvectors, actualEigenvectors));
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork2, 2));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork3, 3));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork4, 4));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork5, 5));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork6, 6));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork7, 7));
        double[] eigenDecompositionImplWork8 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork8, 9));
        double[] eigenDecompositionImplWork9 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork9, 10));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    
    @Test
    public void testGetSolver4() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        Object actual = eigenDecompositionImpl.getSolver();
        
        Object expected = createInstance("org.apache.commons.math.linear.EigenDecompositionImpl$Solver");
        setField(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues", realEigenvalues);
        org.apache.commons.math.linear.ArrayRealVector[] eigenvectors = new org.apache.commons.math.linear.ArrayRealVector[2];
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {java.lang.Double.NaN, java.lang.Double.NaN};
        arrayRealVector.data = data;
        eigenvectors[0] = arrayRealVector;
        ArrayRealVector arrayRealVector1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {java.lang.Double.NaN, java.lang.Double.NaN};
        arrayRealVector1.data = data1;
        eigenvectors[1] = arrayRealVector1;
        setField(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors", eigenvectors);
        
        double[] expectedRealEigenvalues = ((double[]) getFieldValue(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues"));
        double[] actualRealEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "realEigenvalues"));
        int expectedRealEigenvaluesSize = expectedRealEigenvalues.length;
        assertEquals(expectedRealEigenvaluesSize, actualRealEigenvalues.length);
        assertArrayEquals(expectedRealEigenvalues, actualRealEigenvalues, 1.0E-6);
        
        double[] actualImagEigenvalues = ((double[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "imagEigenvalues"));
        assertNull(actualImagEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] expectedEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(expected, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        org.apache.commons.math.linear.ArrayRealVector[] actualEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(actual, "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "eigenvectors"));
        int expectedEigenvectorsSize = expectedEigenvectors.length;
        assertEquals(expectedEigenvectorsSize, actualEigenvectors.length);
        assertTrue(deepEquals(expectedEigenvectors, actualEigenvectors));
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork2, 2));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork3, 3));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork4, 4));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork5, 5));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork6, 6));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork7, 7));
        double[] eigenDecompositionImplWork8 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork8, 9));
        double[] eigenDecompositionImplWork9 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork9, 10));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSolver()
    
    @Test
    public void testGetSolver5() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    @Test
    public void testGetSolver6() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1807)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    @Test
    public void testGetSolver7() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1806)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    @Test
    public void testGetSolver8() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    @Test
    public void testGetSolver9() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            0.0, 2.2250738667962474E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1807)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    @Test
    public void testGetSolver10() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            0.0, 2.225082346490365E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1806)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    @Test
    public void testGetSolver11() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    
    @Test
    public void testGetSolver12() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getSolver(EigenDecompositionImpl.java:357) */
        eigenDecompositionImpl.getSolver();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.decompose
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method decompose()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#decompose()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: computeGershgorinCircles();
 *  */
    @Test
    public void testDecompose_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        Array2DRowRealMatrix cachedV = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV", cachedV);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.decompose] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:583)
            org.apache.commons.math.linear.EigenDecompositionImpl.decompose(EigenDecompositionImpl.java:243) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method decomposeMethod = eigenDecompositionImplClazz.getDeclaredMethod("decompose");
        decomposeMethod.setAccessible(true);
        java.lang.Object[] decomposeMethodArguments = new java.lang.Object[0];
        try {
            decomposeMethod.invoke(eigenDecompositionImpl, decomposeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#decompose()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: computeGershgorinCircles();
 *  */
    @Test
    public void testDecompose_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.decompose] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:597)
            org.apache.commons.math.linear.EigenDecompositionImpl.decompose(EigenDecompositionImpl.java:243) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method decomposeMethod = eigenDecompositionImplClazz.getDeclaredMethod("decompose");
        decomposeMethod.setAccessible(true);
        java.lang.Object[] decomposeMethodArguments = new java.lang.Object[0];
        try {
            decomposeMethod.invoke(eigenDecompositionImpl, decomposeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#decompose()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work = new double[6 * main.length];
 *  */
    @Test
    public void testDecompose_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.decompose] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.decompose(EigenDecompositionImpl.java:240) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method decomposeMethod = eigenDecompositionImplClazz.getDeclaredMethod("decompose");
        decomposeMethod.setAccessible(true);
        java.lang.Object[] decomposeMethodArguments = new java.lang.Object[0];
        try {
            decomposeMethod.invoke(eigenDecompositionImpl, decomposeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#decompose()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: computeGershgorinCircles();
 *  */
    @Test
    public void testDecompose_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.decompose] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:583)
            org.apache.commons.math.linear.EigenDecompositionImpl.decompose(EigenDecompositionImpl.java:243) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method decomposeMethod = eigenDecompositionImplClazz.getDeclaredMethod("decompose");
        decomposeMethod.setAccessible(true);
        java.lang.Object[] decomposeMethodArguments = new java.lang.Object[0];
        try {
            decomposeMethod.invoke(eigenDecompositionImpl, decomposeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method decompose()
    
    @Test
    public void testDecompose1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            -2.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        OpenMapRealMatrix cachedVt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt", cachedVt);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.decompose] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:699)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616)
            org.apache.commons.math.linear.EigenDecompositionImpl.decompose(EigenDecompositionImpl.java:246) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method decomposeMethod = eigenDecompositionImplClazz.getDeclaredMethod("decompose");
        decomposeMethod.setAccessible(true);
        java.lang.Object[] decomposeMethodArguments = new java.lang.Object[0];
        try {
            decomposeMethod.invoke(eigenDecompositionImpl, decomposeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDecompose2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        Array2DRowRealMatrix cachedV = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV", cachedV);
        OpenMapRealMatrix cachedVt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt", cachedVt);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.decompose] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:704)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616)
            org.apache.commons.math.linear.EigenDecompositionImpl.decompose(EigenDecompositionImpl.java:246) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method decomposeMethod = eigenDecompositionImplClazz.getDeclaredMethod("decompose");
        decomposeMethod.setAccessible(true);
        java.lang.Object[] decomposeMethodArguments = new java.lang.Object[0];
        try {
            decomposeMethod.invoke(eigenDecompositionImpl, decomposeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDecompose3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {java.lang.Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        BlockRealMatrix cachedD = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedD", cachedD);
        BlockRealMatrix cachedVt = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt", cachedVt);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.decompose] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:704)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616)
            org.apache.commons.math.linear.EigenDecompositionImpl.decompose(EigenDecompositionImpl.java:246) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method decomposeMethod = eigenDecompositionImplClazz.getDeclaredMethod("decompose");
        decomposeMethod.setAccessible(true);
        java.lang.Object[] decomposeMethodArguments = new java.lang.Object[0];
        try {
            decomposeMethod.invoke(eigenDecompositionImpl, decomposeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDecompose4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {java.lang.Double.POSITIVE_INFINITY};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        Array2DRowRealMatrix cachedV = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV", cachedV);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.decompose] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:697)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616)
            org.apache.commons.math.linear.EigenDecompositionImpl.decompose(EigenDecompositionImpl.java:246) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method decomposeMethod = eigenDecompositionImplClazz.getDeclaredMethod("decompose");
        decomposeMethod.setAccessible(true);
        java.lang.Object[] decomposeMethodArguments = new java.lang.Object[0];
        try {
            decomposeMethod.invoke(eigenDecompositionImpl, decomposeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getD
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getD()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getD()}
 * @utbot.executesCondition {@code (cachedD == null): False}
 * @utbot.returnsFrom {@code return cachedD;}
 *  */
    @Test
    public void testGetD_CachedDNotEqualsNull() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix cachedD = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedD", cachedD);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) eigenDecompositionImpl.getD());
        
        int cachedDRows = ((Integer) getFieldValue(cachedD, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        assertEquals(cachedDRows, actualRows);
        
        int cachedDColumns = ((Integer) getFieldValue(cachedD, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        assertEquals(cachedDColumns, actualColumns);
        
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        assertNull(actualEntries);
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
    }
    ///endregion
    
    ///region Errors report for getD
    
    public void testGetD_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeterminant()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getDeterminant()}
 * @utbot.returnsFrom {@code return determinant;}
 *  */
    @Test
    public void testGetDeterminant_ReturnDeterminant() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] realEigenvalues = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        double actual = eigenDecompositionImpl.getDeterminant();
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getDeterminant()}
 * @utbot.iterates iterate the loop {@code for(double lambda: realEigenvalues)} once
 * @utbot.returnsFrom {@code return determinant;}
 *  */
    @Test
    public void testGetDeterminant_IterateForEachLoop() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] realEigenvalues = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        double actual = eigenDecompositionImpl.getDeterminant();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDeterminant()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getDeterminant()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(double lambda: realEigenvalues)
 *  */
    @Test
    public void testGetDeterminant_ThrowNullPointerException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant(EigenDecompositionImpl.java:348) */
        eigenDecompositionImpl.getDeterminant();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRealEigenvalues()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getRealEigenvalues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return realEigenvalues.clone();}
 *  */
    @Test
    public void testGetRealEigenvalues_ObjectClone() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] realEigenvalues = {8.289046E-317, 7.291122019556404E-304};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        double[] actual = eigenDecompositionImpl.getRealEigenvalues();
        
        double[] expected = {8.289046E-317, 7.291122019556404E-304};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRealEigenvalues()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getRealEigenvalues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return realEigenvalues.clone();
 *  */
    @Test
    public void testGetRealEigenvalues_ThrowNullPointerException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues(EigenDecompositionImpl.java:312) */
        eigenDecompositionImpl.getRealEigenvalues();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRealEigenvalue(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getRealEigenvalue(int)}
 * @utbot.returnsFrom {@code return realEigenvalues[i];}
 *  */
    @Test
    public void testGetRealEigenvalue_ReturnIOfRealEigenvalues() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] realEigenvalues = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        double actual = eigenDecompositionImpl.getRealEigenvalue(1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRealEigenvalue(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getRealEigenvalue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return realEigenvalues[i];
 *  */
    @Test
    public void testGetRealEigenvalue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] realEigenvalues = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(EigenDecompositionImpl.java:318) */
        eigenDecompositionImpl.getRealEigenvalue(-256);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getRealEigenvalue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return realEigenvalues[i];
 *  */
    @Test
    public void testGetRealEigenvalue_ThrowNullPointerException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(EigenDecompositionImpl.java:318) */
        eigenDecompositionImpl.getRealEigenvalue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImagEigenvalues()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getImagEigenvalues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return imagEigenvalues.clone();}
 *  */
    @Test
    public void testGetImagEigenvalues_ObjectClone() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] imagEigenvalues = {1.265E-321};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "imagEigenvalues", imagEigenvalues);
        
        double[] actual = eigenDecompositionImpl.getImagEigenvalues();
        
        double[] expected = {1.265E-321};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getImagEigenvalues()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getImagEigenvalues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return imagEigenvalues.clone();
 *  */
    @Test
    public void testGetImagEigenvalues_ThrowNullPointerException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues(EigenDecompositionImpl.java:324) */
        eigenDecompositionImpl.getImagEigenvalues();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImagEigenvalue(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getImagEigenvalue(int)}
 * @utbot.returnsFrom {@code return imagEigenvalues[i];}
 *  */
    @Test
    public void testGetImagEigenvalue_ReturnIOfImagEigenvalues() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] imagEigenvalues = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "imagEigenvalues", imagEigenvalues);
        
        double actual = eigenDecompositionImpl.getImagEigenvalue(1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getImagEigenvalue(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getImagEigenvalue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return imagEigenvalues[i];
 *  */
    @Test
    public void testGetImagEigenvalue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] imagEigenvalues = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "imagEigenvalues", imagEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(EigenDecompositionImpl.java:330) */
        eigenDecompositionImpl.getImagEigenvalue(-256);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getImagEigenvalue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return imagEigenvalues[i];
 *  */
    @Test
    public void testGetImagEigenvalue_ThrowNullPointerException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(EigenDecompositionImpl.java:330) */
        eigenDecompositionImpl.getImagEigenvalue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getVT
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVT()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.executesCondition {@code (cachedVt == null): False}
 * @utbot.returnsFrom {@code return cachedVt;}
 *  */
    @Test
    public void testGetVT_CachedVtNotEqualsNull() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix cachedVt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt", cachedVt);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) eigenDecompositionImpl.getVT());
        
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
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowNegativeArraySizeException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1705)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException_4() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1700)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {3.337610787760802E-308, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException_2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException_5() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.2250738585072014E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException_3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getVT()
    
    @Test
    public void testGetVT1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix initialEigenDecompositionImplCachedVt = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt"));
        
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) eigenDecompositionImpl.getVT());
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NaN};
        data[0] = doubleArray;
        double[] doubleArray1 = {java.lang.Double.NaN, java.lang.Double.NaN};
        data[1] = doubleArray1;
        expected.data = data;
        
        double[][] expectedData = expected.data;
        double[][] actualData = actual.data;
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork2, 2));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork3, 3));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork4, 4));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork5, 5));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork6, 6));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork7, 7));
        double[] eigenDecompositionImplWork8 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork8, 9));
        double[] eigenDecompositionImplWork9 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork9, 10));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix finalEigenDecompositionImplCachedVt = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        assertFalse(initialEigenDecompositionImplCachedVt == finalEigenDecompositionImplCachedVt);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    
    @Test
    public void testGetVT2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix initialEigenDecompositionImplCachedVt = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt"));
        
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) eigenDecompositionImpl.getVT());
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NaN};
        data[0] = doubleArray;
        double[] doubleArray1 = {java.lang.Double.NaN, java.lang.Double.NaN};
        data[1] = doubleArray1;
        expected.data = data;
        
        double[][] expectedData = expected.data;
        double[][] actualData = actual.data;
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork2, 2));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork3, 3));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork4, 4));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork5, 5));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork6, 6));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork7, 7));
        double[] eigenDecompositionImplWork8 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork8, 9));
        double[] eigenDecompositionImplWork9 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork9, 10));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix finalEigenDecompositionImplCachedVt = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        assertFalse(initialEigenDecompositionImplCachedVt == finalEigenDecompositionImplCachedVt);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    
    @Test
    public void testGetVT3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix initialEigenDecompositionImplCachedVt = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt"));
        
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) eigenDecompositionImpl.getVT());
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NaN};
        data[0] = doubleArray;
        double[] doubleArray1 = {-0.0, 1.0};
        data[1] = doubleArray1;
        expected.data = data;
        
        double[][] expectedData = expected.data;
        double[][] actualData = actual.data;
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork2, 3));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork3, 4));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork4, 6));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork5, 7));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork6, 9));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork7, 10));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix finalEigenDecompositionImplCachedVt = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedVt"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        assertFalse(initialEigenDecompositionImplCachedVt == finalEigenDecompositionImplCachedVt);
        
        org.junit.Assert.assertEquals(-0.5, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.5, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getVT()
    
    @Test
    public void testGetVT4() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[11];
        main[10] = 3.337610787760802E-308;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    @Test
    public void testGetVT5() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    @Test
    public void testGetVT6() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1807)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    @Test
    public void testGetVT7() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            2.225209666237823E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    @Test
    public void testGetVT8() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            2.233765553266995E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    @Test
    public void testGetVT9() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1806)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    @Test
    public void testGetVT10() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    @Test
    public void testGetVT11() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 3]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    
    @Test
    public void testGetVT12() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getVT(EigenDecompositionImpl.java:293) */
        eigenDecompositionImpl.getVT();
    }
    ///endregion
    
    ///region Errors report for getVT
    
    public void testGetVT_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEigenvalues()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvalues()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: List<Integer> splitIndices = computeSplits();
 *  */
    @Test
    public void testFindEigenvalues_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {3.337610787760802E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:699)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenvaluesMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvalues");
        findEigenvaluesMethod.setAccessible(true);
        java.lang.Object[] findEigenvaluesMethodArguments = new java.lang.Object[0];
        try {
            findEigenvaluesMethod.invoke(eigenDecompositionImpl, findEigenvaluesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvalues()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: List<Integer> splitIndices = computeSplits();
 *  */
    @Test
    public void testFindEigenvalues_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:696)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenvaluesMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvalues");
        findEigenvaluesMethod.setAccessible(true);
        java.lang.Object[] findEigenvaluesMethodArguments = new java.lang.Object[0];
        try {
            findEigenvaluesMethod.invoke(eigenDecompositionImpl, findEigenvaluesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvalues()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Integer> splitIndices = computeSplits();
 *  */
    @Test
    public void testFindEigenvalues_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:696)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenvaluesMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvalues");
        findEigenvaluesMethod.setAccessible(true);
        java.lang.Object[] findEigenvaluesMethodArguments = new java.lang.Object[0];
        try {
            findEigenvaluesMethod.invoke(eigenDecompositionImpl, findEigenvaluesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvalues()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Integer> splitIndices = computeSplits();
 *  */
    @Test
    public void testFindEigenvalues_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:697)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenvaluesMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvalues");
        findEigenvaluesMethod.setAccessible(true);
        java.lang.Object[] findEigenvaluesMethodArguments = new java.lang.Object[0];
        try {
            findEigenvaluesMethod.invoke(eigenDecompositionImpl, findEigenvaluesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findEigenvalues()
    
    @Test
    public void testFindEigenvalues1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-2.0000000000000004};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        
        double[] initialEigenDecompositionImplRealEigenvalues = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues"));
        double[] initialEigenDecompositionImplImagEigenvalues = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "imagEigenvalues"));
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenvaluesMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvalues");
        findEigenvaluesMethod.setAccessible(true);
        java.lang.Object[] findEigenvaluesMethodArguments = new java.lang.Object[0];
        findEigenvaluesMethod.invoke(eigenDecompositionImpl, findEigenvaluesMethodArguments);
        
        double[] finalEigenDecompositionImplRealEigenvalues = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues"));
        double[] finalEigenDecompositionImplImagEigenvalues = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "imagEigenvalues"));
        
        assertFalse(initialEigenDecompositionImplRealEigenvalues == finalEigenDecompositionImplRealEigenvalues);
        
        assertFalse(initialEigenDecompositionImplImagEigenvalues == finalEigenDecompositionImplImagEigenvalues);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findEigenvalues()
    
    @Test
    public void testFindEigenvalues2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "splitTolerance", 0.0);
        double[] main = {
            -3.337610787760802E-308, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            1.1125369292536007E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:704)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenvaluesMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvalues");
        findEigenvaluesMethod.setAccessible(true);
        java.lang.Object[] findEigenvaluesMethodArguments = new java.lang.Object[0];
        try {
            findEigenvaluesMethod.invoke(eigenDecompositionImpl, findEigenvaluesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFindEigenvalues3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "splitTolerance", 0.0);
        double[] main = {
            3.337610787760802E-308, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:704)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues(EigenDecompositionImpl.java:616) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenvaluesMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvalues");
        findEigenvaluesMethod.setAccessible(true);
        java.lang.Object[] findEigenvaluesMethodArguments = new java.lang.Object[0];
        try {
            findEigenvaluesMethod.invoke(eigenDecompositionImpl, findEigenvaluesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getV
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getV()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (cachedV == null): False}
 * @utbot.returnsFrom {@code return cachedV;}
 *  */
    @Test
    public void testGetV_CachedVNotEqualsNull() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix cachedV = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV", cachedV);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) eigenDecompositionImpl.getV());
        
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
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getV()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetV_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getV()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: findEigenVectors();
 *  */
    @Test
    public void testGetV_ThrowNegativeArraySizeException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1705)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getV()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetV_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getV()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetV_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getV()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1700)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getV()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetV_ThrowNullPointerException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getV()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {3.337610787760802E-308, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getV()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.2250738585072014E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getV()
    
    @Test
    public void testGetV1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = new double[14];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix initialEigenDecompositionImplCachedV = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV"));
        
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) eigenDecompositionImpl.getV());
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {1.0};
        data[0] = doubleArray;
        expected.data = data;
        
        double[][] expectedData = expected.data;
        double[][] actualData = actual.data;
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork2, 3));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork3, 4));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix finalEigenDecompositionImplCachedV = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        assertFalse(initialEigenDecompositionImplCachedV == finalEigenDecompositionImplCachedV);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork4, 1.0E-6);
    }
    
    @Test
    public void testGetV2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = new double[14];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix initialEigenDecompositionImplCachedV = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV"));
        
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) eigenDecompositionImpl.getV());
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {1.0};
        data[0] = doubleArray;
        expected.data = data;
        
        double[][] expectedData = expected.data;
        double[][] actualData = actual.data;
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix finalEigenDecompositionImplCachedV = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        assertFalse(initialEigenDecompositionImplCachedV == finalEigenDecompositionImplCachedV);
        
        org.junit.Assert.assertEquals(-0.0, finalEigenDecompositionImplWork0, 1.0E-6);
    }
    
    @Test
    public void testGetV3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix initialEigenDecompositionImplCachedV = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV"));
        
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) eigenDecompositionImpl.getV());
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, -0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {java.lang.Double.NaN, 1.0};
        data[1] = doubleArray1;
        expected.data = data;
        
        double[][] expectedData = expected.data;
        double[][] actualData = actual.data;
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork2, 3));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork3, 4));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork4, 6));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork5, 7));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork6, 9));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork7, 10));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix finalEigenDecompositionImplCachedV = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        assertFalse(initialEigenDecompositionImplCachedV == finalEigenDecompositionImplCachedV);
        
        org.junit.Assert.assertEquals(-0.5, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.5, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    
    @Test
    public void testGetV4() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix initialEigenDecompositionImplCachedV = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV"));
        
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) eigenDecompositionImpl.getV());
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NaN};
        data[0] = doubleArray;
        double[] doubleArray1 = {java.lang.Double.NaN, java.lang.Double.NaN};
        data[1] = doubleArray1;
        expected.data = data;
        
        double[][] expectedData = expected.data;
        double[][] actualData = actual.data;
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork2, 2));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork3, 3));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork4, 4));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork5, 5));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork6, 6));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork7, 7));
        double[] eigenDecompositionImplWork8 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork8, 9));
        double[] eigenDecompositionImplWork9 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork9, 10));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        RealMatrix finalEigenDecompositionImplCachedV = ((RealMatrix) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        assertFalse(initialEigenDecompositionImplCachedV == finalEigenDecompositionImplCachedV);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getV()
    
    @Test
    public void testGetV5() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        double[] realEigenvalues = {
            2.225107810439857E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    @Test
    public void testGetV6() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[11];
        main[10] = 3.337610787760802E-308;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    @Test
    public void testGetV7() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    @Test
    public void testGetV8() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            2.2250738586367177E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    @Test
    public void testGetV9() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            2.233765553266995E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    @Test
    public void testGetV10() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            -2.0000000000000004, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    @Test
    public void testGetV11() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    @Test
    public void testGetV12() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    
    @Test
    public void testGetV13() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260) */
        eigenDecompositionImpl.getV();
    }
    ///endregion
    
    ///region Errors report for getV
    
    public void testGetV_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSymmetric(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSymmetric_ReturnTrue() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", array2DRowRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = array2DRowRealMatrix;
        boolean actual = ((Boolean) isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSymmetric_IterateForLoop() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {null};
        array2DRowRealMatrix.data = data;
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", array2DRowRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = array2DRowRealMatrix;
        boolean actual = ((Boolean) isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments));
        
        assertTrue(actual);
        
        double[] finalArray2DRowRealMatrixData0 = array2DRowRealMatrix.data[0];
        
        assertNull(finalArray2DRowRealMatrixData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSymmetric(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double mij = matrix.getEntry(i, j);
 *  */
    @Test
    public void testIsSymmetric_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:384)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:220) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double mij = matrix.getEntry(i, j);
 *  */
    @Test
    public void testIsSymmetric_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:220) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double mij = matrix.getEntry(i, j);
 *  */
    @Test
    public void testIsSymmetric_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:220) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double mij = matrix.getEntry(i, j);
 *  */
    @Test
    public void testIsSymmetric_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:190)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:220) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int columns = matrix.getColumnDimension();
 *  */
    @Test
    public void testIsSymmetric_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {};
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:410)
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:216) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", array2DRowRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = array2DRowRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double mij = matrix.getEntry(i, j);
 *  */
    @Test
    public void testIsSymmetric_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[2] = 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:194)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:220) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int rows = matrix.getRowDimension();
 *  */
    @Test
    public void testIsSymmetric_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:215) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class realMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", realMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = ((Object) null);
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double mij = matrix.getEntry(i, j);
 *  */
    @Test
    public void testIsSymmetric_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:384)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:220) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSymmetric(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double mji = matrix.getEntry(j, i);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testIsSymmetric_ThrowMatrixIndexException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double mji = matrix.getEntry(j, i);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testIsSymmetric_ThrowMatrixIndexException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        keys[0] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[12];
        states[1] = (byte) 64;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#isSymmetric(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double mji = matrix.getEntry(j, i);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testIsSymmetric_ThrowMatrixIndexException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[10][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        data[9] = ((double[]) null);
        array2DRowRealMatrix.data = data;
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", array2DRowRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = array2DRowRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSymmetric(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testIsSymmetric1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[0] = -2147483646;
        keys[2] = -2147483646;
        keys[3] = -2147483646;
        keys[4] = -2147483646;
        keys[6] = -2147483646;
        keys[7] = -2147483646;
        keys[8] = -2147483646;
        keys[9] = -2147483646;
        keys[10] = -2147483646;
        keys[11] = -2147483646;
        keys[12] = -2147483646;
        keys[13] = -2147483646;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[14];
        states[1] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        boolean actual = ((Boolean) isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSymmetric2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[13][];
        double[] doubleArray = {
            0.0, -4.413712404196808E-305, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        double[] doubleArray1 = new double[17];
        doubleArray1[0] = 1.602053178125185E-306;
        data[1] = doubleArray1;
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        data[9] = ((double[]) null);
        data[10] = ((double[]) null);
        data[11] = ((double[]) null);
        data[12] = ((double[]) null);
        array2DRowRealMatrix.data = data;
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", array2DRowRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = array2DRowRealMatrix;
        boolean actual = ((Boolean) isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments));
        
        assertFalse(actual);
        
        double[] finalArray2DRowRealMatrixData2 = array2DRowRealMatrix.data[2];
        double[] finalArray2DRowRealMatrixData3 = array2DRowRealMatrix.data[3];
        double[] finalArray2DRowRealMatrixData4 = array2DRowRealMatrix.data[4];
        double[] finalArray2DRowRealMatrixData5 = array2DRowRealMatrix.data[5];
        double[] finalArray2DRowRealMatrixData6 = array2DRowRealMatrix.data[6];
        double[] finalArray2DRowRealMatrixData7 = array2DRowRealMatrix.data[7];
        double[] finalArray2DRowRealMatrixData8 = array2DRowRealMatrix.data[8];
        double[] finalArray2DRowRealMatrixData9 = array2DRowRealMatrix.data[9];
        double[] finalArray2DRowRealMatrixData10 = array2DRowRealMatrix.data[10];
        double[] finalArray2DRowRealMatrixData11 = array2DRowRealMatrix.data[11];
        double[] finalArray2DRowRealMatrixData12 = array2DRowRealMatrix.data[12];
        
        assertNull(finalArray2DRowRealMatrixData2);
        
        assertNull(finalArray2DRowRealMatrixData3);
        
        assertNull(finalArray2DRowRealMatrixData4);
        
        assertNull(finalArray2DRowRealMatrixData5);
        
        assertNull(finalArray2DRowRealMatrixData6);
        
        assertNull(finalArray2DRowRealMatrixData7);
        
        assertNull(finalArray2DRowRealMatrixData8);
        
        assertNull(finalArray2DRowRealMatrixData9);
        
        assertNull(finalArray2DRowRealMatrixData10);
        
        assertNull(finalArray2DRowRealMatrixData11);
        
        assertNull(finalArray2DRowRealMatrixData12);
    }
    
    @Test
    public void testIsSymmetric3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[1] = -2147483646;
        keys[2] = 1;
        keys[3] = -2147483646;
        keys[4] = -2147483646;
        keys[5] = -2147483646;
        keys[6] = -2147483646;
        keys[7] = -2147483646;
        keys[8] = -2147483646;
        keys[9] = -2147483646;
        keys[10] = -2147483646;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[11];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        boolean actual = ((Boolean) isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSymmetric(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testIsSymmetric4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:221) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsSymmetric5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[10][];
        double[] doubleArray = new double[18];
        doubleArray[1] = -0.0;
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        data[9] = ((double[]) null);
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:354)
            org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(EigenDecompositionImpl.java:221) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", array2DRowRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = array2DRowRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSymmetric(org.apache.commons.math.linear.RealMatrix)
    
    @Test(expected = MatrixIndexException.class)
    public void testIsSymmetric6() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", openMapRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = openMapRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MatrixIndexException.class)
    public void testIsSymmetric7() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[2][];
        double[] doubleArray = {
            java.lang.Double.NEGATIVE_INFINITY, 6.7903865311E-313, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        data[1] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method isSymmetricMethod = eigenDecompositionImplClazz.getDeclaredMethod("isSymmetric", array2DRowRealMatrixType);
        isSymmetricMethod.setAccessible(true);
        java.lang.Object[] isSymmetricMethodArguments = new java.lang.Object[1];
        isSymmetricMethodArguments[0] = array2DRowRealMatrix;
        try {
            isSymmetricMethod.invoke(eigenDecompositionImpl, isSymmetricMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEigenvector(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#copy()}
 * @utbot.returnsFrom {@code return eigenvectors[i].copy();}
 *  */
    @Test
    public void testGetEigenvector_EigenvectorsNotEqualsNull() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        org.apache.commons.math.linear.ArrayRealVector[] eigenvectors = new org.apache.commons.math.linear.ArrayRealVector[9];
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        arrayRealVector.data = data;
        eigenvectors[0] = arrayRealVector;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors", eigenvectors);
        
        ArrayRealVector actual = ((ArrayRealVector) eigenDecompositionImpl.getEigenvector(0));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
        
        org.apache.commons.math.linear.ArrayRealVector[] eigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        ArrayRealVector finalEigenDecompositionImplEigenvectors1 = ((ArrayRealVector) get(eigenDecompositionImplEigenvectors, 1));
        org.apache.commons.math.linear.ArrayRealVector[] eigenDecompositionImplEigenvectors1 = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        ArrayRealVector finalEigenDecompositionImplEigenvectors2 = ((ArrayRealVector) get(eigenDecompositionImplEigenvectors1, 2));
        org.apache.commons.math.linear.ArrayRealVector[] eigenDecompositionImplEigenvectors2 = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        ArrayRealVector finalEigenDecompositionImplEigenvectors3 = ((ArrayRealVector) get(eigenDecompositionImplEigenvectors2, 3));
        org.apache.commons.math.linear.ArrayRealVector[] eigenDecompositionImplEigenvectors3 = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        ArrayRealVector finalEigenDecompositionImplEigenvectors4 = ((ArrayRealVector) get(eigenDecompositionImplEigenvectors3, 4));
        org.apache.commons.math.linear.ArrayRealVector[] eigenDecompositionImplEigenvectors4 = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        ArrayRealVector finalEigenDecompositionImplEigenvectors5 = ((ArrayRealVector) get(eigenDecompositionImplEigenvectors4, 5));
        org.apache.commons.math.linear.ArrayRealVector[] eigenDecompositionImplEigenvectors5 = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        ArrayRealVector finalEigenDecompositionImplEigenvectors6 = ((ArrayRealVector) get(eigenDecompositionImplEigenvectors5, 6));
        org.apache.commons.math.linear.ArrayRealVector[] eigenDecompositionImplEigenvectors6 = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        ArrayRealVector finalEigenDecompositionImplEigenvectors7 = ((ArrayRealVector) get(eigenDecompositionImplEigenvectors6, 7));
        org.apache.commons.math.linear.ArrayRealVector[] eigenDecompositionImplEigenvectors7 = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        ArrayRealVector finalEigenDecompositionImplEigenvectors8 = ((ArrayRealVector) get(eigenDecompositionImplEigenvectors7, 8));
        
        assertNull(finalEigenDecompositionImplEigenvectors1);
        
        assertNull(finalEigenDecompositionImplEigenvectors2);
        
        assertNull(finalEigenDecompositionImplEigenvectors3);
        
        assertNull(finalEigenDecompositionImplEigenvectors4);
        
        assertNull(finalEigenDecompositionImplEigenvectors5);
        
        assertNull(finalEigenDecompositionImplEigenvectors6);
        
        assertNull(finalEigenDecompositionImplEigenvectors7);
        
        assertNull(finalEigenDecompositionImplEigenvectors8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEigenvector(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return eigenvectors[i].copy();
 *  */
    @Test
    public void testGetEigenvector_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        org.apache.commons.math.linear.ArrayRealVector[] eigenvectors = {null};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors", eigenvectors);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:339) */
        eigenDecompositionImpl.getEigenvector(-256);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: findEigenVectors();
 *  */
    @Test
    public void testGetEigenvector_ThrowNegativeArraySizeException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1705)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(-255);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetEigenvector_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(-255);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findEigenVectors();
 *  */
    @Test
    public void testGetEigenvector_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.225073858507202E-308, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(-255);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#copy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return eigenvectors[i].copy();
 *  */
    @Test
    public void testGetEigenvector_ThrowNullPointerException() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        org.apache.commons.math.linear.ArrayRealVector[] eigenvectors = {null, null};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors", eigenvectors);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:339) */
        eigenDecompositionImpl.getEigenvector(1);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetEigenvector_ThrowNullPointerException_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1700)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(-255);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetEigenvector_ThrowNullPointerException_2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(-255);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEigenVectors();
 *  */
    @Test
    public void testGetEigenvector_ThrowNullPointerException_3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {3.337610787760802E-308, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(-255);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#getEigenvector(int)}
 * @utbot.executesCondition {@code (eigenvectors == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetEigenvector_ThrowNullPointerException_4() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getEigenvector(int)
    
    @Test
    public void testGetEigenvector1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = new double[14];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        ArrayRealVector actual = ((ArrayRealVector) eigenDecompositionImpl.getEigenvector(0));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data = {1.0};
        expected.data = data;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork2, 3));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork3, 4));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(-3.337610787760802E-308, finalEigenDecompositionImplWork4, 1.0E-6);
    }
    
    @Test
    public void testGetEigenvector2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = new double[14];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        ArrayRealVector actual = ((ArrayRealVector) eigenDecompositionImpl.getEigenvector(0));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data = {1.0};
        expected.data = data;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        org.junit.Assert.assertEquals(-0.0, finalEigenDecompositionImplWork0, 1.0E-6);
    }
    
    @Test
    public void testGetEigenvector3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        ArrayRealVector actual = ((ArrayRealVector) eigenDecompositionImpl.getEigenvector(0));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data = {java.lang.Double.NaN, java.lang.Double.NaN};
        expected.data = data;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork2, 3));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork3, 4));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork4, 6));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork5, 7));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork6, 9));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork7, 10));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        org.junit.Assert.assertEquals(-0.5, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.5, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getEigenvector(int)
    
    @Test
    public void testGetEigenvector4() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(0);
    }
    
    @Test
    public void testGetEigenvector5() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            2.225073858507217E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(0);
    }
    
    @Test
    public void testGetEigenvector6() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(0);
    }
    
    @Test
    public void testGetEigenvector7() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1807)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(0);
    }
    
    @Test
    public void testGetEigenvector8() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            0.0, 2.225082346490365E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1806)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(0);
    }
    
    @Test
    public void testGetEigenvector9() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(0);
    }
    
    @Test
    public void testGetEigenvector10() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720)
            org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(EigenDecompositionImpl.java:337) */
        eigenDecompositionImpl.getEigenvector(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flipIfWarranted(int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#flipIfWarranted(int,int)}
 * @utbot.executesCondition {@code (1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testFlipIfWarranted_1dMultiplyPingPongOfWorkGreaterOrEqual4N1pingPongOfWork() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 1);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method flipIfWarrantedMethod = eigenDecompositionImplClazz.getDeclaredMethod("flipIfWarranted", intType, intType);
        flipIfWarrantedMethod.setAccessible(true);
        java.lang.Object[] flipIfWarrantedMethodArguments = new java.lang.Object[2];
        flipIfWarrantedMethodArguments[0] = 1;
        flipIfWarrantedMethodArguments[1] = 0;
        boolean actual = ((Boolean) flipIfWarrantedMethod.invoke(eigenDecompositionImpl, flipIfWarrantedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#flipIfWarranted(int,int)}
 * @utbot.executesCondition {@code (1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testFlipIfWarranted_1dMultiplyPingPongOfWorkLessThan4N1pingPongOfWork() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[25];
        work[8] = -1.6407238665576586E-179;
        work[12] = -1.177572250366211;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 12);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method flipIfWarrantedMethod = eigenDecompositionImplClazz.getDeclaredMethod("flipIfWarranted", intType, intType);
        flipIfWarrantedMethod.setAccessible(true);
        java.lang.Object[] flipIfWarrantedMethodArguments = new java.lang.Object[2];
        flipIfWarrantedMethodArguments[0] = 0;
        flipIfWarrantedMethodArguments[1] = 8;
        boolean actual = ((Boolean) flipIfWarrantedMethod.invoke(eigenDecompositionImpl, flipIfWarrantedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#flipIfWarranted(int,int)}
 * @utbot.executesCondition {@code (1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < j; i += 4)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testFlipIfWarranted_1dMultiplyPingPongOfWorkLessThan4N1pingPongOfWork_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[29];
        work[24] = -1.622458756453675E-309;
        work[28] = 2.43368813485232E-309;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 24);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method flipIfWarrantedMethod = eigenDecompositionImplClazz.getDeclaredMethod("flipIfWarranted", intType, intType);
        flipIfWarrantedMethod.setAccessible(true);
        java.lang.Object[] flipIfWarrantedMethodArguments = new java.lang.Object[2];
        flipIfWarrantedMethodArguments[0] = 2;
        flipIfWarrantedMethodArguments[1] = 4;
        boolean actual = ((Boolean) flipIfWarrantedMethod.invoke(eigenDecompositionImpl, flipIfWarrantedMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flipIfWarranted(int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#flipIfWarranted(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: 1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]
 *  */
    @Test
    public void testFlipIfWarranted_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 129);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(EigenDecompositionImpl.java:1133) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method flipIfWarrantedMethod = eigenDecompositionImplClazz.getDeclaredMethod("flipIfWarranted", intType, intType);
        flipIfWarrantedMethod.setAccessible(true);
        java.lang.Object[] flipIfWarrantedMethodArguments = new java.lang.Object[2];
        flipIfWarrantedMethodArguments[0] = -255;
        flipIfWarrantedMethodArguments[1] = -255;
        try {
            flipIfWarrantedMethod.invoke(eigenDecompositionImpl, flipIfWarrantedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#flipIfWarranted(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: 1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]
 *  */
    @Test
    public void testFlipIfWarranted_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1023 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(EigenDecompositionImpl.java:1133) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method flipIfWarrantedMethod = eigenDecompositionImplClazz.getDeclaredMethod("flipIfWarranted", intType, intType);
        flipIfWarrantedMethod.setAccessible(true);
        java.lang.Object[] flipIfWarrantedMethodArguments = new java.lang.Object[2];
        flipIfWarrantedMethodArguments[0] = -255;
        flipIfWarrantedMethodArguments[1] = -255;
        try {
            flipIfWarrantedMethod.invoke(eigenDecompositionImpl, flipIfWarrantedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#flipIfWarranted(int,int)}
 * @utbot.executesCondition {@code (1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < j; i += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[i + k] = work[j - k];
 *  */
    @Test
    public void testFlipIfWarranted_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[29];
        work[0] = -5.2332129699187E-310;
        work[28] = 7.9040099221875E-310;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 29]
            org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(EigenDecompositionImpl.java:1139) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method flipIfWarrantedMethod = eigenDecompositionImplClazz.getDeclaredMethod("flipIfWarranted", intType, intType);
        flipIfWarrantedMethod.setAccessible(true);
        java.lang.Object[] flipIfWarrantedMethodArguments = new java.lang.Object[2];
        flipIfWarrantedMethodArguments[0] = 8;
        flipIfWarrantedMethodArguments[1] = -255;
        try {
            flipIfWarrantedMethod.invoke(eigenDecompositionImpl, flipIfWarrantedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#flipIfWarranted(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: 1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]
 *  */
    @Test
    public void testFlipIfWarranted_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(EigenDecompositionImpl.java:1133) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method flipIfWarrantedMethod = eigenDecompositionImplClazz.getDeclaredMethod("flipIfWarranted", intType, intType);
        flipIfWarrantedMethod.setAccessible(true);
        java.lang.Object[] flipIfWarrantedMethodArguments = new java.lang.Object[2];
        flipIfWarrantedMethodArguments[0] = -255;
        flipIfWarrantedMethodArguments[1] = -255;
        try {
            flipIfWarrantedMethod.invoke(eigenDecompositionImpl, flipIfWarrantedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.goodStep
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method goodStep(int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 *  */
    @Test
    public void testGoodStep_StartGreaterOrEqualDeflatedEnd() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = -255;
        goodStepMethodArguments[1] = -255;
        int actual = ((Integer) goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments));
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method goodStep(int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: work[k - 3] > work[k - 7]
 *  */
    @Test
    public void testGoodStep_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1155 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1020) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = -226;
        goodStepMethodArguments[1] = -224;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: (start == deflatedEnd - 1) || ((start != deflatedEnd - 2) && ((work[k - 5] <= TOLERANCE_2 * (sigma + work[k - 3])) || (work[k - 2 * pingPong - 4] <= TOLERANCE_2 * work[k - 7])))
 *  */
    @Test
    public void testGoodStep_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1157 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1006) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = -253;
        goodStepMethodArguments[1] = -224;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: (start == deflatedEnd - 1) || ((start != deflatedEnd - 2) && ((work[k - 5] <= TOLERANCE_2 * (sigma + work[k - 3])) || (work[k - 2 * pingPong - 4] <= TOLERANCE_2 * work[k - 7])))
 *  */
    @Test
    public void testGoodStep_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma", 0.0);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -186);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1006) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = -45;
        goodStepMethodArguments[1] = 48;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: work[k - 3] > work[k - 7]
 *  */
    @Test
    public void testGoodStep_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -124);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index -4 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1020) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = 30;
        goodStepMethodArguments[1] = 32;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[4 * deflatedEnd - 4] = sigma + work[4 * deflatedEnd - 4 + pingPong];
 *  */
    @Test
    public void testGoodStep_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma", 0.0);
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -124);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index 512 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1012) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = 159;
        goodStepMethodArguments[1] = 160;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[4 * deflatedEnd - 4] = sigma + work[4 * deflatedEnd - 4 + pingPong];
 *  */
    @Test
    public void testGoodStep_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma", 0.0);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -123);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index 124 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1012) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = 31;
        goodStepMethodArguments[1] = 32;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[4 * deflatedEnd - 4] = sigma + work[4 * deflatedEnd - 4 + pingPong];
 *  */
    @Test
    public void testGoodStep_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma", -1.3837869274627084E29);
        double[] work = new double[14];
        work[10] = -14.53949138523037;
        work[12] = 2.042032486466797E28;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -148);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index 160 out of bounds for length 14]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1012) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = -108;
        goodStepMethodArguments[1] = 41;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[4 * deflatedEnd - 4] = sigma + work[k - 3];
 *  */
    @Test
    public void testGoodStep_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma", 0.0);
        double[] work = new double[36];
        work[29] = 4.580325470239446E-309;
        work[33] = 4.580325470239446E-309;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -3);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index 36 out of bounds for length 36]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1039) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = 8;
        goodStepMethodArguments[1] = 10;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: work[k - 3] > work[k - 7]
 *  */
    @Test
    public void testGoodStep_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1020) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = -226;
        goodStepMethodArguments[1] = -224;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (start == deflatedEnd - 1) || ((start != deflatedEnd - 2) && ((work[k - 5] <= TOLERANCE_2 * (sigma + work[k - 3])) || (work[k - 2 * pingPong - 4] <= TOLERANCE_2 * work[k - 7])))
 *  */
    @Test
    public void testGoodStep_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1006) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = -157;
        goodStepMethodArguments[1] = -96;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#goodStep(int,int)}
 * @utbot.iterates iterate the loop {@code for(boolean deflating = true; deflating; )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[4 * deflatedEnd - 4] = sigma + work[4 * deflatedEnd - 4 + pingPong];
 *  */
    @Test
    public void testGoodStep_ThrowNullPointerException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1012) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = -225;
        goodStepMethodArguments[1] = -224;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method goodStep(int, int)
    
    @Test
    public void testGoodStep1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[13];
        work[0] = 34.000732421875;
        work[1] = 34.000732421875;
        work[2] = 34.000732421875;
        work[3] = 34.000732421875;
        work[4] = 34.000732421875;
        work[5] = 34.000732421875;
        work[6] = 34.000732421875;
        work[7] = 34.000732421875;
        work[8] = 2.227280734129806E-308;
        work[9] = 34.000732421875;
        work[10] = 34.000732421875;
        work[11] = 34.000732421875;
        work[12] = 34.000732421875;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -2147483632);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483640 out of bounds for length 13]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1038) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = 536870910;
        goodStepMethodArguments[1] = 536870912;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGoodStep2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[33];
        work[0] = 1.951450132417529E289;
        work[1] = 1.951450132417529E289;
        work[2] = 1.951450132417529E289;
        work[3] = 1.951450132417529E289;
        work[4] = 1.951450132417529E289;
        work[5] = 1.951450132417529E289;
        work[6] = 1.951450132417529E289;
        work[7] = 1.951450132417529E289;
        work[8] = 1.951450132417529E289;
        work[9] = 1.951450132417529E289;
        work[10] = 1.951450132417529E289;
        work[11] = 1.951450132417529E289;
        work[12] = 1.951450132417529E289;
        work[13] = 1.951450132417529E289;
        work[14] = 1.951450132417529E289;
        work[15] = 1.951450132417529E289;
        work[16] = 1.951450132417529E289;
        work[17] = 1.951450132417529E289;
        work[18] = 1.951450132417529E289;
        work[19] = 1.951450132417529E289;
        work[20] = 1.951450132417529E289;
        work[21] = 1.951450132417529E289;
        work[22] = 1.951450132417529E289;
        work[23] = 1.951450132417529E289;
        work[24] = 1.951450132417529E289;
        work[25] = 1.951450132417529E289;
        work[26] = 1.951450132417529E289;
        work[27] = 1.951450132417529E289;
        work[28] = java.lang.Double.NaN;
        work[29] = 1.951450132417529E289;
        work[30] = 1.951450132417529E289;
        work[31] = 1.951450132417529E289;
        work[32] = 1.951450132417529E289;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 32);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.goodStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index -4 out of bounds for length 33]
            org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(EigenDecompositionImpl.java:1038) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method goodStepMethod = eigenDecompositionImplClazz.getDeclaredMethod("goodStep", intType, intType);
        goodStepMethod.setAccessible(true);
        java.lang.Object[] goodStepMethodArguments = new java.lang.Object[2];
        goodStepMethodArguments[0] = -1;
        goodStepMethodArguments[1] = 1;
        try {
            goodStepMethod.invoke(eigenDecompositionImpl, goodStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method eigenvaluesRange(int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#eigenvaluesRange(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lower = Math.min(lower, work[lowerStart + index + i]);
 *  */
    @Test
    public void testEigenvaluesRange_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange] produces [java.lang.ArrayIndexOutOfBoundsException: Index -251 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(EigenDecompositionImpl.java:1163) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method eigenvaluesRangeMethod = eigenDecompositionImplClazz.getDeclaredMethod("eigenvaluesRange", intType, intType);
        eigenvaluesRangeMethod.setAccessible(true);
        java.lang.Object[] eigenvaluesRangeMethodArguments = new java.lang.Object[2];
        eigenvaluesRangeMethodArguments[0] = -255;
        eigenvaluesRangeMethodArguments[1] = 1;
        try {
            eigenvaluesRangeMethod.invoke(eigenDecompositionImpl, eigenvaluesRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#eigenvaluesRange(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: upper = Math.max(upper, work[upperStart + index + i]);
 *  */
    @Test
    public void testEigenvaluesRange_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, java.lang.Double.POSITIVE_INFINITY};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(EigenDecompositionImpl.java:1164) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method eigenvaluesRangeMethod = eigenDecompositionImplClazz.getDeclaredMethod("eigenvaluesRange", intType, intType);
        eigenvaluesRangeMethod.setAccessible(true);
        java.lang.Object[] eigenvaluesRangeMethodArguments = new java.lang.Object[2];
        eigenvaluesRangeMethodArguments[0] = -7;
        eigenvaluesRangeMethodArguments[1] = 1;
        try {
            eigenvaluesRangeMethod.invoke(eigenDecompositionImpl, eigenvaluesRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#eigenvaluesRange(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; ++i)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lower = Math.min(lower, work[lowerStart + index + i]);
 *  */
    @Test
    public void testEigenvaluesRange_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {java.lang.Double.POSITIVE_INFINITY};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(EigenDecompositionImpl.java:1163) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method eigenvaluesRangeMethod = eigenDecompositionImplClazz.getDeclaredMethod("eigenvaluesRange", intType, intType);
        eigenvaluesRangeMethod.setAccessible(true);
        java.lang.Object[] eigenvaluesRangeMethodArguments = new java.lang.Object[2];
        eigenvaluesRangeMethodArguments[0] = 0;
        eigenvaluesRangeMethodArguments[1] = 2;
        try {
            eigenvaluesRangeMethod.invoke(eigenDecompositionImpl, eigenvaluesRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#eigenvaluesRange(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int lowerStart = 4 * main.length;
 *  */
    @Test
    public void testEigenvaluesRange_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(EigenDecompositionImpl.java:1158) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method eigenvaluesRangeMethod = eigenDecompositionImplClazz.getDeclaredMethod("eigenvaluesRange", intType, intType);
        eigenvaluesRangeMethod.setAccessible(true);
        java.lang.Object[] eigenvaluesRangeMethodArguments = new java.lang.Object[2];
        eigenvaluesRangeMethodArguments[0] = -255;
        eigenvaluesRangeMethodArguments[1] = -255;
        try {
            eigenvaluesRangeMethod.invoke(eigenDecompositionImpl, eigenvaluesRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#eigenvaluesRange(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lower = Math.min(lower, work[lowerStart + index + i]);
 *  */
    @Test
    public void testEigenvaluesRange_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(EigenDecompositionImpl.java:1163) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method eigenvaluesRangeMethod = eigenDecompositionImplClazz.getDeclaredMethod("eigenvaluesRange", intType, intType);
        eigenvaluesRangeMethod.setAccessible(true);
        java.lang.Object[] eigenvaluesRangeMethodArguments = new java.lang.Object[2];
        eigenvaluesRangeMethodArguments[0] = -255;
        eigenvaluesRangeMethodArguments[1] = 1;
        try {
            eigenvaluesRangeMethod.invoke(eigenDecompositionImpl, eigenvaluesRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method eigenvaluesRange(int, int)
    
    @Test
    public void testEigenvaluesRange1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "minPivot", 0.0);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method eigenvaluesRangeMethod = eigenDecompositionImplClazz.getDeclaredMethod("eigenvaluesRange", intType, intType);
        eigenvaluesRangeMethod.setAccessible(true);
        java.lang.Object[] eigenvaluesRangeMethodArguments = new java.lang.Object[2];
        eigenvaluesRangeMethodArguments[0] = 0;
        eigenvaluesRangeMethodArguments[1] = -2147483647;
        double[] actual = ((double[]) eigenvaluesRangeMethod.invoke(eigenDecompositionImpl, eigenvaluesRangeMethodArguments));
        
        double[] expected = {java.lang.Double.NaN, java.lang.Double.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void testEigenvaluesRange2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "minPivot", 0.0);
        double[] work = new double[22];
        work[20] = -3.844919605042134E-270;
        work[21] = -3.844919605042134E-270;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method eigenvaluesRangeMethod = eigenDecompositionImplClazz.getDeclaredMethod("eigenvaluesRange", intType, intType);
        eigenvaluesRangeMethod.setAccessible(true);
        java.lang.Object[] eigenvaluesRangeMethodArguments = new java.lang.Object[2];
        eigenvaluesRangeMethodArguments[0] = 16;
        eigenvaluesRangeMethodArguments[1] = 1;
        double[] actual = ((double[]) eigenvaluesRangeMethod.invoke(eigenDecompositionImpl, eigenvaluesRangeMethodArguments));
        
        double[] expected = {-3.844919605042134E-270, -3.844919605042134E-270};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method eigenvaluesRange(int, int)
    
    @Test
    public void testEigenvaluesRange3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "minPivot", java.lang.Double.NaN);
        double[] work = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, -5.597285445448904E-309, 5.597285445448904E-309
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues(EigenDecompositionImpl.java:1231)
            org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(EigenDecompositionImpl.java:1188) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method eigenvaluesRangeMethod = eigenDecompositionImplClazz.getDeclaredMethod("eigenvaluesRange", intType, intType);
        eigenvaluesRangeMethod.setAccessible(true);
        java.lang.Object[] eigenvaluesRangeMethodArguments = new java.lang.Object[2];
        eigenvaluesRangeMethodArguments[0] = 3;
        eigenvaluesRangeMethodArguments[1] = 1;
        try {
            eigenvaluesRangeMethod.invoke(eigenDecompositionImpl, eigenvaluesRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEigenvaluesRange4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = new double[39];
        work[33] = java.lang.Double.POSITIVE_INFINITY;
        work[38] = java.lang.Double.NEGATIVE_INFINITY;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(EigenDecompositionImpl.java:1164) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method eigenvaluesRangeMethod = eigenDecompositionImplClazz.getDeclaredMethod("eigenvaluesRange", intType, intType);
        eigenvaluesRangeMethod.setAccessible(true);
        java.lang.Object[] eigenvaluesRangeMethodArguments = new java.lang.Object[2];
        eigenvaluesRangeMethodArguments[0] = 13;
        eigenvaluesRangeMethodArguments[1] = 33;
        try {
            eigenvaluesRangeMethod.invoke(eigenDecompositionImpl, eigenvaluesRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process2RowsBlock(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process2RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double q0 = main[index];
 *  */
    @Test
    public void testProcess2RowsBlock_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock(EigenDecompositionImpl.java:733) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process2RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process2RowsBlock", intType);
        process2RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process2RowsBlockMethodArguments = new java.lang.Object[1];
        process2RowsBlockMethodArguments[0] = 129;
        try {
            process2RowsBlockMethod.invoke(eigenDecompositionImpl, process2RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process2RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double q1 = main[index + 1];
 *  */
    @Test
    public void testProcess2RowsBlock_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock(EigenDecompositionImpl.java:734) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process2RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process2RowsBlock", intType);
        process2RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process2RowsBlockMethodArguments = new java.lang.Object[1];
        process2RowsBlockMethodArguments[0] = 0;
        try {
            process2RowsBlockMethod.invoke(eigenDecompositionImpl, process2RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process2RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double e12 = squaredSecondary[index];
 *  */
    @Test
    public void testProcess2RowsBlock_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] squaredSecondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "squaredSecondary", squaredSecondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock(EigenDecompositionImpl.java:735) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process2RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process2RowsBlock", intType);
        process2RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process2RowsBlockMethodArguments = new java.lang.Object[1];
        process2RowsBlockMethodArguments[0] = 0;
        try {
            process2RowsBlockMethod.invoke(eigenDecompositionImpl, process2RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process2RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double q0 = main[index];
 *  */
    @Test
    public void testProcess2RowsBlock_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock(EigenDecompositionImpl.java:733) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process2RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process2RowsBlock", intType);
        process2RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process2RowsBlockMethodArguments = new java.lang.Object[1];
        process2RowsBlockMethodArguments[0] = -255;
        try {
            process2RowsBlockMethod.invoke(eigenDecompositionImpl, process2RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process2RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double e12 = squaredSecondary[index];
 *  */
    @Test
    public void testProcess2RowsBlock_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock(EigenDecompositionImpl.java:735) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process2RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process2RowsBlock", intType);
        process2RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process2RowsBlockMethodArguments = new java.lang.Object[1];
        process2RowsBlockMethodArguments[0] = 0;
        try {
            process2RowsBlockMethod.invoke(eigenDecompositionImpl, process2RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process3RowsBlock(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process3RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double q0 = main[index];
 *  */
    @Test
    public void testProcess3RowsBlock_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(EigenDecompositionImpl.java:761) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process3RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process3RowsBlock", intType);
        process3RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process3RowsBlockMethodArguments = new java.lang.Object[1];
        process3RowsBlockMethodArguments[0] = 129;
        try {
            process3RowsBlockMethod.invoke(eigenDecompositionImpl, process3RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process3RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double q1 = main[index + 1];
 *  */
    @Test
    public void testProcess3RowsBlock_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(EigenDecompositionImpl.java:762) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process3RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process3RowsBlock", intType);
        process3RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process3RowsBlockMethodArguments = new java.lang.Object[1];
        process3RowsBlockMethodArguments[0] = 0;
        try {
            process3RowsBlockMethod.invoke(eigenDecompositionImpl, process3RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process3RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double q2 = main[index + 2];
 *  */
    @Test
    public void testProcess3RowsBlock_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(EigenDecompositionImpl.java:763) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process3RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process3RowsBlock", intType);
        process3RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process3RowsBlockMethodArguments = new java.lang.Object[1];
        process3RowsBlockMethodArguments[0] = 0;
        try {
            process3RowsBlockMethod.invoke(eigenDecompositionImpl, process3RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process3RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double e12 = squaredSecondary[index];
 *  */
    @Test
    public void testProcess3RowsBlock_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[31];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] squaredSecondary = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "squaredSecondary", squaredSecondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(EigenDecompositionImpl.java:764) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process3RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process3RowsBlock", intType);
        process3RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process3RowsBlockMethodArguments = new java.lang.Object[1];
        process3RowsBlockMethodArguments[0] = 17;
        try {
            process3RowsBlockMethod.invoke(eigenDecompositionImpl, process3RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process3RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double q1q2Me22 = q1 * q2 - squaredSecondary[index + 1];
 *  */
    @Test
    public void testProcess3RowsBlock_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] squaredSecondary = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "squaredSecondary", squaredSecondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(EigenDecompositionImpl.java:765) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process3RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process3RowsBlock", intType);
        process3RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process3RowsBlockMethodArguments = new java.lang.Object[1];
        process3RowsBlockMethodArguments[0] = 0;
        try {
            process3RowsBlockMethod.invoke(eigenDecompositionImpl, process3RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process3RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double q0 = main[index];
 *  */
    @Test
    public void testProcess3RowsBlock_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(EigenDecompositionImpl.java:761) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process3RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process3RowsBlock", intType);
        process3RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process3RowsBlockMethodArguments = new java.lang.Object[1];
        process3RowsBlockMethodArguments[0] = -255;
        try {
            process3RowsBlockMethod.invoke(eigenDecompositionImpl, process3RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process3RowsBlock(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double e12 = squaredSecondary[index];
 *  */
    @Test
    public void testProcess3RowsBlock_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[13];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(EigenDecompositionImpl.java:764) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process3RowsBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process3RowsBlock", intType);
        process3RowsBlockMethod.setAccessible(true);
        java.lang.Object[] process3RowsBlockMethodArguments = new java.lang.Object[1];
        process3RowsBlockMethodArguments[0] = 10;
        try {
            process3RowsBlockMethod.invoke(eigenDecompositionImpl, process3RowsBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeSplits()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeSplits()}
 * @utbot.invokes {@link java.lang.Math#abs(double)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < secondary.length; ++i)} once
 * @utbot.returnsFrom {@code return list;}
 *  */
    @Test
    public void testComputeSplits_ListAdd() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeSplits");
        computeSplitsMethod.setAccessible(true);
        java.lang.Object[] computeSplitsMethodArguments = new java.lang.Object[0];
        ArrayList actual = ((ArrayList) computeSplitsMethod.invoke(eigenDecompositionImpl, computeSplitsMethodArguments));
        
        ArrayList expected = new ArrayList();
        Integer integer = 1;
        expected.add(integer);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeSplits()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeSplits()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double absDCurrent = Math.abs(main[0]);
 *  */
    @Test
    public void testComputeSplits_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:696) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeSplits");
        computeSplitsMethod.setAccessible(true);
        java.lang.Object[] computeSplitsMethodArguments = new java.lang.Object[0];
        try {
            computeSplitsMethod.invoke(eigenDecompositionImpl, computeSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeSplits()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < secondary.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: absDCurrent = Math.abs(main[i + 1]);
 *  */
    @Test
    public void testComputeSplits_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {3.337610787760802E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:699) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeSplits");
        computeSplitsMethod.setAccessible(true);
        java.lang.Object[] computeSplitsMethodArguments = new java.lang.Object[0];
        try {
            computeSplitsMethod.invoke(eigenDecompositionImpl, computeSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeSplits()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double absDCurrent = Math.abs(main[0]);
 *  */
    @Test
    public void testComputeSplits_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:696) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeSplits");
        computeSplitsMethod.setAccessible(true);
        java.lang.Object[] computeSplitsMethodArguments = new java.lang.Object[0];
        try {
            computeSplitsMethod.invoke(eigenDecompositionImpl, computeSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeSplits()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < secondary.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < secondary.length; ++i)
 *  */
    @Test
    public void testComputeSplits_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {3.337610787760802E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:697) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeSplits");
        computeSplitsMethod.setAccessible(true);
        java.lang.Object[] computeSplitsMethodArguments = new java.lang.Object[0];
        try {
            computeSplitsMethod.invoke(eigenDecompositionImpl, computeSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeSplits()
    
    @Test
    public void testComputeSplits1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "splitTolerance", 0.0);
        double[] main = {
            3.337610787760802E-308, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:704) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeSplits");
        computeSplitsMethod.setAccessible(true);
        java.lang.Object[] computeSplitsMethodArguments = new java.lang.Object[0];
        try {
            computeSplitsMethod.invoke(eigenDecompositionImpl, computeSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeSplits2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "splitTolerance", 0.0);
        double[] main = {
            3.337610787760802E-308, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            1.1125369292536007E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits(EigenDecompositionImpl.java:704) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeSplits");
        computeSplitsMethod.setAccessible(true);
        java.lang.Object[] computeSplitsMethodArguments = new java.lang.Object[0];
        try {
            computeSplitsMethod.invoke(eigenDecompositionImpl, computeSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process1RowBlock(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process1RowBlock(int)}
 *  */
    @Test
    public void testProcess1RowBlock() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process1RowBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process1RowBlock", intType);
        process1RowBlockMethod.setAccessible(true);
        java.lang.Object[] process1RowBlockMethodArguments = new java.lang.Object[1];
        process1RowBlockMethodArguments[0] = 1;
        process1RowBlockMethod.invoke(eigenDecompositionImpl, process1RowBlockMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process1RowBlock(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process1RowBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: realEigenvalues[index] = main[index];
 *  */
    @Test
    public void testProcess1RowBlock_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock(EigenDecompositionImpl.java:719) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process1RowBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process1RowBlock", intType);
        process1RowBlockMethod.setAccessible(true);
        java.lang.Object[] process1RowBlockMethodArguments = new java.lang.Object[1];
        process1RowBlockMethodArguments[0] = 1;
        try {
            process1RowBlockMethod.invoke(eigenDecompositionImpl, process1RowBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process1RowBlock(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: realEigenvalues[index] = main[index];
 *  */
    @Test
    public void testProcess1RowBlock_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock(EigenDecompositionImpl.java:719) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process1RowBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process1RowBlock", intType);
        process1RowBlockMethod.setAccessible(true);
        java.lang.Object[] process1RowBlockMethodArguments = new java.lang.Object[1];
        process1RowBlockMethodArguments[0] = -256;
        try {
            process1RowBlockMethod.invoke(eigenDecompositionImpl, process1RowBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process1RowBlock(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: realEigenvalues[index] = main[index];
 *  */
    @Test
    public void testProcess1RowBlock_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock(EigenDecompositionImpl.java:719) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process1RowBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process1RowBlock", intType);
        process1RowBlockMethod.setAccessible(true);
        java.lang.Object[] process1RowBlockMethodArguments = new java.lang.Object[1];
        process1RowBlockMethodArguments[0] = 1;
        try {
            process1RowBlockMethod.invoke(eigenDecompositionImpl, process1RowBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#process1RowBlock(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: realEigenvalues[index] = main[index];
 *  */
    @Test
    public void testProcess1RowBlock_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock(EigenDecompositionImpl.java:719) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method process1RowBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("process1RowBlock", intType);
        process1RowBlockMethod.setAccessible(true);
        java.lang.Object[] process1RowBlockMethodArguments = new java.lang.Object[1];
        process1RowBlockMethodArguments[0] = -255;
        try {
            process1RowBlockMethod.invoke(eigenDecompositionImpl, process1RowBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initialSplits(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#initialSplits(int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < 2; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double d = work[4 * (n - 1) + pingPong];
 *  */
    @Test
    public void testInitialSplits_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 512 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits(EigenDecompositionImpl.java:941) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = 129;
        try {
            initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#initialSplits(int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < 2; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[4 * n - 3 - pingPong] = d;
 *  */
    @Test
    public void testInitialSplits_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits(EigenDecompositionImpl.java:971) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = 1;
        try {
            initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#initialSplits(int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < 2; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double d = work[4 * (n - 1) + pingPong];
 *  */
    @Test
    public void testInitialSplits_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits(EigenDecompositionImpl.java:941) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = -255;
        try {
            initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method initialSplits(int)
    
    @Test
    public void testInitialSplits1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        work[0] = -1.4664539105417225E135;
        work[1] = -1.4664539105417225E135;
        work[2] = -1.4664539105417225E135;
        work[3] = -1.4664539105417225E135;
        work[4] = 1.3158148080438021;
        work[5] = -1.4664539105417225E135;
        work[6] = -1.4664539105417225E135;
        work[7] = -1.4664539105417225E135;
        work[8] = -1.4664539105417225E135;
        work[9] = -1.4664539105417225E135;
        work[10] = -1.4664539105417225E135;
        work[11] = -1.4664539105417225E135;
        work[12] = -1.4664539105417225E135;
        work[13] = -1.4664539105417225E135;
        work[14] = -1.4664539105417225E135;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = 2;
        initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork, 2));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork1, 3));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork2, 5));
        
        org.junit.Assert.assertEquals(0.0, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.0, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.3158148080438021, finalEigenDecompositionImplWork5, 1.0E-6);
    }
    
    @Test
    public void testInitialSplits2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        work[0] = 41111.25000000049;
        work[2] = -2.225073858507202E-308;
        work[4] = 1.938352176115945E-308;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = 2;
        initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork, 1));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork1, 2));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork2, 3));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork3, 5));
        
        org.junit.Assert.assertEquals(41111.25000000049, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.0, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.938352176115945E-308, finalEigenDecompositionImplWork5, 1.0E-6);
    }
    
    @Test
    public void testInitialSplits3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = 2;
        initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
    }
    
    @Test
    public void testInitialSplits4() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[14];
        work[0] = 1.8555672540532672E-227;
        work[1] = -7.185997050946241E-265;
        work[2] = -7.185997050946241E-265;
        work[3] = -7.185997050946241E-265;
        work[4] = -2.719398642925511E154;
        work[5] = -7.185997050946241E-265;
        work[6] = -7.185997050946241E-265;
        work[7] = -7.185997050946241E-265;
        work[8] = -7.185997050946241E-265;
        work[9] = -7.185997050946241E-265;
        work[10] = -7.185997050946241E-265;
        work[11] = -7.185997050946241E-265;
        work[12] = -7.185997050946241E-265;
        work[13] = -7.185997050946241E-265;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = 2;
        initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork, 1));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork1, 2));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork2, 3));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork3, 5));
        
        org.junit.Assert.assertEquals(1.8555672540532672E-227, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.0, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(-2.719398642925511E154, finalEigenDecompositionImplWork5, 1.0E-6);
    }
    
    @Test
    public void testInitialSplits5() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = 1;
        initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
    }
    
    @Test
    public void testInitialSplits6() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        work[0] = 2.237502219360062E-154;
        work[1] = 2.237502219360062E-154;
        work[2] = 2.237502219360062E-154;
        work[3] = 2.237502219360062E-154;
        work[4] = 2.237502219360062E-154;
        work[5] = 2.237502219360062E-154;
        work[6] = 2.237502219360062E-154;
        work[7] = 2.237502219360062E-154;
        work[8] = -1.841793E-318;
        work[9] = 2.237502219360062E-154;
        work[10] = 2.237502219360062E-154;
        work[11] = 2.237502219360062E-154;
        work[12] = 2.237502219360062E-154;
        work[13] = 2.237502219360062E-154;
        work[14] = 2.237502219360062E-154;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = 3;
        initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork2, 2));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork3, 3));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork4, 4));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork5, 5));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork6, 6));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork7, 7));
        double[] eigenDecompositionImplWork8 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork8 = ((Double) get(eigenDecompositionImplWork8, 8));
        double[] eigenDecompositionImplWork9 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork9, 9));
        
        org.junit.Assert.assertEquals(5.593755548400155E-154, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(4.475004438720124E-154, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(6.712506658080185E-155, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.118751109680031E-154, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.685002663232074E-154, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(3.356253329040093E-154, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.0, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(-6.1393E-319, finalEigenDecompositionImplWork8, 1.0E-6);
        
        org.junit.Assert.assertEquals(-6.1393E-319, finalEigenDecompositionImplWork9, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method initialSplits(int)
    
    @Test
    public void testInitialSplits7() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[29];
        work[0] = -5.695335426481839E-246;
        work[1] = -5.695335426481839E-246;
        work[2] = -5.695335426481839E-246;
        work[3] = -5.695335426481839E-246;
        work[4] = -5.695335426481839E-246;
        work[5] = -5.695335426481839E-246;
        work[6] = -5.695335426481839E-246;
        work[7] = -5.695335426481839E-246;
        work[8] = -5.695335426481839E-246;
        work[9] = -5.695335426481839E-246;
        work[10] = -5.695335426481839E-246;
        work[11] = -5.695335426481839E-246;
        work[12] = -5.695335426481839E-246;
        work[13] = -5.695335426481839E-246;
        work[14] = -5.695335426481839E-246;
        work[15] = -5.695335426481839E-246;
        work[16] = -5.695335426481839E-246;
        work[17] = -5.695335426481839E-246;
        work[18] = -5.695335426481839E-246;
        work[19] = -5.695335426481839E-246;
        work[20] = -5.695335426481839E-246;
        work[21] = -5.695335426481839E-246;
        work[22] = -5.695335426481839E-246;
        work[23] = -5.695335426481839E-246;
        work[24] = -5.695335426481839E-246;
        work[25] = -5.695335426481839E-246;
        work[26] = -5.695335426481839E-246;
        work[27] = -5.695335426481839E-246;
        work[28] = -1.1163304401826188E-280;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 29]
            org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits(EigenDecompositionImpl.java:971) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method initialSplitsMethod = eigenDecompositionImplClazz.getDeclaredMethod("initialSplits", intType);
        initialSplitsMethod.setAccessible(true);
        java.lang.Object[] initialSplitsMethodArguments = new java.lang.Object[1];
        initialSplitsMethodArguments[0] = 8;
        try {
            initialSplitsMethod.invoke(eigenDecompositionImpl, initialSplitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ldlTDecomposition(double, int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#ldlTDecomposition(double,int,int)}
 * @utbot.invokes {@link java.lang.Math#abs(double)}
 *  */
    @Test
    public void testLdlTDecomposition_MathAbs() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.779244522861779E-284};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = -2.0723740679668166E-289;
        ldlTDecompositionMethodArguments[1] = 1;
        ldlTDecompositionMethodArguments[2] = 1;
        ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        
        org.junit.Assert.assertEquals(2.779265246602459E-284, finalEigenDecompositionImplWork0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ldlTDecomposition(double, int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#ldlTDecomposition(double,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double di = main[index] - lambda;
 *  */
    @Test
    public void testLdlTDecomposition_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(EigenDecompositionImpl.java:1254) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = java.lang.Double.NaN;
        ldlTDecompositionMethodArguments[1] = 129;
        ldlTDecompositionMethodArguments[2] = -255;
        try {
            ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#ldlTDecomposition(double,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[0] = Math.abs(di);
 *  */
    @Test
    public void testLdlTDecomposition_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 6291456.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(EigenDecompositionImpl.java:1255) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = -1.258291600000003E7;
        ldlTDecompositionMethodArguments[1] = 1;
        ldlTDecompositionMethodArguments[2] = 2;
        try {
            ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#ldlTDecomposition(double,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double eiM1 = secondary[index + i - 1];
 *  */
    @Test
    public void testLdlTDecomposition_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 4.95223359220159E173};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(EigenDecompositionImpl.java:1258) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = 2.9175873744743794E171;
        ldlTDecompositionMethodArguments[1] = 1;
        ldlTDecompositionMethodArguments[2] = 2;
        try {
            ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#ldlTDecomposition(double,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[fourI - 2] = ratio * ratio * Math.abs(di);
 *  */
    @Test
    public void testLdlTDecomposition_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.677006658425967E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(EigenDecompositionImpl.java:1260) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = 4.172231820450837E-309;
        ldlTDecompositionMethodArguments[1] = 0;
        ldlTDecompositionMethodArguments[2] = 2;
        try {
            ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#ldlTDecomposition(double,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: di = (main[index + i] - lambda) - eiM1 * ratio;
 *  */
    @Test
    public void testLdlTDecomposition_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-7.398719102413548E230};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[19];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(EigenDecompositionImpl.java:1261) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = -1.2250338140853484E231;
        ldlTDecompositionMethodArguments[1] = 0;
        ldlTDecompositionMethodArguments[2] = 2;
        try {
            ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#ldlTDecomposition(double,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double di = main[index] - lambda;
 *  */
    @Test
    public void testLdlTDecomposition_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(EigenDecompositionImpl.java:1254) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = java.lang.Double.NaN;
        ldlTDecompositionMethodArguments[1] = -255;
        ldlTDecompositionMethodArguments[2] = -255;
        try {
            ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#ldlTDecomposition(double,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[0] = Math.abs(di);
 *  */
    @Test
    public void testLdlTDecomposition_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 1.6870067601458415E-289};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(EigenDecompositionImpl.java:1255) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = -9.028120355799887E-290;
        ldlTDecompositionMethodArguments[1] = 1;
        ldlTDecompositionMethodArguments[2] = -255;
        try {
            ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#ldlTDecomposition(double,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double eiM1 = secondary[index + i - 1];
 *  */
    @Test
    public void testLdlTDecomposition_ThrowNullPointerException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 1.0307921508800003E11};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(EigenDecompositionImpl.java:1258) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = 16.000012397766113;
        ldlTDecompositionMethodArguments[1] = 1;
        ldlTDecompositionMethodArguments[2] = 2;
        try {
            ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ldlTDecomposition(double, int, int)
    
    @Test
    public void testLdlTDecomposition1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {
            -3.0000009433233776, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = new double[20];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method ldlTDecompositionMethod = eigenDecompositionImplClazz.getDeclaredMethod("ldlTDecomposition", doubleType, intType, intType);
        ldlTDecompositionMethod.setAccessible(true);
        java.lang.Object[] ldlTDecompositionMethodArguments = new java.lang.Object[3];
        ldlTDecompositionMethodArguments[0] = -0.6715087890625;
        ldlTDecompositionMethodArguments[1] = 0;
        ldlTDecompositionMethodArguments[2] = 2;
        ldlTDecompositionMethod.invoke(eigenDecompositionImpl, ldlTDecompositionMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork1, 4));
        
        org.junit.Assert.assertEquals(2.3284921542608776, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.6715087890625, finalEigenDecompositionImplWork4, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.updateSigma
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateSigma(double)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#updateSigma(double)}
 * @utbot.executesCondition {@code (shift < sigma): True}
 *  */
    @Test
    public void testUpdateSigma_ShiftLessThanSigma() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma", 2.382068656103872E-308);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigmaLow", 0.0);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Method updateSigmaMethod = eigenDecompositionImplClazz.getDeclaredMethod("updateSigma", doubleType);
        updateSigmaMethod.setAccessible(true);
        java.lang.Object[] updateSigmaMethodArguments = new java.lang.Object[1];
        updateSigmaMethodArguments[0] = -2.0175795555114746;
        updateSigmaMethod.invoke(eigenDecompositionImpl, updateSigmaMethodArguments);
        
        double finalEigenDecompositionImplSigma = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma"));
        
        org.junit.Assert.assertEquals(-2.0175795555114746, finalEigenDecompositionImplSigma, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#updateSigma(double)}
 * @utbot.executesCondition {@code (shift < sigma): False}
 *  */
    @Test
    public void testUpdateSigma_ShiftGreaterOrEqualSigma() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma", 2.0803563E-317);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigmaLow", 0.0);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Method updateSigmaMethod = eigenDecompositionImplClazz.getDeclaredMethod("updateSigma", doubleType);
        updateSigmaMethod.setAccessible(true);
        java.lang.Object[] updateSigmaMethodArguments = new java.lang.Object[1];
        updateSigmaMethodArguments[0] = 2.0803563E-317;
        updateSigmaMethod.invoke(eigenDecompositionImpl, updateSigmaMethodArguments);
        
        double finalEigenDecompositionImplSigma = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "sigma"));
        
        org.junit.Assert.assertEquals(4.1607126E-317, finalEigenDecompositionImplSigma, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.dqds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dqds(int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqds(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eMin = work[4 * start + pingPong + 4];
 *  */
    @Test
    public void testDqds_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1023 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1274) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = -193;
        dqdsMethodArguments[1] = -255;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqds(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double d = work[4 * start + pingPong] - tau;
 *  */
    @Test
    public void testDqds_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 41);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -3 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1275) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = -11;
        dqdsMethodArguments[1] = -255;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqds(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): False}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 <= 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j4 - 3] = d + work[j4];
 *  */
    @Test
    public void testDqds_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        double[] work = new double[27];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 10);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 27]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1290) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = -1;
        dqdsMethodArguments[1] = 130;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqds(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): False}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 <= 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j4 - 2] = dN2 + work[j4p2];
 *  */
    @Test
    public void testDqds_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        double[] work = new double[27];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -2147483644);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16378 out of bounds for length 27]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1304) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = 536870911;
        dqdsMethodArguments[1] = 536875008;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqds(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): False}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 <= 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j4 - 2] = dN2 + work[j4p2];
 *  */
    @Test
    public void testDqds_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        double[] work = new double[31];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 224);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -427 out of bounds for length 31]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1304) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = -51;
        dqdsMethodArguments[1] = -48;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqds(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): False}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 <= 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j4] = work[j4p2 + 2] * (work[j4p2] / work[j4 - 2]);
 *  */
    @Test
    public void testDqds_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        double[] work = new double[31];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -2147483641);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 31]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1305) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = 536870911;
        dqdsMethodArguments[1] = 536870920;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqds(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): True}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 <= 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j4 - 2] = dN2 + work[j4p2];
 *  */
    @Test
    public void testDqds_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        double[] work = new double[14];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1030 out of bounds for length 14]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1304) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = 2;
        dqdsMethodArguments[1] = -255;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqds(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eMin = work[4 * start + pingPong + 4];
 *  */
    @Test
    public void testDqds_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1274) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = -255;
        dqdsMethodArguments[1] = -255;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method dqds(int, int)
    
    @Test
    public void testDqds1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 3.000000000000001);
        double[] work = new double[29];
        work[0] = 17.02734375;
        work[1] = 17.02734375;
        work[2] = 17.02734375;
        work[3] = 17.02734375;
        work[4] = 17.02734375;
        work[5] = 17.02734375;
        work[6] = 17.02734375;
        work[7] = 17.02734375;
        work[8] = 17.02734375;
        work[9] = 17.02734375;
        work[10] = 17.02734375;
        work[11] = 17.02734375;
        work[12] = 17.02734375;
        work[13] = 17.02734375;
        work[14] = 17.02734375;
        work[15] = 17.02734375;
        work[16] = 17.02734375;
        work[17] = 17.02734375;
        work[18] = 17.02734375;
        work[19] = 17.02734375;
        work[20] = 17.02734375;
        work[21] = 17.02734375;
        work[22] = 17.02734375;
        work[23] = 17.02734375;
        work[24] = 17.02734375;
        work[25] = 17.02734375;
        work[26] = 17.02734375;
        work[27] = 17.02734375;
        work[28] = 17.02734375;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -4);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 29]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1291) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = 5;
        dqdsMethodArguments[1] = 268435464;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDqds2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", -3.9623070686161707E152);
        double[] work = new double[15];
        work[0] = -1.3408425486728244E154;
        work[1] = -1.3408425486728244E154;
        work[2] = -1.3408425486728244E154;
        work[3] = -1.3408425486728244E154;
        work[4] = -1.3408425486728244E154;
        work[5] = -1.3408425486728244E154;
        work[6] = -1.3408425486728244E154;
        work[7] = -1.3408425486728244E154;
        work[8] = -1.3408425486728244E154;
        work[9] = -1.3408425486728244E154;
        work[10] = -1.3408425486728244E154;
        work[11] = -1.3408425486728244E154;
        work[12] = -1.3408425486728244E154;
        work[13] = -1.3408425486728244E154;
        work[14] = -1.3408425486728244E154;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqds(EigenDecompositionImpl.java:1282) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdsMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqds", intType, intType);
        dqdsMethod.setAccessible(true);
        java.lang.Object[] dqdsMethodArguments = new java.lang.Object[2];
        dqdsMethodArguments[0] = 0;
        dqdsMethodArguments[1] = 268435459;
        try {
            dqdsMethod.invoke(eigenDecompositionImpl, dqdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEigenvector(double, [D, [D)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1806)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) doubleArray1);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1802)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) doubleArray1);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1807)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) doubleArray1);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) doubleArray1);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: progressiveQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1834)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) doubleArray1);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: progressiveQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1833)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) doubleArray1);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double minG = Math.abs(work[6 * r] + work[6 * r + 3] + eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = new double[15];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index -6 out of bounds for length 15]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1746) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) doubleArray1);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: progressiveQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: progressiveQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double minG = Math.abs(work[6 * r] + work[6 * r + 3] + eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1746) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double minG = Math.abs(work[6 * r] + work[6 * r + 3] + eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 7]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1746) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowArrayIndexOutOfBoundsException_12() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowNullPointerException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1802)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowNullPointerException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) doubleArray1);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowNullPointerException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1797)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) null);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int m = main.length;
 *  */
    @Test
    public void testFindEigenvector_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1739) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) null);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenvector(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
 *  */
    @Test
    public void testFindEigenvector_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) null);
        try {
            findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findEigenvector(double, [D, [D)
    
    @Test
    public void testFindEigenvector1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = new double[15];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = new double[17];
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method findEigenvectorMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenvector", doubleType, doubleArrayType, doubleArrayType);
        findEigenvectorMethod.setAccessible(true);
        java.lang.Object[] findEigenvectorMethodArguments = new java.lang.Object[3];
        findEigenvectorMethodArguments[0] = java.lang.Double.NaN;
        findEigenvectorMethodArguments[1] = ((Object) doubleArray);
        findEigenvectorMethodArguments[2] = ((Object) doubleArray1);
        ArrayRealVector actual = ((ArrayRealVector) findEigenvectorMethod.invoke(eigenDecompositionImpl, findEigenvectorMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data = {1.0};
        expected.data = data;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork2, 2));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork3, 3));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork4, 4));
        double[] eigenDecompositionImplWork5 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork5, 5));
        double[] eigenDecompositionImplWork6 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork6, 6));
        double[] eigenDecompositionImplWork7 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork7 = ((Double) get(eigenDecompositionImplWork7, 7));
        double[] eigenDecompositionImplWork8 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork8, 9));
        double[] eigenDecompositionImplWork9 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork9, 10));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork7, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.dqd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dqd(int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqd(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eMin = work[4 * start + pingPong + 4];
 *  */
    @Test
    public void testDqd_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1023 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1331) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = -193;
        dqdMethodArguments[1] = -255;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqd(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double d = work[4 * start + pingPong];
 *  */
    @Test
    public void testDqd_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 41);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index -3 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1332) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = -11;
        dqdMethodArguments[1] = -255;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqd(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): False}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 < 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j4 - 3] = d + work[j4];
 *  */
    @Test
    public void testDqd_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -126);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 131 out of bounds for length 7]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1357) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 32;
        dqdMethodArguments[1] = 36;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqd(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): False}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 < 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j4 - 2] = dN2 + work[j4p2];
 *  */
    @Test
    public void testDqd_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[29];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -128);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1154 out of bounds for length 29]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1382) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 38;
        dqdMethodArguments[1] = -254;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqd(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): False}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 < 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j4 - 2] = dN2 + work[j4p2];
 *  */
    @Test
    public void testDqd_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[31];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -252);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 529 out of bounds for length 31]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1382) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 69;
        dqdMethodArguments[1] = 72;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqd(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): False}
 * @utbot.executesCondition {@code (work[j4 - 2] == 0.0): False}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 < 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: (MathUtils.SAFE_MIN * work[j4p2 + 2] < work[j4 - 2]) && (MathUtils.SAFE_MIN * work[j4 - 2] < work[j4p2 + 2])
 *  */
    @Test
    public void testDqd_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[27];
        work[0] = -7.464721161927139E-155;
        work[26] = -0.0;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -2147483644);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 27]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1388) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 536870911;
        dqdMethodArguments[1] = 536870920;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqd(int,int)}
 * @utbot.executesCondition {@code (pingPong == 0): True}
 * @utbot.iterates iterate the loop {@code for(int j4 = 4 * start + 3; j4 < 4 * (end - 3); j4 += 4)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j4 - 2] = dN2 + work[j4p2];
 *  */
    @Test
    public void testDqd_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[29];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1026 out of bounds for length 29]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1382) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 6;
        dqdMethodArguments[1] = -254;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#dqd(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eMin = work[4 * start + pingPong + 4];
 *  */
    @Test
    public void testDqd_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1331) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = -255;
        dqdMethodArguments[1] = -255;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method dqd(int, int)
    
    @Test
    public void testDqd1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        work[0] = 1.0;
        work[1] = 1.0;
        work[2] = 1.0;
        work[3] = 1.0;
        work[4] = 1.0;
        work[5] = 1.0;
        work[6] = 1.0;
        work[7] = -7.216449660477108E-15;
        work[8] = 1.0;
        work[9] = 1.0;
        work[10] = 1.0;
        work[11] = 1.0;
        work[12] = 1.0;
        work[13] = 1.0;
        work[14] = 1.0;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 1);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", java.lang.Double.NaN);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 2;
        dqdMethodArguments[1] = 4;
        dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork, 4));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork1, 6));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork8 = ((Double) get(eigenDecompositionImplWork2, 8));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork3, 10));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork12 = ((Double) get(eigenDecompositionImplWork4, 12));
        double finalEigenDecompositionImplEMin = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin"));
        double finalEigenDecompositionImplDMin = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin"));
        double finalEigenDecompositionImplDMin2 = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2"));
        double finalEigenDecompositionImplDN2 = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2"));
        
        org.junit.Assert.assertEquals(0.9999999999999928, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(-7.216449660477161E-15, finalEigenDecompositionImplWork6, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.000000000000007, finalEigenDecompositionImplWork8, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.4999999999999982, finalEigenDecompositionImplWork10, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.5000000000000019, finalEigenDecompositionImplWork12, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.0, finalEigenDecompositionImplEMin, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.5000000000000019, finalEigenDecompositionImplDMin, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.0, finalEigenDecompositionImplDMin2, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.0, finalEigenDecompositionImplDN2, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method dqd(int, int)
    
    @Test
    public void testDqd2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[29];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -8);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 29]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1360) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 5;
        dqdMethodArguments[1] = 257;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDqd3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[29];
        work[0] = -7041.6723414024;
        work[1] = -7041.6723414024;
        work[2] = -7041.6723414024;
        work[3] = -7041.6723414024;
        work[4] = 7038.421394350007;
        work[5] = -7041.6723414024;
        work[6] = -7041.6723414024;
        work[7] = -7041.6723414024;
        work[8] = -7041.6723414024;
        work[9] = -7041.6723414024;
        work[10] = -7041.6723414024;
        work[11] = -7041.6723414024;
        work[12] = -7041.6723414024;
        work[13] = -7041.6723414024;
        work[14] = -7041.6723414024;
        work[15] = -7041.6723414024;
        work[16] = -7041.6723414024;
        work[17] = -7041.6723414024;
        work[18] = -7041.6723414024;
        work[19] = -7041.6723414024;
        work[20] = -7041.6723414024;
        work[21] = -7041.6723414024;
        work[22] = -7041.6723414024;
        work[23] = -7041.6723414024;
        work[24] = -7041.6723414024;
        work[25] = -7041.6723414024;
        work[26] = -7041.6723414024;
        work[27] = -7041.6723414024;
        work[28] = -7041.6723414024;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 4);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 29]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1363) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 0;
        dqdMethodArguments[1] = 536870912;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDqd4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[37];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -15);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 37]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1384) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 8;
        dqdMethodArguments[1] = 8;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDqd5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[37];
        work[0] = java.lang.Double.NaN;
        work[1] = java.lang.Double.NaN;
        work[2] = java.lang.Double.NaN;
        work[3] = java.lang.Double.NaN;
        work[4] = java.lang.Double.NaN;
        work[5] = java.lang.Double.NaN;
        work[6] = java.lang.Double.NaN;
        work[7] = java.lang.Double.NaN;
        work[8] = java.lang.Double.NaN;
        work[9] = java.lang.Double.NaN;
        work[10] = java.lang.Double.NaN;
        work[11] = java.lang.Double.NaN;
        work[12] = java.lang.Double.NaN;
        work[13] = java.lang.Double.NaN;
        work[14] = java.lang.Double.NaN;
        work[15] = java.lang.Double.NaN;
        work[16] = java.lang.Double.NaN;
        work[17] = java.lang.Double.NaN;
        work[18] = java.lang.Double.NaN;
        work[19] = java.lang.Double.NaN;
        work[20] = java.lang.Double.NaN;
        work[21] = java.lang.Double.NaN;
        work[22] = java.lang.Double.NaN;
        work[23] = java.lang.Double.NaN;
        work[24] = java.lang.Double.NaN;
        work[25] = java.lang.Double.NaN;
        work[26] = java.lang.Double.NaN;
        work[27] = java.lang.Double.NaN;
        work[28] = java.lang.Double.NaN;
        work[29] = java.lang.Double.NaN;
        work[30] = java.lang.Double.NaN;
        work[31] = java.lang.Double.NaN;
        work[32] = java.lang.Double.NaN;
        work[33] = java.lang.Double.NaN;
        work[34] = java.lang.Double.NaN;
        work[35] = java.lang.Double.NaN;
        work[36] = java.lang.Double.NaN;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 37]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1337) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 8;
        dqdMethodArguments[1] = 536870914;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDqd6() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[39];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.dqd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            org.apache.commons.math.linear.EigenDecompositionImpl.dqd(EigenDecompositionImpl.java:1339) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method dqdMethod = eigenDecompositionImplClazz.getDeclaredMethod("dqd", intType, intType);
        dqdMethod.setAccessible(true);
        java.lang.Object[] dqdMethodArguments = new java.lang.Object[2];
        dqdMethodArguments[0] = 8;
        dqdMethodArguments[1] = 536870914;
        try {
            dqdMethod.invoke(eigenDecompositionImpl, dqdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEigenVectors()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.executesCondition {@code (realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenvectors[i] = findEigenvector(realEigenvalues[i] + mu, d, l);
 *  */
    @Test
    public void testFindEigenVectors_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.0000000000000004};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        org.apache.commons.math.linear.ArrayRealVector[] eigenvectors = {null};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors", eigenvectors);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[] l = new double[m - 1];
 *  */
    @Test
    public void testFindEigenVectors_ThrowNegativeArraySizeException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1705) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double mu = realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0 ? 0.5 - realEigenvalues[m - 1] : 0;
 *  */
    @Test
    public void testFindEigenVectors_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.executesCondition {@code (realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < m; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double eiM1 = secondary[i - 1];
 *  */
    @Test
    public void testFindEigenVectors_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.2250738585072014E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.executesCondition {@code (realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenvectors[i] = findEigenvector(realEigenvalues[i] + mu, d, l);
 *  */
    @Test
    public void testFindEigenVectors_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.0000000000000004};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.executesCondition {@code (realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenvectors[i] = findEigenvector(realEigenvalues[i] + mu, d, l);
 *  */
    @Test
    public void testFindEigenVectors_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {1.4916681462400417E-154};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1741)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.executesCondition {@code (realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0): True}
 * @utbot.executesCondition {@code (realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < m; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double eiM1 = secondary[i - 1];
 *  */
    @Test
    public void testFindEigenVectors_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int m = main.length;
 *  */
    @Test
    public void testFindEigenVectors_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1700) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double mu = realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0 ? 0.5 - realEigenvalues[m - 1] : 0;
 *  */
    @Test
    public void testFindEigenVectors_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1707) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.executesCondition {@code (realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < m; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double eiM1 = secondary[i - 1];
 *  */
    @Test
    public void testFindEigenVectors_ThrowNullPointerException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.2250738585072014E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#findEigenVectors()}
 * @utbot.executesCondition {@code (realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0): True}
 * @utbot.executesCondition {@code (realEigenvalues[m - 1] <= 0 && realEigenvalues[0] > 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenvectors[i] = findEigenvector(realEigenvalues[i] + mu, d, l);
 *  */
    @Test
    public void testFindEigenVectors_ThrowNullPointerException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findEigenVectors()
    
    @Test
    public void testFindEigenVectors1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = new double[14];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        org.apache.commons.math.linear.ArrayRealVector[] initialEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        org.apache.commons.math.linear.ArrayRealVector[] finalEigenDecompositionImplEigenvectors = ((org.apache.commons.math.linear.ArrayRealVector[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "eigenvectors"));
        
        assertFalse(initialEigenDecompositionImplEigenvectors == finalEigenDecompositionImplEigenvectors);
        
        org.junit.Assert.assertEquals(-0.0, finalEigenDecompositionImplWork0, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findEigenVectors()
    
    @Test
    public void testFindEigenVectors2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFindEigenVectors3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1740)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1720) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFindEigenVectors4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            0.0, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1711) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method findEigenVectorsMethod = eigenDecompositionImplClazz.getDeclaredMethod("findEigenVectors");
        findEigenVectorsMethod.setAccessible(true);
        java.lang.Object[] findEigenVectorsMethodArguments = new java.lang.Object[0];
        try {
            findEigenVectorsMethod.invoke(eigenDecompositionImpl, findEigenVectorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method countEigenValues(double, int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#countEigenValues(double,int,int)}
 * @utbot.executesCondition {@code ((ratio > 0)): False}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testCountEigenValues_RatioLessOrEqualZero() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {5.307215182918774E40};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method countEigenValuesMethod = eigenDecompositionImplClazz.getDeclaredMethod("countEigenValues", doubleType, intType, intType);
        countEigenValuesMethod.setAccessible(true);
        java.lang.Object[] countEigenValuesMethodArguments = new java.lang.Object[3];
        countEigenValuesMethodArguments[0] = 5.307215182918774E40;
        countEigenValuesMethodArguments[1] = 0;
        countEigenValuesMethodArguments[2] = 1;
        int actual = ((Integer) countEigenValuesMethod.invoke(eigenDecompositionImpl, countEigenValuesMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#countEigenValues(double,int,int)}
 * @utbot.executesCondition {@code ((ratio > 0)): True}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testCountEigenValues_RatioGreaterThanZero() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 98307.06543159485};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method countEigenValuesMethod = eigenDecompositionImplClazz.getDeclaredMethod("countEigenValues", doubleType, intType, intType);
        countEigenValuesMethod.setAccessible(true);
        java.lang.Object[] countEigenValuesMethodArguments = new java.lang.Object[3];
        countEigenValuesMethodArguments[0] = -8195.1906719208;
        countEigenValuesMethodArguments[1] = 1;
        countEigenValuesMethodArguments[2] = 1;
        int actual = ((Integer) countEigenValuesMethod.invoke(eigenDecompositionImpl, countEigenValuesMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method countEigenValues(double, int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#countEigenValues(double,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double ratio = main[index] - t;
 *  */
    @Test
    public void testCountEigenValues_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues(EigenDecompositionImpl.java:1231) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method countEigenValuesMethod = eigenDecompositionImplClazz.getDeclaredMethod("countEigenValues", doubleType, intType, intType);
        countEigenValuesMethod.setAccessible(true);
        java.lang.Object[] countEigenValuesMethodArguments = new java.lang.Object[3];
        countEigenValuesMethodArguments[0] = java.lang.Double.NaN;
        countEigenValuesMethodArguments[1] = 129;
        countEigenValuesMethodArguments[2] = -255;
        try {
            countEigenValuesMethod.invoke(eigenDecompositionImpl, countEigenValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#countEigenValues(double,int,int)}
 * @utbot.executesCondition {@code ((ratio > 0)): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ratio = main[index + i] - squaredSecondary[index + i - 1] / ratio - t;
 *  */
    @Test
    public void testCountEigenValues_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-4.9E-324};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues(EigenDecompositionImpl.java:1234) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method countEigenValuesMethod = eigenDecompositionImplClazz.getDeclaredMethod("countEigenValues", doubleType, intType, intType);
        countEigenValuesMethod.setAccessible(true);
        java.lang.Object[] countEigenValuesMethodArguments = new java.lang.Object[3];
        countEigenValuesMethodArguments[0] = -5.30498948E-315;
        countEigenValuesMethodArguments[1] = 0;
        countEigenValuesMethodArguments[2] = 2;
        try {
            countEigenValuesMethod.invoke(eigenDecompositionImpl, countEigenValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#countEigenValues(double,int,int)}
 * @utbot.executesCondition {@code ((ratio > 0)): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ratio = main[index + i] - squaredSecondary[index + i - 1] / ratio - t;
 *  */
    @Test
    public void testCountEigenValues_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-6.8718712746308E-310, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] squaredSecondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "squaredSecondary", squaredSecondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues(EigenDecompositionImpl.java:1234) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method countEigenValuesMethod = eigenDecompositionImplClazz.getDeclaredMethod("countEigenValues", doubleType, intType, intType);
        countEigenValuesMethod.setAccessible(true);
        java.lang.Object[] countEigenValuesMethodArguments = new java.lang.Object[3];
        countEigenValuesMethodArguments[0] = -7.0891665416803E-310;
        countEigenValuesMethodArguments[1] = 0;
        countEigenValuesMethodArguments[2] = 2;
        try {
            countEigenValuesMethod.invoke(eigenDecompositionImpl, countEigenValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#countEigenValues(double,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double ratio = main[index] - t;
 *  */
    @Test
    public void testCountEigenValues_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues(EigenDecompositionImpl.java:1231) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method countEigenValuesMethod = eigenDecompositionImplClazz.getDeclaredMethod("countEigenValues", doubleType, intType, intType);
        countEigenValuesMethod.setAccessible(true);
        java.lang.Object[] countEigenValuesMethodArguments = new java.lang.Object[3];
        countEigenValuesMethodArguments[0] = java.lang.Double.NaN;
        countEigenValuesMethodArguments[1] = -255;
        countEigenValuesMethodArguments[2] = -255;
        try {
            countEigenValuesMethod.invoke(eigenDecompositionImpl, countEigenValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#countEigenValues(double,int,int)}
 * @utbot.executesCondition {@code ((ratio > 0)): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < n; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ratio = main[index + i] - squaredSecondary[index + i - 1] / ratio - t;
 *  */
    @Test
    public void testCountEigenValues_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.618981758254456E-308, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues(EigenDecompositionImpl.java:1234) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleType = double.class;
        Class intType = int.class;
        Method countEigenValuesMethod = eigenDecompositionImplClazz.getDeclaredMethod("countEigenValues", doubleType, intType, intType);
        countEigenValuesMethod.setAccessible(true);
        java.lang.Object[] countEigenValuesMethodArguments = new java.lang.Object[3];
        countEigenValuesMethodArguments[0] = 1.92919427404322E-309;
        countEigenValuesMethodArguments[1] = 0;
        countEigenValuesMethodArguments[2] = 2;
        try {
            countEigenValuesMethod.invoke(eigenDecompositionImpl, countEigenValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stationaryQuotientDifferenceWithShift([D, [D, double)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0};
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork0 = ((Double) get(eigenDecompositionImplWork, 0));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork1 = ((Double) get(eigenDecompositionImplWork1, 1));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork0, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork1, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stationaryQuotientDifferenceWithShift([D, [D, double)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nM1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double li = l[i];
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1802) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nM1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[sixI] = si;
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nM1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[sixI + 1] = diP1;
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1806) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nM1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[sixI + 2] = liP1;
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1807) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nM1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[6 * nM1 + 1] = d[nM1] + si;
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 3]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[6 * nM1 + 1] = d[nM1] + si;
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[6 * nM1 + 1] = d[nM1] + si;
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nM1; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double li = l[i];
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1802) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nM1 = d.length - 1;
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1797) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) null);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nM1; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[sixI] = si;
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowNullPointerException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1805) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#stationaryQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[6 * nM1 + 1] = d[nM1] + si;
 *  */
    @Test
    public void testStationaryQuotientDifferenceWithShift_ThrowNullPointerException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1811) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method stationaryQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("stationaryQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        stationaryQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] stationaryQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        stationaryQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        stationaryQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        stationaryQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            stationaryQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, stationaryQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method progressiveQuotientDifferenceWithShift([D, [D, double)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = nM1 - 1; i >= 0; --i)} once
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_IterateForLoop() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork, 3));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork1, 4));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork2, 5));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork9 = ((Double) get(eigenDecompositionImplWork3, 9));
        double[] eigenDecompositionImplWork4 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork10 = ((Double) get(eigenDecompositionImplWork4, 10));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork9, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork10, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[13];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0};
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork, 3));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork1, 4));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalEigenDecompositionImplWork4, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method progressiveQuotientDifferenceWithShift([D, [D, double)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = nM1 - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double li = l[i];
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1830) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double pi = d[nM1] - lambda;
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1826) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = nM1 - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[sixI + 9] = pi;
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1833) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = nM1 - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[sixI + 10] = diP1;
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1834) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[3] = pi;
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[4] = pi;
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = nM1 - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double li = l[i];
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowNullPointerException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1830) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nM1 = d.length - 1;
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1825) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) null);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = nM1 - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[sixI + 9] = pi;
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowNullPointerException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1833) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) doubleArray1);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#progressiveQuotientDifferenceWithShift(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[3] = pi;
 *  */
    @Test
    public void testProgressiveQuotientDifferenceWithShift_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method progressiveQuotientDifferenceWithShiftMethod = eigenDecompositionImplClazz.getDeclaredMethod("progressiveQuotientDifferenceWithShift", doubleArrayType, doubleArrayType, doubleType);
        progressiveQuotientDifferenceWithShiftMethod.setAccessible(true);
        java.lang.Object[] progressiveQuotientDifferenceWithShiftMethodArguments = new java.lang.Object[3];
        progressiveQuotientDifferenceWithShiftMethodArguments[0] = ((Object) doubleArray);
        progressiveQuotientDifferenceWithShiftMethodArguments[1] = ((Object) null);
        progressiveQuotientDifferenceWithShiftMethodArguments[2] = java.lang.Double.NaN;
        try {
            progressiveQuotientDifferenceWithShiftMethod.invoke(eigenDecompositionImpl, progressiveQuotientDifferenceWithShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeGershgorinCircles()
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeGershgorinCircles()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double dCurrent = main[m - 1];
 *  */
    @Test
    public void testComputeGershgorinCircles_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:597) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeGershgorinCircles()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[lowerStart + m - 1] = lower;
 *  */
    @Test
    public void testComputeGershgorinCircles_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:599) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeGershgorinCircles()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eCurrent = Math.abs(secondary[i]);
 *  */
    @Test
    public void testComputeGershgorinCircles_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:583) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeGershgorinCircles()}
 * @utbot.invokes {@link java.lang.Math#min(double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[upperStart + m - 1] = upper;
 *  */
    @Test
    public void testComputeGershgorinCircles_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {java.lang.Double.POSITIVE_INFINITY};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        double[] work = {0.0, 0.0, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:602) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeGershgorinCircles()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[lowerStart + i] = lower;
 *  */
    @Test
    public void testComputeGershgorinCircles_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {-2.2250738585072024E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:588) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeGershgorinCircles()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int m = main.length;
 *  */
    @Test
    public void testComputeGershgorinCircles_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:571) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeGershgorinCircles()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[lowerStart + m - 1] = lower;
 *  */
    @Test
    public void testComputeGershgorinCircles_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:599) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeGershgorinCircles()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eCurrent = Math.abs(secondary[i]);
 *  */
    @Test
    public void testComputeGershgorinCircles_ThrowNullPointerException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:583) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method computeGershgorinCircles()
    
    @Test
    public void testComputeGershgorinCircles1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {java.lang.Double.POSITIVE_INFINITY};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        double[] work = new double[14];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        
        double finalEigenDecompositionImplLowerSpectra = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra"));
        double finalEigenDecompositionImplUpperSpectra = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra"));
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork4 = ((Double) get(eigenDecompositionImplWork, 4));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork1, 5));
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalEigenDecompositionImplLowerSpectra, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalEigenDecompositionImplUpperSpectra, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalEigenDecompositionImplWork4, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalEigenDecompositionImplWork5, 1.0E-6);
    }
    
    @Test
    public void testComputeGershgorinCircles2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {java.lang.Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            -8.969543583674E-311, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        double[] work = new double[28];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        
        double finalEigenDecompositionImplLowerSpectra = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra"));
        double finalEigenDecompositionImplUpperSpectra = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra"));
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork16 = ((Double) get(eigenDecompositionImplWork, 16));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork17 = ((Double) get(eigenDecompositionImplWork1, 17));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork20 = ((Double) get(eigenDecompositionImplWork2, 20));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork21 = ((Double) get(eigenDecompositionImplWork3, 21));
        
        org.junit.Assert.assertEquals(-8.969543583674E-311, finalEigenDecompositionImplLowerSpectra, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalEigenDecompositionImplUpperSpectra, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalEigenDecompositionImplWork16, 1.0E-6);
        
        org.junit.Assert.assertEquals(-8.969543583674E-311, finalEigenDecompositionImplWork17, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalEigenDecompositionImplWork20, 1.0E-6);
        
        org.junit.Assert.assertEquals(8.969543583674E-311, finalEigenDecompositionImplWork21, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeGershgorinCircles()
    
    @Test
    public void testComputeGershgorinCircles3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            -2.2250738585072014E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 9]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:592) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeGershgorinCircles4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {16512.000083923347, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            64.0000143053395, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:602) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeGershgorinCircles5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[32];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "lowerSpectra", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "upperSpectra", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles(EigenDecompositionImpl.java:588) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Method computeGershgorinCirclesMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeGershgorinCircles");
        computeGershgorinCirclesMethod.setAccessible(true);
        java.lang.Object[] computeGershgorinCirclesMethodArguments = new java.lang.Object[0];
        try {
            computeGershgorinCirclesMethod.invoke(eigenDecompositionImpl, computeGershgorinCirclesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.TriDiagonalTransformer#getMainDiagonalRef()}
 * @utbot.invokes {@link org.apache.commons.math.linear.TriDiagonalTransformer#getSecondaryDiagonalRef()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < squaredSecondary.length; ++i)} twice
 *  */
    @Test
    public void testTransformToTridiagonal_TriDiagonalTransformerGetSecondaryDiagonalRef() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[2][];
        double[] doubleArray = {4.9E-324, 8.988465674311582E307};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        array2DRowRealMatrix.data = data;
        
        double[] initialEigenDecompositionImplMain = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main"));
        double[] initialEigenDecompositionImplSecondary = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary"));
        double[] initialEigenDecompositionImplSquaredSecondary = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "squaredSecondary"));
        TriDiagonalTransformer initialEigenDecompositionImplTransformer = ((TriDiagonalTransformer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "transformer"));
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", array2DRowRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = array2DRowRealMatrix;
        transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        
        double[] finalEigenDecompositionImplMain = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main"));
        double[] finalEigenDecompositionImplSecondary = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary"));
        double[] finalEigenDecompositionImplSquaredSecondary = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "squaredSecondary"));
        TriDiagonalTransformer finalEigenDecompositionImplTransformer = ((TriDiagonalTransformer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "transformer"));
        
        assertFalse(initialEigenDecompositionImplMain == finalEigenDecompositionImplMain);
        
        assertFalse(initialEigenDecompositionImplSecondary == finalEigenDecompositionImplSecondary);
        
        assertFalse(initialEigenDecompositionImplSquaredSecondary == finalEigenDecompositionImplSquaredSecondary);
        
        assertFalse(initialEigenDecompositionImplTransformer == finalEigenDecompositionImplTransformer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.NonSquareMatrixException} in: transformer = new TriDiagonalTransformer(matrix);
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testTransformToTridiagonal_ThrowNonSquareMatrixException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -1);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", openMapRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = openMapRealMatrix;
        try {
            transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.NonSquareMatrixException} in: transformer = new TriDiagonalTransformer(matrix);
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testTransformToTridiagonal_ThrowNonSquareMatrixException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        array2DRowRealMatrix.data = data;
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", array2DRowRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = array2DRowRealMatrix;
        try {
            transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.NonSquareMatrixException} in: transformer = new TriDiagonalTransformer(matrix);
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testTransformToTridiagonal_ThrowNonSquareMatrixException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {null};
        array2DRowRealMatrix.data = data;
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", array2DRowRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = array2DRowRealMatrix;
        try {
            transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: transformer = new TriDiagonalTransformer(matrix);
 *  */
    @Test
    public void testTransformToTridiagonal_ThrowNegativeArraySizeException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.TriDiagonalTransformer.<init>(TriDiagonalTransformer.java:74)
            org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(EigenDecompositionImpl.java:553) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", array2DRowRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = array2DRowRealMatrix;
        try {
            transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: transformer = new TriDiagonalTransformer(matrix);
 *  */
    @Test
    public void testTransformToTridiagonal_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {};
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:410)
            org.apache.commons.math.linear.AbstractRealMatrix.isSquare(AbstractRealMatrix.java:639)
            org.apache.commons.math.linear.TriDiagonalTransformer.<init>(TriDiagonalTransformer.java:67)
            org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(EigenDecompositionImpl.java:553) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", array2DRowRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = array2DRowRealMatrix;
        try {
            transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: transformer = new TriDiagonalTransformer(matrix);
 *  */
    @Test
    public void testTransformToTridiagonal_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:606)
            org.apache.commons.math.linear.Array2DRowRealMatrix.getData(Array2DRowRealMatrix.java:296)
            org.apache.commons.math.linear.TriDiagonalTransformer.<init>(TriDiagonalTransformer.java:72)
            org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(EigenDecompositionImpl.java:553) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", array2DRowRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = array2DRowRealMatrix;
        try {
            transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testTransformToTridiagonal1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        array2DRowRealMatrix.data = data;
        
        double[] initialEigenDecompositionImplMain = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main"));
        double[] initialEigenDecompositionImplSecondary = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary"));
        double[] initialEigenDecompositionImplSquaredSecondary = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "squaredSecondary"));
        TriDiagonalTransformer initialEigenDecompositionImplTransformer = ((TriDiagonalTransformer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "transformer"));
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", array2DRowRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = array2DRowRealMatrix;
        transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        
        double[] finalEigenDecompositionImplMain = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "main"));
        double[] finalEigenDecompositionImplSecondary = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary"));
        double[] finalEigenDecompositionImplSquaredSecondary = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "squaredSecondary"));
        TriDiagonalTransformer finalEigenDecompositionImplTransformer = ((TriDiagonalTransformer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "transformer"));
        
        assertFalse(initialEigenDecompositionImplMain == finalEigenDecompositionImplMain);
        
        assertFalse(initialEigenDecompositionImplSecondary == finalEigenDecompositionImplSecondary);
        
        assertFalse(initialEigenDecompositionImplSquaredSecondary == finalEigenDecompositionImplSquaredSecondary);
        
        assertFalse(initialEigenDecompositionImplTransformer == finalEigenDecompositionImplTransformer);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testTransformToTridiagonal2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.TriDiagonalTransformer.<init>(TriDiagonalTransformer.java:74)
            org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(EigenDecompositionImpl.java:553) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", blockRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = blockRealMatrix;
        try {
            transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformToTridiagonal3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.TriDiagonalTransformer.<init>(TriDiagonalTransformer.java:74)
            org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(EigenDecompositionImpl.java:553) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", openMapRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = openMapRealMatrix;
        try {
            transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformToTridiagonal4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[5][];
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = doubleArray1;
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[5]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:606)
            org.apache.commons.math.linear.Array2DRowRealMatrix.getData(Array2DRowRealMatrix.java:296)
            org.apache.commons.math.linear.TriDiagonalTransformer.<init>(TriDiagonalTransformer.java:72)
            org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(EigenDecompositionImpl.java:553) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method transformToTridiagonalMethod = eigenDecompositionImplClazz.getDeclaredMethod("transformToTridiagonal", array2DRowRealMatrixType);
        transformToTridiagonalMethod.setAccessible(true);
        java.lang.Object[] transformToTridiagonalMethodArguments = new java.lang.Object[1];
        transformToTridiagonalMethodArguments[0] = array2DRowRealMatrix;
        try {
            transformToTridiagonalMethod.invoke(eigenDecompositionImpl, transformToTridiagonalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processGeneralBlock(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#processGeneralBlock(int)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testProcessGeneralBlock_Return() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 1;
        processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#processGeneralBlock(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n - 1; ++i)} once
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testProcessGeneralBlock_IterateForLoop() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[11];
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 2;
        processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processGeneralBlock(int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#processGeneralBlock(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double ei = work[fourI + 2];
 *  */
    @Test
    public void testProcessGeneralBlock_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock(EigenDecompositionImpl.java:830) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 2;
        try {
            processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#processGeneralBlock(int)}
 * @utbot.executesCondition {@code (sumOffDiag == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: flipIfWarranted(n, 2);
 *  */
    @Test
    public void testProcessGeneralBlock_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[11];
        work[2] = -2.225073858507202E-308;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 66);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 66 out of bounds for length 11]
            org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(EigenDecompositionImpl.java:1133)
            org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock(EigenDecompositionImpl.java:840) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 2;
        try {
            processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#processGeneralBlock(int)}
 * @utbot.executesCondition {@code (sumOffDiag == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: flipIfWarranted(n, 2);
 *  */
    @Test
    public void testProcessGeneralBlock_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        work[2] = -3.337610787760802E-308;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 14);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15]
            org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(EigenDecompositionImpl.java:1133)
            org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock(EigenDecompositionImpl.java:840) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 2;
        try {
            processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#processGeneralBlock(int)}
 * @utbot.executesCondition {@code (sumOffDiag == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: flipIfWarranted(n, 2);
 *  */
    @Test
    public void testProcessGeneralBlock_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, -1.56424425934208E154, 2.652494739E-315, 0.0, 0.0, 1.668805410499096E-308};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6]
            org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(EigenDecompositionImpl.java:1139)
            org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock(EigenDecompositionImpl.java:840) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 2;
        try {
            processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#processGeneralBlock(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double ei = work[fourI + 2];
 *  */
    @Test
    public void testProcessGeneralBlock_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock(EigenDecompositionImpl.java:830) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 2;
        try {
            processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method processGeneralBlock(int)
    
    @Test
    public void testProcessGeneralBlock1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[11];
        work[0] = java.lang.Double.NaN;
        work[1] = java.lang.Double.NaN;
        work[2] = java.lang.Double.NaN;
        work[3] = java.lang.Double.NaN;
        work[4] = java.lang.Double.NaN;
        work[5] = java.lang.Double.NaN;
        work[6] = java.lang.Double.NaN;
        work[7] = java.lang.Double.NaN;
        work[8] = java.lang.Double.NaN;
        work[9] = java.lang.Double.NaN;
        work[10] = java.lang.Double.NaN;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 2;
        processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
        
        int finalEigenDecompositionImplPingPong = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong"));
        
        assertEquals(1, finalEigenDecompositionImplPingPong);
    }
    
    @Test
    public void testProcessGeneralBlock2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        work[2] = -2.2294197058870983E-308;
        work[4] = 1.090353552229E-311;
        work[6] = 1.5004300147706018;
        work[10] = java.lang.Double.NaN;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 6);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 2;
        processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork, 2));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork1, 3));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork2, 5));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork3, 6));
        int finalEigenDecompositionImplPingPong = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong"));
        
        org.junit.Assert.assertEquals(0.0, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.0, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.090353552229E-311, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalEigenDecompositionImplWork6, 1.0E-6);
        
        assertEquals(1, finalEigenDecompositionImplPingPong);
    }
    
    @Test
    public void testProcessGeneralBlock3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {
            6.47582E-319, 6.47582E-319, 6.47582E-319, 6.47582E-319, 1.3437506558839285, 6.47582E-319,
            6.47582E-319, 6.47582E-319, 4.046875060070321
        };
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 4);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = 2;
        processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
        
        double[] eigenDecompositionImplWork = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork2 = ((Double) get(eigenDecompositionImplWork, 2));
        double[] eigenDecompositionImplWork1 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork3 = ((Double) get(eigenDecompositionImplWork1, 3));
        double[] eigenDecompositionImplWork2 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork5 = ((Double) get(eigenDecompositionImplWork2, 5));
        double[] eigenDecompositionImplWork3 = ((double[]) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work"));
        double finalEigenDecompositionImplWork6 = ((Double) get(eigenDecompositionImplWork3, 6));
        int finalEigenDecompositionImplPingPong = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong"));
        
        org.junit.Assert.assertEquals(0.0, finalEigenDecompositionImplWork2, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.0, finalEigenDecompositionImplWork3, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.3437506558839285, finalEigenDecompositionImplWork5, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalEigenDecompositionImplWork6, 1.0E-6);
        
        assertEquals(1, finalEigenDecompositionImplPingPong);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processGeneralBlock(int)
    
    @Test
    public void testProcessGeneralBlock4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[11];
        work[0] = java.lang.Double.NaN;
        work[1] = java.lang.Double.NaN;
        work[2] = java.lang.Double.NaN;
        work[3] = java.lang.Double.NaN;
        work[4] = java.lang.Double.NaN;
        work[5] = java.lang.Double.NaN;
        work[6] = java.lang.Double.NaN;
        work[7] = java.lang.Double.NaN;
        work[8] = java.lang.Double.NaN;
        work[9] = java.lang.Double.NaN;
        work[10] = java.lang.Double.NaN;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 11]
            org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock(EigenDecompositionImpl.java:830) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method processGeneralBlockMethod = eigenDecompositionImplClazz.getDeclaredMethod("processGeneralBlock", intType);
        processGeneralBlockMethod.setAccessible(true);
        java.lang.Object[] processGeneralBlockMethodArguments = new java.lang.Object[1];
        processGeneralBlockMethodArguments[0] = Integer.MIN_VALUE;
        try {
            processGeneralBlockMethod.invoke(eigenDecompositionImpl, processGeneralBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeShiftIncrement(int, int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin <= 0.0): False}
 * @utbot.activatesSwitch {@code switch(deflated) case: default}
 *  */
    @Test
    public void testComputeShiftIncrement_SwitchDeflatedCasedefault() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 3.337610787760802E-308);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = -253;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        assertEquals(-12, finalEigenDecompositionImplTType);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin <= 0.0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeShiftIncrement_DMinLessOrEqualZero() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", -0.0);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = -255;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        assertEquals(-1, finalEigenDecompositionImplTType);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin <= 0.0): False}
 * @utbot.executesCondition {@code (dMin2 == dN2): False}
 *  */
    @Test
    public void testComputeShiftIncrement_DMin2NotEqualsDN2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 2.2250738585072034E-308);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 2048.0625);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", -5.696362911673633E-306);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = 2;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        double finalEigenDecompositionImplTau = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau"));
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        org.junit.Assert.assertEquals(512.015625, finalEigenDecompositionImplTau, 1.0E-6);
        
        assertEquals(-11, finalEigenDecompositionImplTType);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin <= 0.0): False}
 * @utbot.executesCondition {@code (dMin1 == dN1): False}
 * @utbot.executesCondition {@code (dMin1 == dN1): False}
 *  */
    @Test
    public void testComputeShiftIncrement_DMin1NotEqualsDN1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 4.450147717014405E-308);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 4.080185214548567E-217);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", -1.245173710494558E-221);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = 1;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        double finalEigenDecompositionImplTau = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau"));
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        org.junit.Assert.assertEquals(1.0200463036371417E-217, finalEigenDecompositionImplTau, 1.0E-6);
        
        assertEquals(-9, finalEigenDecompositionImplTType);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin <= 0.0): False}
 * @utbot.executesCondition {@code (dMin1 == dN1): True}
 * @utbot.executesCondition {@code (dMin2 == dN2): False}
 * @utbot.executesCondition {@code (dMin1 == dN1): True}
 *  */
    @Test
    public void testComputeShiftIncrement_DMin1EqualsDN1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 9.236832733122139E162);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 6.47531259604635E-309);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", 9.236832733122139E162);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", java.lang.Double.NaN);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = 1;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        double finalEigenDecompositionImplTau = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau"));
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        org.junit.Assert.assertEquals(4.6184163665610695E162, finalEigenDecompositionImplTau, 1.0E-6);
        
        assertEquals(-9, finalEigenDecompositionImplTType);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin <= 0.0): False}
 * @utbot.executesCondition {@code (dMin == dN): False}
 * @utbot.executesCondition {@code (dMin == dN1): False}
 * @utbot.executesCondition {@code (dMin == dN2): False}
 * @utbot.executesCondition {@code (tType == -6): False}
 * @utbot.executesCondition {@code (tType == -18): True}
 * @utbot.activatesSwitch {@code switch(deflated) case: 0}
 *  */
    @Test
    public void testComputeShiftIncrement_TTypeEqualsNegative18() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType", -18);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 1.114709852943549E-308);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", 2.172923689949E-311);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", 0.0);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = 0;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        double finalEigenDecompositionImplTau = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau"));
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        double finalEigenDecompositionImplG = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g"));
        
        org.junit.Assert.assertEquals(9.27995952575503E-310, finalEigenDecompositionImplTau, 1.0E-6);
        
        assertEquals(-6, finalEigenDecompositionImplTType);
        
        org.junit.Assert.assertEquals(0.08325, finalEigenDecompositionImplG, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin <= 0.0): False}
 * @utbot.executesCondition {@code (dMin2 == dN2): True}
 * @utbot.executesCondition {@code (2 * work[nn - 5] < work[nn - 7]): False}
 *  */
    @Test
    public void testComputeShiftIncrement_2MultiplyNn5OfWorkGreaterOrEqualNn7OfWork() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau", 0.0);
        double[] work = new double[29];
        work[24] = java.lang.Double.POSITIVE_INFINITY;
        work[26] = 1.1411520591688163E308;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -248);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", -2.4816471752160934E-265);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", -2.4816471752160934E-265);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = 70;
        computeShiftIncrementMethodArguments[2] = 2;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        double finalEigenDecompositionImplTau = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tau"));
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        org.junit.Assert.assertEquals(-6.204117938040233E-266, finalEigenDecompositionImplTau, 1.0E-6);
        
        assertEquals(-11, finalEigenDecompositionImplTType);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin <= 0.0): False}
 * @utbot.executesCondition {@code (dMin2 == dN2): True}
 * @utbot.executesCondition {@code (2 * work[nn - 5] < work[nn - 7]): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeShiftIncrement_Nn5OfWorkGreaterThanNn7OfWork() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        work[6] = -2.0000114440917973;
        work[8] = -1.5000038146972658;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -254);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 3.905561101339723E-270);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 3.905561101339723E-270);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = 2;
        computeShiftIncrementMethodArguments[1] = 67;
        computeShiftIncrementMethodArguments[2] = 2;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        assertEquals(-10, finalEigenDecompositionImplTType);
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin <= 0.0): False}
 * @utbot.executesCondition {@code (dMin1 == dN1): True}
 * @utbot.executesCondition {@code (dMin2 == dN2): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeShiftIncrement_Nn5OfWorkGreaterThanNn7OfWork_1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        work[12] = -1.910222968135401E-291;
        work[14] = 2.322382564551808E-272;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 12);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 1.0361308E-317);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 5.658731963725934E-296);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", -2.0156269075815203);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", 5.658731963725934E-296);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", -2.0156269075815203);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -254;
        computeShiftIncrementMethodArguments[1] = 2;
        computeShiftIncrementMethodArguments[2] = 1;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        assertEquals(-7, finalEigenDecompositionImplTType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeShiftIncrement(int, int, int)
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin2 == dN2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: dMin2 == dN2 && 2 * work[nn - 5] < work[nn - 7]
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -254);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 2.225073858507202E-308);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 1.491671939733889E-154);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 1.491671939733889E-154);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.ArrayIndexOutOfBoundsException: Index 512 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1633) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = 193;
        computeShiftIncrementMethodArguments[2] = 2;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin2 == dN2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: dMin2 == dN2 && 2 * work[nn - 5] < work[nn - 7]
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -190);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 4.0E-323);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 3.2347062841283004E-300);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 3.2347062841283004E-300);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1633) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = 49;
        computeShiftIncrementMethodArguments[2] = 2;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin == dN): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double b1 = Math.sqrt(work[nn - 3]) * Math.sqrt(work[nn - 5]);
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -256);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 1.9578145753055792E-154);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN", 1.9578145753055792E-154);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.ArrayIndexOutOfBoundsException: Index 512 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1451) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = 193;
        computeShiftIncrementMethodArguments[2] = 0;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin1 == dN1): True}
 * @utbot.executesCondition {@code (dMin2 == dN2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: work[nn - 5] > work[nn - 7]
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 2.007909073324562);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 1.4391609670076626E126);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", 2.007909073324562);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 1.4391609670076626E126);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1281 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1592) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = 1;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin == dN): False}
 * @utbot.executesCondition {@code (dMin == dN1): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double b1 = Math.sqrt(work[nn - 3]) * Math.sqrt(work[nn - 5]);
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -223);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 1.8556807713106468E-54);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", 1.8556807713106468E-54);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1247 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1451) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = 0;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin1 == dN1): True}
 * @utbot.executesCondition {@code (dMin2 == dN2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: work[nn - 5] > work[nn - 7]
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -158);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 1.3285668327768064E-231);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", -7.64552887868745E-298);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", 1.3285668327768064E-231);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", -7.64552887868745E-298);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1592) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = 41;
        computeShiftIncrementMethodArguments[2] = 1;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin == dN): True}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double b1 = Math.sqrt(work[nn - 3]) * Math.sqrt(work[nn - 5]);
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = {0.0, 0.0};
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -127);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 3.0703859313863916E-289);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN", 3.0703859313863916E-289);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1451) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = 33;
        computeShiftIncrementMethodArguments[2] = 0;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin2 == dN2): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: dMin2 == dN2 && 2 * work[nn - 5] < work[nn - 7]
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowNullPointerException() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 7.291122020405196E-304);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 5.06E-321);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 5.06E-321);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1633) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = 2;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin == dN): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double b1 = Math.sqrt(work[nn - 3]) * Math.sqrt(work[nn - 5]);
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowNullPointerException_1() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 1.6781266652390786E-154);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN", 1.6781266652390786E-154);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1451) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = 0;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EigenDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.EigenDecompositionImpl#computeShiftIncrement(int,int,int)}
 * @utbot.executesCondition {@code (dMin1 == dN1): True}
 * @utbot.executesCondition {@code (dMin2 == dN2): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: work[nn - 5] > work[nn - 7]
 *  */
    @Test
    public void testComputeShiftIncrement_ThrowNullPointerException_2() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", -255);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 2.848094538889223E-306);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", -6.672524796998183E79);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", 3.6743448199533113E-294);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", -6.672524796998183E79);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 3.6743448199533113E-294);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1592) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = -255;
        computeShiftIncrementMethodArguments[1] = -255;
        computeShiftIncrementMethodArguments[2] = 1;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method computeShiftIncrement(int, int, int)
    
    @Test
    public void testComputeShiftIncrement1() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 3.337610787760802E-308);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", java.lang.Double.NaN);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = 0;
        computeShiftIncrementMethodArguments[1] = 0;
        computeShiftIncrementMethodArguments[2] = 0;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        double finalEigenDecompositionImplG = ((Double) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g"));
        
        assertEquals(-6, finalEigenDecompositionImplTType);
        
        org.junit.Assert.assertEquals(0.25, finalEigenDecompositionImplG, 1.0E-6);
    }
    
    @Test
    public void testComputeShiftIncrement2() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType", -6);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 1.727233711018889E-77);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN", 2.5764595078388556E-231);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", -2.983341982742482E-154);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "g", java.lang.Double.NaN);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = 0;
        computeShiftIncrementMethodArguments[1] = 0;
        computeShiftIncrementMethodArguments[2] = 0;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
    }
    
    @Test
    public void testComputeShiftIncrement3() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[15];
        work[0] = 3.9338619072264E-310;
        work[1] = 3.9338619072264E-310;
        work[2] = 3.9338619072264E-310;
        work[3] = 3.9338619072264E-310;
        work[4] = 3.9338619072264E-310;
        work[5] = 3.9338619072264E-310;
        work[6] = 3.9338619072264E-310;
        work[7] = 3.9338619072264E-310;
        work[8] = 3.9338619072264E-310;
        work[9] = 3.9338619072264E-310;
        work[10] = 3.9338619072264E-310;
        work[11] = 3.9338619072264E-310;
        work[12] = 2.503660076126986E-308;
        work[13] = 3.9338619072264E-310;
        work[14] = 3.9338619072264E-310;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "pingPong", 4);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 1.0936683029334596E-303);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", -1.8667560306338925E-301);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", -1.8667560306338925E-301);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = 0;
        computeShiftIncrementMethodArguments[1] = 4;
        computeShiftIncrementMethodArguments[2] = 2;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        assertEquals(-10, finalEigenDecompositionImplTType);
    }
    
    @Test
    public void testComputeShiftIncrement4() throws Exception  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] work = new double[27];
        work[0] = java.lang.Double.NaN;
        work[1] = java.lang.Double.NaN;
        work[2] = java.lang.Double.NaN;
        work[3] = java.lang.Double.NaN;
        work[4] = java.lang.Double.NaN;
        work[5] = java.lang.Double.NaN;
        work[6] = java.lang.Double.NaN;
        work[7] = java.lang.Double.NaN;
        work[8] = java.lang.Double.NaN;
        work[9] = java.lang.Double.NaN;
        work[10] = java.lang.Double.NaN;
        work[11] = java.lang.Double.NaN;
        work[12] = java.lang.Double.NaN;
        work[13] = java.lang.Double.NaN;
        work[14] = java.lang.Double.NaN;
        work[15] = java.lang.Double.NaN;
        work[16] = java.lang.Double.NaN;
        work[17] = java.lang.Double.NaN;
        work[18] = java.lang.Double.NaN;
        work[19] = java.lang.Double.NaN;
        work[20] = java.lang.Double.NaN;
        work[21] = java.lang.Double.NaN;
        work[22] = java.lang.Double.NaN;
        work[23] = java.lang.Double.NaN;
        work[24] = -9.263457965967221E77;
        work[25] = java.lang.Double.NaN;
        work[26] = java.lang.Double.NaN;
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", java.lang.Double.NaN);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin1", 4.77835026765172E-299);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin2", -3.789464055438385E-270);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", 4.77835026765172E-299);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", -3.789464055438385E-270);
        
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = 0;
        computeShiftIncrementMethodArguments[1] = 8;
        computeShiftIncrementMethodArguments[2] = 1;
        computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        
        int finalEigenDecompositionImplTType = ((Integer) getFieldValue(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "tType"));
        
        assertEquals(-8, finalEigenDecompositionImplTType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeShiftIncrement(int, int, int)
    
    @Test
    public void testComputeShiftIncrement5() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 5.494473622066373E-308);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN", -1.390687076535443E-309);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", 5.494473622066373E-308);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1451) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = 0;
        computeShiftIncrementMethodArguments[1] = 0;
        computeShiftIncrementMethodArguments[2] = 0;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeShiftIncrement6() throws Throwable  {
        EigenDecompositionImpl eigenDecompositionImpl = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dMin", 2.691331157453496E-295);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN", -4.510606404375824E-142);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN1", 2.005199013165338E-303);
        setField(eigenDecompositionImpl, "org.apache.commons.math.linear.EigenDecompositionImpl", "dN2", 2.691331157453496E-295);
        
        /* This test fails because method [org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(EigenDecompositionImpl.java:1535) */
        Class eigenDecompositionImplClazz = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class intType = int.class;
        Method computeShiftIncrementMethod = eigenDecompositionImplClazz.getDeclaredMethod("computeShiftIncrement", intType, intType, intType);
        computeShiftIncrementMethod.setAccessible(true);
        java.lang.Object[] computeShiftIncrementMethodArguments = new java.lang.Object[3];
        computeShiftIncrementMethodArguments[0] = 0;
        computeShiftIncrementMethodArguments[1] = 0;
        computeShiftIncrementMethodArguments[2] = 0;
        try {
            computeShiftIncrementMethod.invoke(eigenDecompositionImpl, computeShiftIncrementMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields741258947957600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields741258947957600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass741258947962800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields741258947957600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass741258947962800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields741258948664300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields741258948664300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass741258948665700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields741258948664300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass741258948665700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

