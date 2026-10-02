package org.apache.commons.cli;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.text.RuleBasedCollator;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_cli_HelpFormatterTest {
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.setNewLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNewLine(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setNewLine(java.lang.String)}
 *  */
    @Test
    public void testSetNewLine() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        helpFormatter.setNewLine(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printHelp
    
    ///region Errors report for printHelp
    
    public void testPrintHelp_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.nio.charset.Charset java.nio.charset.Charset.defaultCharset accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printHelp
    
    ///region Errors report for printHelp
    
    public void testPrintHelp_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.nio.charset.Charset java.nio.charset.Charset.defaultCharset accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printHelp
    
    ///region Errors report for printHelp
    
    public void testPrintHelp_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.nio.charset.Charset java.nio.charset.Charset.defaultCharset accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printHelp
    
    ///region Errors report for printHelp
    
    public void testPrintHelp_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.nio.charset.Charset java.nio.charset.Charset.defaultCharset accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printHelp
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printHelp(java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_ThrowIllegalArgumentException() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "";
        
        helpFormatter.printHelp(null, -255, string, null, null, -255, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printHelp(java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_ThrowIllegalArgumentException_1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        helpFormatter.printHelp(null, -255, null, null, null, -255, -255, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)
    
    @Test
    public void testPrintHelp1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printHelp] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 7]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706)
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:656)
            org.apache.commons.cli.HelpFormatter.printHelp(HelpFormatter.java:485)
            org.apache.commons.cli.HelpFormatter.printHelp(HelpFormatter.java:448) */
        helpFormatter.printHelp(null, 0, string, null, null, 0, 0, null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)
    
    @Test(timeout = 1000L)
    public void testPrintHelp2() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        String string = "\u0000\u0000 ";
        String string1 = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        helpFormatter.printHelp(null, 0, string, string1, null, 0, 0, null);
    }
    
    @Test(timeout = 1000L)
    public void testPrintHelp3() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        String string = "\u0000\u0000\u0000\u0000\u0000 \u0000";
        String string1 = "";
        Options options = new Options();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        helpFormatter.printHelp(null, 0, string, string1, options, 0, 0, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printHelp
    
    ///region Errors report for printHelp
    
    public void testPrintHelp_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.nio.charset.Charset java.nio.charset.Charset.defaultCharset accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printHelp
    
    ///region Errors report for printHelp
    
    public void testPrintHelp_errors5()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.nio.charset.Charset java.nio.charset.Charset.defaultCharset accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printHelp
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printHelp(java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (cmdLineSyntax == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (cmdLineSyntax == null) || (cmdLineSyntax.length() == 0)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_ThrowIllegalArgumentException1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        helpFormatter.printHelp(null, -255, null, null, null, -255, -255, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printHelp(java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (cmdLineSyntax == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (cmdLineSyntax == null) || (cmdLineSyntax.length() == 0)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_ThrowIllegalArgumentException_11() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "";
        
        helpFormatter.printHelp(null, -255, string, null, null, -255, -255, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)
    
    @Test
    public void testPrintHelp4() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "!!";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printHelp] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706)
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:656)
            org.apache.commons.cli.HelpFormatter.printHelp(HelpFormatter.java:485) */
        helpFormatter.printHelp(null, -255, defaultSyntaxPrefix, defaultSyntaxPrefix, null, -255, -255, defaultSyntaxPrefix, false);
    }
    
    @Test
    public void testPrintHelp5() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        String string = "         ";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printHelp] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:523)
            org.apache.commons.cli.HelpFormatter.printHelp(HelpFormatter.java:481) */
        helpFormatter.printHelp(null, -255, string, defaultSyntaxPrefix, null, -255, -255, string, true);
    }
    
    @Test
    public void testPrintHelp6() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = " ";
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printHelp] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:105)
            java.base/java.lang.StringBuffer.<init>(StringBuffer.java:158)
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:514)
            org.apache.commons.cli.HelpFormatter.printHelp(HelpFormatter.java:481) */
        helpFormatter.printHelp(null, -255, string, string, options, -255, -255, string, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.getWidth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWidth()
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#getWidth()}
 * @utbot.returnsFrom {@code return this.defaultWidth;}
 *  */
    @Test
    public void testGetWidth_ReturnThisDefaultWidth() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        helpFormatter.defaultWidth = -255;
        
        int actual = helpFormatter.getWidth();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.getLongOptPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLongOptPrefix()
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#getLongOptPrefix()}
 * @utbot.returnsFrom {@code return this.defaultLongOptPrefix;}
 *  */
    @Test
    public void testGetLongOptPrefix_ReturnThisDefaultLongOptPrefix() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        String actual = helpFormatter.getLongOptPrefix();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.getLeftPadding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLeftPadding()
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#getLeftPadding()}
 * @utbot.returnsFrom {@code return this.defaultLeftPad;}
 *  */
    @Test
    public void testGetLeftPadding_ReturnThisDefaultLeftPad() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        helpFormatter.defaultLeftPad = -255;
        
        int actual = helpFormatter.getLeftPadding();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.setLeftPadding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLeftPadding(int)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setLeftPadding(int)}
 *  */
    @Test
    public void testSetLeftPadding() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        helpFormatter.defaultLeftPad = -255;
        
        helpFormatter.setLeftPadding(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.getArgName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArgName()
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#getArgName()}
 * @utbot.returnsFrom {@code return this.defaultArgName;}
 *  */
    @Test
    public void testGetArgName_ReturnThisDefaultArgName() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        String actual = helpFormatter.getArgName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.getSyntaxPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSyntaxPrefix()
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#getSyntaxPrefix()}
 * @utbot.returnsFrom {@code return this.defaultSyntaxPrefix;}
 *  */
    @Test
    public void testGetSyntaxPrefix_ReturnThisDefaultSyntaxPrefix() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        String actual = helpFormatter.getSyntaxPrefix();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.setArgName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setArgName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setArgName(java.lang.String)}
 *  */
    @Test
    public void testSetArgName() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        helpFormatter.setArgName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.getNewLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNewLine()
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#getNewLine()}
 * @utbot.returnsFrom {@code return this.defaultNewLine;}
 *  */
    @Test
    public void testGetNewLine_ReturnThisDefaultNewLine() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        String actual = helpFormatter.getNewLine();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.getOptPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptPrefix()
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#getOptPrefix()}
 * @utbot.returnsFrom {@code return this.defaultOptPrefix;}
 *  */
    @Test
    public void testGetOptPrefix_ReturnThisDefaultOptPrefix() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        String actual = helpFormatter.getOptPrefix();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.setSyntaxPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSyntaxPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setSyntaxPrefix(java.lang.String)}
 *  */
    @Test
    public void testSetSyntaxPrefix() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        helpFormatter.setSyntaxPrefix(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.setDescPadding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDescPadding(int)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setDescPadding(int)}
 *  */
    @Test
    public void testSetDescPadding() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        helpFormatter.defaultDescPad = -255;
        
        helpFormatter.setDescPadding(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.getDescPadding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDescPadding()
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#getDescPadding()}
 * @utbot.returnsFrom {@code return this.defaultDescPad;}
 *  */
    @Test
    public void testGetDescPadding_ReturnThisDefaultDescPad() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        helpFormatter.defaultDescPad = -255;
        
        int actual = helpFormatter.getDescPadding();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.setWidth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setWidth(int)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setWidth(int)}
 *  */
    @Test
    public void testSetWidth() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        helpFormatter.defaultWidth = -255;
        
        helpFormatter.setWidth(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.setLongOptPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLongOptPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setLongOptPrefix(java.lang.String)}
 *  */
    @Test
    public void testSetLongOptPrefix() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        helpFormatter.setLongOptPrefix(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.setOptPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOptPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setOptPrefix(java.lang.String)}
 *  */
    @Test
    public void testSetOptPrefix() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        helpFormatter.setOptPrefix(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.appendOptionGroup
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOptionGroup(java.lang.StringBuffer,org.apache.commons.cli.OptionGroup)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !group.isRequired()
 *  */
    @Test
    public void testAppendOptionGroup_ThrowNullPointerException() throws Throwable  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOptionGroup] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.appendOptionGroup(HelpFormatter.java:581) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionGroupType = Class.forName("org.apache.commons.cli.OptionGroup");
        Method appendOptionGroupMethod = helpFormatterClazz.getDeclaredMethod("appendOptionGroup", stringBufferType, optionGroupType);
        appendOptionGroupMethod.setAccessible(true);
        java.lang.Object[] appendOptionGroupMethodArguments = new java.lang.Object[2];
        appendOptionGroupMethodArguments[0] = ((Object) null);
        appendOptionGroupMethodArguments[1] = ((Object) null);
        try {
            appendOptionGroupMethod.invoke(helpFormatter, appendOptionGroupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOptionGroup(java.lang.StringBuffer,org.apache.commons.cli.OptionGroup)}
 * @utbot.invokes {@link org.apache.commons.cli.OptionGroup#isRequired()}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buff.append("[");
 *  */
    @Test
    public void testAppendOptionGroup_ThrowNullPointerException_1() throws Throwable  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOptionGroup] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.appendOptionGroup(HelpFormatter.java:583) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionGroupType = Class.forName("org.apache.commons.cli.OptionGroup");
        Method appendOptionGroupMethod = helpFormatterClazz.getDeclaredMethod("appendOptionGroup", stringBufferType, optionGroupType);
        appendOptionGroupMethod.setAccessible(true);
        java.lang.Object[] appendOptionGroupMethodArguments = new java.lang.Object[2];
        appendOptionGroupMethodArguments[0] = ((Object) null);
        appendOptionGroupMethodArguments[1] = optionGroup;
        try {
            appendOptionGroupMethod.invoke(helpFormatter, appendOptionGroupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)
    
    @Test
    public void testAppendOptionGroup1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        HashMap optionMap = new HashMap();
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionGroupType = Class.forName("org.apache.commons.cli.OptionGroup");
        Method appendOptionGroupMethod = helpFormatterClazz.getDeclaredMethod("appendOptionGroup", stringBufferType, optionGroupType);
        appendOptionGroupMethod.setAccessible(true);
        java.lang.Object[] appendOptionGroupMethodArguments = new java.lang.Object[2];
        appendOptionGroupMethodArguments[0] = stringBuffer;
        appendOptionGroupMethodArguments[1] = optionGroup;
        appendOptionGroupMethod.invoke(helpFormatter, appendOptionGroupMethodArguments);
    }
    
    @Test
    public void testAppendOptionGroup2() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer("");
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        HashMap optionMap = new HashMap();
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        optionGroup.setRequired(true);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionGroupType = Class.forName("org.apache.commons.cli.OptionGroup");
        Method appendOptionGroupMethod = helpFormatterClazz.getDeclaredMethod("appendOptionGroup", stringBufferType, optionGroupType);
        appendOptionGroupMethod.setAccessible(true);
        java.lang.Object[] appendOptionGroupMethodArguments = new java.lang.Object[2];
        appendOptionGroupMethodArguments[0] = stringBuffer;
        appendOptionGroupMethodArguments[1] = optionGroup;
        appendOptionGroupMethod.invoke(helpFormatter, appendOptionGroupMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)
    
    @Test
    public void testAppendOptionGroup3() throws Throwable  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer("");
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        HashMap optionMap = new HashMap();
        Object object = createInstance("java.lang.Object");
        optionMap.put(null, object);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        optionGroup.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOptionGroup] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.cli.HelpFormatter.appendOptionGroup(HelpFormatter.java:592) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionGroupType = Class.forName("org.apache.commons.cli.OptionGroup");
        Method appendOptionGroupMethod = helpFormatterClazz.getDeclaredMethod("appendOptionGroup", stringBufferType, optionGroupType);
        appendOptionGroupMethod.setAccessible(true);
        java.lang.Object[] appendOptionGroupMethodArguments = new java.lang.Object[2];
        appendOptionGroupMethodArguments[0] = stringBuffer;
        appendOptionGroupMethodArguments[1] = optionGroup;
        try {
            appendOptionGroupMethod.invoke(helpFormatter, appendOptionGroupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendOptionGroup4() throws Throwable  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        HashMap optionMap = new HashMap();
        Object object = createInstance("java.lang.Object");
        optionMap.put(null, object);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOptionGroup] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.cli.HelpFormatter.appendOptionGroup(HelpFormatter.java:592) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionGroupType = Class.forName("org.apache.commons.cli.OptionGroup");
        Method appendOptionGroupMethod = helpFormatterClazz.getDeclaredMethod("appendOptionGroup", stringBufferType, optionGroupType);
        appendOptionGroupMethod.setAccessible(true);
        java.lang.Object[] appendOptionGroupMethodArguments = new java.lang.Object[2];
        appendOptionGroupMethodArguments[0] = stringBuffer;
        appendOptionGroupMethodArguments[1] = optionGroup;
        try {
            appendOptionGroupMethod.invoke(helpFormatter, appendOptionGroupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendOptionGroup5() throws Throwable  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        HashMap optionMap = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        optionMap.put(integer, object);
        Long long1 = 0L;
        optionMap.put(long1, object);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOptionGroup] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
            java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
            java.base/java.util.Arrays.sort(Arrays.java:1107)
            java.base/java.util.Arrays.sort(Arrays.java:1301)
            java.base/java.util.ArrayList.sort(ArrayList.java:1721)
            java.base/java.util.Collections.sort(Collections.java:179)
            org.apache.commons.cli.HelpFormatter.appendOptionGroup(HelpFormatter.java:587) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionGroupType = Class.forName("org.apache.commons.cli.OptionGroup");
        Method appendOptionGroupMethod = helpFormatterClazz.getDeclaredMethod("appendOptionGroup", stringBufferType, optionGroupType);
        appendOptionGroupMethod.setAccessible(true);
        java.lang.Object[] appendOptionGroupMethodArguments = new java.lang.Object[2];
        appendOptionGroupMethodArguments[0] = stringBuffer;
        appendOptionGroupMethodArguments[1] = optionGroup;
        try {
            appendOptionGroupMethod.invoke(helpFormatter, appendOptionGroupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendOptionGroup6() throws Throwable  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer("");
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        HashMap optionMap = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        optionMap.put(integer, object);
        Character character = '\u0000';
        Object object1 = createInstance("java.lang.Object");
        optionMap.put(character, object1);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        optionGroup.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOptionGroup] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
            java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
            java.base/java.util.Arrays.sort(Arrays.java:1107)
            java.base/java.util.Arrays.sort(Arrays.java:1301)
            java.base/java.util.ArrayList.sort(ArrayList.java:1721)
            java.base/java.util.Collections.sort(Collections.java:179)
            org.apache.commons.cli.HelpFormatter.appendOptionGroup(HelpFormatter.java:587) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionGroupType = Class.forName("org.apache.commons.cli.OptionGroup");
        Method appendOptionGroupMethod = helpFormatterClazz.getDeclaredMethod("appendOptionGroup", stringBufferType, optionGroupType);
        appendOptionGroupMethod.setAccessible(true);
        java.lang.Object[] appendOptionGroupMethodArguments = new java.lang.Object[2];
        appendOptionGroupMethodArguments[0] = stringBuffer;
        appendOptionGroupMethodArguments[1] = optionGroup;
        try {
            appendOptionGroupMethod.invoke(helpFormatter, appendOptionGroupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendOptionGroup7() throws Throwable  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer("");
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        HashMap optionMap = new HashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        optionMap.put(character, object);
        optionMap.put(null, null);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        optionGroup.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOptionGroup] produces [java.lang.NullPointerException]
            java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
            java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
            java.base/java.util.Arrays.sort(Arrays.java:1107)
            java.base/java.util.Arrays.sort(Arrays.java:1301)
            java.base/java.util.ArrayList.sort(ArrayList.java:1721)
            java.base/java.util.Collections.sort(Collections.java:179)
            org.apache.commons.cli.HelpFormatter.appendOptionGroup(HelpFormatter.java:587) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionGroupType = Class.forName("org.apache.commons.cli.OptionGroup");
        Method appendOptionGroupMethod = helpFormatterClazz.getDeclaredMethod("appendOptionGroup", stringBufferType, optionGroupType);
        appendOptionGroupMethod.setAccessible(true);
        java.lang.Object[] appendOptionGroupMethodArguments = new java.lang.Object[2];
        appendOptionGroupMethodArguments[0] = stringBuffer;
        appendOptionGroupMethodArguments[1] = optionGroup;
        try {
            appendOptionGroupMethod.invoke(helpFormatter, appendOptionGroupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.rtrim
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rtrim(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#rtrim(java.lang.String)}
 * @utbot.executesCondition {@code (s == null): True}
 * @utbot.returnsFrom {@code return s;}
 *  */
    @Test
    public void testRtrim_SEqualsNull() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        String actual = helpFormatter.rtrim(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#rtrim(java.lang.String)}
 * @utbot.executesCondition {@code (s == null): False}
 * @utbot.executesCondition {@code (s.length() == 0): True}
 * @utbot.returnsFrom {@code return s;}
 *  */
    @Test
    public void testRtrim_SLengthEqualsZero() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "";
        
        String actual = helpFormatter.rtrim(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#rtrim(java.lang.String)}
 * @utbot.executesCondition {@code (s == null): False}
 * @utbot.executesCondition {@code (s.length() == 0): False}
 * @utbot.iterates iterate the loop {@code while((pos > 0) && Character.isWhitespace(s.charAt(pos - 1)))} once
 * @utbot.returnsFrom {@code return s.substring(0, pos);}
 *  */
    @Test
    public void testRtrim_PosGreaterThanZeroAndCharacterIsWhitespace() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\t";
        
        String actual = helpFormatter.rtrim(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#rtrim(java.lang.String)}
 * @utbot.executesCondition {@code (s == null): False}
 * @utbot.executesCondition {@code (s.length() == 0): False}
 * @utbot.iterates iterate the loop {@code while((pos > 0) && Character.isWhitespace(s.charAt(pos - 1)))} once
 * @utbot.returnsFrom {@code return s.substring(0, pos);}
 *  */
    @Test
    public void testRtrim_PosLessOrEqualZeroAndCharacterIsWhitespace() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "!";
        
        String actual = helpFormatter.rtrim(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printUsage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printUsage(java.io.PrintWriter, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printUsage(java.io.PrintWriter,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int argPos = cmdLineSyntax.indexOf(' ') + 1;
 *  */
    @Test
    public void testPrintUsage_ThrowNullPointerException() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:654) */
        helpFormatter.printUsage(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printUsage(java.io.PrintWriter,int,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printWrapped(pw, width, defaultSyntaxPrefix.length() + argPos, defaultSyntaxPrefix + cmdLineSyntax);
 *  */
    @Test
    public void testPrintUsage_ThrowNullPointerException_1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = " ";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:656) */
        helpFormatter.printUsage(null, -255, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printUsage(java.io.PrintWriter, int, java.lang.String)
    
    @Test
    public void testPrintUsage1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "!!!";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printUsage] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706)
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:656) */
        helpFormatter.printUsage(null, -255, defaultSyntaxPrefix);
    }
    
    @Test
    public void testPrintUsage2() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printUsage] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 40]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706)
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:656) */
        helpFormatter.printUsage(null, 0, string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method printUsage(java.io.PrintWriter, int, java.lang.String)
    
    @Test(timeout = 1000L)
    public void testPrintUsage3() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        helpFormatter.printUsage(anonymousPrintWriter, 0, defaultSyntaxPrefix);
    }
    
    @Test(timeout = 1000L)
    public void testPrintUsage4() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "\u0000\u0000\u0000 \u0000\u0000\u0000";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        helpFormatter.printUsage(null, 0, defaultSyntaxPrefix);
    }
    
    @Test(timeout = 1000L)
    public void testPrintUsage5() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000 ";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        helpFormatter.printUsage(null, 0, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printUsage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printUsage(java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getOptions()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List optList = new ArrayList(options.getOptions());
 *  */
    @Test
    public void testPrintUsage_ThrowNullPointerException1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printUsage] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:105)
            java.base/java.lang.StringBuffer.<init>(StringBuffer.java:158)
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:514) */
        helpFormatter.printUsage(null, -255, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)
    
    @Test
    public void testPrintUsage6() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String defaultSyntaxPrefix = "\u0000\u0000\u0000\u0000\u0000";
        helpFormatter.defaultSyntaxPrefix = defaultSyntaxPrefix;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        shortOpts.put(integer, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.helpOptions(Options.java:192)
            org.apache.commons.cli.Options.getOptions(Options.java:178)
            org.apache.commons.cli.HelpFormatter.printUsage(HelpFormatter.java:523) */
        helpFormatter.printUsage(printWriter, 0, null, options);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.findWrapPos
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findWrapPos(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (text.indexOf('\n', startPos)): False}
 * @utbot.returnsFrom {@code return pos + 1;}
 *  */
    @Test
    public void testFindWrapPos_NotTextIndexOf() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\n\u0000  ";
        
        int actual = helpFormatter.findWrapPos(string, 0, 0);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (text.indexOf('\n', startPos)): True}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): True}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): True}
 * @utbot.returnsFrom {@code return pos + 1;}
 *  */
    @Test
    public void testFindWrapPos_NotEqualsNegative1AndPosLessOrEqualWidth() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\t\n\u0000\u0000 \u0000\u0000\u0000\u0000";
        
        int actual = helpFormatter.findWrapPos(string, 0, 0);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): True}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): True}
 * @utbot.returnsFrom {@code return pos + 1;}
 *  */
    @Test
    public void testFindWrapPos_NotEqualsNegative1AndPosLessOrEqualWidth_1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\t ";
        
        int actual = helpFormatter.findWrapPos(string, 0, -1);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): False}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testFindWrapPos_EqualsNegative1AndPosGreaterThanWidth() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "";
        
        int actual = helpFormatter.findWrapPos(string, 0, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): True}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): False}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testFindWrapPos_EqualsNegative1AndPosGreaterThanWidth_1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\t";
        
        int actual = helpFormatter.findWrapPos(string, Integer.MIN_VALUE, -1073741824);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): True}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): False}
 * @utbot.executesCondition {@code (pos > startPos): True}
 * @utbot.iterates iterate the loop {@code while((pos >= startPos) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r'))} once
 * @utbot.returnsFrom {@code return pos;}
 *  */
    @Test
    public void testFindWrapPos_PosGreaterThanStartPos() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\t ";
        
        int actual = helpFormatter.findWrapPos(string, -2147483647, Integer.MIN_VALUE);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): True}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): False}
 * @utbot.executesCondition {@code (pos > startPos): False}
 * @utbot.iterates iterate the loop {@code while((pos <= text.length()) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r'))} once
 * @utbot.returnsFrom {@code return (pos == text.length()) ? (-1) : pos;}
 *  */
    @Test
    public void testFindWrapPos_PosLessOrEqualStartPos() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = " \t";
        
        int actual = helpFormatter.findWrapPos(string, -1, 1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (text.indexOf('\n', startPos)): True}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): True}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): False}
 * @utbot.executesCondition {@code (pos > startPos): True}
 * @utbot.iterates iterate the loop {@code while((pos >= startPos) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r'))} once
 * @utbot.returnsFrom {@code return pos;}
 *  */
    @Test
    public void testFindWrapPos_PosLessThanStartPosAndEqualsCharAndCEqualsCharAndCEqualsChar() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = " \u0000\u0000\u0000\u0000\u0000\t\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        int actual = helpFormatter.findWrapPos(string, 1, 6);
        
        assertEquals(7, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): False}
 * @utbot.executesCondition {@code (pos > startPos): False}
 * @utbot.iterates iterate the loop {@code while((pos <= text.length()) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r'))} once
 * @utbot.returnsFrom {@code return (pos == text.length()) ? (-1) : pos;}
 *  */
    @Test
    public void testFindWrapPos_PosGreaterThanTextLengthAndEqualsCharAndCEqualsCharAndCEqualsChar() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r";
        
        int actual = helpFormatter.findWrapPos(string, -31, 62);
        
        assertEquals(31, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): False}
 * @utbot.executesCondition {@code (pos > startPos): False}
 * @utbot.iterates iterate the loop {@code while((pos <= text.length()) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r'))} once
 * @utbot.returnsFrom {@code return (pos == text.length()) ? (-1) : pos;}
 *  */
    @Test
    public void testFindWrapPos_PosGreaterThanTextLengthAndEqualsCharAndCEqualsCharAndCEqualsChar_1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n";
        
        int actual = helpFormatter.findWrapPos(string, -31, 62);
        
        assertEquals(31, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findWrapPos(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): False}
 * @utbot.iterates iterate the loop {@code while((pos >= startPos) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r'))} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while((pos >= startPos) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r'))
 *  */
    @Test
    public void testFindWrapPos_ThrowStringIndexOutOfBoundsException() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:893) */
        helpFormatter.findWrapPos(string, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): True}
 * @utbot.executesCondition {@code (((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)): False}
 * @utbot.iterates iterate the loop {@code while((pos >= startPos) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r'))} twice
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while((pos >= startPos) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r'))
 *  */
    @Test
    public void testFindWrapPos_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\t";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:893) */
        helpFormatter.findWrapPos(string, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ((pos = text.indexOf('\n', startPos)) != -1 && pos <= width) || ((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)
 *  */
    @Test
    public void testFindWrapPos_ThrowNullPointerException() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:877) */
        helpFormatter.findWrapPos(null, -255, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findWrapPos(java.lang.String, int, int)
    
    @Test
    public void testFindWrapPos1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\r\t";
        
        int actual = helpFormatter.findWrapPos(string, 0, 4);
        
        assertEquals(4, actual);
    }
    
    @Test
    public void testFindWrapPos2() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t";
        
        int actual = helpFormatter.findWrapPos(string, -29, 32);
        
        assertEquals(3, actual);
    }
    
    @Test
    public void testFindWrapPos3() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000\t\u0000\u0000\u0000\u0000\u0000";
        
        int actual = helpFormatter.findWrapPos(string, -23, 32);
        
        assertEquals(9, actual);
    }
    
    @Test
    public void testFindWrapPos4() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\t";
        
        int actual = helpFormatter.findWrapPos(string, 0, 10);
        
        assertEquals(11, actual);
    }
    
    @Test
    public void testFindWrapPos5() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000\t\u0000\u0000\u0000\u0000\u0000";
        
        int actual = helpFormatter.findWrapPos(string, -23, 32);
        
        assertEquals(9, actual);
    }
    
    @Test
    public void testFindWrapPos6() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        int actual = helpFormatter.findWrapPos(string, -30, 33);
        
        assertEquals(3, actual);
    }
    
    @Test
    public void testFindWrapPos7() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\n\u0000\u0000";
        
        int actual = helpFormatter.findWrapPos(string, -2147483646, Integer.MIN_VALUE);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testFindWrapPos8() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n";
        
        int actual = helpFormatter.findWrapPos(string, 0, 13);
        
        assertEquals(14, actual);
    }
    
    @Test
    public void testFindWrapPos9() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \n ";
        
        int actual = helpFormatter.findWrapPos(string, 0, 30);
        
        assertEquals(30, actual);
    }
    
    @Test
    public void testFindWrapPos10() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\n\r";
        
        int actual = helpFormatter.findWrapPos(string, 0, 30);
        
        assertEquals(30, actual);
    }
    
    @Test
    public void testFindWrapPos11() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\r";
        
        int actual = helpFormatter.findWrapPos(string, 0, 38);
        
        assertEquals(38, actual);
    }
    
    @Test
    public void testFindWrapPos12() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000  ";
        
        int actual = helpFormatter.findWrapPos(string, 0, 38);
        
        assertEquals(38, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findWrapPos(java.lang.String, int, int)
    
    @Test
    public void testFindWrapPos13() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 9]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, 0, 4);
    }
    
    @Test
    public void testFindWrapPos14() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 32]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, -1073741823, 1073741824);
    }
    
    @Test
    public void testFindWrapPos15() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 33]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, 1, 31);
    }
    
    @Test
    public void testFindWrapPos16() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\t";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 26]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, 1, 24);
    }
    
    @Test
    public void testFindWrapPos17() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \t";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 26]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, 1, 24);
    }
    
    @Test
    public void testFindWrapPos18() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t\u0000";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 9]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, -7, 7);
    }
    
    @Test
    public void testFindWrapPos19() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 33]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, 1, 31);
    }
    
    @Test
    public void testFindWrapPos20() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\n\u0000";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483648]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:893) */
        helpFormatter.findWrapPos(string, 0, Integer.MIN_VALUE);
    }
    
    @Test
    public void testFindWrapPos21() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\n\u0000\u0000\t";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483644]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, -814743555, -1332740089);
    }
    
    @Test
    public void testFindWrapPos22() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\t\u0000\u0000\n\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:893) */
        helpFormatter.findWrapPos(string, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    @Test
    public void testFindWrapPos23() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\t\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 35]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, 3, 29);
    }
    
    @Test
    public void testFindWrapPos24() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\u0000\n";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.findWrapPos] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2145140736]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909) */
        helpFormatter.findWrapPos(string, -1071610631, -1073530105);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.renderOptions
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#renderOptions(java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List optList = options.helpOptions();
 *  */
    @Test
    public void testRenderOptions_ThrowNullPointerException() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.renderOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.renderOptions(HelpFormatter.java:741) */
        helpFormatter.renderOptions(null, -255, null, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#renderOptions(java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List optList = options.helpOptions();
 *  */
    @Test
    public void testRenderOptions_ThrowNullPointerException_1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.renderOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.renderOptions(HelpFormatter.java:741) */
        helpFormatter.renderOptions(null, -255, null, 1, 0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)
    
    @Test
    public void testRenderOptions1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer("");
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.renderOptions] produces [java.lang.NegativeArraySizeException: -2147483647]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuffer.<init>(StringBuffer.java:146)
            org.apache.commons.cli.HelpFormatter.createPadding(HelpFormatter.java:927)
            org.apache.commons.cli.HelpFormatter.renderOptions(HelpFormatter.java:730) */
        helpFormatter.renderOptions(stringBuffer, 0, options, -2147483647, -2147483647);
    }
    
    @Test
    public void testRenderOptions2() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer("");
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        shortOpts.put(null, object);
        Integer integer = 0;
        shortOpts.put(integer, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.renderOptions] produces [java.lang.NegativeArraySizeException: -2147483647]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuffer.<init>(StringBuffer.java:146)
            org.apache.commons.cli.HelpFormatter.createPadding(HelpFormatter.java:927)
            org.apache.commons.cli.HelpFormatter.renderOptions(HelpFormatter.java:731) */
        helpFormatter.renderOptions(stringBuffer, 0, options, 1, -2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.renderWrappedText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#renderWrappedText(java.lang.StringBuffer,int,int,java.lang.String)}
 * @utbot.executesCondition {@code (pos == -1): True}
 * @utbot.invokes {@link org.apache.commons.cli.HelpFormatter#findWrapPos(java.lang.String,int,int)}
 * @utbot.invokes {@link org.apache.commons.cli.HelpFormatter#rtrim(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 *  */
    @Test
    public void testRenderWrappedText_PosEqualsNegative1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        StringBuffer stringBuffer = new StringBuffer(" ");
        String string = "";
        
        StringBuffer actual = helpFormatter.renderWrappedText(stringBuffer, 0, -255, string);
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[17];
        value[0] = (byte) 32;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 1);
        
        String actualToStringCache = ((String) getFieldValue(actual, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualToStringCache);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#renderWrappedText(java.lang.StringBuffer,int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: int pos = findWrapPos(text, width, 0);
 *  */
    @Test
    public void testRenderWrappedText_ThrowStringIndexOutOfBoundsException() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\n\t      ";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.renderWrappedText] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483639]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829) */
        helpFormatter.renderWrappedText(null, -2147483639, -255, string);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#renderWrappedText(java.lang.StringBuffer,int,int,java.lang.String)}
 * @utbot.executesCondition {@code (pos == -1): True}
 * @utbot.invokes {@link org.apache.commons.cli.HelpFormatter#rtrim(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(rtrim(text));
 *  */
    @Test
    public void testRenderWrappedText_ThrowNullPointerException() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.renderWrappedText] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:833) */
        helpFormatter.renderWrappedText(null, 0, -255, string);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#renderWrappedText(java.lang.StringBuffer,int,int,java.lang.String)}
 * @utbot.executesCondition {@code (pos == -1): False}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link org.apache.commons.cli.HelpFormatter#rtrim(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(rtrim(text.substring(0, pos))).append(defaultNewLine);
 *  */
    @Test
    public void testRenderWrappedText_ThrowNullPointerException_1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.renderWrappedText] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:837) */
        helpFormatter.renderWrappedText(null, 0, -255, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printWrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printWrapped(java.io.PrintWriter, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printWrapped(java.io.PrintWriter,int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: renderWrappedText(sb, width, nextLineTabStop, text);
 *  */
    @Test
    public void testPrintWrapped_ThrowStringIndexOutOfBoundsException() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printWrapped] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706) */
        helpFormatter.printWrapped(null, -1, -255, string);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printWrapped(java.io.PrintWriter,int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: renderWrappedText(sb, width, nextLineTabStop, text);
 *  */
    @Test
    public void testPrintWrapped_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printWrapped] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706) */
        helpFormatter.printWrapped(null, -1, -255, string);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printWrapped(java.io.PrintWriter,int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: renderWrappedText(sb, width, nextLineTabStop, text);
 *  */
    @Test
    public void testPrintWrapped_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = " \t";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printWrapped] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483645]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706) */
        helpFormatter.printWrapped(null, -2147483645, -255, string);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printWrapped(java.io.PrintWriter,int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StringBuffer sb = new StringBuffer(text.length());
 *  */
    @Test
    public void testPrintWrapped_ThrowNullPointerException() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printWrapped] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:704) */
        helpFormatter.printWrapped(null, -255, -255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.printWrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printWrapped(java.io.PrintWriter, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printWrapped(java.io.PrintWriter,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: printWrapped(pw, width, 0, text);
 *  */
    @Test
    public void testPrintWrapped_ThrowStringIndexOutOfBoundsException1() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printWrapped] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:690) */
        helpFormatter.printWrapped(null, -1, string);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printWrapped(java.io.PrintWriter,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: printWrapped(pw, width, 0, text);
 *  */
    @Test
    public void testPrintWrapped_ThrowStringIndexOutOfBoundsException_11() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printWrapped] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:690) */
        helpFormatter.printWrapped(null, -1, string);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#printWrapped(java.io.PrintWriter,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: printWrapped(pw, width, 0, text);
 *  */
    @Test
    public void testPrintWrapped_ThrowStringIndexOutOfBoundsException_21() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        String string = "\t\n      ";
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.printWrapped] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483639]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.HelpFormatter.findWrapPos(HelpFormatter.java:909)
            org.apache.commons.cli.HelpFormatter.renderWrappedText(HelpFormatter.java:829)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:706)
            org.apache.commons.cli.HelpFormatter.printWrapped(HelpFormatter.java:690) */
        helpFormatter.printWrapped(null, -2147483639, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.createPadding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createPadding(int)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#createPadding(int)}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testCreatePadding_ReturnSbToString() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        String actual = helpFormatter.createPadding(0);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#createPadding(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testCreatePadding_StringBufferAppend() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        String actual = helpFormatter.createPadding(1);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.appendOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!required): False},
    ///     {@code (option.getOpt() != null): False}
    /// invoke:
    ///     {@link java.lang.StringBuffer#append(java.lang.String)} twice,
    ///     {@link org.apache.commons.cli.Option#getLongOpt()} once
    /// execute conditions:
    ///     {@code (!required): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (option.hasArg()): False}
 *  */
    @Test
    public void testAppendOption_NotOptionHasArg() throws Exception  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000");
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = true;
        appendOptionMethod.invoke(null, appendOptionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (option.hasArg()): True}
 * @utbot.executesCondition {@code (option.getArgName() != null): False}
 *  */
    @Test
    public void testAppendOption_OptionGetArgNameEqualsNull() throws Exception  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000");
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = true;
        appendOptionMethod.invoke(null, appendOptionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (option.hasArg()): True}
 * @utbot.executesCondition {@code (option.getArgName() != null): False}
 *  */
    @Test
    public void testAppendOption_OptionGetArgNameEqualsNull_1() throws Exception  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000");
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = true;
        appendOptionMethod.invoke(null, appendOptionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (!required): False}
 * @utbot.executesCondition {@code (option.getOpt() != null): True}
 * @utbot.executesCondition {@code (option.hasArg()): False}
 * @utbot.executesCondition {@code (!required): False}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getOpt()}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 *  */
    @Test
    public void testAppendOption_Required() throws Exception  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = true;
        appendOptionMethod.invoke(null, appendOptionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (!required): True}
 * @utbot.executesCondition {@code (option.getOpt() != null): False}
 * @utbot.executesCondition {@code (option.hasArg()): True}
 * @utbot.executesCondition {@code (option.getArgName() != null): False}
 * @utbot.executesCondition {@code (!required): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getLongOpt()}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getArgName()}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 *  */
    @Test
    public void testAppendOption_NotRequired() throws Exception  {
        StringBuffer stringBuffer = new StringBuffer("                 ");
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = false;
        appendOptionMethod.invoke(null, appendOptionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (!required): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: option.getOpt() != null
 *  */
    @Test
    public void testAppendOption_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.appendOption(HelpFormatter.java:622) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = ((Object) null);
        appendOptionMethodArguments[1] = ((Object) null);
        appendOptionMethodArguments[2] = true;
        try {
            appendOptionMethod.invoke(null, appendOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (!required): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buff.append("[");
 *  */
    @Test
    public void testAppendOption_ThrowNullPointerException_2() throws Throwable  {
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.appendOption(HelpFormatter.java:619) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = ((Object) null);
        appendOptionMethodArguments[1] = ((Object) null);
        appendOptionMethodArguments[2] = false;
        try {
            appendOptionMethod.invoke(null, appendOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (!required): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: option.getOpt() != null
 *  */
    @Test
    public void testAppendOption_ThrowNullPointerException_4() throws Throwable  {
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.appendOption(HelpFormatter.java:622) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = ((Object) null);
        appendOptionMethodArguments[2] = false;
        try {
            appendOptionMethod.invoke(null, appendOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (!required): False}
 * @utbot.executesCondition {@code (option.getOpt() != null): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buff.append("-").append(option.getOpt());
 *  */
    @Test
    public void testAppendOption_ThrowNullPointerException() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.appendOption(HelpFormatter.java:624) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = ((Object) null);
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = true;
        try {
            appendOptionMethod.invoke(null, appendOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#appendOption(java.lang.StringBuffer,org.apache.commons.cli.Option,boolean)}
 * @utbot.executesCondition {@code (!required): False}
 * @utbot.executesCondition {@code (option.getOpt() != null): False}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buff.append("--").append(option.getLongOpt());
 *  */
    @Test
    public void testAppendOption_ThrowNullPointerException_3() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.HelpFormatter.appendOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.HelpFormatter.appendOption(HelpFormatter.java:628) */
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = ((Object) null);
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = true;
        try {
            appendOptionMethod.invoke(null, appendOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)
    
    @Test
    public void testAppendOption1() throws Exception  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        option.setArgName(opt);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = false;
        appendOptionMethod.invoke(null, appendOptionMethodArguments);
    }
    
    @Test
    public void testAppendOption2() throws Exception  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        option.setLongOpt(longOpt);
        option.setArgName(longOpt);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = true;
        appendOptionMethod.invoke(null, appendOptionMethodArguments);
    }
    
    @Test
    public void testAppendOption3() throws Exception  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        String argName = "";
        option.setArgName(argName);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = true;
        appendOptionMethod.invoke(null, appendOptionMethodArguments);
    }
    
    @Test
    public void testAppendOption4() throws Exception  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        String argName = "";
        option.setArgName(argName);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Class booleanType = boolean.class;
        Method appendOptionMethod = helpFormatterClazz.getDeclaredMethod("appendOption", stringBufferType, optionType, booleanType);
        appendOptionMethod.setAccessible(true);
        java.lang.Object[] appendOptionMethodArguments = new java.lang.Object[3];
        appendOptionMethodArguments[0] = stringBuffer;
        appendOptionMethodArguments[1] = option;
        appendOptionMethodArguments[2] = true;
        appendOptionMethod.invoke(null, appendOptionMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.getOptionComparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptionComparator()
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#getOptionComparator()}
 * @utbot.returnsFrom {@code return this.optionComparator;}
 *  */
    @Test
    public void testGetOptionComparator_ReturnThisOptionComparator() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        Comparator actual = helpFormatter.getOptionComparator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.HelpFormatter.setOptionComparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOptionComparator(java.util.Comparator)
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setOptionComparator(java.util.Comparator)}
 * @utbot.executesCondition {@code (comparator == null): False}
 *  */
    @Test
    public void testSetOptionComparator_ComparatorNotEqualsNull() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        RuleBasedCollator ruleBasedCollator = ((RuleBasedCollator) createInstance("java.text.RuleBasedCollator"));
        
        Comparator initialHelpFormatterOptionComparator = helpFormatter.optionComparator;
        
        Class helpFormatterClazz = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class ruleBasedCollatorType = Class.forName("java.util.Comparator");
        Method setOptionComparatorMethod = helpFormatterClazz.getDeclaredMethod("setOptionComparator", ruleBasedCollatorType);
        setOptionComparatorMethod.setAccessible(true);
        java.lang.Object[] setOptionComparatorMethodArguments = new java.lang.Object[1];
        setOptionComparatorMethodArguments[0] = ruleBasedCollator;
        setOptionComparatorMethod.invoke(helpFormatter, setOptionComparatorMethodArguments);
        
        Comparator finalHelpFormatterOptionComparator = helpFormatter.optionComparator;
        
        assertFalse(initialHelpFormatterOptionComparator == finalHelpFormatterOptionComparator);
    }
    
    /**
    @utbot.classUnderTest {@link HelpFormatter}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.HelpFormatter#setOptionComparator(java.util.Comparator)}
 * @utbot.executesCondition {@code (comparator == null): True}
 *  */
    @Test
    public void testSetOptionComparator_ComparatorEqualsNull() throws Exception  {
        HelpFormatter helpFormatter = ((HelpFormatter) createInstance("org.apache.commons.cli.HelpFormatter"));
        
        Comparator initialHelpFormatterOptionComparator = helpFormatter.optionComparator;
        
        helpFormatter.setOptionComparator(null);
        
        Comparator finalHelpFormatterOptionComparator = helpFormatter.optionComparator;
        
        assertFalse(initialHelpFormatterOptionComparator == finalHelpFormatterOptionComparator);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields838356531000000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields838356531000000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass838356531005800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields838356531000000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass838356531005800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields838356531460800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields838356531460800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass838356531461900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields838356531460800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass838356531461900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

