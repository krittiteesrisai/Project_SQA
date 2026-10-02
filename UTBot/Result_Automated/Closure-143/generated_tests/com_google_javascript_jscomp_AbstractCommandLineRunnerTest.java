package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException;
import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_AbstractCommandLineRunnerTest {
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.getCommandLineConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCommandLineConfig()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getCommandLineConfig()}
 * @utbot.returnsFrom {@code return config;}
 *  */
    @Test
    public void testGetCommandLineConfig_ReturnConfig() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        AbstractCommandLineRunner.CommandLineConfig actual = commandLineRunner.getCommandLineConfig();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.maybeCreateDirsForPath
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method maybeCreateDirsForPath(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#maybeCreateDirsForPath(java.lang.String)}
     */
    @Test
    public void testMaybeCreateDirsForPathWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Method maybeCreateDirsForPathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("maybeCreateDirsForPath", stringType);
        maybeCreateDirsForPathMethod.setAccessible(true);
        java.lang.Object[] maybeCreateDirsForPathMethodArguments = new java.lang.Object[1];
        maybeCreateDirsForPathMethodArguments[0] = "\u0014\n\t\r";
        maybeCreateDirsForPathMethod.invoke(null, maybeCreateDirsForPathMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.parseModuleWrappers
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseModuleWrappers(java.util.List, [Lcom.google.javascript.jscomp.JSModule;)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#parseModuleWrappers(java.util.List,com.google.javascript.jscomp.JSModule[])}
     */
    @Test
    public void testParseModuleWrappersWithNonEmptyObjectArray() throws AbstractCommandLineRunner.FlagUsageException  {
        List list = emptyList();
        com.google.javascript.jscomp.JSModule[] jSModuleArray = new com.google.javascript.jscomp.JSModule[3];
        JSModule jSModule = new JSModule("-3");
        jSModuleArray[0] = jSModule;
        JSModule jSModule1 = new JSModule("'");
        jSModuleArray[1] = jSModule1;
        JSModule jSModule2 = new JSModule("%s");
        jSModuleArray[2] = jSModule2;
        
        HashMap actual = ((HashMap) AbstractCommandLineRunner.parseModuleWrappers(list, jSModuleArray));
        
        HashMap expected = new HashMap();
        String string = "-3";
        String string1 = "";
        expected.put(string, string1);
        String string2 = "'";
        expected.put(string2, string1);
        String string3 = "%s";
        expected.put(string3, string1);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineReplacements
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createDefineReplacements(java.util.List, com.google.javascript.jscomp.CompilerOptions)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createDefineReplacements(java.util.List,com.google.javascript.jscomp.CompilerOptions)}
     */
    @Test
    public void testCreateDefineReplacements() {
        List list = emptyList();
        
        AbstractCommandLineRunner.createDefineReplacements(list, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput
    
    ///region FUZZER: ERROR SUITE for method writeOutput(java.io.PrintStream, com.google.javascript.jscomp.Compiler, java.lang.String, java.lang.String, java.lang.String)
    
    @Test
    public void testWriteOutputByFuzzer() {
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput(AbstractCommandLineRunner.java:450) */
        AbstractCommandLineRunner.writeOutput(null, null, "#$\\\"'", "-3", "abc");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createExternInputs(java.util.List)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createExternInputs(java.util.List)}
     */
    @Test
    public void testCreateExternInputs() throws Exception  {
        List list = emptyList();
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class listType = Class.forName("java.util.List");
        Method createExternInputsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("createExternInputs", listType);
        createExternInputsMethod.setAccessible(true);
        java.lang.Object[] createExternInputsMethodArguments = new java.lang.Object[1];
        createExternInputsMethodArguments[0] = list;
        List actual = ((List) createExternInputsMethod.invoke(null, createExternInputsMethodArguments));
        
        List expected = new ArrayList();
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.Preloaded referenced = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName = "/dev/null";
        setField(referenced, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        referenced.setOriginalPath(fileName);
        setField(referenced, "com.google.javascript.jscomp.SourceFile", "lastLine", 1);
        String code = "";
        setField(referenced, "com.google.javascript.jscomp.SourceFile", "code", code);
        setField(jSSourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        setField(jSSourceFile, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(jSSourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", 1);
        expected.add(jSSourceFile);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createInputs
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createInputs(java.util.List, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createInputs(java.util.List,boolean)}
     */
    @Test
    public void testCreateInputs() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, AbstractCommandLineRunner.FlagUsageException, IOException  {
        List list = emptyList();
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class listType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method createInputsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("createInputs", listType, booleanType);
        createInputsMethod.setAccessible(true);
        java.lang.Object[] createInputsMethodArguments = new java.lang.Object[2];
        createInputsMethodArguments[0] = list;
        createInputsMethodArguments[1] = false;
        ArrayList actual = ((ArrayList) createInputsMethod.invoke(null, createInputsMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createJsModules
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createJsModules(java.util.List, java.util.List)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createJsModules(java.util.List,java.util.List)}
     */
    @Test(expected = IllegalStateException.class)
    public void testCreateJsModulesThrowsISE() throws AbstractCommandLineRunner.FlagUsageException, IOException  {
        List list = emptyList();
        
        AbstractCommandLineRunner.createJsModules(list, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns
    
    ///region Errors report for createExterns
    
    public void testCreateExterns_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.doRun
    
    ///region Errors report for doRun
    
    public void testDoRun_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.lang.ref.ReferenceQueue java.util.logging.Level$KnownLevel.QUEUE accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.run
    
    ///region Errors report for run
    
    public void testRun_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields938401733768700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields938401733768700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass938401733776000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields938401733768700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass938401733776000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

