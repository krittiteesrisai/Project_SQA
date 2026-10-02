package org.apache.commons.math.geometry.euclidean.threed;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_geometry_euclidean_threed_RotationTest {
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method orthogonalizeMatrix([[D, double)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[] m0 = m[0];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:916) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[] m1 = m[1];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = {null};
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:917) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x00 = m0[0];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = {};
        doubleArray[0] = doubleArray1;
        doubleArray[1] = ((double[]) null);
        doubleArray[2] = ((double[]) null);
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:919) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[] m2 = m[2];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = {
            null,
            null
        };
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:918) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x02 = m0[2];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = {0.0, 0.0};
        doubleArray[0] = doubleArray1;
        doubleArray[1] = ((double[]) null);
        doubleArray[2] = ((double[]) null);
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:921) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x01 = m0[1];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        doubleArray[1] = ((double[]) null);
        doubleArray[2] = ((double[]) null);
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:920) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x20 = m2[0];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = new double[11];
        doubleArray[0] = doubleArray1;
        doubleArray[1] = doubleArray1;
        double[] doubleArray2 = {};
        doubleArray[2] = doubleArray2;
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:925) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x12 = m1[2];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = new double[11];
        doubleArray[0] = doubleArray1;
        double[] doubleArray2 = {0.0, 0.0};
        doubleArray[1] = doubleArray2;
        doubleArray[2] = ((double[]) null);
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:924) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x21 = m2[1];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = new double[11];
        doubleArray[0] = doubleArray1;
        doubleArray[1] = doubleArray1;
        double[] doubleArray2 = {0.0};
        doubleArray[2] = doubleArray2;
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:926) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x10 = m1[0];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = new double[11];
        doubleArray[0] = doubleArray1;
        double[] doubleArray2 = {};
        doubleArray[1] = doubleArray2;
        doubleArray[2] = ((double[]) null);
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:922) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x11 = m1[1];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = new double[11];
        doubleArray[0] = doubleArray1;
        double[] doubleArray2 = {0.0};
        doubleArray[1] = doubleArray2;
        doubleArray[2] = ((double[]) null);
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:923) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x22 = m2[2];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = new double[11];
        doubleArray[0] = doubleArray1;
        doubleArray[1] = doubleArray1;
        double[] doubleArray2 = {0.0, 0.0};
        doubleArray[2] = doubleArray2;
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:927) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x00 = m0[0];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowNullPointerException_1() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        doubleArray[0] = ((double[]) null);
        doubleArray[1] = ((double[]) null);
        doubleArray[2] = ((double[]) null);
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:919) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x10 = m1[0];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowNullPointerException_2() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = new double[11];
        doubleArray[0] = doubleArray1;
        doubleArray[1] = ((double[]) null);
        doubleArray[2] = ((double[]) null);
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:922) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x20 = m2[0];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowNullPointerException_3() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        double[][] doubleArray = new double[11][];
        double[] doubleArray1 = new double[11];
        doubleArray[0] = doubleArray1;
        doubleArray[1] = doubleArray1;
        doubleArray[2] = ((double[]) null);
        doubleArray[3] = ((double[]) null);
        doubleArray[4] = ((double[]) null);
        doubleArray[5] = ((double[]) null);
        doubleArray[6] = ((double[]) null);
        doubleArray[7] = ((double[]) null);
        doubleArray[8] = ((double[]) null);
        doubleArray[9] = ((double[]) null);
        doubleArray[10] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:925) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) doubleArray);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#orthogonalizeMatrix(double[][],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[] m0 = m[0];
 *  */
    @Test
    public void testOrthogonalizeMatrix_ThrowNullPointerException() throws Throwable  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(Rotation.java:916) */
        Class rotationClazz = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class doubleArrayType = Class.forName("[[D");
        Class doubleType = double.class;
        Method orthogonalizeMatrixMethod = rotationClazz.getDeclaredMethod("orthogonalizeMatrix", doubleArrayType, doubleType);
        orthogonalizeMatrixMethod.setAccessible(true);
        java.lang.Object[] orthogonalizeMatrixMethodArguments = new java.lang.Object[2];
        orthogonalizeMatrixMethodArguments[0] = ((Object) null);
        orthogonalizeMatrixMethodArguments[1] = java.lang.Double.NaN;
        try {
            orthogonalizeMatrixMethod.invoke(rotation, orthogonalizeMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.applyTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyTo(org.apache.commons.math.geometry.euclidean.threed.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#applyTo(org.apache.commons.math.geometry.euclidean.threed.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math.geometry.euclidean.threed.Vector3D#getX()}
 * @utbot.invokes {@link org.apache.commons.math.geometry.euclidean.threed.Vector3D#getY()}
 * @utbot.invokes {@link org.apache.commons.math.geometry.euclidean.threed.Vector3D#getZ()}
 * @utbot.returnsFrom {@code return new Vector3D(2 * (q0 * (x * q0 - (q2 * z - q3 * y)) + s * q1) - x, 2 * (q0 * (y * q0 - (q3 * x - q1 * z)) + s * q2) - y, 2 * (q0 * (z * q0 - (q1 * y - q2 * x)) + s * q3) - z);}
 *  */
    @Test
    public void testApplyTo_Vector3DGetZ() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", java.lang.Double.NaN);
        Vector3D vector3D = new Vector3D(0.0, 0.0, 0.0);
        
        Vector3D actual = rotation.applyTo(vector3D);
        
        Vector3D expected = new Vector3D(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.geometry.euclidean.threed.Vector3D has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyTo(org.apache.commons.math.geometry.euclidean.threed.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#applyTo(org.apache.commons.math.geometry.euclidean.threed.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math.geometry.euclidean.threed.Vector3D#getX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x = u.getX();
 *  */
    @Test
    public void testApplyTo_ThrowNullPointerException() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.applyTo] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.applyTo(Rotation.java:837) */
        rotation.applyTo(((Vector3D) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.applyTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyTo(org.apache.commons.math.geometry.euclidean.threed.Rotation)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#applyTo(org.apache.commons.math.geometry.euclidean.threed.Rotation)}
 * @utbot.returnsFrom {@code return new Rotation(r.q0 * q0 - (r.q1 * q1 + r.q2 * q2 + r.q3 * q3), r.q1 * q0 + r.q0 * q1 + (r.q2 * q3 - r.q3 * q2), r.q2 * q0 + r.q0 * q2 + (r.q3 * q1 - r.q1 * q3), r.q3 * q0 + r.q0 * q3 + (r.q1 * q2 - r.q2 * q1), false);}
 *  */
    @Test
    public void testApplyTo_Return() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", java.lang.Double.NaN);
        
        Rotation actual = rotation.applyTo(rotation);
        
        Rotation expected = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", java.lang.Double.NaN);
        
        double expectedQ0 = expected.getQ0();
        double actualQ0 = actual.getQ0();
        org.junit.Assert.assertEquals(expectedQ0, actualQ0, 1.0E-6);
        
        double expectedQ1 = expected.getQ1();
        double actualQ1 = actual.getQ1();
        org.junit.Assert.assertEquals(expectedQ1, actualQ1, 1.0E-6);
        
        double expectedQ2 = expected.getQ2();
        double actualQ2 = actual.getQ2();
        org.junit.Assert.assertEquals(expectedQ2, actualQ2, 1.0E-6);
        
        double expectedQ3 = expected.getQ3();
        double actualQ3 = actual.getQ3();
        org.junit.Assert.assertEquals(expectedQ3, actualQ3, 1.0E-6);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyTo(org.apache.commons.math.geometry.euclidean.threed.Rotation)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#applyTo(org.apache.commons.math.geometry.euclidean.threed.Rotation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Rotation(r.q0 * q0 - (r.q1 * q1 + r.q2 * q2 + r.q3 * q3), r.q1 * q0 + r.q0 * q1 + (r.q2 * q3 - r.q3 * q2), r.q2 * q0 + r.q0 * q2 + (r.q3 * q1 - r.q1 * q3), r.q3 * q0 + r.q0 * q3 + (r.q1 * q2 - r.q2 * q1), false);
 *  */
    @Test
    public void testApplyTo_ThrowNullPointerException1() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.applyTo] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.applyTo(Rotation.java:878) */
        rotation.applyTo(((Rotation) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.revert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method revert()
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#revert()}
 * @utbot.returnsFrom {@code return new Rotation(-q0, q1, q2, q3, false);}
 *  */
    @Test
    public void testRevert_Return() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", java.lang.Double.NaN);
        
        Rotation actual = rotation.revert();
        
        Rotation expected = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", java.lang.Double.NaN);
        
        double expectedQ0 = expected.getQ0();
        double actualQ0 = actual.getQ0();
        org.junit.Assert.assertEquals(expectedQ0, actualQ0, 1.0E-6);
        
        double expectedQ1 = expected.getQ1();
        double actualQ1 = actual.getQ1();
        org.junit.Assert.assertEquals(expectedQ1, actualQ1, 1.0E-6);
        
        double expectedQ2 = expected.getQ2();
        double actualQ2 = actual.getQ2();
        org.junit.Assert.assertEquals(expectedQ2, actualQ2, 1.0E-6);
        
        double expectedQ3 = expected.getQ3();
        double actualQ3 = actual.getQ3();
        org.junit.Assert.assertEquals(expectedQ3, actualQ3, 1.0E-6);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.getAngles
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getAngles(org.apache.commons.math.geometry.euclidean.threed.RotationOrder)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getAngles(org.apache.commons.math.geometry.euclidean.threed.RotationOrder)}
     */
    @Test
    public void testGetAngles() throws CardanEulerSingularityException  {
        Rotation rotation = new Rotation(0.9999999999, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, 0.0, true);
        
        double[] actual = rotation.getAngles(null);
        
        double[] expected = {java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.getAngle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAngle()
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getAngle()}
 * @utbot.executesCondition {@code (q0 < -0.1): False}
 * @utbot.executesCondition {@code (q0 > 0.1): False}
 * @utbot.executesCondition {@code (q0 < 0): False}
 * @utbot.returnsFrom {@code return 2 * FastMath.acos(q0);}
 *  */
    @Test
    public void testGetAngle_Q0GreaterOrEqualZero() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", java.lang.Double.NaN);
        
        double actual = rotation.getAngle();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getAngle()}
 * @utbot.executesCondition {@code (q0 < -0.1): False}
 * @utbot.executesCondition {@code (q0 > 0.1): False}
 * @utbot.executesCondition {@code (q0 < 0): False}
 * @utbot.returnsFrom {@code return 2 * FastMath.acos(q0);}
 *  */
    @Test
    public void testGetAngle_Q0GreaterOrEqualZero_1() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", -0.0);
        
        double actual = rotation.getAngle();
        
        org.junit.Assert.assertEquals(3.141592653589793, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getAngle()}
 * @utbot.executesCondition {@code (q0 < -0.1): True}
 * @utbot.returnsFrom {@code return 2 * FastMath.asin(FastMath.sqrt(q1 * q1 + q2 * q2 + q3 * q3));}
 *  */
    @Test
    public void testGetAngle_Q0LessThanNegative0d() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", -3.595388412741847E307);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", 0.0);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", 0.0);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", 0.0);
        
        double actual = rotation.getAngle();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getAngle()}
 * @utbot.executesCondition {@code (q0 < -0.1): False}
 * @utbot.executesCondition {@code (q0 > 0.1): True}
 * @utbot.returnsFrom {@code return 2 * FastMath.asin(FastMath.sqrt(q1 * q1 + q2 * q2 + q3 * q3));}
 *  */
    @Test
    public void testGetAngle_Q0GreaterThan0d() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", 0.12500000000000186);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", 0.0);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", 0.0);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", 0.0);
        
        double actual = rotation.getAngle();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.applyInverseTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyInverseTo(org.apache.commons.math.geometry.euclidean.threed.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#applyInverseTo(org.apache.commons.math.geometry.euclidean.threed.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math.geometry.euclidean.threed.Vector3D#getX()}
 * @utbot.invokes {@link org.apache.commons.math.geometry.euclidean.threed.Vector3D#getY()}
 * @utbot.invokes {@link org.apache.commons.math.geometry.euclidean.threed.Vector3D#getZ()}
 * @utbot.returnsFrom {@code return new Vector3D(2 * (m0 * (x * m0 - (q2 * z - q3 * y)) + s * q1) - x, 2 * (m0 * (y * m0 - (q3 * x - q1 * z)) + s * q2) - y, 2 * (m0 * (z * m0 - (q1 * y - q2 * x)) + s * q3) - z);}
 *  */
    @Test
    public void testApplyInverseTo_Vector3DGetZ() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", java.lang.Double.NaN);
        Vector3D vector3D = new Vector3D(0.0, 0.0, 0.0);
        
        Vector3D actual = rotation.applyInverseTo(vector3D);
        
        Vector3D expected = new Vector3D(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.geometry.euclidean.threed.Vector3D has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyInverseTo(org.apache.commons.math.geometry.euclidean.threed.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#applyInverseTo(org.apache.commons.math.geometry.euclidean.threed.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math.geometry.euclidean.threed.Vector3D#getX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x = u.getX();
 *  */
    @Test
    public void testApplyInverseTo_ThrowNullPointerException() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.applyInverseTo] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.applyInverseTo(Rotation.java:855) */
        rotation.applyInverseTo(((Vector3D) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.applyInverseTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyInverseTo(org.apache.commons.math.geometry.euclidean.threed.Rotation)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#applyInverseTo(org.apache.commons.math.geometry.euclidean.threed.Rotation)}
 * @utbot.returnsFrom {@code return new Rotation(-r.q0 * q0 - (r.q1 * q1 + r.q2 * q2 + r.q3 * q3), -r.q1 * q0 + r.q0 * q1 + (r.q2 * q3 - r.q3 * q2), -r.q2 * q0 + r.q0 * q2 + (r.q3 * q1 - r.q1 * q3), -r.q3 * q0 + r.q0 * q3 + (r.q1 * q2 - r.q2 * q1), false);}
 *  */
    @Test
    public void testApplyInverseTo_Return() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", java.lang.Double.NaN);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", java.lang.Double.NaN);
        
        Rotation actual = rotation.applyInverseTo(rotation);
        
        Rotation expected = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", java.lang.Double.NaN);
        
        double expectedQ0 = expected.getQ0();
        double actualQ0 = actual.getQ0();
        org.junit.Assert.assertEquals(expectedQ0, actualQ0, 1.0E-6);
        
        double expectedQ1 = expected.getQ1();
        double actualQ1 = actual.getQ1();
        org.junit.Assert.assertEquals(expectedQ1, actualQ1, 1.0E-6);
        
        double expectedQ2 = expected.getQ2();
        double actualQ2 = actual.getQ2();
        org.junit.Assert.assertEquals(expectedQ2, actualQ2, 1.0E-6);
        
        double expectedQ3 = expected.getQ3();
        double actualQ3 = actual.getQ3();
        org.junit.Assert.assertEquals(expectedQ3, actualQ3, 1.0E-6);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyInverseTo(org.apache.commons.math.geometry.euclidean.threed.Rotation)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#applyInverseTo(org.apache.commons.math.geometry.euclidean.threed.Rotation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Rotation(-r.q0 * q0 - (r.q1 * q1 + r.q2 * q2 + r.q3 * q3), -r.q1 * q0 + r.q0 * q1 + (r.q2 * q3 - r.q3 * q2), -r.q2 * q0 + r.q0 * q2 + (r.q3 * q1 - r.q1 * q3), -r.q3 * q0 + r.q0 * q3 + (r.q1 * q2 - r.q2 * q1), false);
 *  */
    @Test
    public void testApplyInverseTo_ThrowNullPointerException1() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.applyInverseTo] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.applyInverseTo(Rotation.java:897) */
        rotation.applyInverseTo(((Rotation) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.getQ2
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQ2()
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getQ2()}
 * @utbot.returnsFrom {@code return q2;}
 *  */
    @Test
    public void testGetQ2_ReturnQ2() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", 0.0);
        
        double actual = rotation.getQ2();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.getQ1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQ1()
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getQ1()}
 * @utbot.returnsFrom {@code return q1;}
 *  */
    @Test
    public void testGetQ1_ReturnQ1() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", 0.0);
        
        double actual = rotation.getQ1();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.getQ0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQ0()
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getQ0()}
 * @utbot.returnsFrom {@code return q0;}
 *  */
    @Test
    public void testGetQ0_ReturnQ0() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", 0.0);
        
        double actual = rotation.getQ0();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.getQ3
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQ3()
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getQ3()}
 * @utbot.returnsFrom {@code return q3;}
 *  */
    @Test
    public void testGetQ3_ReturnQ3() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", 0.0);
        
        double actual = rotation.getQ3();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.getMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMatrix()
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#getMatrix()}
 * @utbot.returnsFrom {@code return m;}
 *  */
    @Test
    public void testGetMatrix_ReturnM() throws Exception  {
        Rotation rotation = ((Rotation) createInstance("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q0", 0.0);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q1", 0.0);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q2", 0.0);
        setField(rotation, "org.apache.commons.math.geometry.euclidean.threed.Rotation", "q3", 0.0);
        
        double[][] actual = rotation.getMatrix();
        
        double[][] expected = new double[3][];
        double[] doubleArray = {-1.0, 0.0, 0.0};
        expected[0] = doubleArray;
        double[] doubleArray1 = {0.0, -1.0, 0.0};
        expected[1] = doubleArray1;
        double[] doubleArray2 = {0.0, 0.0, -1.0};
        expected[2] = doubleArray2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.euclidean.threed.Rotation.distance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distance(org.apache.commons.math.geometry.euclidean.threed.Rotation, org.apache.commons.math.geometry.euclidean.threed.Rotation)
    
    /**
    @utbot.classUnderTest {@link Rotation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#distance(org.apache.commons.math.geometry.euclidean.threed.Rotation,org.apache.commons.math.geometry.euclidean.threed.Rotation)}
 * @utbot.invokes {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#applyInverseTo(org.apache.commons.math.geometry.euclidean.threed.Rotation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return r1.applyInverseTo(r2).getAngle();
 *  */
    @Test
    public void testDistance_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(Rotation.java:1028) */
        Rotation.distance(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method distance(org.apache.commons.math.geometry.euclidean.threed.Rotation, org.apache.commons.math.geometry.euclidean.threed.Rotation)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.euclidean.threed.Rotation#distance(org.apache.commons.math.geometry.euclidean.threed.Rotation,org.apache.commons.math.geometry.euclidean.threed.Rotation)}
     */
    @Test
    public void testDistanceThrowsNPE() {
        Rotation rotation = new Rotation(java.lang.Double.POSITIVE_INFINITY, 1.0, -1.0, java.lang.Double.NaN, true);
        
        /* This test fails because method [org.apache.commons.math.geometry.euclidean.threed.Rotation.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.euclidean.threed.Rotation.applyInverseTo(Rotation.java:897)
            org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(Rotation.java:1028) */
        Rotation.distance(rotation, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields732026738110100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields732026738110100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass732026738116400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields732026738110100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass732026738116400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

