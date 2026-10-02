package org.jfree.chart.renderer;

import org.junit.Test;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_jfree_chart_renderer_GrayPaintScaleTest {
    ///region Test suites for executable org.jfree.chart.renderer.GrayPaintScale.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link GrayPaintScale}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        GrayPaintScale grayPaintScale = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        
        boolean actual = grayPaintScale.equals(grayPaintScale);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GrayPaintScale}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof GrayPaintScale)): False}
 * @utbot.executesCondition {@code (this.lowerBound != that.lowerBound): True}
 *  */
    @Test
    public void testEquals_ThisLowerBoundNotEqualsThatLowerBound() throws Exception  {
        GrayPaintScale grayPaintScale = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(grayPaintScale, "org.jfree.chart.renderer.GrayPaintScale", "lowerBound", 2.0568806966515076E62);
        GrayPaintScale grayPaintScale1 = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(grayPaintScale1, "org.jfree.chart.renderer.GrayPaintScale", "lowerBound", -1.477276578845718E-126);
        
        boolean actual = grayPaintScale.equals(grayPaintScale1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GrayPaintScale}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof GrayPaintScale)): False}
 * @utbot.executesCondition {@code (this.lowerBound != that.lowerBound): False}
 * @utbot.executesCondition {@code (this.upperBound != that.upperBound): True}
 *  */
    @Test
    public void testEquals_ThisUpperBoundNotEqualsThatUpperBound() throws Exception  {
        GrayPaintScale grayPaintScale = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(grayPaintScale, "org.jfree.chart.renderer.GrayPaintScale", "lowerBound", -1.2702935820073348E-261);
        setField(grayPaintScale, "org.jfree.chart.renderer.GrayPaintScale", "upperBound", 6.027531661533091E197);
        GrayPaintScale grayPaintScale1 = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(grayPaintScale1, "org.jfree.chart.renderer.GrayPaintScale", "lowerBound", -1.2702935820073348E-261);
        setField(grayPaintScale1, "org.jfree.chart.renderer.GrayPaintScale", "upperBound", -1.495285060839905E-67);
        
        boolean actual = grayPaintScale.equals(grayPaintScale1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GrayPaintScale}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof GrayPaintScale)): False}
 * @utbot.executesCondition {@code (this.lowerBound != that.lowerBound): False}
 * @utbot.executesCondition {@code (this.upperBound != that.upperBound): False}
 *  */
    @Test
    public void testEquals_ThisUpperBoundEqualsThatUpperBound() throws Exception  {
        GrayPaintScale grayPaintScale = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(grayPaintScale, "org.jfree.chart.renderer.GrayPaintScale", "lowerBound", 2.5585822804931014E-265);
        setField(grayPaintScale, "org.jfree.chart.renderer.GrayPaintScale", "upperBound", 1.358077306218E-312);
        GrayPaintScale grayPaintScale1 = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(grayPaintScale1, "org.jfree.chart.renderer.GrayPaintScale", "lowerBound", 2.5585822804931014E-265);
        setField(grayPaintScale1, "org.jfree.chart.renderer.GrayPaintScale", "upperBound", 1.358077306218E-312);
        
        boolean actual = grayPaintScale.equals(grayPaintScale1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GrayPaintScale}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof GrayPaintScale)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfGrayPaintScale() throws Exception  {
        GrayPaintScale grayPaintScale = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        
        boolean actual = grayPaintScale.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.GrayPaintScale.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link GrayPaintScale}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return super.clone();}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        GrayPaintScale grayPaintScale = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        
        GrayPaintScale actual = ((GrayPaintScale) grayPaintScale.clone());
        
        GrayPaintScale expected = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(expected, "org.jfree.chart.renderer.GrayPaintScale", "lowerBound", 0.0);
        setField(expected, "org.jfree.chart.renderer.GrayPaintScale", "upperBound", 0.0);
        
        // org.jfree.chart.renderer.GrayPaintScale has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.GrayPaintScale.getPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPaint(double)
    
    /**
    @utbot.classUnderTest {@link GrayPaintScale}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#getPaint(double)}
 * @utbot.invokes {@link java.lang.Math#max(double,double)}
 * @utbot.invokes {@link java.lang.Math#min(double,double)}
 * @utbot.returnsFrom {@code return new Color(g, g, g);}
 *  */
    @Test
    public void testGetPaint_MathMin() throws Exception  {
        GrayPaintScale grayPaintScale = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(grayPaintScale, "org.jfree.chart.renderer.GrayPaintScale", "lowerBound", java.lang.Double.NaN);
        setField(grayPaintScale, "org.jfree.chart.renderer.GrayPaintScale", "upperBound", 1.8469855509214E-310);
        
        Color actual = ((Color) grayPaintScale.getPaint(-2.0));
        
        Color expected = new Color(0);
        
        // java.awt.Color has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getPaint(double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.renderer.GrayPaintScale}
     * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#getPaint(double)}
     */
    @Test
    public void testGetPaintThrowsIAEWithCornerCase() {
        GrayPaintScale grayPaintScale = new GrayPaintScale(0.0, 1.0);
        
        /* This test fails because method [org.jfree.chart.renderer.GrayPaintScale.getPaint] produces [java.lang.IllegalArgumentException: Color parameter outside of expected range: Red Green Blue]
            java.desktop/java.awt.Color.testColorValueRange(Color.java:312)
            java.desktop/java.awt.Color.<init>(Color.java:397)
            java.desktop/java.awt.Color.<init>(Color.java:371)
            org.jfree.chart.renderer.GrayPaintScale.getPaint(GrayPaintScale.java:128) */
        grayPaintScale.getPaint(java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.GrayPaintScale.getUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUpperBound()
    
    /**
    @utbot.classUnderTest {@link GrayPaintScale}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#getUpperBound()}
 * @utbot.returnsFrom {@code return this.upperBound;}
 *  */
    @Test
    public void testGetUpperBound_ReturnThisUpperBound() throws Exception  {
        GrayPaintScale grayPaintScale = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(grayPaintScale, "org.jfree.chart.renderer.GrayPaintScale", "upperBound", 0.0);
        
        double actual = grayPaintScale.getUpperBound();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.GrayPaintScale.getLowerBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLowerBound()
    
    /**
    @utbot.classUnderTest {@link GrayPaintScale}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#getLowerBound()}
 * @utbot.returnsFrom {@code return this.lowerBound;}
 *  */
    @Test
    public void testGetLowerBound_ReturnThisLowerBound() throws Exception  {
        GrayPaintScale grayPaintScale = ((GrayPaintScale) createInstance("org.jfree.chart.renderer.GrayPaintScale"));
        setField(grayPaintScale, "org.jfree.chart.renderer.GrayPaintScale", "lowerBound", 0.0);
        
        double actual = grayPaintScale.getLowerBound();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method getLowerBound()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.renderer.GrayPaintScale}
     * @utbot.methodUnderTest {@link org.jfree.chart.renderer.GrayPaintScale#getLowerBound()}
     */
    @Test(timeout = 1000L)
    public void testGetLowerBound() {
        GrayPaintScale grayPaintScale = new GrayPaintScale(-5.922386521538243E225, -8.089919876114265E-59);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        grayPaintScale.getLowerBound();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields800150339540500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields800150339540500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass800150339548200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800150339540500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800150339548200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

