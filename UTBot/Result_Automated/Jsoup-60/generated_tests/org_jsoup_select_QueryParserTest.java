package org.jsoup.select;

import org.junit.Test;
import java.lang.reflect.Method;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Selector.SelectorParseException;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_jsoup_select_QueryParserTest {
    ///region Test suites for executable org.jsoup.select.QueryParser.matches
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches(boolean)
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#matches(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.matches] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.matches(QueryParser.java:354) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method matchesMethod = queryParserClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = false;
        try {
            matchesMethod.invoke(queryParser, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#matches(boolean)}
 * @utbot.executesCondition {@code (own): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.matches] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.matches(QueryParser.java:354) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method matchesMethod = queryParserClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = true;
        try {
            matchesMethod.invoke(queryParser, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method matches(boolean)
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#matches(boolean)}
 * @utbot.executesCondition {@code (own): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMatches_ThrowIllegalStateException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method matchesMethod = queryParserClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = true;
        try {
            matchesMethod.invoke(queryParser, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#matches(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(own ? ":matchesOwn" : ":matches");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMatches_ThrowIllegalStateException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "@\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method matchesMethod = queryParserClazz.getDeclaredMethod("matches", booleanType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = false;
        try {
            matchesMethod.invoke(queryParser, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.contains
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(boolean)
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#contains(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test
    public void testContains_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.contains] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.contains(QueryParser.java:335) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method containsMethod = queryParserClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = false;
        try {
            containsMethod.invoke(queryParser, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#contains(boolean)}
 * @utbot.executesCondition {@code (own): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test
    public void testContains_ThrowNullPointerException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.contains] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.contains(QueryParser.java:335) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method containsMethod = queryParserClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = true;
        try {
            containsMethod.invoke(queryParser, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method contains(boolean)
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#contains(boolean)}
 * @utbot.executesCondition {@code (own): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testContains_ThrowIllegalStateException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method containsMethod = queryParserClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = true;
        try {
            containsMethod.invoke(queryParser, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#contains(boolean)}
 * @utbot.executesCondition {@code (own): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(own ? ":containsOwn" : ":contains");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testContains_ThrowIllegalStateException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "@\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method containsMethod = queryParserClazz.getDeclaredMethod("contains", booleanType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = false;
        try {
            containsMethod.invoke(queryParser, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QueryParser p = new QueryParser(query);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() {
        QueryParser.parse(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse1() {
        String string = "\t\u0000";
        
        QueryParser.parse(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse2() {
        String string = "\f\r\u0000";
        
        QueryParser.parse(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse3() {
        String string = "\n ";
        
        QueryParser.parse(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse4() {
        String string = "";
        
        QueryParser.parse(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#parse()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testParse_ThrowStringIndexOutOfBoundsException() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:132)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:318)
            org.jsoup.select.QueryParser.parse(QueryParser.java:47) */
        queryParser.parse();
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#parse()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.parse(QueryParser.java:47) */
        queryParser.parse();
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#parse()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testParse_ThrowNullPointerException_1() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:132)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:318)
            org.jsoup.select.QueryParser.parse(QueryParser.java:47) */
        queryParser.parse();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse()
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse5() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \n\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 11);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse6() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " \t";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse7() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \r\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 11);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse8() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \f\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 11);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse9() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 39);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse10() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 37);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse11() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\t\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 11);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse12() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.not
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method not()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#not()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(":not");
 *  */
    @Test
    public void testNot_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.not] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.not(QueryParser.java:366) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method notMethod = queryParserClazz.getDeclaredMethod("not");
        notMethod.setAccessible(true);
        java.lang.Object[] notMethodArguments = new java.lang.Object[0];
        try {
            notMethod.invoke(queryParser, notMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method not()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#not()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(":not");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNot_ThrowIllegalStateException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method notMethod = queryParserClazz.getDeclaredMethod("not");
        notMethod.setAccessible(true);
        java.lang.Object[] notMethodArguments = new java.lang.Object[0];
        try {
            notMethod.invoke(queryParser, notMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#not()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(subQuery, ":not(selector) subselect must not be empty");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNot_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "                                :not)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 32);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method notMethod = queryParserClazz.getDeclaredMethod("not");
        notMethod.setAccessible(true);
        java.lang.Object[] notMethodArguments = new java.lang.Object[0];
        try {
            notMethod.invoke(queryParser, notMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method not()
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testNot1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000:not((\"";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 2);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method notMethod = queryParserClazz.getDeclaredMethod("not");
        notMethod.setAccessible(true);
        java.lang.Object[] notMethodArguments = new java.lang.Object[0];
        try {
            notMethod.invoke(queryParser, notMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testNot2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000:not(\\\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 2);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method notMethod = queryParserClazz.getDeclaredMethod("not");
        notMethod.setAccessible(true);
        java.lang.Object[] notMethodArguments = new java.lang.Object[0];
        try {
            notMethod.invoke(queryParser, notMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testNot3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000:not('\"";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 2);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method notMethod = queryParserClazz.getDeclaredMethod("not");
        notMethod.setAccessible(true);
        java.lang.Object[] notMethodArguments = new java.lang.Object[0];
        try {
            notMethod.invoke(queryParser, notMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.has
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method has()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#has()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(":has");
 *  */
    @Test
    public void testHas_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.has] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.has(QueryParser.java:327) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method hasMethod = queryParserClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(queryParser, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method has()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#has()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(":has");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testHas_ThrowIllegalStateException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method hasMethod = queryParserClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(queryParser, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#has()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(subQuery, ":has(el) subselect must not be empty");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHas_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "                                :has)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 32);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method hasMethod = queryParserClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(queryParser, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method has()
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testHas1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000:has(\"'";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 2);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method hasMethod = queryParserClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(queryParser, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testHas2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000:has(('";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 2);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method hasMethod = queryParserClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(queryParser, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testHas3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = ":has(\\\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method hasMethod = queryParserClazz.getDeclaredMethod("has");
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[0];
        try {
            hasMethod.invoke(queryParser, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.cssNthChild
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cssNthChild(boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#cssNthChild(boolean,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String argS = tq.chompTo(")").trim().toLowerCase();
 *  */
    @Test
    public void testCssNthChild_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = ")";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.cssNthChild] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.cssNthChild(QueryParser.java:287) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method cssNthChildMethod = queryParserClazz.getDeclaredMethod("cssNthChild", booleanType, booleanType);
        cssNthChildMethod.setAccessible(true);
        java.lang.Object[] cssNthChildMethodArguments = new java.lang.Object[2];
        cssNthChildMethodArguments[0] = false;
        cssNthChildMethodArguments[1] = false;
        try {
            cssNthChildMethod.invoke(queryParser, cssNthChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#cssNthChild(boolean,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCssNthChild_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.cssNthChild] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 2, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:392)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.cssNthChild(QueryParser.java:287) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method cssNthChildMethod = queryParserClazz.getDeclaredMethod("cssNthChild", booleanType, booleanType);
        cssNthChildMethod.setAccessible(true);
        java.lang.Object[] cssNthChildMethodArguments = new java.lang.Object[2];
        cssNthChildMethodArguments[0] = false;
        cssNthChildMethodArguments[1] = false;
        try {
            cssNthChildMethod.invoke(queryParser, cssNthChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#cssNthChild(boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String argS = tq.chompTo(")").trim().toLowerCase();
 *  */
    @Test
    public void testCssNthChild_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.cssNthChild] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.cssNthChild(QueryParser.java:287) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method cssNthChildMethod = queryParserClazz.getDeclaredMethod("cssNthChild", booleanType, booleanType);
        cssNthChildMethod.setAccessible(true);
        java.lang.Object[] cssNthChildMethodArguments = new java.lang.Object[2];
        cssNthChildMethodArguments[0] = false;
        cssNthChildMethodArguments[1] = false;
        try {
            cssNthChildMethod.invoke(queryParser, cssNthChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cssNthChild(boolean, boolean)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCssNthChild1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method cssNthChildMethod = queryParserClazz.getDeclaredMethod("cssNthChild", booleanType, booleanType);
        cssNthChildMethod.setAccessible(true);
        java.lang.Object[] cssNthChildMethodArguments = new java.lang.Object[2];
        cssNthChildMethodArguments[0] = false;
        cssNthChildMethodArguments[1] = false;
        try {
            cssNthChildMethod.invoke(queryParser, cssNthChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCssNthChild2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "                                  )";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 29);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class booleanType = boolean.class;
        Method cssNthChildMethod = queryParserClazz.getDeclaredMethod("cssNthChild", booleanType, booleanType);
        cssNthChildMethod.setAccessible(true);
        java.lang.Object[] cssNthChildMethodArguments = new java.lang.Object[2];
        cssNthChildMethodArguments[0] = false;
        cssNthChildMethodArguments[1] = false;
        try {
            cssNthChildMethod.invoke(queryParser, cssNthChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.byTag
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method byTag()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byTag()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String tagName = tq.consumeElementSelector();
 *  */
    @Test
    public void testByTag_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byTag] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.parser.TokenQueue.consumeElementSelector(TokenQueue.java:356)
            org.jsoup.select.QueryParser.byTag(QueryParser.java:215) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byTagMethod = queryParserClazz.getDeclaredMethod("byTag");
        byTagMethod.setAccessible(true);
        java.lang.Object[] byTagMethodArguments = new java.lang.Object[0];
        try {
            byTagMethod.invoke(queryParser, byTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeElementSelector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String tagName = tq.consumeElementSelector();
 *  */
    @Test
    public void testByTag_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.byTag] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.byTag(QueryParser.java:215) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byTagMethod = queryParserClazz.getDeclaredMethod("byTag");
        byTagMethod.setAccessible(true);
        java.lang.Object[] byTagMethodArguments = new java.lang.Object[0];
        try {
            byTagMethod.invoke(queryParser, byTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byTag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String tagName = tq.consumeElementSelector();
 *  */
    @Test
    public void testByTag_ThrowNullPointerException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -255);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeElementSelector(TokenQueue.java:356)
            org.jsoup.select.QueryParser.byTag(QueryParser.java:215) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byTagMethod = queryParserClazz.getDeclaredMethod("byTag");
        byTagMethod.setAccessible(true);
        java.lang.Object[] byTagMethodArguments = new java.lang.Object[0];
        try {
            byTagMethod.invoke(queryParser, byTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method byTag()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeElementSelector()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByTag_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byTagMethod = queryParserClazz.getDeclaredMethod("byTag");
        byTagMethod.setAccessible(true);
        java.lang.Object[] byTagMethodArguments = new java.lang.Object[0];
        try {
            byTagMethod.invoke(queryParser, byTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.byAttribute
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method byAttribute()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byAttribute()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: TokenQueue cq = new TokenQueue(tq.chompBalanced('[', ']'));
 *  */
    @Test
    public void testByAttribute_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byAttribute] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
            org.jsoup.parser.TokenQueue.chompBalanced(TokenQueue.java:269)
            org.jsoup.select.QueryParser.byAttribute(QueryParser.java:232) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byAttribute()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TokenQueue cq = new TokenQueue(tq.chompBalanced('[', ']'));
 *  */
    @Test
    public void testByAttribute_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.byAttribute] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.byAttribute(QueryParser.java:232) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byAttribute()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TokenQueue cq = new TokenQueue(tq.chompBalanced('[', ']'));
 *  */
    @Test
    public void testByAttribute_ThrowNullPointerException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byAttribute] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.chompBalanced(TokenQueue.java:268)
            org.jsoup.select.QueryParser.byAttribute(QueryParser.java:232) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method byAttribute()
    
    @Test
    public void testByAttribute1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000[[";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 37);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byAttribute] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.byAttribute(QueryParser.java:241) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testByAttribute2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000[''";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byAttribute] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.byAttribute(QueryParser.java:241) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method byAttribute()
    
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute4() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000['\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute5() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\"";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute6() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute7() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "]";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byAttributeMethod = queryParserClazz.getDeclaredMethod("byAttribute");
        byAttributeMethod.setAccessible(true);
        java.lang.Object[] byAttributeMethodArguments = new java.lang.Object[0];
        try {
            byAttributeMethod.invoke(queryParser, byAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.byClass
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method byClass()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byClass()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String className = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testByClass_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byClass] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:369)
            org.jsoup.select.QueryParser.byClass(QueryParser.java:209) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byClassMethod = queryParserClazz.getDeclaredMethod("byClass");
        byClassMethod.setAccessible(true);
        java.lang.Object[] byClassMethodArguments = new java.lang.Object[0];
        try {
            byClassMethod.invoke(queryParser, byClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byClass()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String className = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testByClass_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.byClass] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.byClass(QueryParser.java:209) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byClassMethod = queryParserClazz.getDeclaredMethod("byClass");
        byClassMethod.setAccessible(true);
        java.lang.Object[] byClassMethodArguments = new java.lang.Object[0];
        try {
            byClassMethod.invoke(queryParser, byClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String className = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testByClass_ThrowNullPointerException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -255);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byClass] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:369)
            org.jsoup.select.QueryParser.byClass(QueryParser.java:209) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byClassMethod = queryParserClazz.getDeclaredMethod("byClass");
        byClassMethod.setAccessible(true);
        java.lang.Object[] byClassMethodArguments = new java.lang.Object[0];
        try {
            byClassMethod.invoke(queryParser, byClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method byClass()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byClass()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByClass_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byClassMethod = queryParserClazz.getDeclaredMethod("byClass");
        byClassMethod.setAccessible(true);
        java.lang.Object[] byClassMethodArguments = new java.lang.Object[0];
        try {
            byClassMethod.invoke(queryParser, byClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.indexEquals
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexEquals()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexEquals()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: evals.add(new Evaluator.IndexEquals(consumeIndex()));
 *  */
    @Test
    public void testIndexEquals_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexEquals] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:392)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320)
            org.jsoup.select.QueryParser.indexEquals(QueryParser.java:279) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexEqualsMethod = queryParserClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(queryParser, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexEquals()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evals.add(new Evaluator.IndexEquals(consumeIndex()));
 *  */
    @Test
    public void testIndexEquals_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexEquals] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320)
            org.jsoup.select.QueryParser.indexEquals(QueryParser.java:279) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexEqualsMethod = queryParserClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(queryParser, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexEquals()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexEquals()}
 * @utbot.invokes org.jsoup.select.QueryParser#consumeIndex()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexEquals(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexEquals_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexEqualsMethod = queryParserClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(queryParser, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexEquals()
    
    @Test
    public void testIndexEquals1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexEquals] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 9, length 10]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320)
            org.jsoup.select.QueryParser.indexEquals(QueryParser.java:279) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexEqualsMethod = queryParserClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(queryParser, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexEquals()
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexEquals2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000)\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexEqualsMethod = queryParserClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(queryParser, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexEquals3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "!";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexEqualsMethod = queryParserClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(queryParser, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexEquals4() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "!)\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexEqualsMethod = queryParserClazz.getDeclaredMethod("indexEquals");
        indexEqualsMethod.setAccessible(true);
        java.lang.Object[] indexEqualsMethodArguments = new java.lang.Object[0];
        try {
            indexEqualsMethod.invoke(queryParser, indexEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.indexLessThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexLessThan()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexLessThan()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: evals.add(new Evaluator.IndexLessThan(consumeIndex()));
 *  */
    @Test
    public void testIndexLessThan_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexLessThan] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:392)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320)
            org.jsoup.select.QueryParser.indexLessThan(QueryParser.java:271) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexLessThanMethod = queryParserClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(queryParser, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexLessThan()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evals.add(new Evaluator.IndexLessThan(consumeIndex()));
 *  */
    @Test
    public void testIndexLessThan_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexLessThan] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320)
            org.jsoup.select.QueryParser.indexLessThan(QueryParser.java:271) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexLessThanMethod = queryParserClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(queryParser, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexLessThan()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexLessThan()}
 * @utbot.invokes org.jsoup.select.QueryParser#consumeIndex()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexLessThan(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexLessThanMethod = queryParserClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(queryParser, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexLessThan()
    
    @Test
    public void testIndexLessThan1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexLessThan] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 9, length 10]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320)
            org.jsoup.select.QueryParser.indexLessThan(QueryParser.java:271) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexLessThanMethod = queryParserClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(queryParser, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexLessThan()
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000)\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexLessThanMethod = queryParserClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(queryParser, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "!";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexLessThanMethod = queryParserClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(queryParser, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan4() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "!)\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexLessThanMethod = queryParserClazz.getDeclaredMethod("indexLessThan");
        indexLessThanMethod.setAccessible(true);
        java.lang.Object[] indexLessThanMethodArguments = new java.lang.Object[0];
        try {
            indexLessThanMethod.invoke(queryParser, indexLessThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.findElements
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findElements()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#findElements()}
 * @utbot.executesCondition {@code (tq.matchChomp("#")): False}
 * @utbot.executesCondition {@code (tq.matchChomp(".")): False}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchesWord()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: tq.matchesWord() || tq.matches("*|")
 *  */
    @Test
    public void testFindElements_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.findElements] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.select.QueryParser.findElements(QueryParser.java:147) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method findElementsMethod = queryParserClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(queryParser, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#findElements()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tq.matchChomp("#")
 *  */
    @Test
    public void testFindElements_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.findElements] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.findElements(QueryParser.java:143) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method findElementsMethod = queryParserClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(queryParser, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findElements()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#findElements()}
 * @utbot.executesCondition {@code (tq.matchChomp("#")): False}
 * @utbot.executesCondition {@code (tq.matchChomp(".")): True}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchChomp(java.lang.String)}
 * @utbot.invokes org.jsoup.select.QueryParser#byClass()
 * @utbot.throwsException {@link org.jsoup.select.Selector$SelectorParseException} in: byClass();
 *  */
    @Test(expected = Selector.SelectorParseException.class)
    public void testFindElements_ThrowSelectorParseException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method findElementsMethod = queryParserClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(queryParser, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#findElements()}
 * @utbot.executesCondition {@code (tq.matchChomp("#")): True}
 * @utbot.invokes org.jsoup.select.QueryParser#byId()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: byId();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindElements_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "#";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method findElementsMethod = queryParserClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(queryParser, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findElements()
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindElements1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "#######################################.";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 39);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method findElementsMethod = queryParserClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(queryParser, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindElements2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = ".###########";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method findElementsMethod = queryParserClazz.getDeclaredMethod("findElements");
        findElementsMethod.setAccessible(true);
        java.lang.Object[] findElementsMethodArguments = new java.lang.Object[0];
        try {
            findElementsMethod.invoke(queryParser, findElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.byId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method byId()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byId()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String id = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testById_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byId] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWord(TokenQueue.java:140)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:369)
            org.jsoup.select.QueryParser.byId(QueryParser.java:203) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byIdMethod = queryParserClazz.getDeclaredMethod("byId");
        byIdMethod.setAccessible(true);
        java.lang.Object[] byIdMethodArguments = new java.lang.Object[0];
        try {
            byIdMethod.invoke(queryParser, byIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byId()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String id = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testById_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.byId] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.byId(QueryParser.java:203) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byIdMethod = queryParserClazz.getDeclaredMethod("byId");
        byIdMethod.setAccessible(true);
        java.lang.Object[] byIdMethodArguments = new java.lang.Object[0];
        try {
            byIdMethod.invoke(queryParser, byIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String id = tq.consumeCssIdentifier();
 *  */
    @Test
    public void testById_ThrowNullPointerException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -255);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byId] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:369)
            org.jsoup.select.QueryParser.byId(QueryParser.java:203) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byIdMethod = queryParserClazz.getDeclaredMethod("byId");
        byIdMethod.setAccessible(true);
        java.lang.Object[] byIdMethodArguments = new java.lang.Object[0];
        try {
            byIdMethod.invoke(queryParser, byIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method byId()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byId()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeCssIdentifier()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(id);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testById_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method byIdMethod = queryParserClazz.getDeclaredMethod("byId");
        byIdMethod.setAccessible(true);
        java.lang.Object[] byIdMethodArguments = new java.lang.Object[0];
        try {
            byIdMethod.invoke(queryParser, byIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.allElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method allElements()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#allElements()}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testAllElements_ListAdd() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        ArrayList evals = new ArrayList();
        evals.add(null);
        evals.add(null);
        evals.add(null);
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method allElementsMethod = queryParserClazz.getDeclaredMethod("allElements");
        allElementsMethod.setAccessible(true);
        java.lang.Object[] allElementsMethodArguments = new java.lang.Object[0];
        allElementsMethod.invoke(queryParser, allElementsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allElements()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#allElements()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evals.add(new Evaluator.AllElements());
 *  */
    @Test
    public void testAllElements_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.allElements] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.allElements(QueryParser.java:266) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method allElementsMethod = queryParserClazz.getDeclaredMethod("allElements");
        allElementsMethod.setAccessible(true);
        java.lang.Object[] allElementsMethodArguments = new java.lang.Object[0];
        try {
            allElementsMethod.invoke(queryParser, allElementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.consumeSubQuery
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeSubQuery()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#consumeSubQuery()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.returnsFrom {@code return sq.toString();}
 *  */
    @Test
    public void testConsumeSubQuery_NotTqIsEmpty() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeSubQueryMethod = queryParserClazz.getDeclaredMethod("consumeSubQuery");
        consumeSubQueryMethod.setAccessible(true);
        java.lang.Object[] consumeSubQueryMethodArguments = new java.lang.Object[0];
        String actual = ((String) consumeSubQueryMethod.invoke(queryParser, consumeSubQueryMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#consumeSubQuery()}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 *  */
    @Test
    public void testConsumeSubQuery_TqMatches() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 32);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeSubQueryMethod = queryParserClazz.getDeclaredMethod("consumeSubQuery");
        consumeSubQueryMethod.setAccessible(true);
        java.lang.Object[] consumeSubQueryMethodArguments = new java.lang.Object[0];
        String actual = ((String) consumeSubQueryMethod.invoke(queryParser, consumeSubQueryMethodArguments));
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
        
        TokenQueue queryParserTq = ((TokenQueue) getFieldValue(queryParser, "org.jsoup.select.QueryParser", "tq"));
        int finalQueryParserTqPos = ((Integer) getFieldValue(queryParserTq, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(33, finalQueryParserTqPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeSubQuery()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#consumeSubQuery()}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!tq.isEmpty())
 *  */
    @Test
    public void testConsumeSubQuery_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.consumeSubQuery] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.consumeSubQuery(QueryParser.java:129) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeSubQueryMethod = queryParserClazz.getDeclaredMethod("consumeSubQuery");
        consumeSubQueryMethod.setAccessible(true);
        java.lang.Object[] consumeSubQueryMethodArguments = new java.lang.Object[0];
        try {
            consumeSubQueryMethod.invoke(queryParser, consumeSubQueryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#consumeSubQuery()}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!tq.isEmpty())
 *  */
    @Test
    public void testConsumeSubQuery_ThrowNullPointerException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.consumeSubQuery] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.select.QueryParser.consumeSubQuery(QueryParser.java:129) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeSubQueryMethod = queryParserClazz.getDeclaredMethod("consumeSubQuery");
        consumeSubQueryMethod.setAccessible(true);
        java.lang.Object[] consumeSubQueryMethodArguments = new java.lang.Object[0];
        try {
            consumeSubQueryMethod.invoke(queryParser, consumeSubQueryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeSubQuery()
    
    @Test
    public void testConsumeSubQuery1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 7553026);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.consumeSubQuery] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 7553026]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
            org.jsoup.select.QueryParser.consumeSubQuery(QueryParser.java:137) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeSubQueryMethod = queryParserClazz.getDeclaredMethod("consumeSubQuery");
        consumeSubQueryMethod.setAccessible(true);
        java.lang.Object[] consumeSubQueryMethodArguments = new java.lang.Object[0];
        try {
            consumeSubQueryMethod.invoke(queryParser, consumeSubQueryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.combinator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method combinator(char)
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#combinator(char)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testCombinator_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:132)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:318)
            org.jsoup.select.QueryParser.combinator(QueryParser.java:76) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = ' ';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#combinator(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testCombinator_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.combinator(QueryParser.java:76) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = ' ';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#combinator(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testCombinator_ThrowNullPointerException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:35)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:31)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:132)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:318)
            org.jsoup.select.QueryParser.combinator(QueryParser.java:76) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = ' ';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method combinator(char)
    
    @Test
    public void testCombinator1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\t\t\t\t\t\t\t\t[\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 8);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.combinator(QueryParser.java:84) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = '\u0000';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCombinator2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "A";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.combinator(QueryParser.java:84) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = '\u0000';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method combinator(char)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCombinator3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \r";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 38);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = '\u0000';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCombinator4() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \n\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 30);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = ' ';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCombinator5() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \f\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 30);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = ' ';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCombinator6() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \t";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 37);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = '\u0000';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCombinator7() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\t\t\t\t\t\t\t\t(\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 8);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = '\u0000';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCombinator8() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t\r";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 38);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = '\u0000';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCombinator9() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t \u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = '\u0000';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCombinator10() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\n";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 37);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = '\u0000';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testCombinator11() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Class charType = char.class;
        Method combinatorMethod = queryParserClazz.getDeclaredMethod("combinator", charType);
        combinatorMethod.setAccessible(true);
        java.lang.Object[] combinatorMethodArguments = new java.lang.Object[1];
        combinatorMethodArguments[0] = '\u0000';
        try {
            combinatorMethod.invoke(queryParser, combinatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.indexGreaterThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexGreaterThan()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexGreaterThan()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIndexGreaterThan_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexGreaterThan] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:392)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320)
            org.jsoup.select.QueryParser.indexGreaterThan(QueryParser.java:275) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexGreaterThanMethod = queryParserClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(queryParser, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexGreaterThan()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
 *  */
    @Test
    public void testIndexGreaterThan_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexGreaterThan] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320)
            org.jsoup.select.QueryParser.indexGreaterThan(QueryParser.java:275) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexGreaterThanMethod = queryParserClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(queryParser, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexGreaterThan()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexGreaterThan()}
 * @utbot.invokes org.jsoup.select.QueryParser#consumeIndex()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexGreaterThanMethod = queryParserClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(queryParser, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexGreaterThan()
    
    @Test
    public void testIndexGreaterThan1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexGreaterThan] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 7, length 8]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320)
            org.jsoup.select.QueryParser.indexGreaterThan(QueryParser.java:275) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexGreaterThanMethod = queryParserClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(queryParser, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexGreaterThan()
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000)\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexGreaterThanMethod = queryParserClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(queryParser, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "!";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method indexGreaterThanMethod = queryParserClazz.getDeclaredMethod("indexGreaterThan");
        indexGreaterThanMethod.setAccessible(true);
        java.lang.Object[] indexGreaterThanMethodArguments = new java.lang.Object[0];
        try {
            indexGreaterThanMethod.invoke(queryParser, indexGreaterThanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.consumeIndex
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeIndex()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#consumeIndex()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#chompTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String indexS = tq.chompTo(")").trim();
 *  */
    @Test
    public void testConsumeIndex_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.consumeIndex] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:392)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeIndexMethod = queryParserClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(queryParser, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#consumeIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String indexS = tq.chompTo(")").trim();
 *  */
    @Test
    public void testConsumeIndex_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.consumeIndex] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeIndexMethod = queryParserClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(queryParser, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeIndex()
    
    @Test
    public void testConsumeIndex1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.consumeIndex] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 6, length 7]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:240)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:320) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeIndexMethod = queryParserClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(queryParser, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method consumeIndex()
    
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 4);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeIndexMethod = queryParserClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(queryParser, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000)\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeIndexMethod = queryParserClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(queryParser, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex4() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 16);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeIndexMethod = queryParserClazz.getDeclaredMethod("consumeIndex");
        consumeIndexMethod.setAccessible(true);
        java.lang.Object[] consumeIndexMethodArguments = new java.lang.Object[0];
        try {
            consumeIndexMethod.invoke(queryParser, consumeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.QueryParser.containsData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsData()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#containsData()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume(":containsData");
 *  */
    @Test
    public void testContainsData_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.containsData] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.containsData(QueryParser.java:346) */
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method containsDataMethod = queryParserClazz.getDeclaredMethod("containsData");
        containsDataMethod.setAccessible(true);
        java.lang.Object[] containsDataMethodArguments = new java.lang.Object[0];
        try {
            containsDataMethod.invoke(queryParser, containsDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method containsData()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#containsData()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume(":containsData");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testContainsData_ThrowIllegalStateException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method containsDataMethod = queryParserClazz.getDeclaredMethod("containsData");
        containsDataMethod.setAccessible(true);
        java.lang.Object[] containsDataMethodArguments = new java.lang.Object[0];
        try {
            containsDataMethod.invoke(queryParser, containsDataMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1003568483054700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1003568483054700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1003568483060500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003568483054700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003568483060500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1003568483450600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1003568483450600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1003568483452100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003568483450600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003568483452100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

