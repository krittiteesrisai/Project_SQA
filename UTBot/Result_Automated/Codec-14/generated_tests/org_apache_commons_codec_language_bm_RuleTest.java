package org.apache.commons.codec.language.bm;

import org.junit.Test;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.apache.commons.codec.language.bm.Languages.SomeLanguages;
import java.util.LinkedHashSet;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.codec.language.bm.Rule.RPattern;
import org.apache.commons.codec.language.bm.Rule.PhonemeExpr;
import java.util.regex.Pattern;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_codec_language_bm_RuleTest {
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.getPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPattern()
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#getPattern()}
 * @utbot.returnsFrom {@code return this.pattern;}
 *  */
    @Test
    public void testGetPattern_ReturnThisPattern() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        
        String actual = rule.getPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.startsWith
    
    ///region Errors report for startsWith
    
    public void testStartsWith_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.endsWith
    
    ///region Errors report for endsWith
    
    public void testEndsWith_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.contains
    
    ///region Errors report for contains
    
    public void testContains_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.getInstance
    
    ///region OTHER: ERROR SUITE for method getInstance(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, org.apache.commons.codec.language.bm.Languages$LanguageSet)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstance1() throws Exception  {
        NameType nameType = NameType.ASHKENAZI;
        RuleType ruleType = RuleType.RULES;
        Languages.LanguageSet anonymousLanguageSet = ((Languages.LanguageSet) createInstance("org.apache.commons.codec.language.bm.Languages$2"));
        
        Rule.getInstance(nameType, ruleType, anonymousLanguageSet);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstance2() throws Exception  {
        NameType nameType = NameType.ASHKENAZI;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstance(nameType, ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstance3() throws Exception  {
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstance(((NameType) null), ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstance4() throws Exception  {
        RuleType ruleType = RuleType.EXACT;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "\u0000";
        languages.add(string);
        String string1 = "";
        languages.add(string1);
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstance(((NameType) null), ruleType, someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstance5() throws Exception  {
        NameType nameType = NameType.ASHKENAZI;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        languages.add(null);
        String string = "\u0000";
        languages.add(string);
        String string1 = "";
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstance(nameType, ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstance6() throws Exception  {
        NameType nameType = NameType.GENERIC;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "";
        languages.add(string);
        languages.add(null);
        languages.add(null);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstance(nameType, ((RuleType) null), someLanguages);
    }
    ///endregion
    
    ///region Errors report for getInstance
    
    public void testGetInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Concrete execution failed
        
        // 12 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.getInstance
    
    ///region Errors report for getInstance
    
    public void testGetInstance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.pattern
    
    ///region OTHER: ERROR SUITE for method pattern(java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern1() throws Throwable  {
        String string = "^\u0000\u0000\u0000\u0000[\u0000\u0000$";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern2() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern3() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000$";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern4() throws Throwable  {
        String string = "^\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000[";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern5() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000[\u0000";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern6() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern7() throws Throwable  {
        String string = "[\u0000\u0000\u0000\u0000\u0000\u0000$";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern8() throws Throwable  {
        String string = "^\u0000\u0000\u0000\u0000[\u0000\u0000";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern9() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000\u0000[\u0000";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern10() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000[$";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testPattern11() throws Throwable  {
        String string = "^\u0000\u0000\u0000\u0000\u0000\u0000\u0000$";
        
        Class ruleClazz = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class stringType = Class.forName("java.lang.String");
        Method patternMethod = ruleClazz.getDeclaredMethod("pattern", stringType);
        patternMethod.setAccessible(true);
        java.lang.Object[] patternMethodArguments = new java.lang.Object[1];
        patternMethodArguments[0] = string;
        try {
            patternMethod.invoke(null, patternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for pattern
    
    public void testPattern_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.getRContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRContext()
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#getRContext()}
 * @utbot.returnsFrom {@code return this.rContext;}
 *  */
    @Test
    public void testGetRContext_ReturnThisRContext() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        
        Rule.RPattern actual = rule.getRContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.parsePhonemeExpr
    
    ///region Errors report for parsePhonemeExpr
    
    public void testParsePhonemeExpr_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 6 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.parseRules
    
    ///region Errors report for parseRules
    
    public void testParseRules_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.getLContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLContext()
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#getLContext()}
 * @utbot.returnsFrom {@code return this.lContext;}
 *  */
    @Test
    public void testGetLContext_ReturnThisLContext() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        
        Rule.RPattern actual = rule.getLContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.stripQuotes
    
    ///region Errors report for stripQuotes
    
    public void testStripQuotes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.getPhoneme
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPhoneme()
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#getPhoneme()}
 * @utbot.returnsFrom {@code return this.phoneme;}
 *  */
    @Test
    public void testGetPhoneme_ReturnThisPhoneme() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        
        Rule.PhonemeExpr actual = rule.getPhoneme();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.parsePhoneme
    
    ///region Errors report for parsePhoneme
    
    public void testParsePhoneme_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        // Concrete execution failed
        
        // 11 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.createResourceName
    
    ///region Errors report for createResourceName
    
    public void testCreateResourceName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.getInstanceMap
    
    ///region Errors report for getInstanceMap
    
    public void testGetInstanceMap_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 4 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.getInstanceMap
    
    ///region OTHER: ERROR SUITE for method getInstanceMap(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, org.apache.commons.codec.language.bm.Languages$LanguageSet)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstanceMap1() throws Exception  {
        NameType nameType = NameType.ASHKENAZI;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "\u0000";
        languages.add(string);
        String string1 = "";
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstanceMap(nameType, ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstanceMap2() throws Exception  {
        NameType nameType = NameType.GENERIC;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstanceMap(nameType, ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstanceMap3() throws Exception  {
        NameType nameType = NameType.SEPHARDIC;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        languages.add(string1);
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstanceMap(nameType, ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstanceMap4() throws Exception  {
        NameType nameType = NameType.GENERIC;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "\u0000";
        languages.add(string);
        String string1 = "";
        languages.add(string1);
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstanceMap(nameType, ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstanceMap5() throws Exception  {
        NameType nameType = NameType.ASHKENAZI;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        languages.add(null);
        String string = "";
        languages.add(string);
        languages.add(string);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstanceMap(nameType, ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstanceMap6() throws Exception  {
        NameType nameType = NameType.SEPHARDIC;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "\u0000";
        languages.add(string);
        languages.add(null);
        String string1 = "";
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstanceMap(nameType, ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstanceMap7() throws Exception  {
        NameType nameType = NameType.GENERIC;
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "";
        languages.add(string);
        languages.add(null);
        languages.add(null);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstanceMap(nameType, ((RuleType) null), someLanguages);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testGetInstanceMap8() throws Exception  {
        Languages.SomeLanguages someLanguages = ((Languages.SomeLanguages) createInstance("org.apache.commons.codec.language.bm.Languages$SomeLanguages"));
        LinkedHashSet languages = new LinkedHashSet();
        String string = "";
        languages.add(string);
        languages.add(null);
        String string1 = "";
        languages.add(string1);
        setField(someLanguages, "org.apache.commons.codec.language.bm.Languages$SomeLanguages", "languages", languages);
        
        Rule.getInstanceMap(((NameType) null), ((RuleType) null), someLanguages);
    }
    ///endregion
    
    ///region Errors report for getInstanceMap
    
    public void testGetInstanceMap_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Concrete execution failed
        
        // 13 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.createScanner
    
    ///region Errors report for createScanner
    
    public void testCreateScanner_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.createScanner
    
    ///region Errors report for createScanner
    
    public void testCreateScanner_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Rule.patternAndContextMatches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method patternAndContextMatches(java.lang.CharSequence, int)
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.executesCondition {@code (ipl > input.length()): True}
 *  */
    @Test
    public void testPatternAndContextMatches_IplGreaterThanInputLength() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        String pattern = "  ";
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "pattern", pattern);
        
        boolean actual = rule.patternAndContextMatches(pattern, 2);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.executesCondition {@code (ipl > input.length()): False}
 * @utbot.executesCondition {@code (!input.subSequence(i, ipl).equals(this.pattern)): True}
 *  */
    @Test
    public void testPatternAndContextMatches_NotInputSubSequenceIiplEquals() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        String pattern = "  ";
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "pattern", pattern);
        String string = "_ ";
        
        boolean actual = rule.patternAndContextMatches(string, 0);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.executesCondition {@code (ipl > input.length()): False}
 * @utbot.executesCondition {@code (!input.subSequence(i, ipl).equals(this.pattern)): False}
 * @utbot.executesCondition {@code (!this.rContext.isMatch(input.subSequence(ipl, input.length()))): True}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 * @utbot.invokes {@link java.lang.CharSequence#subSequence(int,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.bm.Rule.RPattern#isMatch(java.lang.CharSequence)}
 *  */
    @Test
    public void testPatternAndContextMatches_NotThisRContextIsMatch() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        String pattern = "";
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "pattern", pattern);
        Rule.RPattern rContext = ((Rule.RPattern) createInstance("org.apache.commons.codec.language.bm.Rule$8"));
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "rContext", rContext);
        
        boolean actual = rule.patternAndContextMatches(pattern, 0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method patternAndContextMatches(java.lang.CharSequence, int)
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.executesCondition {@code (i < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: i < 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testPatternAndContextMatches_ThrowIndexOutOfBoundsException() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        
        rule.patternAndContextMatches(null, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.executesCondition {@code (i < 0): False}
 * @utbot.executesCondition {@code (ipl > input.length()): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 * @utbot.invokes {@link java.lang.CharSequence#subSequence(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: !input.subSequence(i, ipl).equals(this.pattern)
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testPatternAndContextMatches_ThrowStringIndexOutOfBoundsException() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        String pattern = "  ";
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "pattern", pattern);
        
        rule.patternAndContextMatches(pattern, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method patternAndContextMatches(java.lang.CharSequence, int)
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.executesCondition {@code (ipl > input.length()): False}
 * @utbot.executesCondition {@code (!input.subSequence(i, ipl).equals(this.pattern)): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} when: !this.rContext.isMatch(input.subSequence(ipl, input.length()))
 *  */
    @Test
    public void testPatternAndContextMatches_ThrowNegativeArraySizeException() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        String pattern = " ";
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "pattern", pattern);
        Rule.RPattern rContext = ((Rule.RPattern) createInstance("org.apache.commons.codec.language.bm.Rule$10"));
        Pattern pattern1 = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(pattern1, "java.util.regex.Pattern", "compiled", true);
        setField(pattern1, "java.util.regex.Pattern", "localTCNCount", Integer.MIN_VALUE);
        setField(pattern1, "java.util.regex.Pattern", "capturingGroupCount", 9);
        setField(pattern1, "java.util.regex.Pattern", "localCount", 1);
        setField(rContext, "org.apache.commons.codec.language.bm.Rule$10", "pattern", pattern1);
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "rContext", rContext);
        
        /* This test fails because method [org.apache.commons.codec.language.bm.Rule.patternAndContextMatches] produces [java.lang.NegativeArraySizeException: Less than zero] */
        rule.patternAndContextMatches(pattern, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.executesCondition {@code (ipl > input.length()): False}
 * @utbot.executesCondition {@code (!input.subSequence(i, ipl).equals(this.pattern)): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} when: !this.rContext.isMatch(input.subSequence(ipl, input.length()))
 *  */
    @Test
    public void testPatternAndContextMatches_ThrowNegativeArraySizeException_1() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        String pattern = " ";
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "pattern", pattern);
        Rule.RPattern rContext = ((Rule.RPattern) createInstance("org.apache.commons.codec.language.bm.Rule$10"));
        Pattern pattern1 = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(pattern1, "java.util.regex.Pattern", "compiled", true);
        setField(pattern1, "java.util.regex.Pattern", "capturingGroupCount", 9);
        setField(pattern1, "java.util.regex.Pattern", "localCount", Integer.MIN_VALUE);
        setField(rContext, "org.apache.commons.codec.language.bm.Rule$10", "pattern", pattern1);
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "rContext", rContext);
        
        /* This test fails because method [org.apache.commons.codec.language.bm.Rule.patternAndContextMatches] produces [java.lang.NegativeArraySizeException: Less than zero] */
        rule.patternAndContextMatches(pattern, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.executesCondition {@code (ipl > input.length()): False}
 * @utbot.executesCondition {@code (!input.subSequence(i, ipl).equals(this.pattern)): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} when: !this.rContext.isMatch(input.subSequence(ipl, input.length()))
 *  */
    @Test
    public void testPatternAndContextMatches_ThrowNegativeArraySizeException_2() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        String pattern = " ";
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "pattern", pattern);
        Rule.RPattern rContext = ((Rule.RPattern) createInstance("org.apache.commons.codec.language.bm.Rule$10"));
        Pattern pattern1 = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(pattern1, "java.util.regex.Pattern", "compiled", true);
        setField(pattern1, "java.util.regex.Pattern", "capturingGroupCount", 1073741824);
        setField(rContext, "org.apache.commons.codec.language.bm.Rule$10", "pattern", pattern1);
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "rContext", rContext);
        
        /* This test fails because method [org.apache.commons.codec.language.bm.Rule.patternAndContextMatches] produces [java.lang.NegativeArraySizeException: Less than zero] */
        rule.patternAndContextMatches(pattern, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int patternLength = this.pattern.length();
 *  */
    @Test
    public void testPatternAndContextMatches_ThrowNullPointerException() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        
        /* This test fails because method [org.apache.commons.codec.language.bm.Rule.patternAndContextMatches] produces [java.lang.NullPointerException] */
        rule.patternAndContextMatches(null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ipl > input.length()
 *  */
    @Test
    public void testPatternAndContextMatches_ThrowNullPointerException_1() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        String pattern = " ";
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "pattern", pattern);
        
        /* This test fails because method [org.apache.commons.codec.language.bm.Rule.patternAndContextMatches] produces [java.lang.NullPointerException] */
        rule.patternAndContextMatches(null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Rule}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Rule#patternAndContextMatches(java.lang.CharSequence,int)}
 * @utbot.executesCondition {@code (ipl > input.length()): False}
 * @utbot.executesCondition {@code (!input.subSequence(i, ipl).equals(this.pattern)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !this.rContext.isMatch(input.subSequence(ipl, input.length()))
 *  */
    @Test
    public void testPatternAndContextMatches_ThrowNullPointerException_2() throws Exception  {
        Rule rule = ((Rule) createInstance("org.apache.commons.codec.language.bm.Rule"));
        String pattern = " ";
        setField(rule, "org.apache.commons.codec.language.bm.Rule", "pattern", pattern);
        
        /* This test fails because method [org.apache.commons.codec.language.bm.Rule.patternAndContextMatches] produces [java.lang.NullPointerException] */
        rule.patternAndContextMatches(pattern, 0);
    }
    ///endregion
    
    ///region Errors report for patternAndContextMatches
    
    public void testPatternAndContextMatches_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field static final boolean java.util.regex.Pattern.$assertionsDisabled accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.accept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields876669075145200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields876669075145200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass876669075150000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876669075145200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876669075150000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

