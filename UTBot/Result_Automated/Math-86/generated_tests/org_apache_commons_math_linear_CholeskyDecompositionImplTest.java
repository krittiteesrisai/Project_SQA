package org.apache.commons.math.linear;

import org.junit.Test;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_linear_CholeskyDecompositionImplTest {
    ///region Test suites for executable org.apache.commons.math.linear.CholeskyDecompositionImpl.getL
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getL()
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getL()}
 * @utbot.executesCondition {@code (cachedL == null): False}
 * @utbot.returnsFrom {@code return cachedL;}
 *  */
    @Test
    public void testGetL_CachedLNotEqualsNull() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        OpenMapRealMatrix cachedL = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(choleskyDecompositionImpl, "org.apache.commons.math.linear.CholeskyDecompositionImpl", "cachedL", cachedL);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) choleskyDecompositionImpl.getL());
        
        int cachedLRowDimension = cachedL.getRowDimension();
        int actualRowDimension = actual.getRowDimension();
        assertEquals(cachedLRowDimension, actualRowDimension);
        
        int cachedLColumnDimension = cachedL.getColumnDimension();
        int actualColumnDimension = actual.getColumnDimension();
        assertEquals(cachedLColumnDimension, actualColumnDimension);
        
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        assertNull(actualEntries);
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL()
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getL()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#transpose()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cachedL = getLT().transpose();
 *  */
    @Test
    public void testGetL_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        RealMatrixImpl cachedLT = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        cachedLT.data = data;
        setField(choleskyDecompositionImpl, "org.apache.commons.math.linear.CholeskyDecompositionImpl", "cachedLT", cachedLT);
        
        /* This test fails because method [org.apache.commons.math.linear.CholeskyDecompositionImpl.getL] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:410)
            org.apache.commons.math.linear.AbstractRealMatrix.transpose(AbstractRealMatrix.java:604)
            org.apache.commons.math.linear.CholeskyDecompositionImpl.getL(CholeskyDecompositionImpl.java:156) */
        choleskyDecompositionImpl.getL();
    }
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getL()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cachedL = getLT().transpose();
 *  */
    @Test
    public void testGetL_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        double[][] lTData = {};
        setField(choleskyDecompositionImpl, "org.apache.commons.math.linear.CholeskyDecompositionImpl", "lTData", lTData);
        
        /* This test fails because method [org.apache.commons.math.linear.CholeskyDecompositionImpl.getL] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.DenseRealMatrix.<init>(DenseRealMatrix.java:126)
            org.apache.commons.math.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:88)
            org.apache.commons.math.linear.CholeskyDecompositionImpl.getLT(CholeskyDecompositionImpl.java:165)
            org.apache.commons.math.linear.CholeskyDecompositionImpl.getL(CholeskyDecompositionImpl.java:156) */
        choleskyDecompositionImpl.getL();
    }
    ///endregion
    
    ///region Errors report for getL
    
    public void testGetL_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.CholeskyDecompositionImpl.getSolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSolver()
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getSolver()}
 * @utbot.returnsFrom {@code return new Solver(lTData);}
 *  */
    @Test
    public void testGetSolver_Return() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        
        Object actual = choleskyDecompositionImpl.getSolver();
        
        Object expected = createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver");
        
        double[][] actualLTData = ((double[][]) getFieldValue(actual, "org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", "lTData"));
        assertNull(actualLTData);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeterminant()
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getDeterminant()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lTData.length; ++i)} once
 * @utbot.returnsFrom {@code return determinant;}
 *  */
    @Test
    public void testGetDeterminant_IterateForLoop() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        double[][] lTData = {};
        setField(choleskyDecompositionImpl, "org.apache.commons.math.linear.CholeskyDecompositionImpl", "lTData", lTData);
        
        double actual = choleskyDecompositionImpl.getDeterminant();
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getDeterminant()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lTData.length; ++i)} twice
 * @utbot.returnsFrom {@code return determinant;}
 *  */
    @Test
    public void testGetDeterminant_IterateForLoop_1() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        double[][] lTData = new double[1][];
        double[] doubleArray = {0.0};
        lTData[0] = doubleArray;
        setField(choleskyDecompositionImpl, "org.apache.commons.math.linear.CholeskyDecompositionImpl", "lTData", lTData);
        
        double actual = choleskyDecompositionImpl.getDeterminant();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDeterminant()
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getDeterminant()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lTData.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double lTii = lTData[i][i];
 *  */
    @Test
    public void testGetDeterminant_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        double[][] lTData = new double[1][];
        double[] doubleArray = {};
        lTData[0] = doubleArray;
        setField(choleskyDecompositionImpl, "org.apache.commons.math.linear.CholeskyDecompositionImpl", "lTData", lTData);
        
        /* This test fails because method [org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant(CholeskyDecompositionImpl.java:177) */
        choleskyDecompositionImpl.getDeterminant();
    }
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getDeterminant()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lTData.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double lTii = lTData[i][i];
 *  */
    @Test
    public void testGetDeterminant_ThrowNullPointerException_1() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        double[][] lTData = {null};
        setField(choleskyDecompositionImpl, "org.apache.commons.math.linear.CholeskyDecompositionImpl", "lTData", lTData);
        
        /* This test fails because method [org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant(CholeskyDecompositionImpl.java:177) */
        choleskyDecompositionImpl.getDeterminant();
    }
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getDeterminant()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lTData.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < lTData.length; ++i)
 *  */
    @Test
    public void testGetDeterminant_ThrowNullPointerException() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant(CholeskyDecompositionImpl.java:176) */
        choleskyDecompositionImpl.getDeterminant();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.CholeskyDecompositionImpl.getLT
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLT()
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getLT()}
 * @utbot.executesCondition {@code (cachedLT == null): False}
 * @utbot.returnsFrom {@code return cachedLT;}
 *  */
    @Test
    public void testGetLT_CachedLTNotEqualsNull() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        RealMatrixImpl cachedLT = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(choleskyDecompositionImpl, "org.apache.commons.math.linear.CholeskyDecompositionImpl", "cachedLT", cachedLT);
        
        RealMatrixImpl actual = ((RealMatrixImpl) choleskyDecompositionImpl.getLT());
        
        double[][] actualData = actual.data;
        assertNull(actualData);
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLT()
    
    /**
    @utbot.classUnderTest {@link CholeskyDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.CholeskyDecompositionImpl#getLT()}
 * @utbot.executesCondition {@code (cachedLT == null): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.MatrixUtils#createRealMatrix(double[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cachedLT = MatrixUtils.createRealMatrix(lTData);
 *  */
    @Test
    public void testGetLT_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CholeskyDecompositionImpl choleskyDecompositionImpl = ((CholeskyDecompositionImpl) createInstance("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        double[][] lTData = {};
        setField(choleskyDecompositionImpl, "org.apache.commons.math.linear.CholeskyDecompositionImpl", "lTData", lTData);
        
        /* This test fails because method [org.apache.commons.math.linear.CholeskyDecompositionImpl.getLT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.DenseRealMatrix.<init>(DenseRealMatrix.java:126)
            org.apache.commons.math.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:88)
            org.apache.commons.math.linear.CholeskyDecompositionImpl.getLT(CholeskyDecompositionImpl.java:165) */
        choleskyDecompositionImpl.getLT();
    }
    ///endregion
    
    ///region Errors report for getLT
    
    public void testGetLT_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields783650410212300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields783650410212300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass783650410227600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields783650410212300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass783650410227600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields783650411314400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields783650411314400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass783650411322000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields783650411314400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass783650411322000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

