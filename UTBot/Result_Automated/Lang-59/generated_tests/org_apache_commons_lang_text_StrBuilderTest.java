package org.apache.commons.lang.text;

import org.junit.Test;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.lang.text.StrMatcher.CharSetMatcher;
import org.apache.commons.lang.text.StrMatcher.TrimMatcher;
import org.apache.commons.lang.text.StrMatcher.CharMatcher;
import org.apache.commons.lang.text.StrMatcher.StringMatcher;
import org.apache.commons.lang.text.StrMatcher.NoMatcher;
import org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer;
import java.lang.reflect.Method;
import org.apache.commons.lang.text.StrBuilder.StrBuilderReader;
import org.apache.commons.lang.text.StrBuilder.StrBuilderWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_lang_text_StrBuilderTest {
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendWithSeparators
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendWithSeparators(java.util.Iterator, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendWithSeparators(java.util.Iterator,java.lang.String)}
 * @utbot.executesCondition {@code (it != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendWithSeparators_ItEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendWithSeparators(((Iterator) null), ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendWithSeparators(java.util.Iterator, java.lang.String)
    
    @Test
    public void testAppendWithSeparators1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
        String string = "";
        
        StrBuilder actual = strBuilder.appendWithSeparators(iterator, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testAppendWithSeparators2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
        
        StrBuilder actual = strBuilder.appendWithSeparators(iterator, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendWithSeparators
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendWithSeparators(java.util.Collection, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendWithSeparators(java.util.Collection,java.lang.String)}
 * @utbot.executesCondition {@code (coll != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendWithSeparators_CollEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendWithSeparators(((Collection) null), ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendWithSeparators
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendWithSeparators([Ljava.lang.Object;, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendWithSeparators(java.lang.Object[],java.lang.String)}
 * @utbot.executesCondition {@code (array != null): True}
 * @utbot.executesCondition {@code (array.length > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendWithSeparators_ArrayLengthLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        java.lang.Object[] objectArray = {};
        
        StrBuilder actual = strBuilder.appendWithSeparators(objectArray, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendWithSeparators(java.lang.Object[],java.lang.String)}
 * @utbot.executesCondition {@code (array != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendWithSeparators_ArrayEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendWithSeparators(((java.lang.Object[]) null), ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendWithSeparators([Ljava.lang.Object;, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendWithSeparators(java.lang.Object[],java.lang.String)}
     */
    @Test
    public void testAppendWithSeparatorsWithNonEmptyObjectArrayAndNonEmptyString() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        StrBuilder actual = strBuilder.appendWithSeparators(objectArray, "-3");
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[78];
        buffer[0] = 'j';
        buffer[1] = 'a';
        buffer[2] = 'v';
        buffer[3] = 'a';
        buffer[4] = '.';
        buffer[5] = 'l';
        buffer[6] = 'a';
        buffer[7] = 'n';
        buffer[8] = 'g';
        buffer[9] = '.';
        buffer[10] = 'O';
        buffer[11] = 'b';
        buffer[12] = 'j';
        buffer[13] = 'e';
        buffer[14] = 'c';
        buffer[15] = 't';
        buffer[16] = '@';
        buffer[17] = '6';
        buffer[18] = '5';
        buffer[19] = '7';
        buffer[20] = '3';
        buffer[21] = '4';
        buffer[22] = '9';
        buffer[23] = '4';
        buffer[24] = '-';
        buffer[25] = '3';
        buffer[26] = 'j';
        buffer[27] = 'a';
        buffer[28] = 'v';
        buffer[29] = 'a';
        buffer[30] = '.';
        buffer[31] = 'l';
        buffer[32] = 'a';
        buffer[33] = 'n';
        buffer[34] = 'g';
        buffer[35] = '.';
        buffer[36] = 'O';
        buffer[37] = 'b';
        buffer[38] = 'j';
        buffer[39] = 'e';
        buffer[40] = 'c';
        buffer[41] = 't';
        buffer[42] = '@';
        buffer[43] = '2';
        buffer[44] = 'c';
        buffer[45] = '3';
        buffer[46] = '9';
        buffer[47] = 'a';
        buffer[48] = '6';
        buffer[49] = '8';
        buffer[50] = '4';
        buffer[51] = '-';
        buffer[52] = '3';
        buffer[53] = 'j';
        buffer[54] = 'a';
        buffer[55] = 'v';
        buffer[56] = 'a';
        buffer[57] = '.';
        buffer[58] = 'l';
        buffer[59] = 'a';
        buffer[60] = 'n';
        buffer[61] = 'g';
        buffer[62] = '.';
        buffer[63] = 'O';
        buffer[64] = 'b';
        buffer[65] = 'j';
        buffer[66] = 'e';
        buffer[67] = 'c';
        buffer[68] = 't';
        buffer[69] = '@';
        buffer[70] = '1';
        buffer[71] = '9';
        buffer[72] = '4';
        buffer[73] = 'b';
        buffer[74] = 'e';
        buffer[75] = '1';
        buffer[76] = '0';
        buffer[77] = '1';
        expected.buffer = buffer;
        expected.size = 78;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendWithSeparators([Ljava.lang.Object;, java.lang.String)
    
    @Test
    public void testAppendWithSeparators3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        String string = "";
        
        StrBuilder actual = strBuilder.appendWithSeparators(objectArray, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testAppendWithSeparators4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        StrBuilder actual = strBuilder.appendWithSeparators(objectArray, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testAppendWithSeparators5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        StrBuilder actual = strBuilder.appendWithSeparators(objectArray, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendWithSeparators([Ljava.lang.Object;, java.lang.String)
    
    @Test
    public void testAppendWithSeparators6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendWithSeparators] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:458)
            org.apache.commons.lang.text.StrBuilder.appendWithSeparators(StrBuilder.java:748) */
        strBuilder.appendWithSeparators(objectArray, string);
    }
    
    @Test
    public void testAppendWithSeparators7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        objectArray[1] = ((Object) strBuilder);
        objectArray[2] = ((Object) strBuilder);
        objectArray[3] = ((Object) strBuilder);
        objectArray[4] = ((Object) strBuilder);
        objectArray[5] = ((Object) strBuilder);
        objectArray[6] = ((Object) strBuilder);
        objectArray[7] = ((Object) strBuilder);
        objectArray[8] = ((Object) strBuilder);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendWithSeparators] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:458)
            org.apache.commons.lang.text.StrBuilder.appendWithSeparators(StrBuilder.java:748) */
        strBuilder.appendWithSeparators(objectArray, ((String) null));
    }
    
    @Test
    public void testAppendWithSeparators8() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        char[] charArray = {};
        objectArray[1] = ((Object) charArray);
        objectArray[2] = ((Object) charArray);
        objectArray[3] = ((Object) charArray);
        objectArray[4] = ((Object) charArray);
        objectArray[5] = ((Object) charArray);
        objectArray[6] = ((Object) charArray);
        objectArray[7] = ((Object) charArray);
        objectArray[8] = ((Object) charArray);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendWithSeparators] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:458)
            org.apache.commons.lang.text.StrBuilder.appendWithSeparators(StrBuilder.java:751) */
        strBuilder.appendWithSeparators(objectArray, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof StrBuilder): True}
 * @utbot.returnsFrom {@code return equals((StrBuilder) obj);}
 *  */
    @Test
    public void testEquals_ObjInstanceOfStrBuilder() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.equals(((Object) strBuilder1));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof StrBuilder): True}
 * @utbot.returnsFrom {@code return equals((StrBuilder) obj);}
 *  */
    @Test
    public void testEquals_ObjInstanceOfStrBuilder_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.equals(((Object) strBuilder));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof StrBuilder): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotObjNotInstanceOfStrBuilder() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.equals(((Object) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof StrBuilder): True}
 * @utbot.returnsFrom {@code return equals((StrBuilder) obj);}
 *  */
    @Test
    public void testEquals_ObjInstanceOfStrBuilder_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer1 = {'\uFFDF'};
        strBuilder1.buffer = buffer1;
        strBuilder1.size = 1;
        
        boolean actual = strBuilder.equals(((Object) strBuilder1));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof StrBuilder): True}
 * @utbot.returnsFrom {@code return equals((StrBuilder) obj);}
 *  */
    @Test
    public void testEquals_ObjInstanceOfStrBuilder_4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.buffer = buffer;
        strBuilder1.size = 1;
        
        boolean actual = strBuilder.equals(((Object) strBuilder1));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof StrBuilder): True}
 * @utbot.returnsFrom {@code return equals((StrBuilder) obj);}
 *  */
    @Test
    public void testEquals_ObjInstanceOfStrBuilder_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.equals(((Object) strBuilder1));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return equals((StrBuilder) obj);
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer1 = {};
        strBuilder1.buffer = buffer1;
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.equals(StrBuilder.java:2111)
            org.apache.commons.lang.text.StrBuilder.equals(StrBuilder.java:2127) */
        strBuilder.equals(((Object) strBuilder1));
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return equals((StrBuilder) obj);
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.equals(StrBuilder.java:2111)
            org.apache.commons.lang.text.StrBuilder.equals(StrBuilder.java:2127) */
        strBuilder.equals(((Object) strBuilder1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(org.apache.commons.lang.text.StrBuilder)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): True}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.equals(strBuilder);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (this.size != other.size): True}
 *  */
    @Test
    public void testEquals_ThisSizeNotEqualsOtherSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 1;
        
        boolean actual = strBuilder.equals(strBuilder1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testEquals_IOfThisBufNotEqualsIOfOtherBuf() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'$'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer1 = {' '};
        strBuilder1.buffer = buffer1;
        strBuilder1.size = 1;
        
        boolean actual = strBuilder.equals(strBuilder1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testEquals_IOfThisBufEqualsIOfOtherBuf() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.buffer = buffer;
        strBuilder1.size = 1;
        
        boolean actual = strBuilder.equals(strBuilder1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 *  */
    @Test
    public void testEquals_ThisSizeEqualsOtherSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.equals(strBuilder1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(org.apache.commons.lang.text.StrBuilder)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: thisBuf[i] != otherBuf[i]
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer1 = {};
        strBuilder1.buffer = buffer1;
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.equals(StrBuilder.java:2111) */
        strBuilder.equals(strBuilder1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: thisBuf[i] != otherBuf[i]
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.equals(StrBuilder.java:2111) */
        strBuilder.equals(strBuilder1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.size != other.size
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.equals(StrBuilder.java:2105) */
        strBuilder.equals(((StrBuilder) null));
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: thisBuf[i] != otherBuf[i]
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.equals(StrBuilder.java:2111) */
        strBuilder.equals(strBuilder1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equals(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: thisBuf[i] != otherBuf[i]
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.equals(StrBuilder.java:2111) */
        strBuilder.equals(strBuilder1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.length
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method length()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testLength_ReturnSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        int actual = strBuilder.length();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toString()}
 * @utbot.returnsFrom {@code return new String(buffer, 0, size);}
 *  */
    @Test
    public void testToString_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        String actual = strBuilder.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toString()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(buffer, 0, size);
 *  */
    @Test
    public void testToString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.toString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.toString(StrBuilder.java:2157) */
        strBuilder.toString();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(buffer, 0, size);
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.toString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.toString(StrBuilder.java:2157) */
        strBuilder.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(double)}
     */
    @Test
    public void testAppend() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StrBuilder actual = strBuilder.append(1.0);
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        buffer[0] = '1';
        buffer[1] = '.';
        buffer[2] = '0';
        expected.buffer = buffer;
        expected.size = 3;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(double)
    
    @Test
    public void testAppend1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:731) */
        strBuilder.append(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.Object)}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_ReturnAppendNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(((Object) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.Object)}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_ReturnAppendNull_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.append(((Object) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.Object)
    
    @Test
    public void testAppend2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        String nullText = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(((Object) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(9, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(java.lang.Object)
    
    @Test
    public void testAppend3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 20;
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 20 out of bounds for char[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:458) */
        strBuilder.append(((Object) integer));
    }
    
    @Test
    public void testAppend4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = -12;
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -12, count 11, length 10]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:458) */
        strBuilder.append(((Object) integer));
    }
    
    @Test
    public void testAppend5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:456) */
        strBuilder.append(((Object) null));
    }
    
    @Test
    public void testAppend6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:458) */
        strBuilder.append(((Object) integer));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(long)}
     */
    @Test
    public void testAppend7() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StrBuilder actual = strBuilder.append(-9L);
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        buffer[0] = '-';
        buffer[1] = '9';
        expected.buffer = buffer;
        expected.size = 2;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(long)
    
    @Test
    public void testAppend8() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 29;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 29 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:711) */
        strBuilder.append(0L);
    }
    
    @Test
    public void testAppend9() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = -2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -2, count 1, length 10]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:711) */
        strBuilder.append(0L);
    }
    
    @Test
    public void testAppend10() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:711) */
        strBuilder.append(13L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(float)}
     */
    @Test
    public void testAppend11() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StrBuilder actual = strBuilder.append(1.0f);
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        buffer[0] = '1';
        buffer[1] = '.';
        buffer[2] = '0';
        expected.buffer = buffer;
        expected.size = 3;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(float)
    
    @Test
    public void testAppend12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:721) */
        strBuilder.append(java.lang.Float.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (strLen > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        StrBuilder actual = strBuilder.append(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_StrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_StrEqualsNull_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.append(((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (strLen > 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureCapacity(len + strLen);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475) */
        strBuilder.append(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String)}
     */
    @Test
    public void testAppendWithNonEmptyString() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StrBuilder actual = strBuilder.append("-\uFFF43");
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        buffer[0] = '-';
        buffer[1] = '\uFFF4';
        buffer[2] = '3';
        expected.buffer = buffer;
        expected.size = 3;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.String)
    
    @Test
    public void testAppend13() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(33, finalStrBuilderSize);
    }
    
    @Test
    public void testAppend14() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(1, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(java.lang.String)
    
    @Test
    public void testAppend15() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:470) */
        strBuilder.append(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String,int,int)}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_ReturnAppendNull1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(((String) null), -255, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String,int,int)}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_ReturnAppendNull_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.append(((String) null), -255, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0 || startIndex > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        strBuilder.append(string, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (length < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: length < 0 || (startIndex + length) > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        strBuilder.append(string, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0 || startIndex > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        strBuilder.append(string, 1, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.String, int, int)
    
    @Test
    public void testAppend16() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        StrBuilder actual = strBuilder.append(string, 37, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testAppend17() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 31;
        String nullText = "\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(((String) null), 0, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(33, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(java.lang.String, int, int)
    
    @Test
    public void testAppend18() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -2147483640;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483640, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:493) */
        strBuilder.append(((String) null), 0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([C)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[])}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (strLen > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_StrLenLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {};
        
        StrBuilder actual = strBuilder.append(charArray);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[])}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_CharsEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(((char[]) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[])}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_CharsEqualsNull_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.append(((char[]) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append([C)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[])}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (strLen > 0): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(chars, 0, buffer, len, strLen);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:623) */
        strBuilder.append(charArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append([C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[])}
     */
    @Test
    public void testAppendWithNonEmptyPrimitiveArray() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        char[] charArray = {'\u0000', '\u0000', '\u0000'};
        
        StrBuilder actual = strBuilder.append(charArray);
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        expected.buffer = buffer;
        expected.size = 3;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append([C)
    
    @Test
    public void testAppend19() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        char[] charArray = new char[32];
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(charArray);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(33, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append([C)
    
    @Test
    public void testAppend20() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:617) */
        strBuilder.append(((char[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([C, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[],int,int)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex > chars.length): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code ((startIndex + length) > chars.length): False}
 * @utbot.executesCondition {@code (length > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_LengthLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {};
        
        StrBuilder actual = strBuilder.append(charArray, 0, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[],int,int)}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_CharsEqualsNull1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.append(((char[]) null), -255, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[],int,int)}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_CharsEqualsNull_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(((char[]) null), -255, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append([C, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[],int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0 || startIndex > chars.length
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {' '};
        
        strBuilder.append(charArray, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[],int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex > chars.length): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0 || startIndex > chars.length
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {};
        
        strBuilder.append(charArray, 1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[],int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex > chars.length): False}
 * @utbot.executesCondition {@code (length < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: length < 0 || (startIndex + length) > chars.length
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_21() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {};
        
        strBuilder.append(charArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char[],int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex > chars.length): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code ((startIndex + length) > chars.length): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: length < 0 || (startIndex + length) > chars.length
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {' ', ' '};
        
        strBuilder.append(charArray, 2, 1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append([C, int, int)
    
    @Test
    public void testAppend21() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(((char[]) null), 0, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(1, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append([C, int, int)
    
    @Test
    public void testAppend22() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        char[] charArray = new char[16];
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483648 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:651) */
        strBuilder.append(charArray, 0, 1);
    }
    
    @Test
    public void testAppend23() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:640) */
        strBuilder.append(((char[]) null), 0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(boolean)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[size++] = 't';
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2147483645;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483645 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:666) */
        strBuilder.append(true);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[size++] = 'f';
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = -3;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index -3 out of bounds for length 2]
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:672) */
        strBuilder.append(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(boolean)}
     */
    @Test
    public void testAppend24() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StrBuilder actual = strBuilder.append(true);
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        buffer[0] = 't';
        buffer[1] = 'r';
        buffer[2] = 'u';
        buffer[3] = 'e';
        expected.buffer = buffer;
        expected.size = 4;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.append(' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(2, finalStrBuilderSize);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(1, finalStrBuilderSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[size++] = ch;
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[34];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        buffer[17] = ' ';
        buffer[18] = ' ';
        buffer[19] = ' ';
        buffer[20] = ' ';
        buffer[21] = ' ';
        buffer[22] = ' ';
        buffer[23] = ' ';
        buffer[24] = ' ';
        buffer[25] = ' ';
        buffer[26] = ' ';
        buffer[27] = ' ';
        buffer[28] = ' ';
        buffer[29] = ' ';
        buffer[30] = ' ';
        buffer[31] = ' ';
        buffer[32] = ' ';
        buffer[33] = ' ';
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MAX_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 34]
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:690) */
        strBuilder.append(' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureCapacity(len + 1);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:689) */
        strBuilder.append(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(int)}
     */
    @Test
    public void testAppend25() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StrBuilder actual = strBuilder.append(-3);
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        buffer[0] = '-';
        buffer[1] = '3';
        expected.buffer = buffer;
        expected.size = 2;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(int)
    
    @Test
    public void testAppend26() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 27;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(Integer.MIN_VALUE);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(38, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(int)
    
    @Test
    public void testAppend27() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 29;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 29 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:701) */
        strBuilder.append(0);
    }
    
    @Test
    public void testAppend28() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = -2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -2, count 1, length 10]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:701) */
        strBuilder.append(0);
    }
    
    @Test
    public void testAppend29() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:701) */
        strBuilder.append(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link java.lang.StringBuffer#length()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_StrNotEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        StrBuilder actual = strBuilder.append(stringBuffer);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_StrEqualsNull1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(((StringBuffer) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_StrEqualsNull_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.append(((StringBuffer) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(java.lang.StringBuffer)
    
    @Test
    public void testAppend30() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.IndexOutOfBoundsException: start -2147483648, end -2147483647, length 0]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.getChars(AbstractStringBuilder.java:510)
            java.base/java.lang.StringBuffer.getChars(StringBuffer.java:289)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:525) */
        strBuilder.append(stringBuffer);
    }
    
    @Test
    public void testAppend31() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:519) */
        strBuilder.append(((StringBuffer) null));
    }
    
    @Test
    public void testAppend32() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String nullText = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:519) */
        strBuilder.append(((StringBuffer) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.StringBuffer,int,int)}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_ReturnAppendNull2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(((StringBuffer) null), -255, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.StringBuffer,int,int)}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_ReturnAppendNull_12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.append(((StringBuffer) null), -255, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(java.lang.StringBuffer, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.StringBuffer,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0 || startIndex > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        strBuilder.append(stringBuffer, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.StringBuffer,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (length < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: length < 0 || (startIndex + length) > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        strBuilder.append(stringBuffer, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.StringBuffer,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0 || startIndex > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_22() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StringBuffer stringBuffer = new StringBuffer("  ");
        
        strBuilder.append(stringBuffer, 3, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(java.lang.StringBuffer, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.StringBuffer,int,int)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#appendNull()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:542) */
        strBuilder.append(((StringBuffer) null), -255, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, int, int)
    
    @Test
    public void testAppend33() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        StrBuilder actual = strBuilder.append(stringBuffer, 3, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testAppend34() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[18];
        strBuilder.buffer = buffer;
        strBuilder.size = 18;
        String nullText = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(((StringBuffer) null), 0, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(27, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(java.lang.StringBuffer, int, int)
    
    @Test
    public void testAppend35() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[16];
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        String nullText = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 17, length 16]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:542) */
        strBuilder.append(((StringBuffer) null), 0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.lang.text.StrBuilder)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_StrNotEqualsNull1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(strBuilder);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_StrEqualsNull2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(((StrBuilder) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_StrEqualsNull_12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.append(((StrBuilder) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.apache.commons.lang.text.StrBuilder)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(str.buffer, 0, buffer, len, strLen);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer1 = {' '};
        strBuilder1.buffer = buffer1;
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:574) */
        strBuilder.append(strBuilder1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.lang.text.StrBuilder)
    
    @Test
    public void testAppend36() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String nullText = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(((StrBuilder) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(33, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(org.apache.commons.lang.text.StrBuilder)
    
    @Test
    public void testAppend37() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:568) */
        strBuilder.append(((StrBuilder) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.lang.text.StrBuilder, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex > str.length()): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code ((startIndex + length) > str.length()): False}
 * @utbot.executesCondition {@code (length > 0): False}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_LengthLessOrEqualZero1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(strBuilder, 0, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_StrEqualsNull3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.append(((StrBuilder) null), -255, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_StrEqualsNull_13() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.append(((StrBuilder) null), -255, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return appendNull();}
 *  */
    @Test
    public void testAppend_StrEqualsNull_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.append(((StrBuilder) null), -255, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(1, finalStrBuilderSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.apache.commons.lang.text.StrBuilder, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0 || startIndex > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.append(strBuilder, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex > str.length()): False}
 * @utbot.executesCondition {@code (length < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: length < 0 || (startIndex + length) > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_13() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.append(strBuilder, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex > str.length()): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0 || startIndex > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_23() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.append(strBuilder, 0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex > str.length()): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code ((startIndex + length) > str.length()): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: length < 0 || (startIndex + length) > str.length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_ThrowStringIndexOutOfBoundsException_31() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 2;
        
        strBuilder.append(strBuilder, 1, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.apache.commons.lang.text.StrBuilder, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.returnsFrom {@code return appendNull();}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return appendNull();
 *  */
    @Test
    public void testAppend_ThrowStringIndexOutOfBoundsException_4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.StringIndexOutOfBoundsException: offset -1, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:591) */
        strBuilder.append(((StrBuilder) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#append(org.apache.commons.lang.text.StrBuilder,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return appendNull();
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        String nullText = "\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:591) */
        strBuilder.append(((StrBuilder) null), -255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(org.apache.commons.lang.text.StrBuilder, int, int)
    
    @Test
    public void testAppend38() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 134217728;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.getChars(StrBuilder.java:414)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:602) */
        strBuilder.append(strBuilder1, 0, 9);
    }
    
    @Test
    public void testAppend39() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 134217728;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.getChars(StrBuilder.java:414)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:602) */
        strBuilder.append(strBuilder1, 0, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#hashCode()}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.returnsFrom {@code return hash;}
 *  */
    @Test
    public void testHashCode_IterateForLoop() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        int actual = strBuilder.hashCode();
        
        assertEquals(32, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#hashCode()}
 * @utbot.returnsFrom {@code return hash;}
 *  */
    @Test
    public void testHashCode_ReturnHash() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#hashCode()}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hash = 31 * hash + buf[i];
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.hashCode(StrBuilder.java:2141) */
        strBuilder.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#hashCode()}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hash = 31 * hash + buf[i];
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.hashCode(StrBuilder.java:2141) */
        strBuilder.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.getChars
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getChars([C)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(char[])}
 * @utbot.executesCondition {@code (destination == null): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return destination;}
 *  */
    @Test
    public void testGetChars_DestinationEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        char[] actual = strBuilder.getChars(null);
        
        char[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getChars([C)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(char[])}
 * @utbot.executesCondition {@code (destination == null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: destination = new char[len];
 *  */
    @Test
    public void testGetChars_ThrowNegativeArraySizeException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -256;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.getChars] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.lang.text.StrBuilder.getChars(StrBuilder.java:388) */
        strBuilder.getChars(null);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(char[])}
 * @utbot.executesCondition {@code (destination == null): False}
 * @utbot.executesCondition {@code (destination.length < len): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, 0, destination, 0, len);
 *  */
    @Test
    public void testGetChars_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.getChars] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.getChars(StrBuilder.java:390) */
        strBuilder.getChars(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(char[])}
 * @utbot.executesCondition {@code (destination == null): False}
 * @utbot.executesCondition {@code (destination.length < len): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, 0, destination, 0, len);
 *  */
    @Test
    public void testGetChars_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        char[] charArray = {};
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.getChars] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.getChars(StrBuilder.java:390) */
        strBuilder.getChars(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(char[])}
 * @utbot.executesCondition {@code (destination == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, 0, destination, 0, len);
 *  */
    @Test
    public void testGetChars_ThrowNullPointerException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.getChars] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.getChars(StrBuilder.java:390) */
        strBuilder.getChars(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getChars([C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(char[])}
     */
    @Test
    public void testGetCharsWithNonEmptyPrimitiveArray() {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        char[] charArray = {'', '', ''};
        
        char[] actual = strBuilder.getChars(charArray);
        
        assertArrayEquals(charArray, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.getChars
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getChars(int, int, [C, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(int,int,char[],int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex > length()): False}
 * @utbot.executesCondition {@code (startIndex > endIndex): False}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testGetChars_StartIndexLessOrEqualEndIndex() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        char[] charArray = {' '};
        
        strBuilder.getChars(0, 0, charArray, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getChars(int, int, [C, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(int,int,char[],int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetChars_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.getChars(-1, -255, null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(int,int,char[],int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: endIndex < 0 || endIndex > length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetChars_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.getChars(0, -1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(int,int,char[],int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex > length()): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: endIndex < 0 || endIndex > length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetChars_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.getChars(0, 0, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(int,int,char[],int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex > length()): False}
 * @utbot.executesCondition {@code (startIndex > endIndex): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex > endIndex
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetChars_ThrowStringIndexOutOfBoundsException_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 2;
        
        strBuilder.getChars(3, 2, null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getChars(int, int, [C, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(int,int,char[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, startIndex, destination, destinationIndex, endIndex - startIndex);
 *  */
    @Test
    public void testGetChars_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.getChars] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.getChars(StrBuilder.java:414) */
        strBuilder.getChars(0, 0, charArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getChars(int,int,char[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, startIndex, destination, destinationIndex, endIndex - startIndex);
 *  */
    @Test
    public void testGetChars_ThrowNullPointerException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.getChars] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.getChars(StrBuilder.java:414) */
        strBuilder.getChars(0, 0, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(char, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.indexOf(' ', -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.indexOf(' ', 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.executesCondition {@code (startIndex >= size): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < size; i++)} once
 *  */
    @Test
    public void testIndexOf_IOfThisBufEqualsCh() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        int actual = strBuilder.indexOf(' ', -1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.executesCondition {@code (startIndex >= size): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < size; i++)} once
 *  */
    @Test
    public void testIndexOf_IOfThisBufNotEqualsCh() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\uFFDF'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        int actual = strBuilder.indexOf(' ', -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(char, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char,int)}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: thisBuf[i] == ch
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731) */
        strBuilder.indexOf(' ', -1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char,int)}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: thisBuf[i] == ch
 *  */
    @Test
    public void testIndexOf_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731) */
        strBuilder.indexOf(' ', -1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method indexOf(java.lang.String, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return -1;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testIndexOf_StrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.indexOf(((String) null), 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualSize1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        int actual = strBuilder.indexOf(string, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.indexOf(((String) null), -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method indexOf(java.lang.String, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (startIndex < 0): False},
    ///     {@code (str == null): False},
    ///     {@code (startIndex >= size): False}
    /// invoke:
    ///     {@link java.lang.String#length()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): False}
 * @utbot.executesCondition {@code (strLen == 0): True}
 * @utbot.returnsFrom {@code return startIndex;}
 *  */
    @Test
    public void testIndexOf_StrLenEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "";
        
        int actual = strBuilder.indexOf(string, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): False}
 * @utbot.executesCondition {@code (strLen == 0): False}
 * @utbot.executesCondition {@code (strLen > size): True}
 *  */
    @Test
    public void testIndexOf_StrLenGreaterThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        int actual = strBuilder.indexOf(string, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): False}
 * @utbot.executesCondition {@code (strLen == 0): False}
 * @utbot.executesCondition {@code (strLen > size): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < len; i++)} once
 *  */
    @Test
    public void testIndexOf_StrCharAtNotEqualsIjOfThisBuf() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 16;
        String string = "A              ";
        
        int actual = strBuilder.indexOf(string, 1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): True}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#indexOf(char,int)}
 * @utbot.returnsFrom {@code return indexOf(str.charAt(0), startIndex);}
 *  */
    @Test
    public void testIndexOf_StrLenEquals1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\uFFDF'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        int actual = strBuilder.indexOf(string, 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): False}
 * @utbot.executesCondition {@code (strLen == 0): False}
 * @utbot.executesCondition {@code (strLen > size): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: str.charAt(j) != thisBuf[i + j]
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 105;
        String string = "                                        ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780) */
        strBuilder.indexOf(string, 65);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): True}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#indexOf(char,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(str.charAt(0), startIndex);
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767) */
        strBuilder.indexOf(string, 0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): False}
 * @utbot.executesCondition {@code (strLen == 0): False}
 * @utbot.executesCondition {@code (strLen > size): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: str.charAt(j) != thisBuf[i + j]
 *  */
    @Test
    public void testIndexOf_ThrowNullPointerException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 138;
        String string = "            ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780) */
        strBuilder.indexOf(string, 126);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.String, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String,int)}
     */
    @Test
    public void testIndexOfWithNonEmptyStringAndCornerCase() {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        int actual = strBuilder.indexOf("-", Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.String, int)
    
    @Test
    public void testIndexOf1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        String string = "\u0000";
        
        int actual = strBuilder.indexOf(string, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexOf(java.lang.String, int)
    
    @Test
    public void testIndexOf2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741856;
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780) */
        strBuilder.indexOf(string, 0);
    }
    
    @Test
    public void testIndexOf3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741856;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780) */
        strBuilder.indexOf(string, 0);
    }
    
    @Test
    public void testIndexOf4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767) */
        strBuilder.indexOf(string, Integer.MIN_VALUE);
    }
    
    @Test
    public void testIndexOf5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 536870914;
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780) */
        strBuilder.indexOf(string, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        int actual = strBuilder.indexOf(charSetMatcher);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.indexOf(((StrMatcher) null));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'!'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        int actual = strBuilder.indexOf(trimMatcher);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        int actual = strBuilder.indexOf(trimMatcher);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher(' ');
        
        int actual = strBuilder.indexOf(charMatcher);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\uFFDF');
        
        int actual = strBuilder.indexOf(charMatcher);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'|'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        setField(charSetMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", buffer);
        
        int actual = strBuilder.indexOf(charSetMatcher);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(matcher, 0);
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1800) */
        strBuilder.indexOf(trimMatcher);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(matcher, 0);
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\u0000');
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$CharMatcher.isMatch(StrMatcher.java:307)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1800) */
        strBuilder.indexOf(charMatcher);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(matcher, 0);
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:275)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1800) */
        strBuilder.indexOf(charSetMatcher);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf(org.apache.commons.lang.text.StrMatcher)
    
    @Test
    public void testIndexOf6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0080', '\u0080', '\u0080', '\u0080', '\u0080', '\u0080', '\u0080', '\u0080',
            '\u0080'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        char[] chars = {'\u0081'};
        setField(charSetMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
        
        int actual = strBuilder.indexOf(charSetMatcher);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexOf(org.apache.commons.lang.text.StrMatcher)
    
    @Test
    public void testIndexOf7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.StringMatcher stringMatcher = ((StrMatcher.StringMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$StringMatcher"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrMatcher$StringMatcher.isMatch(StrMatcher.java:339)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1800) */
        strBuilder.indexOf(stringMatcher);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method indexOf(org.apache.commons.lang.text.StrMatcher, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return -1;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (matcher == null): False}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualSize2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        int actual = strBuilder.indexOf(charSetMatcher, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (matcher == null): True}
 *  */
    @Test
    public void testIndexOf_MatcherEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.indexOf(((StrMatcher) null), 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.executesCondition {@code (matcher == null): True}
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.indexOf(((StrMatcher) null), -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method indexOf(org.apache.commons.lang.text.StrMatcher, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (startIndex < 0): False},
    ///     {@code (matcher == null): False},
    ///     {@code (startIndex >= size): False}
    /// invoke:
    ///     {@link org.apache.commons.lang.text.StrMatcher#isMatch(char[],int,int,int)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < len; i++)} once
 *  */
    @Test
    public void testIndexOf_ReturnI() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        int actual = strBuilder.indexOf(trimMatcher, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < len; i++)} once
 *  */
    @Test
    public void testIndexOf_ReturnNegative1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'!'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        int actual = strBuilder.indexOf(trimMatcher, 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(org.apache.commons.lang.text.StrMatcher, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: matcher.isMatch(buf, i, startIndex, len) > 0
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823) */
        strBuilder.indexOf(trimMatcher, -1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: matcher.isMatch(buf, i, startIndex, len) > 0
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\u0000');
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$CharMatcher.isMatch(StrMatcher.java:307)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823) */
        strBuilder.indexOf(charMatcher, -1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf(org.apache.commons.lang.text.StrMatcher, int)
    
    @Test
    public void testIndexOf8() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.StringMatcher stringMatcher = ((StrMatcher.StringMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$StringMatcher"));
        
        int actual = strBuilder.indexOf(stringMatcher, Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf9() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[11];
        buffer[0] = '!';
        buffer[1] = '!';
        buffer[2] = '!';
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        int actual = strBuilder.indexOf(trimMatcher, Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf10() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
            '\u0001', '\u0001'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\u0001');
        
        int actual = strBuilder.indexOf(charMatcher, Integer.MIN_VALUE);
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexOf(org.apache.commons.lang.text.StrMatcher, int)
    
    @Test
    public void testIndexOf11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[15];
        buffer[0] = '\u0001';
        buffer[1] = '\u0001';
        buffer[2] = '\u0001';
        buffer[3] = '\u0001';
        buffer[4] = '\u0001';
        buffer[5] = '\u0001';
        buffer[6] = '\u0001';
        buffer[7] = '\u0001';
        buffer[8] = '\u0001';
        buffer[9] = '\u0001';
        buffer[10] = '\u0001';
        buffer[11] = '\u0001';
        buffer[12] = '\u0001';
        strBuilder.buffer = buffer;
        strBuilder.size = 31;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\u0001');
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            org.apache.commons.lang.text.StrMatcher$CharMatcher.isMatch(StrMatcher.java:307)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823) */
        strBuilder.indexOf(charMatcher, 13);
    }
    
    @Test
    public void testIndexOf12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[37];
        buffer[34] = '!';
        buffer[35] = '!';
        buffer[36] = '!';
        strBuilder.buffer = buffer;
        strBuilder.size = 39;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823) */
        strBuilder.indexOf(trimMatcher, 34);
    }
    
    @Test
    public void testIndexOf13() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.StringMatcher stringMatcher = ((StrMatcher.StringMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$StringMatcher"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrMatcher$StringMatcher.isMatch(StrMatcher.java:339)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823) */
        strBuilder.indexOf(stringMatcher, Integer.MIN_VALUE);
    }
    
    @Test
    public void testIndexOf14() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.StringMatcher stringMatcher = ((StrMatcher.StringMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$StringMatcher"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrMatcher$StringMatcher.isMatch(StrMatcher.java:339)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823) */
        strBuilder.indexOf(stringMatcher, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        int actual = strBuilder.indexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.indexOf(((String) null));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_21() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        int actual = strBuilder.indexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_41() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "";
        
        int actual = strBuilder.indexOf(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_31() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "_ ";
        
        int actual = strBuilder.indexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_51() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        int actual = strBuilder.indexOf(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_61() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\uFFDF'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        int actual = strBuilder.indexOf(string);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(str, 0);
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1747) */
        strBuilder.indexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(str, 0);
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1747) */
        strBuilder.indexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(str, 0);
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1747) */
        strBuilder.indexOf(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexOf(java.lang.String)
    
    @Test
    public void testIndexOf15() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 536870914;
        String string = "\u0000\u0001\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1747) */
        strBuilder.indexOf(string);
    }
    
    @Test
    public void testIndexOf16() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741844;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1747) */
        strBuilder.indexOf(string);
    }
    
    @Test
    public void testIndexOf17() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0001'};
        strBuilder.buffer = buffer;
        strBuilder.size = 33554433;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1747) */
        strBuilder.indexOf(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char)}
 * @utbot.returnsFrom {@code return indexOf(ch, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.indexOf(' ');
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char)}
 * @utbot.returnsFrom {@code return indexOf(ch, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        int actual = strBuilder.indexOf(' ');
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char)}
 * @utbot.returnsFrom {@code return indexOf(ch, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_22() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'_'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        int actual = strBuilder.indexOf(' ');
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#indexOf(char)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#indexOf(char,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(ch, 0);
 *  */
    @Test
    public void testIndexOf_ThrowArrayIndexOutOfBoundsException5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1714) */
        strBuilder.indexOf(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insert(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.Object)}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.String)}
 * @utbot.returnsFrom {@code return insert(index, nullText);}
 *  */
    @Test
    public void testInsert_ObjEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.insert(0, ((Object) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.Object)}
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return insert(index, obj.toString());
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        Integer integer = Integer.MIN_VALUE;
        
        strBuilder.insert(0, ((Object) integer));
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.Object)}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return insert(index, nullText);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        strBuilder.insert(-1, ((Object) null));
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.Object)}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return insert(index, nullText);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        strBuilder.insert(0, ((Object) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, java.lang.Object)
    
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        Integer integer = Integer.MIN_VALUE;
        
        strBuilder.insert(Integer.MIN_VALUE, ((Object) integer));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(int, java.lang.Object)
    
    @Test
    public void testInsert2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:945)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:925) */
        strBuilder.insert(0, ((Object) integer));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insert(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInsert_StrNotEqualsNull_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        StrBuilder actual = strBuilder.insert(0, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInsert_StrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.insert(0, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInsert_StrNotEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.insert(0, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.insert(0, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.insert(-1, ((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(int, java.lang.String)
    
    @Test
    public void testInsert3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2147483616;
        String nullText = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483616 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:946) */
        strBuilder.insert(1073741793, ((String) null));
    }
    
    @Test
    public void testInsert4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1073741824;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:945) */
        strBuilder.insert(1, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return insert(index, String.valueOf(value));
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.insert(-1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return insert(index, String.valueOf(value));
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.insert(0, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method insert(int, int)
    
    @Test
    public void testInsert5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[34];
        strBuilder.buffer = buffer;
        strBuilder.size = 14;
        
        StrBuilder actual = strBuilder.insert(7, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer7 = strBuilder.buffer[7];
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals('0', finalStrBuilderBuffer7);
        
        assertEquals(15, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(int, int)
    
    @Test
    public void testInsert6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 30;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 30 out of bounds for char[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:945)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1065) */
        strBuilder.insert(15, 0);
    }
    
    @Test
    public void testInsert7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = 2147483644;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483644 out of bounds for char[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:946)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1065) */
        strBuilder.insert(1073741821, Integer.MIN_VALUE);
    }
    
    @Test
    public void testInsert8() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:945)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1065) */
        strBuilder.insert(0, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, long)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,long)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return insert(index, String.valueOf(value));
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.insert(-1, java.lang.Long.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method insert(int, long)
    
    @Test
    public void testInsert9() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[16];
        strBuilder.buffer = buffer;
        strBuilder.size = 5;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.insert(2, java.lang.Long.MIN_VALUE);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(25, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(int, long)
    
    @Test
    public void testInsert10() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 2147483643;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483643 out of bounds for char[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:946)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1077) */
        strBuilder.insert(1073741822, java.lang.Long.MIN_VALUE);
    }
    
    @Test
    public void testInsert11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1073741824;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:945)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1077) */
        strBuilder.insert(1, 0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,float)}
     */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertThrowsSIOOBE() {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        strBuilder.insert(-16385, -1.0f);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(int, float)
    
    @Test
    public void testInsert12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:945)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1089) */
        strBuilder.insert(0, java.lang.Float.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,double)}
     */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertThrowsSIOOBE1() {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        strBuilder.insert(-16385, -1.0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(int, double)
    
    @Test
    public void testInsert13() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:945)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1101) */
        strBuilder.insert(0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insert(int, [C)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[])}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInsert_LenLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {};
        
        StrBuilder actual = strBuilder.insert(0, charArray);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[])}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#insert(int,java.lang.String)}
 * @utbot.returnsFrom {@code return insert(index, nullText);}
 *  */
    @Test
    public void testInsert_CharsEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.insert(0, ((char[]) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, [C)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.insert(0, ((char[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_13() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.insert(-1, ((char[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(int, [C)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[])}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, index, buffer, index + len, size - index);
 *  */
    @Test
    public void testInsert_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MAX_VALUE;
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483648 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:970) */
        strBuilder.insert(Integer.MAX_VALUE, charArray);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureCapacity(size + len);
 *  */
    @Test
    public void testInsert_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:969) */
        strBuilder.insert(1, charArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method insert(int, [C)
    
    @Test
    public void testInsert14() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        char[] charArray = new char[32];
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.insert(0, charArray);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(33, finalStrBuilderSize);
    }
    
    @Test
    public void testInsert15() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1073741824;
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.insert(1, ((char[]) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insert(int, [C, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[],int,int)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (offset > chars.length): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code (offset + length > chars.length): False}
 * @utbot.executesCondition {@code (length > 0): False}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#validateIndex(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInsert_LengthLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {};
        
        StrBuilder actual = strBuilder.insert(0, charArray, 0, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, [C, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[],int,int)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (offset < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: offset < 0 || offset > chars.length
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_14() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {' '};
        
        strBuilder.insert(0, charArray, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[],int,int)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (offset > chars.length): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: offset < 0 || offset > chars.length
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_21() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {};
        
        strBuilder.insert(0, charArray, 1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[],int,int)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (offset > chars.length): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code (offset + length > chars.length): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: length < 0 || offset + length > chars.length
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {' ', ' '};
        
        strBuilder.insert(0, charArray, 2, 1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[],int,int)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (offset > chars.length): False}
 * @utbot.executesCondition {@code (length < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: length < 0 || offset + length > chars.length
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] charArray = {};
        
        strBuilder.insert(0, charArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[],int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.insert(-1, null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[],int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.insert(0, null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(int, [C, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char[],int,int)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (offset > chars.length): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code (offset + length > chars.length): False}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#validateIndex(int)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, index, buffer, index + length, size - index);
 *  */
    @Test
    public void testInsert_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2097152;
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2145386497 out of bounds for char[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1001) */
        strBuilder.insert(2097152, charArray, 1, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method insert(int, [C, int, int)
    
    @Test
    public void testInsert16() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        char[] charArray = new char[18];
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.insert(0, charArray, 7, 9);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(9, finalStrBuilderSize);
    }
    
    @Test
    public void testInsert17() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1073741824;
        
        StrBuilder actual = strBuilder.insert(1, null, 0, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, boolean)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.insert(-1, false);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_15() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.insert(0, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(int, boolean)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,boolean)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, index, buffer, index + 4, size - index);
 *  */
    @Test
    public void testInsert_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MAX_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483645 out of bounds for char[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1020) */
        strBuilder.insert(Integer.MAX_VALUE, true);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureCapacity(size + 4);
 *  */
    @Test
    public void testInsert_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 21;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 21 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1019) */
        strBuilder.insert(6, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method insert(int, boolean)
    
    @Test
    public void testInsert18() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        
        StrBuilder actual = strBuilder.insert(0, false);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer0 = strBuilder.buffer[0];
        char finalStrBuilderBuffer1 = strBuilder.buffer[1];
        char finalStrBuilderBuffer2 = strBuilder.buffer[2];
        char finalStrBuilderBuffer3 = strBuilder.buffer[3];
        char finalStrBuilderBuffer4 = strBuilder.buffer[4];
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals('f', finalStrBuilderBuffer0);
        
        assertEquals('a', finalStrBuilderBuffer1);
        
        assertEquals('l', finalStrBuilderBuffer2);
        
        assertEquals('s', finalStrBuilderBuffer3);
        
        assertEquals('e', finalStrBuilderBuffer4);
        
        assertEquals(8, finalStrBuilderSize);
    }
    
    @Test
    public void testInsert19() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 29;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.insert(14, false);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(34, finalStrBuilderSize);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.insert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insert(int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInsert_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.insert(1, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(2, finalStrBuilderSize);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInsert_Return_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.insert(0, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(1, finalStrBuilderSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.insert(-1, ' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: validateIndex(index);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_ThrowStringIndexOutOfBoundsException_16() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.insert(0, ' ');
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, index, buffer, index + 1, size - index);
 *  */
    @Test
    public void testInsert_ThrowArrayIndexOutOfBoundsException3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MAX_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483648 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1050) */
        strBuilder.insert(Integer.MAX_VALUE, ' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#insert(int,char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureCapacity(size + 1);
 *  */
    @Test
    public void testInsert_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.insert] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.insert(StrBuilder.java:1049) */
        strBuilder.insert(1, ' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#clear()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testClear_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        StrBuilder actual = strBuilder.clear();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.charAt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method charAt(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#charAt(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= length()): False}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.returnsFrom {@code return buffer[index];}
 *  */
    @Test
    public void testCharAt_IndexLessThanLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        char actual = strBuilder.charAt(0);
        
        assertEquals(' ', actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method charAt(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#charAt(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= length()): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index < 0 || index >= length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAt_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.charAt(0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#charAt(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index < 0 || index >= length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAt_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.charAt(-1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method charAt(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#charAt(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return buffer[index];
 *  */
    @Test
    public void testCharAt_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.charAt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.charAt(StrBuilder.java:305) */
        strBuilder.charAt(0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return buffer[index];
 *  */
    @Test
    public void testCharAt_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.charAt] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.charAt(StrBuilder.java:305) */
        strBuilder.charAt(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.startsWith
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method startsWith(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#startsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > size): True}
 *  */
    @Test
    public void testStartsWith_LenGreaterThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        boolean actual = strBuilder.startsWith(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#startsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testStartsWith_StrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.startsWith(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#startsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len == 0): True}
 *  */
    @Test
    public void testStartsWith_LenEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        boolean actual = strBuilder.startsWith(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#startsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > size): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 *  */
    @Test
    public void testStartsWith_IOfBufferNotEqualsStrCharAt() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'!'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        boolean actual = strBuilder.startsWith(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#startsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > size): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 *  */
    @Test
    public void testStartsWith_IOfBufferEqualsStrCharAt() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        boolean actual = strBuilder.startsWith(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method startsWith(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#startsWith(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] != str.charAt(i)
 *  */
    @Test
    public void testStartsWith_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.startsWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.startsWith(StrBuilder.java:1525) */
        strBuilder.startsWith(string);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#startsWith(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[i] != str.charAt(i)
 *  */
    @Test
    public void testStartsWith_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.startsWith] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.startsWith(StrBuilder.java:1525) */
        strBuilder.startsWith(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf(char, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.lastIndexOf(' ', 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex >= size): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_IOfBufferEqualsCh() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        int actual = strBuilder.lastIndexOf(' ', 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex >= size): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_IOfBufferNotEqualsCh() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        int actual = strBuilder.lastIndexOf('_', 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastIndexOf(char, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] == ch
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1854) */
        strBuilder.lastIndexOf(' ', 1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex >= size): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] == ch
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1854) */
        strBuilder.lastIndexOf(' ', 0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[i] == ch
 *  */
    @Test
    public void testLastIndexOf_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1854) */
        strBuilder.lastIndexOf(' ', 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char)}
 * @utbot.returnsFrom {@code return lastIndexOf(ch, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.lastIndexOf(' ');
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char)}
 * @utbot.returnsFrom {@code return lastIndexOf(ch, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        int actual = strBuilder.lastIndexOf(' ');
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char)}
 * @utbot.returnsFrom {@code return lastIndexOf(ch, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        int actual = strBuilder.lastIndexOf('_');
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastIndexOf(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return lastIndexOf(ch, size - 1);
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1854)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1838) */
        strBuilder.lastIndexOf(' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return lastIndexOf(ch, size - 1);
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 2]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1854)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1838) */
        strBuilder.lastIndexOf('@');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return lastIndexOf(str, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        int actual = strBuilder.lastIndexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return lastIndexOf(str, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = Integer.MIN_VALUE;
        
        int actual = strBuilder.lastIndexOf(((String) null));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return lastIndexOf(str, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_21() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.lastIndexOf(((String) null));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return lastIndexOf(str, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        int actual = strBuilder.lastIndexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return lastIndexOf(str, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "";
        
        int actual = strBuilder.lastIndexOf(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return lastIndexOf(str, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        int actual = strBuilder.lastIndexOf(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return lastIndexOf(str, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\uFF80'};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = " ";
        
        int actual = strBuilder.lastIndexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return lastIndexOf(str, size - 1);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = "_";
        
        int actual = strBuilder.lastIndexOf(string);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastIndexOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return lastIndexOf(str, size - 1);
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1897)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1870) */
        strBuilder.lastIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return lastIndexOf(str, size - 1);
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1854)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1891)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1870) */
        strBuilder.lastIndexOf(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method lastIndexOf(java.lang.String)
    
    @Test
    public void testLastIndexOf1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[37];
        strBuilder.buffer = buffer;
        strBuilder.size = 64;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1897)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1870) */
        strBuilder.lastIndexOf(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return lastIndexOf(matcher, size);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        int actual = strBuilder.lastIndexOf(charSetMatcher);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return lastIndexOf(matcher, size);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        int actual = strBuilder.lastIndexOf(((StrMatcher) null));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return lastIndexOf(matcher, size);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_22() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'!'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        int actual = strBuilder.lastIndexOf(trimMatcher);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return lastIndexOf(matcher, size);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_31() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        int actual = strBuilder.lastIndexOf(trimMatcher);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return lastIndexOf(matcher, size);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_41() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\uFFDF');
        
        int actual = strBuilder.lastIndexOf(charMatcher);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return lastIndexOf(matcher, size);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_51() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher(' ');
        
        int actual = strBuilder.lastIndexOf(charMatcher);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastIndexOf(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return lastIndexOf(matcher, size);
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1944)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1921) */
        strBuilder.lastIndexOf(trimMatcher);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return lastIndexOf(matcher, size);
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\u0000');
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$CharMatcher.isMatch(StrMatcher.java:307)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1944)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1921) */
        strBuilder.lastIndexOf(charMatcher);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method lastIndexOf(org.apache.commons.lang.text.StrMatcher)
    
    @Test(timeout = 1000L)
    public void testLastIndexOf2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = Integer.MIN_VALUE;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        strBuilder.lastIndexOf(noMatcher);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testLastIndexOf_StrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        int actual = strBuilder.lastIndexOf(((String) null), -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        int actual = strBuilder.lastIndexOf(string, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex >= size): False}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 256;
        
        int actual = strBuilder.lastIndexOf(((String) null), 255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (strLen == 0): True}
 * @utbot.returnsFrom {@code return startIndex;}
 *  */
    @Test
    public void testLastIndexOf_StrLenEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "";
        
        int actual = strBuilder.lastIndexOf(string, 1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (strLen <= size): False}
 * @utbot.executesCondition {@code (strLen == 0): False}
 *  */
    @Test
    public void testLastIndexOf_StrLenNotEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        int actual = strBuilder.lastIndexOf(string, 1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (strLen <= size): True}
 * @utbot.executesCondition {@code (strLen == 1): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex - strLen + 1; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_StrCharAtNotEqualsIjOfBuffer() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "_ ";
        
        int actual = strBuilder.lastIndexOf(string, 2);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (strLen <= size): True}
 * @utbot.executesCondition {@code (strLen == 1): True}
 * @utbot.returnsFrom {@code return lastIndexOf(str.charAt(0), startIndex);}
 *  */
    @Test
    public void testLastIndexOf_StrLenEquals1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        int actual = strBuilder.lastIndexOf(string, 1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (strLen <= size): True}
 * @utbot.executesCondition {@code (strLen == 1): True}
 * @utbot.returnsFrom {@code return lastIndexOf(str.charAt(0), startIndex);}
 *  */
    @Test
    public void testLastIndexOf_StrLenEquals1_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\uFFDF'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        int actual = strBuilder.lastIndexOf(string, 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastIndexOf(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex - strLen + 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: str.charAt(j) != buffer[i + j]
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1897) */
        strBuilder.lastIndexOf(string, 2);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): True}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(char,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return lastIndexOf(str.charAt(0), startIndex);
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1854)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1891) */
        strBuilder.lastIndexOf(string, 1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
 * @utbot.executesCondition {@code (strLen == 1): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex - strLen + 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: str.charAt(j) != buffer[i + j]
 *  */
    @Test
    public void testLastIndexOf_ThrowNullPointerException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1897) */
        strBuilder.lastIndexOf(string, 2);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf(java.lang.String, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(java.lang.String,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyString() {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        int actual = strBuilder.lastIndexOf("-", -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastIndexOf(java.lang.String, int)
    
    @Test
    public void testLastIndexOf3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[13];
        strBuilder.buffer = buffer;
        strBuilder.size = 134217760;
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        int actual = strBuilder.lastIndexOf(string, 43);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method lastIndexOf(java.lang.String, int)
    
    @Test
    public void testLastIndexOf4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[13];
        strBuilder.buffer = buffer;
        strBuilder.size = 134217760;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1897) */
        strBuilder.lastIndexOf(string, 43);
    }
    
    @Test
    public void testLastIndexOf5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 16;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1897) */
        strBuilder.lastIndexOf(string, 1073741824);
    }
    
    @Test
    public void testLastIndexOf6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1073741824;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1854)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1891) */
        strBuilder.lastIndexOf(string, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf(org.apache.commons.lang.text.StrMatcher, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (matcher == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        int actual = strBuilder.lastIndexOf(charSetMatcher, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.executesCondition {@code (startIndex >= size): False}
 * @utbot.executesCondition {@code (matcher == null): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanSize1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.lastIndexOf(((StrMatcher) null), -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.executesCondition {@code (matcher == null): True}
 *  */
    @Test
    public void testLastIndexOf_MatcherEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        int actual = strBuilder.lastIndexOf(((StrMatcher) null), -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastIndexOf(org.apache.commons.lang.text.StrMatcher, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.executesCondition {@code (startIndex >= size): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: matcher.isMatch(buf, i, 0, endIndex) > 0
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1944) */
        strBuilder.lastIndexOf(trimMatcher, 1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#lastIndexOf(org.apache.commons.lang.text.StrMatcher,int)}
 * @utbot.executesCondition {@code (startIndex >= size): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: matcher.isMatch(buf, i, 0, endIndex) > 0
 *  */
    @Test
    public void testLastIndexOf_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\u0000');
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.lastIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$CharMatcher.isMatch(StrMatcher.java:307)
            org.apache.commons.lang.text.StrBuilder.lastIndexOf(StrBuilder.java:1944) */
        strBuilder.lastIndexOf(charMatcher, 0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastIndexOf(org.apache.commons.lang.text.StrMatcher, int)
    
    @Test
    public void testLastIndexOf7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[31];
        buffer[14] = '!';
        buffer[15] = '@';
        buffer[16] = '!';
        strBuilder.buffer = buffer;
        strBuilder.size = 17;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        int actual = strBuilder.lastIndexOf(trimMatcher, 1073741824);
        
        assertEquals(13, actual);
    }
    
    @Test
    public void testLastIndexOf8() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[39];
        buffer[0] = '\u0001';
        buffer[1] = '\u0001';
        buffer[2] = '\u0001';
        buffer[3] = '\u0001';
        buffer[4] = '\u0001';
        buffer[5] = '\u0001';
        buffer[6] = '\u0001';
        buffer[7] = '\u0001';
        buffer[8] = '\u0001';
        buffer[9] = '\u0001';
        buffer[10] = '\u0001';
        buffer[11] = '\u0001';
        buffer[12] = '\u0001';
        buffer[13] = '\u0001';
        buffer[14] = '\u0001';
        buffer[15] = '\u0001';
        buffer[16] = '\u0001';
        buffer[17] = '\u0001';
        buffer[18] = '\u0001';
        buffer[19] = '\u0001';
        buffer[20] = '\u0001';
        buffer[21] = '\u0001';
        buffer[22] = '\u0001';
        buffer[23] = '\u0001';
        buffer[24] = '\u0001';
        buffer[25] = '\u0001';
        buffer[26] = '\u0001';
        buffer[27] = '\u0001';
        buffer[28] = '\u0001';
        buffer[29] = '\u0001';
        buffer[32] = '\u0001';
        buffer[33] = '\u0001';
        buffer[34] = '\u0001';
        buffer[35] = '\u0001';
        buffer[36] = '\u0001';
        buffer[37] = '\u0001';
        buffer[38] = '\u0001';
        strBuilder.buffer = buffer;
        strBuilder.size = 32;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\u0001');
        
        int actual = strBuilder.lastIndexOf(charMatcher, 1073741824);
        
        assertEquals(29, actual);
    }
    
    @Test
    public void testLastIndexOf9() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[15];
        buffer[1] = '!';
        buffer[2] = '!';
        buffer[3] = '!';
        strBuilder.buffer = buffer;
        strBuilder.size = 6;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        int actual = strBuilder.lastIndexOf(trimMatcher, 3);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testLastIndexOf10() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[15];
        buffer[0] = '\u0001';
        buffer[4] = '\u0001';
        buffer[5] = '\u0001';
        buffer[6] = '\u0001';
        buffer[7] = '\u0001';
        buffer[8] = '\u0001';
        buffer[9] = '\u0001';
        buffer[10] = '\u0001';
        buffer[11] = '\u0001';
        buffer[12] = '\u0001';
        buffer[13] = '\u0001';
        buffer[14] = '\u0001';
        strBuilder.buffer = buffer;
        strBuilder.size = 6;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\u0001');
        
        int actual = strBuilder.lastIndexOf(charMatcher, 3);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testLastIndexOf11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        int actual = strBuilder.lastIndexOf(noMatcher, 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method lastIndexOf(org.apache.commons.lang.text.StrMatcher, int)
    
    @Test(timeout = 1000L)
    public void testLastIndexOf12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1073741824;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        strBuilder.lastIndexOf(noMatcher, 1073741824);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.substring
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method substring(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#substring(int)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#substring(int,int)}
 * @utbot.returnsFrom {@code return substring(start, size);}
 *  */
    @Test
    public void testSubstring_StrBuilderSubstring() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        String actual = strBuilder.substring(1);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method substring(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#substring(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return substring(start, size);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSubstring_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        strBuilder.substring(-1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#substring(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return substring(start, size);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSubstring_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.substring(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method substring(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#substring(int)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return substring(start, size);
 *  */
    @Test
    public void testSubstring_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.substring] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 0, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.substring(StrBuilder.java:1587)
            org.apache.commons.lang.text.StrBuilder.substring(StrBuilder.java:1569) */
        strBuilder.substring(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.substring
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method substring(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#substring(int,int)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#validateRange(int,int)}
 * @utbot.returnsFrom {@code return new String(buffer, startIndex, endIndex - startIndex);}
 *  */
    @Test
    public void testSubstring_StrBuilderValidateRange() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        String actual = strBuilder.substring(0, 1);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method substring(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSubstring_ThrowStringIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.substring(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSubstring_ThrowStringIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.substring(0, -1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method substring(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#substring(int,int)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#validateRange(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(buffer, startIndex, endIndex - startIndex);
 *  */
    @Test
    public void testSubstring_ThrowStringIndexOutOfBoundsException_21() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 255;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.substring] produces [java.lang.StringIndexOutOfBoundsException: offset 255, count 0, length 10]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.substring(StrBuilder.java:1587) */
        strBuilder.substring(255, 256);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#isEmpty()}
 * @utbot.returnsFrom {@code return size == 0;}
 *  */
    @Test
    public void testIsEmpty_SizeEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.isEmpty();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#isEmpty()}
 * @utbot.returnsFrom {@code return size == 0;}
 *  */
    @Test
    public void testIsEmpty_SizeNotEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        boolean actual = strBuilder.isEmpty();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replace(int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(int,int,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplace_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replace(0, 0, null);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(int,int,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplace_StringLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        StrBuilder actual = strBuilder.replace(0, 1, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replace(int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplace_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.replace(0, -1, null);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplace_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.replace(-1, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplace_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.replace(0, 0, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method replace(int, int, java.lang.String)
    
    @Test
    public void testReplace1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replace(0, 1, null);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method replace(int, int, java.lang.String)
    
    @Test
    public void testReplace2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2147483619;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replace] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483647 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1256)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1278) */
        strBuilder.replace(2147483616, 2147483622, string);
    }
    
    @Test
    public void testReplace3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741824;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replace] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1073741824 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1255)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1278) */
        strBuilder.replace(9, 1073741825, null);
    }
    
    @Test
    public void testReplace4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[34];
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741824;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replace] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1073741824 out of bounds for char[34]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1256)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1278) */
        strBuilder.replace(3, 1073741825, null);
    }
    
    @Test
    public void testReplace5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1879048193;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replace] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1879048193 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1255)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1278) */
        strBuilder.replace(9, 1879048192, null);
    }
    
    @Test
    public void testReplace6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1610612736;
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replace] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1255)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1278) */
        strBuilder.replace(3, 1073741826, string);
    }
    
    @Test
    public void testReplace7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 3;
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replace] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1260)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1278) */
        strBuilder.replace(0, 6, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replace(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.returnsFrom {@code return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);}
 *  */
    @Test
    public void testReplace_ReturnReplaceImpl_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        StrBuilder actual = strBuilder.replace(charSetMatcher, null, 0, 0, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.returnsFrom {@code return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);}
 *  */
    @Test
    public void testReplace_ReturnReplaceImpl() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replace(null, null, 0, 1, -255);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.returnsFrom {@code return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);}
 *  */
    @Test
    public void testReplace_ReturnReplaceImpl_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 256;
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        StrBuilder actual = strBuilder.replace(charSetMatcher, null, 255, 256, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.returnsFrom {@code return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);}
 *  */
    @Test
    public void testReplace_ReturnReplaceImpl_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 256;
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        String string = " ";
        
        StrBuilder actual = strBuilder.replace(charSetMatcher, string, 255, 256, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replace(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplace_ThrowStringIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.replace(null, null, -1, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplace_ThrowStringIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.replace(null, null, 0, -1, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method replace(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)
    
    @Test
    public void testReplace8() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '!', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741824;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        StrBuilder actual = strBuilder.replace(trimMatcher, null, 0, 1, 1);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplace9() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '!', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741824;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        String string = "";
        
        StrBuilder actual = strBuilder.replace(trimMatcher, string, 0, 1, 1);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplace10() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        StrBuilder actual = strBuilder.replace(trimMatcher, null, 0, 2, 1);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    
    @Test
    public void testReplace11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '!', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        StrBuilder actual = strBuilder.replace(trimMatcher, null, 0, 2, 1);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplace12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1073741824;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        String string = "";
        
        StrBuilder actual = strBuilder.replace(noMatcher, string, 1, 1073741825, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplace13() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        StrBuilder actual = strBuilder.replace(noMatcher, null, 0, 1, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplace14() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1610612736;
        
        StrBuilder actual = strBuilder.replace(null, null, 3, 1073741826, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplace15() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1610612736;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        StrBuilder actual = strBuilder.replace(noMatcher, null, 0, 1, 1);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method replace(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)
    
    @Test(timeout = 1000L)
    public void testReplace16() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741824;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        strBuilder.replace(trimMatcher, null, 0, 1, 1);
    }
    
    @Test(timeout = 1000L)
    public void testReplace17() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741824;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        strBuilder.replace(trimMatcher, string, 0, 1, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replaceFirst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceFirst(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_SearchLenGreaterThanZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = " ";
        
        StrBuilder actual = strBuilder.replaceFirst(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): True}
 * @utbot.executesCondition {@code (searchLen > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_SearchStrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replaceFirst(((String) null), ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_SearchLenLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        StrBuilder actual = strBuilder.replaceFirst(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_SearchLenGreaterThanZero_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        StrBuilder actual = strBuilder.replaceFirst(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_SearchLenGreaterThanZero_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "_ ";
        
        StrBuilder actual = strBuilder.replaceFirst(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_SearchLenGreaterThanZero_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\uFFDF'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        StrBuilder actual = strBuilder.replaceFirst(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceFirst(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = indexOf(searchStr, 0);
 *  */
    @Test
    public void testReplaceFirst_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1353) */
        strBuilder.replaceFirst(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = indexOf(searchStr, 0);
 *  */
    @Test
    public void testReplaceFirst_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767)
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1353) */
        strBuilder.replaceFirst(string, ((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method replaceFirst(java.lang.String, java.lang.String)
    
    @Test
    public void testReplaceFirst1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[34];
        buffer[0] = '\u0001';
        strBuilder.buffer = buffer;
        strBuilder.size = 32;
        String string = "\u0000";
        
        StrBuilder actual = strBuilder.replaceFirst(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(31, finalStrBuilderSize);
    }
    
    @Test
    public void testReplaceFirst2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "\u0000";
        
        StrBuilder actual = strBuilder.replaceFirst(string, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method replaceFirst(java.lang.String, java.lang.String)
    
    @Test
    public void testReplaceFirst3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 513;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 513 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1255)
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1356) */
        strBuilder.replaceFirst(string, ((String) null));
    }
    
    @Test
    public void testReplaceFirst4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 268435464;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1353) */
        strBuilder.replaceFirst(string, ((String) null));
    }
    
    @Test
    public void testReplaceFirst5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 268435464;
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1353) */
        strBuilder.replaceFirst(string, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replaceFirst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceFirst(char, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(char,char)}
 * @utbot.executesCondition {@code (search != replace): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_SearchNotEqualsReplace() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replaceFirst('_', ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(char,char)}
 * @utbot.executesCondition {@code (search != replace): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_SearchEqualsReplace() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replaceFirst(' ', ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(char,char)}
 * @utbot.executesCondition {@code (search != replace): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_IOfBufferEqualsSearch() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.replaceFirst(' ', '_');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer0 = strBuilder.buffer[0];
        
        assertEquals('_', finalStrBuilderBuffer0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(char,char)}
 * @utbot.executesCondition {@code (search != replace): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceFirst_IOfBufferNotEqualsSearch() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.replaceFirst('_', ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceFirst(char, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(char,char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] == search
 *  */
    @Test
    public void testReplaceFirst_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1313) */
        strBuilder.replaceFirst('_', ' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(char,char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[i] == search
 *  */
    @Test
    public void testReplaceFirst_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1313) */
        strBuilder.replaceFirst('_', ' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replaceFirst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(org.apache.commons.lang.text.StrMatcher,java.lang.String)}
 * @utbot.returnsFrom {@code return replace(matcher, replaceStr, 0, size, 1);}
 *  */
    @Test
    public void testReplaceFirst_ReturnReplace() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        StrBuilder actual = strBuilder.replaceFirst(charSetMatcher, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(org.apache.commons.lang.text.StrMatcher,java.lang.String)}
 * @utbot.returnsFrom {@code return replace(matcher, replaceStr, 0, size, 1);}
 *  */
    @Test
    public void testReplaceFirst_ReturnReplace_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replaceFirst(((StrMatcher) null), ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(org.apache.commons.lang.text.StrMatcher,java.lang.String)}
 * @utbot.returnsFrom {@code return replace(matcher, replaceStr, 0, size, 1);}
 *  */
    @Test
    public void testReplaceFirst_ReturnReplace_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'!'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        StrBuilder actual = strBuilder.replaceFirst(trimMatcher, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(org.apache.commons.lang.text.StrMatcher,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return replace(matcher, replaceStr, 0, size, 1);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplaceFirst_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.replaceFirst(((StrMatcher) null), ((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceFirst(org.apache.commons.lang.text.StrMatcher,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return replace(matcher, replaceStr, 0, size, 1);
 *  */
    @Test
    public void testReplaceFirst_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1441)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1414)
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1390) */
        strBuilder.replaceFirst(trimMatcher, ((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    @Test
    public void testReplaceFirst6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[12];
        buffer[0] = '\u0001';
        strBuilder.buffer = buffer;
        strBuilder.size = 11;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        StrBuilder actual = strBuilder.replaceFirst(trimMatcher, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer0 = strBuilder.buffer[0];
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals('\u0000', finalStrBuilderBuffer0);
        
        assertEquals(10, finalStrBuilderSize);
    }
    
    @Test
    public void testReplaceFirst7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        String string = "\u0000";
        
        StrBuilder actual = strBuilder.replaceFirst(trimMatcher, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer0 = strBuilder.buffer[0];
        
        assertEquals('\u0000', finalStrBuilderBuffer0);
    }
    
    @Test
    public void testReplaceFirst8() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '!', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        String string = "";
        
        StrBuilder actual = strBuilder.replaceFirst(trimMatcher, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(1, finalStrBuilderSize);
    }
    
    @Test
    public void testReplaceFirst9() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        StrBuilder actual = strBuilder.replaceFirst(noMatcher, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplaceFirst10() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        String string = "";
        
        StrBuilder actual = strBuilder.replaceFirst(noMatcher, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    @Test
    public void testReplaceFirst11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = 11;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 11 out of bounds for char[8]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1255)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1443)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1414)
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1390) */
        strBuilder.replaceFirst(trimMatcher, ((String) null));
    }
    
    @Test
    public void testReplaceFirst12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1441)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1414)
            org.apache.commons.lang.text.StrBuilder.replaceFirst(StrBuilder.java:1390) */
        strBuilder.replaceFirst(trimMatcher, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replaceAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceAll(char, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(char,char)}
 * @utbot.executesCondition {@code (search != replace): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_SearchNotEqualsReplace() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replaceAll('_', ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(char,char)}
 * @utbot.executesCondition {@code (search != replace): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_SearchEqualsReplace() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replaceAll(' ', ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(char,char)}
 * @utbot.executesCondition {@code (search != replace): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_IOfBufferEqualsSearch() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.replaceAll(' ', '_');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer0 = strBuilder.buffer[0];
        
        assertEquals('_', finalStrBuilderBuffer0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(char,char)}
 * @utbot.executesCondition {@code (search != replace): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_IOfBufferNotEqualsSearch() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.replaceAll('_', ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceAll(char, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(char,char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] == search
 *  */
    @Test
    public void testReplaceAll_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1294) */
        strBuilder.replaceAll('_', ' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(char,char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[i] == search
 *  */
    @Test
    public void testReplaceAll_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1294) */
        strBuilder.replaceAll('_', ' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replaceAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(org.apache.commons.lang.text.StrMatcher,java.lang.String)}
 * @utbot.returnsFrom {@code return replace(matcher, replaceStr, 0, size, -1);}
 *  */
    @Test
    public void testReplaceAll_ReturnReplace() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        StrBuilder actual = strBuilder.replaceAll(charSetMatcher, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(org.apache.commons.lang.text.StrMatcher,java.lang.String)}
 * @utbot.returnsFrom {@code return replace(matcher, replaceStr, 0, size, -1);}
 *  */
    @Test
    public void testReplaceAll_ReturnReplace_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replaceAll(((StrMatcher) null), ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(org.apache.commons.lang.text.StrMatcher,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return replace(matcher, replaceStr, 0, size, -1);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplaceAll_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.replaceAll(((StrMatcher) null), ((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(org.apache.commons.lang.text.StrMatcher,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return replace(matcher, replaceStr, 0, size, -1);
 *  */
    @Test
    public void testReplaceAll_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1441)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1414)
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1375) */
        strBuilder.replaceAll(trimMatcher, ((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    @Test
    public void testReplaceAll1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '!', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        StrBuilder actual = strBuilder.replaceAll(trimMatcher, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(1, finalStrBuilderSize);
    }
    
    @Test
    public void testReplaceAll2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        String string = "\u0000";
        
        StrBuilder actual = strBuilder.replaceAll(trimMatcher, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer0 = strBuilder.buffer[0];
        
        assertEquals('\u0000', finalStrBuilderBuffer0);
    }
    
    @Test
    public void testReplaceAll3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '!', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        String string = "";
        
        StrBuilder actual = strBuilder.replaceAll(trimMatcher, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(1, finalStrBuilderSize);
    }
    
    @Test
    public void testReplaceAll4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        StrBuilder actual = strBuilder.replaceAll(noMatcher, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplaceAll5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        String string = "";
        
        StrBuilder actual = strBuilder.replaceAll(noMatcher, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)
    
    @Test
    public void testReplaceAll6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = 11;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 11 out of bounds for char[8]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1255)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1443)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1414)
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1375) */
        strBuilder.replaceAll(trimMatcher, ((String) null));
    }
    
    @Test
    public void testReplaceAll7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1441)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1414)
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1375) */
        strBuilder.replaceAll(trimMatcher, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replaceAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceAll(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): True}
 * @utbot.executesCondition {@code (replaceStr == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_ReplaceStrNotEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = " ";
        
        StrBuilder actual = strBuilder.replaceAll(string, string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): True}
 * @utbot.executesCondition {@code (searchLen > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_SearchStrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.replaceAll(((String) null), ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_SearchLenLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        StrBuilder actual = strBuilder.replaceAll(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): True}
 * @utbot.executesCondition {@code (replaceStr == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_ReplaceStrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = " ";
        
        StrBuilder actual = strBuilder.replaceAll(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): True}
 * @utbot.executesCondition {@code (replaceStr == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_ReplaceStrEqualsNull_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        StrBuilder actual = strBuilder.replaceAll(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (searchStr == null): False}
 * @utbot.executesCondition {@code (searchLen > 0): True}
 * @utbot.executesCondition {@code (replaceStr == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReplaceAll_ReplaceStrEqualsNull_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "_ ";
        
        StrBuilder actual = strBuilder.replaceAll(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceAll(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = indexOf(searchStr, 0);
 *  */
    @Test
    public void testReplaceAll_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1334) */
        strBuilder.replaceAll(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = indexOf(searchStr, 0);
 *  */
    @Test
    public void testReplaceAll_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767)
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1334) */
        strBuilder.replaceAll(string, ((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method replaceAll(java.lang.String, java.lang.String)
    
    @Test
    public void testReplaceAll8() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = "\u0000";
        
        StrBuilder actual = strBuilder.replaceAll(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplaceAll9() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[34];
        strBuilder.buffer = buffer;
        strBuilder.size = 32;
        String string = "\u0000";
        
        StrBuilder actual = strBuilder.replaceAll(string, ((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method replaceAll(java.lang.String, java.lang.String)
    
    @Test
    public void testReplaceAll10() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741860;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1334) */
        strBuilder.replaceAll(string, ((String) null));
    }
    
    @Test
    public void testReplaceAll11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 16;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 16 out of bounds for char[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1255)
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1336) */
        strBuilder.replaceAll(string, ((String) null));
    }
    
    @Test
    public void testReplaceAll12() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741860;
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.replaceAll(StrBuilder.java:1334) */
        strBuilder.replaceAll(string, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#size()}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testSize_ReturnSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        int actual = strBuilder.size();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.trim
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trim()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#trim()}
 * @utbot.executesCondition {@code (size == 0): True}
 *  */
    @Test
    public void testTrim_SizeEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.trim();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#trim()}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (len < size): False}
 * @utbot.executesCondition {@code (pos > 0): False}
 * @utbot.iterates iterate the loop {@code while(pos < len && buf[pos] <= ' ')} twice
 *  */
    @Test
    public void testTrim_PosGreaterOrEqualLenAndLen1OfBufGreaterThanChar() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'!'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.trim();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#trim()}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (len < size): False}
 * @utbot.executesCondition {@code (pos > 0): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#delete(int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < len && buf[pos] <= ' ')} once
 *  */
    @Test
    public void testTrim_PosGreaterThanZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.trim();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#trim()}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (len < size): False}
 * @utbot.executesCondition {@code (pos > 0): False}
 *  */
    @Test
    public void testTrim_PosLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -256;
        
        StrBuilder actual = strBuilder.trim();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method trim()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#trim()}
 * @utbot.iterates iterate the loop {@code while(pos < len && buf[pos] <= ' ')} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(pos < len && buf[pos] <= ' ')
 *  */
    @Test
    public void testTrim_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.trim] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.trim(StrBuilder.java:1489) */
        strBuilder.trim();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#trim()}
 * @utbot.iterates iterate the loop {@code while(pos < len && buf[pos] <= ' ')} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(pos < len && buf[len - 1] <= ' ')
 *  */
    @Test
    public void testTrim_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '!', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741825;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.trim] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.trim(StrBuilder.java:1492) */
        strBuilder.trim();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#trim()}
 * @utbot.iterates iterate the loop {@code while(pos < len && buf[pos] <= ' ')} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(pos < len && buf[pos] <= ' ')
 *  */
    @Test
    public void testTrim_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.trim] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang.text.StrBuilder.trim(StrBuilder.java:1489) */
        strBuilder.trim();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#trim()}
 * @utbot.iterates iterate the loop {@code while(pos < len && buf[pos] <= ' ')} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(pos < len && buf[pos] <= ' ')
 *  */
    @Test
    public void testTrim_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.trim] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.trim(StrBuilder.java:1489) */
        strBuilder.trim();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method trim()
    
    @Test
    public void testTrim1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[11];
        buffer[0] = '!';
        buffer[1] = '\u0001';
        buffer[2] = '\u0001';
        buffer[3] = '\u0001';
        buffer[4] = '\u0001';
        buffer[5] = '\u0001';
        buffer[6] = '\u0001';
        buffer[7] = '\u0001';
        buffer[8] = '\u0001';
        buffer[9] = '\u0001';
        buffer[10] = '\u0001';
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        
        StrBuilder actual = strBuilder.trim();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(1, finalStrBuilderSize);
    }
    
    @Test
    public void testTrim2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[15];
        buffer[0] = '\u0001';
        buffer[1] = '!';
        buffer[2] = '\u0001';
        buffer[3] = '\u0001';
        buffer[4] = '\u0001';
        buffer[5] = '\u0001';
        buffer[6] = '\u0001';
        buffer[7] = '\u0001';
        buffer[8] = '\u0001';
        buffer[9] = '\u0001';
        buffer[10] = '\u0001';
        buffer[11] = '\u0001';
        buffer[12] = '\u0001';
        buffer[13] = '\u0001';
        buffer[14] = '\u0001';
        strBuilder.buffer = buffer;
        strBuilder.size = 6;
        
        StrBuilder actual = strBuilder.trim();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer0 = strBuilder.buffer[0];
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals('!', finalStrBuilderBuffer0);
        
        assertEquals(1, finalStrBuilderSize);
    }
    
    @Test
    public void testTrim3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
            '\u0001'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        StrBuilder actual = strBuilder.trim();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.toCharArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toCharArray()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray()}
 * @utbot.executesCondition {@code (size == 0): True}
 * @utbot.returnsFrom {@code return ArrayUtils.EMPTY_CHAR_ARRAY;}
 *  */
    @Test
    public void testToCharArray_SizeEqualsZero() throws Exception  {
        char[] prevEMPTY_CHAR_ARRAY = org.apache.commons.lang.ArrayUtils.EMPTY_CHAR_ARRAY;
        try {
            char[] emptyCharArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CHAR_ARRAY", emptyCharArray);
            StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
            
            char[] actual = strBuilder.toCharArray();
            
            assertArrayEquals(emptyCharArray, actual);
        } finally {
            setStaticField(org.apache.commons.lang.ArrayUtils.class, "EMPTY_CHAR_ARRAY", prevEMPTY_CHAR_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray()}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return chars;}
 *  */
    @Test
    public void testToCharArray_SizeNotEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        char[] actual = strBuilder.toCharArray();
        
        char[] expected = {' '};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toCharArray()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: char[] chars = new char[size];
 *  */
    @Test
    public void testToCharArray_ThrowNegativeArraySizeException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -256;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.toCharArray] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.lang.text.StrBuilder.toCharArray(StrBuilder.java:353) */
        strBuilder.toCharArray();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, 0, chars, 0, size);
 *  */
    @Test
    public void testToCharArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.toCharArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.toCharArray(StrBuilder.java:354) */
        strBuilder.toCharArray();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, 0, chars, 0, size);
 *  */
    @Test
    public void testToCharArray_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.toCharArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.toCharArray(StrBuilder.java:354) */
        strBuilder.toCharArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.toCharArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toCharArray(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray(int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return chars;}
 *  */
    @Test
    public void testToCharArray_LenNotEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        char[] actual = strBuilder.toCharArray(0, 3);
        
        char[] expected = {' ', ' '};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray(int,int)}
 * @utbot.executesCondition {@code (len == 0): True}
 *  */
    @Test
    public void testToCharArray_LenEqualsZero() throws Exception  {
        char[] prevEMPTY_CHAR_ARRAY = org.apache.commons.lang.ArrayUtils.EMPTY_CHAR_ARRAY;
        try {
            char[] emptyCharArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CHAR_ARRAY", emptyCharArray);
            StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
            
            char[] actual = strBuilder.toCharArray(0, 1);
            
            assertArrayEquals(emptyCharArray, actual);
        } finally {
            setStaticField(org.apache.commons.lang.ArrayUtils.class, "EMPTY_CHAR_ARRAY", prevEMPTY_CHAR_ARRAY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toCharArray(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToCharArray_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.toCharArray(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToCharArray_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.toCharArray(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToCharArray_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.toCharArray(-1, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toCharArray(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, startIndex, chars, 0, len);
 *  */
    @Test
    public void testToCharArray_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.toCharArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.toCharArray(StrBuilder.java:375) */
        strBuilder.toCharArray(0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toCharArray(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, startIndex, chars, 0, len);
 *  */
    @Test
    public void testToCharArray_ThrowNullPointerException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.toCharArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.toCharArray(StrBuilder.java:375) */
        strBuilder.toCharArray(0, 2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): True}
 *  */
    @Test
    public void testEqualsIgnoreCase_Other() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.equalsIgnoreCase(strBuilder);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (this.size != other.size): True}
 *  */
    @Test
    public void testEqualsIgnoreCase_ThisSizeNotEqualsOtherSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 1;
        
        boolean actual = strBuilder.equalsIgnoreCase(strBuilder1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testEqualsIgnoreCase_C1EqualsC2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.buffer = buffer;
        strBuilder1.size = 1;
        
        boolean actual = strBuilder.equalsIgnoreCase(strBuilder1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testEqualsIgnoreCase_CharacterToUpperCaseNotEqualsCharacterToUpperCase() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'`'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer1 = {'a'};
        strBuilder1.buffer = buffer1;
        strBuilder1.size = 1;
        
        boolean actual = strBuilder.equalsIgnoreCase(strBuilder1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testEqualsIgnoreCase_CharacterToUpperCaseEqualsCharacterToUpperCase() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'A'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer1 = {'a'};
        strBuilder1.buffer = buffer1;
        strBuilder1.size = 1;
        
        boolean actual = strBuilder.equalsIgnoreCase(strBuilder1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 *  */
    @Test
    public void testEqualsIgnoreCase_ThisSizeEqualsOtherSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.equalsIgnoreCase(strBuilder1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c2 = otherBuf[i];
 *  */
    @Test
    public void testEqualsIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer1 = {};
        strBuilder1.buffer = buffer1;
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(StrBuilder.java:2086) */
        strBuilder.equalsIgnoreCase(strBuilder1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c1 = thisBuf[i];
 *  */
    @Test
    public void testEqualsIgnoreCase_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(StrBuilder.java:2085) */
        strBuilder.equalsIgnoreCase(strBuilder1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.size != other.size
 *  */
    @Test
    public void testEqualsIgnoreCase_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(StrBuilder.java:2079) */
        strBuilder.equalsIgnoreCase(null);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c2 = otherBuf[i];
 *  */
    @Test
    public void testEqualsIgnoreCase_ThrowNullPointerException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(StrBuilder.java:2086) */
        strBuilder.equalsIgnoreCase(strBuilder1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)}
 * @utbot.executesCondition {@code (this.size != other.size): False}
 * @utbot.iterates iterate the loop {@code for(int i = size - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c1 = thisBuf[i];
 *  */
    @Test
    public void testEqualsIgnoreCase_ThrowNullPointerException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrBuilder strBuilder1 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder1.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(StrBuilder.java:2085) */
        strBuilder.equalsIgnoreCase(strBuilder1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.endsWith
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endsWith(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#endsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > size): True}
 *  */
    @Test
    public void testEndsWith_LenGreaterThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        boolean actual = strBuilder.endsWith(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#endsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testEndsWith_StrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.endsWith(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#endsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len == 0): True}
 *  */
    @Test
    public void testEndsWith_LenEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        boolean actual = strBuilder.endsWith(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#endsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > size): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++, pos++)} once
 *  */
    @Test
    public void testEndsWith_PosOfBufferNotEqualsStrCharAt() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = "$";
        
        boolean actual = strBuilder.endsWith(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#endsWith(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > size): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++, pos++)} once
 *  */
    @Test
    public void testEndsWith_PosOfBufferEqualsStrCharAt() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        boolean actual = strBuilder.endsWith(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endsWith(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#endsWith(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++, pos++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[pos] != str.charAt(i)
 *  */
    @Test
    public void testEndsWith_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.endsWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.endsWith(StrBuilder.java:1553) */
        strBuilder.endsWith(string);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#endsWith(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++, pos++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[pos] != str.charAt(i)
 *  */
    @Test
    public void testEndsWith_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.endsWith] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.endsWith(StrBuilder.java:1553) */
        strBuilder.endsWith(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        boolean actual = strBuilder.contains(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.contains(((String) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        boolean actual = strBuilder.contains(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "";
        
        boolean actual = strBuilder.contains(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "_ ";
        
        boolean actual = strBuilder.contains(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        boolean actual = strBuilder.contains(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOf(str, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\uFFDF'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        boolean actual = strBuilder.contains(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(str, 0) >= 0;
 *  */
    @Test
    public void testContains_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.contains] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.contains(StrBuilder.java:1688) */
        strBuilder.contains(string);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(str, 0) >= 0;
 *  */
    @Test
    public void testContains_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.contains] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767)
            org.apache.commons.lang.text.StrBuilder.contains(StrBuilder.java:1688) */
        strBuilder.contains(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method contains(java.lang.String)
    
    @Test
    public void testContains1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741860;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.contains] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.contains(StrBuilder.java:1688) */
        strBuilder.contains(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        boolean actual = strBuilder.contains(charSetMatcher);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.contains(((StrMatcher) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_21() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'!'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        boolean actual = strBuilder.contains(trimMatcher);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_31() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        boolean actual = strBuilder.contains(trimMatcher);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_41() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\uFFDF');
        
        boolean actual = strBuilder.contains(charMatcher);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return indexOf(matcher, 0) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_51() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher(' ');
        
        boolean actual = strBuilder.contains(charMatcher);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(matcher, 0) >= 0;
 *  */
    @Test
    public void testContains_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.contains] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823)
            org.apache.commons.lang.text.StrBuilder.contains(StrBuilder.java:1703) */
        strBuilder.contains(trimMatcher);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOf(matcher, 0) >= 0;
 *  */
    @Test
    public void testContains_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.CharMatcher charMatcher = new StrMatcher.CharMatcher('\u0000');
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.contains] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$CharMatcher.isMatch(StrMatcher.java:307)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1823)
            org.apache.commons.lang.text.StrBuilder.contains(StrBuilder.java:1703) */
        strBuilder.contains(charMatcher);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contains(org.apache.commons.lang.text.StrMatcher)
    
    @Test
    public void testContains2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        boolean actual = strBuilder.contains(noMatcher);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.size; i++)} once
 *  */
    @Test
    public void testContains_IOfThisBufEqualsCh() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        boolean actual = strBuilder.contains(' ');
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.size; i++)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContains_IOfThisBufNotEqualsCh() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'_'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        boolean actual = strBuilder.contains(' ');
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(char)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContains_ReturnFalse() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        boolean actual = strBuilder.contains(' ');
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: thisBuf[i] == ch
 *  */
    @Test
    public void testContains_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.contains] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.contains(StrBuilder.java:1674) */
        strBuilder.contains(' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#contains(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: thisBuf[i] == ch
 *  */
    @Test
    public void testContains_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.contains] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.contains(StrBuilder.java:1674) */
        strBuilder.contains(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.delete
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#delete(int,int)}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDelete_LenLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.delete(0, 0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#delete(int,int)}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDelete_LenLessOrEqualZero_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.delete(0, 1);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#delete(int,int)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.invokes org.apache.commons.lang.text.StrBuilder#deleteImpl(int,int,int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDelete_LenGreaterThanZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[15];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        strBuilder.buffer = buffer;
        strBuilder.size = 15;
        
        StrBuilder actual = strBuilder.delete(0, 16);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#delete(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDelete_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.delete(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#delete(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: endIndex = validateRange(startIndex, endIndex);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDelete_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.delete(0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#delete(int,int)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#validateRange(int,int)}
 * @utbot.invokes org.apache.commons.lang.text.StrBuilder#deleteImpl(int,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deleteImpl(startIndex, endIndex, len);
 *  */
    @Test
    public void testDelete_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 255;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.delete] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114)
            org.apache.commons.lang.text.StrBuilder.delete(StrBuilder.java:1131) */
        strBuilder.delete(0, 256);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method delete(int, int)
    
    @Test
    public void testDelete1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741824;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.delete] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1073741824 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114)
            org.apache.commons.lang.text.StrBuilder.delete(StrBuilder.java:1131) */
        strBuilder.delete(0, 3);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.setLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLength(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setLength(int)}
 * @utbot.executesCondition {@code (length < size): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetLength_LengthLessThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.setLength(0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setLength(int)}
 * @utbot.executesCondition {@code (length < size): False}
 * @utbot.executesCondition {@code (length > size): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetLength_LengthLessOrEqualSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.setLength(0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setLength(int)}
 * @utbot.executesCondition {@code (length < size): False}
 * @utbot.executesCondition {@code (length > size): True}
 * @utbot.iterates iterate the loop {@code for(int i = oldEnd; i < newEnd; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetLength_LengthGreaterThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        buffer[17] = ' ';
        buffer[18] = ' ';
        buffer[19] = ' ';
        buffer[20] = ' ';
        buffer[21] = ' ';
        buffer[22] = ' ';
        buffer[23] = ' ';
        buffer[24] = ' ';
        buffer[25] = ' ';
        buffer[26] = ' ';
        buffer[27] = ' ';
        buffer[28] = ' ';
        buffer[29] = ' ';
        buffer[30] = ' ';
        buffer[31] = ' ';
        strBuilder.buffer = buffer;
        strBuilder.size = 31;
        
        StrBuilder actual = strBuilder.setLength(32);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer31 = strBuilder.buffer[31];
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals('\u0000', finalStrBuilderBuffer31);
        
        assertEquals(32, finalStrBuilderSize);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setLength(int)}
 * @utbot.executesCondition {@code (length < size): False}
 * @utbot.executesCondition {@code (length > size): True}
 * @utbot.iterates iterate the loop {@code for(int i = oldEnd; i < newEnd; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetLength_LengthGreaterThanSize_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.setLength(1);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(1, finalStrBuilderSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLength(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setLength(int)}
 * @utbot.executesCondition {@code (length < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: length < 0
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetLength_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.setLength(-1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLength(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setLength(int)}
 * @utbot.iterates iterate the loop {@code for(int i = oldEnd; i < newEnd; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[i] = '\0';
 *  */
    @Test
    public void testSetLength_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.setLength] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.setLength(StrBuilder.java:205) */
        strBuilder.setLength(0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setLength(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureCapacity(length);
 *  */
    @Test
    public void testSetLength_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.setLength] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2147483648 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.setLength(StrBuilder.java:200) */
        strBuilder.setLength(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.capacity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method capacity()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#capacity()}
 * @utbot.returnsFrom {@code return buffer.length;}
 *  */
    @Test
    public void testCapacity_ReturnBufferLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        
        int actual = strBuilder.capacity();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method capacity()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#capacity()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return buffer.length;
 *  */
    @Test
    public void testCapacity_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.capacity] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.capacity(StrBuilder.java:218) */
        strBuilder.capacity();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.ensureCapacity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureCapacity(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.executesCondition {@code (capacity > buffer.length): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnsureCapacity_CapacityLessOrEqualBufferLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        
        StrBuilder actual = strBuilder.ensureCapacity(1);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.executesCondition {@code (capacity > buffer.length): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnsureCapacity_CapacityGreaterThanBufferLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.ensureCapacity(1);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureCapacity(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.executesCondition {@code (capacity > buffer.length): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(old, 0, buffer, 0, size);
 *  */
    @Test
    public void testEnsureCapacity_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.ensureCapacity] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231) */
        strBuilder.ensureCapacity(2);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#ensureCapacity(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: capacity > buffer.length
 *  */
    @Test
    public void testEnsureCapacity_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.ensureCapacity] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:228) */
        strBuilder.ensureCapacity(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.setCharAt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCharAt(int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setCharAt(int,char)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= length()): False}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetCharAt_IndexLessThanLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.setCharAt(0, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setCharAt(int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setCharAt(int,char)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= length()): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index < 0 || index >= length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAt_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.setCharAt(0, ' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setCharAt(int,char)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index < 0 || index >= length()
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAt_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.setCharAt(-1, ' ');
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setCharAt(int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setCharAt(int,char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[index] = ch;
 *  */
    @Test
    public void testSetCharAt_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.setCharAt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.setCharAt(StrBuilder.java:322) */
        strBuilder.setCharAt(0, ' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setCharAt(int,char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[index] = ch;
 *  */
    @Test
    public void testSetCharAt_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.setCharAt] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.setCharAt(StrBuilder.java:322) */
        strBuilder.setCharAt(0, ' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.deleteCharAt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deleteCharAt(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteCharAt(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= size): False}
 * @utbot.invokes org.apache.commons.lang.text.StrBuilder#deleteImpl(int,int,int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteCharAt_IndexLessThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.deleteCharAt(0);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteCharAt(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteCharAt(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= size): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index < 0 || index >= size
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAt_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.deleteCharAt(0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteCharAt(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index < 0 || index >= size
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAt_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.deleteCharAt(-1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteCharAt(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteCharAt(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: deleteImpl(index, index + 1, 1);
 *  */
    @Test
    public void testDeleteCharAt_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteCharAt] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114)
            org.apache.commons.lang.text.StrBuilder.deleteCharAt(StrBuilder.java:339) */
        strBuilder.deleteCharAt(0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteCharAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deleteImpl(index, index + 1, 1);
 *  */
    @Test
    public void testDeleteCharAt_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteCharAt] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114)
            org.apache.commons.lang.text.StrBuilder.deleteCharAt(StrBuilder.java:339) */
        strBuilder.deleteCharAt(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#reverse()}
 * @utbot.executesCondition {@code (size == 0): True}
 *  */
    @Test
    public void testReverse_SizeEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.reverse();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#reverse()}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.iterates iterate the loop {@code for(int leftIdx = 0, rightIdx = size - 1; leftIdx < half; leftIdx++, rightIdx--)} once
 *  */
    @Test
    public void testReverse_SizeNotEqualsZero_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        StrBuilder actual = strBuilder.reverse();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#reverse()}
 * @utbot.executesCondition {@code (size == 0): False}
 *  */
    @Test
    public void testReverse_SizeNotEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        StrBuilder actual = strBuilder.reverse();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reverse()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#reverse()}
 * @utbot.iterates iterate the loop {@code for(int leftIdx = 0, rightIdx = size - 1; leftIdx < half; leftIdx++, rightIdx--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char swap = buf[leftIdx];
 *  */
    @Test
    public void testReverse_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.reverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.reverse(StrBuilder.java:1468) */
        strBuilder.reverse();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#reverse()}
 * @utbot.iterates iterate the loop {@code for(int leftIdx = 0, rightIdx = size - 1; leftIdx < half; leftIdx++, rightIdx--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[leftIdx] = buf[rightIdx];
 *  */
    @Test
    public void testReverse_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.reverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.lang.text.StrBuilder.reverse(StrBuilder.java:1469) */
        strBuilder.reverse();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#reverse()}
 * @utbot.iterates iterate the loop {@code for(int leftIdx = 0, rightIdx = size - 1; leftIdx < half; leftIdx++, rightIdx--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char swap = buf[leftIdx];
 *  */
    @Test
    public void testReverse_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.reverse] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.reverse(StrBuilder.java:1468) */
        strBuilder.reverse();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendNull()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendNull()}
 * @utbot.executesCondition {@code (nullText == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendNull_NullTextEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendNull();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendNull()}
 * @utbot.executesCondition {@code (nullText == null): False}
 * @utbot.returnsFrom {@code return append(nullText);}
 *  */
    @Test
    public void testAppendNull_NullTextNotEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String nullText = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        StrBuilder actual = strBuilder.appendNull();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendNull()}
 * @utbot.executesCondition {@code (nullText == null): False}
 * @utbot.returnsFrom {@code return append(nullText);}
 *  */
    @Test
    public void testAppendNull_NullTextNotEqualsNull_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.appendNull();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(1, finalStrBuilderSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendNull()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendNull()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return append(nullText);
 *  */
    @Test
    public void testAppendNull_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        String nullText = "\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendNull] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444) */
        strBuilder.appendNull();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendNull()}
 * @utbot.returnsFrom {@code return append(nullText);}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return append(nullText);
 *  */
    @Test
    public void testAppendNull_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        String nullText = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendNull] produces [java.lang.StringIndexOutOfBoundsException: offset -1, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNull(StrBuilder.java:444) */
        strBuilder.appendNull();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendNull()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendNull()}
     */
    @Test
    public void testAppendNull() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StrBuilder actual = strBuilder.appendNull();
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        buffer[0] = 'a';
        buffer[1] = 'b';
        buffer[2] = 'c';
        expected.buffer = buffer;
        expected.size = 3;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendFixedWidthPadLeft(java.lang.Object, int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendFixedWidthPadLeft(java.lang.Object,int,char)}
 * @utbot.executesCondition {@code (width > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendFixedWidthPadLeft_WidthLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendFixedWidthPadLeft(((Object) null), 0, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendFixedWidthPadLeft(java.lang.Object, int, char)
    
    @Test
    public void testAppendFixedWidthPadLeft1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        Integer integer = Integer.MIN_VALUE;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.appendFixedWidthPadLeft(((Object) integer), 32, '\u0000');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(33, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendFixedWidthPadLeft(java.lang.Object, int, char)
    
    @Test
    public void testAppendFixedWidthPadLeft2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        Integer integer = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(StrBuilder.java:840) */
        strBuilder.appendFixedWidthPadLeft(((Object) integer), 1, '\u0000');
    }
    
    @Test
    public void testAppendFixedWidthPadLeft3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(StrBuilder.java:838) */
        strBuilder.appendFixedWidthPadLeft(((Object) null), 32, '\u0000');
    }
    
    @Test
    public void testAppendFixedWidthPadLeft4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(StrBuilder.java:838) */
        strBuilder.appendFixedWidthPadLeft(((Object) null), 1, '\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendFixedWidthPadLeft(int, int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendFixedWidthPadLeft(int,int,char)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#appendFixedWidthPadLeft(java.lang.Object,int,char)}
 * @utbot.returnsFrom {@code return appendFixedWidthPadLeft(String.valueOf(value), width, padChar);}
 *  */
    @Test
    public void testAppendFixedWidthPadLeft_StrBuilderAppendFixedWidthPadLeft() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendFixedWidthPadLeft(Integer.MIN_VALUE, 0, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendFixedWidthPadLeft(int, int, char)
    
    @Test
    public void testAppendFixedWidthPadLeft5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.appendFixedWidthPadLeft(0, 9, '\u0000');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(9, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendFixedWidthPadLeft(int, int, char)
    
    @Test
    public void testAppendFixedWidthPadLeft6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(StrBuilder.java:840)
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(StrBuilder.java:864) */
        strBuilder.appendFixedWidthPadLeft(Integer.MIN_VALUE, 1, '\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendFixedWidthPadRight(int, int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendFixedWidthPadRight(int,int,char)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#appendFixedWidthPadRight(java.lang.Object,int,char)}
 * @utbot.returnsFrom {@code return appendFixedWidthPadRight(String.valueOf(value), width, padChar);}
 *  */
    @Test
    public void testAppendFixedWidthPadRight_StrBuilderAppendFixedWidthPadRight() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendFixedWidthPadRight(Integer.MIN_VALUE, 0, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendFixedWidthPadRight(int, int, char)
    
    @Test
    public void testAppendFixedWidthPadRight1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.appendFixedWidthPadRight(0, 9, '\u0000');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(9, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendFixedWidthPadRight(int, int, char)
    
    @Test
    public void testAppendFixedWidthPadRight2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(StrBuilder.java:884)
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(StrBuilder.java:908) */
        strBuilder.appendFixedWidthPadRight(0, 1, '\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendFixedWidthPadRight(java.lang.Object, int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendFixedWidthPadRight(java.lang.Object,int,char)}
 * @utbot.executesCondition {@code (width > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendFixedWidthPadRight_WidthLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendFixedWidthPadRight(((Object) null), 0, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendFixedWidthPadRight(java.lang.Object, int, char)
    
    @Test
    public void testAppendFixedWidthPadRight3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 11, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(StrBuilder.java:884) */
        strBuilder.appendFixedWidthPadRight(((Object) integer), 1, '\u0000');
    }
    
    @Test
    public void testAppendFixedWidthPadRight4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(StrBuilder.java:882) */
        strBuilder.appendFixedWidthPadRight(((Object) null), 32, '\u0000');
    }
    
    @Test
    public void testAppendFixedWidthPadRight5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(StrBuilder.java:882) */
        strBuilder.appendFixedWidthPadRight(((Object) null), 1, '\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendPadding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendPadding(int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendPadding(int,char)}
 * @utbot.executesCondition {@code (length >= 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendPadding_LengthLessThanZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendPadding(-1, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendPadding(int,char)}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendPadding_LengthGreaterOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.appendPadding(0, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendPadding(int,char)}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendPadding_LengthGreaterOrEqualZero_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        
        StrBuilder actual = strBuilder.appendPadding(1, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(1, finalStrBuilderSize);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendPadding(int,char)}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendPadding_LengthGreaterOrEqualZero_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.appendPadding(1, ' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(1, finalStrBuilderSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendPadding(int, char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendPadding(int,char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[size++] = padChar;
 *  */
    @Test
    public void testAppendPadding_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendPadding] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.appendPadding(StrBuilder.java:816) */
        strBuilder.appendPadding(1, ' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendPadding(int,char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureCapacity(size + length);
 *  */
    @Test
    public void testAppendPadding_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -128;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendPadding] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -128 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.appendPadding(StrBuilder.java:814) */
        strBuilder.appendPadding(129, ' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.setNewLineText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNewLineText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setNewLineText(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetNewLineText_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.setNewLineText(null);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.getNewLineText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNewLineText()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getNewLineText()}
 * @utbot.returnsFrom {@code return newLine;}
 *  */
    @Test
    public void testGetNewLineText_ReturnNewLine() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        String actual = strBuilder.getNewLineText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.minimizeCapacity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minimizeCapacity()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#minimizeCapacity()}
 * @utbot.executesCondition {@code (buffer.length > length()): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMinimizeCapacity_BufferLengthGreaterThanLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.minimizeCapacity();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#minimizeCapacity()}
 * @utbot.executesCondition {@code (buffer.length > length()): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMinimizeCapacity_BufferLengthLessOrEqualLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.minimizeCapacity();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minimizeCapacity()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#minimizeCapacity()}
 * @utbot.executesCondition {@code (buffer.length > length()): True}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#length()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: buffer = new char[length()];
 *  */
    @Test
    public void testMinimizeCapacity_ThrowNegativeArraySizeException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.minimizeCapacity] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.lang.text.StrBuilder.minimizeCapacity(StrBuilder.java:244) */
        strBuilder.minimizeCapacity();
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#minimizeCapacity()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer.length > length()
 *  */
    @Test
    public void testMinimizeCapacity_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.minimizeCapacity] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.minimizeCapacity(StrBuilder.java:242) */
        strBuilder.minimizeCapacity();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.getNullText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNullText()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#getNullText()}
 * @utbot.returnsFrom {@code return nullText;}
 *  */
    @Test
    public void testGetNullText_ReturnNullText() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        String actual = strBuilder.getNullText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.appendNewLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendNewLine()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendNewLine()}
 * @utbot.executesCondition {@code (newLine == null): False}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#append(java.lang.String)}
 * @utbot.returnsFrom {@code return append(newLine);}
 *  */
    @Test
    public void testAppendNewLine_NewLineNotEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String newLine = "";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "newLine", newLine);
        
        StrBuilder actual = strBuilder.appendNewLine();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendNewLine()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#appendNewLine()}
     */
    @Test
    public void testAppendNewLine() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StrBuilder actual = strBuilder.appendNewLine();
        
        StrBuilder expected = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        buffer[0] = 'a';
        buffer[1] = 'b';
        buffer[2] = 'c';
        expected.buffer = buffer;
        expected.size = 3;
        String nullText = "abc";
        setField(expected, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendNewLine()
    
    @Test
    public void testAppendNewLine1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.appendNewLine();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testAppendNewLine2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[16];
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String newLine = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "newLine", newLine);
        
        char[] initialStrBuilderBuffer = strBuilder.buffer;
        
        StrBuilder actual = strBuilder.appendNewLine();
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char[] finalStrBuilderBuffer = strBuilder.buffer;
        int finalStrBuilderSize = strBuilder.size;
        
        assertFalse(initialStrBuilderBuffer == finalStrBuilderBuffer);
        
        assertEquals(25, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendNewLine()
    
    @Test
    public void testAppendNewLine3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = Integer.MIN_VALUE;
        String newLine = "\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "newLine", newLine);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendNewLine] produces [java.lang.StringIndexOutOfBoundsException: offset -2147483648, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:476)
            org.apache.commons.lang.text.StrBuilder.appendNewLine(StrBuilder.java:432) */
        strBuilder.appendNewLine();
    }
    
    @Test
    public void testAppendNewLine4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String newLine = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(strBuilder, "org.apache.commons.lang.text.StrBuilder", "newLine", newLine);
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.appendNewLine] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.append(StrBuilder.java:475)
            org.apache.commons.lang.text.StrBuilder.appendNewLine(StrBuilder.java:432) */
        strBuilder.appendNewLine();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.setNullText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNullText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setNullText(java.lang.String)}
 * @utbot.executesCondition {@code (nullText != null): True}
 * @utbot.executesCondition {@code (nullText.length() == 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetNullText_NullTextLengthNotEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = " ";
        
        StrBuilder actual = strBuilder.setNullText(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setNullText(java.lang.String)}
 * @utbot.executesCondition {@code (nullText != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetNullText_NullTextEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.setNullText(null);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#setNullText(java.lang.String)}
 * @utbot.executesCondition {@code (nullText != null): True}
 * @utbot.executesCondition {@code (nullText.length() == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetNullText_NullTextLengthEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        StrBuilder actual = strBuilder.setNullText(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.deleteAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deleteAll(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(char)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteAll_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.deleteAll(' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteAll_IOfBufferNotEqualsCh() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'_'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.deleteAll(' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteAll(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] == ch
 *  */
    @Test
    public void testDeleteAll_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1145) */
        strBuilder.deleteAll(' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] != ch
 *  */
    @Test
    public void testDeleteAll_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1148) */
        strBuilder.deleteAll(' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] != ch
 *  */
    @Test
    public void testDeleteAll_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1148) */
        strBuilder.deleteAll(' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[i] == ch
 *  */
    @Test
    public void testDeleteAll_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1145) */
        strBuilder.deleteAll(' ');
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deleteAll(char)
    
    @Test
    public void testDeleteAll1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.deleteAll('\u0000');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    
    @Test
    public void testDeleteAll2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        StrBuilder actual = strBuilder.deleteAll('\u0000');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    
    @Test
    public void testDeleteAll3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        
        StrBuilder actual = strBuilder.deleteAll('\u0001');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer0 = strBuilder.buffer[0];
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals('\u0000', finalStrBuilderBuffer0);
        
        assertEquals(2, finalStrBuilderSize);
    }
    
    @Test
    public void testDeleteAll4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
            '\u0001'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        StrBuilder actual = strBuilder.deleteAll('\u0000');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.deleteAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deleteAll(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return replace(matcher, null, 0, size, -1);}
 *  */
    @Test
    public void testDeleteAll_ReturnReplace() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        StrBuilder actual = strBuilder.deleteAll(charSetMatcher);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return replace(matcher, null, 0, size, -1);}
 *  */
    @Test
    public void testDeleteAll_ReturnReplace_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.deleteAll(((StrMatcher) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteAll(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return replace(matcher, null, 0, size, -1);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteAll_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.deleteAll(((StrMatcher) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteAll(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return replace(matcher, null, 0, size, -1);
 *  */
    @Test
    public void testDeleteAll_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1441)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1414)
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1224) */
        strBuilder.deleteAll(trimMatcher);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deleteAll(org.apache.commons.lang.text.StrMatcher)
    
    @Test
    public void testDeleteAll5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '!', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        StrBuilder actual = strBuilder.deleteAll(trimMatcher);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(1, finalStrBuilderSize);
    }
    
    @Test
    public void testDeleteAll6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        StrBuilder actual = strBuilder.deleteAll(noMatcher);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.deleteAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deleteAll(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteAll_LenGreaterThanZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = " ";
        
        StrBuilder actual = strBuilder.deleteAll(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteAll_StrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.deleteAll(((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteAll_LenLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        StrBuilder actual = strBuilder.deleteAll(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteAll_LenGreaterThanZero_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        StrBuilder actual = strBuilder.deleteAll(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteAll_LenGreaterThanZero_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "_ ";
        
        StrBuilder actual = strBuilder.deleteAll(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteAll_LenGreaterThanZero_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\uFFDF'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        StrBuilder actual = strBuilder.deleteAll(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteAll(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = indexOf(str, 0);
 *  */
    @Test
    public void testDeleteAll_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1186) */
        strBuilder.deleteAll(string);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteAll(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = indexOf(str, 0);
 *  */
    @Test
    public void testDeleteAll_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767)
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1186) */
        strBuilder.deleteAll(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deleteAll(java.lang.String)
    
    @Test
    public void testDeleteAll7() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = "\u0000";
        
        StrBuilder actual = strBuilder.deleteAll(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deleteAll(java.lang.String)
    
    @Test
    public void testDeleteAll8() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 33;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 33 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114)
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1188) */
        strBuilder.deleteAll(string);
    }
    
    @Test
    public void testDeleteAll9() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0001'};
        strBuilder.buffer = buffer;
        strBuilder.size = 33;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767)
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1186) */
        strBuilder.deleteAll(string);
    }
    
    @Test
    public void testDeleteAll10() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741861;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1186) */
        strBuilder.deleteAll(string);
    }
    
    @Test
    public void testDeleteAll11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741861;
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.deleteAll(StrBuilder.java:1186) */
        strBuilder.deleteAll(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.asTokenizer
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asTokenizer()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#asTokenizer()}
     */
    @Test
    public void testAsTokenizer() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StrBuilder.StrBuilderTokenizer actual = ((StrBuilder.StrBuilderTokenizer) strBuilder.asTokenizer());
        
        StrBuilder.StrBuilderTokenizer expected = ((StrBuilder.StrBuilderTokenizer) createInstance("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer"));
        StrBuilder this$0 = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[32];
        this$0.buffer = buffer;
        String nullText = "abc";
        setField(this$0, "org.apache.commons.lang.text.StrBuilder", "nullText", nullText);
        setField(expected, "org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", "this$0", this$0);
        StrMatcher.CharSetMatcher delimMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        char[] chars = {'\t', '\n', '\f', '\r', ' '};
        setField(delimMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
        setField(expected, "org.apache.commons.lang.text.StrTokenizer", "delimMatcher", delimMatcher);
        StrMatcher.NoMatcher quoteMatcher = ((StrMatcher.NoMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$NoMatcher"));
        setField(expected, "org.apache.commons.lang.text.StrTokenizer", "quoteMatcher", quoteMatcher);
        setField(expected, "org.apache.commons.lang.text.StrTokenizer", "ignoredMatcher", quoteMatcher);
        setField(expected, "org.apache.commons.lang.text.StrTokenizer", "trimmerMatcher", quoteMatcher);
        setField(expected, "org.apache.commons.lang.text.StrTokenizer", "ignoreEmptyTokens", true);
        
        char[] actualChars = ((char[]) getFieldValue(actual, "org.apache.commons.lang.text.StrTokenizer", "chars"));
        assertNull(actualChars);
        
        java.lang.String[] actualTokens = ((java.lang.String[]) getFieldValue(actual, "org.apache.commons.lang.text.StrTokenizer", "tokens"));
        assertNull(actualTokens);
        
        int expectedTokenPos = ((Integer) getFieldValue(expected, "org.apache.commons.lang.text.StrTokenizer", "tokenPos"));
        int actualTokenPos = ((Integer) getFieldValue(actual, "org.apache.commons.lang.text.StrTokenizer", "tokenPos"));
        assertEquals(expectedTokenPos, actualTokenPos);
        
        StrMatcher expectedDelimMatcher = ((StrMatcher) getFieldValue(expected, "org.apache.commons.lang.text.StrTokenizer", "delimMatcher"));
        StrMatcher actualDelimMatcher = ((StrMatcher) getFieldValue(actual, "org.apache.commons.lang.text.StrTokenizer", "delimMatcher"));
        char[] expectedDelimMatcherChars = ((char[]) getFieldValue(expectedDelimMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars"));
        char[] actualDelimMatcherChars = ((char[]) getFieldValue(actualDelimMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars"));
        int expectedDelimMatcherCharsSize = expectedDelimMatcherChars.length;
        assertEquals(expectedDelimMatcherCharsSize, actualDelimMatcherChars.length);
        assertArrayEquals(expectedDelimMatcherChars, actualDelimMatcherChars);
        
        StrMatcher expectedQuoteMatcher = expected.getQuoteMatcher();
        StrMatcher actualQuoteMatcher = actual.getQuoteMatcher();
        
        StrMatcher expectedIgnoredMatcher = expected.getIgnoredMatcher();
        StrMatcher actualIgnoredMatcher = actual.getIgnoredMatcher();
        
        StrMatcher expectedTrimmerMatcher = expected.getTrimmerMatcher();
        StrMatcher actualTrimmerMatcher = actual.getTrimmerMatcher();
        
        boolean actualEmptyAsNull = ((Boolean) getFieldValue(actual, "org.apache.commons.lang.text.StrTokenizer", "emptyAsNull"));
        assertFalse(actualEmptyAsNull);
        
        boolean actualIgnoreEmptyTokens = ((Boolean) getFieldValue(actual, "org.apache.commons.lang.text.StrTokenizer", "ignoreEmptyTokens"));
        assertTrue(actualIgnoreEmptyTokens);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.deleteImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deleteImpl(int, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteImpl(int,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testDeleteImpl_SystemArraycopy() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class intType = int.class;
        Method deleteImplMethod = strBuilderClazz.getDeclaredMethod("deleteImpl", intType, intType, intType);
        deleteImplMethod.setAccessible(true);
        java.lang.Object[] deleteImplMethodArguments = new java.lang.Object[3];
        deleteImplMethodArguments[0] = 0;
        deleteImplMethodArguments[1] = 0;
        deleteImplMethodArguments[2] = -255;
        deleteImplMethod.invoke(strBuilder, deleteImplMethodArguments);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(255, finalStrBuilderSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteImpl(int, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteImpl(int,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, endIndex, buffer, startIndex, size - endIndex);
 *  */
    @Test
    public void testDeleteImpl_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = -255;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteImpl] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114) */
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class intType = int.class;
        Method deleteImplMethod = strBuilderClazz.getDeclaredMethod("deleteImpl", intType, intType, intType);
        deleteImplMethod.setAccessible(true);
        java.lang.Object[] deleteImplMethodArguments = new java.lang.Object[3];
        deleteImplMethodArguments[0] = -255;
        deleteImplMethodArguments[1] = -1;
        deleteImplMethodArguments[2] = -255;
        try {
            deleteImplMethod.invoke(strBuilder, deleteImplMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteImpl(int,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, endIndex, buffer, startIndex, size - endIndex);
 *  */
    @Test
    public void testDeleteImpl_ThrowNullPointerException() throws Throwable  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteImpl] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114) */
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class intType = int.class;
        Method deleteImplMethod = strBuilderClazz.getDeclaredMethod("deleteImpl", intType, intType, intType);
        deleteImplMethod.setAccessible(true);
        java.lang.Object[] deleteImplMethodArguments = new java.lang.Object[3];
        deleteImplMethodArguments[0] = -255;
        deleteImplMethodArguments[1] = -255;
        deleteImplMethodArguments[2] = -255;
        try {
            deleteImplMethod.invoke(strBuilder, deleteImplMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.midString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method midString(int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return "";}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#midString(int,int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.executesCondition {@code (length <= 0): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testMidString_LengthLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        String actual = strBuilder.midString(-1, 0);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#midString(int,int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (length <= 0): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testMidString_IndexGreaterOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        String actual = strBuilder.midString(0, 0);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#midString(int,int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.executesCondition {@code (length <= 0): False}
 * @utbot.executesCondition {@code (index >= size): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testMidString_IndexGreaterOrEqualSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        String actual = strBuilder.midString(-1, 1);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method midString(int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (length <= 0): False},
    ///     {@code (index >= size): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#midString(int,int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.executesCondition {@code (size <= index + length): True}
 * @utbot.returnsFrom {@code return new String(buffer, index, size - index);}
 *  */
    @Test
    public void testMidString_SizeLessOrEqualIndexPlusLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        String actual = strBuilder.midString(-1, 1);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#midString(int,int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (size <= index + length): False}
 * @utbot.returnsFrom {@code return new String(buffer, index, length);}
 *  */
    @Test
    public void testMidString_SizeGreaterThanIndexPlusLength() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 15;
        
        String actual = strBuilder.midString(0, 1);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method midString(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#midString(int,int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (length <= 0): False}
 * @utbot.executesCondition {@code (index >= size): False}
 * @utbot.executesCondition {@code (size <= index + length): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(buffer, index, length);
 *  */
    @Test
    public void testMidString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 7;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.midString] produces [java.lang.StringIndexOutOfBoundsException: offset 2, count 1, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.midString(StrBuilder.java:1660) */
        strBuilder.midString(2, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.rightString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rightString(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#rightString(int)}
 * @utbot.executesCondition {@code (length <= 0): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testRightString_LengthLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        String actual = strBuilder.rightString(0);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#rightString(int)}
 * @utbot.executesCondition {@code (length <= 0): False}
 * @utbot.executesCondition {@code (length >= size): True}
 * @utbot.returnsFrom {@code return new String(buffer, 0, size);}
 *  */
    @Test
    public void testRightString_LengthGreaterOrEqualSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        String actual = strBuilder.rightString(1);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#rightString(int)}
 * @utbot.executesCondition {@code (length <= 0): False}
 * @utbot.executesCondition {@code (length >= size): False}
 * @utbot.returnsFrom {@code return new String(buffer, size - length, length);}
 *  */
    @Test
    public void testRightString_LengthLessThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        String actual = strBuilder.rightString(1);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rightString(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#rightString(int)}
 * @utbot.executesCondition {@code (length >= size): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(buffer, size - length, length);
 *  */
    @Test
    public void testRightString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.rightString] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 2, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.rightString(StrBuilder.java:1630) */
        strBuilder.rightString(2);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#rightString(int)}
 * @utbot.executesCondition {@code (length >= size): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(buffer, 0, size);
 *  */
    @Test
    public void testRightString_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.rightString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.rightString(StrBuilder.java:1628) */
        strBuilder.rightString(256);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.asReader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asReader()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#asReader()}
 * @utbot.returnsFrom {@code return new StrBuilderReader();}
 *  */
    @Test
    public void testAsReader_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder.StrBuilderReader actual = ((StrBuilder.StrBuilderReader) strBuilder.asReader());
        
        StrBuilder.StrBuilderReader expected = ((StrBuilder.StrBuilderReader) createInstance("org.apache.commons.lang.text.StrBuilder$StrBuilderReader"));
        setField(expected, "org.apache.commons.lang.text.StrBuilder$StrBuilderReader", "this$0", strBuilder);
        setField(expected, "java.io.Reader", "lock", expected);
        
        int expectedPos = ((Integer) getFieldValue(expected, "org.apache.commons.lang.text.StrBuilder$StrBuilderReader", "pos"));
        int actualPos = ((Integer) getFieldValue(actual, "org.apache.commons.lang.text.StrBuilder$StrBuilderReader", "pos"));
        assertEquals(expectedPos, actualPos);
        
        int expectedMark = ((Integer) getFieldValue(expected, "org.apache.commons.lang.text.StrBuilder$StrBuilderReader", "mark"));
        int actualMark = ((Integer) getFieldValue(actual, "org.apache.commons.lang.text.StrBuilder$StrBuilderReader", "mark"));
        assertEquals(expectedMark, actualMark);
        
        Object expectedLock = getFieldValue(expected, "java.io.Reader", "lock");
        Object actualLock = getFieldValue(actual, "java.io.Reader", "lock");
        assertTrue(deepEquals(expectedLock, actualLock));
        assertTrue(deepEquals(expectedLock, actualLock));
        assertTrue(deepEquals(expectedLock, actualLock));
        char[] actualLockSkipBuffer = ((char[]) getFieldValue(actualLock, "java.io.Reader", "skipBuffer"));
        assertNull(actualLockSkipBuffer);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.asWriter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asWriter()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#asWriter()}
 * @utbot.returnsFrom {@code return new StrBuilderWriter();}
 *  */
    @Test
    public void testAsWriter_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder.StrBuilderWriter actual = ((StrBuilder.StrBuilderWriter) strBuilder.asWriter());
        
        StrBuilder.StrBuilderWriter expected = ((StrBuilder.StrBuilderWriter) createInstance("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter"));
        setField(expected, "org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", "this$0", strBuilder);
        setField(expected, "java.io.Writer", "lock", expected);
        
        char[] actualWriteBuffer = ((char[]) getFieldValue(actual, "java.io.Writer", "writeBuffer"));
        assertNull(actualWriteBuffer);
        
        Object expectedLock = getFieldValue(expected, "java.io.Writer", "lock");
        Object actualLock = getFieldValue(actual, "java.io.Writer", "lock");
        assertTrue(deepEquals(expectedLock, actualLock));
        assertTrue(deepEquals(expectedLock, actualLock));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.toStringBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toStringBuffer()
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toStringBuffer()}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char[],int,int)}
 * @utbot.returnsFrom {@code return new StringBuffer(size).append(buffer, 0, size);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new StringBuffer(size).append(buffer, 0, size);
 *  */
    @Test
    public void testToStringBuffer_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 9;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.toStringBuffer] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:410)
            org.apache.commons.lang.text.StrBuilder.toStringBuffer(StrBuilder.java:2167) */
        strBuilder.toStringBuffer();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toStringBuffer()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.StrBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#toStringBuffer()}
     */
    @Test
    public void testToStringBuffer() throws Exception  {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.setNullText("abc");
        
        StringBuffer actual = strBuilder.toStringBuffer();
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.deleteFirst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deleteFirst(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return replace(matcher, null, 0, size, 1);}
 *  */
    @Test
    public void testDeleteFirst_ReturnReplace() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        StrBuilder actual = strBuilder.deleteFirst(charSetMatcher);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return replace(matcher, null, 0, size, 1);}
 *  */
    @Test
    public void testDeleteFirst_ReturnReplace_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.deleteFirst(((StrMatcher) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.returnsFrom {@code return replace(matcher, null, 0, size, 1);}
 *  */
    @Test
    public void testDeleteFirst_ReturnReplace_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'!'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        StrBuilder actual = strBuilder.deleteFirst(trimMatcher);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteFirst(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return replace(matcher, null, 0, size, 1);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteFirst_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.deleteFirst(((StrMatcher) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteFirst(org.apache.commons.lang.text.StrMatcher)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(org.apache.commons.lang.text.StrMatcher)}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrBuilder#replace(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return replace(matcher, null, 0, size, 1);
 *  */
    @Test
    public void testDeleteFirst_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1441)
            org.apache.commons.lang.text.StrBuilder.replace(StrBuilder.java:1414)
            org.apache.commons.lang.text.StrBuilder.deleteFirst(StrBuilder.java:1238) */
        strBuilder.deleteFirst(trimMatcher);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deleteFirst(org.apache.commons.lang.text.StrMatcher)
    
    @Test
    public void testDeleteFirst1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = new char[40];
        buffer[0] = '\u0001';
        strBuilder.buffer = buffer;
        strBuilder.size = 40;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        StrBuilder actual = strBuilder.deleteFirst(trimMatcher);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        char finalStrBuilderBuffer0 = strBuilder.buffer[0];
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals('\u0000', finalStrBuilderBuffer0);
        
        assertEquals(39, finalStrBuilderSize);
    }
    
    @Test
    public void testDeleteFirst2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        StrBuilder actual = strBuilder.deleteFirst(noMatcher);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.deleteFirst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deleteFirst(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteFirst_StrNotEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = " ";
        
        StrBuilder actual = strBuilder.deleteFirst(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteFirst_StrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.deleteFirst(((String) null));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteFirst_StrNotEqualsNull_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        String string = "";
        
        StrBuilder actual = strBuilder.deleteFirst(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteFirst_StrNotEqualsNull_2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        String string = "  ";
        
        StrBuilder actual = strBuilder.deleteFirst(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteFirst_StrNotEqualsNull_3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "_ ";
        
        StrBuilder actual = strBuilder.deleteFirst(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteFirst_StrNotEqualsNull_4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\uFFDF'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        StrBuilder actual = strBuilder.deleteFirst(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteFirst(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = indexOf(str, 0);
 *  */
    @Test
    public void testDeleteFirst_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.deleteFirst(StrBuilder.java:1204) */
        strBuilder.deleteFirst(string);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = indexOf(str, 0);
 *  */
    @Test
    public void testDeleteFirst_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1731)
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1767)
            org.apache.commons.lang.text.StrBuilder.deleteFirst(StrBuilder.java:1204) */
        strBuilder.deleteFirst(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deleteFirst(java.lang.String)
    
    @Test
    public void testDeleteFirst3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        String string = "\u0000";
        
        StrBuilder actual = strBuilder.deleteFirst(string);
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deleteFirst(java.lang.String)
    
    @Test
    public void testDeleteFirst4() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 33;
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteFirst] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 33 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114)
            org.apache.commons.lang.text.StrBuilder.deleteFirst(StrBuilder.java:1206) */
        strBuilder.deleteFirst(string);
    }
    
    @Test
    public void testDeleteFirst5() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741824;
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteFirst] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1073741824 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114)
            org.apache.commons.lang.text.StrBuilder.deleteFirst(StrBuilder.java:1206) */
        strBuilder.deleteFirst(string);
    }
    
    @Test
    public void testDeleteFirst6() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 1073741824;
        String string = "\u0001\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.lang.text.StrBuilder.indexOf(StrBuilder.java:1780)
            org.apache.commons.lang.text.StrBuilder.deleteFirst(StrBuilder.java:1204) */
        strBuilder.deleteFirst(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.deleteFirst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deleteFirst(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(char)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteFirst_Return() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        StrBuilder actual = strBuilder.deleteFirst(' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteFirst_IOfBufferEqualsCh() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.deleteFirst(' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(0, finalStrBuilderSize);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDeleteFirst_IOfBufferNotEqualsCh() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'_'};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        StrBuilder actual = strBuilder.deleteFirst(' ');
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteFirst(char)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] == ch
 *  */
    @Test
    public void testDeleteFirst_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteFirst] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.text.StrBuilder.deleteFirst(StrBuilder.java:1168) */
        strBuilder.deleteFirst(' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: deleteImpl(i, i + 1, 1);
 *  */
    @Test
    public void testDeleteFirst_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' ', ' '};
        strBuilder.buffer = buffer;
        strBuilder.size = 3;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteFirst] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3 out of bounds for char[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.deleteImpl(StrBuilder.java:1114)
            org.apache.commons.lang.text.StrBuilder.deleteFirst(StrBuilder.java:1169) */
        strBuilder.deleteFirst(' ');
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#deleteFirst(char)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[i] == ch
 *  */
    @Test
    public void testDeleteFirst_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.deleteFirst] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.deleteFirst(StrBuilder.java:1168) */
        strBuilder.deleteFirst(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.leftString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method leftString(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#leftString(int)}
 * @utbot.executesCondition {@code (length <= 0): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testLeftString_LengthLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        String actual = strBuilder.leftString(0);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#leftString(int)}
 * @utbot.executesCondition {@code (length <= 0): False}
 * @utbot.executesCondition {@code (length >= size): True}
 * @utbot.returnsFrom {@code return new String(buffer, 0, size);}
 *  */
    @Test
    public void testLeftString_LengthGreaterOrEqualSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        
        String actual = strBuilder.leftString(1);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#leftString(int)}
 * @utbot.executesCondition {@code (length <= 0): False}
 * @utbot.executesCondition {@code (length >= size): False}
 * @utbot.returnsFrom {@code return new String(buffer, 0, length);}
 *  */
    @Test
    public void testLeftString_LengthLessThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        String actual = strBuilder.leftString(1);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method leftString(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#leftString(int)}
 * @utbot.executesCondition {@code (length >= size): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(buffer, 0, size);
 *  */
    @Test
    public void testLeftString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.leftString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.leftString(StrBuilder.java:1606) */
        strBuilder.leftString(1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#leftString(int)}
 * @utbot.executesCondition {@code (length >= size): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(buffer, 0, length);
 *  */
    @Test
    public void testLeftString_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {};
        strBuilder.buffer = buffer;
        strBuilder.size = 2;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.leftString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.leftString(StrBuilder.java:1608) */
        strBuilder.leftString(1);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#leftString(int)}
 * @utbot.executesCondition {@code (length >= size): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(buffer, 0, size);
 *  */
    @Test
    public void testLeftString_ThrowNullPointerException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.leftString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.apache.commons.lang.text.StrBuilder.leftString(StrBuilder.java:1606) */
        strBuilder.leftString(256);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replaceImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return this;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.executesCondition {@code (matcher == null): False}
 * @utbot.executesCondition {@code (size == 0): True}
 *  */
    @Test
    public void testReplaceImpl_SizeEqualsZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class charSetMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", charSetMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = charSetMatcher;
        replaceImplMethodArguments[1] = ((Object) null);
        replaceImplMethodArguments[2] = -255;
        replaceImplMethodArguments[3] = -255;
        replaceImplMethodArguments[4] = -255;
        StrBuilder actual = ((StrBuilder) replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.executesCondition {@code (matcher == null): True}
 *  */
    @Test
    public void testReplaceImpl_MatcherEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class strMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", strMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = ((Object) null);
        replaceImplMethodArguments[1] = ((Object) null);
        replaceImplMethodArguments[2] = -255;
        replaceImplMethodArguments[3] = -255;
        replaceImplMethodArguments[4] = 0;
        StrBuilder actual = ((StrBuilder) replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (matcher == null): False},
    ///     {@code (size == 0): False}
    /// return from: {@code return this;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.executesCondition {@code (replaceStr == null): True}
 *  */
    @Test
    public void testReplaceImpl_ReplaceStrEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class charSetMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", charSetMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = charSetMatcher;
        replaceImplMethodArguments[1] = ((Object) null);
        replaceImplMethodArguments[2] = -255;
        replaceImplMethodArguments[3] = -255;
        replaceImplMethodArguments[4] = -255;
        StrBuilder actual = ((StrBuilder) replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.executesCondition {@code (replaceStr == null): True}
 *  */
    @Test
    public void testReplaceImpl_ReplaceStrEqualsNull_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class charSetMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", charSetMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = charSetMatcher;
        replaceImplMethodArguments[1] = ((Object) null);
        replaceImplMethodArguments[2] = 255;
        replaceImplMethodArguments[3] = 256;
        replaceImplMethodArguments[4] = 0;
        StrBuilder actual = ((StrBuilder) replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.executesCondition {@code (replaceStr == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testReplaceImpl_ReplaceStrNotEqualsNull() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        StrMatcher.CharSetMatcher charSetMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        String string = "";
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class charSetMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", charSetMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = charSetMatcher;
        replaceImplMethodArguments[1] = string;
        replaceImplMethodArguments[2] = -255;
        replaceImplMethodArguments[3] = -255;
        replaceImplMethodArguments[4] = -255;
        StrBuilder actual = ((StrBuilder) replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int)}
 * @utbot.executesCondition {@code (matcher == null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (replaceStr == null): True}
 * @utbot.iterates iterate the loop {@code for(int i = from; i < to && replaceCount != 0; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int removeLen = matcher.isMatch(buf, i, from, to);
 *  */
    @Test
    public void testReplaceImpl_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {' '};
        strBuilder.buffer = buffer;
        strBuilder.size = -255;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceImpl] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.lang.text.StrMatcher$TrimMatcher.isMatch(StrMatcher.java:402)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1441) */
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class trimMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", trimMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = trimMatcher;
        replaceImplMethodArguments[1] = ((Object) null);
        replaceImplMethodArguments[2] = -1;
        replaceImplMethodArguments[3] = 0;
        replaceImplMethodArguments[4] = -255;
        try {
            replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)
    
    @Test
    public void testReplaceImpl1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0000', '!', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 4;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class trimMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", trimMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = trimMatcher;
        replaceImplMethodArguments[1] = ((Object) null);
        replaceImplMethodArguments[2] = 1;
        replaceImplMethodArguments[3] = 3;
        replaceImplMethodArguments[4] = 1;
        StrBuilder actual = ((StrBuilder) replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
        
        int finalStrBuilderSize = strBuilder.size;
        
        assertEquals(3, finalStrBuilderSize);
    }
    
    @Test
    public void testReplaceImpl2() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 1;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class noMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", noMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = noMatcher;
        replaceImplMethodArguments[1] = ((Object) null);
        replaceImplMethodArguments[2] = 0;
        replaceImplMethodArguments[3] = 1;
        replaceImplMethodArguments[4] = 16777216;
        StrBuilder actual = ((StrBuilder) replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    
    @Test
    public void testReplaceImpl3() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = 134217728;
        StrMatcher.NoMatcher noMatcher = new StrMatcher.NoMatcher();
        String string = "";
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class noMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", noMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = noMatcher;
        replaceImplMethodArguments[1] = string;
        replaceImplMethodArguments[2] = 0;
        replaceImplMethodArguments[3] = 1;
        replaceImplMethodArguments[4] = 16;
        StrBuilder actual = ((StrBuilder) replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments));
        
        // org.apache.commons.lang.text.StrBuilder has overridden equals method
        assertEquals(strBuilder, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)
    
    @Test
    public void testReplaceImpl4() throws Throwable  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = 32;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceImpl] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 32 out of bounds for char[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1255)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1443) */
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class trimMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", trimMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = trimMatcher;
        replaceImplMethodArguments[1] = ((Object) null);
        replaceImplMethodArguments[2] = 0;
        replaceImplMethodArguments[3] = 1;
        replaceImplMethodArguments[4] = 1;
        try {
            replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReplaceImpl5() throws Throwable  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        strBuilder.buffer = buffer;
        strBuilder.size = -1073741824;
        StrMatcher.TrimMatcher trimMatcher = new StrMatcher.TrimMatcher();
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceImpl] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1073741825 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1256)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1443) */
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class trimMatcherType = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", trimMatcherType, stringType, intType, intType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = trimMatcher;
        replaceImplMethodArguments[1] = ((Object) null);
        replaceImplMethodArguments[2] = 0;
        replaceImplMethodArguments[3] = 1;
        replaceImplMethodArguments[4] = 1;
        try {
            replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.replaceImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceImpl(int, int, int, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(int,int,int,java.lang.String,int)}
 * @utbot.executesCondition {@code (insertLen != removeLen): False}
 * @utbot.executesCondition {@code (insertLen > 0): False}
 *  */
    @Test
    public void testReplaceImpl_InsertLenLessOrEqualZero() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", intType, intType, intType, stringType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = -255;
        replaceImplMethodArguments[1] = -255;
        replaceImplMethodArguments[2] = 0;
        replaceImplMethodArguments[3] = ((Object) null);
        replaceImplMethodArguments[4] = 0;
        replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceImpl(int, int, int, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(int,int,int,java.lang.String,int)}
 * @utbot.executesCondition {@code (insertLen != removeLen): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, endIndex, buffer, startIndex + insertLen, size - endIndex);
 *  */
    @Test
    public void testReplaceImpl_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceImpl] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1256) */
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", intType, intType, intType, stringType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = -2;
        replaceImplMethodArguments[1] = 0;
        replaceImplMethodArguments[2] = -1;
        replaceImplMethodArguments[3] = ((Object) null);
        replaceImplMethodArguments[4] = 2;
        try {
            replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(int,int,int,java.lang.String,int)}
 * @utbot.executesCondition {@code (insertLen != removeLen): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureCapacity(newSize);
 *  */
    @Test
    public void testReplaceImpl_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = -1;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceImpl] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang.text.StrBuilder.ensureCapacity(StrBuilder.java:231)
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1255) */
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", intType, intType, intType, stringType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = -255;
        replaceImplMethodArguments[1] = -255;
        replaceImplMethodArguments[2] = -130;
        replaceImplMethodArguments[3] = ((Object) null);
        replaceImplMethodArguments[4] = -127;
        try {
            replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#replaceImpl(int,int,int,java.lang.String,int)}
 * @utbot.executesCondition {@code (insertLen != removeLen): False}
 * @utbot.executesCondition {@code (insertLen > 0): True}
 * @utbot.invokes {@link java.lang.String#getChars(int,int,char[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertStr.getChars(0, insertLen, buffer, startIndex);
 *  */
    @Test
    public void testReplaceImpl_ThrowNullPointerException() throws Throwable  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -255;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceImpl] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1260) */
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", intType, intType, intType, stringType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = -255;
        replaceImplMethodArguments[1] = -255;
        replaceImplMethodArguments[2] = 1;
        replaceImplMethodArguments[3] = ((Object) null);
        replaceImplMethodArguments[4] = 1;
        try {
            replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method replaceImpl(int, int, int, java.lang.String, int)
    
    @Test
    public void testReplaceImpl6() throws Throwable  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        strBuilder.buffer = buffer;
        strBuilder.size = 5;
        
        /* This test fails because method [org.apache.commons.lang.text.StrBuilder.replaceImpl] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.StrBuilder.replaceImpl(StrBuilder.java:1260) */
        Class strBuilderClazz = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method replaceImplMethod = strBuilderClazz.getDeclaredMethod("replaceImpl", intType, intType, intType, stringType, intType);
        replaceImplMethod.setAccessible(true);
        java.lang.Object[] replaceImplMethodArguments = new java.lang.Object[5];
        replaceImplMethodArguments[0] = 0;
        replaceImplMethodArguments[1] = 0;
        replaceImplMethodArguments[2] = -2;
        replaceImplMethodArguments[3] = ((Object) null);
        replaceImplMethodArguments[4] = 8;
        try {
            replaceImplMethod.invoke(strBuilder, replaceImplMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.validateIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method validateIndex(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#validateIndex(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index > size): False}
 *  */
    @Test
    public void testValidateIndex_IndexLessOrEqualSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.validateIndex(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method validateIndex(int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#validateIndex(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index > size): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index < 0 || index > size
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testValidateIndex_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.validateIndex(0);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#validateIndex(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index < 0 || index > size
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testValidateIndex_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.validateIndex(-1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.StrBuilder.validateRange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method validateRange(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#validateRange(int,int)}
 * @utbot.executesCondition {@code (endIndex > size): False}
 * @utbot.returnsFrom {@code return endIndex;}
 *  */
    @Test
    public void testValidateRange_EndIndexLessOrEqualSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.validateRange(0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#validateRange(int,int)}
 * @utbot.executesCondition {@code (endIndex > size): True}
 * @utbot.returnsFrom {@code return endIndex;}
 *  */
    @Test
    public void testValidateRange_EndIndexGreaterThanSize() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        int actual = strBuilder.validateRange(0, 1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method validateRange(int, int)
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#validateRange(int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex < 0
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testValidateRange_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        
        strBuilder.validateRange(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StrBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.StrBuilder#validateRange(int,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex > size): False}
 * @utbot.executesCondition {@code (startIndex > endIndex): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: startIndex > endIndex
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testValidateRange_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang.text.StrBuilder"));
        strBuilder.size = -1;
        
        strBuilder.validateRange(0, -1);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields671696664647800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields671696664647800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass671696664654800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields671696664647800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass671696664654800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields671696665336700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields671696665336700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass671696665339300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields671696665336700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass671696665339300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields671696665980800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields671696665980800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass671696665982800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields671696665980800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass671696665982800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

