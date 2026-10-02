package org.jsoup.select;

import org.junit.Test;
import java.lang.reflect.Method;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Selector.SelectorParseException;
import java.util.ArrayList;
import org.jsoup.select.StructuralEvaluator.Not;
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
            org.jsoup.select.QueryParser.matches(QueryParser.java:255) */
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
            org.jsoup.select.QueryParser.matches(QueryParser.java:255) */
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
            org.jsoup.select.QueryParser.contains(QueryParser.java:244) */
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
            org.jsoup.select.QueryParser.contains(QueryParser.java:244) */
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
        String string = "\f\r ";
        
        QueryParser.parse(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            String string5 = "N~~";
            
            QueryParser.parse(string5);
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            
            QueryParser.parse(string2);
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            String string5 = "\n\t";
            
            QueryParser.parse(string5);
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            String string5 = "";
            
            QueryParser.parse(string5);
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String)
    
    @Test
    public void testParse6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            
            /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
                org.jsoup.select.QueryParser.parse(QueryParser.java:49)
                org.jsoup.select.QueryParser.parse(QueryParser.java:37) */
            QueryParser.parse(string4);
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test
    public void testParse7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            
            /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
                org.jsoup.select.QueryParser.parse(QueryParser.java:49)
                org.jsoup.select.QueryParser.parse(QueryParser.java:37) */
            QueryParser.parse(string);
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test
    public void testParse8() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            
            /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
                org.jsoup.select.QueryParser.parse(QueryParser.java:49)
                org.jsoup.select.QueryParser.parse(QueryParser.java:37) */
            QueryParser.parse(string3);
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
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
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:309)
            org.jsoup.select.QueryParser.parse(QueryParser.java:45) */
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
            org.jsoup.select.QueryParser.parse(QueryParser.java:45) */
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
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:309)
            org.jsoup.select.QueryParser.parse(QueryParser.java:45) */
        queryParser.parse();
    }
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#parse()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchesAny(java.lang.String[])}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matches(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchesAny(java.lang.String[])}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evals.add(new StructuralEvaluator.Root());
 *  */
    @Test
    public void testParse_ThrowNullPointerException_2() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = " ,";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.NullPointerException]
                org.jsoup.select.QueryParser.parse(QueryParser.java:48) */
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse()
    
    @Test
    public void testParse9() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", string);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            ArrayList evals = new ArrayList();
            evals.add(tq);
            evals.add(tq);
            evals.add(tq);
            setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
            
            /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
                org.jsoup.select.QueryParser.parse(QueryParser.java:49) */
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test
    public void testParse10() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "\nN~";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.NullPointerException]
                org.jsoup.select.QueryParser.byTag(QueryParser.java:174)
                org.jsoup.select.QueryParser.findElements(QueryParser.java:126)
                org.jsoup.select.QueryParser.parse(QueryParser.java:51) */
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test
    public void testParse11() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "N";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.NullPointerException]
                org.jsoup.select.QueryParser.byTag(QueryParser.java:174)
                org.jsoup.select.QueryParser.findElements(QueryParser.java:126)
                org.jsoup.select.QueryParser.parse(QueryParser.java:51) */
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test
    public void testParse12() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", string3);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.QueryParser.parse] produces [java.lang.NullPointerException]
                org.jsoup.select.QueryParser.parse(QueryParser.java:48) */
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse()
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse13() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t \u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse14() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\f\r";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse15() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \t";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 38);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse16() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \n\r";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse17() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \n\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        queryParser.parse();
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse18() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \f";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 38);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParse19() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "~~~~~~~ [";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 7);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse20() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse21() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = ",~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            ArrayList evals = new ArrayList();
            evals.add(null);
            evals.add(null);
            evals.add(null);
            setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
            
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testParse22() throws Exception  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = " ,~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            ArrayList evals = new ArrayList();
            evals.add(null);
            evals.add(null);
            evals.add(null);
            setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
            
            queryParser.parse();
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
        }
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
            org.jsoup.select.QueryParser.not(QueryParser.java:267) */
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
        String queue = "\u0000\u0000\u0000:not(\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 3);
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
            org.jsoup.select.QueryParser.has(QueryParser.java:236) */
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
        String queue = "\u0000\u0000\u0000:has(\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 3);
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
    
    ///region Test suites for executable org.jsoup.select.QueryParser.byAttribute
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method byAttribute()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byAttribute()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
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
            org.jsoup.select.QueryParser.byAttribute(QueryParser.java:178) */
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
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#chompBalanced(char,char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TokenQueue cq = new TokenQueue(tq.chompBalanced('[', ']'));
 *  */
    @Test
    public void testByAttribute_ThrowNullPointerException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        
        /* This test fails because method [org.jsoup.select.QueryParser.byAttribute] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.byAttribute(QueryParser.java:178) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} 
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
            org.jsoup.select.QueryParser.byAttribute(QueryParser.java:178) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method byAttribute()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byAttribute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byAttribute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute_ThrowIllegalArgumentException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byAttribute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute_ThrowIllegalArgumentException_2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ]";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#byAttribute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testByAttribute_ThrowIllegalArgumentException_3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
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
    
    ///region OTHER: ERROR SUITE for method byAttribute()
    
    @Test
    public void testByAttribute1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000[\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 37);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.byAttribute] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.byAttribute(QueryParser.java:187) */
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
        
        /* This test fails because method [org.jsoup.select.QueryParser.consumeIndex] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:385)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:242)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229) */
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
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method consumeIndex()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#consumeIndex()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(StringUtil.isNumeric(indexS), "Index must be numeric");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#consumeIndex()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(StringUtil.isNumeric(indexS), "Index must be numeric");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex_ThrowIllegalArgumentException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#consumeIndex()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(StringUtil.isNumeric(indexS), "Index must be numeric");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConsumeIndex_ThrowIllegalArgumentException_2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 20);
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
    
    ///region OTHER: ERROR SUITE for method consumeIndex()
    
    @Test
    public void testConsumeIndex1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.consumeIndex] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 8, length 9]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:242)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229) */
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
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 31);
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
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 23);
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
        String queue = "!)\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
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
            org.jsoup.select.QueryParser.consumeSubQuery(QueryParser.java:107) */
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
            org.jsoup.select.QueryParser.consumeSubQuery(QueryParser.java:107) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method consumeSubQuery()
    
    @Test
    public void testConsumeSubQuery1() throws Exception  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "(\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        Method consumeSubQueryMethod = queryParserClazz.getDeclaredMethod("consumeSubQuery");
        consumeSubQueryMethod.setAccessible(true);
        java.lang.Object[] consumeSubQueryMethodArguments = new java.lang.Object[0];
        String actual = ((String) consumeSubQueryMethod.invoke(queryParser, consumeSubQueryMethodArguments));
        
        String expected = "(\u0000)";
        
        assertEquals(expected, actual);
        
        TokenQueue queryParserTq = ((TokenQueue) getFieldValue(queryParser, "org.jsoup.select.QueryParser", "tq"));
        int finalQueryParserTqPos = ((Integer) getFieldValue(queryParserTq, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(32, finalQueryParserTqPos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeSubQuery()
    
    @Test
    public void testConsumeSubQuery2() throws Throwable  {
        Class queryParserClazz = Class.forName("org.jsoup.select.QueryParser");
        java.lang.String[] prevCombinators = ((java.lang.String[]) getStaticFieldValue(queryParserClazz, "combinators"));
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
            setStaticField(queryParserClazz, "combinators", combinators);
            QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
            TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
            String queue = "\u0000\u0000\u0000\u0000";
            setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
            setField(tq, "org.jsoup.parser.TokenQueue", "pos", 5);
            setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
            
            /* This test fails because method [org.jsoup.select.QueryParser.consumeSubQuery] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 5]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
                org.jsoup.select.QueryParser.consumeSubQuery(QueryParser.java:115) */
            Method consumeSubQueryMethod = queryParserClazz.getDeclaredMethod("consumeSubQuery");
            consumeSubQueryMethod.setAccessible(true);
            java.lang.Object[] consumeSubQueryMethodArguments = new java.lang.Object[0];
            try {
                consumeSubQueryMethod.invoke(queryParser, consumeSubQueryMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(QueryParser.class, "combinators", prevCombinators);
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
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: tq.matchesWord()
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
            org.jsoup.select.QueryParser.findElements(QueryParser.java:125) */
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
            org.jsoup.select.QueryParser.findElements(QueryParser.java:121) */
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
 * @utbot.executesCondition {@code (tq.matchChomp(".")): False}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchesWord()}
 * @utbot.throwsException {@link org.jsoup.select.Selector$SelectorParseException} when: tq.matchesWord()
 *  */
    @Test(expected = Selector.SelectorParseException.class)
    public void testFindElements_ThrowSelectorParseException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 2);
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
 * @utbot.executesCondition {@code (tq.matchChomp("#")): False}
 * @utbot.executesCondition {@code (tq.matchChomp(".")): True}
 * @utbot.invokes org.jsoup.select.QueryParser#byClass()
 * @utbot.throwsException {@link org.jsoup.select.Selector$SelectorParseException} in: byClass();
 *  */
    @Test(expected = Selector.SelectorParseException.class)
    public void testFindElements_ThrowSelectorParseException_1() throws Throwable  {
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
            org.jsoup.parser.TokenQueue.consumeElementSelector(TokenQueue.java:347)
            org.jsoup.select.QueryParser.byTag(QueryParser.java:167) */
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
            org.jsoup.select.QueryParser.byTag(QueryParser.java:167) */
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
            org.jsoup.parser.TokenQueue.consumeElementSelector(TokenQueue.java:347)
            org.jsoup.select.QueryParser.byTag(QueryParser.java:167) */
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
            org.jsoup.select.QueryParser.allElements(QueryParser.java:212) */
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
    
    ///region Test suites for executable org.jsoup.select.QueryParser.indexGreaterThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexGreaterThan()
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexGreaterThan()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
 *  */
    @Test
    public void testIndexGreaterThan_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexGreaterThan] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:385)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:242)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229)
            org.jsoup.select.QueryParser.indexGreaterThan(QueryParser.java:221) */
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
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229)
            org.jsoup.select.QueryParser.indexGreaterThan(QueryParser.java:221) */
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexGreaterThan()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan_ThrowIllegalArgumentException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexGreaterThan()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexGreaterThan_ThrowIllegalArgumentException_2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
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
        String queue = "\u0000)\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexGreaterThan] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 1, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:242)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229)
            org.jsoup.select.QueryParser.indexGreaterThan(QueryParser.java:221) */
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
        String queue = "!";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        ArrayList evals = new ArrayList();
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 30);
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
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:309)
            org.jsoup.select.QueryParser.combinator(QueryParser.java:82) */
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
            org.jsoup.select.QueryParser.combinator(QueryParser.java:82) */
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
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:309)
            org.jsoup.select.QueryParser.combinator(QueryParser.java:82) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: evals.size() == 1
 *  */
    @Test
    public void testCombinator_ThrowNullPointerException_2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\f";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.combinator(QueryParser.java:86) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: evals.size() == 1
 *  */
    @Test
    public void testCombinator_ThrowNullPointerException_3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.combinator(QueryParser.java:86) */
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
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 38);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.combinator(QueryParser.java:86) */
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
        String queue = "[((((((((";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.combinator(QueryParser.java:86) */
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
    public void testCombinator3() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\t\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 11);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.combinator(QueryParser.java:86) */
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
    public void testCombinator4() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "(\t\t\t\t\t\t\t\t";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.combinator] produces [java.lang.NullPointerException]
            org.jsoup.select.QueryParser.combinator(QueryParser.java:86) */
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
    public void testCombinator5() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 31);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        ArrayList evals = new ArrayList();
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
    public void testCombinator6() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 31);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        ArrayList evals = new ArrayList();
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 31);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        ArrayList evals = new ArrayList();
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        ArrayList evals = new ArrayList();
        StructuralEvaluator.Not not = ((StructuralEvaluator.Not) createInstance("org.jsoup.select.StructuralEvaluator$Not"));
        evals.add(not);
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
        String queue = "\t";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        ArrayList evals = new ArrayList();
        StructuralEvaluator.Not not = ((StructuralEvaluator.Not) createInstance("org.jsoup.select.StructuralEvaluator$Not"));
        evals.add(not);
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 31);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        ArrayList evals = new ArrayList();
        evals.add(null);
        evals.add(null);
        evals.add(null);
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
        ArrayList evals = new ArrayList();
        evals.add(null);
        evals.add(null);
        evals.add(null);
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:360)
            org.jsoup.select.QueryParser.byId(QueryParser.java:155) */
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
            org.jsoup.select.QueryParser.byId(QueryParser.java:155) */
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
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:360)
            org.jsoup.select.QueryParser.byId(QueryParser.java:155) */
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
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:360)
            org.jsoup.select.QueryParser.byClass(QueryParser.java:161) */
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
            org.jsoup.select.QueryParser.byClass(QueryParser.java:161) */
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
            org.jsoup.parser.TokenQueue.consumeCssIdentifier(TokenQueue.java:360)
            org.jsoup.select.QueryParser.byClass(QueryParser.java:161) */
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
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexLessThan] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:385)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:242)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229)
            org.jsoup.select.QueryParser.indexLessThan(QueryParser.java:217) */
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
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229)
            org.jsoup.select.QueryParser.indexLessThan(QueryParser.java:217) */
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexLessThan(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexLessThan()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexLessThan(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan_ThrowIllegalArgumentException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexLessThan()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexLessThan(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan_ThrowIllegalArgumentException_2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
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
        String queue = "\u0000)\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexLessThan] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 1, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:242)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229)
            org.jsoup.select.QueryParser.indexLessThan(QueryParser.java:217) */
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
        String queue = "!";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        ArrayList evals = new ArrayList();
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 30);
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
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexEquals] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:155)
            org.jsoup.parser.TokenQueue.remainder(TokenQueue.java:385)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:187)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:242)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229)
            org.jsoup.select.QueryParser.indexEquals(QueryParser.java:225) */
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
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229)
            org.jsoup.select.QueryParser.indexEquals(QueryParser.java:225) */
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexEquals(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexEquals_ThrowIllegalArgumentException() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexEquals()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexEquals(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexEquals_ThrowIllegalArgumentException_1() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link QueryParser}
 * @utbot.methodUnderTest {@link org.jsoup.select.QueryParser#indexEquals()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: evals.add(new Evaluator.IndexEquals(consumeIndex()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexEquals_ThrowIllegalArgumentException_2() throws Throwable  {
        QueryParser queryParser = ((QueryParser) createInstance("org.jsoup.select.QueryParser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000";
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
        String queue = "\u0000)\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", Integer.MIN_VALUE);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        
        /* This test fails because method [org.jsoup.select.QueryParser.indexEquals] produces [java.lang.StringIndexOutOfBoundsException: begin -2147483648, end 1, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:183)
            org.jsoup.parser.TokenQueue.chompTo(TokenQueue.java:242)
            org.jsoup.select.QueryParser.consumeIndex(QueryParser.java:229)
            org.jsoup.select.QueryParser.indexEquals(QueryParser.java:225) */
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
        String queue = "!";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(queryParser, "org.jsoup.select.QueryParser", "tq", tq);
        ArrayList evals = new ArrayList();
        setField(queryParser, "org.jsoup.select.QueryParser", "evals", evals);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields995329420124200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields995329420124200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass995329420129300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields995329420124200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass995329420129300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields995329420450000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields995329420450000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass995329420451900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields995329420450000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass995329420451900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields995329421072800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields995329421072800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass995329421074300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields995329421072800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass995329421074300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields995329421809200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields995329421809200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass995329421811000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields995329421809200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass995329421811000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

