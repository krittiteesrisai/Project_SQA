package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang3_text_translate_NumericEntityUnescaperTest {
    ///region Test suites for executable org.apache.commons.lang3.text.translate.NumericEntityUnescaper.translate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method translate(java.lang.CharSequence, int, java.io.Writer)
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.executesCondition {@code (input.charAt(index) == '&'): False}
 *  */
    @Test
    public void testTranslate_InputCharAtNotEqualsChar() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "  ";
        
        int actual = numericEntityUnescaper.translate(string, 1, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.executesCondition {@code (input.charAt(index) == '&'): True}
 * @utbot.executesCondition {@code (input.charAt(index + 1) == '#'): False}
 *  */
    @Test
    public void testTranslate_InputCharAtNotEqualsChar_1() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "& ";
        
        int actual = numericEntityUnescaper.translate(string, 0, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.executesCondition {@code (input.charAt(index) == '&'): True}
 * @utbot.executesCondition {@code (input.charAt(index + 1) == '#'): True}
 * @utbot.executesCondition {@code (firstChar == 'x'): True}
 * @utbot.executesCondition {@code (isHex): True}
 * @utbot.invokes {@link java.lang.CharSequence#charAt(int)}
 * @utbot.invokes {@link java.lang.CharSequence#subSequence(int,int)}
 * @utbot.invokes {@link java.lang.CharSequence#toString()}
 * @utbot.invokes {@link java.lang.Integer#parseInt(java.lang.String,int)}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testTranslate_CatchNumberFormatException() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "&#x;";
        
        int actual = numericEntityUnescaper.translate(string, 0, null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method translate(java.lang.CharSequence, int, java.io.Writer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (input.charAt(index) == '&'): True}
    /// invoke:
    ///     {@link java.lang.CharSequence#charAt(int)} once
    /// execute conditions:
    ///     {@code (input.charAt(index + 1) == '#'): True},
    ///     {@code (firstChar == 'x'): False},
    ///     {@code (firstChar == 'X'): False}
    /// execute conditions:
    ///     {@code (input.charAt(index + 1) == '#'): True},
    ///     {@code (firstChar == 'x'): False},
    ///     {@code (firstChar == 'X'): False},
    ///     {@code (isHex): False}
    /// invoke:
    ///     {@link java.lang.CharSequence#subSequence(int,int)} once,
    ///     {@link java.lang.CharSequence#toString()} once,
    ///     {@link java.lang.Integer#parseInt(java.lang.String,int)} once
    /// catches exception:
    ///     {@code NumberFormatException nfe}
    /// return from: {@code return 0;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testTranslate_CatchNumberFormatException_1() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "&#;";
        
        int actual = numericEntityUnescaper.translate(string, 0, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(input.charAt(end) != ';')} once
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testTranslate_InputCharAtNotEqualsChar_2() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "&#-;    ";
        
        int actual = numericEntityUnescaper.translate(string, 0, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(input.charAt(end) != ';')} once
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testTranslate_InputCharAtNotEqualsChar_3() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "&#+;    ";
        
        int actual = numericEntityUnescaper.translate(string, 0, null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method translate(java.lang.CharSequence, int, java.io.Writer)
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.invokes {@link java.lang.CharSequence#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: input.charAt(index) == '&' && input.charAt(index + 1) == '#'
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.NumericEntityUnescaper.translate] produces [java.lang.NullPointerException] */
        numericEntityUnescaper.translate(null, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method translate(java.lang.CharSequence, int, java.io.Writer)
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: input.charAt(index) == '&' && input.charAt(index + 1) == '#'
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_ThrowStringIndexOutOfBoundsException() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "  ";
        
        numericEntityUnescaper.translate(string, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.executesCondition {@code (input.charAt(index) == '&'): True}
 * @utbot.executesCondition {@code (input.charAt(index + 1) == '#'): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char firstChar = input.charAt(start);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_ThrowStringIndexOutOfBoundsException_1() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "&#";
        
        numericEntityUnescaper.translate(string, 0, null);
    }
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.executesCondition {@code (input.charAt(index) == '&'): True}
 * @utbot.executesCondition {@code (input.charAt(index + 1) == '#'): True}
 * @utbot.executesCondition {@code (firstChar == 'x'): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(input.charAt(end) != ';')
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_ThrowStringIndexOutOfBoundsException_2() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "    &#x";
        
        numericEntityUnescaper.translate(string, 4, null);
    }
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.executesCondition {@code (input.charAt(index) == '&'): True}
 * @utbot.executesCondition {@code (input.charAt(index + 1) == '#'): True}
 * @utbot.executesCondition {@code (firstChar == 'x'): False}
 * @utbot.executesCondition {@code (firstChar == 'X'): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(input.charAt(end) != ';')
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_ThrowStringIndexOutOfBoundsException_3() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "    &#X";
        
        numericEntityUnescaper.translate(string, 4, null);
    }
    
    /**
    @utbot.classUnderTest {@link NumericEntityUnescaper}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.executesCondition {@code (input.charAt(index) == '&'): True}
 * @utbot.executesCondition {@code (input.charAt(index + 1) == '#'): True}
 * @utbot.executesCondition {@code (firstChar == 'x'): False}
 * @utbot.executesCondition {@code (firstChar == 'X'): False}
 * @utbot.iterates iterate the loop {@code while(input.charAt(end) != ';')} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(input.charAt(end) != ';')
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_ThrowStringIndexOutOfBoundsException_4() throws IOException  {
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper();
        String string = "    &# ";
        
        numericEntityUnescaper.translate(string, 4, null);
    }
    ///endregion
    
    ///endregion
}

