package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Entities.EscapeMode;

import static org.junit.Assert.assertEquals;

public final class org_jsoup_nodes_EntitiesTest {
    ///region Test suites for executable org.jsoup.nodes.Entities.escape
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#encoder()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return escape(string, out.encoder(), out.escapeMode());
 *  */
    @Test
    public void testEscape_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:27) */
        Entities.escape(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.escape
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities$EscapeMode)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StringBuilder accum = new StringBuilder(string.length() * 2);
 *  */
    @Test
    public void testEscape_ThrowNullPointerException1() {
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:31) */
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
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities$EscapeMode)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeThrowsNPEWithNonEmptyString() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:38) */
        Entities.escape("X\u001FZ", null, escapeMode);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeThrowsNPEWithNonEmptyString1() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:38) */
        Entities.escape("&#P", null, escapeMode);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeThrowsNPEWithNonEmptyString2() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:38) */
        Entities.escape("#\uFFE5", null, escapeMode);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Entities}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.String,java.nio.charset.CharsetEncoder,org.jsoup.nodes.Entities.EscapeMode)}
     */
    @Test
    public void testEscapeThrowsNPEWithNonEmptyString3() {
        Entities.EscapeMode escapeMode = Entities.EscapeMode.extended;
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:38) */
        Entities.escape("P\u0084#&", null, escapeMode);
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
            org.jsoup.nodes.Entities.unescape(Entities.java:48) */
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
}

