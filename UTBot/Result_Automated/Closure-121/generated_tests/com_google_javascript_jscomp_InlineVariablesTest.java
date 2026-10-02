package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.InlineVariables.Mode;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_InlineVariablesTest {
    ///region Test suites for executable com.google.javascript.jscomp.InlineVariables.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineVariables#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() {
        InlineVariables.Mode mode = InlineVariables.Mode.ALL;
        InlineVariables inlineVariables = new InlineVariables(null, mode, false);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:319)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:503)
            com.google.javascript.jscomp.ReferenceCollectingCallback.process(ReferenceCollectingCallback.java:110)
            com.google.javascript.jscomp.InlineVariables.process(InlineVariables.java:86) */
        inlineVariables.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineVariables#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() {
        InlineVariables.Mode mode = InlineVariables.Mode.CONSTANTS_ONLY;
        InlineVariables inlineVariables = new InlineVariables(null, mode, false);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:319)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:503)
            com.google.javascript.jscomp.ReferenceCollectingCallback.process(ReferenceCollectingCallback.java:110)
            com.google.javascript.jscomp.InlineVariables.process(InlineVariables.java:86) */
        inlineVariables.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineVariables#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        InlineVariables inlineVariables = new InlineVariables(null, null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineVariables.getFilterForMode(InlineVariables.java:90)
            com.google.javascript.jscomp.InlineVariables.process(InlineVariables.java:85) */
        inlineVariables.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineVariables.getFilterForMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFilterForMode()
    
    /**
    @utbot.classUnderTest {@link InlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineVariables#getFilterForMode()}
 *  */
    @Test
    public void testGetFilterForMode_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        InlineVariables.Mode mode = InlineVariables.Mode.ALL;
        InlineVariables inlineVariables = new InlineVariables(null, mode, false);
        
        Class inlineVariablesClazz = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Method getFilterForModeMethod = inlineVariablesClazz.getDeclaredMethod("getFilterForMode");
        getFilterForModeMethod.setAccessible(true);
        java.lang.Object[] getFilterForModeMethodArguments = new java.lang.Object[0];
        Object actual = getFilterForModeMethod.invoke(inlineVariables, getFilterForModeMethodArguments);
        
        Class objectPredicateClazz = Class.forName("com.google.common.base.Predicates$ObjectPredicate");
        Object expected = getEnumConstantByName(objectPredicateClazz, "ALWAYS_TRUE");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineVariables#getFilterForMode()}
 *  */
    @Test
    public void testGetFilterForMode() throws Exception  {
        InlineVariables.Mode mode = InlineVariables.Mode.LOCALS_ONLY;
        InlineVariables inlineVariables = new InlineVariables(null, mode, false);
        
        Class inlineVariablesClazz = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Method getFilterForModeMethod = inlineVariablesClazz.getDeclaredMethod("getFilterForMode");
        getFilterForModeMethod.setAccessible(true);
        java.lang.Object[] getFilterForModeMethodArguments = new java.lang.Object[0];
        Object actual = getFilterForModeMethod.invoke(inlineVariables, getFilterForModeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.InlineVariables$IdentifyLocals");
        InlineVariables this$0 = ((InlineVariables) createInstance("com.google.javascript.jscomp.InlineVariables"));
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "mode", mode);
        Object identifyConstants = createInstance("com.google.javascript.jscomp.InlineVariables$IdentifyConstants");
        setField(identifyConstants, "com.google.javascript.jscomp.InlineVariables$IdentifyConstants", "this$0", this$0);
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "identifyConstants", identifyConstants);
        setField(expected, "com.google.javascript.jscomp.InlineVariables$IdentifyLocals", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link InlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineVariables#getFilterForMode()}
 * @utbot.activatesSwitch {@code switch(mode) case: CONSTANTS_ONLY}
 * @utbot.returnsFrom {@code return new IdentifyConstants();}
 *  */
    @Test
    public void testGetFilterForMode_Return() throws Exception  {
        InlineVariables.Mode mode = InlineVariables.Mode.CONSTANTS_ONLY;
        InlineVariables inlineVariables = new InlineVariables(null, mode, false);
        
        Class inlineVariablesClazz = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Method getFilterForModeMethod = inlineVariablesClazz.getDeclaredMethod("getFilterForMode");
        getFilterForModeMethod.setAccessible(true);
        java.lang.Object[] getFilterForModeMethodArguments = new java.lang.Object[0];
        Object actual = getFilterForModeMethod.invoke(inlineVariables, getFilterForModeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.InlineVariables$IdentifyConstants");
        InlineVariables this$0 = ((InlineVariables) createInstance("com.google.javascript.jscomp.InlineVariables"));
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "mode", mode);
        Object identifyConstants = createInstance("com.google.javascript.jscomp.InlineVariables$IdentifyConstants");
        setField(identifyConstants, "com.google.javascript.jscomp.InlineVariables$IdentifyConstants", "this$0", this$0);
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "identifyConstants", identifyConstants);
        setField(expected, "com.google.javascript.jscomp.InlineVariables$IdentifyConstants", "this$0", this$0);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFilterForMode()
    
    /**
    @utbot.classUnderTest {@link InlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineVariables#getFilterForMode()}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineVariables.Mode#ordinal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(mode)
 *  */
    @Test
    public void testGetFilterForMode_ThrowNullPointerException() throws Throwable  {
        InlineVariables inlineVariables = new InlineVariables(null, null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineVariables.getFilterForMode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineVariables.getFilterForMode(InlineVariables.java:90) */
        Class inlineVariablesClazz = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Method getFilterForModeMethod = inlineVariablesClazz.getDeclaredMethod("getFilterForMode");
        getFilterForModeMethod.setAccessible(true);
        java.lang.Object[] getFilterForModeMethodArguments = new java.lang.Object[0];
        try {
            getFilterForModeMethod.invoke(inlineVariables, getFilterForModeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFilterForMode()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.InlineVariables}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineVariables#getFilterForMode()}
     */
    @Test
    public void testGetFilterForMode1() throws Exception  {
        InlineVariables.Mode mode = InlineVariables.Mode.CONSTANTS_ONLY;
        InlineVariables inlineVariables = new InlineVariables(null, mode, true);
        
        Class inlineVariablesClazz = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Method getFilterForModeMethod = inlineVariablesClazz.getDeclaredMethod("getFilterForMode");
        getFilterForModeMethod.setAccessible(true);
        java.lang.Object[] getFilterForModeMethodArguments = new java.lang.Object[0];
        Object actual = getFilterForModeMethod.invoke(inlineVariables, getFilterForModeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.InlineVariables$IdentifyConstants");
        InlineVariables this$0 = ((InlineVariables) createInstance("com.google.javascript.jscomp.InlineVariables"));
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "mode", mode);
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "inlineAllStrings", true);
        Object identifyConstants = createInstance("com.google.javascript.jscomp.InlineVariables$IdentifyConstants");
        setField(identifyConstants, "com.google.javascript.jscomp.InlineVariables$IdentifyConstants", "this$0", this$0);
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "identifyConstants", identifyConstants);
        setField(expected, "com.google.javascript.jscomp.InlineVariables$IdentifyConstants", "this$0", this$0);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields905837698272800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields905837698272800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass905837698283300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905837698272800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905837698283300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

