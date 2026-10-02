package org.apache.commons.codec.language;

import org.junit.Test;
import org.apache.commons.codec.EncoderException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_codec_language_SoundexTest {
    ///region Test suites for executable org.apache.commons.codec.language.Soundex.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof String)): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.Soundex#soundex(java.lang.String)}
 * @utbot.returnsFrom {@code return soundex((String) obj);}
 *  */
    @Test
    public void testEncode_ObjNotInstanceOfString() throws EncoderException  {
        Soundex soundex = new Soundex();
        String string = "";
        
        String actual = ((String) soundex.encode(((Object) string)));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof String)): True}
 * @utbot.throwsException {@link org.apache.commons.codec.EncoderException} when: !(obj instanceof String)
 *  */
    @Test(expected = EncoderException.class)
    public void testEncode_ThrowEncoderException() throws EncoderException  {
        Soundex soundex = new Soundex();
        
        soundex.encode(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Soundex.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#encode(java.lang.String)}
 * @utbot.returnsFrom {@code return soundex(str);}
 *  */
    @Test
    public void testEncode_ReturnSoundex() {
        Soundex soundex = new Soundex();
        
        String actual = soundex.encode(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#encode(java.lang.String)}
 * @utbot.returnsFrom {@code return soundex(str);}
 *  */
    @Test
    public void testEncode_ReturnSoundex_1() {
        Soundex soundex = new Soundex();
        String string = "";
        
        String actual = soundex.encode(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Soundex}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#encode(java.lang.String)}
     */
    @Test
    public void testEncodeWithNonEmptyString() {
        Soundex soundex = new Soundex("abc");
        soundex.setMaxLength(-1);
        
        String actual = soundex.encode("10");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Soundex}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#encode(java.lang.String)}
     */
    @Test
    public void testEncodeWithNonEmptyString1() {
        Soundex soundex = new Soundex("#$\\\"'");
        soundex.setMaxLength(-1);
        
        String actual = soundex.encode("abc");
        
        String expected = "A$\\0";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Soundex.map
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method map(char)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#map(char)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= this.getSoundexMapping().length): False}
 * @utbot.invokes org.apache.commons.codec.language.Soundex#getSoundexMapping()
 * @utbot.invokes org.apache.commons.codec.language.Soundex#getSoundexMapping()
 * @utbot.returnsFrom {@code return this.getSoundexMapping()[index];}
 *  */
    @Test
    public void testMap_IndexLessThanThisGetSoundexMappingLength() throws Exception  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {' '};
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class charType = char.class;
        Method mapMethod = soundexClazz.getDeclaredMethod("map", charType);
        mapMethod.setAccessible(true);
        java.lang.Object[] mapMethodArguments = new java.lang.Object[1];
        mapMethodArguments[0] = 'A';
        char actual = ((Character) mapMethod.invoke(soundex, mapMethodArguments));
        
        assertEquals(' ', actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method map(char)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#map(char)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= this.getSoundexMapping().length): True}
 * @utbot.invokes org.apache.commons.codec.language.Soundex#getSoundexMapping()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index >= this.getSoundexMapping().length
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMap_ThrowIllegalArgumentException() throws Throwable  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {};
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class charType = char.class;
        Method mapMethod = soundexClazz.getDeclaredMethod("map", charType);
        mapMethod.setAccessible(true);
        java.lang.Object[] mapMethodArguments = new java.lang.Object[1];
        mapMethodArguments[0] = 'A';
        try {
            mapMethod.invoke(soundex, mapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#map(char)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index >= this.getSoundexMapping().length
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMap_ThrowIllegalArgumentException_1() throws Throwable  {
        Soundex soundex = new Soundex();
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class charType = char.class;
        Method mapMethod = soundexClazz.getDeclaredMethod("map", charType);
        mapMethod.setAccessible(true);
        java.lang.Object[] mapMethodArguments = new java.lang.Object[1];
        mapMethodArguments[0] = '@';
        try {
            mapMethod.invoke(soundex, mapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method map(char)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#map(char)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.invokes org.apache.commons.codec.language.Soundex#getSoundexMapping()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < 0 || index >= this.getSoundexMapping().length
 *  */
    @Test
    public void testMap_ThrowNullPointerException() throws Throwable  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        
        /* This test fails because method [org.apache.commons.codec.language.Soundex.map] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.Soundex.map(Soundex.java:231) */
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class charType = char.class;
        Method mapMethod = soundexClazz.getDeclaredMethod("map", charType);
        mapMethod.setAccessible(true);
        java.lang.Object[] mapMethodArguments = new java.lang.Object[1];
        mapMethodArguments[0] = 'A';
        try {
            mapMethod.invoke(soundex, mapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Soundex.difference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method difference(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#difference(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return SoundexUtils.difference(this, s1, s2);}
 *  */
    @Test
    public void testDifference_ReturnSoundexUtilsDifference() throws EncoderException  {
        Soundex soundex = new Soundex();
        
        int actual = soundex.difference(null, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#difference(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return SoundexUtils.difference(this, s1, s2);}
 *  */
    @Test
    public void testDifference_ReturnSoundexUtilsDifference_1() throws EncoderException  {
        Soundex soundex = new Soundex();
        String string = "";
        
        int actual = soundex.difference(string, null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method difference(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Soundex}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#difference(java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturnsZeroWithNonEmptyStrings() throws EncoderException  {
        Soundex soundex = new Soundex("abc");
        soundex.setMaxLength(-1);
        
        int actual = soundex.difference("01", "abc");
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method difference(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Soundex}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#difference(java.lang.String,java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDifferenceThrowsIAEWithNonEmptyStrings() throws EncoderException  {
        Soundex soundex = new Soundex("abc");
        soundex.setMaxLength(Integer.MAX_VALUE);
        
        soundex.difference("10", "Eabc");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Soundex}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#difference(java.lang.String,java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDifferenceThrowsIAEWithNonEmptyStrings1() throws EncoderException  {
        Soundex soundex = new Soundex("abc");
        soundex.setMaxLength(Integer.MAX_VALUE);
        
        soundex.difference("0", "Eabc");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Soundex}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#difference(java.lang.String,java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDifferenceThrowsIAEWithNonEmptyStringAndBlankString() throws EncoderException  {
        char[] charArray = {'?'};
        Soundex soundex = new Soundex(charArray);
        soundex.setMaxLength(1);
        
        soundex.difference("ac", "\n\t\r");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Soundex.getMaxLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxLength()
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMaxLength()}
 * @utbot.returnsFrom {@code return this.maxLength;}
 *  */
    @Test
    public void testGetMaxLength_ReturnThisMaxLength() {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(-255);
        
        int actual = soundex.getMaxLength();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Soundex.getSoundexMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSoundexMapping()
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getSoundexMapping()}
 * @utbot.returnsFrom {@code return this.soundexMapping;}
 *  */
    @Test
    public void testGetSoundexMapping_ReturnThisSoundexMapping() throws Exception  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Method getSoundexMappingMethod = soundexClazz.getDeclaredMethod("getSoundexMapping");
        getSoundexMappingMethod.setAccessible(true);
        java.lang.Object[] getSoundexMappingMethodArguments = new java.lang.Object[0];
        char[] actual = ((char[]) getSoundexMappingMethod.invoke(soundex, getSoundexMappingMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Soundex.getMappingCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getMappingCode(java.lang.String, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return mappedChar;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.executesCondition {@code (index > 1): False}
 * @utbot.returnsFrom {@code return mappedChar;}
 *  */
    @Test
    public void testGetMappingCode_IndexLessOrEqual1() throws Exception  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {' '};
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = " A";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 1;
        char actual = ((Character) getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments));
        
        assertEquals(' ', actual);
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.executesCondition {@code (index > 1): True}
 * @utbot.executesCondition {@code (mappedChar != '0'): False}
 * @utbot.returnsFrom {@code return mappedChar;}
 *  */
    @Test
    public void testGetMappingCode_MappedCharEquals0() throws Exception  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {'0'};
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = "  A        ";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 2;
        char actual = ((Character) getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments));
        
        assertEquals('0', actual);
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.executesCondition {@code (index > 1): True}
 * @utbot.executesCondition {@code (mappedChar != '0'): True}
 * @utbot.executesCondition {@code ('H' == hwChar): False}
 * @utbot.executesCondition {@code ('W' == hwChar): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return mappedChar;}
 *  */
    @Test
    public void testGetMappingCode_WNotEqualsHwChar() throws Exception  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {' '};
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = "  A";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 2;
        char actual = ((Character) getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments));
        
        assertEquals(' ', actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getMappingCode(java.lang.String, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (index > 1): True},
    ///     {@code (mappedChar != '0'): True}
    /// invoke:
    ///     {@link java.lang.String#charAt(int)} once
    /// execute conditions:
    ///     {@code ('H' == hwChar): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.executesCondition {@code (firstCode == mappedChar): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetMappingCode_FirstCodeEqualsMappedChar() throws Exception  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {' '};
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = "AHA";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 2;
        char actual = ((Character) getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments));
        
        assertEquals('\u0000', actual);
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.executesCondition {@code (firstCode == mappedChar): False}
 * @utbot.executesCondition {@code ('H' == preHWChar): False}
 * @utbot.executesCondition {@code ('W' == preHWChar): False}
 * @utbot.returnsFrom {@code return mappedChar;}
 *  */
    @Test
    public void testGetMappingCode_WNotEqualsPreHWChar() throws Exception  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = new char[13];
        soundexMapping[0] = ' ';
        soundexMapping[1] = ' ';
        soundexMapping[2] = ' ';
        soundexMapping[3] = ' ';
        soundexMapping[4] = ' ';
        soundexMapping[5] = ' ';
        soundexMapping[6] = ' ';
        soundexMapping[7] = ' ';
        soundexMapping[8] = ' ';
        soundexMapping[9] = ' ';
        soundexMapping[10] = ' ';
        soundexMapping[11] = ' ';
        soundexMapping[12] = '\"';
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = "MHB";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 2;
        char actual = ((Character) getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments));
        
        assertEquals(' ', actual);
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.executesCondition {@code (firstCode == mappedChar): False}
 * @utbot.executesCondition {@code ('H' == preHWChar): False}
 * @utbot.executesCondition {@code ('W' == preHWChar): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetMappingCode_WEqualsPreHWChar() throws Exception  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = new char[31];
        soundexMapping[0] = ' ';
        soundexMapping[1] = ' ';
        soundexMapping[2] = ' ';
        soundexMapping[3] = ' ';
        soundexMapping[4] = ' ';
        soundexMapping[5] = ' ';
        soundexMapping[6] = ' ';
        soundexMapping[7] = ' ';
        soundexMapping[8] = ' ';
        soundexMapping[9] = ' ';
        soundexMapping[10] = ' ';
        soundexMapping[11] = '@';
        soundexMapping[12] = ' ';
        soundexMapping[13] = ' ';
        soundexMapping[14] = ' ';
        soundexMapping[15] = ' ';
        soundexMapping[16] = ' ';
        soundexMapping[17] = ' ';
        soundexMapping[18] = ' ';
        soundexMapping[19] = ' ';
        soundexMapping[20] = ' ';
        soundexMapping[21] = ' ';
        soundexMapping[22] = '!';
        soundexMapping[23] = ' ';
        soundexMapping[24] = ' ';
        soundexMapping[25] = ' ';
        soundexMapping[26] = ' ';
        soundexMapping[27] = ' ';
        soundexMapping[28] = ' ';
        soundexMapping[29] = ' ';
        soundexMapping[30] = ' ';
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = "WHA@          ";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 2;
        char actual = ((Character) getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments));
        
        assertEquals('\u0000', actual);
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.executesCondition {@code (firstCode == mappedChar): False}
 * @utbot.executesCondition {@code ('H' == preHWChar): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetMappingCode_HEqualsPreHWChar() throws Exception  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', '(',
            ' ', ' '
        };
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = "HHJ          ";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 2;
        char actual = ((Character) getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments));
        
        assertEquals('\u0000', actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMappingCode(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: final char mappedChar = this.map(str.charAt(index));
 *  */
    @Test
    public void testGetMappingCode_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Soundex soundex = new Soundex();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.Soundex.getMappingCode] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.codec.language.Soundex.getMappingCode(Soundex.java:185) */
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = -255;
        try {
            getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char mappedChar = this.map(str.charAt(index));
 *  */
    @Test
    public void testGetMappingCode_ThrowNullPointerException() throws Throwable  {
        Soundex soundex = new Soundex();
        
        /* This test fails because method [org.apache.commons.codec.language.Soundex.getMappingCode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.Soundex.getMappingCode(Soundex.java:185) */
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = ((Object) null);
        getMappingCodeMethodArguments[1] = -255;
        try {
            getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.Soundex#map(char)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char mappedChar = this.map(str.charAt(index));
 *  */
    @Test
    public void testGetMappingCode_ThrowNullPointerException_1() throws Throwable  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        String string = "A";
        
        /* This test fails because method [org.apache.commons.codec.language.Soundex.getMappingCode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.Soundex.map(Soundex.java:231)
            org.apache.commons.codec.language.Soundex.getMappingCode(Soundex.java:185) */
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 0;
        try {
            getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMappingCode(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final char mappedChar = this.map(str.charAt(index));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMappingCode_ThrowIllegalArgumentException() throws Throwable  {
        Soundex soundex = new Soundex();
        String string = "@";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 0;
        try {
            getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final char mappedChar = this.map(str.charAt(index));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMappingCode_ThrowIllegalArgumentException_1() throws Throwable  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {};
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = "A";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 0;
        try {
            getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.executesCondition {@code (index > 1): True}
 * @utbot.executesCondition {@code (mappedChar != '0'): True}
 * @utbot.executesCondition {@code ('H' == hwChar): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final char firstCode = this.map(preHWChar);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMappingCode_ThrowIllegalArgumentException_2() throws Throwable  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {' '};
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = "@HA";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 2;
        try {
            getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#getMappingCode(java.lang.String,int)}
 * @utbot.executesCondition {@code (index > 1): True}
 * @utbot.executesCondition {@code (mappedChar != '0'): True}
 * @utbot.executesCondition {@code ('H' == hwChar): False}
 * @utbot.executesCondition {@code ('W' == hwChar): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final char firstCode = this.map(preHWChar);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMappingCode_ThrowIllegalArgumentException_3() throws Throwable  {
        Soundex soundex = ((Soundex) createInstance("org.apache.commons.codec.language.Soundex"));
        char[] soundexMapping = {' '};
        setField(soundex, "org.apache.commons.codec.language.Soundex", "soundexMapping", soundexMapping);
        String string = "@WA";
        
        Class soundexClazz = Class.forName("org.apache.commons.codec.language.Soundex");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method getMappingCodeMethod = soundexClazz.getDeclaredMethod("getMappingCode", stringType, intType);
        getMappingCodeMethod.setAccessible(true);
        java.lang.Object[] getMappingCodeMethodArguments = new java.lang.Object[2];
        getMappingCodeMethodArguments[0] = string;
        getMappingCodeMethodArguments[1] = 2;
        try {
            getMappingCodeMethod.invoke(soundex, getMappingCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Soundex.setMaxLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxLength(int)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#setMaxLength(int)}
 *  */
    @Test
    public void testSetMaxLength() {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(-255);
        
        soundex.setMaxLength(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Soundex.soundex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method soundex(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#soundex(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSoundex_StrEqualsNull() {
        Soundex soundex = new Soundex();
        
        String actual = soundex.soundex(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Soundex}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#soundex(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.SoundexUtils#clean(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testSoundex_StrLengthEqualsZero() {
        Soundex soundex = new Soundex();
        String string = "";
        
        String actual = soundex.soundex(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method soundex(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Soundex}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#soundex(java.lang.String)}
     */
    @Test
    public void testSoundexWithNonEmptyString() {
        Soundex soundex = new Soundex("abc");
        soundex.setMaxLength(3);
        
        String actual = soundex.soundex("10");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Soundex}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Soundex#soundex(java.lang.String)}
     */
    @Test
    public void testSoundexWithNonEmptyString1() {
        Soundex soundex = new Soundex("#$\\\"'");
        soundex.setMaxLength(Integer.MIN_VALUE);
        
        String actual = soundex.soundex("abc");
        
        String expected = "A$\\0";
        
        assertEquals(expected, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields876717987847900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields876717987847900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass876717987854300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876717987847900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876717987854300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

