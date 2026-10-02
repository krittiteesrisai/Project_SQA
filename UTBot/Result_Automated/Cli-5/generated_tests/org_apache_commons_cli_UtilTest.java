package org.apache.commons.cli;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_cli_UtilTest {
    ///region Test suites for executable org.apache.commons.cli.Util.stripLeadingHyphens
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stripLeadingHyphens(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Util}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Util#stripLeadingHyphens(java.lang.String)}
 * @utbot.executesCondition {@code (str.startsWith("--")): False}
 * @utbot.executesCondition {@code (str.startsWith("-")): False}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testStripLeadingHyphens_NotStrStartsWith() {
        String string = "";
        
        String actual = Util.stripLeadingHyphens(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Util}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Util#stripLeadingHyphens(java.lang.String)}
 * @utbot.executesCondition {@code (str.startsWith("--")): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return str.substring(2, str.length());}
 *  */
    @Test
    public void testStripLeadingHyphens_StrStartsWith() {
        String string = "--";
        
        String actual = Util.stripLeadingHyphens(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Util}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Util#stripLeadingHyphens(java.lang.String)}
 * @utbot.executesCondition {@code (str.startsWith("--")): False}
 * @utbot.executesCondition {@code (str.startsWith("-")): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return str.substring(1, str.length());}
 *  */
    @Test
    public void testStripLeadingHyphens_StrStartsWith_1() {
        String string = "-";
        
        String actual = Util.stripLeadingHyphens(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stripLeadingHyphens(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Util}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Util#stripLeadingHyphens(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: str.startsWith("--")
 *  */
    @Test
    public void testStripLeadingHyphens_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.cli.Util.stripLeadingHyphens] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Util.stripLeadingHyphens(Util.java:36) */
        Util.stripLeadingHyphens(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stripLeadingAndTrailingQuotes(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Util}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Util#stripLeadingAndTrailingQuotes(java.lang.String)}
 * @utbot.executesCondition {@code (str.startsWith("\"")): False}
 * @utbot.executesCondition {@code (str.endsWith("\"")): False}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testStripLeadingAndTrailingQuotes_NotStrEndsWith() {
        String string = "";
        
        String actual = Util.stripLeadingAndTrailingQuotes(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Util}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Util#stripLeadingAndTrailingQuotes(java.lang.String)}
 * @utbot.executesCondition {@code (str.startsWith("\"")): True}
 * @utbot.executesCondition {@code (str.endsWith("\"")): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testStripLeadingAndTrailingQuotes_StrStartsWith() {
        String string = "\"";
        
        String actual = Util.stripLeadingAndTrailingQuotes(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Util}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Util#stripLeadingAndTrailingQuotes(java.lang.String)}
 * @utbot.executesCondition {@code (str.startsWith("\"")): False}
 * @utbot.executesCondition {@code (str.endsWith("\"")): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testStripLeadingAndTrailingQuotes_StrEndsWith() {
        String string = " \"";
        
        String actual = Util.stripLeadingAndTrailingQuotes(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stripLeadingAndTrailingQuotes(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Util}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Util#stripLeadingAndTrailingQuotes(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: str.startsWith("\"")
 *  */
    @Test
    public void testStripLeadingAndTrailingQuotes_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Util.java:59) */
        Util.stripLeadingAndTrailingQuotes(null);
    }
    ///endregion
    
    ///endregion
}

