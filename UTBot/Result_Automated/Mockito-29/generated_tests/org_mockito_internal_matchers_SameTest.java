package org.mockito.internal.matchers;

import org.junit.Test;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.lang.reflect.Constructor;
import org.hamcrest.StringDescription;
import java.lang.reflect.Method;
import java.nio.ReadOnlyBufferException;
import java.io.PrintWriter;
import java.io.FileWriter;
import sun.awt.AWTCharset.Encoder;
import sun.awt.AWTCharset;
import java.nio.charset.CoderMalfunctionError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_mockito_internal_matchers_SameTest {
    ///region Test suites for executable org.mockito.internal.matchers.Same.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
 * @utbot.returnsFrom {@code return wanted == actual;}
 *  */
    @Test
    public void testMatches_WantedNotEqualsActual() {
        Object object = new Object();
        Same same = new Same(object);
        
        boolean actual = same.matches(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matches(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse() {
        Object object = new Object();
        Same same = new Same(object);
        
        boolean actual = same.matches(null);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse1() {
        Object object = new Object();
        Same same = new Same(object);
        
        boolean actual = same.matches(null);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse2() {
        Object object = new Object();
        Same same = new Same(object);
        
        boolean actual = same.matches(null);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse3() {
        Object object = new Object();
        Same same = new Same(object);
        Object object1 = new Object();
        
        boolean actual = same.matches(object1);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse4() {
        Object object = new Object();
        Same same = new Same(object);
        Object object1 = new Object();
        
        boolean actual = same.matches(object1);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse5() {
        Object object = new Object();
        Same same = new Same(object);
        Object object1 = new Object();
        
        boolean actual = same.matches(object1);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse6() {
        Object object = new Object();
        Same same = new Same(object);
        Object object1 = new Object();
        
        boolean actual = same.matches(object1);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse7() {
        Object object = new Object();
        Same same = new Same(object);
        Object object1 = new Object();
        
        boolean actual = same.matches(object1);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse8() {
        Object object = new Object();
        Same same = new Same(object);
        Object object1 = new Object();
        
        boolean actual = same.matches(object1);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Same}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#matches(java.lang.Object)}
     */
    @Test
    public void testMatchesReturnsFalse9() {
        Object object = new Object();
        Same same = new Same(object);
        Object object1 = new Object();
        
        boolean actual = same.matches(object1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.matchers.Same.describeTo
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method describeTo(org.hamcrest.Description)
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#describeTo(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: description.appendText("same(");
 *  */
    @Test(expected = RuntimeException.class)
    public void testDescribeTo_ThrowRuntimeException() throws Throwable  {
        Same same = new Same(null);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(outputStreamWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = outputStreamWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method describeToMethod = sameClazz.getDeclaredMethod("describeTo", stringDescriptionType);
        describeToMethod.setAccessible(true);
        java.lang.Object[] describeToMethodArguments = new java.lang.Object[1];
        describeToMethodArguments[0] = stringDescription;
        try {
            describeToMethod.invoke(same, describeToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#describeTo(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: description.appendText("same(");
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testDescribeTo_ThrowReadOnlyBufferException() throws Throwable  {
        Same same = new Same(null);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(outputStreamWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = outputStreamWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method describeToMethod = sameClazz.getDeclaredMethod("describeTo", stringDescriptionType);
        describeToMethod.setAccessible(true);
        java.lang.Object[] describeToMethodArguments = new java.lang.Object[1];
        describeToMethodArguments[0] = stringDescription;
        try {
            describeToMethod.invoke(same, describeToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#describeTo(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: description.appendText("same(");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDescribeTo_ThrowIllegalStateException() throws Throwable  {
        Same same = new Same(null);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(outputStreamWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = outputStreamWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method describeToMethod = sameClazz.getDeclaredMethod("describeTo", stringDescriptionType);
        describeToMethod.setAccessible(true);
        java.lang.Object[] describeToMethodArguments = new java.lang.Object[1];
        describeToMethodArguments[0] = stringDescription;
        try {
            describeToMethod.invoke(same, describeToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#describeTo(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: description.appendText("same(");
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testDescribeTo_ThrowReadOnlyBufferException_1() throws Throwable  {
        Same same = new Same(null);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(printWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = printWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method describeToMethod = sameClazz.getDeclaredMethod("describeTo", stringDescriptionType);
        describeToMethod.setAccessible(true);
        java.lang.Object[] describeToMethodArguments = new java.lang.Object[1];
        describeToMethodArguments[0] = stringDescription;
        try {
            describeToMethod.invoke(same, describeToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#describeTo(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: description.appendText("same(");
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testDescribeTo_ThrowCoderMalfunctionError() throws Throwable  {
        Same same = new Same(null);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        AWTCharset.Encoder encoder = ((AWTCharset.Encoder) createInstance("sun.awt.AWTCharset$Encoder"));
        Object enc = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(enc, "java.nio.charset.CharsetEncoder", "state", 3);
        setField(encoder, "sun.awt.AWTCharset$Encoder", "enc", enc);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class fileWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(fileWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = fileWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method describeToMethod = sameClazz.getDeclaredMethod("describeTo", stringDescriptionType);
        describeToMethod.setAccessible(true);
        java.lang.Object[] describeToMethodArguments = new java.lang.Object[1];
        describeToMethodArguments[0] = stringDescription;
        try {
            describeToMethod.invoke(same, describeToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method describeTo(org.hamcrest.Description)
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#describeTo(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: description.appendText(wanted.toString());
 *  */
    @Test
    public void testDescribeTo_ThrowNullPointerException() throws Throwable  {
        Same same = new Same(null);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock1);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(anonymousPrintWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = anonymousPrintWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        /* This test fails because method [org.mockito.internal.matchers.Same.describeTo] produces [java.lang.NullPointerException] */
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method describeToMethod = sameClazz.getDeclaredMethod("describeTo", stringDescriptionType);
        describeToMethod.setAccessible(true);
        java.lang.Object[] describeToMethodArguments = new java.lang.Object[1];
        describeToMethodArguments[0] = stringDescription;
        try {
            describeToMethod.invoke(same, describeToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#describeTo(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: description.appendText(wanted.toString());
 *  */
    @Test
    public void testDescribeTo_ThrowNullPointerException_1() throws Throwable  {
        Same same = new Same(null);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out2 = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out2, "java.io.OutputStreamWriter", "se", se);
        setField(out1, "java.io.PrintWriter", "out", out2);
        setField(out1, "java.io.Writer", "lock", out2);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock1 = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock1);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock2 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock2);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(printWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = printWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        /* This test fails because method [org.mockito.internal.matchers.Same.describeTo] produces [java.lang.NullPointerException] */
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method describeToMethod = sameClazz.getDeclaredMethod("describeTo", stringDescriptionType);
        describeToMethod.setAccessible(true);
        java.lang.Object[] describeToMethodArguments = new java.lang.Object[1];
        describeToMethodArguments[0] = stringDescription;
        try {
            describeToMethod.invoke(same, describeToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for describeTo
    
    public void testDescribeTo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 53 occurrences of:
        // Concrete execution failed
        
        // 38 occurrences of:
        // Default concrete execution failed
        
        // 21 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @376b4233 */
        
        // 8 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @376b4233 */
        
        // 6 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaLangAccess sun.nio.cs.SingleByte.JLA accessible:
        module java.base does not "opens sun.nio.cs" to unnamed module @376b4233 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.matchers.Same.appendQuoting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendQuoting(org.hamcrest.Description)
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#appendQuoting(org.hamcrest.Description)}
 * @utbot.executesCondition {@code (wanted instanceof String): True}
 * @utbot.invokes {@link org.hamcrest.Description#appendText(java.lang.String)}
 *  */
    @Test
    public void testAppendQuoting_WantedInstanceOfString() throws Exception  {
        String string = "";
        Same same = new Same(string);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(printWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = printWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method appendQuotingMethod = sameClazz.getDeclaredMethod("appendQuoting", stringDescriptionType);
        appendQuotingMethod.setAccessible(true);
        java.lang.Object[] appendQuotingMethodArguments = new java.lang.Object[1];
        appendQuotingMethodArguments[0] = stringDescription;
        appendQuotingMethod.invoke(same, appendQuotingMethodArguments);
        
        Appendable stringDescriptionOut = ((Appendable) getFieldValue(stringDescription, "org.hamcrest.StringDescription", "out"));
        boolean finalStringDescriptionOutTrouble = ((Boolean) getFieldValue(stringDescriptionOut, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalStringDescriptionOutTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendQuoting(org.hamcrest.Description)
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#appendQuoting(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: description.appendText("\"");
 *  */
    @Test(expected = RuntimeException.class)
    public void testAppendQuoting_ThrowRuntimeException() throws Throwable  {
        String string = "";
        Same same = new Same(string);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(outputStreamWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = outputStreamWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method appendQuotingMethod = sameClazz.getDeclaredMethod("appendQuoting", stringDescriptionType);
        appendQuotingMethod.setAccessible(true);
        java.lang.Object[] appendQuotingMethodArguments = new java.lang.Object[1];
        appendQuotingMethodArguments[0] = stringDescription;
        try {
            appendQuotingMethod.invoke(same, appendQuotingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#appendQuoting(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: description.appendText("\"");
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testAppendQuoting_ThrowReadOnlyBufferException() throws Throwable  {
        String string = "";
        Same same = new Same(string);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class fileWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(fileWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = fileWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method appendQuotingMethod = sameClazz.getDeclaredMethod("appendQuoting", stringDescriptionType);
        appendQuotingMethod.setAccessible(true);
        java.lang.Object[] appendQuotingMethodArguments = new java.lang.Object[1];
        appendQuotingMethodArguments[0] = stringDescription;
        try {
            appendQuotingMethod.invoke(same, appendQuotingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#appendQuoting(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: description.appendText("\"");
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testAppendQuoting_ThrowReadOnlyBufferException_1() throws Throwable  {
        String string = "";
        Same same = new Same(string);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class fileWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(fileWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = fileWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method appendQuotingMethod = sameClazz.getDeclaredMethod("appendQuoting", stringDescriptionType);
        appendQuotingMethod.setAccessible(true);
        java.lang.Object[] appendQuotingMethodArguments = new java.lang.Object[1];
        appendQuotingMethodArguments[0] = stringDescription;
        try {
            appendQuotingMethod.invoke(same, appendQuotingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#appendQuoting(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: description.appendText("\"");
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testAppendQuoting_ThrowCoderMalfunctionError() throws Throwable  {
        String string = "";
        Same same = new Same(string);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        AWTCharset.Encoder encoder = ((AWTCharset.Encoder) createInstance("sun.awt.AWTCharset$Encoder"));
        Object enc = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(enc, "java.nio.charset.CharsetEncoder", "state", 3);
        setField(encoder, "sun.awt.AWTCharset$Encoder", "enc", enc);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(outputStreamWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = outputStreamWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method appendQuotingMethod = sameClazz.getDeclaredMethod("appendQuoting", stringDescriptionType);
        appendQuotingMethod.setAccessible(true);
        java.lang.Object[] appendQuotingMethodArguments = new java.lang.Object[1];
        appendQuotingMethodArguments[0] = stringDescription;
        try {
            appendQuotingMethod.invoke(same, appendQuotingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Same}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Same#appendQuoting(org.hamcrest.Description)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: description.appendText("\"");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendQuoting_ThrowIllegalStateException() throws Throwable  {
        String string = "";
        Same same = new Same(string);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Class stringDescriptionClazz = Class.forName("org.hamcrest.StringDescription");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Constructor stringDescriptionConstructor = stringDescriptionClazz.getDeclaredConstructor(printWriterType);
        stringDescriptionConstructor.setAccessible(true);
        java.lang.Object[] stringDescriptionConstructorArguments = new java.lang.Object[1];
        stringDescriptionConstructorArguments[0] = printWriter;
        StringDescription stringDescription = ((StringDescription) stringDescriptionConstructor.newInstance(stringDescriptionConstructorArguments));
        
        Class sameClazz = Class.forName("org.mockito.internal.matchers.Same");
        Class stringDescriptionType = Class.forName("org.hamcrest.Description");
        Method appendQuotingMethod = sameClazz.getDeclaredMethod("appendQuoting", stringDescriptionType);
        appendQuotingMethod.setAccessible(true);
        java.lang.Object[] appendQuotingMethodArguments = new java.lang.Object[1];
        appendQuotingMethodArguments[0] = stringDescription;
        try {
            appendQuotingMethod.invoke(same, appendQuotingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for appendQuoting
    
    public void testAppendQuoting_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 44 occurrences of:
        // Default concrete execution failed
        
        // 38 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @376b4233 */
        
        // 22 occurrences of:
        // Concrete execution failed
        
        // 5 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @376b4233 */
        
        // 4 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @376b4233 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1127693087581900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1127693087581900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1127693087592400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1127693087581900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1127693087592400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1127693089217300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1127693089217300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1127693089219900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1127693089217300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1127693089219900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

