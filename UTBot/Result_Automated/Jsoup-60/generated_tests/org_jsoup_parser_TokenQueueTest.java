package org.jsoup.parser;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_jsoup_parser_TokenQueueTest {
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consumeCssIdentifier
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeCssIdentifier()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return queue.substring(start, pos);}
 *  */
    @Test
    public void testConsumeCssIdentifier_NotIsEmptyAndMatchesWordOrMatchesAny() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.consumeCssIdentifier();
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeCssIdentifier()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty() && (matchesWord() || matchesAny('-', '_')))} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(!isEmpty() && (matchesWord() || matchesAny('-', '_')))
 *  */
    @Test
    public void testConsumeCssIdentifier_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeCssIdentifier] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:369) */
        tokenQueue.consumeCssIdentifier();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!isEmpty() && (matchesWord() || matchesAny('-', '_')))
 *  */
    @Test
    public void testConsumeCssIdentifier_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeCssIdentifier] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:369) */
        tokenQueue.consumeCssIdentifier();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeCssIdentifier()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
     */
    @Test
    public void testConsumeCssIdentifier() {
        TokenQueue tokenQueue = new TokenQueue("ab");
        
        String actual = tokenQueue.consumeCssIdentifier();
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consumeAttributeKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeAttributeKey()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeAttributeKey()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return queue.substring(start, pos);}
 *  */
    @Test
    public void testConsumeAttributeKey_NotIsEmptyAndMatchesWordOrMatchesAny() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.consumeAttributeKey();
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeAttributeKey()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeAttributeKey()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty() && (matchesWord() || matchesAny('-', '_', ':')))} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(!isEmpty() && (matchesWord() || matchesAny('-', '_', ':')))
 *  */
    @Test
    public void testConsumeAttributeKey_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeAttributeKey] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.parser.TokenQueue.consumeAttributeKey(TokenQueue.java:381) */
        tokenQueue.consumeAttributeKey();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeAttributeKey()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!isEmpty() && (matchesWord() || matchesAny('-', '_', ':')))
 *  */
    @Test
    public void testConsumeAttributeKey_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeAttributeKey] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeAttributeKey(TokenQueue.java:381) */
        tokenQueue.consumeAttributeKey();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeAttributeKey()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeAttributeKey()}
     */
    @Test
    public void testConsumeAttributeKey() {
        TokenQueue tokenQueue = new TokenQueue("ab");
        
        String actual = tokenQueue.consumeAttributeKey();
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consumeToIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link java.lang.String#toLowerCase()}
 * @utbot.invokes {@link java.lang.String#toUpperCase()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return queue.substring(start, pos);}
 *  */
    @Test
    public void testConsumeToIgnoreCase_StringSubstring() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        String string = "{";
        
        String actual = tokenQueue.consumeToIgnoreCase(string);
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String first = seq.substring(0, 1);
 *  */
    @Test
    public void testConsumeToIgnoreCase_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeToIgnoreCase] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end 1, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeToIgnoreCase(TokenQueue.java:193) */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String first = seq.substring(0, 1);
 *  */
    @Test
    public void testConsumeToIgnoreCase_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeToIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.consumeToIgnoreCase(TokenQueue.java:193) */
        tokenQueue.consumeToIgnoreCase(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#toLowerCase()}
 * @utbot.invokes {@link java.lang.String#toUpperCase()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!isEmpty())
 *  */
    @Test
    public void testConsumeToIgnoreCase_ThrowNullPointerException_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        String string = "k";
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeToIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeToIgnoreCase(TokenQueue.java:195) */
        tokenQueue.consumeToIgnoreCase(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method consumeToIgnoreCase(java.lang.String)
    
    @Test
    public void testConsumeToIgnoreCase1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "{\u0000\u0000\u0000\u0004{\u0000\u0000\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 4);
        
        String actual = tokenQueue.consumeToIgnoreCase(queue);
        
        String expected = "\u0004{\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(9, finalTokenQueuePos);
    }
    
    @Test
    public void testConsumeToIgnoreCase2() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "D\u0000\u0000\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.consumeToIgnoreCase(queue);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testConsumeToIgnoreCase3() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0400\u0400\u0400\u0400\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 4);
        
        String actual = tokenQueue.consumeToIgnoreCase(queue);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(5, finalTokenQueuePos);
    }
    
    @Test
    public void testConsumeToIgnoreCase4() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "kkkkkkkk\u0000kkkkkkkkkkkkkkkk";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 8);
        String string = "k";
        
        String actual = tokenQueue.consumeToIgnoreCase(string);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(9, finalTokenQueuePos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeToIgnoreCase(java.lang.String)
    
    @Test
    public void testConsumeToIgnoreCase5() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "{\u0000\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        String string = "{\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeToIgnoreCase] produces [java.lang.StringIndexOutOfBoundsException: begin -3, end 3, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeToIgnoreCase(TokenQueue.java:212) */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test
    public void testConsumeToIgnoreCase6() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "A       ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeToIgnoreCase] produces [java.lang.StringIndexOutOfBoundsException: begin -3, end 0, length 8]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeToIgnoreCase(TokenQueue.java:212) */
        tokenQueue.consumeToIgnoreCase(queue);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method consumeToIgnoreCase(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase7() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 3);
        String string = "k";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase8() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        String string = "K";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase9() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        String string = "A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase10() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        String string = "k";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase11() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase12() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "k";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 3);
        String string = "k";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase13() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "k";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase14() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "K";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase15() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "K";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 3);
        String string = "K";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase16() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "K";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testConsumeToIgnoreCase17() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.consumeToIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consumeElementSelector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeElementSelector()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeElementSelector()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return queue.substring(start, pos);}
 *  */
    @Test
    public void testConsumeElementSelector_NotIsEmptyAndMatchesWordOrMatchesAny() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.consumeElementSelector();
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeElementSelector()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeElementSelector()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty() && (matchesWord() || matchesAny("*|", "|", "_", "-")))} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(!isEmpty() && (matchesWord() || matchesAny("*|", "|", "_", "-")))
 *  */
    @Test
    public void testConsumeElementSelector_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeElementSelector] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.parser.TokenQueue.consumeElementSelector(TokenQueue.java:356) */
        tokenQueue.consumeElementSelector();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeElementSelector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!isEmpty() && (matchesWord() || matchesAny("*|", "|", "_", "-")))
 *  */
    @Test
    public void testConsumeElementSelector_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeElementSelector] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeElementSelector(TokenQueue.java:356) */
        tokenQueue.consumeElementSelector();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeElementSelector()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeElementSelector()}
     */
    @Test
    public void testConsumeElementSelector() {
        TokenQueue tokenQueue = new TokenQueue("#$\\\"");
        
        String actual = tokenQueue.consumeElementSelector();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.matchesCS
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesCS(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesCS(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String,int)}
 * @utbot.returnsFrom {@code return queue.startsWith(seq, pos);}
 *  */
    @Test
    public void testMatchesCS_StringStartsWith() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -1);
        
        boolean actual = tokenQueue.matchesCS(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesCS(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesCS(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return queue.startsWith(seq, pos);
 *  */
    @Test
    public void testMatchesCS_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesCS] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matchesCS(TokenQueue.java:79) */
        tokenQueue.matchesCS(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.chompToIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method chompToIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompToIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeToIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testChompToIgnoreCase_TokenQueueMatchChomp() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        String string = "`";
        
        String actual = tokenQueue.chompToIgnoreCase(string);
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chompToIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompToIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String data = consumeToIgnoreCase(seq);
 *  */
    @Test
    public void testChompToIgnoreCase_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.chompToIgnoreCase] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end 1, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeToIgnoreCase(TokenQueue.java:193)
            org.jsoup.parser.TokenQueue.chompToIgnoreCase(TokenQueue.java:246) */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompToIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = consumeToIgnoreCase(seq);
 *  */
    @Test
    public void testChompToIgnoreCase_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        String string = "{ ";
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.chompToIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeToIgnoreCase(TokenQueue.java:195)
            org.jsoup.parser.TokenQueue.chompToIgnoreCase(TokenQueue.java:246) */
        tokenQueue.chompToIgnoreCase(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method chompToIgnoreCase(java.lang.String)
    
    @Test
    public void testChompToIgnoreCase1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000[\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 8);
        String string = "\u0000";
        
        String actual = tokenQueue.chompToIgnoreCase(string);
        
        String expected = "[";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(10, finalTokenQueuePos);
    }
    
    @Test
    public void testChompToIgnoreCase2() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "{\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u4000{\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 8);
        
        String actual = tokenQueue.chompToIgnoreCase(queue);
        
        String expected = "\u4000{\u0000";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(11, finalTokenQueuePos);
    }
    
    @Test
    public void testChompToIgnoreCase3() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        String string = "D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        String actual = tokenQueue.chompToIgnoreCase(string);
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(33, finalTokenQueuePos);
    }
    
    @Test
    public void testChompToIgnoreCase4() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u013B\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.chompToIgnoreCase(queue);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method chompToIgnoreCase(java.lang.String)
    
    @Test
    public void testChompToIgnoreCase5() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "`";
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.chompToIgnoreCase] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 3, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeToIgnoreCase(TokenQueue.java:212)
            org.jsoup.parser.TokenQueue.chompToIgnoreCase(TokenQueue.java:246) */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test
    public void testChompToIgnoreCase6() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[\u0000\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -4099);
        String string = "[";
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.chompToIgnoreCase] produces [java.lang.StringIndexOutOfBoundsException: begin -4099, end 0, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeToIgnoreCase(TokenQueue.java:212)
            org.jsoup.parser.TokenQueue.chompToIgnoreCase(TokenQueue.java:246) */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test
    public void testChompToIgnoreCase7() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.chompToIgnoreCase] produces [java.lang.NullPointerException] */
        tokenQueue.chompToIgnoreCase(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method chompToIgnoreCase(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase8() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -2139095040);
        String string = "K";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase9() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        String string = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase10() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        String string = "A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase11() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "k";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase12() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase13() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase14() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 3);
        String string = "k";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase15() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 3);
        String string = "K";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase16() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase17() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "K";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    
    @Test(timeout = 1000L)
    public void testChompToIgnoreCase18() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        String string = "k";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenQueue.chompToIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.matchesAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesAny([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(java.lang.String[])}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesAny_ReturnFalse() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        java.lang.String[] stringArray = {};
        
        boolean actual = tokenQueue.matchesAny(stringArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String s: seq)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesAny_NotMatches() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = queue;
        
        boolean actual = tokenQueue.matchesAny(stringArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String s: seq)} once
 *  */
    @Test
    public void testMatchesAny_Matches() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = queue;
        
        boolean actual = tokenQueue.matchesAny(stringArray);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesAny([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String s: seq)
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matchesAny(TokenQueue.java:89) */
        tokenQueue.matchesAny(((java.lang.String[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchesAny([Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(java.lang.String[])}
     */
    @Test
    public void testMatchesAnyReturnsFalseWithNonEmptyObjectArray() {
        TokenQueue tokenQueue = new TokenQueue("abc");
        java.lang.String[] stringArray = {"-3", "-3", "-3"};
        
        boolean actual = tokenQueue.matchesAny(stringArray);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(java.lang.String[])}
     */
    @Test
    public void testMatchesAnyReturnsTrueWithNonEmptyObjectArray() {
        TokenQueue tokenQueue = new TokenQueue("-3");
        java.lang.String[] stringArray = {"abc", "-3", "10", ""};
        
        boolean actual = tokenQueue.matchesAny(stringArray);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.matchesAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesAny([C)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.iterates iterate the loop {@code for(char c: seq)} once
 *  */
    @Test
    public void testMatchesAny_QueueCharAtNotEqualsC() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        char[] charArray = {'!'};
        
        boolean actual = tokenQueue.matchesAny(charArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): False}
 *  */
    @Test
    public void testMatchesAny_NotIsEmpty() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 2);
        char[] charArray = {};
        
        boolean actual = tokenQueue.matchesAny(charArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.iterates iterate the loop {@code for(char c: seq)} once
 *  */
    @Test
    public void testMatchesAny_QueueCharAtEqualsC() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        char[] charArray = {' '};
        
        boolean actual = tokenQueue.matchesAny(charArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): True}
 *  */
    @Test
    public void testMatchesAny_IsEmpty() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.matchesAny(((char[]) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesAny([C)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.iterates iterate the loop {@code for(char c: seq)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: queue.charAt(pos) == c
 *  */
    @Test
    public void testMatchesAny_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        char[] charArray = {' '};
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesAny] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesAny(TokenQueue.java:101) */
        tokenQueue.matchesAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isEmpty()
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.matchesAny(TokenQueue.java:97) */
        tokenQueue.matchesAny(((char[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(char c: seq)
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matchesAny(TokenQueue.java:100) */
        tokenQueue.matchesAny(((char[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.matchChomp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchChomp(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.executesCondition {@code (matches(seq)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchChomp_NotMatches() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.matchChomp(queue);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.executesCondition {@code (matches(seq)): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchChomp_Matches() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.matchChomp(queue);
        
        assertTrue(actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(1, finalTokenQueuePos);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consumeWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method consumeWhitespace()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.iterates iterate the loop {@code while(matchesWhitespace())} once
 * @utbot.returnsFrom {@code return seen;}
 *  */
    @Test
    public void testConsumeWhitespace_IterateWhileLoop() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " !";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.consumeWhitespace();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.iterates iterate the loop {@code while(matchesWhitespace())} once
 * @utbot.returnsFrom {@code return seen;}
 *  */
    @Test
    public void testConsumeWhitespace_IterateWhileLoop_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.consumeWhitespace();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method consumeWhitespace()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.String#charAt(int)} twice,
    ///     {@link org.utbot.engine.overrides.strings.UtString#preconditionCheck()} twice,
    ///     {@link org.utbot.engine.overrides.strings.UtString#charAtImpl(int)} once,
    ///     {@link org.jsoup.helper.StringUtil#isWhitespace(int)} twice
    /// execute conditions:
    ///     {@code (null): True},
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.iterates iterate the loop {@code while(matchesWhitespace())} twice
 * @utbot.returnsFrom {@code return seen;}
 *  */
    @Test
    public void testConsumeWhitespace_IterateWhileLoop_2() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\f";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.consumeWhitespace();
        
        assertTrue(actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(1, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.iterates iterate the loop {@code while(matchesWhitespace())} twice
 * @utbot.returnsFrom {@code return seen;}
 *  */
    @Test
    public void testConsumeWhitespace_IterateWhileLoop_3() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\n";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.consumeWhitespace();
        
        assertTrue(actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(1, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.iterates iterate the loop {@code while(matchesWhitespace())} twice
 * @utbot.returnsFrom {@code return seen;}
 *  */
    @Test
    public void testConsumeWhitespace_IterateWhileLoop_4() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\r";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.consumeWhitespace();
        
        assertTrue(actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(1, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.iterates iterate the loop {@code while(matchesWhitespace())} twice
 * @utbot.returnsFrom {@code return seen;}
 *  */
    @Test
    public void testConsumeWhitespace_IterateWhileLoop_5() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\t";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.consumeWhitespace();
        
        assertTrue(actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(1, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.iterates iterate the loop {@code while(matchesWhitespace())} twice
 * @utbot.returnsFrom {@code return seen;}
 *  */
    @Test
    public void testConsumeWhitespace_IterateWhileLoop_6() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.consumeWhitespace();
        
        assertTrue(actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeWhitespace()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(matchesWhitespace())
 *  */
    @Test
    public void testConsumeWhitespace_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeWhitespace] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:132)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:318) */
        tokenQueue.consumeWhitespace();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(matchesWhitespace())
 *  */
    @Test
    public void testConsumeWhitespace_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:132)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:318) */
        tokenQueue.consumeWhitespace();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.chompTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method chompTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompTo(java.lang.String)}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testChompTo_ReturnData() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        String actual = tokenQueue.chompTo(queue);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompTo(java.lang.String)}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testChompTo_ReturnData_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        String string = "";
        
        String actual = tokenQueue.chompTo(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chompTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String data = consumeTo(seq);
 *  */
    @Test
    public void testChompTo_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.chompTo] produces [java.lang.StringIndexOutOfBoundsException: begin 1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240) */
        tokenQueue.chompTo(queue);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String data = consumeTo(seq);
 *  */
    @Test
    public void testChompTo_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", Integer.MAX_VALUE);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.chompTo] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end 2, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:392)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240) */
        tokenQueue.chompTo(queue);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.matchesWord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesWord()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWord()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#isEmpty()}
 * @utbot.returnsFrom {@code return !isEmpty() && Character.isLetterOrDigit(queue.charAt(pos));}
 *  */
    @Test
    public void testMatchesWord_NotIsEmptyAndCharacterIsLetterOrDigit() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.matchesWord();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesWord()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWord()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return !isEmpty() && Character.isLetterOrDigit(queue.charAt(pos));
 *  */
    @Test
    public void testMatchesWord_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesWord] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140) */
        tokenQueue.matchesWord();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWord()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && Character.isLetterOrDigit(queue.charAt(pos));
 *  */
    @Test
    public void testMatchesWord_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesWord] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140) */
        tokenQueue.matchesWord();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchesWord()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWord()}
     */
    @Test
    public void testMatchesWordReturnsTrue() {
        TokenQueue tokenQueue = new TokenQueue("ab");
        
        boolean actual = tokenQueue.matchesWord();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consumeTagName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeTagName()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeTagName()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return queue.substring(start, pos);}
 *  */
    @Test
    public void testConsumeTagName_NotIsEmptyAndMatchesWordOrMatchesAny() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.consumeTagName();
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTagName()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty() && (matchesWord() || matchesAny(':', '_', '-')))} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(!isEmpty() && (matchesWord() || matchesAny(':', '_', '-')))
 *  */
    @Test
    public void testConsumeTagName_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeTagName] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.parser.TokenQueue.consumeTagName(TokenQueue.java:343) */
        tokenQueue.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeTagName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!isEmpty() && (matchesWord() || matchesAny(':', '_', '-')))
 *  */
    @Test
    public void testConsumeTagName_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeTagName] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeTagName(TokenQueue.java:343) */
        tokenQueue.consumeTagName();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeTagName()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeTagName()}
     */
    @Test
    public void testConsumeTagName() {
        TokenQueue tokenQueue = new TokenQueue("ab");
        
        String actual = tokenQueue.consumeTagName();
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.matchesStartTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesStartTag()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesStartTag()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return (remainingLength() >= 2 && queue.charAt(pos) == '<' && Character.isLetter(queue.charAt(pos + 1)));}
 *  */
    @Test
    public void testMatchesStartTag_RemainingLengthLessThan2AndQueueCharAtNotEqualsCharAndCharacterIsLetter() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.matchesStartTag();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesStartTag()}
 * @utbot.returnsFrom {@code return (remainingLength() >= 2 && queue.charAt(pos) == '<' && Character.isLetter(queue.charAt(pos + 1)));}
 *  */
    @Test
    public void testMatchesStartTag_RemainingLengthLessThan2AndQueueCharAtNotEqualsCharAndCharacterIsLetter_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.matchesStartTag();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesStartTag()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesStartTag()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return (remainingLength() >= 2 && queue.charAt(pos) == '<' && Character.isLetter(queue.charAt(pos + 1)));
 *  */
    @Test
    public void testMatchesStartTag_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -2);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesStartTag] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesStartTag(TokenQueue.java:109) */
        tokenQueue.matchesStartTag();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesStartTag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (remainingLength() >= 2 && queue.charAt(pos) == '<' && Character.isLetter(queue.charAt(pos + 1)));
 *  */
    @Test
    public void testMatchesStartTag_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.matchesStartTag(TokenQueue.java:109) */
        tokenQueue.matchesStartTag();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consumeTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeTo(java.lang.String)}
 * @utbot.executesCondition {@code (offset != -1): False}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#remainder()}
 * @utbot.returnsFrom {@code return remainder();}
 *  */
    @Test
    public void testConsumeTo_OffsetEqualsNegative1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        String actual = tokenQueue.consumeTo(queue);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeTo(java.lang.String)}
 * @utbot.executesCondition {@code (offset != -1): True}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_OffsetNotEqualsNegative1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.consumeTo(queue);
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeTo(java.lang.String)}
 * @utbot.executesCondition {@code (offset != -1): True}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String consumed = queue.substring(pos, offset);
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: begin 1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183) */
        tokenQueue.consumeTo(queue);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeTo(java.lang.String)}
 * @utbot.executesCondition {@code (offset != -1): False}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#remainder()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return remainder();
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 124);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: begin 124, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:392)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187) */
        tokenQueue.consumeTo(queue);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeTo(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int offset = queue.indexOf(seq, pos);
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:181) */
        tokenQueue.consumeTo(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.matchesWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method matchesWhitespace()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWhitespace()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link org.jsoup.helper.StringUtil#isWhitespace(int)}
 * @utbot.returnsFrom {@code return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));}
 *  */
    @Test
    public void testMatchesWhitespace_StringUtilIsWhitespace() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " !";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.matchesWhitespace();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWhitespace()}
 * @utbot.returnsFrom {@code return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));}
 *  */
    @Test
    public void testMatchesWhitespace_ReturnNotIsEmptyAndStringUtilIsWhitespace() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.matchesWhitespace();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method matchesWhitespace()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// invoke:
    ///     {@link java.lang.String#charAt(int)} twice,
    ///     {@link org.utbot.engine.overrides.strings.UtString#preconditionCheck()} twice,
    ///     {@link org.utbot.engine.overrides.strings.UtString#charAtImpl(int)} once,
    ///     {@link org.jsoup.helper.StringUtil#isWhitespace(int)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWhitespace()}
 * @utbot.returnsFrom {@code return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));}
 *  */
    @Test
    public void testMatchesWhitespace_ReturnNotIsEmptyAndStringUtilIsWhitespace_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\n\u0000                                   ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.matchesWhitespace();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWhitespace()}
 * @utbot.returnsFrom {@code return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));}
 *  */
    @Test
    public void testMatchesWhitespace_ReturnNotIsEmptyAndStringUtilIsWhitespace_2() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\f\u0000                                   ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.matchesWhitespace();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWhitespace()}
 * @utbot.returnsFrom {@code return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));}
 *  */
    @Test
    public void testMatchesWhitespace_ReturnNotIsEmptyAndStringUtilIsWhitespace_3() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\r\u0000                                   ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.matchesWhitespace();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWhitespace()}
 * @utbot.returnsFrom {@code return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));}
 *  */
    @Test
    public void testMatchesWhitespace_ReturnNotIsEmptyAndStringUtilIsWhitespace_4() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\t\u0000                                   ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        boolean actual = tokenQueue.matchesWhitespace();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWhitespace()}
 * @utbot.returnsFrom {@code return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));}
 *  */
    @Test
    public void testMatchesWhitespace_ReturnNotIsEmptyAndStringUtilIsWhitespace_5() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.matchesWhitespace();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesWhitespace()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWhitespace()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));
 *  */
    @Test
    public void testMatchesWhitespace_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesWhitespace] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:132) */
        tokenQueue.matchesWhitespace();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matchesWhitespace()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));
 *  */
    @Test
    public void testMatchesWhitespace_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matchesWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:132) */
        tokenQueue.matchesWhitespace();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consumeToAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToAny([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToAny(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code while(!isEmpty() && !matchesAny(seq))} once
 * @utbot.returnsFrom {@code return queue.substring(start, pos);}
 *  */
    @Test
    public void testConsumeToAny_NotIsEmptyAndNotMatchesAny_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        java.lang.String[] stringArray = {};
        
        String actual = tokenQueue.consumeToAny(stringArray);
        
        assertEquals(queue, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(1, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToAny(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code while(!isEmpty() && !matchesAny(seq))} once
 * @utbot.returnsFrom {@code return queue.substring(start, pos);}
 *  */
    @Test
    public void testConsumeToAny_NotIsEmptyAndNotMatchesAny_2() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = queue;
        
        String actual = tokenQueue.consumeToAny(stringArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToAny(java.lang.String[])}
 * @utbot.returnsFrom {@code return queue.substring(start, pos);}
 *  */
    @Test
    public void testConsumeToAny_NotIsEmptyAndNotMatchesAny() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.consumeToAny(null);
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToAny([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToAny(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code while(!isEmpty() && !matchesAny(seq))} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return queue.substring(start, pos);
 *  */
    @Test
    public void testConsumeToAny_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -1);
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeToAny] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeToAny(TokenQueue.java:228) */
        tokenQueue.consumeToAny(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToAny(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code while(!isEmpty() && !matchesAny(seq))} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return queue.substring(start, pos);
 *  */
    @Test
    public void testConsumeToAny_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -1);
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = queue;
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeToAny] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeToAny(TokenQueue.java:228) */
        tokenQueue.consumeToAny(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToAny(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!isEmpty() && !matchesAny(seq))
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeToAny(TokenQueue.java:224) */
        tokenQueue.consumeToAny(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeToAny([Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToAny(java.lang.String[])}
     */
    @Test
    public void testConsumeToAnyWithNonEmptyObjectArray() {
        TokenQueue tokenQueue = new TokenQueue("abc");
        java.lang.String[] stringArray = {"-3", "-3", "-3"};
        
        String actual = tokenQueue.consumeToAny(stringArray);
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeToAny(java.lang.String[])}
     */
    @Test
    public void testConsumeToAnyWithNonEmptyObjectArray1() {
        TokenQueue tokenQueue = new TokenQueue("-3");
        java.lang.String[] stringArray = {"abc", "-3", "10", ""};
        
        String actual = tokenQueue.consumeToAny(stringArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.chompBalanced
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method chompBalanced(char, char)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.executesCondition {@code (last == 0): True}
 * @utbot.executesCondition {@code (c.equals('\'') || c.equals('"')): True}
 * @utbot.executesCondition {@code (c != open): False}
 * @utbot.executesCondition {@code (inQuote): False}
 * @utbot.executesCondition {@code (c.equals(open)): False}
 * @utbot.executesCondition {@code (c.equals(close)): False}
 * @utbot.executesCondition {@code (depth > 0): False}
 * @utbot.executesCondition {@code (depth > 0): False}
 * @utbot.executesCondition {@code ((end >= 0)): False}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testChompBalanced_NotCEquals() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        String actual = tokenQueue.chompBalanced('_', '_');
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.executesCondition {@code (last == 0): True}
 * @utbot.executesCondition {@code (c.equals('\'') || c.equals('"')): True}
 * @utbot.executesCondition {@code (c != open): True}
 * @utbot.executesCondition {@code (if ((c.equals('\'') || c.equals('"')) && c != open)
 *     inQuote = !inQuote;): True}
 * @utbot.executesCondition {@code (inQuote = !inQuote;): True}
 * @utbot.executesCondition {@code (inQuote): True}
 * @utbot.executesCondition {@code (depth > 0): False}
 * @utbot.executesCondition {@code ((end >= 0)): False}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testChompBalanced_CNotEqualsOpen() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " \"";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        String actual = tokenQueue.chompBalanced(' ', ' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.executesCondition {@code (last == 0): True}
 * @utbot.executesCondition {@code (c.equals('\'') || c.equals('"')): True}
 * @utbot.executesCondition {@code (c != open): False}
 * @utbot.executesCondition {@code (inQuote): False}
 * @utbot.executesCondition {@code (c.equals(open)): True}
 * @utbot.executesCondition {@code (start == -1): True}
 * @utbot.executesCondition {@code (last != 0): False}
 * @utbot.executesCondition {@code (last == 0): False}
 * @utbot.executesCondition {@code (last != ESC): False}
 * @utbot.executesCondition {@code (last != 0): True}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.executesCondition {@code ((end >= 0)): True}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testChompBalanced_LastEqualsESC() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\\ ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.chompBalanced('\\', ' ');
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.executesCondition {@code (last == 0): True}
 * @utbot.executesCondition {@code (c.equals('\'') || c.equals('"')): True}
 * @utbot.executesCondition {@code (c != open): False}
 * @utbot.executesCondition {@code (inQuote): False}
 * @utbot.executesCondition {@code (c.equals(open)): True}
 * @utbot.executesCondition {@code (start == -1): True}
 * @utbot.executesCondition {@code (depth > 0): True}
 * @utbot.executesCondition {@code (last != 0): False}
 * @utbot.executesCondition {@code (last == 0): False}
 * @utbot.executesCondition {@code (last != ESC): True}
 * @utbot.executesCondition {@code (c.equals('\'') || c.equals('"')): False}
 * @utbot.executesCondition {@code (if ((c.equals('\'') || c.equals('"')) && c != open)
 *     inQuote = !inQuote;): True}
 * @utbot.executesCondition {@code (inQuote = !inQuote;): True}
 * @utbot.executesCondition {@code (inQuote): True}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.executesCondition {@code ((end >= 0)): False}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testChompBalanced_EndLessThanZero() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " '";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.chompBalanced(' ', ' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.executesCondition {@code (c.equals('\'') || c.equals('"')): True}
 * @utbot.executesCondition {@code (c != open): False}
 * @utbot.executesCondition {@code (c.equals(open)): True}
 * @utbot.executesCondition {@code (start == -1): True}
 * @utbot.executesCondition {@code (depth > 0): True}
 * @utbot.executesCondition {@code (last != 0): False}
 * @utbot.executesCondition {@code (inQuote = !inQuote;): True}
 * @utbot.executesCondition {@code (inQuote): True}
 * @utbot.executesCondition {@code (inQuote = !inQuote;): False}
 * @utbot.executesCondition {@code (c.equals(open)): False}
 * @utbot.executesCondition {@code (c.equals(close)): True}
 * @utbot.executesCondition {@code (depth > 0): False}
 * @utbot.executesCondition {@code (depth > 0): False}
 * @utbot.executesCondition {@code ((end >= 0)): False}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testChompBalanced_CEquals() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000''\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.chompBalanced('\u0000', '\'');
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(3, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.executesCondition {@code ((end >= 0)): False}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testChompBalanced_EndLessThanZero_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        String actual = tokenQueue.chompBalanced(' ', ' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.executesCondition {@code (last == 0): True}
 * @utbot.executesCondition {@code (c.equals('\'') || c.equals('"')): False}
 * @utbot.executesCondition {@code (if ((c.equals('\'') || c.equals('"')) && c != open)
 *     inQuote = !inQuote;): True}
 * @utbot.executesCondition {@code (inQuote = !inQuote;): True}
 * @utbot.executesCondition {@code (inQuote): True}
 * @utbot.executesCondition {@code (depth > 0): False}
 * @utbot.executesCondition {@code ((end >= 0)): False}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testChompBalanced_EndLessThanZero_2() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " '";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        String actual = tokenQueue.chompBalanced(' ', ' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.executesCondition {@code (last == 0): True}
 * @utbot.executesCondition {@code (if ((c.equals('\'') || c.equals('"')) && c != open)
 *     inQuote = !inQuote;): False}
 * @utbot.executesCondition {@code (start == -1): True}
 * @utbot.executesCondition {@code (last != 0): False}
 * @utbot.executesCondition {@code (last == 0): False}
 * @utbot.executesCondition {@code (last != ESC): True}
 * @utbot.executesCondition {@code (start == -1): False}
 * @utbot.executesCondition {@code (last != 0): True}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.executesCondition {@code ((end >= 0)): True}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testChompBalanced_StartNotEqualsNegative1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "''";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.chompBalanced('\'', ' ');
        
        String expected = "'";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chompBalanced(char, char)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: Character c = consume();
 *  */
    @Test
    public void testChompBalanced_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.chompBalanced] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
            org.jsoup.parser.TokenQueue.chompBalanced(TokenQueue.java:269) */
        tokenQueue.chompBalanced(' ', ' ');
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isEmpty()
 *  */
    @Test
    public void testChompBalanced_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.chompBalanced] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.chompBalanced(TokenQueue.java:268) */
        tokenQueue.chompBalanced(' ', ' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.remainingLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remainingLength()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#remainingLength()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return queue.length() - pos;}
 *  */
    @Test
    public void testRemainingLength_StringLength() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        Class tokenQueueClazz = Class.forName("org.jsoup.parser.TokenQueue");
        Method remainingLengthMethod = tokenQueueClazz.getDeclaredMethod("remainingLength");
        remainingLengthMethod.setAccessible(true);
        java.lang.Object[] remainingLengthMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) remainingLengthMethod.invoke(tokenQueue, remainingLengthMethodArguments));
        
        assertEquals(256, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remainingLength()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#remainingLength()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return queue.length() - pos;
 *  */
    @Test
    public void testRemainingLength_ThrowNullPointerException() throws Throwable  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.remainingLength] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35) */
        Class tokenQueueClazz = Class.forName("org.jsoup.parser.TokenQueue");
        Method remainingLengthMethod = tokenQueueClazz.getDeclaredMethod("remainingLength");
        remainingLengthMethod.setAccessible(true);
        java.lang.Object[] remainingLengthMethodArguments = new java.lang.Object[0];
        try {
            remainingLengthMethod.invoke(tokenQueue, remainingLengthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consumeWord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeWord()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWord()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.iterates iterate the loop {@code while(matchesWord())} once
 * @utbot.returnsFrom {@code return queue.substring(start, pos);}
 *  */
    @Test
    public void testConsumeWord_StringSubstring() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.consumeWord();
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeWord()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWord()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(matchesWord())
 *  */
    @Test
    public void testConsumeWord_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeWord] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.parser.TokenQueue.consumeWord(TokenQueue.java:331) */
        tokenQueue.consumeWord();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWord()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testConsumeWord_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consumeWord] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.parser.TokenQueue.consumeWord(TokenQueue.java:331) */
        tokenQueue.consumeWord();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeWord()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWord()}
     */
    @Test
    public void testConsumeWord() {
        TokenQueue tokenQueue = new TokenQueue("ab");
        
        String actual = tokenQueue.consumeWord();
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consumeWord()}
     */
    @Test
    public void testConsumeWord1() {
        TokenQueue tokenQueue = new TokenQueue("a");
        
        String actual = tokenQueue.consumeWord();
        
        String expected = "a";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#toString()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.returnsFrom {@code return queue.substring(pos);}
 *  */
    @Test
    public void testToString_StringSubstring() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        String actual = tokenQueue.toString();
        
        assertEquals(queue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#toString()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return queue.substring(pos);
 *  */
    @Test
    public void testToString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.toString] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            org.jsoup.parser.TokenQueue.toString(TokenQueue.java:399) */
        tokenQueue.toString();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#toString()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return queue.substring(pos);
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.toString] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.toString(TokenQueue.java:399) */
        tokenQueue.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#isEmpty()}
 * @utbot.returnsFrom {@code return remainingLength() == 0;}
 *  */
    @Test
    public void testIsEmpty_RemainingLengthNotEqualsZero() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -256);
        
        boolean actual = tokenQueue.isEmpty();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#isEmpty()}
 * @utbot.returnsFrom {@code return remainingLength() == 0;}
 *  */
    @Test
    public void testIsEmpty_RemainingLengthEqualsZero() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        boolean actual = tokenQueue.isEmpty();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#isEmpty()}
 * @utbot.invokes org.jsoup.parser.TokenQueue#remainingLength()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return remainingLength() == 0;
 *  */
    @Test
    public void testIsEmpty_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.isEmpty] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31) */
        tokenQueue.isEmpty();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matches(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#regionMatches(boolean,int,java.lang.String,int,int)}
 * @utbot.returnsFrom {@code return queue.regionMatches(true, pos, seq, 0, seq.length());}
 *  */
    @Test
    public void testMatches_StringRegionMatches() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -1);
        
        boolean actual = tokenQueue.matches(queue);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matches(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return queue.regionMatches(true, pos, seq, 0, seq.length());
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70) */
        tokenQueue.matches(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#matches(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return queue.regionMatches(true, pos, seq, 0, seq.length());
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70) */
        tokenQueue.matches(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.peek
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method peek()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#peek()}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return isEmpty() ? 0 : queue.charAt(pos);}
 *  */
    @Test
    public void testPeek_NotIsEmpty() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        char actual = tokenQueue.peek();
        
        assertEquals(' ', actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#peek()}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.returnsFrom {@code return isEmpty() ? 0 : queue.charAt(pos);}
 *  */
    @Test
    public void testPeek_IsEmpty() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        char actual = tokenQueue.peek();
        
        assertEquals('\u0000', actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method peek()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#peek()}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: queue.charAt(pos)
 *  */
    @Test
    public void testPeek_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.peek] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.peek(TokenQueue.java:43) */
        tokenQueue.peek();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#peek()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: isEmpty()
 *  */
    @Test
    public void testPeek_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.peek] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.peek(TokenQueue.java:43) */
        tokenQueue.peek();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.advance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method advance()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#advance()}
 * @utbot.executesCondition {@code (!isEmpty()): True}
 *  */
    @Test
    public void testAdvance_NotIsEmpty() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -3);
        
        tokenQueue.advance();
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(-2, finalTokenQueuePos);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#advance()}
 * @utbot.executesCondition {@code (!isEmpty()): False}
 *  */
    @Test
    public void testAdvance_IsEmpty() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        tokenQueue.advance();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method advance()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#advance()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !isEmpty()
 *  */
    @Test
    public void testAdvance_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.advance] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.advance(TokenQueue.java:147) */
        tokenQueue.advance();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.addFirst
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addFirst(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#addFirst(java.lang.Character)}
 * @utbot.invokes {@link java.lang.Character#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addFirst(c.toString());
 *  */
    @Test
    public void testAddFirst_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.addFirst] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.addFirst(TokenQueue.java:51) */
        tokenQueue.addFirst(((Character) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addFirst(java.lang.Character)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#addFirst(java.lang.Character)}
     */
    @Test
    public void testAddFirstWithCornerCase() {
        TokenQueue tokenQueue = new TokenQueue("abc");
        
        tokenQueue.addFirst('\u0000');
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addFirst(java.lang.Character)
    
    @Test
    public void testAddFirst1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        Character character = '\u0800';
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.addFirst] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.addFirst(TokenQueue.java:60)
            org.jsoup.parser.TokenQueue.addFirst(TokenQueue.java:51) */
        tokenQueue.addFirst(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.addFirst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addFirst(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#addFirst(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 *  */
    @Test
    public void testAddFirst_StringBuilderToString() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "                                    ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        
        tokenQueue.addFirst(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addFirst(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#addFirst(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: queue = seq + queue.substring(pos);
 *  */
    @Test
    public void testAddFirst_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.addFirst] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            org.jsoup.parser.TokenQueue.addFirst(TokenQueue.java:60) */
        tokenQueue.addFirst(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#addFirst(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: queue = seq + queue.substring(pos);
 *  */
    @Test
    public void testAddFirst_ThrowNullPointerException1() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.addFirst] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.addFirst(TokenQueue.java:60) */
        tokenQueue.addFirst(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.unescape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#unescape(java.lang.String)}
 * @utbot.returnsFrom {@code return out.toString();}
 *  */
    @Test
    public void testUnescape_ReturnOutToString() {
        String string = "";
        
        String actual = TokenQueue.unescape(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#unescape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(char c: in.toCharArray())} once
 * @utbot.returnsFrom {@code return out.toString();}
 *  */
    @Test
    public void testUnescape_LastEqualsZero() {
        String string = "\\";
        
        String actual = TokenQueue.unescape(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#unescape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(char c: in.toCharArray())} once
 * @utbot.returnsFrom {@code return out.toString();}
 *  */
    @Test
    public void testUnescape_CNotEqualsESC() {
        String string = " ";
        
        String actual = TokenQueue.unescape(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#unescape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(char c: in.toCharArray())} twice
 * @utbot.returnsFrom {@code return out.toString();}
 *  */
    @Test
    public void testUnescape_LastNotEqualsESC() {
        String string = " \\";
        
        String actual = TokenQueue.unescape(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#unescape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(char c: in.toCharArray())} twice
 * @utbot.returnsFrom {@code return out.toString();}
 *  */
    @Test
    public void testUnescape_LastEqualsESC() {
        String string = "\\\\";
        
        String actual = TokenQueue.unescape(string);
        
        String expected = "\\";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#unescape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(char c: in.toCharArray())
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.parser.TokenQueue.unescape] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.unescape(TokenQueue.java:300) */
        TokenQueue.unescape(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unescape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokenQueue}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#unescape(java.lang.String)}
     */
    @Test
    public void testUnescapeWithNonEmptyString() {
        String actual = TokenQueue.unescape("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.remainder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remainder()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#remainder()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return remainder;}
 *  */
    @Test
    public void testRemainder_StringLength() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        String actual = tokenQueue.remainder();
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remainder()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#remainder()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: final String remainder = queue.substring(pos, queue.length());
 *  */
    @Test
    public void testRemainder_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 253);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.remainder] produces [java.lang.StringIndexOutOfBoundsException: begin 253, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:392) */
        tokenQueue.remainder();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#remainder()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String remainder = queue.substring(pos, queue.length());
 *  */
    @Test
    public void testRemainder_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.remainder] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:392) */
        tokenQueue.remainder();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consume
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consume(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matches(java.lang.String)}
 *  */
    @Test
    public void testConsume_TokenQueueMatches() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "A";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        String string = "a";
        
        tokenQueue.consume(string);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(1, finalTokenQueuePos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method consume(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matches(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !matches(seq)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testConsume_ThrowIllegalStateException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        tokenQueue.consume(queue);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokenQueue.consume
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consume()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consume()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return queue.charAt(pos++);}
 *  */
    @Test
    public void testConsume_StringCharAt() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", 1);
        
        char actual = tokenQueue.consume();
        
        assertEquals(' ', actual);
        
        int finalTokenQueuePos = ((Integer) getFieldValue(tokenQueue, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalTokenQueuePos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consume()
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consume()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return queue.charAt(pos++);
 *  */
    @Test
    public void testConsume_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consume] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155) */
        tokenQueue.consume();
    }
    
    /**
    @utbot.classUnderTest {@link TokenQueue}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokenQueue#consume()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return queue.charAt(pos++);
 *  */
    @Test
    public void testConsume_ThrowNullPointerException() throws Exception  {
        TokenQueue tokenQueue = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tokenQueue, "org.jsoup.parser.TokenQueue", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokenQueue.consume] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155) */
        tokenQueue.consume();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1003440792266100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1003440792266100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1003440792270900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003440792266100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003440792270900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1003440792649700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1003440792649700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1003440792651500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003440792649700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003440792651500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

