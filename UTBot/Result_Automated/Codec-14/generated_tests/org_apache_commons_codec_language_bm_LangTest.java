package org.apache.commons.codec.language.bm;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

public final class org_apache_commons_codec_language_bm_LangTest {
    ///region Test suites for executable org.apache.commons.codec.language.bm.Lang.instance
    
    ///region FUZZER: ERROR SUITE for method instance(org.apache.commons.codec.language.bm.NameType)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE() {
        NameType nameType = NameType.GENERIC;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE1() {
        NameType nameType = NameType.ASHKENAZI;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE2() {
        NameType nameType = NameType.ASHKENAZI;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE3() {
        NameType nameType = NameType.ASHKENAZI;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE4() {
        NameType nameType = NameType.ASHKENAZI;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE5() {
        NameType nameType = NameType.ASHKENAZI;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE6() {
        NameType nameType = NameType.SEPHARDIC;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE7() {
        NameType nameType = NameType.SEPHARDIC;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE8() {
        NameType nameType = NameType.GENERIC;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE9() {
        NameType nameType = NameType.GENERIC;
        
        Lang.instance(nameType);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#instance(org.apache.commons.codec.language.bm.NameType)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testInstanceThrowsNCDFE10() {
        NameType nameType = NameType.GENERIC;
        
        Lang.instance(nameType);
    }
    ///endregion
    
    ///region Errors report for instance
    
    public void testInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Lang.guessLanguages
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method guessLanguages(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Lang}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#guessLanguages(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#toLowerCase(java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String text = input.toLowerCase(Locale.ENGLISH);
 *  */
    @Test
    public void testGuessLanguages_ThrowNullPointerException() throws Exception  {
        Lang lang = ((Lang) createInstance("org.apache.commons.codec.language.bm.Lang"));
        
        /* This test fails because method [org.apache.commons.codec.language.bm.Lang.guessLanguages] produces [java.lang.NullPointerException] */
        lang.guessLanguages(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.bm.Lang.loadFromResource
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method loadFromResource(java.lang.String, org.apache.commons.codec.language.bm.Languages)
    
    /**
    @utbot.classUnderTest {@link Lang}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
 * @utbot.invokes {@link java.lang.Class#getClassLoader()}
 * @utbot.invokes {@link java.lang.ClassLoader#getResourceAsStream(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: final InputStream lRulesIS = Lang.class.getClassLoader().getResourceAsStream(languageRulesResourceName);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResource_ThrowNoClassDefFoundError() {
        Lang.loadFromResource(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method loadFromResource(java.lang.String, org.apache.commons.codec.language.bm.Languages)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString() {
        Lang.loadFromResource("/,*", null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString1() {
        Lang.loadFromResource("\uFFF5/,*", null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString2() {
        Lang.loadFromResource("\uFFF5/,<*", null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString3() {
        Lang.loadFromResource("\uFFF5/,<*", null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString4() {
        Lang.loadFromResource("\uFFF5,<*", null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString5() {
        Lang.loadFromResource("*,<\uFFF5", null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString6() {
        Lang.loadFromResource("*,\uFFC0<\uFFF5", null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString7() {
        Lang.loadFromResource("<\uFFC0*,\uFFF5", null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString8() {
        Lang.loadFromResource("/*?", null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.bm.Lang}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.bm.Lang#loadFromResource(java.lang.String,org.apache.commons.codec.language.bm.Languages)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadFromResourceThrowsNCDFEWithNonEmptyString9() {
        Lang.loadFromResource("*/?", null);
    }
    ///endregion
    
    ///region Errors report for loadFromResource
    
    public void testLoadFromResource_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

