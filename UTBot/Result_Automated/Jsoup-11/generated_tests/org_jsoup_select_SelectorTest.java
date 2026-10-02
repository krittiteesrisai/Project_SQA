package org.jsoup.select;

import org.junit.Test;
import org.jsoup.parser.TokenQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.HashSet;
import org.jsoup.select.Selector.SelectorParseException;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import java.util.Collection;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyList;

public final class org_jsoup_select_SelectorTest {
    ///region Test suites for executable org.jsoup.select.Selector.matches
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches(boolean)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#matches(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test
    public void testMatches_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -8);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.matches] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.select.Selector.matches(Selector.java:297) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method matchesMethod = selectorClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = false;
        try {
            matchesMethod.invoke(selector, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#matches(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test
    public void testMatches_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "S";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -7);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.matches] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.select.Selector.matches(Selector.java:297) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method matchesMethod = selectorClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = false;
        try {
            matchesMethod.invoke(selector, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#matches(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.matches] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.matches(Selector.java:297) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method matchesMethod = selectorClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = false;
        try {
            matchesMethod.invoke(selector, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#matches(boolean)}
 * @utbot.executesCondition {@code (own): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.matches] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.matches(Selector.java:297) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method matchesMethod = selectorClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = true;
        try {
            matchesMethod.invoke(selector, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#matches(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_2() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.select.Selector.matches(Selector.java:297) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method matchesMethod = selectorClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = false;
        try {
            matchesMethod.invoke(selector, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method matches(boolean)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#matches(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMatches_ThrowIllegalStateException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -6);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method matchesMethod = selectorClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = false;
        try {
            matchesMethod.invoke(selector, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#matches(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMatches_ThrowIllegalStateException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -7);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method matchesMethod = selectorClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = false;
        try {
            matchesMethod.invoke(selector, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.contains
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(boolean)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#contains(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -9);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.contains] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.select.Selector.contains(Selector.java:288) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method containsMethod = selectorClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = false;
        try {
            containsMethod.invoke(selector, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#contains(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "S";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -8);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.contains] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.select.Selector.contains(Selector.java:288) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method containsMethod = selectorClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = false;
        try {
            containsMethod.invoke(selector, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#contains(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test
    public void testContains_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.contains] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.contains(Selector.java:288) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method containsMethod = selectorClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = false;
        try {
            containsMethod.invoke(selector, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#contains(boolean)}
 * @utbot.executesCondition {@code (own): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test
    public void testContains_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.contains] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.contains(Selector.java:288) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method containsMethod = selectorClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = true;
        try {
            containsMethod.invoke(selector, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#contains(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test
    public void testContains_ThrowNullPointerException_2() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.contains] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.select.Selector.contains(Selector.java:288) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method containsMethod = selectorClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = false;
        try {
            containsMethod.invoke(selector, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method contains(boolean)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#contains(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testContains_ThrowIllegalStateException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -8);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method containsMethod = selectorClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = false;
        try {
            containsMethod.invoke(selector, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#contains(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testContains_ThrowIllegalStateException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -8);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class booleanType = boolean.class;
        Method containsMethod = selectorClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = false;
        try {
            containsMethod.invoke(selector, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.has
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method has()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#has()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume(":has");
 *  */
    @Test
    public void testHas_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -4);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.has] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.select.Selector.has(Selector.java:279) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method hasMethod = selectorClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(selector, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#has()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume(":has");
 *  */
    @Test
    public void testHas_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "S";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.has] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.select.Selector.has(Selector.java:279) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method hasMethod = selectorClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(selector, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#has()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(":has");
 *  */
    @Test
    public void testHas_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.has] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.has(Selector.java:279) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method hasMethod = selectorClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(selector, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#has()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(":has");
 *  */
    @Test
    public void testHas_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.has] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.select.Selector.has(Selector.java:279) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method hasMethod = selectorClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(selector, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method has()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#has()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(":has");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testHas_ThrowIllegalStateException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method hasMethod = selectorClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(selector, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#has()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(":has");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testHas_ThrowIllegalStateException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "K";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method hasMethod = selectorClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(selector, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#has()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#chompBalanced(java.lang.Character,java.lang.Character)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(subQuery, ":has(el) subselect must not be empty");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHas_ThrowIllegalArgumentException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "                                :hAs";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 32);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method hasMethod = selectorClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(selector, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.filterForChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method filterForChildren(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#filterForChildren(java.util.Collection,java.util.Collection)}
 * @utbot.executesCondition {@code (CHILD: for (Element c : candidates) {
 *     for (Element p : parents) {
 *         if (c.parent() != null && c.parent().equals(p)) {
 *             children.add(c);
 *             continue CHILD;
 *         }
 *     }
 * }): False}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return children;}
 *  */
    @Test
    public void testFilterForChildren_CollectionIterator() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayList arrayList = new ArrayList();
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method filterForChildrenMethod = selectorClazz.getDeclaredMethod("filterForChildren", collectionType, collectionType);
        filterForChildrenMethod.setAccessible(true);
        java.lang.Object[] filterForChildrenMethodArguments = new java.lang.Object[2];
        filterForChildrenMethodArguments[0] = ((Object) null);
        filterForChildrenMethodArguments[1] = arrayList;
        Elements actual = ((Elements) filterForChildrenMethod.invoke(null, filterForChildrenMethodArguments));
        
        ArrayList arrayList1 = new ArrayList();
        Elements expected = new Elements(((List) arrayList1));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterForChildren(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#filterForChildren(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CHILD: for (Element c : candidates) {
 *     for (Element p : parents) {
 *         if (c.parent() != null && c.parent().equals(p)) {
 *             children.add(c);
 *             continue CHILD;
 *         }
 *     }
 * }
 *  */
    @Test
    public void testFilterForChildren_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.select.Selector.filterForChildren] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.filterForChildren(Selector.java:310) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method filterForChildrenMethod = selectorClazz.getDeclaredMethod("filterForChildren", collectionType, collectionType);
        filterForChildrenMethod.setAccessible(true);
        java.lang.Object[] filterForChildrenMethodArguments = new java.lang.Object[2];
        filterForChildrenMethodArguments[0] = ((Object) null);
        filterForChildrenMethodArguments[1] = ((Object) null);
        try {
            filterForChildrenMethod.invoke(null, filterForChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.byClass
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method byClass()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byClass()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String className = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testByClass_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.byClass] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:147)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:366)
            org.jsoup.select.Selector.byClass(Selector.java:206) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byClassMethod = selectorClazz.getDeclaredMethod("byClass");
        byClassMethod.setAccessible(true);
        java.lang.Object[] byClassMethodArguments = new java.lang.Object[0];
        try {
            byClassMethod.invoke(selector, byClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byClass()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String className = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testByClass_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.byClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.byClass(Selector.java:206) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byClassMethod = selectorClazz.getDeclaredMethod("byClass");
        byClassMethod.setAccessible(true);
        java.lang.Object[] byClassMethodArguments = new java.lang.Object[0];
        try {
            byClassMethod.invoke(selector, byClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String className = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testByClass_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -255);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.byClass] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:30)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:366)
            org.jsoup.select.Selector.byClass(Selector.java:206) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byClassMethod = selectorClazz.getDeclaredMethod("byClass");
        byClassMethod.setAccessible(true);
        java.lang.Object[] byClassMethodArguments = new java.lang.Object[0];
        try {
            byClassMethod.invoke(selector, byClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method byClass()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byClass()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByClass_ThrowIllegalArgumentException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byClassMethod = selectorClazz.getDeclaredMethod("byClass");
        byClassMethod.setAccessible(true);
        java.lang.Object[] byClassMethodArguments = new java.lang.Object[0];
        try {
            byClassMethod.invoke(selector, byClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.byTag
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method byTag()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byTag()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String tagName = tq.consumeElementSelector();
 *  */
    @Test
    public void testByTag_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.byTag] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:147)
            org.jsoup.parser.TokenQueue.consumeElementSelector(TokenQueue.java:353)
            org.jsoup.select.Selector.byTag(Selector.java:213) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byTagMethod = selectorClazz.getDeclaredMethod("byTag");
        byTagMethod.setAccessible(true);
        java.lang.Object[] byTagMethodArguments = new java.lang.Object[0];
        try {
            byTagMethod.invoke(selector, byTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeElementSelector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String tagName = tq.consumeElementSelector();
 *  */
    @Test
    public void testByTag_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.byTag] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.byTag(Selector.java:213) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byTagMethod = selectorClazz.getDeclaredMethod("byTag");
        byTagMethod.setAccessible(true);
        java.lang.Object[] byTagMethodArguments = new java.lang.Object[0];
        try {
            byTagMethod.invoke(selector, byTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byTag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String tagName = tq.consumeElementSelector();
 *  */
    @Test
    public void testByTag_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -255);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.byTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:30)
            org.jsoup.parser.TokenQueue.consumeElementSelector(TokenQueue.java:353)
            org.jsoup.select.Selector.byTag(Selector.java:213) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byTagMethod = selectorClazz.getDeclaredMethod("byTag");
        byTagMethod.setAccessible(true);
        java.lang.Object[] byTagMethodArguments = new java.lang.Object[0];
        try {
            byTagMethod.invoke(selector, byTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method byTag()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeElementSelector()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByTag_ThrowIllegalArgumentException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byTagMethod = selectorClazz.getDeclaredMethod("byTag");
        byTagMethod.setAccessible(true);
        java.lang.Object[] byTagMethodArguments = new java.lang.Object[0];
        try {
            byTagMethod.invoke(selector, byTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.addElements
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addElements(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#addElements(java.util.Collection)}
 * @utbot.invokes {@link java.util.LinkedHashSet#addAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: elements.addAll(add);
 *  */
    @Test
    public void testAddElements_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.addElements] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.addElements(Selector.java:187) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method addElementsMethod = selectorClazz.getDeclaredMethod("addElements", collectionType);
        addElementsMethod.setAccessible(true);
        java.lang.Object[] addElementsMethodArguments = new java.lang.Object[1];
        addElementsMethodArguments[0] = ((Object) null);
        try {
            addElementsMethod.invoke(selector, addElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#addElements(java.util.Collection)}
 * @utbot.invokes {@link java.util.LinkedHashSet#addAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: elements.addAll(add);
 *  */
    @Test
    public void testAddElements_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        LinkedHashSet elements = new LinkedHashSet();
        setField(selector, "org.jsoup.select.Selector", "elements", elements);
        
        /* This test fails because method [org.jsoup.select.Selector.addElements] produces [java.lang.NullPointerException]
            java.base/java.util.AbstractCollection.addAll(AbstractCollection.java:335)
            org.jsoup.select.Selector.addElements(Selector.java:187) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method addElementsMethod = selectorClazz.getDeclaredMethod("addElements", collectionType);
        addElementsMethod.setAccessible(true);
        java.lang.Object[] addElementsMethodArguments = new java.lang.Object[1];
        addElementsMethodArguments[0] = ((Object) null);
        try {
            addElementsMethod.invoke(selector, addElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.intersectElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method intersectElements(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#intersectElements(java.util.Collection)}
 * @utbot.invokes {@link java.util.LinkedHashSet#retainAll(java.util.Collection)}
 *  */
    @Test
    public void testIntersectElements_LinkedHashSetRetainAll() throws Exception  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        LinkedHashSet elements = new LinkedHashSet();
        setField(selector, "org.jsoup.select.Selector", "elements", elements);
        HashSet hashSet = new HashSet();
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class hashSetType = Class.forName("java.util.Collection");
        Method intersectElementsMethod = selectorClazz.getDeclaredMethod("intersectElements", hashSetType);
        intersectElementsMethod.setAccessible(true);
        java.lang.Object[] intersectElementsMethodArguments = new java.lang.Object[1];
        intersectElementsMethodArguments[0] = hashSet;
        intersectElementsMethod.invoke(selector, intersectElementsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method intersectElements(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#intersectElements(java.util.Collection)}
 * @utbot.invokes {@link java.util.LinkedHashSet#retainAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: elements.retainAll(intersect);
 *  */
    @Test
    public void testIntersectElements_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.intersectElements] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.intersectElements(Selector.java:191) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method intersectElementsMethod = selectorClazz.getDeclaredMethod("intersectElements", collectionType);
        intersectElementsMethod.setAccessible(true);
        java.lang.Object[] intersectElementsMethodArguments = new java.lang.Object[1];
        intersectElementsMethodArguments[0] = ((Object) null);
        try {
            intersectElementsMethod.invoke(selector, intersectElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#intersectElements(java.util.Collection)}
 * @utbot.invokes {@link java.util.LinkedHashSet#retainAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: elements.retainAll(intersect);
 *  */
    @Test
    public void testIntersectElements_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        LinkedHashSet elements = new LinkedHashSet();
        setField(selector, "org.jsoup.select.Selector", "elements", elements);
        
        /* This test fails because method [org.jsoup.select.Selector.intersectElements] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.AbstractCollection.retainAll(AbstractCollection.java:399)
            org.jsoup.select.Selector.intersectElements(Selector.java:191) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method intersectElementsMethod = selectorClazz.getDeclaredMethod("intersectElements", collectionType);
        intersectElementsMethod.setAccessible(true);
        java.lang.Object[] intersectElementsMethodArguments = new java.lang.Object[1];
        intersectElementsMethodArguments[0] = ((Object) null);
        try {
            intersectElementsMethod.invoke(selector, intersectElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.byId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method byId()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byId()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String id = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testById_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.byId] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:147)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:366)
            org.jsoup.select.Selector.byId(Selector.java:195) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byIdMethod = selectorClazz.getDeclaredMethod("byId");
        byIdMethod.setAccessible(true);
        java.lang.Object[] byIdMethodArguments = new java.lang.Object[0];
        try {
            byIdMethod.invoke(selector, byIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byId()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String id = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testById_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.byId] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.byId(Selector.java:195) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byIdMethod = selectorClazz.getDeclaredMethod("byId");
        byIdMethod.setAccessible(true);
        java.lang.Object[] byIdMethodArguments = new java.lang.Object[0];
        try {
            byIdMethod.invoke(selector, byIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String id = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testById_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -255);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.byId] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:30)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:366)
            org.jsoup.select.Selector.byId(Selector.java:195) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byIdMethod = selectorClazz.getDeclaredMethod("byId");
        byIdMethod.setAccessible(true);
        java.lang.Object[] byIdMethodArguments = new java.lang.Object[0];
        try {
            byIdMethod.invoke(selector, byIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method byId()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byId()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(id);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testById_ThrowIllegalArgumentException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byIdMethod = selectorClazz.getDeclaredMethod("byId");
        byIdMethod.setAccessible(true);
        java.lang.Object[] byIdMethodArguments = new java.lang.Object[0];
        try {
            byIdMethod.invoke(selector, byIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.byAttribute
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method byAttribute()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byAttribute()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testByAttribute_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.byAttribute] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:162)
            org.jsoup.parser.TokenQueue.chompBalanced(TokenQueue.java:275)
            org.jsoup.select.Selector.byAttribute(Selector.java:223) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byAttributeMethod = selectorClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(selector, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byAttribute()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#chompBalanced(java.lang.Character,java.lang.Character)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TokenQueue cq = new TokenQueue(tq.chompBalanced('[', ']'));
 *  */
    @Test
    public void testByAttribute_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.byAttribute] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.byAttribute(Selector.java:223) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byAttributeMethod = selectorClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(selector, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byAttribute()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testByAttribute_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.byAttribute] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:30)
            org.jsoup.parser.TokenQueue.chompBalanced(TokenQueue.java:274)
            org.jsoup.select.Selector.byAttribute(Selector.java:223) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byAttributeMethod = selectorClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(selector, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method byAttribute()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byAttribute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute_ThrowIllegalArgumentException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byAttributeMethod = selectorClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(selector, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byAttribute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute_ThrowIllegalArgumentException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ]";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byAttributeMethod = selectorClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(selector, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byAttribute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute_ThrowIllegalArgumentException_2() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byAttributeMethod = selectorClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(selector, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#byAttribute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute_ThrowIllegalArgumentException_3() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method byAttributeMethod = selectorClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(selector, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method byAttribute()
    
    @Test
    public void testByAttribute1() throws Throwable  {
        Class tokenQueueClazz = Class.forName("org.jsoup.parser.TokenQueue");
        Character prevESC = ((Character) getStaticFieldValue(tokenQueueClazz, "ESC"));
        try {
            Character esc = '\\';
            setStaticField(tokenQueueClazz, "ESC", esc);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]][\u0000";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 37);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.Selector.byAttribute] produces [java.lang.NullPointerException]
                org.jsoup.select.Selector.byAttribute(Selector.java:229) */
            Class selectorClazz = Class.forName("org.jsoup.select.Selector");
            Method byAttributeMethod = selectorClazz.getDeclaredMethod("byAttribute");
            byAttributeMethod.setAccessible(true);
            java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
            try {
                byAttributeMethod.invoke(selector, byAttributeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(TokenQueue.class, "ESC", prevESC);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.select
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String, java.lang.Iterable)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#select(java.lang.String,java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(query);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException() {
        Selector.select(((String) null), ((Iterable) null));
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#select(java.lang.String,java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(query);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException_1() {
        String string = "";
        
        Selector.select(string, ((Iterable) null));
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#select(java.lang.String,java.lang.Iterable)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(roots);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException_2() {
        String string = " ";
        
        Selector.select(string, ((Iterable) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method select(java.lang.String, java.lang.Iterable)
    
    @Test
    public void testSelect1() {
        String string = "\u0000";
        ArrayList arrayList = new ArrayList();
        
        Elements actual = Selector.select(string, arrayList);
        
        ArrayList arrayList1 = new ArrayList();
        Elements expected = new Elements(((List) arrayList1));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String, java.lang.Iterable)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSelect2() {
        String string = "\u0000";
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        Selector.select(string, hashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.select
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method select()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#select()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testSelect_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.select] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:139)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:315)
            org.jsoup.select.Selector.select(Selector.java:105) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method selectMethod = selectorClazz.getDeclaredMethod("select");
        selectMethod.setAccessible(true);
        java.lang.Object[] selectMethodArguments = new java.lang.Object[0];
        try {
            selectMethod.invoke(selector, selectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#select()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testSelect_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.select] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.select(Selector.java:105) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method selectMethod = selectorClazz.getDeclaredMethod("select");
        selectMethod.setAccessible(true);
        java.lang.Object[] selectMethodArguments = new java.lang.Object[0];
        try {
            selectMethod.invoke(selector, selectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#select()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testSelect_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.select] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:30)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:139)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:315)
            org.jsoup.select.Selector.select(Selector.java:105) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method selectMethod = selectorClazz.getDeclaredMethod("select");
        selectMethod.setAccessible(true);
        java.lang.Object[] selectMethodArguments = new java.lang.Object[0];
        try {
            selectMethod.invoke(selector, selectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method select()
    
    @Test
    public void testSelect3() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            LinkedHashSet elements = new LinkedHashSet();
            setField(selector, "org.jsoup.select.Selector", "elements", elements);
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", string);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.Selector.select] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.jsoup.parser.TokenQueue.consume(TokenQueue.java:162)
                org.jsoup.select.Selector.select(Selector.java:109) */
            Method selectMethod = selectorClazz.getDeclaredMethod("select");
            selectMethod.setAccessible(true);
            java.lang.Object[] selectMethodArguments = new java.lang.Object[0];
            try {
                selectMethod.invoke(selector, selectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    
    @Test
    public void testSelect4() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", string3);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.Selector.select] produces [java.lang.NullPointerException]
                org.jsoup.select.Selector.select(Selector.java:108) */
            Method selectMethod = selectorClazz.getDeclaredMethod("select");
            selectMethod.setAccessible(true);
            java.lang.Object[] selectMethodArguments = new java.lang.Object[0];
            try {
                selectMethod.invoke(selector, selectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select()
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect5() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \f";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 37);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method selectMethod = selectorClazz.getDeclaredMethod("select");
        selectMethod.setAccessible(true);
        java.lang.Object[] selectMethodArguments = new java.lang.Object[0];
        try {
            selectMethod.invoke(selector, selectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect6() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 23);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            Method selectMethod = selectorClazz.getDeclaredMethod("select");
            selectMethod.setAccessible(true);
            java.lang.Object[] selectMethodArguments = new java.lang.Object[0];
            try {
                selectMethod.invoke(selector, selectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect7() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            Method selectMethod = selectorClazz.getDeclaredMethod("select");
            selectMethod.setAccessible(true);
            java.lang.Object[] selectMethodArguments = new java.lang.Object[0];
            try {
                selectMethod.invoke(selector, selectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.select
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#select(java.lang.String,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Selector(query, root).select();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException1() {
        String string = "";
        
        Selector.select(string, ((Element) null));
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#select(java.lang.String,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Selector(query, root).select();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException_11() {
        String string = "!";
        
        Selector.select(string, ((Element) null));
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#select(java.lang.String,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Selector(query, root).select();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException_21() {
        Selector.select(((String) null), ((Element) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String, org.jsoup.nodes.Element)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect8() throws Exception  {
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Selector.select(string, element);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect9() throws Exception  {
        String string = "!!\u0001\u0001\u0001";
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Selector.select(string, document);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.findElements
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findElements()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#findElements()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: tq.matchChomp("#")
 *  */
    @Test
    public void testFindElements_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -254);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.findElements] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -254]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.matchChomp(TokenQueue.java:126)
            org.jsoup.select.Selector.findElements(Selector.java:155) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method findElementsMethod = selectorClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(selector, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#findElements()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: tq.matchChomp(".")
 *  */
    @Test
    public void testFindElements_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -2147483646);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.findElements] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483646]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:147)
            org.jsoup.select.Selector.findElements(Selector.java:159) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method findElementsMethod = selectorClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(selector, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#findElements()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tq.matchChomp("#")
 *  */
    @Test
    public void testFindElements_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.findElements] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.findElements(Selector.java:155) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method findElementsMethod = selectorClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(selector, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#findElements()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tq.matchChomp("#")
 *  */
    @Test
    public void testFindElements_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.findElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70)
            org.jsoup.parser.TokenQueue.matchChomp(TokenQueue.java:126)
            org.jsoup.select.Selector.findElements(Selector.java:155) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method findElementsMethod = selectorClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(selector, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findElements()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#findElements()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchesWord()}
 * @utbot.throwsException {@link org.jsoup.select.Selector$SelectorParseException} when: tq.matchesWord()
 *  */
    @Test(expected = Selector.SelectorParseException.class)
    public void testFindElements_ThrowSelectorParseException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 2);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method findElementsMethod = selectorClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(selector, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findElements()
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testFindElements1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method findElementsMethod = selectorClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(selector, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testFindElements2() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method findElementsMethod = selectorClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(selector, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindElements3() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000.\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 6);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method findElementsMethod = selectorClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(selector, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.combinator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method combinator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#combinator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testCombinator_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.combinator] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:139)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:315)
            org.jsoup.select.Selector.combinator(Selector.java:136) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class stringType = Class.forName("java.lang.String");
        Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", stringType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = ((Object) null);
        try {
            combinatorMethod.invoke(selector, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#combinator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testCombinator_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.combinator(Selector.java:136) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class stringType = Class.forName("java.lang.String");
        Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", stringType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = ((Object) null);
        try {
            combinatorMethod.invoke(selector, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#combinator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testCombinator_ThrowNullPointerException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.combinator] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:30)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:139)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:315)
            org.jsoup.select.Selector.combinator(Selector.java:136) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class stringType = Class.forName("java.lang.String");
        Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", stringType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = ((Object) null);
        try {
            combinatorMethod.invoke(selector, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#combinator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: combinator.equals(">")
 *  */
    @Test
    public void testCombinator_ThrowNullPointerException_2() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", string2);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.Selector.combinator] produces [java.lang.NullPointerException]
                org.jsoup.select.Selector.combinator(Selector.java:140) */
            Class stringType = Class.forName("java.lang.String");
            Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", stringType);
            combinatorMethod.setAccessible(true);
            java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
            combinatorMethodArguments[0] = ((Object) null);
            try {
                combinatorMethod.invoke(selector, combinatorMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#combinator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: combinator.equals(">")
 *  */
    @Test
    public void testCombinator_ThrowNullPointerException_3() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.Selector.combinator] produces [java.lang.NullPointerException]
                org.jsoup.select.Selector.combinator(Selector.java:140) */
            Class stringType = Class.forName("java.lang.String");
            Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", stringType);
            combinatorMethod.setAccessible(true);
            java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
            combinatorMethodArguments[0] = ((Object) null);
            try {
                combinatorMethod.invoke(selector, combinatorMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method combinator(java.lang.String)
    
    @Test
    public void testCombinator1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 37);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.combinator(Selector.java:140) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class stringType = Class.forName("java.lang.String");
        Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", stringType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = ((Object) null);
        try {
            combinatorMethod.invoke(selector, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCombinator2() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 34);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.Selector.combinator] produces [java.lang.NullPointerException]
                org.jsoup.select.Selector.combinator(Selector.java:140) */
            Class stringType = Class.forName("java.lang.String");
            Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", stringType);
            combinatorMethod.setAccessible(true);
            java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
            combinatorMethodArguments[0] = ((Object) null);
            try {
                combinatorMethod.invoke(selector, combinatorMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method combinator(java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testCombinator3() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "\u0000";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            Class queueType = Class.forName("java.lang.String");
            Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", queueType);
            combinatorMethod.setAccessible(true);
            java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
            combinatorMethodArguments[0] = queue;
            try {
                combinatorMethod.invoke(selector, combinatorMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCombinator4() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", string4);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            Class string4Type = Class.forName("java.lang.String");
            Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", string4Type);
            combinatorMethod.setAccessible(true);
            java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
            combinatorMethodArguments[0] = string4;
            try {
                combinatorMethod.invoke(selector, combinatorMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCombinator5() throws Throwable  {
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(selectorClazz, "combinators"));
        try {
            java.lang.String[] combinators = new java.lang.String[5];
            String string = ",";
            combinators[0] = string;
            String string1 = ">";
            combinators[1] = string1;
            String string2 = "+";
            combinators[2] = string2;
            String string3 = "~";
            combinators[3] = string3;
            String string4 = " ";
            combinators[4] = string4;
            setStaticField(selectorClazz, "combinators", combinators);
            Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = ">";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
            setField(selector, "org.jsoup.select.Selector", "tq", tq);
            
            Class queueType = Class.forName("java.lang.String");
            Method combinatorMethod = selectorClazz.getDeclaredMethod("combinator", queueType);
            combinatorMethod.setAccessible(true);
            java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
            combinatorMethodArguments[0] = queue;
            try {
                combinatorMethod.invoke(selector, combinatorMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Selector.class, "combinators", prevCombinators);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.consumeIndex
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeIndex()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#consumeIndex()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#chompTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String indexS = tq.chompTo(")").trim();
 *  */
    @Test
    public void testConsumeIndex_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.consumeIndex] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:162)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:391)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:196)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:248)
            org.jsoup.select.Selector.consumeIndex(Selector.java:272) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method consumeIndexMethod = selectorClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(selector, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#consumeIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String indexS = tq.chompTo(")").trim();
 *  */
    @Test
    public void testConsumeIndex_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.consumeIndex] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.consumeIndex(Selector.java:272) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method consumeIndexMethod = selectorClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(selector, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeIndex()
    
    @Test
    public void testConsumeIndex1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000)\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.consumeIndex] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 4, length 7]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:192)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:248)
            org.jsoup.select.Selector.consumeIndex(Selector.java:272) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method consumeIndexMethod = selectorClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(selector, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method consumeIndex()
    
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex2() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0100";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 8);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method consumeIndexMethod = selectorClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(selector, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex3() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method consumeIndexMethod = selectorClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(selector, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex4() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method consumeIndexMethod = selectorClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(selector, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex5() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 4);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method consumeIndexMethod = selectorClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(selector, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.indexLessThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexLessThan()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#indexLessThan()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return root.getElementsByIndexLessThan(consumeIndex());
 *  */
    @Test
    public void testIndexLessThan_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        Element root = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(selector, "org.jsoup.select.Selector", "root", root);
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = ")";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.indexLessThan] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:192)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:248)
            org.jsoup.select.Selector.consumeIndex(Selector.java:272)
            org.jsoup.select.Selector.indexLessThan(Selector.java:260) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexLessThanMethod = selectorClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(selector, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#indexLessThan()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIndexLessThan_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.indexLessThan] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:162)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:391)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:196)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:248)
            org.jsoup.select.Selector.consumeIndex(Selector.java:272)
            org.jsoup.select.Selector.indexLessThan(Selector.java:260) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexLessThanMethod = selectorClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(selector, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#indexLessThan()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.getElementsByIndexLessThan(consumeIndex());
 *  */
    @Test
    public void testIndexLessThan_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.indexLessThan] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.consumeIndex(Selector.java:272)
            org.jsoup.select.Selector.indexLessThan(Selector.java:260) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexLessThanMethod = selectorClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(selector, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexLessThan()
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexLessThanMethod = selectorClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(selector, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan2() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexLessThanMethod = selectorClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(selector, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan3() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0100";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexLessThanMethod = selectorClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(selector, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan4() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 9);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexLessThanMethod = selectorClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(selector, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.indexGreaterThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexGreaterThan()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#indexGreaterThan()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return root.getElementsByIndexGreaterThan(consumeIndex());
 *  */
    @Test
    public void testIndexGreaterThan_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        Element root = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(selector, "org.jsoup.select.Selector", "root", root);
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = ")";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.indexGreaterThan] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:192)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:248)
            org.jsoup.select.Selector.consumeIndex(Selector.java:272)
            org.jsoup.select.Selector.indexGreaterThan(Selector.java:264) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexGreaterThanMethod = selectorClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(selector, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#indexGreaterThan()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIndexGreaterThan_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.indexGreaterThan] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:162)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:391)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:196)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:248)
            org.jsoup.select.Selector.consumeIndex(Selector.java:272)
            org.jsoup.select.Selector.indexGreaterThan(Selector.java:264) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexGreaterThanMethod = selectorClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(selector, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#indexGreaterThan()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.getElementsByIndexGreaterThan(consumeIndex());
 *  */
    @Test
    public void testIndexGreaterThan_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.indexGreaterThan] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.consumeIndex(Selector.java:272)
            org.jsoup.select.Selector.indexGreaterThan(Selector.java:264) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexGreaterThanMethod = selectorClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(selector, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexGreaterThan()
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexGreaterThanMethod = selectorClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(selector, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan2() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexGreaterThanMethod = selectorClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(selector, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan3() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0100";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 8);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexGreaterThanMethod = selectorClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(selector, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan4() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 9);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexGreaterThanMethod = selectorClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(selector, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.indexEquals
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexEquals()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#indexEquals()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return root.getElementsByIndexEquals(consumeIndex());
 *  */
    @Test
    public void testIndexEquals_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        Element root = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(selector, "org.jsoup.select.Selector", "root", root);
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = ")";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.indexEquals] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:192)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:248)
            org.jsoup.select.Selector.consumeIndex(Selector.java:272)
            org.jsoup.select.Selector.indexEquals(Selector.java:268) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexEqualsMethod = selectorClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(selector, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#indexEquals()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIndexEquals_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(selector, "org.jsoup.select.Selector", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.Selector.indexEquals] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:162)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:391)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:196)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:248)
            org.jsoup.select.Selector.consumeIndex(Selector.java:272)
            org.jsoup.select.Selector.indexEquals(Selector.java:268) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexEqualsMethod = selectorClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(selector, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#indexEquals()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.getElementsByIndexEquals(consumeIndex());
 *  */
    @Test
    public void testIndexEquals_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.indexEquals] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.consumeIndex(Selector.java:272)
            org.jsoup.select.Selector.indexEquals(Selector.java:268) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method indexEqualsMethod = selectorClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(selector, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.allElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method allElements()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#allElements()}
 * @utbot.returnsFrom {@code return root.getAllElements();}
 *  */
    @Test
    public void testAllElements_ReturnRootGetAllElements() throws Exception  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        Document root = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(root, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(selector, "org.jsoup.select.Selector", "root", root);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method allElementsMethod = selectorClazz.getDeclaredMethod("allElements");
        allElementsMethod.setAccessible(true);
        java.lang.Object[] allElementsMethodArguments = new java.lang.Object[0];
        Elements actual = ((Elements) allElementsMethod.invoke(selector, allElementsMethodArguments));
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(root);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#allElements()}
 * @utbot.returnsFrom {@code return root.getAllElements();}
 *  */
    @Test
    public void testAllElements_ReturnRootGetAllElements_2() throws Exception  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        Element root = ((Element) createInstance("org.jsoup.nodes.Element"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(root, "org.jsoup.nodes.Node", "parentNode", parentNode);
        ArrayList childNodes1 = new ArrayList();
        setField(root, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        setField(selector, "org.jsoup.select.Selector", "root", root);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method allElementsMethod = selectorClazz.getDeclaredMethod("allElements");
        allElementsMethod.setAccessible(true);
        java.lang.Object[] allElementsMethodArguments = new java.lang.Object[0];
        Elements actual = ((Elements) allElementsMethod.invoke(selector, allElementsMethodArguments));
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(root);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#allElements()}
 * @utbot.returnsFrom {@code return root.getAllElements();}
 *  */
    @Test
    public void testAllElements_ReturnRootGetAllElements_1() throws Exception  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        Document root = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(root, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(selector, "org.jsoup.select.Selector", "root", root);
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method allElementsMethod = selectorClazz.getDeclaredMethod("allElements");
        allElementsMethod.setAccessible(true);
        java.lang.Object[] allElementsMethodArguments = new java.lang.Object[0];
        Elements actual = ((Elements) allElementsMethod.invoke(selector, allElementsMethodArguments));
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(root);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allElements()
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#allElements()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#getAllElements()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.getAllElements();
 *  */
    @Test
    public void testAllElements_ThrowNullPointerException() throws Throwable  {
        Selector selector = ((Selector) createInstance("org.jsoup.select.Selector"));
        
        /* This test fails because method [org.jsoup.select.Selector.allElements] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.allElements(Selector.java:255) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Method allElementsMethod = selectorClazz.getDeclaredMethod("allElements");
        allElementsMethod.setAccessible(true);
        java.lang.Object[] allElementsMethodArguments = new java.lang.Object[0];
        try {
            allElementsMethod.invoke(selector, allElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.filterForSelf
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterForSelf(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#filterForSelf(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CHILD: for (Element c : candidates) {
 *     for (Element p : parents) {
 *         if (c.equals(p)) {
 *             children.add(c);
 *             continue CHILD;
 *         }
 *     }
 * }
 *  */
    @Test
    public void testFilterForSelf_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.select.Selector.filterForSelf] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.filterForSelf(Selector.java:387) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method filterForSelfMethod = selectorClazz.getDeclaredMethod("filterForSelf", collectionType, collectionType);
        filterForSelfMethod.setAccessible(true);
        java.lang.Object[] filterForSelfMethodArguments = new java.lang.Object[2];
        filterForSelfMethodArguments[0] = ((Object) null);
        filterForSelfMethodArguments[1] = ((Object) null);
        try {
            filterForSelfMethod.invoke(null, filterForSelfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.filterForDescendants
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterForDescendants(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#filterForDescendants(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CHILD: for (Element c : candidates) {
 *     for (Element p : parents) {
 *         if (c.equals(p)) {
 *             continue CHILD;
 *         }
 *     }
 *     children.add(c);
 * }
 *  */
    @Test
    public void testFilterForDescendants_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.select.Selector.filterForDescendants] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.filterForDescendants(Selector.java:325) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method filterForDescendantsMethod = selectorClazz.getDeclaredMethod("filterForDescendants", collectionType, collectionType);
        filterForDescendantsMethod.setAccessible(true);
        java.lang.Object[] filterForDescendantsMethodArguments = new java.lang.Object[2];
        filterForDescendantsMethodArguments[0] = ((Object) null);
        filterForDescendantsMethodArguments[1] = ((Object) null);
        try {
            filterForDescendantsMethod.invoke(null, filterForDescendantsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.filterForGeneralSiblings
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterForGeneralSiblings(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#filterForGeneralSiblings(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SIBLING: for (Element c : candidates) {
 *     for (Element e : elements) {
 *         if (!e.parent().equals(c.parent()))
 *             continue;
 *         int ePos = e.elementSiblingIndex();
 *         int cPos = c.elementSiblingIndex();
 *         if (cPos > ePos) {
 *             output.add(c);
 *             continue SIBLING;
 *         }
 *     }
 * }
 *  */
    @Test
    public void testFilterForGeneralSiblings_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.select.Selector.filterForGeneralSiblings] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.filterForGeneralSiblings(Selector.java:369) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method filterForGeneralSiblingsMethod = selectorClazz.getDeclaredMethod("filterForGeneralSiblings", collectionType, collectionType);
        filterForGeneralSiblingsMethod.setAccessible(true);
        java.lang.Object[] filterForGeneralSiblingsMethodArguments = new java.lang.Object[2];
        filterForGeneralSiblingsMethodArguments[0] = ((Object) null);
        filterForGeneralSiblingsMethodArguments[1] = ((Object) null);
        try {
            filterForGeneralSiblingsMethod.invoke(null, filterForGeneralSiblingsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.filterForParentsOfDescendants
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterForParentsOfDescendants(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#filterForParentsOfDescendants(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element p: parents)
 *  */
    @Test
    public void testFilterForParentsOfDescendants_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.select.Selector.filterForParentsOfDescendants] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.filterForParentsOfDescendants(Selector.java:339) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method filterForParentsOfDescendantsMethod = selectorClazz.getDeclaredMethod("filterForParentsOfDescendants", collectionType, collectionType);
        filterForParentsOfDescendantsMethod.setAccessible(true);
        java.lang.Object[] filterForParentsOfDescendantsMethodArguments = new java.lang.Object[2];
        filterForParentsOfDescendantsMethodArguments[0] = ((Object) null);
        filterForParentsOfDescendantsMethodArguments[1] = ((Object) null);
        try {
            filterForParentsOfDescendantsMethod.invoke(null, filterForParentsOfDescendantsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method filterForParentsOfDescendants(java.util.Collection, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.select.Selector}
     * @utbot.methodUnderTest {@link org.jsoup.select.Selector#filterForParentsOfDescendants(java.util.Collection,java.util.Collection)}
     */
    @Test
    public void testFilterForParentsOfDescendants() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Collection collection = emptyList();
        
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method filterForParentsOfDescendantsMethod = selectorClazz.getDeclaredMethod("filterForParentsOfDescendants", collectionType, collectionType);
        filterForParentsOfDescendantsMethod.setAccessible(true);
        java.lang.Object[] filterForParentsOfDescendantsMethodArguments = new java.lang.Object[2];
        filterForParentsOfDescendantsMethodArguments[0] = collection;
        filterForParentsOfDescendantsMethodArguments[1] = ((Object) null);
        Elements actual = ((Elements) filterForParentsOfDescendantsMethod.invoke(null, filterForParentsOfDescendantsMethodArguments));
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method filterForParentsOfDescendants(java.util.Collection, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.select.Selector}
     * @utbot.methodUnderTest {@link org.jsoup.select.Selector#filterForParentsOfDescendants(java.util.Collection,java.util.Collection)}
     */
    @Test
    public void testFilterForParentsOfDescendantsThrowsNPE() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.jsoup.select.Selector.filterForParentsOfDescendants] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.filterForParentsOfDescendants(Selector.java:340) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class arrayListType = Class.forName("java.util.Collection");
        Method filterForParentsOfDescendantsMethod = selectorClazz.getDeclaredMethod("filterForParentsOfDescendants", arrayListType, arrayListType);
        filterForParentsOfDescendantsMethod.setAccessible(true);
        java.lang.Object[] filterForParentsOfDescendantsMethodArguments = new java.lang.Object[2];
        filterForParentsOfDescendantsMethodArguments[0] = arrayList;
        filterForParentsOfDescendantsMethodArguments[1] = ((Object) null);
        try {
            filterForParentsOfDescendantsMethod.invoke(null, filterForParentsOfDescendantsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Selector.filterForAdjacentSiblings
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterForAdjacentSiblings(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Selector}
 * @utbot.methodUnderTest {@link org.jsoup.select.Selector#filterForAdjacentSiblings(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SIBLING: for (Element c : candidates) {
 *     for (Element e : elements) {
 *         if (!e.parent().equals(c.parent()))
 *             continue;
 *         Element previousSib = c.previousElementSibling();
 *         if (previousSib != null && previousSib.equals(e)) {
 *             siblings.add(c);
 *             continue SIBLING;
 *         }
 *     }
 * }
 *  */
    @Test
    public void testFilterForAdjacentSiblings_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.select.Selector.filterForAdjacentSiblings] produces [java.lang.NullPointerException]
            org.jsoup.select.Selector.filterForAdjacentSiblings(Selector.java:352) */
        Class selectorClazz = Class.forName("org.jsoup.select.Selector");
        Class collectionType = Class.forName("java.util.Collection");
        Method filterForAdjacentSiblingsMethod = selectorClazz.getDeclaredMethod("filterForAdjacentSiblings", collectionType, collectionType);
        filterForAdjacentSiblingsMethod.setAccessible(true);
        java.lang.Object[] filterForAdjacentSiblingsMethodArguments = new java.lang.Object[2];
        filterForAdjacentSiblingsMethodArguments[0] = ((Object) null);
        filterForAdjacentSiblingsMethodArguments[1] = ((Object) null);
        try {
            filterForAdjacentSiblingsMethod.invoke(null, filterForAdjacentSiblingsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields993980411065500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields993980411065500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass993980411074000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields993980411065500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass993980411074000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields993980414453600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields993980414453600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass993980414455700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields993980414453600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass993980414455700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields993980415046100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields993980415046100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass993980415048000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields993980415046100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass993980415048000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

