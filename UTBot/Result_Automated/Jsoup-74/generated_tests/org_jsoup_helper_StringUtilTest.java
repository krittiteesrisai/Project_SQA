package org.jsoup.helper;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.net.MalformedURLException;
import java.net.URL;
import sun.net.www.protocol.file.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.util.Collections.emptyList;

public final class org_jsoup_helper_StringUtilTest {
    ///region Test suites for executable org.jsoup.helper.StringUtil.isWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isWhitespace(int)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';}
 *  */
    @Test
    public void testIsWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsChar() {
        boolean actual = StringUtil.isWhitespace(32);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';}
 *  */
    @Test
    public void testIsWhitespace_CNotEqualsCharOrCNotEqualsCharOrCNotEqualsCharOrCNotEqualsCharOrCNotEqualsChar() {
        boolean actual = StringUtil.isWhitespace(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';}
 *  */
    @Test
    public void testIsWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsChar_1() {
        boolean actual = StringUtil.isWhitespace(13);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';}
 *  */
    @Test
    public void testIsWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsChar_2() {
        boolean actual = StringUtil.isWhitespace(12);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';}
 *  */
    @Test
    public void testIsWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsChar_3() {
        boolean actual = StringUtil.isWhitespace(10);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isWhitespace(int)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.StringUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isWhitespace(int)}
     */
    @Test
    public void testIsWhitespaceReturnsTrue() {
        boolean actual = StringUtil.isWhitespace(9);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.join
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method join(java.util.Collection, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#join(java.util.Collection,java.lang.String)}
 * @utbot.returnsFrom {@code return join(strings.iterator(), sep);}
 *  */
    @Test
    public void testJoin_ReturnJoin() {
        ArrayList arrayList = new ArrayList();
        
        String actual = StringUtil.join(arrayList, ((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#join(java.util.Collection,java.lang.String)}
 * @utbot.returnsFrom {@code return join(strings.iterator(), sep);}
 *  */
    @Test
    public void testJoin_ReturnJoin_1() {
        ArrayList arrayList = new ArrayList();
        Integer integer = 0;
        arrayList.add(integer);
        
        String actual = StringUtil.join(arrayList, ((String) null));
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method join(java.util.Collection, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#join(java.util.Collection,java.lang.String)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return join(strings.iterator(), sep);
 *  */
    @Test
    public void testJoin_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.helper.StringUtil.join] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:25) */
        StringUtil.join(((Collection) null), ((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method join(java.util.Collection, java.lang.String)
    
    @Test
    public void testJoin1() {
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        Long long1 = 0L;
        hashSet.add(long1);
        
        String actual = StringUtil.join(hashSet, ((String) null));
        
        String expected = "0null0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testJoin2() {
        ArrayList arrayList = new ArrayList();
        Integer integer = 13;
        arrayList.add(integer);
        String string = "";
        arrayList.add(string);
        arrayList.add(string);
        
        String actual = StringUtil.join(arrayList, string);
        
        String expected = "13";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method join(java.util.Collection, java.lang.String)
    
    @Test
    public void testJoin3() {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Integer integer = 0;
        hashSet.add(integer);
        
        /* This test fails because method [org.jsoup.helper.StringUtil.join] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:38)
            org.jsoup.helper.StringUtil.join(StringUtil.java:25) */
        StringUtil.join(hashSet, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.join
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method join(java.util.Iterator, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#join(java.util.Iterator,java.lang.String)}
 * @utbot.invokes {@link java.util.Iterator#hasNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !strings.hasNext()
 *  */
    @Test
    public void testJoin_ThrowNullPointerException1() {
        /* This test fails because method [org.jsoup.helper.StringUtil.join] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:35) */
        StringUtil.join(((Iterator) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#join(java.util.Iterator,java.lang.String)}
 * @utbot.executesCondition {@code (!strings.hasNext()): True}
 * @utbot.invokes {@link java.util.Iterator#hasNext()}
 * @utbot.returnsFrom {@code return "";}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return "";
 *  */
    @Test
    public void testJoin_ThrowNullPointerException_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        /* This test fails because method [org.jsoup.helper.StringUtil.join] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:38) */
        StringUtil.join(iterator, ((String) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method join(java.util.Iterator, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.StringUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#join(java.util.Iterator,java.lang.String)}
     */
    @Test
    public void testJoinWithNonEmptyString() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        String actual = StringUtil.join(iterator, "-\uFFF43");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.join
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method join([Ljava.lang.String;, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#join(java.lang.String[],java.lang.String)}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.invokes {@link org.jsoup.helper.StringUtil#join(java.util.Collection,java.lang.String)}
 * @utbot.returnsFrom {@code return join(Arrays.asList(strings), sep);}
 *  */
    @Test
    public void testJoin_StringUtilJoin() {
        java.lang.String[] stringArray = {};
        
        String actual = StringUtil.join(stringArray, ((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method join([Ljava.lang.String;, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.StringUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#join(java.lang.String[],java.lang.String)}
     */
    @Test
    public void testJoinWithNonEmptyObjectArrayAndNonEmptyString() {
        java.lang.String[] stringArray = {"XZ", "\n\t\r", "-3"};
        
        String actual = StringUtil.join(stringArray, "cab");
        
        String expected = "XZcab\n\t\rcab-3";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method join([Ljava.lang.String;, java.lang.String)
    
    @Test
    public void testJoin4() {
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[1] = string;
        stringArray[2] = string;
        stringArray[3] = string;
        stringArray[4] = string;
        stringArray[5] = string;
        stringArray[6] = string;
        stringArray[7] = string;
        stringArray[8] = string;
        stringArray[9] = string;
        String string1 = "";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.join] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:38)
            org.jsoup.helper.StringUtil.join(StringUtil.java:25)
            org.jsoup.helper.StringUtil.join(StringUtil.java:57) */
        StringUtil.join(stringArray, string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.isBlank
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isBlank(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isBlank(java.lang.String)}
 * @utbot.executesCondition {@code (string == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < l; i++)} once
 *  */
    @Test
    public void testIsBlank_StringUtilIsWhitespace() {
        String string = "\u8000";
        
        boolean actual = StringUtil.isBlank(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isBlank(java.lang.String)}
 * @utbot.executesCondition {@code (string == null): False}
 *  */
    @Test
    public void testIsBlank_StringNotEqualsNull() {
        String string = "";
        
        boolean actual = StringUtil.isBlank(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isBlank(java.lang.String)}
 * @utbot.executesCondition {@code (string == null): True}
 *  */
    @Test
    public void testIsBlank_StringEqualsNull() {
        boolean actual = StringUtil.isBlank(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isBlank(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (string == null): False}
    /// invoke:
    ///     {@link java.lang.String#length()} 4 times,
    ///     {@link java.lang.String#codePointAt(int)} twice,
    ///     {@link org.jsoup.helper.StringUtil#isWhitespace(int)} twice
    /// return from: {@code return true;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isBlank(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < l; i++)} once
 *  */
    @Test
    public void testIsBlank_IterateForLoop() {
        String string = "\f";
        
        boolean actual = StringUtil.isBlank(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isBlank(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < l; i++)} once
 *  */
    @Test
    public void testIsBlank_IterateForLoop_1() {
        String string = "\t";
        
        boolean actual = StringUtil.isBlank(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isBlank(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < l; i++)} once
 *  */
    @Test
    public void testIsBlank_IterateForLoop_2() {
        String string = "\n";
        
        boolean actual = StringUtil.isBlank(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isBlank(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < l; i++)} once
 *  */
    @Test
    public void testIsBlank_IterateForLoop_3() {
        String string = "\r";
        
        boolean actual = StringUtil.isBlank(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isBlank(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < l; i++)} once
 *  */
    @Test
    public void testIsBlank_IterateForLoop_4() {
        String string = " ";
        
        boolean actual = StringUtil.isBlank(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.resolve
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolve(java.lang.String, java.lang.String)
    
    @Test
    public void testResolve1() {
        String string = "\u0001\u0000!\u0001\u0001";
        
        String actual = StringUtil.resolve(string, string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.resolve
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method resolve(java.net.URL, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#resolve(java.net.URL,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.net.MalformedURLException} in: return new URL(base, relUrl);
 *  */
    @Test(expected = MalformedURLException.class)
    public void testResolve_ThrowMalformedURLException() throws MalformedURLException  {
        String string = "";
        
        StringUtil.resolve(((URL) null), string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolve(java.net.URL, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#resolve(java.net.URL,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: relUrl.startsWith("?")
 *  */
    @Test
    public void testResolve_ThrowNullPointerException() throws MalformedURLException  {
        /* This test fails because method [org.jsoup.helper.StringUtil.resolve] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.resolve(StringUtil.java:195) */
        StringUtil.resolve(((URL) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#resolve(java.net.URL,java.lang.String)}
 * @utbot.invokes {@link java.net.URL#getPath()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: relUrl = base.getPath() + relUrl;
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_1() throws MalformedURLException  {
        String string = "?";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.resolve] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.resolve(StringUtil.java:196) */
        StringUtil.resolve(((URL) null), string);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#resolve(java.net.URL,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.net.URL#getFile()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: relUrl.indexOf('.') == 0 && base.getFile().indexOf('/') != 0
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_2() throws MalformedURLException  {
        String string = ".";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.resolve] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.resolve(StringUtil.java:198) */
        StringUtil.resolve(((URL) null), string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolve(java.net.URL, java.lang.String)
    
    @Test
    public void testResolve2() throws Exception  {
        URL url = ((URL) createInstance("java.net.URL"));
        String protocol = "\u0000\u0000\u0000";
        setField(url, "java.net.URL", "protocol", protocol);
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.file.Handler"));
        setField(url, "java.net.URL", "handler", handler);
        String string = "";
        
        URL actual = StringUtil.resolve(url, string);
        
        URL expected = ((URL) createInstance("java.net.URL"));
        
        // java.net.URL has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method resolve(java.net.URL, java.lang.String)
    
    @Test(expected = MalformedURLException.class)
    public void testResolve3() throws Exception  {
        URL url = ((URL) createInstance("java.net.URL"));
        String path = "";
        setField(url, "java.net.URL", "path", path);
        String string = "?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        StringUtil.resolve(url, string);
    }
    
    @Test(expected = MalformedURLException.class)
    public void testResolve4() throws Exception  {
        URL url = ((URL) createInstance("java.net.URL"));
        String protocol = "";
        setField(url, "java.net.URL", "protocol", protocol);
        setField(url, "java.net.URL", "userInfo", protocol);
        String string = "";
        
        StringUtil.resolve(url, string);
    }
    
    @Test(expected = MalformedURLException.class)
    public void testResolve5() throws Exception  {
        URL url = ((URL) createInstance("java.net.URL"));
        String protocol = "";
        setField(url, "java.net.URL", "protocol", protocol);
        String host = "";
        setField(url, "java.net.URL", "host", host);
        String path = "";
        setField(url, "java.net.URL", "path", path);
        String userInfo = "";
        setField(url, "java.net.URL", "userInfo", userInfo);
        sun.net.www.protocol.jar.Handler handler = ((sun.net.www.protocol.jar.Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(url, "java.net.URL", "handler", handler);
        
        StringUtil.resolve(url, path);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolve(java.net.URL, java.lang.String)
    
    @Test
    public void testResolve6() throws Exception  {
        URL url = ((URL) createInstance("java.net.URL"));
        String file = "\u0000\u0000\u0000\u0000";
        setField(url, "java.net.URL", "file", file);
        String string = ".\u0000\u0000";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.resolve] produces [java.lang.NullPointerException]
            java.base/java.net.URL.toLowerCase(URL.java:1378)
            java.base/java.net.URL.<init>(URL.java:442)
            java.base/java.net.URL.<init>(URL.java:365)
            org.jsoup.helper.StringUtil.resolve(StringUtil.java:199) */
        StringUtil.resolve(url, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.in
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method in(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#in(java.lang.String,java.lang.String[])}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIn_ReturnFalse() {
        java.lang.String[] stringArray = {};
        
        boolean actual = StringUtil.in(null, stringArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#in(java.lang.String,java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 *  */
    @Test
    public void testIn_HaystackiEquals() {
        String string = "";
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = string;
        
        boolean actual = StringUtil.in(string, stringArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#in(java.lang.String,java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIn_NotHaystackiEquals() {
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        boolean actual = StringUtil.in(null, stringArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method in(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#in(java.lang.String,java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: haystack[i].equals(needle)
 *  */
    @Test
    public void testIn_ThrowNullPointerException_1() {
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.jsoup.helper.StringUtil.in] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:176) */
        StringUtil.in(null, stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#in(java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int len = haystack.length;
 *  */
    @Test
    public void testIn_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.helper.StringUtil.in] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:174) */
        StringUtil.in(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method in(java.lang.String, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.StringUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#in(java.lang.String,java.lang.String[])}
     */
    @Test
    public void testInReturnsTrueWithBlankStringAndNonEmptyObjectArray() {
        java.lang.String[] stringArray = {"#$\\\"'", "\n\t\r", "-3"};
        
        boolean actual = StringUtil.in("\n\t\r", stringArray);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.StringUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#in(java.lang.String,java.lang.String[])}
     */
    @Test
    public void testInReturnsFalseWithBlankStringAndNonEmptyObjectArray() {
        java.lang.String[] stringArray = {"#$\\\"'", "\n\t\r", "-3"};
        
        boolean actual = StringUtil.in("\r\n\t", stringArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.isNumeric
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNumeric(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isNumeric(java.lang.String)}
 * @utbot.executesCondition {@code (string == null): False}
 * @utbot.executesCondition {@code (string.length() == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < l; i++)} once
 *  */
    @Test
    public void testIsNumeric_NotCharacterIsDigit() {
        String string = ":";
        
        boolean actual = StringUtil.isNumeric(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isNumeric(java.lang.String)}
 * @utbot.executesCondition {@code (string == null): False}
 * @utbot.executesCondition {@code (string.length() == 0): True}
 *  */
    @Test
    public void testIsNumeric_StringLengthEqualsZero() {
        String string = "";
        
        boolean actual = StringUtil.isNumeric(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isNumeric(java.lang.String)}
 * @utbot.executesCondition {@code (string == null): True}
 *  */
    @Test
    public void testIsNumeric_StringEqualsNull() {
        boolean actual = StringUtil.isNumeric(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isNumeric(java.lang.String)}
 * @utbot.executesCondition {@code (string == null): False}
 * @utbot.executesCondition {@code (string.length() == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < l; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNumeric_CharacterIsDigit() {
        String string = "9";
        
        boolean actual = StringUtil.isNumeric(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.stringBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stringBuilder()
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#stringBuilder()}
 * @utbot.invokes {@link java.lang.ThreadLocal#get()}
 *  */
    @Test
    public void testStringBuilder_ThreadLocalGet() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.helper.StringUtil");
        ThreadLocal prevStringLocal = ((ThreadLocal) getStaticFieldValue(stringUtilClazz, "stringLocal"));
        try {
            ThreadLocal stringLocal = ((ThreadLocal) createInstance("org.jsoup.helper.StringUtil$1"));
            setField(stringLocal, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(stringUtilClazz, "stringLocal", stringLocal);
            
            StringBuilder actual = StringUtil.stringBuilder();
            
            StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
            
        } finally {
            setStaticField(StringUtil.class, "stringLocal", prevStringLocal);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method stringBuilder()
    
    @Test
    public void testStringBuilder1() throws Exception  {
        StringBuilder actual = StringUtil.stringBuilder();
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.padding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method padding(int)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#padding(int)}
 * @utbot.executesCondition {@code (width < padding.length): True}
 * @utbot.returnsFrom {@code return padding[width];}
 *  */
    @Test
    public void testPadding_WidthLessThanPaddingLength() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.String[] prevPadding = StringUtil.padding;
        try {
            java.lang.String[] padding = new java.lang.String[21];
            String string = "";
            padding[0] = string;
            String string1 = " ";
            padding[1] = string1;
            String string2 = "  ";
            padding[2] = string2;
            String string3 = "   ";
            padding[3] = string3;
            String string4 = "    ";
            padding[4] = string4;
            String string5 = "     ";
            padding[5] = string5;
            String string6 = "      ";
            padding[6] = string6;
            String string7 = "       ";
            padding[7] = string7;
            String string8 = "        ";
            padding[8] = string8;
            String string9 = "         ";
            padding[9] = string9;
            String string10 = "          ";
            padding[10] = string10;
            String string11 = "           ";
            padding[11] = string11;
            String string12 = "            ";
            padding[12] = string12;
            String string13 = "             ";
            padding[13] = string13;
            String string14 = "              ";
            padding[14] = string14;
            String string15 = "               ";
            padding[15] = string15;
            String string16 = "                ";
            padding[16] = string16;
            String string17 = "                 ";
            padding[17] = string17;
            String string18 = "                  ";
            padding[18] = string18;
            String string19 = "                   ";
            padding[19] = string19;
            String string20 = "                    ";
            padding[20] = string20;
            Class stringUtilClazz = Class.forName("org.jsoup.helper.StringUtil");
            setStaticField(stringUtilClazz, "padding", padding);
            
            String actual = StringUtil.padding(4);
            
            assertEquals(string4, actual);
        } finally {
            setStaticField(StringUtil.class, "padding", prevPadding);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#padding(int)}
 * @utbot.executesCondition {@code (width < padding.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < width; i++)} 21 times
 * @utbot.returnsFrom {@code return String.valueOf(out);}
 *  */
    @Test
    public void testPadding_WidthGreaterOrEqualPaddingLength() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.String[] prevPadding = StringUtil.padding;
        try {
            java.lang.String[] padding = new java.lang.String[21];
            String string = "";
            padding[0] = string;
            String string1 = " ";
            padding[1] = string1;
            String string2 = "  ";
            padding[2] = string2;
            String string3 = "   ";
            padding[3] = string3;
            String string4 = "    ";
            padding[4] = string4;
            String string5 = "     ";
            padding[5] = string5;
            String string6 = "      ";
            padding[6] = string6;
            String string7 = "       ";
            padding[7] = string7;
            String string8 = "        ";
            padding[8] = string8;
            String string9 = "         ";
            padding[9] = string9;
            String string10 = "          ";
            padding[10] = string10;
            String string11 = "           ";
            padding[11] = string11;
            String string12 = "            ";
            padding[12] = string12;
            String string13 = "             ";
            padding[13] = string13;
            String string14 = "              ";
            padding[14] = string14;
            String string15 = "               ";
            padding[15] = string15;
            String string16 = "                ";
            padding[16] = string16;
            String string17 = "                 ";
            padding[17] = string17;
            String string18 = "                  ";
            padding[18] = string18;
            String string19 = "                   ";
            padding[19] = string19;
            String string20 = "                    ";
            padding[20] = string20;
            Class stringUtilClazz = Class.forName("org.jsoup.helper.StringUtil");
            setStaticField(stringUtilClazz, "padding", padding);
            
            String actual = StringUtil.padding(21);
            
            String expected = "                     ";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(StringUtil.class, "padding", prevPadding);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method padding(int)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#padding(int)}
 * @utbot.executesCondition {@code (width < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: width < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPadding_ThrowIllegalArgumentException() {
        StringUtil.padding(-1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.appendNormalisedWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendNormalisedWhitespace(java.lang.StringBuilder, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 *  */
    @Test
    public void testAppendNormalisedWhitespace() {
        String string = "";
        
        StringUtil.appendNormalisedWhitespace(null, string, false);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} once
 *  */
    @Test
    public void testAppendNormalisedWhitespace_ReachedNonWhite() {
        String string = "\u00A0";
        
        StringUtil.appendNormalisedWhitespace(null, string, true);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} twice
 *  */
    @Test
    public void testAppendNormalisedWhitespace_LastWasWhite() {
        StringBuilder stringBuilder = new StringBuilder("");
        String string = "\r\f";
        
        StringUtil.appendNormalisedWhitespace(stringBuilder, string, false);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} twice
 *  */
    @Test
    public void testAppendNormalisedWhitespace_NotReachedNonWhite() {
        StringBuilder stringBuilder = new StringBuilder("");
        String string = "!\u00A0";
        
        StringUtil.appendNormalisedWhitespace(stringBuilder, string, true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendNormalisedWhitespace(java.lang.StringBuilder, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.appendCodePoint(c);
 *  */
    @Test
    public void testAppendNormalisedWhitespace_ThrowNullPointerException() {
        String string = "\uD800";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.appendNormalisedWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:166) */
        StringUtil.appendNormalisedWhitespace(null, string, false);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(' ');
 *  */
    @Test
    public void testAppendNormalisedWhitespace_ThrowNullPointerException_1() {
        String string = "\u00A0";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.appendNormalisedWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:162) */
        StringUtil.appendNormalisedWhitespace(null, string, false);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(' ');
 *  */
    @Test
    public void testAppendNormalisedWhitespace_ThrowNullPointerException_2() {
        String string = "\f";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.appendNormalisedWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:162) */
        StringUtil.appendNormalisedWhitespace(null, string, false);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(' ');
 *  */
    @Test
    public void testAppendNormalisedWhitespace_ThrowNullPointerException_3() {
        String string = "\r";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.appendNormalisedWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:162) */
        StringUtil.appendNormalisedWhitespace(null, string, false);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = string.length();
 *  */
    @Test
    public void testAppendNormalisedWhitespace_ThrowNullPointerException_4() {
        /* This test fails because method [org.jsoup.helper.StringUtil.appendNormalisedWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:155) */
        StringUtil.appendNormalisedWhitespace(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(' ');
 *  */
    @Test
    public void testAppendNormalisedWhitespace_ThrowNullPointerException_5() {
        String string = " ";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.appendNormalisedWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:162) */
        StringUtil.appendNormalisedWhitespace(null, string, false);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(' ');
 *  */
    @Test
    public void testAppendNormalisedWhitespace_ThrowNullPointerException_6() {
        String string = "\n";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.appendNormalisedWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:162) */
        StringUtil.appendNormalisedWhitespace(null, string, false);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i += Character.charCount(c))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(' ');
 *  */
    @Test
    public void testAppendNormalisedWhitespace_ThrowNullPointerException_7() {
        String string = "\t";
        
        /* This test fails because method [org.jsoup.helper.StringUtil.appendNormalisedWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:162) */
        StringUtil.appendNormalisedWhitespace(null, string, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.isActuallyWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isActuallyWhitespace(int)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isActuallyWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;}
 *  */
    @Test
    public void testIsActuallyWhitespace_CNotEqualsCharOrCNotEqualsCharOrCNotEqualsCharOrCNotEqualsCharOrCNotEqualsCharOrCNotEquals160() {
        boolean actual = StringUtil.isActuallyWhitespace(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isActuallyWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;}
 *  */
    @Test
    public void testIsActuallyWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEquals160() {
        boolean actual = StringUtil.isActuallyWhitespace(160);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isActuallyWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;}
 *  */
    @Test
    public void testIsActuallyWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEquals160_1() {
        boolean actual = StringUtil.isActuallyWhitespace(13);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isActuallyWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;}
 *  */
    @Test
    public void testIsActuallyWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEquals160_2() {
        boolean actual = StringUtil.isActuallyWhitespace(32);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isActuallyWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;}
 *  */
    @Test
    public void testIsActuallyWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEquals160_3() {
        boolean actual = StringUtil.isActuallyWhitespace(9);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isActuallyWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;}
 *  */
    @Test
    public void testIsActuallyWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEquals160_4() {
        boolean actual = StringUtil.isActuallyWhitespace(12);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#isActuallyWhitespace(int)}
 * @utbot.returnsFrom {@code return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;}
 *  */
    @Test
    public void testIsActuallyWhitespace_CEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEqualsCharOrCEquals160_5() {
        boolean actual = StringUtil.isActuallyWhitespace(10);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.normaliseWhitespace
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normaliseWhitespace(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#normaliseWhitespace(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.StringUtil#stringBuilder()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StringBuilder sb = StringUtil.stringBuilder();
 *  */
    @Test
    public void testNormaliseWhitespace_ThrowNullPointerException() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.helper.StringUtil");
        ThreadLocal prevStringLocal = ((ThreadLocal) getStaticFieldValue(stringUtilClazz, "stringLocal"));
        try {
            ThreadLocal stringLocal = ((ThreadLocal) createInstance("org.jsoup.helper.StringUtil$1"));
            setField(stringLocal, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(stringUtilClazz, "stringLocal", stringLocal);
            
            /* This test fails because method [org.jsoup.helper.StringUtil.normaliseWhitespace] produces [java.lang.NullPointerException]
                org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:155)
                org.jsoup.helper.StringUtil.normaliseWhitespace(StringUtil.java:141) */
            StringUtil.normaliseWhitespace(null);
        } finally {
            setStaticField(StringUtil.class, "stringLocal", prevStringLocal);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method normaliseWhitespace(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.StringUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#normaliseWhitespace(java.lang.String)}
     */
    @Test
    public void testNormaliseWhitespaceWithNonEmptyString() {
        String actual = StringUtil.normaliseWhitespace("\u0014\n\t\r");
        
        String expected = "\u0014 ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method normaliseWhitespace(java.lang.String)
    
    @Test
    public void testNormaliseWhitespace1() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.helper.StringUtil");
        ThreadLocal prevStringLocal = ((ThreadLocal) getStaticFieldValue(stringUtilClazz, "stringLocal"));
        try {
            ThreadLocal stringLocal = ((ThreadLocal) createInstance("org.jsoup.helper.StringUtil$1"));
            setField(stringLocal, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(stringUtilClazz, "stringLocal", stringLocal);
            String string = "";
            
            String actual = StringUtil.normaliseWhitespace(string);
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(StringUtil.class, "stringLocal", prevStringLocal);
        }
    }
    
    @Test
    public void testNormaliseWhitespace2() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.helper.StringUtil");
        ThreadLocal prevStringLocal = ((ThreadLocal) getStaticFieldValue(stringUtilClazz, "stringLocal"));
        try {
            ThreadLocal stringLocal = ((ThreadLocal) createInstance("org.jsoup.helper.StringUtil$1"));
            setField(stringLocal, "java.lang.ThreadLocal", "threadLocalHashCode", 46);
            setStaticField(stringUtilClazz, "stringLocal", stringLocal);
            String string = "";
            
            String actual = StringUtil.normaliseWhitespace(string);
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(StringUtil.class, "stringLocal", prevStringLocal);
        }
    }
    
    @Test
    public void testNormaliseWhitespace3() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.helper.StringUtil");
        ThreadLocal prevStringLocal = ((ThreadLocal) getStaticFieldValue(stringUtilClazz, "stringLocal"));
        try {
            ThreadLocal stringLocal = ((ThreadLocal) createInstance("org.jsoup.helper.StringUtil$1"));
            setField(stringLocal, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(stringUtilClazz, "stringLocal", stringLocal);
            String string = "\u0000";
            
            String actual = StringUtil.normaliseWhitespace(string);
            
            String expected = "\u0000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(StringUtil.class, "stringLocal", prevStringLocal);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method normaliseWhitespace(java.lang.String)
    
    @Test
    public void testNormaliseWhitespace4() {
        /* This test fails because method [org.jsoup.helper.StringUtil.normaliseWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:155)
            org.jsoup.helper.StringUtil.normaliseWhitespace(StringUtil.java:141) */
        StringUtil.normaliseWhitespace(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.StringUtil.inSorted
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inSorted(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#inSorted(java.lang.String,java.lang.String[])}
 * @utbot.returnsFrom {@code return Arrays.binarySearch(haystack, needle) >= 0;}
 *  */
    @Test
    public void testInSorted_ArraysBinarySearchGreaterOrEqualZero() {
        String string = "\u0000";
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = string;
        
        boolean actual = StringUtil.inSorted(string, stringArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#inSorted(java.lang.String,java.lang.String[])}
 * @utbot.returnsFrom {@code return Arrays.binarySearch(haystack, needle) >= 0;}
 *  */
    @Test
    public void testInSorted_ArraysBinarySearchLessThanZero() {
        java.lang.String[] stringArray = {};
        
        boolean actual = StringUtil.inSorted(null, stringArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inSorted(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link StringUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.StringUtil#inSorted(java.lang.String,java.lang.String[])}
 * @utbot.invokes {@link java.util.Arrays#binarySearch(java.lang.Object[],java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Arrays.binarySearch(haystack, needle) >= 0;
 *  */
    @Test
    public void testInSorted_ThrowNullPointerException() {
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.jsoup.helper.StringUtil.inSorted] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.binarySearch0(Arrays.java:2234)
            java.base/java.util.Arrays.binarySearch(Arrays.java:2174)
            org.jsoup.helper.StringUtil.inSorted(StringUtil.java:183) */
        StringUtil.inSorted(null, stringArray);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1006155134964000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1006155134964000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1006155134970600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006155134964000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006155134970600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1006155135970800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1006155135970800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1006155135972900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006155135970800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006155135972900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1006155136747300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1006155136747300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1006155136750200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006155136747300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006155136750200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

