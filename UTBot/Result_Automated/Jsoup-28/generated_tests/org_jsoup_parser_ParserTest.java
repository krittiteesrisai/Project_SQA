package org.jsoup.parser;

import org.junit.Test;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.jsoup.helper.DescendableLinkedList;
import java.util.ArrayList;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_jsoup_parser_ParserTest {
    ///region Test suites for executable org.jsoup.parser.Parser.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parse(html, baseUri, ParseErrorList.noTracking());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() {
        Parser.parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parse(html, baseUri, ParseErrorList.noTracking());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() {
        String string = "";
        
        Parser.parse(string, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parse(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
     */
    @Test(expected = ExceptionInInitializerError.class)
    public void testParseThrowsEIIEWithBlankStringAndNonEmptyString() {
        Parser.parse("\n\t\r", "-\uFFF43");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String, java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParse1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            String string = "";
            String string1 = "";
            
            Parser.parse(string, string1);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseInput
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseInput(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseInput(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Document doc = treeBuilder.parse(html, baseUri, errors);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseInput_ThrowIllegalArgumentException_2() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parser, "org.jsoup.parser.Parser", "maxErrors", 1);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        String string = "";
        
        parser.parseInput(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseInput(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Document doc = treeBuilder.parse(html, baseUri, errors);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseInput_ThrowIllegalArgumentException() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterFrameset;
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parser, "org.jsoup.parser.Parser", "maxErrors", 1);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        String string = "";
        
        parser.parseInput(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseInput(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#noTracking()}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#noTracking()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Document doc = treeBuilder.parse(html, baseUri, errors);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseInput_ThrowIllegalArgumentException_1() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterFrameset;
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        
        parser.parseInput(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseInput(java.lang.String, java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseInput1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
            Parser parser = new Parser(xmlTreeBuilder);
            parser.setTrackErrors(-2147483647);
            String string = "";
            
            parser.parseInput(string, string);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseInput2() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
            HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            HtmlTreeBuilderState state = HtmlTreeBuilderState.InFrameset;
            setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
            setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
            setField(parser, "org.jsoup.parser.Parser", "maxErrors", 1);
            String string = "";
            
            parser.parseInput(string, string);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseInput3() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
            HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
            setField(parser, "org.jsoup.parser.Parser", "maxErrors", -2147483616);
            ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
            setField(parser, "org.jsoup.parser.Parser", "errors", errors);
            String string = "";
            
            parser.parseInput(string, string);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseInput4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
            Parser parser = new Parser(xmlTreeBuilder);
            parser.setTrackErrors(1);
            String string = "";
            
            parser.parseInput(string, string);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.setTreeBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTreeBuilder(org.jsoup.parser.TreeBuilder)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#setTreeBuilder(org.jsoup.parser.TreeBuilder)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetTreeBuilder_Return() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Parser parser = new Parser(null);
        
        Parser actual = parser.setTreeBuilder(null);
        
        TreeBuilder actualTreeBuilder = actual.getTreeBuilder();
        assertNull(actualTreeBuilder);
        
        int parserMaxErrors = ((Integer) getFieldValue(parser, "org.jsoup.parser.Parser", "maxErrors"));
        int actualMaxErrors = ((Integer) getFieldValue(actual, "org.jsoup.parser.Parser", "maxErrors"));
        assertEquals(parserMaxErrors, actualMaxErrors);
        
        ParseErrorList actualErrors = ((ParseErrorList) getFieldValue(actual, "org.jsoup.parser.Parser", "errors"));
        assertNull(actualErrors);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.getErrors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErrors()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#getErrors()}
 * @utbot.returnsFrom {@code return errors;}
 *  */
    @Test
    public void testGetErrors_ReturnErrors() {
        Parser parser = new Parser(null);
        
        List actual = parser.getErrors();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.setTrackErrors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTrackErrors(int)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#setTrackErrors(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetTrackErrors_Return() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Parser parser = new Parser(null);
        parser.setTrackErrors(-255);
        
        Parser actual = parser.setTrackErrors(-255);
        
        TreeBuilder actualTreeBuilder = actual.getTreeBuilder();
        assertNull(actualTreeBuilder);
        
        int parserMaxErrors = ((Integer) getFieldValue(parser, "org.jsoup.parser.Parser", "maxErrors"));
        int actualMaxErrors = ((Integer) getFieldValue(actual, "org.jsoup.parser.Parser", "maxErrors"));
        assertEquals(parserMaxErrors, actualMaxErrors);
        
        ParseErrorList actualErrors = ((ParseErrorList) getFieldValue(actual, "org.jsoup.parser.Parser", "errors"));
        assertNull(actualErrors);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.htmlParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method htmlParser()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#htmlParser()}
 * @utbot.returnsFrom {@code return new Parser(new HtmlTreeBuilder());}
 *  */
    @Test
    public void testHtmlParser_Return() throws Exception  {
        Parser actual = Parser.htmlParser();
        
        Parser expected = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        DescendableLinkedList formattingElements = ((DescendableLinkedList) createInstance("org.jsoup.helper.DescendableLinkedList"));
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        ArrayList pendingTableCharacters = new ArrayList();
        treeBuilder.setPendingTableCharacters(pendingTableCharacters);
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", true);
        setField(expected, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        
        TreeBuilder expectedTreeBuilder = expected.getTreeBuilder();
        TreeBuilder actualTreeBuilder = actual.getTreeBuilder();
        HtmlTreeBuilderState actualTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        assertNull(actualTreeBuilderState);
        
        HtmlTreeBuilderState actualTreeBuilderOriginalState = ((HtmlTreeBuilderState) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "originalState"));
        assertNull(actualTreeBuilderOriginalState);
        
        boolean actualTreeBuilderBaseUriSetFromDoc = ((Boolean) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "baseUriSetFromDoc"));
        assertFalse(actualTreeBuilderBaseUriSetFromDoc);
        
        Element actualTreeBuilderHeadElement = (((HtmlTreeBuilder) actualTreeBuilder)).getHeadElement();
        assertNull(actualTreeBuilderHeadElement);
        
        Element actualTreeBuilderFormElement = (((HtmlTreeBuilder) actualTreeBuilder)).getFormElement();
        assertNull(actualTreeBuilderFormElement);
        
        Element actualTreeBuilderContextElement = ((Element) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "contextElement"));
        assertNull(actualTreeBuilderContextElement);
        
        DescendableLinkedList expectedTreeBuilderFormattingElements = ((DescendableLinkedList) getFieldValue(expectedTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements"));
        DescendableLinkedList actualTreeBuilderFormattingElements = ((DescendableLinkedList) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements"));
        int expectedTreeBuilderFormattingElementsSize = ((Integer) getFieldValue(expectedTreeBuilderFormattingElements, "java.util.LinkedList", "size"));
        int actualTreeBuilderFormattingElementsSize = ((Integer) getFieldValue(actualTreeBuilderFormattingElements, "java.util.LinkedList", "size"));
        assertEquals(expectedTreeBuilderFormattingElementsSize, actualTreeBuilderFormattingElementsSize);
        
        Object actualTreeBuilderFormattingElementsFirst = getFieldValue(actualTreeBuilderFormattingElements, "java.util.LinkedList", "first");
        assertNull(actualTreeBuilderFormattingElementsFirst);
        
        Object actualTreeBuilderFormattingElementsLast = getFieldValue(actualTreeBuilderFormattingElements, "java.util.LinkedList", "last");
        assertNull(actualTreeBuilderFormattingElementsLast);
        
        int expectedTreeBuilderFormattingElementsModCount = ((Integer) getFieldValue(expectedTreeBuilderFormattingElements, "java.util.AbstractList", "modCount"));
        int actualTreeBuilderFormattingElementsModCount = ((Integer) getFieldValue(actualTreeBuilderFormattingElements, "java.util.AbstractList", "modCount"));
        assertEquals(expectedTreeBuilderFormattingElementsModCount, actualTreeBuilderFormattingElementsModCount);
        
        List expectedTreeBuilderPendingTableCharacters = (((HtmlTreeBuilder) expectedTreeBuilder)).getPendingTableCharacters();
        List actualTreeBuilderPendingTableCharacters = (((HtmlTreeBuilder) actualTreeBuilder)).getPendingTableCharacters();
        assertTrue(deepEquals(expectedTreeBuilderPendingTableCharacters, actualTreeBuilderPendingTableCharacters));
        
        boolean actualTreeBuilderFramesetOk = ((Boolean) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "framesetOk"));
        assertTrue(actualTreeBuilderFramesetOk);
        
        boolean actualTreeBuilderFosterInserts = ((Boolean) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fosterInserts"));
        assertFalse(actualTreeBuilderFosterInserts);
        
        boolean actualTreeBuilderFragmentParsing = ((Boolean) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fragmentParsing"));
        assertFalse(actualTreeBuilderFragmentParsing);
        
        CharacterReader actualTreeBuilderReader = actualTreeBuilder.reader;
        assertNull(actualTreeBuilderReader);
        
        Tokeniser actualTreeBuilderTokeniser = actualTreeBuilder.tokeniser;
        assertNull(actualTreeBuilderTokeniser);
        
        Document actualTreeBuilderDoc = actualTreeBuilder.doc;
        assertNull(actualTreeBuilderDoc);
        
        DescendableLinkedList actualTreeBuilderStack = actualTreeBuilder.stack;
        assertNull(actualTreeBuilderStack);
        
        String actualTreeBuilderBaseUri = actualTreeBuilder.baseUri;
        assertNull(actualTreeBuilderBaseUri);
        
        Token actualTreeBuilderCurrentToken = actualTreeBuilder.currentToken;
        assertNull(actualTreeBuilderCurrentToken);
        
        ParseErrorList actualTreeBuilderErrors = actualTreeBuilder.errors;
        assertNull(actualTreeBuilderErrors);
        
        int expectedMaxErrors = ((Integer) getFieldValue(expected, "org.jsoup.parser.Parser", "maxErrors"));
        int actualMaxErrors = ((Integer) getFieldValue(actual, "org.jsoup.parser.Parser", "maxErrors"));
        assertEquals(expectedMaxErrors, actualMaxErrors);
        
        ParseErrorList actualErrors = ((ParseErrorList) getFieldValue(actual, "org.jsoup.parser.Parser", "errors"));
        assertNull(actualErrors);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.isTrackErrors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTrackErrors()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#isTrackErrors()}
 * @utbot.returnsFrom {@code return maxErrors > 0;}
 *  */
    @Test
    public void testIsTrackErrors_MaxErrorsLessOrEqualZero() {
        Parser parser = new Parser(null);
        parser.setTrackErrors(0);
        
        boolean actual = parser.isTrackErrors();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#isTrackErrors()}
 * @utbot.returnsFrom {@code return maxErrors > 0;}
 *  */
    @Test
    public void testIsTrackErrors_MaxErrorsGreaterThanZero() {
        Parser parser = new Parser(null);
        parser.setTrackErrors(1);
        
        boolean actual = parser.isTrackErrors();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parseFragment(fragmentHtml, context, baseUri, ParseErrorList.noTracking());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFragment_ThrowIllegalArgumentException() {
        Parser.parseFragment(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parseFragment(fragmentHtml, context, baseUri, ParseErrorList.noTracking());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFragment_ThrowIllegalArgumentException_1() {
        String string = "";
        
        Parser.parseFragment(string, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseFragment1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            String string = "";
            String string1 = "";
            
            Parser.parseFragment(string, null, string1);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseBodyFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseBodyFragment(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Document#createShell(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Document doc = Document.createShell(baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_ThrowIllegalArgumentException() {
        Parser.parseBodyFragment(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseBodyFragment(java.lang.String, java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBodyFragment1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            String string = "";
            
            Parser.parseBodyFragment(null, string);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.getTreeBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTreeBuilder()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#getTreeBuilder()}
 * @utbot.returnsFrom {@code return treeBuilder;}
 *  */
    @Test
    public void testGetTreeBuilder_ReturnTreeBuilder() {
        Parser parser = new Parser(null);
        
        TreeBuilder actual = parser.getTreeBuilder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.xmlParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method xmlParser()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#xmlParser()}
 * @utbot.returnsFrom {@code return new Parser(new XmlTreeBuilder());}
 *  */
    @Test
    public void testXmlParser_Return() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Parser actual = Parser.xmlParser();
        
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser expected = new Parser(xmlTreeBuilder);
        expected.setTrackErrors(0);
        
        TreeBuilder expectedTreeBuilder = expected.getTreeBuilder();
        TreeBuilder actualTreeBuilder = actual.getTreeBuilder();
        CharacterReader actualTreeBuilderReader = actualTreeBuilder.reader;
        assertNull(actualTreeBuilderReader);
        
        Tokeniser actualTreeBuilderTokeniser = actualTreeBuilder.tokeniser;
        assertNull(actualTreeBuilderTokeniser);
        
        Document actualTreeBuilderDoc = actualTreeBuilder.doc;
        assertNull(actualTreeBuilderDoc);
        
        DescendableLinkedList actualTreeBuilderStack = actualTreeBuilder.stack;
        assertNull(actualTreeBuilderStack);
        
        String actualTreeBuilderBaseUri = actualTreeBuilder.baseUri;
        assertNull(actualTreeBuilderBaseUri);
        
        Token actualTreeBuilderCurrentToken = actualTreeBuilder.currentToken;
        assertNull(actualTreeBuilderCurrentToken);
        
        ParseErrorList actualTreeBuilderErrors = actualTreeBuilder.errors;
        assertNull(actualTreeBuilderErrors);
        
        int expectedMaxErrors = ((Integer) getFieldValue(expected, "org.jsoup.parser.Parser", "maxErrors"));
        int actualMaxErrors = ((Integer) getFieldValue(actual, "org.jsoup.parser.Parser", "maxErrors"));
        assertEquals(expectedMaxErrors, actualMaxErrors);
        
        ParseErrorList actualErrors = ((ParseErrorList) getFieldValue(actual, "org.jsoup.parser.Parser", "errors"));
        assertNull(actualErrors);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseBodyFragmentRelaxed
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseBodyFragmentRelaxed(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragmentRelaxed(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(bodyHtml, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragmentRelaxed_ThrowIllegalArgumentException() {
        Parser.parseBodyFragmentRelaxed(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragmentRelaxed(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(bodyHtml, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragmentRelaxed_ThrowIllegalArgumentException_1() {
        String string = "";
        
        Parser.parseBodyFragmentRelaxed(string, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseBodyFragmentRelaxed(java.lang.String, java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBodyFragmentRelaxed1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            String string = "";
            String string1 = "";
            
            Parser.parseBodyFragmentRelaxed(string, string1);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields996876061495200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields996876061495200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass996876061505600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields996876061495200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass996876061505600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields996876064562600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields996876064562600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass996876064566600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields996876064562600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass996876064566600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields996876065119400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields996876065119400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass996876065122800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields996876065119400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass996876065122800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields996876065469300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields996876065469300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass996876065472800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields996876065469300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass996876065472800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

