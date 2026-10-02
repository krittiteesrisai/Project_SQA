package org.jsoup.parser;

import org.junit.Test;
import java.util.Map;
import java.util.LinkedHashMap;
import org.jsoup.nodes.Element;
import java.util.List;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token.TokenType;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.nodes.Document;
import java.util.ArrayList;
import org.jsoup.nodes.FormElement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;
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
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#noTracking()}
 * @utbot.invokes {@link org.jsoup.parser.TreeBuilder#defaultSettings()}
 * @utbot.invokes {@link org.jsoup.parser.TreeBuilder#parse(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parse(html, baseUri, ParseErrorList.noTracking(), treeBuilder.defaultSettings());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            String string = "";
            
            Parser.parse(string, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
     */
    @Test(expected = ExceptionInInitializerError.class)
    public void testParseThrowsEIIEWithBlankStringAndNonEmptyString() {
        Parser.parse("\n\t\r", "-\uFFF43");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.settings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method settings(org.jsoup.parser.ParseSettings)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#settings(org.jsoup.parser.ParseSettings)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSettings_Return() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        Parser actual = parser.settings(null);
        
        TreeBuilder actualTreeBuilder = actual.getTreeBuilder();
        assertNull(actualTreeBuilder);
        
        int parserMaxErrors = ((Integer) getFieldValue(parser, "org.jsoup.parser.Parser", "maxErrors"));
        int actualMaxErrors = ((Integer) getFieldValue(actual, "org.jsoup.parser.Parser", "maxErrors"));
        assertEquals(parserMaxErrors, actualMaxErrors);
        
        ParseErrorList actualErrors = ((ParseErrorList) getFieldValue(actual, "org.jsoup.parser.Parser", "errors"));
        assertNull(actualErrors);
        
        ParseSettings actualSettings = ((ParseSettings) getFieldValue(actual, "org.jsoup.parser.Parser", "settings"));
        assertNull(actualSettings);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.settings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method settings()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#settings()}
 * @utbot.returnsFrom {@code return settings;}
 *  */
    @Test
    public void testSettings_ReturnSettings() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        ParseSettings actual = parser.settings();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseBodyFragmentRelaxed
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseBodyFragmentRelaxed(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragmentRelaxed(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(bodyHtml, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragmentRelaxed_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            String string = "";
            
            Parser.parseBodyFragmentRelaxed(string, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseBodyFragmentRelaxed(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragmentRelaxed(java.lang.String,java.lang.String)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBodyFragmentRelaxedThrowsNCDFEWithBlankStringAndNonEmptyString() {
        Parser.parseBodyFragmentRelaxed("\n\t\r", "-\uFFF43");
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
    public void testIsTrackErrors_MaxErrorsLessOrEqualZero() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        boolean actual = parser.isTrackErrors();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#isTrackErrors()}
 * @utbot.returnsFrom {@code return maxErrors > 0;}
 *  */
    @Test
    public void testIsTrackErrors_MaxErrorsGreaterThanZero() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parser, "org.jsoup.parser.Parser", "maxErrors", 1);
        
        boolean actual = parser.isTrackErrors();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.unescapeEntities
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeEntities(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#unescapeEntities(java.lang.String,boolean)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#noTracking()}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#unescapeEntities(boolean)}
 * @utbot.returnsFrom {@code return tokeniser.unescapeEntities(inAttribute);}
 *  */
    @Test
    public void testUnescapeEntities_ParseErrorListNoTracking() {
        String string = "";
        
        String actual = Parser.unescapeEntities(string, false);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeEntities(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#unescapeEntities(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tokeniser tokeniser = new Tokeniser(new CharacterReader(string), ParseErrorList.noTracking());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeEntities_ThrowIllegalArgumentException() {
        Parser.unescapeEntities(null, false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unescapeEntities(java.lang.String, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#unescapeEntities(java.lang.String,boolean)}
     */
    @Test
    public void testUnescapeEntitiesWithBlankString() {
        String actual = Parser.unescapeEntities("\n\t\r", false);
        
        String expected = "\n\t\r";
        
        assertEquals(expected, actual);
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
    public void testSetTreeBuilder_Return() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        Parser actual = parser.setTreeBuilder(null);
        
        TreeBuilder actualTreeBuilder = actual.getTreeBuilder();
        assertNull(actualTreeBuilder);
        
        int parserMaxErrors = ((Integer) getFieldValue(parser, "org.jsoup.parser.Parser", "maxErrors"));
        int actualMaxErrors = ((Integer) getFieldValue(actual, "org.jsoup.parser.Parser", "maxErrors"));
        assertEquals(parserMaxErrors, actualMaxErrors);
        
        ParseErrorList actualErrors = ((ParseErrorList) getFieldValue(actual, "org.jsoup.parser.Parser", "errors"));
        assertNull(actualErrors);
        
        ParseSettings actualSettings = ((ParseSettings) getFieldValue(actual, "org.jsoup.parser.Parser", "settings"));
        assertNull(actualSettings);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#noTracking()}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#defaultSettings()}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parseFragment(fragmentHtml, context, baseUri, ParseErrorList.noTracking(), treeBuilder.defaultSettings());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFragment_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            String string = "";
            
            Parser.parseFragment(string, null, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseFragment1() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            String string = "";
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string1 = "";
            
            Parser.parseFragment(string, element, string1);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
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
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            String string = "";
            
            Parser.parseBodyFragment(null, string);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(Tag.class, "tags", prevTags);
        }
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
    public void testGetErrors_ReturnErrors() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        List actual = parser.getErrors();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseInput
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseInput(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseInput(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parse(html, baseUri, errors, settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseInput_ThrowIllegalArgumentException_2() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parser, "org.jsoup.parser.Parser", "maxErrors", 1);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        
        parser.parseInput(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseInput(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#noTracking()}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#noTracking()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parse(html, baseUri, errors, settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseInput_ThrowIllegalArgumentException_1() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Text;
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        
        parser.parseInput(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseInput(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parse(html, baseUri, errors, settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseInput_ThrowIllegalArgumentException() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Text;
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parser, "org.jsoup.parser.Parser", "maxErrors", 1);
        String string = "";
        
        parser.parseInput(string, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseInput(java.lang.String, java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseInput1() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
            XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
            setField(parser, "org.jsoup.parser.Parser", "maxErrors", -2147483647);
            String string = "";
            
            parser.parseInput(string, string);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseInput2() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
            XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
            setField(parser, "org.jsoup.parser.Parser", "maxErrors", 1);
            String string = "";
            
            parser.parseInput(string, string);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseInput3() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
            HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
            setField(parser, "org.jsoup.parser.Parser", "maxErrors", 16);
            ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
            setField(parser, "org.jsoup.parser.Parser", "errors", errors);
            String string = "";
            String string1 = "";
            
            parser.parseInput(string, string1);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseInput4() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
            HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
            setField(parser, "org.jsoup.parser.Parser", "maxErrors", -2147483644);
            String string = "";
            String string1 = "";
            
            parser.parseInput(string, string1);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
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
    public void testGetTreeBuilder_ReturnTreeBuilder() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        TreeBuilder actual = parser.getTreeBuilder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseXmlFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseXmlFragment(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseXmlFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parseFragment(fragmentXml, baseUri, ParseErrorList.noTracking(), treeBuilder.defaultSettings());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseXmlFragment_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            
            Parser.parseXmlFragment(null, null);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseXmlFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return treeBuilder.parseFragment(fragmentXml, baseUri, ParseErrorList.noTracking(), treeBuilder.defaultSettings());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseXmlFragment_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            String string = "";
            
            Parser.parseXmlFragment(string, null);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseXmlFragment(java.lang.String, java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseXmlFragment1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            ParseSettings htmlDefault = new ParseSettings(false, false);
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            String string = "";
            String string1 = "";
            
            Parser.parseXmlFragment(string, string1);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(Tag.class, "tags", prevTags);
        }
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
    public void testSetTrackErrors_Return() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parser, "org.jsoup.parser.Parser", "maxErrors", -255);
        
        Parser actual = parser.setTrackErrors(-255);
        
        TreeBuilder actualTreeBuilder = actual.getTreeBuilder();
        assertNull(actualTreeBuilder);
        
        int parserMaxErrors = ((Integer) getFieldValue(parser, "org.jsoup.parser.Parser", "maxErrors"));
        int actualMaxErrors = ((Integer) getFieldValue(actual, "org.jsoup.parser.Parser", "maxErrors"));
        assertEquals(parserMaxErrors, actualMaxErrors);
        
        ParseErrorList actualErrors = ((ParseErrorList) getFieldValue(actual, "org.jsoup.parser.Parser", "errors"));
        assertNull(actualErrors);
        
        ParseSettings actualSettings = ((ParseSettings) getFieldValue(actual, "org.jsoup.parser.Parser", "settings"));
        assertNull(actualSettings);
        
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
    public void testXmlParser_Return() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            
            Parser actual = Parser.xmlParser();
            
            Parser expected = ((Parser) createInstance("org.jsoup.parser.Parser"));
            XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
            StringBuilder pendingAttributeValue = ((StringBuilder) createInstance("java.lang.StringBuilder"));
            setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
            Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            start.attributes = attributes;
            Token.TokenType type = Token.TokenType.StartTag;
            start.type = type;
            setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
            Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
            StringBuilder pendingAttributeValue1 = ((StringBuilder) createInstance("java.lang.StringBuilder"));
            setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue1);
            Token.TokenType type1 = Token.TokenType.EndTag;
            end.type = type1;
            setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
            setField(expected, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
            ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
            setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
            setField(settings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase", true);
            setField(expected, "org.jsoup.parser.Parser", "settings", settings);
            
            TreeBuilder expectedTreeBuilder = expected.getTreeBuilder();
            TreeBuilder actualTreeBuilder = actual.getTreeBuilder();
            CharacterReader actualTreeBuilderReader = actualTreeBuilder.reader;
            assertNull(actualTreeBuilderReader);
            
            Tokeniser actualTreeBuilderTokeniser = actualTreeBuilder.tokeniser;
            assertNull(actualTreeBuilderTokeniser);
            
            Document actualTreeBuilderDoc = actualTreeBuilder.doc;
            assertNull(actualTreeBuilderDoc);
            
            ArrayList actualTreeBuilderStack = actualTreeBuilder.stack;
            assertNull(actualTreeBuilderStack);
            
            String actualTreeBuilderBaseUri = actualTreeBuilder.baseUri;
            assertNull(actualTreeBuilderBaseUri);
            
            Token actualTreeBuilderCurrentToken = actualTreeBuilder.currentToken;
            assertNull(actualTreeBuilderCurrentToken);
            
            ParseErrorList actualTreeBuilderErrors = actualTreeBuilder.errors;
            assertNull(actualTreeBuilderErrors);
            
            ParseSettings actualTreeBuilderSettings = actualTreeBuilder.settings;
            assertNull(actualTreeBuilderSettings);
            
            Token.StartTag expectedTreeBuilderStart = ((Token.StartTag) getFieldValue(expectedTreeBuilder, "org.jsoup.parser.TreeBuilder", "start"));
            Token.StartTag actualTreeBuilderStart = ((Token.StartTag) getFieldValue(actualTreeBuilder, "org.jsoup.parser.TreeBuilder", "start"));
            String actualTreeBuilderStartTagName = actualTreeBuilderStart.tagName;
            assertNull(actualTreeBuilderStartTagName);
            
            String actualTreeBuilderStartNormalName = actualTreeBuilderStart.normalName;
            assertNull(actualTreeBuilderStartNormalName);
            
            String actualTreeBuilderStartPendingAttributeName = ((String) getFieldValue(actualTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
            assertNull(actualTreeBuilderStartPendingAttributeName);
            
            StringBuilder expectedTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(expectedTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            StringBuilder actualTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(actualTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            
            String actualTreeBuilderStartPendingAttributeValueS = ((String) getFieldValue(actualTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS"));
            assertNull(actualTreeBuilderStartPendingAttributeValueS);
            
            boolean actualTreeBuilderStartHasEmptyAttributeValue = ((Boolean) getFieldValue(actualTreeBuilderStart, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue"));
            assertFalse(actualTreeBuilderStartHasEmptyAttributeValue);
            
            boolean actualTreeBuilderStartHasPendingAttributeValue = ((Boolean) getFieldValue(actualTreeBuilderStart, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue"));
            assertFalse(actualTreeBuilderStartHasPendingAttributeValue);
            
            boolean actualTreeBuilderStartSelfClosing = actualTreeBuilderStart.selfClosing;
            assertFalse(actualTreeBuilderStartSelfClosing);
            
            Attributes expectedTreeBuilderStartAttributes = expectedTreeBuilderStart.attributes;
            Attributes actualTreeBuilderStartAttributes = actualTreeBuilderStart.attributes;
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expectedTreeBuilderStartAttributes, actualTreeBuilderStartAttributes));
            
            Token.TokenType expectedTreeBuilderStartType = expectedTreeBuilderStart.type;
            Token.TokenType actualTreeBuilderStartType = actualTreeBuilderStart.type;
            assertEquals(expectedTreeBuilderStartType, actualTreeBuilderStartType);
            
            Token.EndTag expectedTreeBuilderEnd = ((Token.EndTag) getFieldValue(expectedTreeBuilder, "org.jsoup.parser.TreeBuilder", "end"));
            Token.EndTag actualTreeBuilderEnd = ((Token.EndTag) getFieldValue(actualTreeBuilder, "org.jsoup.parser.TreeBuilder", "end"));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            StringBuilder expectedTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(expectedTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            StringBuilder actualTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(actualTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            Attributes actualTreeBuilderEndAttributes = actualTreeBuilderEnd.attributes;
            assertNull(actualTreeBuilderEndAttributes);
            
            Token.TokenType expectedTreeBuilderEndType = expectedTreeBuilderEnd.type;
            Token.TokenType actualTreeBuilderEndType = actualTreeBuilderEnd.type;
            assertEquals(expectedTreeBuilderEndType, actualTreeBuilderEndType);
            
            int expectedMaxErrors = ((Integer) getFieldValue(expected, "org.jsoup.parser.Parser", "maxErrors"));
            int actualMaxErrors = ((Integer) getFieldValue(actual, "org.jsoup.parser.Parser", "maxErrors"));
            assertEquals(expectedMaxErrors, actualMaxErrors);
            
            ParseErrorList actualErrors = ((ParseErrorList) getFieldValue(actual, "org.jsoup.parser.Parser", "errors"));
            assertNull(actualErrors);
            
            ParseSettings expectedSettings = ((ParseSettings) getFieldValue(expected, "org.jsoup.parser.Parser", "settings"));
            ParseSettings actualSettings = ((ParseSettings) getFieldValue(actual, "org.jsoup.parser.Parser", "settings"));
            boolean actualSettingsPreserveTagCase = ((Boolean) getFieldValue(actualSettings, "org.jsoup.parser.ParseSettings", "preserveTagCase"));
            assertTrue(actualSettingsPreserveTagCase);
            
            boolean actualSettingsPreserveAttributeCase = ((Boolean) getFieldValue(actualSettings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase"));
            assertTrue(actualSettingsPreserveAttributeCase);
            
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
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
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            
            Parser actual = Parser.htmlParser();
            
            Parser expected = ((Parser) createInstance("org.jsoup.parser.Parser"));
            HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            ArrayList formattingElements = new ArrayList();
            setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
            ArrayList pendingTableCharacters = new ArrayList();
            treeBuilder.setPendingTableCharacters(pendingTableCharacters);
            Token.EndTag emptyEnd = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
            StringBuilder pendingAttributeValue = ((StringBuilder) createInstance("java.lang.StringBuilder"));
            setField(emptyEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
            Token.TokenType type = Token.TokenType.EndTag;
            emptyEnd.type = type;
            setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "emptyEnd", emptyEnd);
            setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", true);
            java.lang.String[] specificScopeTarget = {null};
            setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
            StringBuilder pendingAttributeValue1 = ((StringBuilder) createInstance("java.lang.StringBuilder"));
            setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue1);
            Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            start.attributes = attributes;
            Token.TokenType type1 = Token.TokenType.StartTag;
            start.type = type1;
            setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
            Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
            StringBuilder pendingAttributeValue2 = ((StringBuilder) createInstance("java.lang.StringBuilder"));
            setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue2);
            end.type = type;
            setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
            setField(expected, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
            ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
            setField(expected, "org.jsoup.parser.Parser", "settings", settings);
            
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
            
            FormElement actualTreeBuilderFormElement = (((HtmlTreeBuilder) actualTreeBuilder)).getFormElement();
            assertNull(actualTreeBuilderFormElement);
            
            Element actualTreeBuilderContextElement = ((Element) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "contextElement"));
            assertNull(actualTreeBuilderContextElement);
            
            ArrayList expectedTreeBuilderFormattingElements = ((ArrayList) getFieldValue(expectedTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements"));
            ArrayList actualTreeBuilderFormattingElements = ((ArrayList) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements"));
            assertTrue(deepEquals(expectedTreeBuilderFormattingElements, actualTreeBuilderFormattingElements));
            
            List expectedTreeBuilderPendingTableCharacters = (((HtmlTreeBuilder) expectedTreeBuilder)).getPendingTableCharacters();
            List actualTreeBuilderPendingTableCharacters = (((HtmlTreeBuilder) actualTreeBuilder)).getPendingTableCharacters();
            assertTrue(deepEquals(expectedTreeBuilderPendingTableCharacters, actualTreeBuilderPendingTableCharacters));
            
            Token.EndTag expectedTreeBuilderEmptyEnd = ((Token.EndTag) getFieldValue(expectedTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "emptyEnd"));
            Token.EndTag actualTreeBuilderEmptyEnd = ((Token.EndTag) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "emptyEnd"));
            String actualTreeBuilderEmptyEndTagName = actualTreeBuilderEmptyEnd.tagName;
            assertNull(actualTreeBuilderEmptyEndTagName);
            
            String actualTreeBuilderEmptyEndNormalName = actualTreeBuilderEmptyEnd.normalName;
            assertNull(actualTreeBuilderEmptyEndNormalName);
            
            String actualTreeBuilderEmptyEndPendingAttributeName = ((String) getFieldValue(actualTreeBuilderEmptyEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
            assertNull(actualTreeBuilderEmptyEndPendingAttributeName);
            
            StringBuilder expectedTreeBuilderEmptyEndPendingAttributeValue = ((StringBuilder) getFieldValue(expectedTreeBuilderEmptyEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            StringBuilder actualTreeBuilderEmptyEndPendingAttributeValue = ((StringBuilder) getFieldValue(actualTreeBuilderEmptyEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            
            String actualTreeBuilderEmptyEndPendingAttributeValueS = ((String) getFieldValue(actualTreeBuilderEmptyEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS"));
            assertNull(actualTreeBuilderEmptyEndPendingAttributeValueS);
            
            boolean actualTreeBuilderEmptyEndHasEmptyAttributeValue = ((Boolean) getFieldValue(actualTreeBuilderEmptyEnd, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue"));
            assertFalse(actualTreeBuilderEmptyEndHasEmptyAttributeValue);
            
            boolean actualTreeBuilderEmptyEndHasPendingAttributeValue = ((Boolean) getFieldValue(actualTreeBuilderEmptyEnd, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue"));
            assertFalse(actualTreeBuilderEmptyEndHasPendingAttributeValue);
            
            boolean actualTreeBuilderEmptyEndSelfClosing = actualTreeBuilderEmptyEnd.selfClosing;
            assertFalse(actualTreeBuilderEmptyEndSelfClosing);
            
            Attributes actualTreeBuilderEmptyEndAttributes = actualTreeBuilderEmptyEnd.attributes;
            assertNull(actualTreeBuilderEmptyEndAttributes);
            
            Token.TokenType expectedTreeBuilderEmptyEndType = expectedTreeBuilderEmptyEnd.type;
            Token.TokenType actualTreeBuilderEmptyEndType = actualTreeBuilderEmptyEnd.type;
            assertEquals(expectedTreeBuilderEmptyEndType, actualTreeBuilderEmptyEndType);
            
            boolean actualTreeBuilderFramesetOk = ((Boolean) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "framesetOk"));
            assertTrue(actualTreeBuilderFramesetOk);
            
            boolean actualTreeBuilderFosterInserts = ((Boolean) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fosterInserts"));
            assertFalse(actualTreeBuilderFosterInserts);
            
            boolean actualTreeBuilderFragmentParsing = ((Boolean) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fragmentParsing"));
            assertFalse(actualTreeBuilderFragmentParsing);
            
            java.lang.String[] expectedTreeBuilderSpecificScopeTarget = ((java.lang.String[]) getFieldValue(expectedTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget"));
            java.lang.String[] actualTreeBuilderSpecificScopeTarget = ((java.lang.String[]) getFieldValue(actualTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget"));
            int expectedTreeBuilderSpecificScopeTargetSize = expectedTreeBuilderSpecificScopeTarget.length;
            assertEquals(expectedTreeBuilderSpecificScopeTargetSize, actualTreeBuilderSpecificScopeTarget.length);
            assertTrue(deepEquals(expectedTreeBuilderSpecificScopeTarget, actualTreeBuilderSpecificScopeTarget));
            
            CharacterReader actualTreeBuilderReader = actualTreeBuilder.reader;
            assertNull(actualTreeBuilderReader);
            
            Tokeniser actualTreeBuilderTokeniser = actualTreeBuilder.tokeniser;
            assertNull(actualTreeBuilderTokeniser);
            
            Document actualTreeBuilderDoc = actualTreeBuilder.doc;
            assertNull(actualTreeBuilderDoc);
            
            ArrayList actualTreeBuilderStack = actualTreeBuilder.stack;
            assertNull(actualTreeBuilderStack);
            
            String actualTreeBuilderBaseUri = actualTreeBuilder.baseUri;
            assertNull(actualTreeBuilderBaseUri);
            
            Token actualTreeBuilderCurrentToken = actualTreeBuilder.currentToken;
            assertNull(actualTreeBuilderCurrentToken);
            
            ParseErrorList actualTreeBuilderErrors = actualTreeBuilder.errors;
            assertNull(actualTreeBuilderErrors);
            
            ParseSettings actualTreeBuilderSettings = actualTreeBuilder.settings;
            assertNull(actualTreeBuilderSettings);
            
            Token.StartTag expectedTreeBuilderStart = ((Token.StartTag) getFieldValue(expectedTreeBuilder, "org.jsoup.parser.TreeBuilder", "start"));
            Token.StartTag actualTreeBuilderStart = ((Token.StartTag) getFieldValue(actualTreeBuilder, "org.jsoup.parser.TreeBuilder", "start"));
            assertTrue(deepEquals(expectedTreeBuilderStart, actualTreeBuilderStart));
            assertTrue(deepEquals(expectedTreeBuilderStart, actualTreeBuilderStart));
            assertTrue(deepEquals(expectedTreeBuilderStart, actualTreeBuilderStart));
            StringBuilder expectedTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(expectedTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            StringBuilder actualTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(actualTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            
            assertTrue(deepEquals(expectedTreeBuilderStart, actualTreeBuilderStart));
            assertTrue(deepEquals(expectedTreeBuilderStart, actualTreeBuilderStart));
            assertTrue(deepEquals(expectedTreeBuilderStart, actualTreeBuilderStart));
            assertTrue(deepEquals(expectedTreeBuilderStart, actualTreeBuilderStart));
            Attributes expectedTreeBuilderStartAttributes = expectedTreeBuilderStart.attributes;
            Attributes actualTreeBuilderStartAttributes = actualTreeBuilderStart.attributes;
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expectedTreeBuilderStartAttributes, actualTreeBuilderStartAttributes));
            
            Token.TokenType expectedTreeBuilderStartType = expectedTreeBuilderStart.type;
            Token.TokenType actualTreeBuilderStartType = actualTreeBuilderStart.type;
            assertEquals(expectedTreeBuilderStartType, actualTreeBuilderStartType);
            
            Token.EndTag expectedTreeBuilderEnd = ((Token.EndTag) getFieldValue(expectedTreeBuilder, "org.jsoup.parser.TreeBuilder", "end"));
            Token.EndTag actualTreeBuilderEnd = ((Token.EndTag) getFieldValue(actualTreeBuilder, "org.jsoup.parser.TreeBuilder", "end"));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            StringBuilder expectedTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(expectedTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            StringBuilder actualTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(actualTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            assertTrue(deepEquals(expectedTreeBuilderEnd, actualTreeBuilderEnd));
            
            int expectedMaxErrors = ((Integer) getFieldValue(expected, "org.jsoup.parser.Parser", "maxErrors"));
            int actualMaxErrors = ((Integer) getFieldValue(actual, "org.jsoup.parser.Parser", "maxErrors"));
            assertEquals(expectedMaxErrors, actualMaxErrors);
            
            ParseErrorList actualErrors = ((ParseErrorList) getFieldValue(actual, "org.jsoup.parser.Parser", "errors"));
            assertNull(actualErrors);
            
            ParseSettings expectedSettings = ((ParseSettings) getFieldValue(expected, "org.jsoup.parser.Parser", "settings"));
            ParseSettings actualSettings = ((ParseSettings) getFieldValue(actual, "org.jsoup.parser.Parser", "settings"));
            boolean actualSettingsPreserveTagCase = ((Boolean) getFieldValue(actualSettings, "org.jsoup.parser.ParseSettings", "preserveTagCase"));
            assertFalse(actualSettingsPreserveTagCase);
            
            boolean actualSettingsPreserveAttributeCase = ((Boolean) getFieldValue(actualSettings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase"));
            assertFalse(actualSettingsPreserveAttributeCase);
            
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1003096309092200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1003096309092200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1003096309100100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003096309092200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003096309100100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1003096313548500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1003096313548500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1003096313553500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003096313548500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003096313553500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1003096314391900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1003096314391900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1003096314394400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003096314391900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003096314394400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1003096315642700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1003096315642700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1003096315645900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003096315642700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003096315645900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

