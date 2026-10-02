package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

public final class org_mockito_internal_configuration_injection_filter_FinalMockCandidateFilterTest {
    ///region Test suites for executable org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter.filterCandidate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method filterCandidate(java.util.Collection, java.lang.reflect.Field, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FinalMockCandidateFilter}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter#filterCandidate(java.util.Collection,java.lang.reflect.Field,java.lang.Object)}
 * @utbot.executesCondition {@code (mocks.size() == 1): False}
 * @utbot.returnsFrom {@code return new OngoingInjecter() {
 * 
 *     public Object thenInject() {
 *         return null;
 *     }
 * };}
 *  */
    @Test
    public void testFilterCandidate_MocksSizeNotEquals1() throws Exception  {
        FinalMockCandidateFilter finalMockCandidateFilter = new FinalMockCandidateFilter();
        HashSet hashSet = new HashSet();
        
        OngoingInjecter actual = finalMockCandidateFilter.filterCandidate(hashSet, null, null);
        
        OngoingInjecter expected = ((OngoingInjecter) createInstance("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$2"));
        FinalMockCandidateFilter this$0 = ((FinalMockCandidateFilter) createInstance("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter"));
        setField(expected, "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$2", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link FinalMockCandidateFilter}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter#filterCandidate(java.util.Collection,java.lang.reflect.Field,java.lang.Object)}
 * @utbot.executesCondition {@code (mocks.size() == 1): True}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link java.util.Iterator#next()}
 * @utbot.returnsFrom {@code return new OngoingInjecter() {
 * 
 *     public Object thenInject() {
 *         try {
 *             if (!new BeanPropertySetter(fieldInstance, field).set(matchingMock)) {
 *                 new FieldSetter(fieldInstance, field).set(matchingMock);
 *             }
 *         } catch (RuntimeException e) {
 *             new Reporter().cannotInjectDependency(field, matchingMock, e);
 *         }
 *         return matchingMock;
 *     }
 * };}
 *  */
    @Test
    public void testFilterCandidate_MocksSizeEquals1() throws Exception  {
        FinalMockCandidateFilter finalMockCandidateFilter = new FinalMockCandidateFilter();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        OngoingInjecter actual = finalMockCandidateFilter.filterCandidate(arrayList, null, null);
        
        OngoingInjecter expected = ((OngoingInjecter) createInstance("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$1"));
        FinalMockCandidateFilter this$0 = ((FinalMockCandidateFilter) createInstance("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter"));
        setField(expected, "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$1", "this$0", this$0);
        
        Object actualVal$fieldInstance = getFieldValue(actual, "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$1", "val$fieldInstance");
        assertNull(actualVal$fieldInstance);
        
        Field actualVal$field = ((Field) getFieldValue(actual, "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$1", "val$field"));
        assertNull(actualVal$field);
        
        Object actualVal$matchingMock = getFieldValue(actual, "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$1", "val$matchingMock");
        assertNull(actualVal$matchingMock);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterCandidate(java.util.Collection, java.lang.reflect.Field, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FinalMockCandidateFilter}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter#filterCandidate(java.util.Collection,java.lang.reflect.Field,java.lang.Object)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: mocks.size() == 1
 *  */
    @Test
    public void testFilterCandidate_ThrowNullPointerException() {
        FinalMockCandidateFilter finalMockCandidateFilter = new FinalMockCandidateFilter();
        
        /* This test fails because method [org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter.filterCandidate] produces [java.lang.NullPointerException]
            org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter.filterCandidate(FinalMockCandidateFilter.java:24) */
        finalMockCandidateFilter.filterCandidate(null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1123688557649600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1123688557649600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1123688557671099 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1123688557649600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1123688557671099).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1123688561271000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1123688561271000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1123688561283499 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1123688561271000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1123688561283499).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

