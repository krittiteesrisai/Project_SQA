package org.apache.commons.math3.linear;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math3_linear_RectangularCholeskyDecompositionTest {
    ///region Test suites for executable org.apache.commons.math3.linear.RectangularCholeskyDecomposition.getRootMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRootMatrix()
    
    /**
    @utbot.classUnderTest {@link RectangularCholeskyDecomposition}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.RectangularCholeskyDecomposition#getRootMatrix()}
 * @utbot.returnsFrom {@code return root;}
 *  */
    @Test
    public void testGetRootMatrix_ReturnRoot() throws Exception  {
        RectangularCholeskyDecomposition rectangularCholeskyDecomposition = ((RectangularCholeskyDecomposition) createInstance("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        
        RealMatrix actual = rectangularCholeskyDecomposition.getRootMatrix();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.RectangularCholeskyDecomposition.getRank
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRank()
    
    /**
    @utbot.classUnderTest {@link RectangularCholeskyDecomposition}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.RectangularCholeskyDecomposition#getRank()}
 * @utbot.returnsFrom {@code return rank;}
 *  */
    @Test
    public void testGetRank_ReturnRank() throws Exception  {
        RectangularCholeskyDecomposition rectangularCholeskyDecomposition = ((RectangularCholeskyDecomposition) createInstance("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        setField(rectangularCholeskyDecomposition, "org.apache.commons.math3.linear.RectangularCholeskyDecomposition", "rank", -255);
        
        int actual = rectangularCholeskyDecomposition.getRank();
        
        assertEquals(-255, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields721264630237100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields721264630237100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass721264630244900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields721264630237100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass721264630244900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

