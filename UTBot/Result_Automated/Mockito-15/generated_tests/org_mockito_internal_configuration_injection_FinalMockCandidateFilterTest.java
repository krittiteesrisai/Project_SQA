package org.mockito.internal.configuration.injection;

import org.junit.Test;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

public final class org_mockito_internal_configuration_injection_FinalMockCandidateFilterTest {
    ///region Test suites for executable org.mockito.internal.configuration.injection.FinalMockCandidateFilter.filterCandidate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method filterCandidate(java.util.Collection, java.lang.reflect.Field, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FinalMockCandidateFilter}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.FinalMockCandidateFilter#filterCandidate(java.util.Collection,java.lang.reflect.Field,java.lang.Object)}
 * @utbot.executesCondition {@code (mocks.size() == 1): False}
 * @utbot.returnsFrom {@code return new OngoingInjecter() {
 * 
 *     public boolean thenInject() {
 *         return false;
 *     }
 * };}
 *  */
    @Test
    public void testFilterCandidate_MocksSizeNotEquals1() throws Exception  {
        FinalMockCandidateFilter finalMockCandidateFilter = new FinalMockCandidateFilter();
        HashSet hashSet = new HashSet();
        
        OngoingInjecter actual = finalMockCandidateFilter.filterCandidate(hashSet, null, null);
        
        OngoingInjecter expected = ((OngoingInjecter) createInstance("org.mockito.internal.configuration.injection.FinalMockCandidateFilter$2"));
        FinalMockCandidateFilter this$0 = ((FinalMockCandidateFilter) createInstance("org.mockito.internal.configuration.injection.FinalMockCandidateFilter"));
        setField(expected, "org.mockito.internal.configuration.injection.FinalMockCandidateFilter$2", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link FinalMockCandidateFilter}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.FinalMockCandidateFilter#filterCandidate(java.util.Collection,java.lang.reflect.Field,java.lang.Object)}
 * @utbot.executesCondition {@code (mocks.size() == 1): True}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link java.util.Iterator#next()}
 * @utbot.returnsFrom {@code return new OngoingInjecter() {
 * 
 *     public boolean thenInject() {
 *         try {
 *             new FieldSetter(fieldInstance, field).set(matchingMock);
 *         } catch (Exception e) {
 *             throw new MockitoException("Problems injecting dependency in " + field.getName(), e);
 *         }
 *         return true;
 *     }
 * };}
 *  */
    @Test
    public void testFilterCandidate_MocksSizeEquals1() throws Exception  {
        FinalMockCandidateFilter finalMockCandidateFilter = new FinalMockCandidateFilter();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        OngoingInjecter actual = finalMockCandidateFilter.filterCandidate(arrayList, null, null);
        
        OngoingInjecter expected = ((OngoingInjecter) createInstance("org.mockito.internal.configuration.injection.FinalMockCandidateFilter$1"));
        FinalMockCandidateFilter this$0 = ((FinalMockCandidateFilter) createInstance("org.mockito.internal.configuration.injection.FinalMockCandidateFilter"));
        setField(expected, "org.mockito.internal.configuration.injection.FinalMockCandidateFilter$1", "this$0", this$0);
        
        Object actualVal$fieldInstance = getFieldValue(actual, "org.mockito.internal.configuration.injection.FinalMockCandidateFilter$1", "val$fieldInstance");
        assertNull(actualVal$fieldInstance);
        
        Field actualVal$field = ((Field) getFieldValue(actual, "org.mockito.internal.configuration.injection.FinalMockCandidateFilter$1", "val$field"));
        assertNull(actualVal$field);
        
        Object actualVal$matchingMock = getFieldValue(actual, "org.mockito.internal.configuration.injection.FinalMockCandidateFilter$1", "val$matchingMock");
        assertNull(actualVal$matchingMock);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterCandidate(java.util.Collection, java.lang.reflect.Field, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FinalMockCandidateFilter}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.FinalMockCandidateFilter#filterCandidate(java.util.Collection,java.lang.reflect.Field,java.lang.Object)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: mocks.size() == 1
 *  */
    @Test
    public void testFilterCandidate_ThrowNullPointerException() {
        FinalMockCandidateFilter finalMockCandidateFilter = new FinalMockCandidateFilter();
        
        /* This test fails because method [org.mockito.internal.configuration.injection.FinalMockCandidateFilter.filterCandidate] produces [java.lang.NullPointerException]
            org.mockito.internal.configuration.injection.FinalMockCandidateFilter.filterCandidate(FinalMockCandidateFilter.java:19) */
        finalMockCandidateFilter.filterCandidate(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method filterCandidate(java.util.Collection, java.lang.reflect.Field, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.configuration.injection.FinalMockCandidateFilter}
     * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.FinalMockCandidateFilter#filterCandidate(java.util.Collection,java.lang.reflect.Field,java.lang.Object)}
     */
    @Test(timeout = 1000L)
    public void testFilterCandidate() {
        FinalMockCandidateFilter finalMockCandidateFilter = new FinalMockCandidateFilter();
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        Object object1 = new Object();
        arrayList.add(object1);
        Object object2 = new Object();
        arrayList.add(object2);
        Object object3 = new Object();
        arrayList.add(object3);
        Object object4 = new Object();
        arrayList.add(object4);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        finalMockCandidateFilter.filterCandidate(arrayList, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1111010465699800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1111010465699800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1111010465705400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1111010465699800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1111010465705400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1111010466733600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1111010466733600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1111010466735400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1111010466733600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1111010466735400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

