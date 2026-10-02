package org.apache.commons.codec.language.bm;

import org.junit.Test;
import org.apache.commons.codec.language.bm.Languages.SomeLanguages;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_codec_language_bm_PhoneticEngineTest {
    ///region Test suites for executable org.apache.commons.codec.language.bm.PhoneticEngine.encode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#encode(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.language.bm.Lang#guessLanguages(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Languages.LanguageSet languageSet = this.lang.guessLanguages(input);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException() throws Exception  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        
        /* This test fails because method [org.apache.commons.codec.language.bm.PhoneticEngine.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.bm.PhoneticEngine.encode(PhoneticEngine.java:375) */
        phoneticEngine.encode(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.PhoneticEngine.encode
    
    ///region OTHER: ERROR SUITE for method encode(java.lang.String, org.apache.commons.codec.language.bm.Languages$LanguageSet)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testEncode1() throws Exception  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        phoneticEngine.encode(null, someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testEncode2() throws Exception  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string1);
        languages.add(string);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        phoneticEngine.encode(string, someLanguages);
    }
    ///endregion
    
    ///region Errors report for encode
    
    public void testEncode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.PhoneticEngine.join
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method join(java.lang.Iterable, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#join(java.lang.Iterable,java.lang.String)}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testJoin_SiHasNext() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayList arrayList = new ArrayList();
        
        Class phoneticEngineClazz = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class arrayListType = Class.forName("java.lang.Iterable");
        Class stringType = Class.forName("java.lang.String");
        Method joinMethod = phoneticEngineClazz.getDeclaredMethod("join", arrayListType, stringType);
        joinMethod.setAccessible(true);
        java.lang.Object[] joinMethodArguments = new java.lang.Object[2];
        joinMethodArguments[0] = arrayList;
        joinMethodArguments[1] = ((Object) null);
        String actual = ((String) joinMethod.invoke(null, joinMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#join(java.lang.Iterable,java.lang.String)}
 * @utbot.invokes {@link java.util.Iterator#next()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testJoin_SiHasNext_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        Class phoneticEngineClazz = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class arrayListType = Class.forName("java.lang.Iterable");
        Class stringType = Class.forName("java.lang.String");
        Method joinMethod = phoneticEngineClazz.getDeclaredMethod("join", arrayListType, stringType);
        joinMethod.setAccessible(true);
        java.lang.Object[] joinMethodArguments = new java.lang.Object[2];
        joinMethodArguments[0] = arrayList;
        joinMethodArguments[1] = ((Object) null);
        String actual = ((String) joinMethod.invoke(null, joinMethodArguments));
        
        String expected = "null";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method join(java.lang.Iterable, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#join(java.lang.Iterable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Iterator<String> si = strings.iterator();
 *  */
    @Test
    public void testJoin_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.codec.language.bm.PhoneticEngine.join] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.bm.PhoneticEngine.join(PhoneticEngine.java:259) */
        Class phoneticEngineClazz = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class iterableType = Class.forName("java.lang.Iterable");
        Class stringType = Class.forName("java.lang.String");
        Method joinMethod = phoneticEngineClazz.getDeclaredMethod("join", iterableType, stringType);
        joinMethod.setAccessible(true);
        java.lang.Object[] joinMethodArguments = new java.lang.Object[2];
        joinMethodArguments[0] = ((Object) null);
        joinMethodArguments[1] = ((Object) null);
        try {
            joinMethod.invoke(null, joinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method join(java.lang.Iterable, java.lang.String)
    
    @Test
    public void testJoin1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        HashSet hashSet = new HashSet();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        hashSet.add(string);
        hashSet.add(null);
        String string1 = "";
        
        Class phoneticEngineClazz = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class hashSetType = Class.forName("java.lang.Iterable");
        Class string1Type = Class.forName("java.lang.String");
        Method joinMethod = phoneticEngineClazz.getDeclaredMethod("join", hashSetType, string1Type);
        joinMethod.setAccessible(true);
        java.lang.Object[] joinMethodArguments = new java.lang.Object[2];
        joinMethodArguments[0] = hashSet;
        joinMethodArguments[1] = string1;
        String actual = ((String) joinMethod.invoke(null, joinMethodArguments));
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000null";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testJoin2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        hashSet.add(string);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        hashSet.add(string1);
        
        Class phoneticEngineClazz = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class hashSetType = Class.forName("java.lang.Iterable");
        Class string1Type = Class.forName("java.lang.String");
        Method joinMethod = phoneticEngineClazz.getDeclaredMethod("join", hashSetType, string1Type);
        joinMethod.setAccessible(true);
        java.lang.Object[] joinMethodArguments = new java.lang.Object[2];
        joinMethodArguments[0] = hashSet;
        joinMethodArguments[1] = string1;
        String actual = ((String) joinMethod.invoke(null, joinMethodArguments));
        
        String expected = "null\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testJoin3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        String string = " ";
        
        Class phoneticEngineClazz = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class arrayListType = Class.forName("java.lang.Iterable");
        Class stringType = Class.forName("java.lang.String");
        Method joinMethod = phoneticEngineClazz.getDeclaredMethod("join", arrayListType, stringType);
        joinMethod.setAccessible(true);
        java.lang.Object[] joinMethodArguments = new java.lang.Object[2];
        joinMethodArguments[0] = arrayList;
        joinMethodArguments[1] = string;
        String actual = ((String) joinMethod.invoke(null, joinMethodArguments));
        
        String expected = "null null null null null null null null null null";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.PhoneticEngine.getNameType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNameType()
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#getNameType()}
 * @utbot.returnsFrom {@code return this.nameType;}
 *  */
    @Test
    public void testGetNameType_ReturnThisNameType() throws Exception  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        
        NameType actual = phoneticEngine.getNameType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.PhoneticEngine.isConcat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isConcat()
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#isConcat()}
 * @utbot.returnsFrom {@code return this.concat;}
 *  */
    @Test
    public void testIsConcat_ReturnThisConcat() throws Exception  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        
        boolean actual = phoneticEngine.isConcat();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.PhoneticEngine.applyFinalRules
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyFinalRules(org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#applyFinalRules(org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder,java.util.Map)}
 * @utbot.executesCondition {@code (finalRules == null): False}
 * @utbot.executesCondition {@code (finalRules.isEmpty()): True}
 * @utbot.invokes {@link java.util.Map#isEmpty()}
 * @utbot.returnsFrom {@code return phonemeBuilder;}
 *  */
    @Test
    public void testApplyFinalRules_FinalRulesIsEmpty() throws Exception  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        Class phoneticEngineClazz = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class phonemeBuilderType = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method applyFinalRulesMethod = phoneticEngineClazz.getDeclaredMethod("applyFinalRules", phonemeBuilderType, linkedHashMapType);
        applyFinalRulesMethod.setAccessible(true);
        java.lang.Object[] applyFinalRulesMethodArguments = new java.lang.Object[2];
        applyFinalRulesMethodArguments[0] = ((Object) null);
        applyFinalRulesMethodArguments[1] = linkedHashMap;
        PhoneticEngine.PhonemeBuilder actual = ((PhoneticEngine.PhonemeBuilder) applyFinalRulesMethod.invoke(phoneticEngine, applyFinalRulesMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method applyFinalRules(org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#applyFinalRules(org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder,java.util.Map)}
 * @utbot.executesCondition {@code (finalRules == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: finalRules == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testApplyFinalRules_ThrowNullPointerException() throws Throwable  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        
        Class phoneticEngineClazz = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class phonemeBuilderType = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder");
        Class mapType = Class.forName("java.util.Map");
        Method applyFinalRulesMethod = phoneticEngineClazz.getDeclaredMethod("applyFinalRules", phonemeBuilderType, mapType);
        applyFinalRulesMethod.setAccessible(true);
        java.lang.Object[] applyFinalRulesMethodArguments = new java.lang.Object[2];
        applyFinalRulesMethodArguments[0] = ((Object) null);
        applyFinalRulesMethodArguments[1] = ((Object) null);
        try {
            applyFinalRulesMethod.invoke(phoneticEngine, applyFinalRulesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.PhoneticEngine.getLang
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLang()
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#getLang()}
 * @utbot.returnsFrom {@code return this.lang;}
 *  */
    @Test
    public void testGetLang_ReturnThisLang() throws Exception  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        
        Lang actual = phoneticEngine.getLang();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.PhoneticEngine.getRuleType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRuleType()
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#getRuleType()}
 * @utbot.returnsFrom {@code return this.ruleType;}
 *  */
    @Test
    public void testGetRuleType_ReturnThisRuleType() throws Exception  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        
        RuleType actual = phoneticEngine.getRuleType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.PhoneticEngine.getMaxPhonemes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxPhonemes()
    
    /**
    @utbot.classUnderTest {@link PhoneticEngine}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.PhoneticEngine#getMaxPhonemes()}
 * @utbot.returnsFrom {@code return this.maxPhonemes;}
 *  */
    @Test
    public void testGetMaxPhonemes_ReturnThisMaxPhonemes() throws Exception  {
        PhoneticEngine phoneticEngine = ((PhoneticEngine) createInstance("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(phoneticEngine, "org.apache.commons.codec.language.bm.PhoneticEngine", "maxPhonemes", -255);
        
        int actual = phoneticEngine.getMaxPhonemes();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields876542811425800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields876542811425800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass876542811433900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876542811425800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876542811433900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

