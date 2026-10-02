package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.CodePrinter.CompactCodePrinter;
import com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_CodeConsumerTest {
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#add(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#maybeEndStatement()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAdd_StringLength() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        String string = "";
        
        compactCodePrinter.add(string);
        
        boolean finalCompactCodePrinterStatementStarted = compactCodePrinter.statementStarted;
        
        assertTrue(finalCompactCodePrinterStatementStarted);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#add(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#maybeEndStatement()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: newcode.length() == 0
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:184) */
        (((CodeConsumer) codeSizeEstimatePrinter)).add(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(java.lang.String)
    
    @Test
    public void testAdd1() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        String string = "\u0100";
        
        (((CodeConsumer) compiledSizeEstimator)).add(string);
        
        boolean finalCompiledSizeEstimatorStatementStarted = ((Boolean) getFieldValue(compiledSizeEstimator, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCompiledSizeEstimatorStatementStarted);
    }
    
    @Test
    public void testAdd2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        String string = "_";
        
        (((CodeConsumer) codeSizeEstimatePrinter)).add(string);
        
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        boolean finalCodeSizeEstimatePrinterStatementStarted = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals('_', finalCodeSizeEstimatePrinterLastChar);
        
        assertTrue(finalCodeSizeEstimatePrinterStatementStarted);
    }
    
    @Test
    public void testAdd3() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        String string = "_";
        
        (((CodeConsumer) compiledSizeEstimator)).add(string);
        
        boolean finalCompiledSizeEstimatorStatementStarted = ((Boolean) getFieldValue(compiledSizeEstimator, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCompiledSizeEstimatorStatementStarted);
    }
    
    @Test
    public void testAdd4() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        String string = "";
        
        (((CodeConsumer) codeSizeEstimatePrinter)).add(string);
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        boolean finalCodeSizeEstimatePrinterStatementNeedsEnded = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
        
        assertEquals(';', finalCodeSizeEstimatePrinterLastChar);
        
        assertFalse(finalCodeSizeEstimatePrinterStatementNeedsEnded);
    }
    
    @Test
    public void testAdd5() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        String string = "$";
        
        (((CodeConsumer) codeSizeEstimatePrinter)).add(string);
        
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        boolean finalCodeSizeEstimatePrinterStatementStarted = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals('$', finalCodeSizeEstimatePrinterLastChar);
        
        assertTrue(finalCodeSizeEstimatePrinterStatementStarted);
    }
    
    @Test
    public void testAdd6() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        String string = "$";
        
        (((CodeConsumer) compiledSizeEstimator)).add(string);
        
        boolean finalCompiledSizeEstimatorStatementStarted = ((Boolean) getFieldValue(compiledSizeEstimator, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCompiledSizeEstimatorStatementStarted);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(java.lang.String)
    
    @Test
    public void testAdd7() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.maybeEndStatement(CodeConsumer.java:155)
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:182) */
        (((CodeConsumer) codeSizeEstimatePrinter)).add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.startNewLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method startNewLine()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#startNewLine()}
 *  */
    @Test
    public void testStartNewLine() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        (((CodeConsumer) compiledSizeEstimator)).startNewLine();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.maybeLineBreak
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeLineBreak()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#maybeLineBreak()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#maybeCutLine()}
 *  */
    @Test
    public void testMaybeLineBreak_CodeConsumerMaybeCutLine() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        (((CodeConsumer) compiledSizeEstimator)).maybeLineBreak();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endLine()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endLine()}
 *  */
    @Test
    public void testEndLine() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        (((CodeConsumer) compiledSizeEstimator)).endLine();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.addIdentifier
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addIdentifier(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#addIdentifier(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#add(java.lang.String)}
 *  */
    @Test
    public void testAddIdentifier_CodeConsumerAdd() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        String string = "";
        
        compactCodePrinter.addIdentifier(string);
        
        boolean finalCompactCodePrinterStatementStarted = compactCodePrinter.statementStarted;
        
        assertTrue(finalCompactCodePrinterStatementStarted);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addIdentifier(java.lang.String)
    
    @Test
    public void testAddIdentifier1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        String string = "";
        
        (((CodeConsumer) codeSizeEstimatePrinter)).addIdentifier(string);
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        boolean finalCodeSizeEstimatePrinterStatementNeedsEnded = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
        
        assertEquals(';', finalCodeSizeEstimatePrinterLastChar);
        
        assertFalse(finalCodeSizeEstimatePrinterStatementNeedsEnded);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addIdentifier(java.lang.String)
    
    @Test
    public void testAddIdentifier2() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        String string = "\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodePrinter$CompactCodePrinter.append(CodePrinter.java:416)
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:196)
            com.google.javascript.jscomp.CodeConsumer.addIdentifier(CodeConsumer.java:62) */
        compactCodePrinter.addIdentifier(string);
    }
    
    @Test
    public void testAddIdentifier3() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        String string = "_";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodePrinter$MappedCodePrinter.getLastChar(CodePrinter.java:184)
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:190)
            com.google.javascript.jscomp.CodeConsumer.addIdentifier(CodeConsumer.java:62) */
        compactCodePrinter.addIdentifier(string);
    }
    
    @Test
    public void testAddIdentifier4() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        String string = "$";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodePrinter$MappedCodePrinter.getLastChar(CodePrinter.java:184)
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:190)
            com.google.javascript.jscomp.CodeConsumer.addIdentifier(CodeConsumer.java:62) */
        compactCodePrinter.addIdentifier(string);
    }
    
    @Test
    public void testAddIdentifier5() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        StringBuilder code = new StringBuilder("\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength", 1);
        prettyCodePrinter.statementNeedsEnded = true;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:184)
            com.google.javascript.jscomp.CodeConsumer.addIdentifier(CodeConsumer.java:62) */
        prettyCodePrinter.addIdentifier(null);
    }
    
    @Test
    public void testAddIdentifier6() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", 1);
        StringBuilder code = new StringBuilder("\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        prettyCodePrinter.statementNeedsEnded = true;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:184)
            com.google.javascript.jscomp.CodeConsumer.addIdentifier(CodeConsumer.java:62) */
        prettyCodePrinter.addIdentifier(null);
    }
    
    @Test
    public void testAddIdentifier7() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", -2147483647);
        StringBuilder code = new StringBuilder("\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        prettyCodePrinter.statementNeedsEnded = true;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:184)
            com.google.javascript.jscomp.CodeConsumer.addIdentifier(CodeConsumer.java:62) */
        prettyCodePrinter.addIdentifier(null);
    }
    
    @Test
    public void testAddIdentifier8() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.maybeEndStatement(CodeConsumer.java:155)
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:182)
            com.google.javascript.jscomp.CodeConsumer.addIdentifier(CodeConsumer.java:62) */
        (((CodeConsumer) codeSizeEstimatePrinter)).addIdentifier(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.startSourceMapping
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method startSourceMapping(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#startSourceMapping(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testStartSourceMapping_ThrowIllegalStateException() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        
        compactCodePrinter.startSourceMapping(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.listSeparator
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method listSeparator()
    
    @Test
    public void testListSeparator1() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        (((CodeConsumer) compiledSizeEstimator)).listSeparator();
        
        boolean finalCompiledSizeEstimatorStatementStarted = ((Boolean) getFieldValue(compiledSizeEstimator, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCompiledSizeEstimatorStatementStarted);
    }
    
    @Test
    public void testListSeparator2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        (((CodeConsumer) codeSizeEstimatePrinter)).listSeparator();
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        boolean finalCodeSizeEstimatePrinterStatementNeedsEnded = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertEquals(2, finalCodeSizeEstimatePrinterSize);
        
        assertEquals(',', finalCodeSizeEstimatePrinterLastChar);
        
        assertFalse(finalCodeSizeEstimatePrinterStatementNeedsEnded);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method listSeparator()
    
    @Test
    public void testListSeparator3() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.listSeparator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.maybeEndStatement(CodeConsumer.java:155)
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:182)
            com.google.javascript.jscomp.CodeConsumer.listSeparator(CodeConsumer.java:124) */
        (((CodeConsumer) codeSizeEstimatePrinter)).listSeparator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.maybeCutLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeCutLine()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#maybeCutLine()}
 *  */
    @Test
    public void testMaybeCutLine() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        (((CodeConsumer) compiledSizeEstimator)).maybeCutLine();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endBlock
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method endBlock(boolean)
    
    @Test
    public void testEndBlock1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).endBlock(false);
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
        
        assertEquals('}', finalCodeSizeEstimatePrinterLastChar);
    }
    
    @Test
    public void testEndBlock2() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength", 1);
        
        prettyCodePrinter.endBlock(false);
        
        int finalPrettyCodePrinterIndent = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent"));
        int finalPrettyCodePrinterLineIndex = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineIndex"));
        
        assertEquals(-1, finalPrettyCodePrinterIndent);
        
        assertEquals(1, finalPrettyCodePrinterLineIndex);
    }
    
    @Test
    public void testEndBlock3() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength", -2147483647);
        
        prettyCodePrinter.endBlock(false);
        
        int finalPrettyCodePrinterIndent = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent"));
        int finalPrettyCodePrinterLineLength = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength"));
        
        assertEquals(-1, finalPrettyCodePrinterIndent);
        
        assertEquals(-2147483646, finalPrettyCodePrinterLineLength);
    }
    
    @Test
    public void testEndBlock4() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        
        prettyCodePrinter.endBlock(false);
        
        int finalPrettyCodePrinterIndent = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent"));
        int finalPrettyCodePrinterLineLength = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength"));
        
        assertEquals(-1, finalPrettyCodePrinterIndent);
        
        assertEquals(1, finalPrettyCodePrinterLineLength);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method endBlock(boolean)
    
    @Test(timeout = 1000L)
    public void testEndBlock5() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", Integer.MIN_VALUE);
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        prettyCodePrinter.endBlock(false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method endBlock(boolean)
    
    @Test
    public void testEndBlock6() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.endBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.appendBlockEnd(CodeConsumer.java:81)
            com.google.javascript.jscomp.CodeConsumer.endBlock(CodeConsumer.java:116) */
        (((CodeConsumer) codeSizeEstimatePrinter)).endBlock(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endBlock
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method endBlock()
    
    @Test
    public void testEndBlock7() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).endBlock();
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
        
        assertEquals('}', finalCodeSizeEstimatePrinterLastChar);
    }
    
    @Test
    public void testEndBlock8() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength", 1);
        
        prettyCodePrinter.endBlock();
        
        int finalPrettyCodePrinterIndent = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent"));
        int finalPrettyCodePrinterLineIndex = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineIndex"));
        
        assertEquals(-1, finalPrettyCodePrinterIndent);
        
        assertEquals(1, finalPrettyCodePrinterLineIndex);
    }
    
    @Test
    public void testEndBlock9() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength", -2147483647);
        
        prettyCodePrinter.endBlock();
        
        int finalPrettyCodePrinterIndent = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent"));
        int finalPrettyCodePrinterLineLength = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength"));
        
        assertEquals(-1, finalPrettyCodePrinterIndent);
        
        assertEquals(-2147483646, finalPrettyCodePrinterLineLength);
    }
    
    @Test
    public void testEndBlock10() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        
        prettyCodePrinter.endBlock();
        
        int finalPrettyCodePrinterIndent = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent"));
        int finalPrettyCodePrinterLineLength = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength"));
        
        assertEquals(-1, finalPrettyCodePrinterIndent);
        
        assertEquals(1, finalPrettyCodePrinterLineLength);
    }
    
    @Test
    public void testEndBlock11() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        StringBuilder code = new StringBuilder("\u0000");
        setField(compactCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        
        compactCodePrinter.endBlock();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method endBlock()
    
    @Test(timeout = 1000L)
    public void testEndBlock12() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", Integer.MIN_VALUE);
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        prettyCodePrinter.endBlock();
    }
    
    @Test(timeout = 1000L)
    public void testEndBlock13() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", Integer.MIN_VALUE);
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        prettyCodePrinter.endBlock();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method endBlock()
    
    @Test
    public void testEndBlock14() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.endBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.appendBlockEnd(CodeConsumer.java:81)
            com.google.javascript.jscomp.CodeConsumer.endBlock(CodeConsumer.java:116)
            com.google.javascript.jscomp.CodeConsumer.endBlock(CodeConsumer.java:112) */
        (((CodeConsumer) codeSizeEstimatePrinter)).endBlock();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.beginBlock
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method beginBlock()
    
    @Test
    public void testBeginBlock1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        
        (((CodeConsumer) codeSizeEstimatePrinter)).beginBlock();
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
    }
    
    @Test
    public void testBeginBlock2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        (((CodeConsumer) codeSizeEstimatePrinter)).beginBlock();
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        boolean finalCodeSizeEstimatePrinterStatementNeedsEnded = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertEquals(2, finalCodeSizeEstimatePrinterSize);
        
        assertEquals('{', finalCodeSizeEstimatePrinterLastChar);
        
        assertFalse(finalCodeSizeEstimatePrinterStatementNeedsEnded);
    }
    
    @Test
    public void testBeginBlock3() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", -2147483647);
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        
        prettyCodePrinter.beginBlock();
        
        int finalPrettyCodePrinterIndent = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent"));
        
        assertEquals(-2147483646, finalPrettyCodePrinterIndent);
    }
    
    @Test
    public void testBeginBlock4() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", 1);
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        
        prettyCodePrinter.beginBlock();
        
        int finalPrettyCodePrinterIndent = ((Integer) getFieldValue(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent"));
        
        assertEquals(2, finalPrettyCodePrinterIndent);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method beginBlock()
    
    @Test
    public void testBeginBlock5() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.beginBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.beginBlock(CodeConsumer.java:102) */
        (((CodeConsumer) codeSizeEstimatePrinter)).beginBlock();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endSourceMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endSourceMapping(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endSourceMapping(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testEndSourceMapping() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        
        compactCodePrinter.endSourceMapping(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endStatement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endStatement()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endStatement()}
 *  */
    @Test
    public void testEndStatement() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        
        compactCodePrinter.endStatement();
    }
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endStatement()}
 *  */
    @Test
    public void testEndStatement_1() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        compactCodePrinter.statementStarted = true;
        
        compactCodePrinter.endStatement();
        
        boolean finalCompactCodePrinterStatementNeedsEnded = compactCodePrinter.statementNeedsEnded;
        
        assertTrue(finalCompactCodePrinterStatementNeedsEnded);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endStatement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endStatement(boolean)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endStatement(boolean)}
 * @utbot.executesCondition {@code (statementStarted): False}
 *  */
    @Test
    public void testEndStatement_NotStatementStarted() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        
        compactCodePrinter.endStatement(false);
    }
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endStatement(boolean)}
 * @utbot.executesCondition {@code (statementStarted): True}
 *  */
    @Test
    public void testEndStatement_StatementStarted() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        compactCodePrinter.statementStarted = true;
        
        compactCodePrinter.endStatement(false);
        
        boolean finalCompactCodePrinterStatementNeedsEnded = compactCodePrinter.statementNeedsEnded;
        
        assertTrue(finalCompactCodePrinterStatementNeedsEnded);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method endStatement(boolean)
    
    @Test
    public void testEndStatement1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).endStatement(true);
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
        
        assertEquals(';', finalCodeSizeEstimatePrinterLastChar);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method endStatement(boolean)
    
    @Test
    public void testEndStatement2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.endStatement] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.endStatement(CodeConsumer.java:140) */
        (((CodeConsumer) codeSizeEstimatePrinter)).endStatement(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.maybeEndStatement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeEndStatement()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#maybeEndStatement()}
 * @utbot.executesCondition {@code (statementNeedsEnded): False}
 *  */
    @Test
    public void testMaybeEndStatement_NotStatementNeedsEnded() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        
        compactCodePrinter.maybeEndStatement();
        
        boolean finalCompactCodePrinterStatementStarted = compactCodePrinter.statementStarted;
        
        assertTrue(finalCompactCodePrinterStatementStarted);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method maybeEndStatement()
    
    @Test
    public void testMaybeEndStatement1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        (((CodeConsumer) codeSizeEstimatePrinter)).maybeEndStatement();
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        boolean finalCodeSizeEstimatePrinterStatementNeedsEnded = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
        
        assertEquals(';', finalCodeSizeEstimatePrinterLastChar);
        
        assertFalse(finalCodeSizeEstimatePrinterStatementNeedsEnded);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method maybeEndStatement()
    
    @Test
    public void testMaybeEndStatement2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.maybeEndStatement] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.maybeEndStatement(CodeConsumer.java:155) */
        (((CodeConsumer) codeSizeEstimatePrinter)).maybeEndStatement();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.appendBlockStart
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendBlockStart()
    
    @Test
    public void testAppendBlockStart1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).appendBlockStart();
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
        
        assertEquals('{', finalCodeSizeEstimatePrinterLastChar);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendBlockStart()
    
    @Test
    public void testAppendBlockStart2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.appendBlockStart] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.appendBlockStart(CodeConsumer.java:77) */
        (((CodeConsumer) codeSizeEstimatePrinter)).appendBlockStart();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endFunction(boolean)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endFunction(boolean)}
 * @utbot.executesCondition {@code (statementContext): False}
 *  */
    @Test
    public void testEndFunction_NotStatementContext() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        (((CodeConsumer) compiledSizeEstimator)).endFunction(false);
        
        boolean finalCompiledSizeEstimatorSawFunction = ((Boolean) getFieldValue(compiledSizeEstimator, "com.google.javascript.jscomp.CodeConsumer", "sawFunction"));
        
        assertTrue(finalCompiledSizeEstimatorSawFunction);
    }
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endFunction(boolean)}
 * @utbot.executesCondition {@code (statementContext): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#endLine()}
 *  */
    @Test
    public void testEndFunction_StatementContext() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        (((CodeConsumer) compiledSizeEstimator)).endFunction(true);
        
        boolean finalCompiledSizeEstimatorSawFunction = ((Boolean) getFieldValue(compiledSizeEstimator, "com.google.javascript.jscomp.CodeConsumer", "sawFunction"));
        
        assertTrue(finalCompiledSizeEstimatorSawFunction);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endFunction()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endFunction()}
 *  */
    @Test
    public void testEndFunction() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        
        prettyCodePrinter.endFunction();
        
        boolean finalPrettyCodePrinterSawFunction = prettyCodePrinter.sawFunction;
        
        assertTrue(finalPrettyCodePrinterSawFunction);
    }
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endFunction()}
 *  */
    @Test
    public void testEndFunction_1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        
        (((CodeConsumer) codeSizeEstimatePrinter)).endFunction();
        
        boolean finalCodeSizeEstimatePrinterSawFunction = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "sawFunction"));
        
        assertTrue(finalCodeSizeEstimatePrinterSawFunction);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.appendBlockEnd
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendBlockEnd()
    
    @Test
    public void testAppendBlockEnd1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).appendBlockEnd();
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
        
        assertEquals('}', finalCodeSizeEstimatePrinterLastChar);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendBlockEnd()
    
    @Test
    public void testAppendBlockEnd2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.appendBlockEnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.appendBlockEnd(CodeConsumer.java:81) */
        (((CodeConsumer) codeSizeEstimatePrinter)).appendBlockEnd();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.continueProcessing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method continueProcessing()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#continueProcessing()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testContinueProcessing_ReturnTrue() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        
        boolean actual = compactCodePrinter.continueProcessing();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.appendOp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendOp(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#appendOp(java.lang.String,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#append(java.lang.String)}
 *  */
    @Test
    public void testAppendOp_CodeConsumerAppend() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        String string = "";
        
        (((CodeConsumer) codeSizeEstimatePrinter)).appendOp(string, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendOp(java.lang.String, boolean)
    
    @Test
    public void testAppendOp1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        String string = "\u0000";
        
        (((CodeConsumer) codeSizeEstimatePrinter)).appendOp(string, false);
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendOp(java.lang.String, boolean)
    
    @Test
    public void testAppendOp2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        String string = "\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.appendOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.appendOp(CodeConsumer.java:200) */
        (((CodeConsumer) codeSizeEstimatePrinter)).appendOp(string, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.addOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addOp(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#addOp(java.lang.String,boolean)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char first = op.charAt(0);
 *  */
    @Test
    public void testAddOp_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CodePrinter.CompactCodePrinter compactCodePrinter = ((CodePrinter.CompactCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$CompactCodePrinter"));
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addOp] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.google.javascript.jscomp.CodeConsumer.addOp(CodeConsumer.java:206) */
        compactCodePrinter.addOp(string, false);
    }
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#addOp(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char first = op.charAt(0);
 *  */
    @Test
    public void testAddOp_ThrowNullPointerException() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeConsumer.addOp(CodeConsumer.java:206) */
        (((CodeConsumer) codeSizeEstimatePrinter)).addOp(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addOp(java.lang.String, boolean)
    
    @Test
    public void testAddOp1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '-');
        String string = "-";
        
        (((CodeConsumer) codeSizeEstimatePrinter)).addOp(string, false);
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        boolean finalCodeSizeEstimatePrinterStatementStarted = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals(2, finalCodeSizeEstimatePrinterSize);
        
        assertTrue(finalCodeSizeEstimatePrinterStatementStarted);
    }
    
    @Test
    public void testAddOp2() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(compiledSizeEstimator, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "last", '\u0000');
        String string = "\u0000";
        
        (((CodeConsumer) compiledSizeEstimator)).addOp(string, false);
        
        boolean finalCompiledSizeEstimatorStatementStarted = ((Boolean) getFieldValue(compiledSizeEstimator, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCompiledSizeEstimatorStatementStarted);
    }
    
    @Test
    public void testAddOp3() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '+');
        String string = "+";
        
        (((CodeConsumer) codeSizeEstimatePrinter)).addOp(string, false);
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        boolean finalCodeSizeEstimatePrinterStatementStarted = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals(2, finalCodeSizeEstimatePrinterSize);
        
        assertTrue(finalCodeSizeEstimatePrinterStatementStarted);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addOp(java.lang.String, boolean)
    
    @Test
    public void testAddOp4() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addOp] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.google.javascript.jscomp.CodeConsumer.addOp(CodeConsumer.java:206) */
        (((CodeConsumer) codeSizeEstimatePrinter)).addOp(string, false);
    }
    
    @Test
    public void testAddOp5() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", 1);
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        prettyCodePrinter.statementNeedsEnded = true;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeConsumer.addOp(CodeConsumer.java:206) */
        prettyCodePrinter.addOp(null, false);
    }
    
    @Test
    public void testAddOp6() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        StringBuilder code = new StringBuilder("\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "lineLength", 1);
        prettyCodePrinter.statementNeedsEnded = true;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeConsumer.addOp(CodeConsumer.java:206) */
        prettyCodePrinter.addOp(null, false);
    }
    
    @Test
    public void testAddOp7() throws Exception  {
        CodePrinter.PrettyCodePrinter prettyCodePrinter = ((CodePrinter.PrettyCodePrinter) createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"));
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", -2147483647);
        StringBuilder code = new StringBuilder("\u0000");
        setField(prettyCodePrinter, "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter", "code", code);
        prettyCodePrinter.statementNeedsEnded = true;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeConsumer.addOp(CodeConsumer.java:206) */
        prettyCodePrinter.addOp(null, false);
    }
    
    @Test
    public void testAddOp8() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.addOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.maybeEndStatement(CodeConsumer.java:155)
            com.google.javascript.jscomp.CodeConsumer.addOp(CodeConsumer.java:204) */
        (((CodeConsumer) codeSizeEstimatePrinter)).addOp(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.isWordChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isWordChar(char)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#isWordChar(char)}
 * @utbot.returnsFrom {@code return (ch == '_' || ch == '$' || Character.isLetterOrDigit(ch));}
 *  */
    @Test
    public void testIsWordChar_ChEquals_OrChEquals$OrCharacterIsLetterOrDigit() {
        boolean actual = CodeConsumer.isWordChar('_');
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#isWordChar(char)}
 * @utbot.returnsFrom {@code return (ch == '_' || ch == '$' || Character.isLetterOrDigit(ch));}
 *  */
    @Test
    public void testIsWordChar_ChEquals_OrChEquals$OrCharacterIsLetterOrDigit_1() {
        boolean actual = CodeConsumer.isWordChar('$');
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isWordChar(char)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CodeConsumer}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#isWordChar(char)}
     */
    @Test
    public void testIsWordCharReturnsFalse() {
        boolean actual = CodeConsumer.isWordChar('>');
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CodeConsumer}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#isWordChar(char)}
     */
    @Test
    public void testIsWordCharReturnsTrue() {
        boolean actual = CodeConsumer.isWordChar('A');
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.beginCaseBody
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method beginCaseBody()
    
    @Test
    public void testBeginCaseBody1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).beginCaseBody();
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        
        assertEquals(1, finalCodeSizeEstimatePrinterSize);
        
        assertEquals(':', finalCodeSizeEstimatePrinterLastChar);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method beginCaseBody()
    
    @Test
    public void testBeginCaseBody2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        /* This test fails because method [com.google.javascript.jscomp.CodeConsumer.beginCaseBody] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:167)
            com.google.javascript.jscomp.CodeConsumer.beginCaseBody(CodeConsumer.java:175) */
        (((CodeConsumer) codeSizeEstimatePrinter)).beginCaseBody();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.breakAfterBlockFor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method breakAfterBlockFor(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#breakAfterBlockFor(com.google.javascript.rhino.Node,boolean)}
 * @utbot.returnsFrom {@code return statementContext;}
 *  */
    @Test
    public void testBreakAfterBlockFor_ReturnStatementContext() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        boolean actual = (((CodeConsumer) compiledSizeEstimator)).breakAfterBlockFor(null, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endFile
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endFile()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endFile()}
 * @utbot.returnsFrom {@code /**
 *  * Called when we're at the end of a file.
 *  */
 * void endFile() {
 * }}
 *  */
    @Test
    public void testEndFile_Return() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        (((CodeConsumer) compiledSizeEstimator)).endFile();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.addNumber
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addNumber(double)
    
    @Test
    public void testAddNumber1() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).addNumber(-1.414554614172177);
        
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        
        assertEquals('7', finalCodeSizeEstimatePrinterLastChar);
    }
    
    @Test
    public void testAddNumber2() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).addNumber(2.1805351756897624E-289);
        
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        
        assertEquals('9', finalCodeSizeEstimatePrinterLastChar);
    }
    
    @Test
    public void testAddNumber3() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).addNumber(9.223372036854776E18);
        
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        
        assertEquals('3', finalCodeSizeEstimatePrinterLastChar);
    }
    
    @Test
    public void testAddNumber4() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '-');
        
        (((CodeConsumer) codeSizeEstimatePrinter)).addNumber(-2.225073858507202E-308);
        
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        boolean finalCodeSizeEstimatePrinterStatementStarted = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals('8', finalCodeSizeEstimatePrinterLastChar);
        
        assertTrue(finalCodeSizeEstimatePrinterStatementStarted);
    }
    
    @Test
    public void testAddNumber5() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '-');
        setField(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        
        (((CodeConsumer) codeSizeEstimatePrinter)).addNumber(-2.225073858507202E-308);
        
        int finalCodeSizeEstimatePrinterSize = ((Integer) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        char finalCodeSizeEstimatePrinterLastChar = ((Character) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        boolean finalCodeSizeEstimatePrinterStatementNeedsEnded = ((Boolean) getFieldValue(codeSizeEstimatePrinter, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertEquals(25, finalCodeSizeEstimatePrinterSize);
        
        assertEquals('8', finalCodeSizeEstimatePrinterLastChar);
        
        assertFalse(finalCodeSizeEstimatePrinterStatementNeedsEnded);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.endCaseBody
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endCaseBody()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#endCaseBody()}
 *  */
    @Test
    public void testEndCaseBody() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        (((CodeConsumer) compiledSizeEstimator)).endCaseBody();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.notePreferredLineBreak
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method notePreferredLineBreak()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#notePreferredLineBreak()}
 *  */
    @Test
    public void testNotePreferredLineBreak() throws Exception  {
        Object codeSizeEstimatePrinter = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        
        (((CodeConsumer) codeSizeEstimatePrinter)).notePreferredLineBreak();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeConsumer.shouldPreserveExtraBlocks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldPreserveExtraBlocks()
    
    /**
    @utbot.classUnderTest {@link CodeConsumer}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeConsumer#shouldPreserveExtraBlocks()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testShouldPreserveExtraBlocks_ReturnFalse() throws Exception  {
        Object compiledSizeEstimator = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        
        boolean actual = (((CodeConsumer) compiledSizeEstimator)).shouldPreserveExtraBlocks();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields891706026043700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields891706026043700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass891706026051000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields891706026043700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass891706026051000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields891706026447700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields891706026447700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass891706026449600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields891706026447700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass891706026449600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

