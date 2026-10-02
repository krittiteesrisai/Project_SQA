package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import sun.nio.cs.SingleByte.Encoder;
import sun.nio.cs.SingleByte;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_jsoup_nodes_EntitiesTest {
    ///region Test suites for executable org.jsoup.nodes.Entities.escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escape(java.lang.String, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.returnsFrom {@code return escape(string, out.encoder(), out.escapeMode());}
 *  */
    @Test
    public void testEscape_ReturnEscape() throws Exception  {
        String string = "";
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.xhtml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        
        String actual = Entities.escape(string, outputSettings);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.returnsFrom {@code return escape(string, out.encoder(), out.escapeMode());}
 *  */
    @Test
    public void testEscape_ReturnEscape_1() throws Exception  {
        String string = "\u0000";
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.xhtml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        SingleByte.Encoder charsetEncoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        char[] c2bIndex = {'\u0000'};
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        
        String actual = Entities.escape(string, outputSettings);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return escape(string, out.encoder(), out.escapeMode());
 *  */
    @Test
    public void testEscape_ThrowIndexOutOfBoundsException() throws Exception  {
        String string = "@";
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.xhtml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        SingleByte.Encoder charsetEncoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC0'};
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Entities.escape(string, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return escape(string, out.encoder(), out.escapeMode());
 *  */
    @Test
    public void testEscape_ThrowIndexOutOfBoundsException_1() throws Exception  {
        String string = " ";
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.xhtml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        SingleByte.Encoder charsetEncoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Entities.escape(string, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return escape(string, out.encoder(), out.escapeMode());
 *  */
    @Test
    public void testEscape_ThrowIndexOutOfBoundsException_2() throws Exception  {
        String string = "@";
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.xhtml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        SingleByte.Encoder charsetEncoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC0'};
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Entities.escape(string, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return escape(string, out.encoder(), out.escapeMode());
 *  */
    @Test
    public void testEscape_ThrowIndexOutOfBoundsException_3() throws Exception  {
        String string = "";
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.xhtml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        SingleByte.Encoder charsetEncoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Entities.escape(string, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return escape(string, out.encoder(), out.escapeMode());
 *  */
    @Test
    public void testEscape_ThrowIndexOutOfBoundsException_4() throws Exception  {
        String string = "";
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.xhtml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        SingleByte.Encoder charsetEncoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Entities.escape(string, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return escape(string, out.encoder(), out.escapeMode());
 *  */
    @Test
    public void testEscape_ThrowIndexOutOfBoundsException_5() throws Exception  {
        String string = "@";
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.xhtml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        SingleByte.Encoder charsetEncoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC0'};
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(charsetEncoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Entities.escape(string, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return escape(string, out.encoder(), out.escapeMode());
 *  */
    @Test
    public void testEscape_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:41) */
        Entities.escape(null, null);
    }
    ///endregion
    
    ///region Errors report for escape
    
    public void testEscape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities$EscapeMode)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link org.jsoup.nodes.Entities.EscapeMode#getMap()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return accum.toString();}
 *  */
    @Test
    public void testEscape_StringBuilderToString() {
        String string = "";
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        String actual = Entities.escape(string, null, escapeMode);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities$EscapeMode)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
 * @utbot.iterates iterate the loop {@code for(int pos = 0; pos < string.length(); pos++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: encoder.canEncode(c)
 *  */
    @Test
    public void testEscape_ThrowIndexOutOfBoundsException1() throws Exception  {
        String string = " ";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Entities.escape(string, encoder, escapeMode);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
 * @utbot.iterates iterate the loop {@code for(int pos = 0; pos < string.length(); pos++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: encoder.canEncode(c)
 *  */
    @Test
    public void testEscape_ThrowIndexOutOfBoundsException_11() throws Exception  {
        String string = "@";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC0'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Entities.escape(string, encoder, escapeMode);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
 * @utbot.iterates iterate the loop {@code for(int pos = 0; pos < string.length(); pos++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: map.containsKey(c)
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_1() {
        String string = " ";
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:52) */
        Entities.escape(string, null, escapeMode);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Map<Character, String> map = escapeMode.getMap();
 *  */
    @Test
    public void testEscape_ThrowNullPointerException1() {
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:46) */
        Entities.escape(string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StringBuilder accum = new StringBuilder(string.length() * 2);
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_2() {
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:45) */
        Entities.escape(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities$EscapeMode)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeWithNonEmptyString() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        String actual = Entities.escape("#", null, escapeMode);
        
        String expected = "&num;";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeWithNonEmptyString1() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        String actual = Entities.escape("#$\"\\'", null, escapeMode);
        
        String expected = "&num;&dollar;&quot;&bsol;&apos;";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeWithNonEmptyString2() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        String actual = Entities.escape("\"$\\", null, escapeMode);
        
        String expected = "&quot;&dollar;&bsol;";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeWithNonEmptyString3() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        String actual = Entities.escape("$\\", null, escapeMode);
        
        String expected = "&dollar;&bsol;";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities$EscapeMode)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeThrowsNPEWithNonEmptyString() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:52) */
        Entities.escape("#W", null, escapeMode);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeThrowsNPEWithNonEmptyString1() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:52) */
        Entities.escape("'\"$#\\\uFFF8", null, escapeMode);
    }
    ///endregion
    
    ///region Errors report for escape
    
    public void testEscape_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.unescape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#unescape(java.lang.String)}
 * @utbot.executesCondition {@code (!string.contains("&")): True}
 * @utbot.invokes {@link java.lang.String#contains(java.lang.CharSequence)}
 * @utbot.returnsFrom {@code return string;}
 *  */
    @Test
    public void testUnescape_NotStringContains() {
        String string = "";
        
        String actual = Entities.unescape(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#unescape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#contains(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !string.contains("&")
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.nodes.Entities.unescape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.unescape(Entities.java:62) */
        Entities.unescape(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unescape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#unescape(java.lang.String)}
     */
    @Test
    public void testUnescapeWithNonEmptyString() {
        String actual = Entities.unescape("&");
        
        String expected = "&";
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields993472543272400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields993472543272400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass993472543277800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields993472543272400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass993472543277800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

