package com.google.javascript.rhino;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_rhino_TokenStreamTest {
    ///region Test suites for executable com.google.javascript.rhino.TokenStream.isKeyword
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isKeyword(java.lang.String)
    /// Actual number of generated tests (51) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase6() {
        String string = " a    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'd'): False}
 * @utbot.executesCondition {@code (c == 'r'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsR() {
        String string = " e    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'i'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsI() {
        String string = "i        ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'f'): False}
 * @utbot.executesCondition {@code (c == 's'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsS() {
        String string = "  o  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase5() {
        String string = "  l  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase5_1() {
        String string = "  t  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'm'): False}
 * @utbot.executesCondition {@code (c == 'n'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsN() {
        String string = " n        ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'i'): False}
 * @utbot.executesCondition {@code (c == 'p'): False}
 * @utbot.executesCondition {@code (c == 't'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsT() {
        String string = "         ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault() {
        String string = " e     ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'd'): False}
 * @utbot.executesCondition {@code (c == 'r'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsR() {
        String string = "re    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase6_1() {
        String string = " o    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_1() {
        String string = " o     ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase6_2() {
        String string = " u    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_2() {
        String string = " a     ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_3() {
        String string = " i     ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'f'): True}
 * @utbot.executesCondition {@code (s.charAt(0) == 'i'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsI() {
        String string = "if";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'f'): True}
 * @utbot.executesCondition {@code (s.charAt(0) == 'i'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsI() {
        String string = " f";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'c'): False}
 * @utbot.executesCondition {@code (c == 'f'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsF() {
        String string = "  n  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_null() {
        String string = "            ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_4() {
        String string = " x     ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_NotXEquals() {
        String string = "l   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase6_3() {
        String string = " x    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_5() {
        String string = "v       ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase5_2() {
        String string = "  a  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase6_4() {
        String string = " h    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase6_5() {
        String string = " m    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'i'): False}
 * @utbot.executesCondition {@code (c == 'p'): False}
 * @utbot.executesCondition {@code (c == 't'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsT() {
        String string = "t        ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_6() {
        String string = "d       ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_7() {
        String string = "a       ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'i'): False}
 * @utbot.executesCondition {@code (c == 'p'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsP() {
        String string = "p        ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_8() {
        String string = "c       ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase5_3() {
        String string = "  p  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase5_4() {
        String string = "  r  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase4() {
        String string = "w   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase6_6() {
        String string = " y    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase6_7() {
        String string = " w    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase5_5() {
        String string = "  i  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_9() {
        String string = " r     ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase4_1() {
        String string = "n   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase4_2() {
        String string = "g   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase6_8() {
        String string = " t    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase5_6() {
        String string = "  e  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'f'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsF() {
        String string = "f o  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase4_3() {
        String string = "b   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCase4_4() {
        String string = "v   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'c'): False}
 * @utbot.executesCondition {@code (c == 'f'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsF_1() {
        String string = "f n  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'm'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsM() {
        String string = " m        ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'f'): False}
 * @utbot.executesCondition {@code (c == 's'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsS() {
        String string = "s o  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_10() {
        String string = "f       ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'd'): True}
 * @utbot.executesCondition {@code (X != null): True}
 * @utbot.executesCondition {@code (X != s): True}
 * @utbot.executesCondition {@code (!X.equals(s)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsKeyword_CEqualsD() {
        String string = "de    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isKeyword(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return id;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_StringCharAt() {
        String string = "k   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_StringCharAt_1() {
        String string = " p    ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_StringCharAt_2() {
        String string = "        ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SwitchSLengthCasedefault_11() {
        String string = "   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_StringCharAt_3() {
        String string = "  d  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_null_1() {
        String string = "           ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'm'): False}
 * @utbot.executesCondition {@code (c == 'n'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsN() {
        String string = "          ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 't'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsT() {
        String string = "i  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_StringCharAt_4() {
        String string = "       ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'w'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsW() {
        String string = "n  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'y'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsY() {
        String string = "t  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'r'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsR() {
        String string = "v  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'r'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsR_1() {
        String string = "f  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 't'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'n'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsN() {
        String string = "int";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 't'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'n'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsN() {
        String string = "i t";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'w'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'e'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsE() {
        String string = "new";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'w'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'e'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsE() {
        String string = "n w";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'y'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'r'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsR_2() {
        String string = "t y";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'y'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'r'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsR() {
        String string = "try";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'r'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'a'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsA() {
        String string = "v r";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'r'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'a'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsA() {
        String string = "var";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'r'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'o'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsO() {
        String string = "f r";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (s.charAt(2) == 'r'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'o'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsO() {
        String string = "for";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method isKeyword(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#charAt(int)} twice
    /// return from: {@code return id;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 'r'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsR_1() {
        String string = "c   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): True}
 * @utbot.executesCondition {@code (c == 'r'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsR_2() {
        String string = "c  e";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 'r'): True}
 * @utbot.executesCondition {@code (s.charAt(2) == 'a'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsA_1() {
        String string = "c  r";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 'r'): True}
 * @utbot.executesCondition {@code (s.charAt(2) == 'a'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'h'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsH() {
        String string = "c ar";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 'r'): True}
 * @utbot.executesCondition {@code (s.charAt(2) == 'a'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'h'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsH() {
        String string = "char";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): True}
 * @utbot.executesCondition {@code (c == 'r'): True}
 * @utbot.executesCondition {@code (if (c == 'e') {
 *     if (s.charAt(2) == 's' && s.charAt(1) == 'a') {
 *         id = true;
 *         break complete;
 *     }
 * } else if (c == 'r') {
 *     if (s.charAt(2) == 'a' && s.charAt(1) == 'h') {
 *         id = true;
 *         break complete;
 *     }
 * }): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsE() {
        String string = "c se";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): True}
 * @utbot.executesCondition {@code (c == 'r'): True}
 * @utbot.executesCondition {@code (if (c == 'e') {
 *     if (s.charAt(2) == 's' && s.charAt(1) == 'a') {
 *         id = true;
 *         break complete;
 *     }
 * } else if (c == 'r') {
 *     if (s.charAt(2) == 'a' && s.charAt(1) == 'h') {
 *         id = true;
 *         break complete;
 *     }
 * }): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CEqualsE() {
        String string = "case";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #3 for method isKeyword(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#charAt(int)} once
    /// execute conditions:
    ///     {@code (c == 'f'): False}
    /// return from: {@code return id;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'n'): False}
 * @utbot.executesCondition {@code (c == 'o'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsO() {
        String string = "  ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'n'): True}
 * @utbot.executesCondition {@code (if (s.charAt(0) == 'i') {
 *     id = true;
 *     break complete;
 * }): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsI_1() {
        String string = " n";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'n'): True}
 * @utbot.executesCondition {@code (if (s.charAt(0) == 'i') {
 *     id = true;
 *     break complete;
 * }): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsI_1() {
        String string = "in";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'n'): False}
 * @utbot.executesCondition {@code (c == 'o'): True}
 * @utbot.executesCondition {@code (s.charAt(0) == 'd'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsD() {
        String string = "do";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'n'): False}
 * @utbot.executesCondition {@code (c == 'o'): True}
 * @utbot.executesCondition {@code (s.charAt(0) == 'd'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsD() {
        String string = " o";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #4 for method isKeyword(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#charAt(int)} twice
    /// return from: {@code return id;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 's'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsS_1() {
        String string = "t   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 's'): True}
 * @utbot.executesCondition {@code (s.charAt(2) == 'i'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsI_2() {
        String string = "t  s";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 's'): True}
 * @utbot.executesCondition {@code (s.charAt(2) == 'i'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'h'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsH_1() {
        String string = "t is";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 's'): True}
 * @utbot.executesCondition {@code (s.charAt(2) == 'i'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'h'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsH_1() {
        String string = "this";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): True}
 * @utbot.executesCondition {@code (c == 's'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsS_2() {
        String string = "t  e";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): True}
 * @utbot.executesCondition {@code (c == 's'): True}
 * @utbot.executesCondition {@code (if (c == 'e') {
 *     if (s.charAt(2) == 'u' && s.charAt(1) == 'r') {
 *         id = true;
 *         break complete;
 *     }
 * } else if (c == 's') {
 *     if (s.charAt(2) == 'i' && s.charAt(1) == 'h') {
 *         id = true;
 *         break complete;
 *     }
 * }): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsE_1() {
        String string = "t ue";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): True}
 * @utbot.executesCondition {@code (c == 's'): True}
 * @utbot.executesCondition {@code (if (c == 'e') {
 *     if (s.charAt(2) == 'u' && s.charAt(1) == 'r') {
 *         id = true;
 *         break complete;
 *     }
 * } else if (c == 's') {
 *     if (s.charAt(2) == 'i' && s.charAt(1) == 'h') {
 *         id = true;
 *         break complete;
 *     }
 * }): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CEqualsE_1() {
        String string = "true";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #5 for method isKeyword(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#charAt(int)} twice
    /// return from: {@code return id;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 'm'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsM() {
        String string = "e   ";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): True}
 * @utbot.executesCondition {@code (c == 'm'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsM_1() {
        String string = "e  e";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 'm'): True}
 * @utbot.executesCondition {@code (s.charAt(2) == 'u'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsU() {
        String string = "e  m";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 'm'): True}
 * @utbot.executesCondition {@code (s.charAt(2) == 'u'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'n'): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtNotEqualsN_1() {
        String string = "e um";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): False}
 * @utbot.executesCondition {@code (c == 'm'): True}
 * @utbot.executesCondition {@code (s.charAt(2) == 'u'): True}
 * @utbot.executesCondition {@code (s.charAt(1) == 'n'): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_SCharAtEqualsN_1() {
        String string = "enum";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): True}
 * @utbot.executesCondition {@code (c == 'm'): True}
 * @utbot.executesCondition {@code (if (c == 'e') {
 *     if (s.charAt(2) == 's' && s.charAt(1) == 'l') {
 *         id = true;
 *         break complete;
 *     }
 * } else if (c == 'm') {
 *     if (s.charAt(2) == 'u' && s.charAt(1) == 'n') {
 *         id = true;
 *         break complete;
 *     }
 * }): True}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CEqualsE_2() {
        String string = "else";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.executesCondition {@code (c == 'e'): True}
 * @utbot.executesCondition {@code (c == 'm'): True}
 * @utbot.executesCondition {@code (if (c == 'e') {
 *     if (s.charAt(2) == 's' && s.charAt(1) == 'l') {
 *         id = true;
 *         break complete;
 *     }
 * } else if (c == 'm') {
 *     if (s.charAt(2) == 'u' && s.charAt(1) == 'n') {
 *         id = true;
 *         break complete;
 *     }
 * }): False}
 * @utbot.executesCondition {@code (X != null): False}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testIsKeyword_CNotEqualsE_2() {
        String string = "e se";
        
        boolean actual = TokenStream.isKeyword(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isKeyword(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: partial: switch(s.length()) {
 *     case 2:
 *         c = s.charAt(1);
 *         if (c == 'f') {
 *             if (s.charAt(0) == 'i') {
 *                 id = true;
 *                 break complete;
 *             }
 *         } else if (c == 'n') {
 *             if (s.charAt(0) == 'i') {
 *                 id = true;
 *                 break complete;
 *             }
 *         } else if (c == 'o') {
 *             if (s.charAt(0) == 'd') {
 *                 id = true;
 *                 break complete;
 *             }
 *         }
 *         break partial;
 *     case 3:
 *         switch(s.charAt(0)) {
 *             case 'f':
 *                 if (s.charAt(2) == 'r' && s.charAt(1) == 'o') {
 *                     id = true;
 *                     break complete;
 *                 }
 *                 break partial;
 *             case 'i':
 *                 if (s.charAt(2) == 't' && s.charAt(1) == 'n') {
 *                     id = true;
 *                     break complete;
 *                 }
 *                 break partial;
 *             case 'n':
 *                 if (s.charAt(2) == 'w' && s.charAt(1) == 'e') {
 *                     id = true;
 *                     break complete;
 *                 }
 *                 break partial;
 *             case 't':
 *                 if (s.charAt(2) == 'y' && s.charAt(1) == 'r') {
 *                     id = true;
 *                     break complete;
 *                 }
 *                 break partial;
 *             case 'v':
 *                 if (s.charAt(2) == 'r' && s.charAt(1) == 'a') {
 *                     id = true;
 *                     break complete;
 *                 }
 *                 break partial;
 *         }
 *         break partial;
 *     case 4:
 *         switch(s.charAt(0)) {
 *             case 'b':
 *                 X = "byte";
 *                 id = true;
 *                 break partial;
 *             case 'c':
 *                 c = s.charAt(3);
 *                 if (c == 'e') {
 *                     if (s.charAt(2) == 's' && s.charAt(1) == 'a') {
 *                         id = true;
 *                         break complete;
 *                     }
 *                 } else if (c == 'r') {
 *                     if (s.charAt(2) == 'a' && s.charAt(1) == 'h') {
 *                         id = true;
 *                         break complete;
 *                     }
 *                 }
 *                 break partial;
 *             case 'e':
 *                 c = s.charAt(3);
 *                 if (c == 'e') {
 *                     if (s.charAt(2) == 's' && s.charAt(1) == 'l') {
 *                         id = true;
 *                         break complete;
 *                     }
 *                 } else if (c == 'm') {
 *                     if (s.charAt(2) == 'u' && s.charAt(1) == 'n') {
 *                         id = true;
 *                         break complete;
 *                     }
 *                 }
 *                 break partial;
 *             case 'g':
 *                 X = "goto";
 *                 id = true;
 *                 break partial;
 *             case 'l':
 *                 X = "long";
 *                 id = true;
 *                 break partial;
 *             case 'n':
 *                 X = "null";
 *                 id = true;
 *                 break partial;
 *             case 't':
 *                 c = s.charAt(3);
 *                 if (c == 'e') {
 *                     if (s.charAt(2) == 'u' && s.charAt(1) == 'r') {
 *                         id = true;
 *                         break complete;
 *                     }
 *                 } else if (c == 's') {
 *                     if (s.charAt(2) == 'i' && s.charAt(1) == 'h') {
 *                         id = true;
 *                         break complete;
 *                     }
 *                 }
 *                 break partial;
 *             case 'v':
 *                 X = "void";
 *                 id = true;
 *                 break partial;
 *             case 'w':
 *                 X = "with";
 *                 id = true;
 *                 break partial;
 *         }
 *         break partial;
 *     case 5:
 *         switch(s.charAt(2)) {
 *             case 'a':
 *                 X = "class";
 *                 id = true;
 *                 break partial;
 *             case 'e':
 *                 X = "break";
 *                 id = true;
 *                 break partial;
 *             case 'i':
 *                 X = "while";
 *                 id = true;
 *                 break partial;
 *             case 'l':
 *                 X = "false";
 *                 id = true;
 *                 break partial;
 *             case 'n':
 *                 c = s.charAt(0);
 *                 if (c == 'c') {
 *                     X = "const";
 *                     id = true;
 *                 } else if (c == 'f') {
 *                     X = "final";
 *                     id = true;
 *                 }
 *                 break partial;
 *             case 'o':
 *                 c = s.charAt(0);
 *                 if (c == 'f') {
 *                     X = "float";
 *                     id = true;
 *                 } else if (c == 's') {
 *                     X = "short";
 *                     id = true;
 *                 }
 *                 break partial;
 *             case 'p':
 *                 X = "super";
 *                 id = true;
 *                 break partial;
 *             case 'r':
 *                 X = "throw";
 *                 id = true;
 *                 break partial;
 *             case 't':
 *                 X = "catch";
 *                 id = true;
 *                 break partial;
 *         }
 *         break partial;
 *     case 6:
 *         switch(s.charAt(1)) {
 *             case 'a':
 *                 X = "native";
 *                 id = true;
 *                 break partial;
 *             case 'e':
 *                 c = s.charAt(0);
 *                 if (c == 'd') {
 *                     X = "delete";
 *                     id = true;
 *                 } else if (c == 'r') {
 *                     X = "return";
 *                     id = true;
 *                 }
 *                 break partial;
 *             case 'h':
 *                 X = "throws";
 *                 id = true;
 *                 break partial;
 *             case 'm':
 *                 X = "import";
 *                 id = true;
 *                 break partial;
 *             case 'o':
 *                 X = "double";
 *                 id = true;
 *                 break partial;
 *             case 't':
 *                 X = "static";
 *                 id = true;
 *                 break partial;
 *             case 'u':
 *                 X = "public";
 *                 id = true;
 *                 break partial;
 *             case 'w':
 *                 X = "switch";
 *                 id = true;
 *                 break partial;
 *             case 'x':
 *                 X = "export";
 *                 id = true;
 *                 break partial;
 *             case 'y':
 *                 X = "typeof";
 *                 id = true;
 *                 break partial;
 *         }
 *         break partial;
 *     case 7:
 *         switch(s.charAt(1)) {
 *             case 'a':
 *                 X = "package";
 *                 id = true;
 *                 break partial;
 *             case 'e':
 *                 X = "default";
 *                 id = true;
 *                 break partial;
 *             case 'i':
 *                 X = "finally";
 *                 id = true;
 *                 break partial;
 *             case 'o':
 *                 X = "boolean";
 *                 id = true;
 *                 break partial;
 *             case 'r':
 *                 X = "private";
 *                 id = true;
 *                 break partial;
 *             case 'x':
 *                 X = "extends";
 *                 id = true;
 *                 break partial;
 *         }
 *         break partial;
 *     case 8:
 *         switch(s.charAt(0)) {
 *             case 'a':
 *                 X = "abstract";
 *                 id = true;
 *                 break partial;
 *             case 'c':
 *                 X = "continue";
 *                 id = true;
 *                 break partial;
 *             case 'd':
 *                 X = "debugger";
 *                 id = true;
 *                 break partial;
 *             case 'f':
 *                 X = "function";
 *                 id = true;
 *                 break partial;
 *             case 'v':
 *                 X = "volatile";
 *                 id = true;
 *                 break partial;
 *         }
 *         break partial;
 *     case 9:
 *         c = s.charAt(0);
 *         if (c == 'i') {
 *             X = "interface";
 *             id = true;
 *         } else if (c == 'p') {
 *             X = "protected";
 *             id = true;
 *         } else if (c == 't') {
 *             X = "transient";
 *             id = true;
 *         }
 *         break partial;
 *     case 10:
 *         c = s.charAt(1);
 *         if (c == 'm') {
 *             X = "implements";
 *             id = true;
 *         } else if (c == 'n') {
 *             X = "instanceof";
 *             id = true;
 *         }
 *         break partial;
 *     case 12:
 *         X = "synchronized";
 *         id = true;
 *         break partial;
 * }
 *  */
    @Test
    public void testIsKeyword_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.TokenStream.isKeyword] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.TokenStream.isKeyword(TokenStream.java:63) */
        TokenStream.isKeyword(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isKeyword(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.TokenStream}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
     */
    @Test
    public void testIsKeywordReturnsTrueWithNonEmptyString() {
        boolean actual = TokenStream.isKeyword("goto");
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.TokenStream}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isKeyword(java.lang.String)}
     */
    @Test
    public void testIsKeywordReturnsTrueWithNonEmptyString1() {
        boolean actual = TokenStream.isKeyword("instanceof");
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.TokenStream.isJSIdentifier
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isJSIdentifier(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isJSIdentifier(java.lang.String)}
 * @utbot.executesCondition {@code (length == 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testIsJSIdentifier_LengthEqualsZero() {
        String string = "";
        
        boolean actual = TokenStream.isJSIdentifier(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isJSIdentifier(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenStream}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isJSIdentifier(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int length = s.length();
 *  */
    @Test
    public void testIsJSIdentifier_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.TokenStream.isJSIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.TokenStream.isJSIdentifier(TokenStream.java:191) */
        TokenStream.isJSIdentifier(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isJSIdentifier(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.TokenStream}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isJSIdentifier(java.lang.String)}
     */
    @Test
    public void testIsJSIdentifierReturnsFalseWithNonEmptyString() {
        boolean actual = TokenStream.isJSIdentifier("\u0014\n\t\r");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.TokenStream}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isJSIdentifier(java.lang.String)}
     */
    @Test
    public void testIsJSIdentifierReturnsTrueWithNonEmptyString() {
        boolean actual = TokenStream.isJSIdentifier("acb");
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.TokenStream}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isJSIdentifier(java.lang.String)}
     */
    @Test
    public void testIsJSIdentifierReturnsFalseWithNonEmptyString1() {
        boolean actual = TokenStream.isJSIdentifier("ab?5uc");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.TokenStream}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isJSIdentifier(java.lang.String)}
     */
    @Test
    public void testIsJSIdentifierReturnsFalseWithNonEmptyString2() {
        boolean actual = TokenStream.isJSIdentifier("b?u5ca");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.TokenStream}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.TokenStream#isJSIdentifier(java.lang.String)}
     */
    @Test
    public void testIsJSIdentifierReturnsTrueWithNonEmptyString1() {
        boolean actual = TokenStream.isJSIdentifier("K");
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
}

