package org.apache.commons.lang;

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang_BooleanUtilsTest {
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toString(java.lang.Boolean,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): False}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? trueString : falseString;}
 *  */
    @Test
    public void testToString_NotBoolBooleanValue() {
        Boolean boolean1 = false;
        
        String actual = BooleanUtils.toString(boolean1, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toString(java.lang.Boolean,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return nullString;}
 *  */
    @Test
    public void testToString_BoolEqualsNull() {
        String actual = BooleanUtils.toString(null, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toString(java.lang.Boolean,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): True}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? trueString : falseString;}
 *  */
    @Test
    public void testToString_BoolBooleanValue() {
        Boolean boolean1 = true;
        
        String actual = BooleanUtils.toString(boolean1, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString(boolean, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toString(boolean,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (bool): True}
 * @utbot.returnsFrom {@code return bool ? trueString : falseString;}
 *  */
    @Test
    public void testToString_Bool() {
        String actual = BooleanUtils.toString(true, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toString(boolean,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (bool): False}
 * @utbot.returnsFrom {@code return bool ? trueString : falseString;}
 *  */
    @Test
    public void testToString_NotBool() {
        String actual = BooleanUtils.toString(false, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBoolean(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): False}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? true : false;}
 *  */
    @Test
    public void testToBoolean_NotBoolBooleanValue() {
        Boolean boolean1 = false;
        
        boolean actual = BooleanUtils.toBoolean(boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): True}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? true : false;}
 *  */
    @Test
    public void testToBoolean_BoolBooleanValue() {
        Boolean boolean1 = true;
        
        boolean actual = BooleanUtils.toBoolean(boolean1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testToBoolean_BoolEqualsNull() {
        boolean actual = BooleanUtils.toBoolean(((Boolean) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBoolean(int)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.returnsFrom {@code return value == 0 ? false : true;}
 *  */
    @Test
    public void testToBoolean_ValueNotEqualsZero() {
        boolean actual = BooleanUtils.toBoolean(1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(int)}
 * @utbot.executesCondition {@code (value == 0): True}
 * @utbot.returnsFrom {@code return value == 0 ? false : true;}
 *  */
    @Test
    public void testToBoolean_ValueEqualsZero() {
        boolean actual = BooleanUtils.toBoolean(0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBoolean(int, int, int)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(int,int,int)}
 * @utbot.executesCondition {@code (value == trueValue): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testToBoolean_ValueEqualsTrueValue() {
        boolean actual = BooleanUtils.toBoolean(2, 2, -255);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(int,int,int)}
 * @utbot.executesCondition {@code (value == trueValue): False}
 * @utbot.executesCondition {@code (value == falseValue): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testToBoolean_ValueEqualsFalseValue() {
        boolean actual = BooleanUtils.toBoolean(1, 2, 1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toBoolean(int, int, int)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(int,int,int)}
 * @utbot.executesCondition {@code (value == trueValue): False}
 * @utbot.executesCondition {@code (value == falseValue): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The Integer did not match either specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_ThrowIllegalArgumentException() {
        BooleanUtils.toBoolean(254, 1, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBoolean(java.lang.Integer, java.lang.Integer, java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (trueValue == null): True}
 *  */
    @Test
    public void testToBoolean_TrueValueEqualsNull() {
        boolean actual = BooleanUtils.toBoolean(((Integer) null), ((Integer) null), ((Integer) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (trueValue == null): False}
 * @utbot.executesCondition {@code (falseValue == null): True}
 *  */
    @Test
    public void testToBoolean_FalseValueEqualsNull() {
        Integer integer = 0;
        
        boolean actual = BooleanUtils.toBoolean(((Integer) null), integer, ((Integer) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(trueValue)): True}
 *  */
    @Test
    public void testToBoolean_ValueEquals() {
        Integer integer = -255;
        
        boolean actual = BooleanUtils.toBoolean(integer, integer, ((Integer) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(trueValue)): False}
 * @utbot.executesCondition {@code (value.equals(falseValue)): True}
 * @utbot.invokes {@link java.lang.Integer#equals(java.lang.Object)}
 *  */
    @Test
    public void testToBoolean_ValueEquals_1() {
        Integer integer = -255;
        
        boolean actual = BooleanUtils.toBoolean(integer, ((Integer) null), integer);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toBoolean(java.lang.Integer, java.lang.Integer, java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(trueValue)): False}
 * @utbot.executesCondition {@code (value.equals(falseValue)): False}
 * @utbot.invokes {@link java.lang.Integer#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Integer#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The Integer did not match either specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_ThrowIllegalArgumentException1() {
        Integer integer = 0;
        
        BooleanUtils.toBoolean(integer, ((Integer) null), ((Integer) null));
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (trueValue == null): False}
 * @utbot.executesCondition {@code (falseValue == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The Integer did not match either specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_ThrowIllegalArgumentException_1() {
        Integer integer = 0;
        Integer integer1 = 0;
        
        BooleanUtils.toBoolean(((Integer) null), integer, integer1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBoolean(java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.executesCondition {@code (trueString == null): True}
 *  */
    @Test
    public void testToBoolean_TrueStringEqualsNull() {
        boolean actual = BooleanUtils.toBoolean(((String) null), ((String) null), ((String) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.executesCondition {@code (trueString == null): False}
 * @utbot.executesCondition {@code (falseString == null): True}
 *  */
    @Test
    public void testToBoolean_FalseStringEqualsNull() {
        String string = "";
        
        boolean actual = BooleanUtils.toBoolean(((String) null), string, ((String) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.equals(trueString)): True}
 *  */
    @Test
    public void testToBoolean_StrEquals() {
        String string = " ";
        
        boolean actual = BooleanUtils.toBoolean(string, string, ((String) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.equals(trueString)): False}
 * @utbot.executesCondition {@code (str.equals(falseString)): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testToBoolean_StrEquals_1() {
        String string = " ";
        
        boolean actual = BooleanUtils.toBoolean(string, ((String) null), string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toBoolean(java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.equals(trueString)): False}
 * @utbot.executesCondition {@code (str.equals(falseString)): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The String did not match either specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_ThrowIllegalArgumentException2() {
        String string = " ";
        
        BooleanUtils.toBoolean(string, ((String) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.executesCondition {@code (trueString == null): False}
 * @utbot.executesCondition {@code (falseString == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The String did not match either specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_ThrowIllegalArgumentException_11() {
        String string = "";
        String string1 = "";
        
        BooleanUtils.toBoolean(((String) null), string, string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method toBoolean(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (str == null): False}
    /// invoke:
    ///     {@link java.lang.String#length()} once
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (ch == 'y'): False}
 * @utbot.executesCondition {@code (ch == 'Y'): False}
 * @utbot.executesCondition {@code (ch == 't'): False}
 * @utbot.executesCondition {@code (ch == 'T'): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.activatesSwitch {@code switch(str.length()) case: 3}
 *  */
    @Test
    public void testToBoolean_ChNotEqualsY() {
        String string = "   ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.activatesSwitch {@code switch(str.length())}
 *  */
    @Test
    public void testToBoolean_SwitchStrLength() {
        String string = " ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (ch == 't'): False}
 * @utbot.executesCondition {@code (ch == 'T'): False}
 * @utbot.activatesSwitch {@code switch(str.length()) case: 4}
 *  */
    @Test
    public void testToBoolean_SwitchStrLengthCase4() {
        String string = "    ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method toBoolean(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToBoolean_StrEqualsNull() {
        boolean actual = BooleanUtils.toBoolean(((String) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return (ch0 == 'o' || ch0 == 'O') && (ch1 == 'n' || ch1 == 'N');}
 *  */
    @Test
    public void testToBoolean_Ch0NotEqualsOOrCh0NotEqualsOAndCh1NotEqualsNOrCh1NotEqualsN() {
        String string = "  ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return (ch0 == 'o' || ch0 == 'O') && (ch1 == 'n' || ch1 == 'N');}
 *  */
    @Test
    public void testToBoolean_Ch0NotEqualsOOrCh0NotEqualsOAndCh1NotEqualsNOrCh1NotEqualsN_1() {
        String string = "O ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E')): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsROrStrCharAtNotEqualsRAndStrCharAtNotEqualsUOrStrCharAtNotEqualsUAndStrCharAtNotEqualsEOrStrCharAtNotEqualsE() {
        String string = "t   ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E')): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'u' || str.charAt(2) == 'U')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'u' || str.charAt(2) == 'U')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsROrStrCharAtEqualsRAndStrCharAtEqualsUOrStrCharAtEqualsUAndStrCharAtEqualsEOrStrCharAtEqualsE() {
        String string = "tR  ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 'y'): False}
 * @utbot.executesCondition {@code (ch == 'Y'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's')): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsEOrStrCharAtNotEqualsEAndStrCharAtNotEqualsSOrStrCharAtNotEqualsS() {
        String string = "Y  ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 'y'): False}
 * @utbot.executesCondition {@code (ch == 'Y'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'S' || str.charAt(2) == 's')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'S' || str.charAt(2) == 's')): True}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsSOrStrCharAtEqualsS() {
        String string = "YEs";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 'y'): False}
 * @utbot.executesCondition {@code (ch == 'Y'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's')): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'S' || str.charAt(2) == 's')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsSOrStrCharAtEqualsS_1() {
        String string = "YeS";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 'y'): False}
 * @utbot.executesCondition {@code (ch == 'Y'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'S' || str.charAt(2) == 's')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'S' || str.charAt(2) == 's')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsSOrStrCharAtNotEqualsS() {
        String string = "YE ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 'y'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S')): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S')): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsEOrStrCharAtNotEqualsEAndStrCharAtNotEqualsSOrStrCharAtNotEqualsS_1() {
        String string = "y  ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): False}
 * @utbot.executesCondition {@code (ch == 'T'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e')): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e')): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsROrStrCharAtNotEqualsRAndStrCharAtNotEqualsUOrStrCharAtNotEqualsUAndStrCharAtNotEqualsEOrStrCharAtNotEqualsE_1() {
        String string = "T   ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): False}
 * @utbot.executesCondition {@code (ch == 'T'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'U' || str.charAt(2) == 'u')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'U' || str.charAt(2) == 'u')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsUOrStrCharAtNotEqualsU() {
        String string = "TR  ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): False}
 * @utbot.executesCondition {@code (ch == 'T'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'U' || str.charAt(2) == 'u')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'U' || str.charAt(2) == 'u')): True}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'E' || str.charAt(3) == 'e')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsEOrStrCharAtEqualsE() {
        String string = "TRuE";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): False}
 * @utbot.executesCondition {@code (ch == 'T'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'U' || str.charAt(2) == 'u')): False}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'E' || str.charAt(3) == 'e')): True}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'E' || str.charAt(3) == 'e')): True}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsEOrStrCharAtEqualsE_1() {
        String string = "TRUe";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): False}
 * @utbot.executesCondition {@code (ch == 'T'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'U' || str.charAt(2) == 'u')): False}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'E' || str.charAt(3) == 'e')): True}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'E' || str.charAt(3) == 'e')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsEOrStrCharAtNotEqualsE() {
        String string = "TRU ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'u' || str.charAt(2) == 'U')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'u' || str.charAt(2) == 'U')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsUOrStrCharAtNotEqualsU_1() {
        String string = "tr  ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'u' || str.charAt(2) == 'U')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'u' || str.charAt(2) == 'U')): True}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'e' || str.charAt(3) == 'E')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsEOrStrCharAtEqualsE_2() {
        String string = "trUe";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'u' || str.charAt(2) == 'U')): False}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'e' || str.charAt(3) == 'E')): True}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'e' || str.charAt(3) == 'E')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsEOrStrCharAtNotEqualsE_1() {
        String string = "tru ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (ch == 't'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'u' || str.charAt(2) == 'U')): False}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'e' || str.charAt(3) == 'E')): True}
 * @utbot.executesCondition {@code ((str.charAt(3) == 'e' || str.charAt(3) == 'E')): True}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsEOrStrCharAtEqualsE_3() {
        String string = "truE";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method toBoolean(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (str == null): False}
    /// invoke:
    ///     {@link java.lang.String#length()} once
    /// activate {@code switch(str.length()) case: 2}, invoke:
    ///     {@link java.lang.String#charAt(int)} twice
    /// return from: {@code return (ch0 == 'o' || ch0 == 'O') && (ch1 == 'n' || ch1 == 'N');}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.returnsFrom {@code return (ch0 == 'o' || ch0 == 'O') && (ch1 == 'n' || ch1 == 'N');}
 *  */
    @Test
    public void testToBoolean_Ch0EqualsOOrCh0EqualsOAndCh1EqualsNOrCh1EqualsN() {
        String string = "on";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.returnsFrom {@code return (ch0 == 'o' || ch0 == 'O') && (ch1 == 'n' || ch1 == 'N');}
 *  */
    @Test
    public void testToBoolean_Ch0EqualsOOrCh0EqualsOAndCh1EqualsNOrCh1EqualsN_1() {
        String string = "On";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.returnsFrom {@code return (ch0 == 'o' || ch0 == 'O') && (ch1 == 'n' || ch1 == 'N');}
 *  */
    @Test
    public void testToBoolean_Ch0EqualsOOrCh0EqualsOAndCh1EqualsNOrCh1EqualsN_2() {
        String string = "oN";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #3 for method toBoolean(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (str == null): False}
    /// invoke:
    ///     {@link java.lang.String#length()} once
    /// activate {@code switch(str.length()) case: 3}, invoke:
    ///     {@link java.lang.String#charAt(int)} once
    /// execute conditions:
    ///     {@code (ch == 'y'): True}
    /// return from: {@code return (str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S');}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 's' || str.charAt(2) == 'S')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsSOrStrCharAtEqualsS_2() {
        String string = "yes";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 's' || str.charAt(2) == 'S')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 's' || str.charAt(2) == 'S')): True}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsSOrStrCharAtEqualsS_3() {
        String string = "yeS";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 's' || str.charAt(2) == 'S')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 's' || str.charAt(2) == 'S')): False}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S');}
 *  */
    @Test
    public void testToBoolean_StrCharAtNotEqualsSOrStrCharAtNotEqualsS_1() {
        String string = "ye ";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S')): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 's' || str.charAt(2) == 'S')): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return (str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S');}
 *  */
    @Test
    public void testToBoolean_StrCharAtEqualsEOrStrCharAtEqualsEAndStrCharAtEqualsSOrStrCharAtEqualsS() {
        String string = "yEs";
        
        boolean actual = BooleanUtils.toBoolean(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toBoolean(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (ch == 't'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E')): False}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'u' || str.charAt(2) == 'U')): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: (str.charAt(3) == 'e' || str.charAt(3) == 'E')
 *  */
    @Test
    public void testToBoolean_ThrowStringIndexOutOfBoundsException() {
        String string = "tru";
        
        /* This test fails because method [org.apache.commons.lang.BooleanUtils.toBoolean] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang.BooleanUtils.toBoolean(BooleanUtils.java:689) */
        BooleanUtils.toBoolean(string);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (ch == 't'): False}
 * @utbot.executesCondition {@code (ch == 'T'): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e')): True}
 * @utbot.executesCondition {@code ((str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e')): True}
 * @utbot.executesCondition {@code ((str.charAt(2) == 'U' || str.charAt(2) == 'u')): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: (str.charAt(3) == 'E' || str.charAt(3) == 'e')
 *  */
    @Test
    public void testToBoolean_ThrowStringIndexOutOfBoundsException_1() {
        String string = "TrU";
        
        /* This test fails because method [org.apache.commons.lang.BooleanUtils.toBoolean] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang.BooleanUtils.toBoolean(BooleanUtils.java:695) */
        BooleanUtils.toBoolean(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method negate(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#negate(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): False}
 * @utbot.returnsFrom {@code return (bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE);}
 *  */
    @Test
    public void testNegate_NotBoolBooleanValue() {
        Boolean boolean1 = false;
        
        Boolean actual = BooleanUtils.negate(boolean1);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#negate(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): True}
 * @utbot.returnsFrom {@code return (bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE);}
 *  */
    @Test
    public void testNegate_BoolBooleanValue() {
        Boolean boolean1 = true;
        
        Boolean actual = BooleanUtils.negate(boolean1);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#negate(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testNegate_BoolEqualsNull() {
        Boolean actual = BooleanUtils.negate(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.xor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method xor([Ljava.lang.Boolean;)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(java.lang.Boolean[])}
 * @utbot.executesCondition {@code (xor(primitive)): False}
 * @utbot.returnsFrom {@code return xor(primitive) ? Boolean.TRUE : Boolean.FALSE;}
 *  */
    @Test
    public void testXor_NotXor() {
        java.lang.Boolean[] booleanArray = new java.lang.Boolean[1];
        Boolean boolean1 = false;
        booleanArray[0] = boolean1;
        
        Boolean actual = BooleanUtils.xor(booleanArray);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(java.lang.Boolean[])}
 * @utbot.executesCondition {@code (xor(primitive)): True}
 * @utbot.returnsFrom {@code return xor(primitive) ? Boolean.TRUE : Boolean.FALSE;}
 *  */
    @Test
    public void testXor_Xor() {
        java.lang.Boolean[] booleanArray = new java.lang.Boolean[1];
        Boolean boolean1 = true;
        booleanArray[0] = boolean1;
        
        Boolean actual = BooleanUtils.xor(booleanArray);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method xor([Ljava.lang.Boolean;)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(java.lang.Boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testXor_ThrowIllegalArgumentException_1() {
        java.lang.Boolean[] booleanArray = {};
        
        BooleanUtils.xor(booleanArray);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(java.lang.Boolean[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testXor_ThrowIllegalArgumentException() {
        BooleanUtils.xor(((java.lang.Boolean[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method xor([Ljava.lang.Boolean;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.BooleanUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(java.lang.Boolean[])}
     */
    @Test
    public void testXorWithNonEmptyObjectArray() {
        java.lang.Boolean[] booleanArray = {false, true, true};
        
        Boolean actual = BooleanUtils.xor(booleanArray);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.BooleanUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(java.lang.Boolean[])}
     */
    @Test
    public void testXorWithNonEmptyObjectArray1() {
        java.lang.Boolean[] booleanArray = {true, true};
        
        Boolean actual = BooleanUtils.xor(booleanArray);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.xor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method xor([Z)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(boolean[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} twice
 *  */
    @Test
    public void testXor_TrueCountGreaterOrEqual1() {
        boolean[] booleanArray = {true, true};
        
        boolean actual = BooleanUtils.xor(booleanArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(boolean[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return trueCount == 1;}
 *  */
    @Test
    public void testXor_TrueCountEquals1() {
        boolean[] booleanArray = {true};
        
        boolean actual = BooleanUtils.xor(booleanArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(boolean[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return trueCount == 1;}
 *  */
    @Test
    public void testXor_TrueCountNotEquals1() {
        boolean[] booleanArray = {false};
        
        boolean actual = BooleanUtils.xor(booleanArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method xor([Z)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testXor_ThrowIllegalArgumentException_11() {
        boolean[] booleanArray = {};
        
        BooleanUtils.xor(booleanArray);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(boolean[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testXor_ThrowIllegalArgumentException1() {
        BooleanUtils.xor(((boolean[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method xor([Z)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.BooleanUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#xor(boolean[])}
     */
    @Test
    public void testXorReturnsFalseWithNonEmptyPrimitiveArray() {
        boolean[] booleanArray = {false, true, true};
        
        boolean actual = BooleanUtils.xor(booleanArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBooleanDefaultIfNull(java.lang.Boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanDefaultIfNull(java.lang.Boolean,boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): True}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? true : false;}
 *  */
    @Test
    public void testToBooleanDefaultIfNull_BoolBooleanValue() {
        Boolean boolean1 = true;
        
        boolean actual = BooleanUtils.toBooleanDefaultIfNull(boolean1, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanDefaultIfNull(java.lang.Boolean,boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): False}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? true : false;}
 *  */
    @Test
    public void testToBooleanDefaultIfNull_NotBoolBooleanValue() {
        Boolean boolean1 = false;
        
        boolean actual = BooleanUtils.toBooleanDefaultIfNull(boolean1, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanDefaultIfNull(java.lang.Boolean,boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return valueIfNull;}
 *  */
    @Test
    public void testToBooleanDefaultIfNull_BoolEqualsNull() {
        boolean actual = BooleanUtils.toBooleanDefaultIfNull(null, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toStringYesNo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringYesNo(boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringYesNo(boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "yes", "no");}
 *  */
    @Test
    public void testToStringYesNo_ReturnToString() {
        String actual = BooleanUtils.toStringYesNo(true);
        
        String expected = "yes";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringYesNo(boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "yes", "no");}
 *  */
    @Test
    public void testToStringYesNo_ReturnToString_1() {
        String actual = BooleanUtils.toStringYesNo(false);
        
        String expected = "no";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toStringYesNo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringYesNo(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringYesNo(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "yes", "no", null);}
 *  */
    @Test
    public void testToStringYesNo_ReturnToString1() {
        Boolean boolean1 = false;
        
        String actual = BooleanUtils.toStringYesNo(boolean1);
        
        String expected = "no";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringYesNo(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "yes", "no", null);}
 *  */
    @Test
    public void testToStringYesNo_ReturnToString_11() {
        Boolean boolean1 = true;
        
        String actual = BooleanUtils.toStringYesNo(boolean1);
        
        String expected = "yes";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringYesNo(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "yes", "no", null);}
 *  */
    @Test
    public void testToStringYesNo_ReturnToString_2() {
        String actual = BooleanUtils.toStringYesNo(((Boolean) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.isNotTrue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNotTrue(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isNotTrue(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return !isTrue(bool);}
 *  */
    @Test
    public void testIsNotTrue_ReturnNotIsTrue() {
        Boolean boolean1 = false;
        
        boolean actual = BooleanUtils.isNotTrue(boolean1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isNotTrue(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return !isTrue(bool);}
 *  */
    @Test
    public void testIsNotTrue_ReturnNotIsTrue_1() {
        Boolean boolean1 = true;
        
        boolean actual = BooleanUtils.isNotTrue(boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isNotTrue(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return !isTrue(bool);}
 *  */
    @Test
    public void testIsNotTrue_ReturnNotIsTrue_2() {
        boolean actual = BooleanUtils.isNotTrue(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.isTrue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTrue(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isTrue(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): False}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? true : false;}
 *  */
    @Test
    public void testIsTrue_NotBoolBooleanValue() {
        Boolean boolean1 = false;
        
        boolean actual = BooleanUtils.isTrue(boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isTrue(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): True}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? true : false;}
 *  */
    @Test
    public void testIsTrue_BoolBooleanValue() {
        Boolean boolean1 = true;
        
        boolean actual = BooleanUtils.isTrue(boolean1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isTrue(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsTrue_BoolEqualsNull() {
        boolean actual = BooleanUtils.isTrue(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toIntegerObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toIntegerObject(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(java.lang.Boolean,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): False}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? trueValue : falseValue;}
 *  */
    @Test
    public void testToIntegerObject_NotBoolBooleanValue() {
        Boolean boolean1 = false;
        
        Integer actual = BooleanUtils.toIntegerObject(boolean1, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(java.lang.Boolean,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): True}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? trueValue : falseValue;}
 *  */
    @Test
    public void testToIntegerObject_BoolBooleanValue() {
        Boolean boolean1 = true;
        
        Integer actual = BooleanUtils.toIntegerObject(boolean1, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(java.lang.Boolean,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return nullValue;}
 *  */
    @Test
    public void testToIntegerObject_BoolEqualsNull() {
        Integer actual = BooleanUtils.toIntegerObject(null, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toIntegerObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toIntegerObject(boolean, java.lang.Integer, java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(boolean,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (bool): True}
 * @utbot.returnsFrom {@code return bool ? trueValue : falseValue;}
 *  */
    @Test
    public void testToIntegerObject_Bool() {
        Integer actual = BooleanUtils.toIntegerObject(true, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(boolean,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (bool): False}
 * @utbot.returnsFrom {@code return bool ? trueValue : falseValue;}
 *  */
    @Test
    public void testToIntegerObject_NotBool() {
        Integer actual = BooleanUtils.toIntegerObject(false, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toIntegerObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toIntegerObject(boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(boolean)}
 * @utbot.executesCondition {@code (bool): True}
 * @utbot.returnsFrom {@code return bool ? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;}
 *  */
    @Test
    public void testToIntegerObject_Bool1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Integer prevINTEGER_ONE = org.apache.commons.lang.math.NumberUtils.INTEGER_ONE;
        try {
            Integer integerOne = 1;
            Class numberUtilsClazz = Class.forName("org.apache.commons.lang.math.NumberUtils");
            setStaticField(numberUtilsClazz, "INTEGER_ONE", integerOne);
            
            Integer actual = BooleanUtils.toIntegerObject(true);
            
            assertEquals(integerOne, actual);
        } finally {
            setStaticField(org.apache.commons.lang.math.NumberUtils.class, "INTEGER_ONE", prevINTEGER_ONE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(boolean)}
 * @utbot.executesCondition {@code (bool): False}
 * @utbot.returnsFrom {@code return bool ? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;}
 *  */
    @Test
    public void testToIntegerObject_NotBool1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Integer prevINTEGER_ZERO = org.apache.commons.lang.math.NumberUtils.INTEGER_ZERO;
        try {
            Integer integerZero = 0;
            Class numberUtilsClazz = Class.forName("org.apache.commons.lang.math.NumberUtils");
            setStaticField(numberUtilsClazz, "INTEGER_ZERO", integerZero);
            
            Integer actual = BooleanUtils.toIntegerObject(false);
            
            assertEquals(integerZero, actual);
        } finally {
            setStaticField(org.apache.commons.lang.math.NumberUtils.class, "INTEGER_ZERO", prevINTEGER_ZERO);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toIntegerObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toIntegerObject(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToIntegerObject_BoolEqualsNull1() {
        Integer actual = BooleanUtils.toIntegerObject(((Boolean) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): False}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;}
 *  */
    @Test
    public void testToIntegerObject_NotBoolBooleanValue1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Integer prevINTEGER_ZERO = org.apache.commons.lang.math.NumberUtils.INTEGER_ZERO;
        try {
            Integer integerZero = 0;
            Class numberUtilsClazz = Class.forName("org.apache.commons.lang.math.NumberUtils");
            setStaticField(numberUtilsClazz, "INTEGER_ZERO", integerZero);
            Boolean boolean1 = false;
            
            Integer actual = BooleanUtils.toIntegerObject(boolean1);
            
            assertEquals(integerZero, actual);
        } finally {
            setStaticField(org.apache.commons.lang.math.NumberUtils.class, "INTEGER_ZERO", prevINTEGER_ZERO);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toIntegerObject(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): True}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;}
 *  */
    @Test
    public void testToIntegerObject_BoolBooleanValue1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Integer prevINTEGER_ONE = org.apache.commons.lang.math.NumberUtils.INTEGER_ONE;
        try {
            Integer integerOne = 1;
            Class numberUtilsClazz = Class.forName("org.apache.commons.lang.math.NumberUtils");
            setStaticField(numberUtilsClazz, "INTEGER_ONE", integerOne);
            Boolean boolean1 = true;
            
            Integer actual = BooleanUtils.toIntegerObject(boolean1);
            
            assertEquals(integerOne, actual);
        } finally {
            setStaticField(org.apache.commons.lang.math.NumberUtils.class, "INTEGER_ONE", prevINTEGER_ONE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toInteger(boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toInteger(boolean)}
 * @utbot.executesCondition {@code (bool): True}
 * @utbot.returnsFrom {@code return bool ? 1 : 0;}
 *  */
    @Test
    public void testToInteger_Bool() {
        int actual = BooleanUtils.toInteger(true);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toInteger(boolean)}
 * @utbot.executesCondition {@code (bool): False}
 * @utbot.returnsFrom {@code return bool ? 1 : 0;}
 *  */
    @Test
    public void testToInteger_NotBool() {
        int actual = BooleanUtils.toInteger(false);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toInteger(boolean, int, int)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toInteger(boolean,int,int)}
 * @utbot.executesCondition {@code (bool): True}
 * @utbot.returnsFrom {@code return bool ? trueValue : falseValue;}
 *  */
    @Test
    public void testToInteger_Bool1() {
        int actual = BooleanUtils.toInteger(true, 1, -255);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toInteger(boolean,int,int)}
 * @utbot.executesCondition {@code (bool): False}
 * @utbot.returnsFrom {@code return bool ? trueValue : falseValue;}
 *  */
    @Test
    public void testToInteger_NotBool1() {
        int actual = BooleanUtils.toInteger(false, 1, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toInteger(java.lang.Boolean, int, int, int)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toInteger(java.lang.Boolean,int,int,int)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): False}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? trueValue : falseValue;}
 *  */
    @Test
    public void testToInteger_NotBoolBooleanValue() {
        Boolean boolean1 = false;
        
        int actual = BooleanUtils.toInteger(boolean1, -255, -255, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toInteger(java.lang.Boolean,int,int,int)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): True}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? trueValue : falseValue;}
 *  */
    @Test
    public void testToInteger_BoolBooleanValue() {
        Boolean boolean1 = true;
        
        int actual = BooleanUtils.toInteger(boolean1, -255, -255, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toInteger(java.lang.Boolean,int,int,int)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return nullValue;}
 *  */
    @Test
    public void testToInteger_BoolEqualsNull() {
        int actual = BooleanUtils.toInteger(null, -255, -255, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBooleanObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBooleanObject(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.intValue() == 0): False}
 * @utbot.returnsFrom {@code return value.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_ValueIntValueNotEqualsZero() {
        Integer integer = -255;
        
        Boolean actual = BooleanUtils.toBooleanObject(integer);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToBooleanObject_ValueEqualsNull() {
        Boolean actual = BooleanUtils.toBooleanObject(((Integer) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.intValue() == 0): True}
 * @utbot.returnsFrom {@code return value.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_ValueIntValueEqualsZero() {
        Integer integer = 0;
        
        Boolean actual = BooleanUtils.toBooleanObject(integer);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBooleanObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBooleanObject(boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(boolean)}
 * @utbot.executesCondition {@code (bool): True}
 * @utbot.returnsFrom {@code return bool ? Boolean.TRUE : Boolean.FALSE;}
 *  */
    @Test
    public void testToBooleanObject_Bool() {
        Boolean actual = BooleanUtils.toBooleanObject(true);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(boolean)}
 * @utbot.executesCondition {@code (bool): False}
 * @utbot.returnsFrom {@code return bool ? Boolean.TRUE : Boolean.FALSE;}
 *  */
    @Test
    public void testToBooleanObject_NotBool() {
        Boolean actual = BooleanUtils.toBooleanObject(false);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBooleanObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBooleanObject(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String)}
 * @utbot.executesCondition {@code ("true".equalsIgnoreCase(str)): False}
 * @utbot.executesCondition {@code ("false".equalsIgnoreCase(str)): False}
 * @utbot.executesCondition {@code ("on".equalsIgnoreCase(str)): False}
 * @utbot.executesCondition {@code ("off".equalsIgnoreCase(str)): False}
 * @utbot.executesCondition {@code ("yes".equalsIgnoreCase(str)): False}
 * @utbot.executesCondition {@code ("no".equalsIgnoreCase(str)): False}
 * @utbot.invokes {@link java.lang.String#equalsIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equalsIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equalsIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToBooleanObject_NotnoEqualsIgnoreCase() {
        Boolean actual = BooleanUtils.toBooleanObject(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String)}
 * @utbot.executesCondition {@code ("true".equalsIgnoreCase(str)): True}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_trueEqualsIgnoreCase() {
        String string = "tRUe";
        
        Boolean actual = BooleanUtils.toBooleanObject(string);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String)}
 * @utbot.executesCondition {@code ("true".equalsIgnoreCase(str)): False}
 * @utbot.executesCondition {@code ("false".equalsIgnoreCase(str)): False}
 * @utbot.executesCondition {@code ("on".equalsIgnoreCase(str)): True}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_onEqualsIgnoreCase() {
        String string = "oN";
        
        Boolean actual = BooleanUtils.toBooleanObject(string);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toBooleanObject(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.BooleanUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String)}
     */
    @Test
    public void testToBooleanObjectWithNonEmptyString() {
        Boolean actual = BooleanUtils.toBooleanObject("off");
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toBooleanObject(java.lang.String)
    
    @Test
    public void testToBooleanObject1() {
        String string = "FALSe";
        
        Boolean actual = BooleanUtils.toBooleanObject(string);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBooleanObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBooleanObject(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.executesCondition {@code (trueString == null): False}
 * @utbot.executesCondition {@code (falseString == null): False}
 * @utbot.executesCondition {@code (nullString == null): True}
 *  */
    @Test
    public void testToBooleanObject_NullStringEqualsNull() {
        String string = "";
        
        Boolean actual = BooleanUtils.toBooleanObject(((String) null), string, string, ((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.equals(trueString)): True}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_StrEquals() {
        String string = " ";
        
        Boolean actual = BooleanUtils.toBooleanObject(string, string, ((String) null), ((String) null));
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.executesCondition {@code (trueString == null): False}
 * @utbot.executesCondition {@code (falseString == null): True}
 * @utbot.returnsFrom {@code return Boolean.FALSE;}
 *  */
    @Test
    public void testToBooleanObject_FalseStringEqualsNull() {
        String string = "";
        
        Boolean actual = BooleanUtils.toBooleanObject(((String) null), string, ((String) null), ((String) null));
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.executesCondition {@code (trueString == null): True}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_TrueStringEqualsNull() {
        Boolean actual = BooleanUtils.toBooleanObject(((String) null), ((String) null), ((String) null), ((String) null));
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.equals(trueString)): False}
 * @utbot.executesCondition {@code (str.equals(falseString)): True}
 * @utbot.returnsFrom {@code return Boolean.FALSE;}
 *  */
    @Test
    public void testToBooleanObject_StrEquals_1() {
        String string = " ";
        
        Boolean actual = BooleanUtils.toBooleanObject(string, ((String) null), string, ((String) null));
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.equals(trueString)): False}
 * @utbot.executesCondition {@code (str.equals(falseString)): False}
 * @utbot.executesCondition {@code (str.equals(nullString)): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testToBooleanObject_StrEquals_2() {
        String string = " ";
        
        Boolean actual = BooleanUtils.toBooleanObject(string, ((String) null), ((String) null), string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toBooleanObject(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.equals(trueString)): False}
 * @utbot.executesCondition {@code (str.equals(falseString)): False}
 * @utbot.executesCondition {@code (str.equals(nullString)): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The String did not match any specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_ThrowIllegalArgumentException() {
        String string = " ";
        
        BooleanUtils.toBooleanObject(string, ((String) null), ((String) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.executesCondition {@code (trueString == null): False}
 * @utbot.executesCondition {@code (falseString == null): False}
 * @utbot.executesCondition {@code (nullString == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The String did not match any specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_ThrowIllegalArgumentException_1() {
        String string = "";
        
        BooleanUtils.toBooleanObject(((String) null), string, string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBooleanObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBooleanObject(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(trueValue)): False}
 * @utbot.executesCondition {@code (value.equals(falseValue)): True}
 * @utbot.returnsFrom {@code return Boolean.FALSE;}
 *  */
    @Test
    public void testToBooleanObject_ValueEquals() {
        Integer integer = -255;
        
        Boolean actual = BooleanUtils.toBooleanObject(integer, ((Integer) null), integer, ((Integer) null));
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (trueValue == null): False}
 * @utbot.executesCondition {@code (falseValue == null): False}
 * @utbot.executesCondition {@code (nullValue == null): True}
 *  */
    @Test
    public void testToBooleanObject_NullValueEqualsNull() {
        Integer integer = 0;
        
        Boolean actual = BooleanUtils.toBooleanObject(((Integer) null), integer, integer, ((Integer) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (trueValue == null): True}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_TrueValueEqualsNull() {
        Boolean actual = BooleanUtils.toBooleanObject(((Integer) null), ((Integer) null), ((Integer) null), ((Integer) null));
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (trueValue == null): False}
 * @utbot.executesCondition {@code (falseValue == null): True}
 * @utbot.returnsFrom {@code return Boolean.FALSE;}
 *  */
    @Test
    public void testToBooleanObject_FalseValueEqualsNull() {
        Integer integer = 0;
        
        Boolean actual = BooleanUtils.toBooleanObject(((Integer) null), integer, ((Integer) null), ((Integer) null));
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(trueValue)): True}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_ValueEquals_1() {
        Integer integer = -255;
        
        Boolean actual = BooleanUtils.toBooleanObject(integer, integer, ((Integer) null), ((Integer) null));
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(trueValue)): False}
 * @utbot.executesCondition {@code (value.equals(falseValue)): False}
 * @utbot.executesCondition {@code (value.equals(nullValue)): True}
 * @utbot.invokes {@link java.lang.Integer#equals(java.lang.Object)}
 *  */
    @Test
    public void testToBooleanObject_ValueEquals_2() {
        Integer integer = -255;
        Integer integer1 = -2;
        
        Boolean actual = BooleanUtils.toBooleanObject(integer, integer1, ((Integer) null), integer);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toBooleanObject(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(trueValue)): False}
 * @utbot.executesCondition {@code (value.equals(falseValue)): False}
 * @utbot.executesCondition {@code (value.equals(nullValue)): False}
 * @utbot.invokes {@link java.lang.Integer#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Integer#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Integer#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The Integer did not match any specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_ThrowIllegalArgumentException1() {
        Integer integer = -2;
        Integer integer1 = -255;
        
        BooleanUtils.toBooleanObject(integer, integer1, ((Integer) null), ((Integer) null));
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (trueValue == null): False}
 * @utbot.executesCondition {@code (falseValue == null): False}
 * @utbot.executesCondition {@code (nullValue == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The Integer did not match any specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_ThrowIllegalArgumentException_11() {
        Integer integer = 0;
        
        BooleanUtils.toBooleanObject(((Integer) null), integer, integer, integer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBooleanObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBooleanObject(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(int,int,int,int)}
 * @utbot.executesCondition {@code (value == trueValue): True}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_ValueEqualsTrueValue() {
        Boolean actual = BooleanUtils.toBooleanObject(2, 2, -255, -255);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(int,int,int,int)}
 * @utbot.executesCondition {@code (value == trueValue): False}
 * @utbot.executesCondition {@code (value == falseValue): False}
 * @utbot.executesCondition {@code (value == nullValue): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToBooleanObject_ValueEqualsNullValue() {
        Boolean actual = BooleanUtils.toBooleanObject(64, 1, -255, 64);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(int,int,int,int)}
 * @utbot.executesCondition {@code (value == trueValue): False}
 * @utbot.executesCondition {@code (value == falseValue): True}
 * @utbot.returnsFrom {@code return Boolean.FALSE;}
 *  */
    @Test
    public void testToBooleanObject_ValueEqualsFalseValue() {
        Boolean actual = BooleanUtils.toBooleanObject(1, 2, 1, -255);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toBooleanObject(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(int,int,int,int)}
 * @utbot.executesCondition {@code (value == trueValue): False}
 * @utbot.executesCondition {@code (value == falseValue): False}
 * @utbot.executesCondition {@code (value == nullValue): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("The Integer did not match any specified value");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_ThrowIllegalArgumentException2() {
        BooleanUtils.toBooleanObject(254, -255, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toBooleanObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toBooleanObject(int)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.returnsFrom {@code return value == 0 ? Boolean.FALSE : Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_ValueNotEqualsZero() {
        Boolean actual = BooleanUtils.toBooleanObject(1);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toBooleanObject(int)}
 * @utbot.executesCondition {@code (value == 0): True}
 * @utbot.returnsFrom {@code return value == 0 ? Boolean.FALSE : Boolean.TRUE;}
 *  */
    @Test
    public void testToBooleanObject_ValueEqualsZero() {
        Boolean actual = BooleanUtils.toBooleanObject(0);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toStringTrueFalse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringTrueFalse(boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringTrueFalse(boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "true", "false");}
 *  */
    @Test
    public void testToStringTrueFalse_ReturnToString() {
        String actual = BooleanUtils.toStringTrueFalse(true);
        
        String expected = "true";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringTrueFalse(boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "true", "false");}
 *  */
    @Test
    public void testToStringTrueFalse_ReturnToString_1() {
        String actual = BooleanUtils.toStringTrueFalse(false);
        
        String expected = "false";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toStringTrueFalse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringTrueFalse(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringTrueFalse(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "true", "false", null);}
 *  */
    @Test
    public void testToStringTrueFalse_ReturnToString1() {
        Boolean boolean1 = false;
        
        String actual = BooleanUtils.toStringTrueFalse(boolean1);
        
        String expected = "false";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringTrueFalse(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "true", "false", null);}
 *  */
    @Test
    public void testToStringTrueFalse_ReturnToString_11() {
        Boolean boolean1 = true;
        
        String actual = BooleanUtils.toStringTrueFalse(boolean1);
        
        String expected = "true";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringTrueFalse(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "true", "false", null);}
 *  */
    @Test
    public void testToStringTrueFalse_ReturnToString_2() {
        String actual = BooleanUtils.toStringTrueFalse(((Boolean) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.isNotFalse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNotFalse(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isNotFalse(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return !isFalse(bool);}
 *  */
    @Test
    public void testIsNotFalse_ReturnNotIsFalse() {
        Boolean boolean1 = false;
        
        boolean actual = BooleanUtils.isNotFalse(boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isNotFalse(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return !isFalse(bool);}
 *  */
    @Test
    public void testIsNotFalse_ReturnNotIsFalse_1() {
        Boolean boolean1 = true;
        
        boolean actual = BooleanUtils.isNotFalse(boolean1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isNotFalse(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return !isFalse(bool);}
 *  */
    @Test
    public void testIsNotFalse_ReturnNotIsFalse_2() {
        boolean actual = BooleanUtils.isNotFalse(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toStringOnOff
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringOnOff(boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringOnOff(boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "on", "off");}
 *  */
    @Test
    public void testToStringOnOff_ReturnToString() {
        String actual = BooleanUtils.toStringOnOff(true);
        
        String expected = "on";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringOnOff(boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "on", "off");}
 *  */
    @Test
    public void testToStringOnOff_ReturnToString_1() {
        String actual = BooleanUtils.toStringOnOff(false);
        
        String expected = "off";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.toStringOnOff
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringOnOff(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringOnOff(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "on", "off", null);}
 *  */
    @Test
    public void testToStringOnOff_ReturnToString1() {
        Boolean boolean1 = false;
        
        String actual = BooleanUtils.toStringOnOff(boolean1);
        
        String expected = "off";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringOnOff(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "on", "off", null);}
 *  */
    @Test
    public void testToStringOnOff_ReturnToString_11() {
        Boolean boolean1 = true;
        
        String actual = BooleanUtils.toStringOnOff(boolean1);
        
        String expected = "on";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#toStringOnOff(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return toString(bool, "on", "off", null);}
 *  */
    @Test
    public void testToStringOnOff_ReturnToString_2() {
        String actual = BooleanUtils.toStringOnOff(((Boolean) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.BooleanUtils.isFalse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFalse(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isFalse(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): False}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? false : true;}
 *  */
    @Test
    public void testIsFalse_NotBoolBooleanValue() {
        Boolean boolean1 = false;
        
        boolean actual = BooleanUtils.isFalse(boolean1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isFalse(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool.booleanValue()): True}
 * @utbot.returnsFrom {@code return bool.booleanValue() ? false : true;}
 *  */
    @Test
    public void testIsFalse_BoolBooleanValue() {
        Boolean boolean1 = true;
        
        boolean actual = BooleanUtils.isFalse(boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BooleanUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.BooleanUtils#isFalse(java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsFalse_BoolEqualsNull() {
        boolean actual = BooleanUtils.isFalse(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields670505740186800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields670505740186800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass670505740193100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670505740186800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670505740193100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    ///endregion
}

