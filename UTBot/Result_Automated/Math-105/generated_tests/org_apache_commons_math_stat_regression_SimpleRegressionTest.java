package org.apache.commons.math.stat.regression;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.discovery.tools.PropertiesHolder;
import org.apache.commons.math.MathException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_stat_regression_SimpleRegressionTest {
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#clear()}
 *  */
    @Test
    public void testClear() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -255L);
        
        simpleRegression.clear();
        
        long finalSimpleRegressionN = ((Long) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n"));
        
        assertEquals(0L, finalSimpleRegressionN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getSlope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSlope()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getSlope()}
 * @utbot.executesCondition {@code (n < 2): True}
 *  */
    @Test
    public void testGetSlope_NLessThan2() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -253L);
        
        double actual = simpleRegression.getSlope();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getSlope()}
 * @utbot.executesCondition {@code (n < 2): False}
 * @utbot.executesCondition {@code (Math.abs(sumXX) < 10 * Double.MIN_VALUE): True}
 *  */
    @Test
    public void testGetSlope_MathAbsLessThan10MultiplyDoubleMIN_VALUE() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.getSlope();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getSlope()}
 * @utbot.executesCondition {@code (n < 2): False}
 * @utbot.executesCondition {@code (Math.abs(sumXX) < 10 * Double.MIN_VALUE): False}
 * @utbot.returnsFrom {@code return sumXY / sumXX;}
 *  */
    @Test
    public void testGetSlope_MathAbsGreaterOrEqual10MultiplyDoubleMIN_VALUE() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", -2.225073858507202E-308);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.getSlope();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getTotalSumSquares
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTotalSumSquares()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getTotalSumSquares()}
 * @utbot.executesCondition {@code (n < 2): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testGetTotalSumSquares_NLessThan2() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -253L);
        
        double actual = simpleRegression.getTotalSumSquares();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getTotalSumSquares()}
 * @utbot.executesCondition {@code (n < 2): False}
 * @utbot.returnsFrom {@code return sumYY;}
 *  */
    @Test
    public void testGetTotalSumSquares_NGreaterOrEqual2() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.getTotalSumSquares();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.addData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addData([[D)
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 *  */
    @Test
    public void testAddData_IterateForLoop() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 0L);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "xbar", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "ybar", 0.0);
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {0.0, 0.0};
        doubleArray[0] = doubleArray1;
        
        simpleRegression.addData(doubleArray);
        
        long finalSimpleRegressionN = ((Long) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n"));
        
        assertEquals(1L, finalSimpleRegressionN);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 *  */
    @Test
    public void testAddData_IterateForLoop_1() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 1L);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "xbar", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "ybar", 0.0);
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {0.0, 0.0};
        doubleArray[0] = doubleArray1;
        
        simpleRegression.addData(doubleArray);
        
        long finalSimpleRegressionN = ((Long) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n"));
        
        assertEquals(2L, finalSimpleRegressionN);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double[][])}
 *  */
    @Test
    public void testAddData() {
        SimpleRegression simpleRegression = new SimpleRegression();
        double[][] doubleArray = {};
        
        simpleRegression.addData(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addData([[D)
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addData(data[i][0], data[i][1]);
 *  */
    @Test
    public void testAddData_ThrowArrayIndexOutOfBoundsException() {
        SimpleRegression simpleRegression = new SimpleRegression();
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {};
        doubleArray[0] = doubleArray1;
        
        /* This test fails because method [org.apache.commons.math.stat.regression.SimpleRegression.addData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.stat.regression.SimpleRegression.addData(SimpleRegression.java:141) */
        simpleRegression.addData(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addData(data[i][0], data[i][1]);
 *  */
    @Test
    public void testAddData_ThrowArrayIndexOutOfBoundsException_1() {
        SimpleRegression simpleRegression = new SimpleRegression();
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        
        /* This test fails because method [org.apache.commons.math.stat.regression.SimpleRegression.addData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.stat.regression.SimpleRegression.addData(SimpleRegression.java:141) */
        simpleRegression.addData(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addData(data[i][0], data[i][1]);
 *  */
    @Test
    public void testAddData_ThrowNullPointerException_1() {
        SimpleRegression simpleRegression = new SimpleRegression();
        double[][] doubleArray = {null};
        
        /* This test fails because method [org.apache.commons.math.stat.regression.SimpleRegression.addData] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.regression.SimpleRegression.addData(SimpleRegression.java:141) */
        simpleRegression.addData(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testAddData_ThrowNullPointerException() {
        SimpleRegression simpleRegression = new SimpleRegression();
        
        /* This test fails because method [org.apache.commons.math.stat.regression.SimpleRegression.addData] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.regression.SimpleRegression.addData(SimpleRegression.java:140) */
        simpleRegression.addData(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addData([[D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double[][])}
     */
    @Test
    public void testAddDataWithNonEmptyObjectArray() {
        SimpleRegression simpleRegression = new SimpleRegression();
        double[][] doubleArray = new double[3][];
        double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        doubleArray[0] = doubleArray1;
        double[] doubleArray2 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, 1.0};
        doubleArray[1] = doubleArray2;
        double[] doubleArray3 = {0.0, java.lang.Double.NEGATIVE_INFINITY, 1.0};
        doubleArray[2] = doubleArray3;
        
        simpleRegression.addData(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.addData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addData(double, double)
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double,double)}
 * @utbot.executesCondition {@code (n == 0): True}
 *  */
    @Test
    public void testAddData_NEqualsZero() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 0L);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "xbar", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "ybar", 0.0);
        
        simpleRegression.addData(java.lang.Double.NaN, java.lang.Double.NaN);
        
        double finalSimpleRegressionSumX = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX"));
        double finalSimpleRegressionSumY = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY"));
        long finalSimpleRegressionN = ((Long) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n"));
        double finalSimpleRegressionXbar = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "xbar"));
        double finalSimpleRegressionYbar = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "ybar"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionSumX, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionSumY, 1.0E-6);
        
        assertEquals(1L, finalSimpleRegressionN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionXbar, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionYbar, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#addData(double,double)}
 * @utbot.executesCondition {@code (n == 0): False}
 *  */
    @Test
    public void testAddData_NNotEqualsZero() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -255L);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "xbar", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "ybar", 0.0);
        
        simpleRegression.addData(java.lang.Double.NaN, java.lang.Double.NaN);
        
        double finalSimpleRegressionSumX = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX"));
        double finalSimpleRegressionSumXX = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX"));
        double finalSimpleRegressionSumY = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY"));
        double finalSimpleRegressionSumYY = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY"));
        double finalSimpleRegressionSumXY = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY"));
        long finalSimpleRegressionN = ((Long) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n"));
        double finalSimpleRegressionXbar = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "xbar"));
        double finalSimpleRegressionYbar = ((Double) getFieldValue(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "ybar"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionSumX, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionSumXX, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionSumY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionSumYY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionSumXY, 1.0E-6);
        
        assertEquals(-254L, finalSimpleRegressionN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionXbar, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimpleRegressionYbar, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getN()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getN()}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testGetN_ReturnN() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 1L);
        
        long actual = simpleRegression.getN();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.predict
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method predict(double)
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#predict(double)}
 * @utbot.returnsFrom {@code return getIntercept(b1) + b1 * x;}
 *  */
    @Test
    public void testPredict_ReturnGetInterceptPlusB1MultiplyX() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -253L);
        
        double actual = simpleRegression.predict(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#predict(double)}
 * @utbot.returnsFrom {@code return getIntercept(b1) + b1 * x;}
 *  */
    @Test
    public void testPredict_ReturnGetInterceptPlusB1MultiplyX_1() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", -2.225073858507202E-308);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.predict(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#predict(double)}
 * @utbot.returnsFrom {@code return getIntercept(b1) + b1 * x;}
 *  */
    @Test
    public void testPredict_ReturnGetInterceptPlusB1MultiplyX_2() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", -0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.predict(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getIntercept
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIntercept()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getIntercept()}
 * @utbot.returnsFrom {@code return getIntercept(getSlope());}
 *  */
    @Test
    public void testGetIntercept_ReturnGetIntercept() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -253L);
        
        double actual = simpleRegression.getIntercept();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getIntercept()}
 * @utbot.returnsFrom {@code return getIntercept(getSlope());}
 *  */
    @Test
    public void testGetIntercept_ReturnGetIntercept_1() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", -0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.getIntercept();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getIntercept()}
 * @utbot.returnsFrom {@code return getIntercept(getSlope());}
 *  */
    @Test
    public void testGetIntercept_ReturnGetIntercept_2() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", -2.225073858507202E-308);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.getIntercept();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getIntercept
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIntercept(double)
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getIntercept(double)}
 * @utbot.returnsFrom {@code return (sumY - slope * sumX) / ((double) n);}
 *  */
    @Test
    public void testGetIntercept_ReturnSumYMinusSlopeMultiplySumXDivideN() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -255L);
        
        Class simpleRegressionClazz = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class doubleType = double.class;
        Method getInterceptMethod = simpleRegressionClazz.getDeclaredMethod("getIntercept", doubleType);
        getInterceptMethod.setAccessible(true);
        java.lang.Object[] getInterceptMethodArguments = new java.lang.Object[1];
        getInterceptMethodArguments[0] = java.lang.Double.NaN;
        double actual = ((Double) getInterceptMethod.invoke(simpleRegression, getInterceptMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getMeanSquareError
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMeanSquareError()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getMeanSquareError()}
 * @utbot.executesCondition {@code (n < 3): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testGetMeanSquareError_NLessThan3() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -251L);
        
        double actual = simpleRegression.getMeanSquareError();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getMeanSquareError()}
 * @utbot.executesCondition {@code (n < 3): False}
 * @utbot.invokes {@link org.apache.commons.math.stat.regression.SimpleRegression#getSumSquaredErrors()}
 * @utbot.returnsFrom {@code return getSumSquaredErrors() / (double) (n - 2);}
 *  */
    @Test
    public void testGetMeanSquareError_NGreaterOrEqual3() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 3L);
        
        double actual = simpleRegression.getMeanSquareError();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getSlopeStdErr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSlopeStdErr()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getSlopeStdErr()}
 * @utbot.returnsFrom {@code return Math.sqrt(getMeanSquareError() / sumXX);}
 *  */
    @Test
    public void testGetSlopeStdErr_ReturnMathSqrt() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -251L);
        
        double actual = simpleRegression.getSlopeStdErr();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getSlopeStdErr()}
 * @utbot.returnsFrom {@code return Math.sqrt(getMeanSquareError() / sumXX);}
 *  */
    @Test
    public void testGetSlopeStdErr_ReturnMathSqrt_1() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 3L);
        
        double actual = simpleRegression.getSlopeStdErr();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getInterceptStdErr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInterceptStdErr()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getInterceptStdErr()}
 * @utbot.returnsFrom {@code return Math.sqrt(getMeanSquareError() * ((1d / (double) n) + (xbar * xbar) / sumXX));}
 *  */
    @Test
    public void testGetInterceptStdErr_ReturnMathSqrt() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -251L);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "xbar", 0.0);
        
        double actual = simpleRegression.getInterceptStdErr();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getInterceptStdErr()}
 * @utbot.returnsFrom {@code return Math.sqrt(getMeanSquareError() * ((1d / (double) n) + (xbar * xbar) / sumXX));}
 *  */
    @Test
    public void testGetInterceptStdErr_ReturnMathSqrt_1() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 3L);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "xbar", 0.0);
        
        double actual = simpleRegression.getInterceptStdErr();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getTDistribution
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTDistribution()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getTDistribution()}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTDistributionThrowsIAE() throws Throwable  {
        SimpleRegression simpleRegression = new SimpleRegression();
        
        Class simpleRegressionClazz = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Method getTDistributionMethod = simpleRegressionClazz.getDeclaredMethod("getTDistribution");
        getTDistributionMethod.setAccessible(true);
        java.lang.Object[] getTDistributionMethodArguments = new java.lang.Object[0];
        try {
            getTDistributionMethod.invoke(simpleRegression, getTDistributionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTDistribution()
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetTDistribution1() throws Throwable  {
        PropertiesHolder prevNullProperties = org.apache.commons.discovery.tools.DiscoverClass.nullProperties;
        try {
            Class discoverClassClazz = Class.forName("org.apache.commons.discovery.tools.DiscoverClass");
            setStaticField(discoverClassClazz, "nullProperties", null);
            SimpleRegression simpleRegression = new SimpleRegression();
            
            Class simpleRegressionClazz = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
            Method getTDistributionMethod = simpleRegressionClazz.getDeclaredMethod("getTDistribution");
            getTDistributionMethod.setAccessible(true);
            java.lang.Object[] getTDistributionMethodArguments = new java.lang.Object[0];
            try {
                getTDistributionMethod.invoke(simpleRegression, getTDistributionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.discovery.tools.DiscoverClass.class, "nullProperties", prevNullProperties);
        }
    }
    ///endregion
    
    ///region Errors report for getTDistribution
    
    public void testGetTDistribution_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Cannot retrieve body for a LogFactory.getLog method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getR
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getR()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getR()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetR_ReturnResult() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -253L);
        
        double actual = simpleRegression.getR();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getR()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetR_ReturnResult_1() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", -0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.getR();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getSignificance
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSignificance()
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetSignificance1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, MathException  {
        PropertiesHolder prevNullProperties = org.apache.commons.discovery.tools.DiscoverClass.nullProperties;
        try {
            Class discoverClassClazz = Class.forName("org.apache.commons.discovery.tools.DiscoverClass");
            setStaticField(discoverClassClazz, "nullProperties", null);
            SimpleRegression simpleRegression = new SimpleRegression();
            
            simpleRegression.getSignificance();
        } finally {
            setStaticField(org.apache.commons.discovery.tools.DiscoverClass.class, "nullProperties", prevNullProperties);
        }
    }
    ///endregion
    
    ///region Errors report for getSignificance
    
    public void testGetSignificance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Cannot retrieve body for a LogFactory.getLog method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getRSquare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRSquare()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getRSquare()}
 * @utbot.returnsFrom {@code return (ssto - getSumSquaredErrors()) / ssto;}
 *  */
    @Test
    public void testGetRSquare_ReturnSstoMinusGetSumSquaredErrorsDivideSsto() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -253L);
        
        double actual = simpleRegression.getRSquare();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getRSquare()}
 * @utbot.returnsFrom {@code return (ssto - getSumSquaredErrors()) / ssto;}
 *  */
    @Test
    public void testGetRSquare_ReturnSstoMinusGetSumSquaredErrorsDivideSsto_1() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.getRSquare();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getSumSquaredErrors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSumSquaredErrors()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getSumSquaredErrors()}
 * @utbot.returnsFrom {@code return sumYY - sumXY * sumXY / sumXX;}
 *  */
    @Test
    public void testGetSumSquaredErrors_ReturnSumYYMinusSumXYMultiplySumXYDivideSumXX() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        
        double actual = simpleRegression.getSumSquaredErrors();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getRegressionSumSquares
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRegressionSumSquares(double)
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getRegressionSumSquares(double)}
 * @utbot.returnsFrom {@code return slope * slope * sumXX;}
 *  */
    @Test
    public void testGetRegressionSumSquares_ReturnSlopeMultiplySlopeMultiplySumXX() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        
        Class simpleRegressionClazz = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class doubleType = double.class;
        Method getRegressionSumSquaresMethod = simpleRegressionClazz.getDeclaredMethod("getRegressionSumSquares", doubleType);
        getRegressionSumSquaresMethod.setAccessible(true);
        java.lang.Object[] getRegressionSumSquaresMethodArguments = new java.lang.Object[1];
        getRegressionSumSquaresMethodArguments[0] = java.lang.Double.NaN;
        double actual = ((Double) getRegressionSumSquaresMethod.invoke(simpleRegression, getRegressionSumSquaresMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getRegressionSumSquares
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRegressionSumSquares()
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getRegressionSumSquares()}
 * @utbot.returnsFrom {@code return getRegressionSumSquares(getSlope());}
 *  */
    @Test
    public void testGetRegressionSumSquares_ReturnGetRegressionSumSquares() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -253L);
        
        double actual = simpleRegression.getRegressionSumSquares();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getRegressionSumSquares()}
 * @utbot.returnsFrom {@code return getRegressionSumSquares(getSlope());}
 *  */
    @Test
    public void testGetRegressionSumSquares_ReturnGetRegressionSumSquares_1() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 4.9E-323);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.getRegressionSumSquares();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getRegressionSumSquares()}
 * @utbot.returnsFrom {@code return getRegressionSumSquares(getSlope());}
 *  */
    @Test
    public void testGetRegressionSumSquares_ReturnGetRegressionSumSquares_2() throws Exception  {
        SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 4.9E-324);
        setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 2L);
        
        double actual = simpleRegression.getRegressionSumSquares();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getSlopeConfidenceInterval
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSlopeConfidenceInterval(double)
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getSlopeConfidenceInterval(double)}
 * @utbot.executesCondition {@code (alpha >= 1): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: alpha >= 1 || alpha <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_ThrowIllegalArgumentException() throws MathException  {
        SimpleRegression simpleRegression = new SimpleRegression();
        
        simpleRegression.getSlopeConfidenceInterval(1.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleRegression}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.regression.SimpleRegression#getSlopeConfidenceInterval(double)}
 * @utbot.executesCondition {@code (alpha >= 1): False}
 * @utbot.executesCondition {@code (alpha <= 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: alpha >= 1 || alpha <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_ThrowIllegalArgumentException_1() throws MathException  {
        SimpleRegression simpleRegression = new SimpleRegression();
        
        simpleRegression.getSlopeConfidenceInterval(0.0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSlopeConfidenceInterval(double)
    
    @Test
    public void testGetSlopeConfidenceInterval1() throws Exception  {
        PropertiesHolder prevNullProperties = org.apache.commons.discovery.tools.DiscoverClass.nullProperties;
        try {
            Class discoverClassClazz = Class.forName("org.apache.commons.discovery.tools.DiscoverClass");
            setStaticField(discoverClassClazz, "nullProperties", null);
            SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 4L);
            
            double actual = simpleRegression.getSlopeConfidenceInterval(4.9E-324);
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        } finally {
            setStaticField(org.apache.commons.discovery.tools.DiscoverClass.class, "nullProperties", prevNullProperties);
        }
    }
    
    @Test
    public void testGetSlopeConfidenceInterval2() throws Exception  {
        PropertiesHolder prevNullProperties = org.apache.commons.discovery.tools.DiscoverClass.nullProperties;
        try {
            Class discoverClassClazz = Class.forName("org.apache.commons.discovery.tools.DiscoverClass");
            setStaticField(discoverClassClazz, "nullProperties", null);
            SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 4L);
            
            double actual = simpleRegression.getSlopeConfidenceInterval(java.lang.Double.NaN);
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        } finally {
            setStaticField(org.apache.commons.discovery.tools.DiscoverClass.class, "nullProperties", prevNullProperties);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSlopeConfidenceInterval(double)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval3() throws Exception  {
        PropertiesHolder prevNullProperties = org.apache.commons.discovery.tools.DiscoverClass.nullProperties;
        try {
            Class discoverClassClazz = Class.forName("org.apache.commons.discovery.tools.DiscoverClass");
            setStaticField(discoverClassClazz, "nullProperties", null);
            SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -9223372036854775804L);
            
            simpleRegression.getSlopeConfidenceInterval(java.lang.Double.NaN);
        } finally {
            setStaticField(org.apache.commons.discovery.tools.DiscoverClass.class, "nullProperties", prevNullProperties);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.regression.SimpleRegression.getSlopeConfidenceInterval
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSlopeConfidenceInterval()
    
    @Test
    public void testGetSlopeConfidenceInterval4() throws Exception  {
        PropertiesHolder prevNullProperties = org.apache.commons.discovery.tools.DiscoverClass.nullProperties;
        try {
            Class discoverClassClazz = Class.forName("org.apache.commons.discovery.tools.DiscoverClass");
            setStaticField(discoverClassClazz, "nullProperties", null);
            SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 8L);
            
            double actual = simpleRegression.getSlopeConfidenceInterval();
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        } finally {
            setStaticField(org.apache.commons.discovery.tools.DiscoverClass.class, "nullProperties", prevNullProperties);
        }
    }
    
    @Test
    public void testGetSlopeConfidenceInterval5() throws Exception  {
        PropertiesHolder prevNullProperties = org.apache.commons.discovery.tools.DiscoverClass.nullProperties;
        try {
            Class discoverClassClazz = Class.forName("org.apache.commons.discovery.tools.DiscoverClass");
            setStaticField(discoverClassClazz, "nullProperties", null);
            SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumYY", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXY", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", 4L);
            
            double actual = simpleRegression.getSlopeConfidenceInterval();
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        } finally {
            setStaticField(org.apache.commons.discovery.tools.DiscoverClass.class, "nullProperties", prevNullProperties);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSlopeConfidenceInterval()
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval6() throws Exception  {
        PropertiesHolder prevNullProperties = org.apache.commons.discovery.tools.DiscoverClass.nullProperties;
        try {
            Class discoverClassClazz = Class.forName("org.apache.commons.discovery.tools.DiscoverClass");
            setStaticField(discoverClassClazz, "nullProperties", null);
            SimpleRegression simpleRegression = ((SimpleRegression) createInstance("org.apache.commons.math.stat.regression.SimpleRegression"));
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "sumXX", 0.0);
            setField(simpleRegression, "org.apache.commons.math.stat.regression.SimpleRegression", "n", -9223372036854775804L);
            
            simpleRegression.getSlopeConfidenceInterval();
        } finally {
            setStaticField(org.apache.commons.discovery.tools.DiscoverClass.class, "nullProperties", prevNullProperties);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields789256957202900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields789256957202900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass789256957211700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields789256957202900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass789256957211700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields789256957676200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields789256957676200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass789256957679800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields789256957676200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass789256957679800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields789256958334700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields789256958334700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass789256958338400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields789256958334700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass789256958338400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

