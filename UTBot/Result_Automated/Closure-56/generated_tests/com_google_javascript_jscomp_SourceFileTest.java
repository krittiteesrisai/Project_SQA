package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import com.google.javascript.jscomp.SourceFile.OnDisk;
import java.io.File;
import java.io.StringReader;
import java.io.IOException;
import com.google.javascript.jscomp.SourceFile.Generated;
import com.google.javascript.jscomp.SourceFile.Generator;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import java.io.CharArrayReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_SourceFileTest {
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getName()}
 * @utbot.returnsFrom {@code return fileName;}
 *  */
    @Test
    public void testGetName_ReturnFileName() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        String actual = sourceFile.getName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#toString()}
 * @utbot.returnsFrom {@code return fileName;}
 *  */
    @Test
    public void testToString_ReturnFileName() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        String actual = sourceFile.toString();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.getRegion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRegion(int)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getRegion(int)}
 * @utbot.executesCondition {@code (lineNumber >= endLine): True}
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < SOURCE_EXCERPT_REGION_LENGTH; n++, endLine++)} once
 *  */
    @Test
    public void testGetRegion_LineNumberGreaterOrEqualEndLine() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        Region actual = sourceFile.getRegion(1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getRegion(int)}
 * @utbot.executesCondition {@code (lineNumber >= endLine): True}
 * @utbot.iterates iterate the loop {@code for(int n = 1; n < startLine; n++)} once
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < SOURCE_EXCERPT_REGION_LENGTH; n++, endLine++)} once
 *  */
    @Test
    public void testGetRegion_LineNumberGreaterOrEqualEndLine_1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        Region actual = sourceFile.getRegion(4);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getRegion(int)}
 * @utbot.executesCondition {@code (lineNumber >= endLine): True}
 * @utbot.iterates iterate the loop {@code for(int n = 1; n < startLine; n++)} once
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < SOURCE_EXCERPT_REGION_LENGTH; n++, endLine++)} once
 *  */
    @Test
    public void testGetRegion_LineNumberGreaterOrEqualEndLine_2() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        Region actual = sourceFile.getRegion(4);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getRegion(int)}
 * @utbot.executesCondition {@code (lineNumber >= endLine): True}
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < SOURCE_EXCERPT_REGION_LENGTH; n++, endLine++)} twice
 *  */
    @Test
    public void testGetRegion_LineNumberGreaterOrEqualEndLine_3() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        Region actual = sourceFile.getRegion(2);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getRegion(int)}
 * @utbot.executesCondition {@code (lineNumber >= endLine): False}
 * @utbot.executesCondition {@code (end == -1): True}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < SOURCE_EXCERPT_REGION_LENGTH; n++, endLine++)} once
 * @utbot.returnsFrom {@code return new SimpleRegion(startLine, endLine, js.substring(pos));}
 *  */
    @Test
    public void testGetRegion_StringSubstring() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\u0000";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(0));
        
        SimpleRegion expected = new SimpleRegion(1, 1, code);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getRegion(int)}
 * @utbot.executesCondition {@code (lineNumber >= endLine): False}
 * @utbot.executesCondition {@code (end == -1): True}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < SOURCE_EXCERPT_REGION_LENGTH; n++, endLine++)} twice
 * @utbot.returnsFrom {@code return new SimpleRegion(startLine, endLine, js.substring(pos, last));}
 *  */
    @Test
    public void testGetRegion_StringSubstring_1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(1));
        
        String string = "";
        SimpleRegion expected = new SimpleRegion(1, 2, string);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRegion(int)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getRegion(int)}
 * @utbot.executesCondition {@code (lineNumber >= endLine): False}
 * @utbot.executesCondition {@code (end == -1): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < SOURCE_EXCERPT_REGION_LENGTH; n++, endLine++)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: js.charAt(last) == '\n'
 *  */
    @Test
    public void testGetRegion_ThrowStringIndexOutOfBoundsException() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getRegion] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.google.javascript.jscomp.SourceFile.getRegion(SourceFile.java:288) */
        sourceFile.getRegion(0);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getRegion(int)}
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < SOURCE_EXCERPT_REGION_LENGTH; n++, endLine++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: end = js.indexOf('\n', end);
 *  */
    @Test
    public void testGetRegion_ThrowNullPointerException() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getRegion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile.getRegion(SourceFile.java:277) */
        sourceFile.getRegion(3);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getRegion(int)}
 * @utbot.iterates iterate the loop {@code for(int n = 1; n < startLine; n++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nextpos = js.indexOf('\n', pos);
 *  */
    @Test
    public void testGetRegion_ThrowNullPointerException_1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getRegion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile.getRegion(SourceFile.java:268) */
        sourceFile.getRegion(4);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRegion(int)
    
    @Test
    public void testGetRegion1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\u0000\u0000\u0000\u0000\n\u0000\u0000\u0000";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        Region actual = sourceFile.getRegion(262144);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRegion2() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\u0000\n\u0000\n\n\u0000\u0000";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        Region actual = sourceFile.getRegion(5);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRegion3() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\n\n\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        Region actual = sourceFile.getRegion(4);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRegion4() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\u0000\u0000\u0000\u0000\n\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        Region actual = sourceFile.getRegion(3);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRegion5() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\n\u0000\u0000";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(0));
        
        SimpleRegion expected = new SimpleRegion(1, 2, code);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    
    @Test
    public void testGetRegion6() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\u0000\u0000\u0000\n\u0000\u0000\u0000";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(Integer.MIN_VALUE));
        
        String string = "\u0000\u0000\u0000";
        SimpleRegion expected = new SimpleRegion(2147483646, 2147483646, string);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    
    @Test
    public void testGetRegion7() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\n\n\u0000\n\u0000\u0000\u0000\u0000\u0000";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(Integer.MIN_VALUE));
        
        String string = "\u0000\u0000\u0000\u0000\u0000";
        SimpleRegion expected = new SimpleRegion(2147483646, 2147483646, string);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    
    @Test
    public void testGetRegion8() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(Integer.MIN_VALUE));
        
        SimpleRegion expected = new SimpleRegion(2147483646, 2147483646, code);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    
    @Test
    public void testGetRegion9() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\n\u0000\n\n\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(-2145386496));
        
        SimpleRegion expected = new SimpleRegion(1, 4, code);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    
    @Test
    public void testGetRegion10() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\n\n\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(0));
        
        String string = "\n\n";
        SimpleRegion expected = new SimpleRegion(1, 4, string);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    
    @Test
    public void testGetRegion11() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\u0000\u0000\u0000\n\u0000\n\u0000";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(0));
        
        SimpleRegion expected = new SimpleRegion(1, 3, code);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    
    @Test
    public void testGetRegion12() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\u0000\u0000\n\u0000\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        SimpleRegion actual = ((SimpleRegion) sourceFile.getRegion(0));
        
        String string = "\u0000\u0000\n\u0000";
        SimpleRegion expected = new SimpleRegion(1, 3, string);
        
        int expectedBeginningLineNumber = expected.getBeginningLineNumber();
        int actualBeginningLineNumber = actual.getBeginningLineNumber();
        assertEquals(expectedBeginningLineNumber, actualBeginningLineNumber);
        
        int expectedEndingLineNumber = expected.getEndingLineNumber();
        int actualEndingLineNumber = actual.getEndingLineNumber();
        assertEquals(expectedEndingLineNumber, actualEndingLineNumber);
        
        String expectedSource = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SimpleRegion", "source"));
        String actualSource = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SimpleRegion", "source"));
        assertEquals(expectedSource, actualSource);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRegion(int)
    
    @Test
    public void testGetRegion13() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "\u0000\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getRegion] produces [java.lang.StringIndexOutOfBoundsException: begin 2, end 1, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            com.google.javascript.jscomp.SourceFile.getRegion(SourceFile.java:290) */
        sourceFile.getRegion(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.getCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCode()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getCode()}
 * @utbot.returnsFrom {@code return code;}
 *  */
    @Test
    public void testGetCode_ReturnCode() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        String actual = sourceFile.getCode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.setCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#setCode(java.lang.String)}
 *  */
    @Test
    public void testSetCode() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        Class sourceFileClazz = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class stringType = Class.forName("java.lang.String");
        Method setCodeMethod = sourceFileClazz.getDeclaredMethod("setCode", stringType);
        setCodeMethod.setAccessible(true);
        java.lang.Object[] setCodeMethodArguments = new java.lang.Object[1];
        setCodeMethodArguments[0] = ((Object) null);
        setCodeMethod.invoke(sourceFile, setCodeMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.getNumLines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumLines()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getNumLines()}
 * @utbot.executesCondition {@code (lineOffsets == null): False}
 * @utbot.returnsFrom {@code return lineOffsets.length;}
 *  */
    @Test
    public void testGetNumLines_LineOffsetsNotEqualsNull() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        int[] lineOffsets = {1};
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lineOffsets", lineOffsets);
        
        int actual = sourceFile.getNumLines();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNumLines()
    
    @Test
    public void testGetNumLines1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        int[] initialSourceFileLineOffsets = ((int[]) getFieldValue(sourceFile, "com.google.javascript.jscomp.SourceFile", "lineOffsets"));
        
        int actual = sourceFile.getNumLines();
        
        assertEquals(1, actual);
        
        int[] finalSourceFileLineOffsets = ((int[]) getFieldValue(sourceFile, "com.google.javascript.jscomp.SourceFile", "lineOffsets"));
        
        assertFalse(initialSourceFileLineOffsets == finalSourceFileLineOffsets);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNumLines()
    
    @Test
    public void testGetNumLines2() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getNumLines] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile.findLineOffsets(SourceFile.java:119)
            com.google.javascript.jscomp.SourceFile.getNumLines(SourceFile.java:112) */
        sourceFile.getNumLines();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.hasSourceInMemory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasSourceInMemory()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#hasSourceInMemory()}
 * @utbot.returnsFrom {@code return code != null;}
 *  */
    @Test
    public void testHasSourceInMemory_CodeEqualsNull() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        boolean actual = sourceFile.hasSourceInMemory();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#hasSourceInMemory()}
 * @utbot.returnsFrom {@code return code != null;}
 *  */
    @Test
    public void testHasSourceInMemory_CodeNotEqualsNull() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        boolean actual = sourceFile.hasSourceInMemory();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.setIsExtern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setIsExtern(boolean)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#setIsExtern(boolean)}
 *  */
    @Test
    public void testSetIsExtern() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        sourceFile.setIsExtern(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.getLineOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLineOffset(int)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLineOffset(int)}
 * @utbot.executesCondition {@code (lineOffsets == null): False}
 * @utbot.executesCondition {@code (lineno < 1): False}
 * @utbot.executesCondition {@code (lineno > lineOffsets.length): False}
 * @utbot.returnsFrom {@code return lineOffsets[lineno - 1];}
 *  */
    @Test
    public void testGetLineOffset_LinenoLessOrEqualLineOffsetsLength() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        int[] lineOffsets = {1};
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lineOffsets", lineOffsets);
        
        int actual = sourceFile.getLineOffset(1);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLineOffset(int)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLineOffset(int)}
 * @utbot.executesCondition {@code (lineOffsets == null): True}
 * @utbot.invokes com.google.javascript.jscomp.SourceFile#findLineOffsets()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findLineOffsets();
 *  */
    @Test
    public void testGetLineOffset_ThrowNullPointerException() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getLineOffset] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile.findLineOffsets(SourceFile.java:119)
            com.google.javascript.jscomp.SourceFile.getLineOffset(SourceFile.java:99) */
        sourceFile.getLineOffset(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLineOffset(int)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLineOffset(int)}
 * @utbot.executesCondition {@code (lineno < 1): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: lineno < 1 || lineno > lineOffsets.length
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLineOffset_ThrowIllegalArgumentException() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        int[] lineOffsets = {-255};
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lineOffsets", lineOffsets);
        
        sourceFile.getLineOffset(0);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLineOffset(int)}
 * @utbot.executesCondition {@code (lineno < 1): False}
 * @utbot.executesCondition {@code (lineno > lineOffsets.length): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: lineno < 1 || lineno > lineOffsets.length
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLineOffset_ThrowIllegalArgumentException_1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        int[] lineOffsets = {};
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lineOffsets", lineOffsets);
        
        sourceFile.getLineOffset(1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLineOffset(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetLineOffset1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        sourceFile.getLineOffset(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.findLineOffsets
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findLineOffsets()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#findLineOffsets()}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceFile#getCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String[] sourceLines = getCode().split("\n");
 *  */
    @Test
    public void testFindLineOffsets_ThrowNullPointerException() throws Throwable  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.findLineOffsets] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile.findLineOffsets(SourceFile.java:119) */
        Class sourceFileClazz = Class.forName("com.google.javascript.jscomp.SourceFile");
        Method findLineOffsetsMethod = sourceFileClazz.getDeclaredMethod("findLineOffsets");
        findLineOffsetsMethod.setAccessible(true);
        java.lang.Object[] findLineOffsetsMethodArguments = new java.lang.Object[0];
        try {
            findLineOffsetsMethod.invoke(sourceFile, findLineOffsetsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findLineOffsets()
    
    @Test
    public void testFindLineOffsets1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        Class sourceFileClazz = Class.forName("com.google.javascript.jscomp.SourceFile");
        Method findLineOffsetsMethod = sourceFileClazz.getDeclaredMethod("findLineOffsets");
        findLineOffsetsMethod.setAccessible(true);
        java.lang.Object[] findLineOffsetsMethodArguments = new java.lang.Object[0];
        findLineOffsetsMethod.invoke(sourceFile, findLineOffsetsMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.isExtern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExtern()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#isExtern()}
 * @utbot.returnsFrom {@code return isExternFile;}
 *  */
    @Test
    public void testIsExtern_ReturnIsExternFile() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        boolean actual = sourceFile.isExtern();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.setOriginalPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOriginalPath(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#setOriginalPath(java.lang.String)}
 *  */
    @Test
    public void testSetOriginalPath() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        sourceFile.setOriginalPath(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.getOriginalPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOriginalPath()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getOriginalPath()}
 * @utbot.executesCondition {@code (originalPath != null): True}
 * @utbot.returnsFrom {@code return originalPath != null ? originalPath : fileName;}
 *  */
    @Test
    public void testGetOriginalPath_OriginalPathNotEqualsNull() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String originalPath = "";
        sourceFile.setOriginalPath(originalPath);
        
        String actual = sourceFile.getOriginalPath();
        
        assertEquals(originalPath, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getOriginalPath()}
 * @utbot.executesCondition {@code (originalPath != null): False}
 * @utbot.returnsFrom {@code return originalPath != null ? originalPath : fileName;}
 *  */
    @Test
    public void testGetOriginalPath_OriginalPathEqualsNull() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        String actual = sourceFile.getOriginalPath();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromFile
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fromFile(java.lang.String, java.nio.charset.Charset)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.lang.String,java.nio.charset.Charset)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return fromFile(new File(fileName), c);
 *  */
    @Test
    public void testFromFile_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.fromFile] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            com.google.javascript.jscomp.SourceFile.fromFile(SourceFile.java:305) */
        SourceFile.fromFile(((String) null), ((Charset) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fromFile(java.lang.String, java.nio.charset.Charset)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.lang.String,java.nio.charset.Charset)}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceFile#fromFile(java.io.File,java.nio.charset.Charset)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return fromFile(new File(fileName), c);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromFile_ThrowIllegalArgumentException() {
        String string = "";
        
        SourceFile.fromFile(string, ((Charset) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method fromFile(java.lang.String, java.nio.charset.Charset)
    
    @Test
    public void testFromFile1() throws Exception  {
        String string = ":\u0000\u0000\u0000\u0000\u0000\u0000";
        
        SourceFile.OnDisk actual = ((SourceFile.OnDisk) SourceFile.fromFile(string, ((Charset) null)));
        
        SourceFile.OnDisk expected = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        File file = ((File) createInstance("java.io.File"));
        setField(expected, "com.google.javascript.jscomp.SourceFile$OnDisk", "file", file);
        String inputCharset = "UTF-8";
        expected.inputCharset = inputCharset;
        setField(expected, "com.google.javascript.jscomp.SourceFile", "fileName", string);
        setField(expected, "com.google.javascript.jscomp.SourceFile", "lastLine", 1);
        
        File expectedFile = ((File) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile$OnDisk", "file"));
        File actualFile = ((File) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile$OnDisk", "file"));
        // java.io.File has overridden equals method
        assertEquals(expectedFile, actualFile);
        
        String expectedInputCharset = expected.inputCharset;
        String actualInputCharset = actual.inputCharset;
        assertEquals(expectedInputCharset, actualInputCharset);
        
        String expectedFileName = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "fileName"));
        String actualFileName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "fileName"));
        assertEquals(expectedFileName, actualFileName);
        
        boolean actualIsExternFile = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "isExternFile"));
        assertFalse(actualIsExternFile);
        
        String actualOriginalPath = actual.getOriginalPath();
        assertNull(actualOriginalPath);
        
        int[] actualLineOffsets = ((int[]) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lineOffsets"));
        assertNull(actualLineOffsets);
        
        int expectedLastOffset = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        int actualLastOffset = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        assertEquals(expectedLastOffset, actualLastOffset);
        
        int expectedLastLine = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        int actualLastLine = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        assertEquals(expectedLastLine, actualLastLine);
        
        String actualCode = actual.getCode();
        assertNull(actualCode);
        
    }
    ///endregion
    
    ///region Errors report for fromFile
    
    public void testFromFile_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 49 occurrences of:
        // Concrete execution failed
        
        // 6 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromFile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fromFile(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceFile#fromFile(java.io.File)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return fromFile(new File(fileName));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromFile_ThrowIllegalArgumentException1() {
        String string = "";
        
        SourceFile.fromFile(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fromFile(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return fromFile(new File(fileName));
 *  */
    @Test
    public void testFromFile_ThrowNullPointerException1() {
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.fromFile] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            com.google.javascript.jscomp.SourceFile.fromFile(SourceFile.java:309) */
        SourceFile.fromFile(((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method fromFile(java.lang.String)
    
    @Test
    public void testFromFile2() throws Exception  {
        String string = "/\\";
        
        SourceFile.OnDisk actual = ((SourceFile.OnDisk) SourceFile.fromFile(string));
        
        SourceFile.OnDisk expected = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        File file = ((File) createInstance("java.io.File"));
        setField(expected, "com.google.javascript.jscomp.SourceFile$OnDisk", "file", file);
        String inputCharset = "UTF-8";
        expected.inputCharset = inputCharset;
        String fileName = "\\\\";
        setField(expected, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(expected, "com.google.javascript.jscomp.SourceFile", "lastLine", 1);
        
        File expectedFile = ((File) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile$OnDisk", "file"));
        File actualFile = ((File) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile$OnDisk", "file"));
        // java.io.File has overridden equals method
        assertEquals(expectedFile, actualFile);
        
        String expectedInputCharset = expected.inputCharset;
        String actualInputCharset = actual.inputCharset;
        assertEquals(expectedInputCharset, actualInputCharset);
        
        String expectedFileName = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "fileName"));
        String actualFileName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "fileName"));
        assertEquals(expectedFileName, actualFileName);
        
        boolean actualIsExternFile = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "isExternFile"));
        assertFalse(actualIsExternFile);
        
        String actualOriginalPath = actual.getOriginalPath();
        assertNull(actualOriginalPath);
        
        int[] actualLineOffsets = ((int[]) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lineOffsets"));
        assertNull(actualLineOffsets);
        
        int expectedLastOffset = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        int actualLastOffset = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        assertEquals(expectedLastOffset, actualLastOffset);
        
        int expectedLastLine = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        int actualLastLine = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        assertEquals(expectedLastLine, actualLastLine);
        
        String actualCode = actual.getCode();
        assertNull(actualCode);
        
    }
    ///endregion
    
    ///region Errors report for fromFile
    
    public void testFromFile_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromFile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fromFile(java.io.File, java.nio.charset.Charset)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.io.File,java.nio.charset.Charset)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new OnDisk(file, c);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromFile_ThrowIllegalArgumentException2() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        
        SourceFile.fromFile(file, ((Charset) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.io.File,java.nio.charset.Charset)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new OnDisk(file, c);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromFile_ThrowIllegalArgumentException_1() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        String path = "";
        setField(file, "java.io.File", "path", path);
        
        SourceFile.fromFile(file, ((Charset) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method fromFile(java.io.File, java.nio.charset.Charset)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.SourceFile}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.io.File,java.nio.charset.Charset)}
     */
    @Test
    public void testFromFileThrowsNPE() {
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.fromFile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile$OnDisk.<init>(SourceFile.java:428)
            com.google.javascript.jscomp.SourceFile$OnDisk.<init>(SourceFile.java:420)
            com.google.javascript.jscomp.SourceFile.fromFile(SourceFile.java:313) */
        SourceFile.fromFile(((File) null), ((Charset) null));
    }
    ///endregion
    
    ///region Errors report for fromFile
    
    public void testFromFile_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromFile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fromFile(java.io.File)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.io.File)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new OnDisk(file);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromFile_ThrowIllegalArgumentException3() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        String path = "";
        setField(file, "java.io.File", "path", path);
        
        SourceFile.fromFile(file);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.io.File)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new OnDisk(file);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromFile_ThrowIllegalArgumentException_11() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        
        SourceFile.fromFile(file);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method fromFile(java.io.File)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.SourceFile}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromFile(java.io.File)}
     */
    @Test
    public void testFromFileThrowsNPE1() {
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.fromFile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile$OnDisk.<init>(SourceFile.java:428)
            com.google.javascript.jscomp.SourceFile.fromFile(SourceFile.java:317) */
        SourceFile.fromFile(((File) null));
    }
    ///endregion
    
    ///region Errors report for fromFile
    
    public void testFromFile_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.getCodeNoCache
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCodeNoCache()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getCodeNoCache()}
 * @utbot.returnsFrom {@code return code;}
 *  */
    @Test
    public void testGetCodeNoCache_ReturnCode() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        String actual = sourceFile.getCodeNoCache();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.getCodeReader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCodeReader()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getCodeReader()}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceFile#getCode()}
 * @utbot.returnsFrom {@code return new StringReader(getCode());}
 *  */
    @Test
    public void testGetCodeReader_SourceFileGetCode() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = " ";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        StringReader actual = ((StringReader) sourceFile.getCodeReader());
        
        StringReader expected = ((StringReader) createInstance("java.io.StringReader"));
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getCodeReader()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.SourceFile}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getCodeReader()}
     */
    @Test
    public void testGetCodeReaderThrowsNPE() throws IOException  {
        SourceFile sourceFile = new SourceFile("abc");
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getCodeReader] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.<init>(StringReader.java:51)
            com.google.javascript.jscomp.SourceFile.getCodeReader(SourceFile.java:147) */
        sourceFile.getCodeReader();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.getLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLine(int)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLine(int)}
 * @utbot.executesCondition {@code (lineNumber >= lastLine): False}
 * @utbot.executesCondition {@code (js.indexOf('\n', pos) == -1): True}
 *  */
    @Test
    public void testGetLine_JsIndexOfEqualsNegative1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", 2);
        String code = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        String actual = sourceFile.getLine(1);
        
        assertNull(actual);
        
        int finalSourceFileLastLine = ((Integer) getFieldValue(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        
        assertEquals(1, finalSourceFileLastLine);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLine(int)}
 * @utbot.executesCondition {@code (lineNumber >= lastLine): False}
 * @utbot.iterates iterate the loop {@code for(int n = startLine; n < lineNumber; n++)} once
 *  */
    @Test
    public void testGetLine_NextposEqualsNegative1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", 3);
        String code = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        String actual = sourceFile.getLine(2);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLine(int)}
 * @utbot.executesCondition {@code (lineNumber >= lastLine): True}
 * @utbot.executesCondition {@code (js.indexOf('\n', pos) == -1): True}
 * @utbot.iterates iterate the loop {@code for(int n = startLine; n < lineNumber; n++)} once
 *  */
    @Test
    public void testGetLine_NextposNotEqualsNegative1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastOffset", -1);
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", 255);
        String code = "\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        String actual = sourceFile.getLine(256);
        
        assertNull(actual);
        
        int finalSourceFileLastOffset = ((Integer) getFieldValue(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        int finalSourceFileLastLine = ((Integer) getFieldValue(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        
        assertEquals(1, finalSourceFileLastOffset);
        
        assertEquals(256, finalSourceFileLastLine);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLine(int)}
 * @utbot.executesCondition {@code (lineNumber >= lastLine): True}
 * @utbot.executesCondition {@code (js.indexOf('\n', pos) == -1): False}
 * @utbot.invokes {@link java.lang.String#indexOf(int,int)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return js.substring(pos, js.indexOf('\n', pos));}
 *  */
    @Test
    public void testGetLine_JsIndexOfNotEqualsNegative1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", -6);
        String code = "\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        String actual = sourceFile.getLine(-6);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLine(int)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLine(int)}
 * @utbot.executesCondition {@code (lineNumber >= lastLine): True}
 * @utbot.executesCondition {@code (js.indexOf('\n', pos) == -1): False}
 * @utbot.invokes {@link java.lang.String#indexOf(int,int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int,int)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return js.substring(pos, js.indexOf('\n', pos));
 *  */
    @Test
    public void testGetLine_ThrowStringIndexOutOfBoundsException() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastOffset", -1);
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", -6);
        String code = "\n";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getLine] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            com.google.javascript.jscomp.SourceFile.getLine(SourceFile.java:244) */
        sourceFile.getLine(-6);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLine(int)}
 * @utbot.executesCondition {@code (lineNumber >= lastLine): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: js.indexOf('\n', pos) == -1
 *  */
    @Test
    public void testGetLine_ThrowNullPointerException() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", 2);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getLine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile.getLine(SourceFile.java:238) */
        sourceFile.getLine(1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLine(int)}
 * @utbot.executesCondition {@code (lineNumber >= lastLine): False}
 * @utbot.iterates iterate the loop {@code for(int n = startLine; n < lineNumber; n++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nextpos = js.indexOf('\n', pos);
 *  */
    @Test
    public void testGetLine_ThrowNullPointerException_1() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", 3);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getLine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile.getLine(SourceFile.java:227) */
        sourceFile.getLine(2);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#getLine(int)}
 * @utbot.executesCondition {@code (lineNumber >= lastLine): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: js.indexOf('\n', pos) == -1
 *  */
    @Test
    public void testGetLine_ThrowNullPointerException_2() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastOffset", -255);
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", -2);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.getLine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceFile.getLine(SourceFile.java:238) */
        sourceFile.getLine(-2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.clearCachedSource
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearCachedSource()
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#clearCachedSource()}
 *  */
    @Test
    public void testClearCachedSource() throws Exception  {
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        
        sourceFile.clearCachedSource();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fromGenerator(java.lang.String, com.google.javascript.jscomp.SourceFile$Generator)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromGenerator(java.lang.String,com.google.javascript.jscomp.SourceFile.Generator)}
 * @utbot.returnsFrom {@code return new Generated(fileName, generator);}
 *  */
    @Test
    public void testFromGenerator_Return() throws Exception  {
        String string = " ";
        
        SourceFile.Generated actual = ((SourceFile.Generated) SourceFile.fromGenerator(string, null));
        
        SourceFile.Generated expected = ((SourceFile.Generated) createInstance("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(expected, "com.google.javascript.jscomp.SourceFile", "fileName", string);
        setField(expected, "com.google.javascript.jscomp.SourceFile", "lastLine", 1);
        
        SourceFile.Generator actualGenerator = ((SourceFile.Generator) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile$Generated", "generator"));
        assertNull(actualGenerator);
        
        String expectedFileName = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "fileName"));
        String actualFileName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "fileName"));
        assertEquals(expectedFileName, actualFileName);
        
        boolean actualIsExternFile = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "isExternFile"));
        assertFalse(actualIsExternFile);
        
        String actualOriginalPath = actual.getOriginalPath();
        assertNull(actualOriginalPath);
        
        int[] actualLineOffsets = ((int[]) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lineOffsets"));
        assertNull(actualLineOffsets);
        
        int expectedLastOffset = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        int actualLastOffset = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        assertEquals(expectedLastOffset, actualLastOffset);
        
        int expectedLastLine = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        int actualLastLine = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        assertEquals(expectedLastLine, actualLastLine);
        
        String actualCode = actual.getCode();
        assertNull(actualCode);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fromGenerator(java.lang.String, com.google.javascript.jscomp.SourceFile$Generator)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromGenerator(java.lang.String,com.google.javascript.jscomp.SourceFile.Generator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Generated(fileName, generator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromGenerator_ThrowIllegalArgumentException() {
        SourceFile.fromGenerator(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromGenerator(java.lang.String,com.google.javascript.jscomp.SourceFile.Generator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Generated(fileName, generator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromGenerator_ThrowIllegalArgumentException_1() {
        String string = "";
        
        SourceFile.fromGenerator(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromInputStream
    
    ///region Errors report for fromInputStream
    
    public void testFromInputStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromInputStream
    
    ///region FUZZER: ERROR SUITE for method fromInputStream(java.lang.String, java.io.InputStream)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.SourceFile}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromInputStream(java.lang.String,java.io.InputStream)}
     */
    @Test
    public void testFromInputStreamThrowsNPEWithBlankString() throws IOException  {
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.fromInputStream] produces [java.lang.NullPointerException]
            java.base/java.io.Reader.<init>(Reader.java:168)
            java.base/java.io.InputStreamReader.<init>(InputStreamReader.java:112)
            com.google.javascript.jscomp.SourceFile.fromInputStream(SourceFile.java:331) */
        SourceFile.fromInputStream("\t\n\r", null);
    }
    ///endregion
    
    ///region Errors report for fromInputStream
    
    public void testFromInputStream_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fromCode(java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromCode(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return new Preloaded(fileName, originalPath, code);}
 *  */
    @Test
    public void testFromCode_Return() throws Exception  {
        String string = " ";
        
        SourceFile.Preloaded actual = ((SourceFile.Preloaded) SourceFile.fromCode(string, null, null));
        
        SourceFile.Preloaded expected = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(expected, "com.google.javascript.jscomp.SourceFile", "fileName", string);
        setField(expected, "com.google.javascript.jscomp.SourceFile", "lastLine", 1);
        
        String expectedFileName = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "fileName"));
        String actualFileName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "fileName"));
        assertEquals(expectedFileName, actualFileName);
        
        boolean actualIsExternFile = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "isExternFile"));
        assertFalse(actualIsExternFile);
        
        String actualOriginalPath = actual.getOriginalPath();
        assertNull(actualOriginalPath);
        
        int[] actualLineOffsets = ((int[]) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lineOffsets"));
        assertNull(actualLineOffsets);
        
        int expectedLastOffset = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        int actualLastOffset = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        assertEquals(expectedLastOffset, actualLastOffset);
        
        int expectedLastLine = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        int actualLastLine = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        assertEquals(expectedLastLine, actualLastLine);
        
        String actualCode = actual.getCode();
        assertNull(actualCode);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fromCode(java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromCode(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Preloaded(fileName, originalPath, code);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromCode_ThrowIllegalArgumentException() {
        SourceFile.fromCode(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromCode(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Preloaded(fileName, originalPath, code);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromCode_ThrowIllegalArgumentException_1() {
        String string = "";
        
        SourceFile.fromCode(string, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fromCode(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromCode(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return new Preloaded(fileName, code);}
 *  */
    @Test
    public void testFromCode_Return1() throws Exception  {
        String string = " ";
        
        SourceFile.Preloaded actual = ((SourceFile.Preloaded) SourceFile.fromCode(string, null));
        
        SourceFile.Preloaded expected = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(expected, "com.google.javascript.jscomp.SourceFile", "fileName", string);
        expected.setOriginalPath(string);
        setField(expected, "com.google.javascript.jscomp.SourceFile", "lastLine", 1);
        
        String expectedFileName = ((String) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "fileName"));
        String actualFileName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "fileName"));
        assertEquals(expectedFileName, actualFileName);
        
        boolean actualIsExternFile = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "isExternFile"));
        assertFalse(actualIsExternFile);
        
        String expectedOriginalPath = expected.getOriginalPath();
        String actualOriginalPath = actual.getOriginalPath();
        assertEquals(expectedOriginalPath, actualOriginalPath);
        
        int[] actualLineOffsets = ((int[]) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lineOffsets"));
        assertNull(actualLineOffsets);
        
        int expectedLastOffset = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        int actualLastOffset = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        assertEquals(expectedLastOffset, actualLastOffset);
        
        int expectedLastLine = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        int actualLastLine = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        assertEquals(expectedLastLine, actualLastLine);
        
        String actualCode = actual.getCode();
        assertNull(actualCode);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fromCode(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromCode(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Preloaded(fileName, code);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromCode_ThrowIllegalArgumentException1() {
        SourceFile.fromCode(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceFile}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromCode(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Preloaded(fileName, code);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromCode_ThrowIllegalArgumentException_11() {
        String string = "";
        
        SourceFile.fromCode(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceFile.fromReader
    
    ///region FUZZER: ERROR SUITE for method fromReader(java.lang.String, java.io.Reader)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.SourceFile}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromReader(java.lang.String,java.io.Reader)}
     */
    @Test
    public void testFromReaderThrowsNPEWithBlankString() throws IOException  {
        /* This test fails because method [com.google.javascript.jscomp.SourceFile.fromReader] produces [java.lang.NullPointerException]
            com.google.common.io.CharStreams.copy(CharStreams.java:202)
            com.google.common.io.CharStreams.toStringBuilder(CharStreams.java:248)
            com.google.common.io.CharStreams.toString(CharStreams.java:222)
            com.google.javascript.jscomp.SourceFile.fromReader(SourceFile.java:343) */
        SourceFile.fromReader("\n\r", null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fromReader(java.lang.String, java.io.Reader)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.SourceFile}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceFile#fromReader(java.lang.String,java.io.Reader)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFromReaderThrowsIAEWithEmptyString() throws IOException  {
        char[] charArray = {'?', '', '\u0000', '', '\u0000'};
        CharArrayReader charArrayReader = new CharArrayReader(charArray);
        
        SourceFile.fromReader("", charArrayReader);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields893031097255000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields893031097255000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass893031097260600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields893031097255000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass893031097260600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields893031097692000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields893031097692000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass893031097693200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields893031097692000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass893031097693200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

