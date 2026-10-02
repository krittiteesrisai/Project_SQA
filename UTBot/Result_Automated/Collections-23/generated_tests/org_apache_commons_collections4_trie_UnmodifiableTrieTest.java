package org.apache.commons.collections4.trie;

import org.junit.Test;
import org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import java.util.ArrayList;
import org.apache.commons.collections4.Trie;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_collections4_trie_UnmodifiableTrieTest {
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.remove
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        unmodifiableTrie.remove(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.get(key);}
 *  */
    @Test
    public void testGet_ReturnDelegateGet() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.get(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.get(key);}
 *  */
    @Test
    public void testGet_ReturnDelegateGet_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.get(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.get(key);}
 *  */
    @Test
    public void testGet_ReturnDelegateGet_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        Object actual = unmodifiableTrie.get(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.get(key);}
 *  */
    @Test
    public void testGet_ReturnDelegateGet_7() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        String key = "";
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000";
        
        Object actual = unmodifiableTrie.get(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.get(key);}
 *  */
    @Test
    public void testGet_ReturnDelegateGet_3() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 31;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 32;
        left.left = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0000";
        
        Object actual = unmodifiableTrie.get(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.get(key);}
 *  */
    @Test
    public void testGet_ReturnDelegateGet_4() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 30;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 31;
        left.right = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0001";
        
        Object actual = unmodifiableTrie.get(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.get(key);}
 *  */
    @Test
    public void testGet_ReturnDelegateGet_5() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 30;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 31;
        left.left = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0000";
        
        Object actual = unmodifiableTrie.get(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.get(key);}
 *  */
    @Test
    public void testGet_ReturnDelegateGet_6() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        String key = "\u0000";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        Object value = createInstance("java.lang.Object");
        left.value = value;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.get(key);
        
        Object expected = new Object();
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return delegate.get(key);
 *  */
    @Test
    public void testGet_ThrowClassCastException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.get] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.String ([S and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:260)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.get(AbstractPatriciaTrie.java:243)
            org.apache.commons.collections4.trie.PatriciaTrie.get(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.get(UnmodifiableTrie.java:101) */
        unmodifiableTrie.get(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return delegate.get(key);
 *  */
    @Test
    public void testGet_ThrowClassCastException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        byte[] key = {};
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.get] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String.compareTo(String.java:140)
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.compareKeys(AbstractBitwiseTrie.java:134)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:262)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.get(AbstractPatriciaTrie.java:243)
            org.apache.commons.collections4.trie.PatriciaTrie.get(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.get(UnmodifiableTrie.java:101) */
        unmodifiableTrie.get(string);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return delegate.get(key);
 *  */
    @Test
    public void testGet_ThrowStringIndexOutOfBoundsException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -2;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = -1;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.get] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isBitSet(StringKeyAnalyzer.java:118)
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isBitSet(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.isBitSet(AbstractBitwiseTrie.java:114)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getNearestEntryForKey(AbstractPatriciaTrie.java:467)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:261)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.get(AbstractPatriciaTrie.java:243)
            org.apache.commons.collections4.trie.PatriciaTrie.get(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.get(UnmodifiableTrie.java:101) */
        unmodifiableTrie.get(string);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#get(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.get(key);
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.get(UnmodifiableTrie.java:101) */
        unmodifiableTrie.get(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.put
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testPut_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        unmodifiableTrie.put(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.equals
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.equals(obj);
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.equals] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.equals(UnmodifiableTrie.java:174) */
        unmodifiableTrie.equals(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testEquals1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        Object object = new Object();
        
        unmodifiableTrie.equals(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#toString()}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.toString();
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.toString] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179) */
        unmodifiableTrie.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        String actual = unmodifiableTrie.toString();
        
        String expected = "Trie[0]={\n}\n";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        String actual = unmodifiableTrie.toString();
        
        String expected = "Trie[0]={\n}\n";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate1 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate2 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate1, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate2);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        String actual = unmodifiableTrie.toString();
        
        String expected = "Trie[0]={\n}\n";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate1 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate2 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate3 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate2, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate3);
        setField(delegate1, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate2);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        String actual = unmodifiableTrie.toString();
        
        String expected = "Trie[0]={\n}\n";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate1 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate2 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate3 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate4 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate3, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate4);
        setField(delegate2, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate3);
        setField(delegate1, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate2);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        String actual = unmodifiableTrie.toString();
        
        String expected = "Trie[0]={\n}\n";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString6() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.toString();
    }
    
    @Test
    public void testToString7() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", Integer.MIN_VALUE);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.toString] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:762)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:754)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntry(AbstractPatriciaTrie.java:614)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieIterator.<init>(AbstractPatriciaTrie.java:1554)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet.iterator(AbstractPatriciaTrie.java:1404)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.toString(AbstractBitwiseTrie.java:68)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179) */
        unmodifiableTrie.toString();
    }
    
    @Test
    public void testToString8() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate1, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", -553);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.toString] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:762)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:754)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntry(AbstractPatriciaTrie.java:614)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieIterator.<init>(AbstractPatriciaTrie.java:1554)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet.iterator(AbstractPatriciaTrie.java:1404)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.toString(AbstractBitwiseTrie.java:68)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179) */
        unmodifiableTrie.toString();
    }
    
    @Test
    public void testToString9() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate1 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate2 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate2, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", -177);
        setField(delegate1, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate2);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.toString] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:762)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:754)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntry(AbstractPatriciaTrie.java:614)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieIterator.<init>(AbstractPatriciaTrie.java:1554)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet.iterator(AbstractPatriciaTrie.java:1404)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.toString(AbstractBitwiseTrie.java:68)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179) */
        unmodifiableTrie.toString();
    }
    
    @Test
    public void testToString10() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate1 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate2 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate3 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate3, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", 1677721617);
        setField(delegate2, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate3);
        setField(delegate1, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate2);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.toString] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:762)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:754)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntry(AbstractPatriciaTrie.java:614)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieIterator.<init>(AbstractPatriciaTrie.java:1554)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet.iterator(AbstractPatriciaTrie.java:1404)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.toString(AbstractBitwiseTrie.java:68)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179) */
        unmodifiableTrie.toString();
    }
    
    @Test
    public void testToString11() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate1 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate2 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate3 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate4 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate5 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate5, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", 1090519057);
        setField(delegate4, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate5);
        setField(delegate3, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate4);
        setField(delegate2, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate3);
        setField(delegate1, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate2);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.toString] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:762)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:754)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntry(AbstractPatriciaTrie.java:614)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieIterator.<init>(AbstractPatriciaTrie.java:1554)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator.<init>(AbstractPatriciaTrie.java:1443)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet.iterator(AbstractPatriciaTrie.java:1404)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.toString(AbstractBitwiseTrie.java:68)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179)
            org.apache.commons.collections4.trie.UnmodifiableTrie.toString(UnmodifiableTrie.java:179) */
        unmodifiableTrie.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.values
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method values()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#values()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(delegate.values());}
 *  */
    @Test
    public void testValues_ReturnCollectionsUnmodifiableCollection() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        ArrayList values = new ArrayList();
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", values);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.values();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#values()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(delegate.values());}
 *  */
    @Test
    public void testValues_ReturnCollectionsUnmodifiableCollection_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Trie unmodifiableTrieDelegate = ((Trie) getFieldValue(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate"));
        Collection initialUnmodifiableTrieDelegateValues = ((Collection) getFieldValue(unmodifiableTrieDelegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values"));
        
        Object actual = unmodifiableTrie.values();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
        Trie unmodifiableTrieDelegate1 = ((Trie) getFieldValue(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate"));
        Collection finalUnmodifiableTrieDelegateValues = ((Collection) getFieldValue(unmodifiableTrieDelegate1, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values"));
        
        assertFalse(initialUnmodifiableTrieDelegateValues == finalUnmodifiableTrieDelegateValues);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#values()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(delegate.values());}
 *  */
    @Test
    public void testValues_ReturnCollectionsUnmodifiableCollection_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        HashSet values = new HashSet();
        setField(delegate1, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", values);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.values();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method values()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#values()}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableCollection(delegate.values());
 *  */
    @Test
    public void testValues_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.values] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.values(UnmodifiableTrie.java:85) */
        unmodifiableTrie.values();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.hashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.hashCode(UnmodifiableTrie.java:169) */
        unmodifiableTrie.hashCode();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test(expected = StackOverflowError.class)
    public void testHashCode1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.clear
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#clear()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testClear_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        unmodifiableTrie.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.isEmpty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#isEmpty()}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.isEmpty();
 *  */
    @Test
    public void testIsEmpty_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.isEmpty] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.isEmpty(UnmodifiableTrie.java:105) */
        unmodifiableTrie.isEmpty();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isEmpty()
    
    @Test(expected = StackOverflowError.class)
    public void testIsEmpty1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.isEmpty();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#size()}
 * @utbot.returnsFrom {@code return delegate.size();}
 *  */
    @Test
    public void testSize_ReturnDelegateSize() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        int actual = unmodifiableTrie.size();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#size()}
 * @utbot.returnsFrom {@code return delegate.size();}
 *  */
    @Test
    public void testSize_ReturnDelegateSize_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        int actual = unmodifiableTrie.size();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#size()}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.size();
 *  */
    @Test
    public void testSize_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.size] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.size(UnmodifiableTrie.java:121) */
        unmodifiableTrie.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.entrySet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method entrySet()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#entrySet()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSet(delegate.entrySet());}
 *  */
    @Test
    public void testEntrySet_ReturnCollectionsUnmodifiableSet() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        LinkedHashSet entrySet = new LinkedHashSet();
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "entrySet", entrySet);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Set actual = unmodifiableTrie.entrySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#entrySet()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSet(delegate.entrySet());}
 *  */
    @Test
    public void testEntrySet_ReturnCollectionsUnmodifiableSet_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Set actual = unmodifiableTrie.entrySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#entrySet()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSet(delegate.entrySet());}
 *  */
    @Test
    public void testEntrySet_ReturnCollectionsUnmodifiableSet_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        LinkedHashSet entrySet = new LinkedHashSet();
        setField(delegate1, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "entrySet", entrySet);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Set actual = unmodifiableTrie.entrySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method entrySet()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#entrySet()}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableSet(delegate.entrySet());
 *  */
    @Test
    public void testEntrySet_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.entrySet] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.entrySet(UnmodifiableTrie.java:77) */
        unmodifiableTrie.entrySet();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.putAll
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#putAll(java.util.Map)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testPutAll_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        unmodifiableTrie.putAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_ReturnDelegateContainsKey() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        boolean actual = unmodifiableTrie.containsKey(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_ReturnDelegateContainsKey_6() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        boolean actual = unmodifiableTrie.containsKey(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_ReturnDelegateContainsKey_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        boolean actual = unmodifiableTrie.containsKey(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_ReturnDelegateContainsKey_7() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        String key = "\u0000\u0000";
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        boolean actual = unmodifiableTrie.containsKey(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_ReturnDelegateContainsKey_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 31;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 32;
        left.left = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0000";
        
        boolean actual = unmodifiableTrie.containsKey(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_ReturnDelegateContainsKey_3() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -1;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.left = left;
        String key = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        boolean actual = unmodifiableTrie.containsKey(key);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_ReturnDelegateContainsKey_4() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 30;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 31;
        left.right = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0001";
        
        boolean actual = unmodifiableTrie.containsKey(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_ReturnDelegateContainsKey_5() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 30;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 31;
        left.left = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0000";
        
        boolean actual = unmodifiableTrie.containsKey(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return delegate.containsKey(key);
 *  */
    @Test
    public void testContainsKey_ThrowClassCastException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.String ([S and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.containsKey(AbstractPatriciaTrie.java:386)
            org.apache.commons.collections4.trie.PatriciaTrie.containsKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey(UnmodifiableTrie.java:93) */
        unmodifiableTrie.containsKey(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return delegate.containsKey(key);
 *  */
    @Test
    public void testContainsKey_ThrowStringIndexOutOfBoundsException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -2;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = -1;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isBitSet(StringKeyAnalyzer.java:118)
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isBitSet(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.isBitSet(AbstractBitwiseTrie.java:114)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getNearestEntryForKey(AbstractPatriciaTrie.java:467)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.containsKey(AbstractPatriciaTrie.java:387)
            org.apache.commons.collections4.trie.PatriciaTrie.containsKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey(UnmodifiableTrie.java:93) */
        unmodifiableTrie.containsKey(string);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return delegate.containsKey(key);
 *  */
    @Test
    public void testContainsKey_ThrowClassCastException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        byte[] key = {};
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String.compareTo(String.java:140)
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.compareKeys(AbstractBitwiseTrie.java:134)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.containsKey(AbstractPatriciaTrie.java:388)
            org.apache.commons.collections4.trie.PatriciaTrie.containsKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey(UnmodifiableTrie.java:93) */
        unmodifiableTrie.containsKey(string);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsKey(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.containsKey(key);
 *  */
    @Test
    public void testContainsKey_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey(UnmodifiableTrie.java:93) */
        unmodifiableTrie.containsKey(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.keySet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method keySet()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#keySet()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSet(delegate.keySet());}
 *  */
    @Test
    public void testKeySet_ReturnCollectionsUnmodifiableSet() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        LinkedHashSet keySet = new LinkedHashSet();
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", keySet);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Set actual = unmodifiableTrie.keySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#keySet()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSet(delegate.keySet());}
 *  */
    @Test
    public void testKeySet_ReturnCollectionsUnmodifiableSet_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Set actual = unmodifiableTrie.keySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#keySet()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSet(delegate.keySet());}
 *  */
    @Test
    public void testKeySet_ReturnCollectionsUnmodifiableSet_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        LinkedHashSet keySet = new LinkedHashSet();
        setField(delegate1, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", keySet);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Set actual = unmodifiableTrie.keySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method keySet()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#keySet()}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableSet(delegate.keySet());
 *  */
    @Test
    public void testKeySet_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.keySet] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.keySet(UnmodifiableTrie.java:81) */
        unmodifiableTrie.keySet();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.containsValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#containsValue(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#containsValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.containsValue(value);
 *  */
    @Test
    public void testContainsValue_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.containsValue] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.containsValue(UnmodifiableTrie.java:97) */
        unmodifiableTrie.containsValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.comparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method comparator()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#comparator()}
 * @utbot.returnsFrom {@code return delegate.comparator();}
 *  */
    @Test
    public void testComparator_ReturnDelegateComparator() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Comparator actual = unmodifiableTrie.comparator();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#comparator()}
 * @utbot.returnsFrom {@code return delegate.comparator();}
 *  */
    @Test
    public void testComparator_ReturnDelegateComparator_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Comparator actual = unmodifiableTrie.comparator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method comparator()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#comparator()}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#comparator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.comparator();
 *  */
    @Test
    public void testComparator_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.comparator] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.comparator(UnmodifiableTrie.java:149) */
        unmodifiableTrie.comparator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.firstKey
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method firstKey()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#firstKey()}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#firstKey()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.firstKey();
 *  */
    @Test
    public void testFirstKey_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.firstKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.firstKey(UnmodifiableTrie.java:125) */
        unmodifiableTrie.firstKey();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method firstKey()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#firstKey()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return delegate.firstKey();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testFirstKey_ThrowNoSuchElementException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.firstKey();
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#firstKey()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return delegate.firstKey();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testFirstKey_ThrowNoSuchElementException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.firstKey();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method firstKey()
    
    @Test(expected = NoSuchElementException.class)
    public void testFirstKey1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate1 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate2 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate3 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate4 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate5 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate6 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate7 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate8 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate9 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate10 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate11 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate12 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate13 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate14 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate15 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate16 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate17 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate18 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate19 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate20 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate21 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate22 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate23 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate24 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate25 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate26 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate27 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate28 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate29 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate30 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate31 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate32 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate33 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate34 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate35 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate36 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate37 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate38 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate39 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate40 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate41 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate42 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate43 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate44 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate45 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate46 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate47 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate48 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate49 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate50 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate51 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate52 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate53 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate54 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate55 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate56 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate57 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate58 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate59 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate60 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate61 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate62 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate63 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate64 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate65 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate66 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate67 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate68 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate69 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate70 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate71 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate72 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate73 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate74 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate75 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate76 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate77 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate78 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate79 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate80 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate81 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate82 = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate83 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate82, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate83);
        setField(delegate81, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate82);
        setField(delegate80, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate81);
        setField(delegate79, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate80);
        setField(delegate78, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate79);
        setField(delegate77, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate78);
        setField(delegate76, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate77);
        setField(delegate75, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate76);
        setField(delegate74, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate75);
        setField(delegate73, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate74);
        setField(delegate72, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate73);
        setField(delegate71, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate72);
        setField(delegate70, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate71);
        setField(delegate69, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate70);
        setField(delegate68, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate69);
        setField(delegate67, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate68);
        setField(delegate66, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate67);
        setField(delegate65, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate66);
        setField(delegate64, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate65);
        setField(delegate63, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate64);
        setField(delegate62, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate63);
        setField(delegate61, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate62);
        setField(delegate60, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate61);
        setField(delegate59, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate60);
        setField(delegate58, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate59);
        setField(delegate57, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate58);
        setField(delegate56, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate57);
        setField(delegate55, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate56);
        setField(delegate54, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate55);
        setField(delegate53, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate54);
        setField(delegate52, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate53);
        setField(delegate51, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate52);
        setField(delegate50, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate51);
        setField(delegate49, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate50);
        setField(delegate48, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate49);
        setField(delegate47, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate48);
        setField(delegate46, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate47);
        setField(delegate45, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate46);
        setField(delegate44, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate45);
        setField(delegate43, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate44);
        setField(delegate42, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate43);
        setField(delegate41, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate42);
        setField(delegate40, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate41);
        setField(delegate39, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate40);
        setField(delegate38, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate39);
        setField(delegate37, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate38);
        setField(delegate36, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate37);
        setField(delegate35, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate36);
        setField(delegate34, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate35);
        setField(delegate33, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate34);
        setField(delegate32, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate33);
        setField(delegate31, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate32);
        setField(delegate30, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate31);
        setField(delegate29, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate30);
        setField(delegate28, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate29);
        setField(delegate27, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate28);
        setField(delegate26, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate27);
        setField(delegate25, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate26);
        setField(delegate24, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate25);
        setField(delegate23, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate24);
        setField(delegate22, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate23);
        setField(delegate21, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate22);
        setField(delegate20, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate21);
        setField(delegate19, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate20);
        setField(delegate18, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate19);
        setField(delegate17, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate18);
        setField(delegate16, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate17);
        setField(delegate15, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate16);
        setField(delegate14, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate15);
        setField(delegate13, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate14);
        setField(delegate12, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate13);
        setField(delegate11, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate12);
        setField(delegate10, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate11);
        setField(delegate9, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate10);
        setField(delegate8, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate9);
        setField(delegate7, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate8);
        setField(delegate6, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate7);
        setField(delegate5, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate6);
        setField(delegate4, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate5);
        setField(delegate3, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate4);
        setField(delegate2, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate3);
        setField(delegate1, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate2);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.firstKey();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.lastKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastKey()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#lastKey()}
 * @utbot.returnsFrom {@code return delegate.lastKey();}
 *  */
    @Test
    public void testLastKey_ReturnDelegateLastKey() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.right = root;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.lastKey();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#lastKey()}
 * @utbot.returnsFrom {@code return delegate.lastKey();}
 *  */
    @Test
    public void testLastKey_ReturnDelegateLastKey_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -2;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = -3;
        left.right = root;
        root.left = left;
        root.right = root;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.lastKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastKey()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#lastKey()}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#lastKey()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.lastKey();
 *  */
    @Test
    public void testLastKey_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.lastKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.lastKey(UnmodifiableTrie.java:133) */
        unmodifiableTrie.lastKey();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method lastKey()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#lastKey()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return delegate.lastKey();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testLastKey_ThrowNoSuchElementException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.lastKey();
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#lastKey()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return delegate.lastKey();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testLastKey_ThrowNoSuchElementException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        setField(delegate1, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.lastKey();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.subMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subMap(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));}
 *  */
    @Test
    public void testSubMap_ReturnCollectionsUnmodifiableSortedMap() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        short[] shortArray = {};
        
        Object actual = unmodifiableTrie.subMap(null, shortArray);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableSortedMap");
        
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));}
 *  */
    @Test
    public void testSubMap_ReturnCollectionsUnmodifiableSortedMap_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        short[] shortArray = {};
        
        Object actual = unmodifiableTrie.subMap(shortArray, null);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableSortedMap");
        
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));}
 *  */
    @Test
    public void testSubMap_ReturnCollectionsUnmodifiableSortedMap_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        Integer integer = 0;
        Integer integer1 = 0;
        
        Object actual = unmodifiableTrie.subMap(integer, integer1);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableSortedMap");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subMap(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test
    public void testSubMap_ThrowClassCastException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.subMap] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Comparable ([B and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1874)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1861)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.subMap(AbstractPatriciaTrie.java:874)
            org.apache.commons.collections4.trie.PatriciaTrie.subMap(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(UnmodifiableTrie.java:137) */
        unmodifiableTrie.subMap(byteArray, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test
    public void testSubMap_ThrowClassCastException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        Integer integer = 0;
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.subMap] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Integer ([B and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1874)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1861)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.subMap(AbstractPatriciaTrie.java:874)
            org.apache.commons.collections4.trie.PatriciaTrie.subMap(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(UnmodifiableTrie.java:137) */
        unmodifiableTrie.subMap(integer, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test
    public void testSubMap_ThrowClassCastException_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        Character character = '\u0000';
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.subMap] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.Character ([S and java.lang.Character are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Character.compareTo(Character.java:174)
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1874)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1861)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.subMap(AbstractPatriciaTrie.java:874)
            org.apache.commons.collections4.trie.PatriciaTrie.subMap(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(UnmodifiableTrie.java:137) */
        unmodifiableTrie.subMap(character, shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test
    public void testSubMap_ThrowClassCastException_3() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        Double double1 = 0.0;
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.subMap] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.Double ([S and java.lang.Double are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Double.compareTo(Double.java:155)
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1874)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1861)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.subMap(AbstractPatriciaTrie.java:874)
            org.apache.commons.collections4.trie.PatriciaTrie.subMap(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(UnmodifiableTrie.java:137) */
        unmodifiableTrie.subMap(double1, shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test
    public void testSubMap_ThrowClassCastException_4() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.subMap] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.String ([S and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String.compareTo(String.java:140)
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1874)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1861)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.subMap(AbstractPatriciaTrie.java:874)
            org.apache.commons.collections4.trie.PatriciaTrie.subMap(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(UnmodifiableTrie.java:137) */
        unmodifiableTrie.subMap(string, shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test
    public void testSubMap_ThrowClassCastException_5() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        Long long1 = 0L;
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.subMap] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.Long ([I and java.lang.Long are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Long.compareTo(Long.java:71)
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1874)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1861)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.subMap(AbstractPatriciaTrie.java:874)
            org.apache.commons.collections4.trie.PatriciaTrie.subMap(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(UnmodifiableTrie.java:137)
            org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(UnmodifiableTrie.java:137) */
        unmodifiableTrie.subMap(long1, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test
    public void testSubMap_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.subMap] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(UnmodifiableTrie.java:137) */
        unmodifiableTrie.subMap(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subMap(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubMap_ThrowIllegalArgumentException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.subMap(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubMap_ThrowIllegalArgumentException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        Integer integer = 0;
        Integer integer1 = -1;
        
        unmodifiableTrie.subMap(integer, integer1);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubMap_ThrowIllegalArgumentException_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.subMap(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#subMap(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collections.unmodifiableSortedMap(delegate.subMap(fromKey, toKey));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubMap_ThrowIllegalArgumentException_3() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        Long long1 = 1L;
        Long long2 = 0L;
        
        unmodifiableTrie.subMap(long1, long2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.headMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method headMap(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#headMap(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#headMap(java.lang.Object)}
 * @utbot.invokes {@link java.util.Collections#unmodifiableSortedMap(java.util.SortedMap)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSortedMap(delegate.headMap(toKey));}
 *  */
    @Test
    public void testHeadMap_CollectionsUnmodifiableSortedMap() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        int[] intArray = {};
        
        Object actual = unmodifiableTrie.headMap(intArray);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableSortedMap");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method headMap(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#headMap(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#headMap(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableSortedMap(delegate.headMap(toKey));
 *  */
    @Test
    public void testHeadMap_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.headMap] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.headMap(UnmodifiableTrie.java:129) */
        unmodifiableTrie.headMap(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method headMap(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#headMap(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collections.unmodifiableSortedMap(delegate.headMap(toKey));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHeadMap_ThrowIllegalArgumentException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.headMap(null);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#headMap(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collections.unmodifiableSortedMap(delegate.headMap(toKey));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHeadMap_ThrowIllegalArgumentException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.headMap(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.tailMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tailMap(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#tailMap(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#tailMap(java.lang.Object)}
 * @utbot.invokes {@link java.util.Collections#unmodifiableSortedMap(java.util.SortedMap)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSortedMap(delegate.tailMap(fromKey));}
 *  */
    @Test
    public void testTailMap_CollectionsUnmodifiableSortedMap() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        int[] intArray = {};
        
        Object actual = unmodifiableTrie.tailMap(intArray);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableSortedMap");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tailMap(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#tailMap(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#tailMap(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableSortedMap(delegate.tailMap(fromKey));
 *  */
    @Test
    public void testTailMap_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.tailMap] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.tailMap(UnmodifiableTrie.java:141) */
        unmodifiableTrie.tailMap(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tailMap(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#tailMap(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collections.unmodifiableSortedMap(delegate.tailMap(fromKey));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTailMap_ThrowIllegalArgumentException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.tailMap(null);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#tailMap(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collections.unmodifiableSortedMap(delegate.tailMap(fromKey));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTailMap_ThrowIllegalArgumentException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.tailMap(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unmodifiableTrie(org.apache.commons.collections4.Trie)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#unmodifiableTrie(org.apache.commons.collections4.Trie)}
 * @utbot.returnsFrom {@code return new UnmodifiableTrie<K, V>(trie);}
 *  */
    @Test
    public void testUnmodifiableTrie_Return() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        UnmodifiableTrie actual = UnmodifiableTrie.unmodifiableTrie(unmodifiableTrie);
        
        UnmodifiableTrie expected = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(expected, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", unmodifiableTrie);
        
        // org.apache.commons.collections4.trie.UnmodifiableTrie is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unmodifiableTrie(org.apache.commons.collections4.Trie)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#unmodifiableTrie(org.apache.commons.collections4.Trie)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new UnmodifiableTrie<K, V>(trie);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableTrie_ThrowIllegalArgumentException() {
        UnmodifiableTrie.unmodifiableTrie(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        Object actual = unmodifiableTrie.nextKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_7() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        String key = "\u0000";
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\uFFFF\u0000";
        
        Object actual = unmodifiableTrie.nextKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 31;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 32;
        left.left = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0000";
        
        Object actual = unmodifiableTrie.nextKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_5() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 30;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 31;
        left.right = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0001";
        
        Object actual = unmodifiableTrie.nextKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_6() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 30;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 31;
        left.left = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0000";
        
        Object actual = unmodifiableTrie.nextKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -1;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.left = left;
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.predecessor = predecessor;
        String key = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.nextKey(key);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_8() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        predecessor.parent = root;
        predecessor.right = root;
        Object key = createInstance("java.lang.Object");
        predecessor.key = key;
        root.predecessor = predecessor;
        String key1 = "";
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key1);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.nextKey(key1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_9() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.predecessor = root;
        String key = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.left = left;
        Object key1 = createInstance("java.lang.Object");
        root.key = key1;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.nextKey(key);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_10() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        predecessor.bitIndex = 2572;
        AbstractPatriciaTrie.TrieEntry right = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        right.bitIndex = 2572;
        int[] key = {};
        setField(right, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        predecessor.right = right;
        Object key1 = createInstance("java.lang.Object");
        predecessor.key = key1;
        left.predecessor = predecessor;
        String key2 = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key2);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        int[] actual = ((int[]) unmodifiableTrie.nextKey(key2));
        
        assertArrayEquals(key, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_3() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -1;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry parent = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry parent1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        parent1.right = parent1;
        parent1.predecessor = left;
        String key = "";
        setField(parent1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        parent.parent = parent1;
        parent.right = left;
        left.parent = parent;
        left.left = parent1;
        left.right = parent1;
        String key1 = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key1);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.nextKey(key);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_11() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry parent = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        parent.bitIndex = 98306;
        parent.right = parent;
        byte[] key = {};
        setField(parent, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        predecessor.parent = parent;
        predecessor.right = left;
        String key1 = "";
        setField(predecessor, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key1);
        left.predecessor = predecessor;
        String key2 = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key2);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        byte[] actual = ((byte[]) unmodifiableTrie.nextKey(key2));
        
        org.junit.Assert.assertArrayEquals(key, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.nextKey(key);}
 *  */
    @Test
    public void testNextKey_ReturnDelegateNextKey_4() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -1;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        predecessor.parent = root;
        predecessor.right = left1;
        String key = "";
        setField(predecessor, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        left1.predecessor = predecessor;
        String key1 = "";
        setField(left1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key1);
        left.left = left1;
        root.left = left;
        root.right = root;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.nextKey(key1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return delegate.nextKey(key);
 *  */
    @Test
    public void testNextKey_ThrowClassCastException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:260)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextKey(AbstractPatriciaTrie.java:803)
            org.apache.commons.collections4.trie.PatriciaTrie.nextKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey(UnmodifiableTrie.java:159) */
        unmodifiableTrie.nextKey(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return delegate.nextKey(key);
 *  */
    @Test
    public void testNextKey_ThrowClassCastException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        byte[] key = {};
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String.compareTo(String.java:140)
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.compareKeys(AbstractBitwiseTrie.java:134)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:262)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextKey(AbstractPatriciaTrie.java:803)
            org.apache.commons.collections4.trie.PatriciaTrie.nextKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey(UnmodifiableTrie.java:159) */
        unmodifiableTrie.nextKey(string);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return delegate.nextKey(key);
 *  */
    @Test
    public void testNextKey_ThrowStringIndexOutOfBoundsException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -2;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = -1;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isBitSet(StringKeyAnalyzer.java:118)
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isBitSet(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.isBitSet(AbstractBitwiseTrie.java:114)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getNearestEntryForKey(AbstractPatriciaTrie.java:467)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:261)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextKey(AbstractPatriciaTrie.java:803)
            org.apache.commons.collections4.trie.PatriciaTrie.nextKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey(UnmodifiableTrie.java:159) */
        unmodifiableTrie.nextKey(string);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#nextKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.nextKey(key);
 *  */
    @Test
    public void testNextKey_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey(UnmodifiableTrie.java:159) */
        unmodifiableTrie.nextKey(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.nextKey(key);
 *  */
    @Test(expected = NullPointerException.class)
    public void testNextKey_ThrowNullPointerException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.nextKey(null);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#nextKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.nextKey(key);
 *  */
    @Test(expected = NullPointerException.class)
    public void testNextKey_ThrowNullPointerException_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.nextKey(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.mapIterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapIterator()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#mapIterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#mapIterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final OrderedMapIterator<K, V> it = delegate.mapIterator();
 *  */
    @Test
    public void testMapIterator_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.mapIterator] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.mapIterator(UnmodifiableTrie.java:154) */
        unmodifiableTrie.mapIterator();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapIterator()
    
    @Test(expected = StackOverflowError.class)
    public void testMapIterator1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.mapIterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method prefixMap(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#prefixMap(java.lang.Object)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSortedMap(delegate.prefixMap(key));}
 *  */
    @Test
    public void testPrefixMap_ReturnCollectionsUnmodifiableSortedMap() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.prefixMap(null);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableSortedMap");
        
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#prefixMap(java.lang.Object)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSortedMap(delegate.prefixMap(key));}
 *  */
    @Test
    public void testPrefixMap_ReturnCollectionsUnmodifiableSortedMap_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        Object actual = unmodifiableTrie.prefixMap(string);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableSortedMap");
        
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#prefixMap(java.lang.Object)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSortedMap(delegate.prefixMap(key));}
 *  */
    @Test
    public void testPrefixMap_ReturnCollectionsUnmodifiableSortedMap_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000";
        
        Object actual = unmodifiableTrie.prefixMap(string);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableSortedMap");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method prefixMap(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#prefixMap(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collections.unmodifiableSortedMap(delegate.prefixMap(key));
 *  */
    @Test
    public void testPrefixMap_ThrowClassCastException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.prefixMap(AbstractPatriciaTrie.java:830)
            org.apache.commons.collections4.trie.PatriciaTrie.prefixMap(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap(UnmodifiableTrie.java:145) */
        unmodifiableTrie.prefixMap(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#prefixMap(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collections.unmodifiableSortedMap(delegate.prefixMap(key));
 *  */
    @Test
    public void testPrefixMap_ThrowClassCastException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.prefixMap(AbstractPatriciaTrie.java:830)
            org.apache.commons.collections4.trie.PatriciaTrie.prefixMap(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap(UnmodifiableTrie.java:145)
            org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap(UnmodifiableTrie.java:145) */
        unmodifiableTrie.prefixMap(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#prefixMap(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#prefixMap(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableSortedMap(delegate.prefixMap(key));
 *  */
    @Test
    public void testPrefixMap_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap(UnmodifiableTrie.java:145) */
        unmodifiableTrie.prefixMap(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method previousKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        Object actual = unmodifiableTrie.previousKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_5() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        String key = "\u0000";
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0000";
        
        Object actual = unmodifiableTrie.previousKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 31;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 32;
        left.left = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0000";
        
        Object actual = unmodifiableTrie.previousKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 30;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 31;
        left.right = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0001";
        
        Object actual = unmodifiableTrie.previousKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_3() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 30;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 31;
        left.left = left;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "\u0000\u0000";
        
        Object actual = unmodifiableTrie.previousKey(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_7() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = 65536;
        root.left = root;
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        predecessor.bitIndex = 12304;
        predecessor.left = predecessor;
        predecessor.right = root;
        int[] key = {};
        setField(predecessor, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.predecessor = predecessor;
        String key1 = "";
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key1);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        int[] actual = ((int[]) unmodifiableTrie.previousKey(key1));
        
        assertArrayEquals(key, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_10() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -2;
        root.left = root;
        AbstractPatriciaTrie.TrieEntry right = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        right.bitIndex = -1;
        right.right = right;
        byte[] key = {};
        setField(right, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.right = right;
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        predecessor.bitIndex = -3;
        predecessor.left = root;
        predecessor.right = root;
        root.predecessor = predecessor;
        String key1 = "";
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key1);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        byte[] actual = ((byte[]) unmodifiableTrie.previousKey(key1));
        
        org.junit.Assert.assertArrayEquals(key, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_9() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -1;
        root.left = root;
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        predecessor.bitIndex = -2;
        predecessor.left = root;
        predecessor.right = root;
        root.predecessor = predecessor;
        String key = "";
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.previousKey(key);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_4() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.predecessor = root;
        String key = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.previousKey(key);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_6() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry parent = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        parent.bitIndex = -3;
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left1.bitIndex = -2;
        left1.right = left1;
        parent.left = left1;
        predecessor.parent = parent;
        left.predecessor = predecessor;
        String key = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.previousKey(key);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegate.previousKey(key);}
 *  */
    @Test
    public void testPreviousKey_ReturnDelegatePreviousKey_8() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry parent = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        parent.bitIndex = 2;
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left1.bitIndex = 2;
        parent.left = left1;
        predecessor.parent = parent;
        left.predecessor = predecessor;
        String key = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.previousKey(key);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method previousKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return delegate.previousKey(key);
 *  */
    @Test
    public void testPreviousKey_ThrowClassCastException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.String ([S and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:260)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(AbstractPatriciaTrie.java:816)
            org.apache.commons.collections4.trie.PatriciaTrie.previousKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey(UnmodifiableTrie.java:163) */
        unmodifiableTrie.previousKey(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return delegate.previousKey(key);
 *  */
    @Test
    public void testPreviousKey_ThrowClassCastException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.left = root;
        byte[] key = {};
        setField(root, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String.compareTo(String.java:140)
            org.apache.commons.collections4.trie.KeyAnalyzer.compare(KeyAnalyzer.java:145)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.compareKeys(AbstractBitwiseTrie.java:134)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:262)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(AbstractPatriciaTrie.java:816)
            org.apache.commons.collections4.trie.PatriciaTrie.previousKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey(UnmodifiableTrie.java:163) */
        unmodifiableTrie.previousKey(string);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return delegate.previousKey(key);
 *  */
    @Test
    public void testPreviousKey_ThrowStringIndexOutOfBoundsException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -2;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = -1;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isBitSet(StringKeyAnalyzer.java:118)
            org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isBitSet(StringKeyAnalyzer.java:27)
            org.apache.commons.collections4.trie.AbstractBitwiseTrie.isBitSet(AbstractBitwiseTrie.java:114)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getNearestEntryForKey(AbstractPatriciaTrie.java:467)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:261)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(AbstractPatriciaTrie.java:816)
            org.apache.commons.collections4.trie.PatriciaTrie.previousKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey(UnmodifiableTrie.java:163) */
        unmodifiableTrie.previousKey(string);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.Trie#previousKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.previousKey(key);
 *  */
    @Test
    public void testPreviousKey_ThrowNullPointerException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey(UnmodifiableTrie.java:163) */
        unmodifiableTrie.previousKey(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method previousKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return delegate.previousKey(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousKey_ThrowIllegalArgumentException() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -1;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.left = left;
        String key = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.previousKey(key);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.previousKey(key);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPreviousKey_ThrowNullPointerException_1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.previousKey(null);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableTrie}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.trie.UnmodifiableTrie#previousKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.previousKey(key);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPreviousKey_ThrowNullPointerException_2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        UnmodifiableTrie delegate = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate1 = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(delegate, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate1);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        unmodifiableTrie.previousKey(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method previousKey(java.lang.Object)
    
    @Test
    public void testPreviousKey1() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 1073741824;
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left1.bitIndex = 1;
        AbstractPatriciaTrie.TrieEntry parent = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        parent.parent = left1;
        parent.left = left1;
        left1.parent = parent;
        left1.left = left1;
        left1.predecessor = left1;
        String key = "\u0000";
        setField(left1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        left.left = left1;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        String actual = ((String) unmodifiableTrie.previousKey(key));
        
        assertEquals(key, actual);
    }
    
    @Test
    public void testPreviousKey2() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = -1073741823;
        left.parent = left;
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left1.bitIndex = -2147483646;
        Object key = createInstance("java.lang.Object");
        left1.key = key;
        left.left = left1;
        left.predecessor = left;
        String key1 = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key1);
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        String string = "";
        
        Object actual = unmodifiableTrie.previousKey(string);
        
        Object expected = new Object();
        
    }
    
    @Test
    public void testPreviousKey3() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -1073741823;
        AbstractPatriciaTrie.TrieEntry parent = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        parent.parent = parent;
        parent.left = root;
        root.parent = parent;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = -2147483646;
        left.parent = root;
        left.predecessor = left;
        String key = "";
        setField(left, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        root.left = left;
        Object key1 = createInstance("java.lang.Object");
        root.key = key1;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.previousKey(key);
        
        Object expected = new Object();
        
    }
    
    @Test
    public void testPreviousKey4() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 1073741824;
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left1.bitIndex = 16;
        AbstractPatriciaTrie.TrieEntry parent = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        parent.parent = left1;
        parent.left = left1;
        left1.parent = parent;
        AbstractPatriciaTrie.TrieEntry left2 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left2.bitIndex = 17;
        left1.left = left2;
        left1.predecessor = left1;
        String key = "\u0000";
        setField(left1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        left.left = left1;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.previousKey(key);
        
        assertNull(actual);
    }
    
    @Test
    public void testPreviousKey5() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        root.bitIndex = -2147483647;
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 1073741824;
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left1.bitIndex = 1;
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        predecessor.parent = predecessor;
        predecessor.left = root;
        left1.predecessor = predecessor;
        String key = "\u0000";
        setField(left1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        left.left = left1;
        root.left = left;
        Object key1 = createInstance("java.lang.Object");
        root.key = key1;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        Object actual = unmodifiableTrie.previousKey(key);
        
        Object expected = new Object();
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method previousKey(java.lang.Object)
    
    @Test
    public void testPreviousKey6() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry parent = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry parent1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        parent1.bitIndex = -2147483647;
        parent1.parent = root;
        parent1.predecessor = parent1;
        String key = "\u0000";
        setField(parent1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        parent.parent = parent1;
        parent.left = root;
        root.parent = parent;
        root.left = parent1;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.followRight(AbstractPatriciaTrie.java:1167)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousEntry(AbstractPatriciaTrie.java:1231)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(AbstractPatriciaTrie.java:818)
            org.apache.commons.collections4.trie.PatriciaTrie.previousKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey(UnmodifiableTrie.java:163) */
        unmodifiableTrie.previousKey(key);
    }
    
    @Test
    public void testPreviousKey7() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 1073741825;
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left1.bitIndex = 2;
        AbstractPatriciaTrie.TrieEntry predecessor = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry parent = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry parent1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        parent1.parent = predecessor;
        parent1.left = parent;
        parent.parent = parent1;
        parent.left = predecessor;
        predecessor.parent = parent;
        left1.predecessor = predecessor;
        String key = "";
        setField(left1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        left.left = left1;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        /* This test fails because method [org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.followRight(AbstractPatriciaTrie.java:1167)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousEntry(AbstractPatriciaTrie.java:1231)
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(AbstractPatriciaTrie.java:818)
            org.apache.commons.collections4.trie.PatriciaTrie.previousKey(PatriciaTrie.java:58)
            org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey(UnmodifiableTrie.java:163) */
        unmodifiableTrie.previousKey(key);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method previousKey(java.lang.Object)
    
    @Test(timeout = 1000L)
    public void testPreviousKey8() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 1073741824;
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left1.bitIndex = 1;
        left1.parent = left1;
        left1.left = left1;
        left1.predecessor = left1;
        String key = "\u0000";
        setField(left1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        left.left = left1;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        unmodifiableTrie.previousKey(key);
    }
    
    @Test(timeout = 1000L)
    public void testPreviousKey9() throws Exception  {
        UnmodifiableTrie unmodifiableTrie = ((UnmodifiableTrie) createInstance("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        PatriciaTrie delegate = ((PatriciaTrie) createInstance("org.apache.commons.collections4.trie.PatriciaTrie"));
        AbstractPatriciaTrie.TrieEntry root = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        AbstractPatriciaTrie.TrieEntry left = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left.bitIndex = 1073741824;
        AbstractPatriciaTrie.TrieEntry left1 = ((AbstractPatriciaTrie.TrieEntry) createInstance("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"));
        left1.bitIndex = 1;
        left1.parent = left1;
        left1.left = left1;
        left1.predecessor = left1;
        String key = "";
        setField(left1, "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry", "key", key);
        left.left = left1;
        root.left = left;
        setField(delegate, "org.apache.commons.collections4.trie.AbstractPatriciaTrie", "root", root);
        StringKeyAnalyzer keyAnalyzer = ((StringKeyAnalyzer) createInstance("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"));
        setField(delegate, "org.apache.commons.collections4.trie.AbstractBitwiseTrie", "keyAnalyzer", keyAnalyzer);
        setField(unmodifiableTrie, "org.apache.commons.collections4.trie.UnmodifiableTrie", "delegate", delegate);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        unmodifiableTrie.previousKey(key);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields958511384311900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields958511384311900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass958511384328600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields958511384311900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass958511384328600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields958511384793700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields958511384793700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass958511384796300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields958511384793700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass958511384796300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

