package org.jsoup;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import java.util.Map;
import java.util.LinkedHashMap;
import org.jsoup.safety.Whitelist;
import java.net.URL;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.File;
import org.jsoup.parser.Parser;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Ignore;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

public final class org_jsoup_JsoupTest {
    ///region Test suites for executable org.jsoup.Jsoup.connect
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method connect(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#connect(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return HttpConnection.connect(url);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConnect_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            
            Jsoup.connect(null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#connect(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return HttpConnection.connect(url);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConnect_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            String string = "";
            
            Jsoup.connect(string);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method connect(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.Jsoup}
     * @utbot.methodUnderTest {@link org.jsoup.Jsoup#connect(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConnectThrowsIAEWithNonEmptyString() {
        Jsoup.connect("\u0014\n\t\r");
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method connect(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConnect1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            String string = "\u0001\u0001\u0001";
            
            Jsoup.connect(string);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.clean
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clean(java.lang.String, java.lang.String, org.jsoup.safety.Whitelist, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#clean(java.lang.String,java.lang.String,org.jsoup.safety.Whitelist,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.Jsoup#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Document dirty = parseBodyFragment(bodyHtml, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClean_ThrowIllegalArgumentException() {
        Jsoup.clean(null, null, null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clean(java.lang.String, java.lang.String, org.jsoup.safety.Whitelist, org.jsoup.nodes.Document$OutputSettings)
    
    @Test(expected = ExceptionInInitializerError.class)
    public void testCleanByFuzzer() {
        Jsoup.clean("\n\t\r?", "-3", null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clean(java.lang.String, java.lang.String, org.jsoup.safety.Whitelist, org.jsoup.nodes.Document$OutputSettings)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testClean1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            
            Jsoup.clean(null, string, null, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(org.jsoup.parser.Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.clean
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clean(java.lang.String, java.lang.String, org.jsoup.safety.Whitelist)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#clean(java.lang.String,java.lang.String,org.jsoup.safety.Whitelist)}
 * @utbot.invokes {@link org.jsoup.Jsoup#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Document dirty = parseBodyFragment(bodyHtml, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClean_ThrowIllegalArgumentException1() {
        Jsoup.clean(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clean(java.lang.String, java.lang.String, org.jsoup.safety.Whitelist)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testClean2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            
            Jsoup.clean(null, string, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(org.jsoup.parser.Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.clean
    
    ///region FUZZER: ERROR SUITE for method clean(java.lang.String, org.jsoup.safety.Whitelist)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.Jsoup}
     * @utbot.methodUnderTest {@link org.jsoup.Jsoup#clean(java.lang.String,org.jsoup.safety.Whitelist)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testCleanThrowsNCDFEWithNonEmptyString() {
        Whitelist whitelist = new Whitelist();
        
        Jsoup.clean("ZX", whitelist);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.net.URL, int)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.net.URL,int)}
 * @utbot.invokes {@link org.jsoup.Connection#timeout(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: con.timeout(timeoutMillis);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            URL url = ((URL) createInstance("java.net.URL"));
            
            Jsoup.parse(url, -1);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.net.URL,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Connection con = HttpConnection.connect(url);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, IOException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            
            Jsoup.parse(((URL) null), -255);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parse(java.net.URL, int)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.net.URL,int)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection#connect(java.net.URL)}
 * @utbot.invokes {@link org.jsoup.Connection#timeout(int)}
 * @utbot.invokes {@link org.jsoup.Connection#get()}
 * @utbot.throwsException {@link java.net.MalformedURLException} in: return con.get();
 *  */
    @Test(expected = MalformedURLException.class)
    public void testParse_ThrowMalformedURLException() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            URL url = ((URL) createInstance("java.net.URL"));
            String protocol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            setField(url, "java.net.URL", "protocol", protocol);
            
            Jsoup.parse(url, 0);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.parse
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.File, java.lang.String, java.lang.String)
    
    @Test(expected = NullPointerException.class)
    public void testParse1() throws IOException  {
        Jsoup.parse(((File) null), ((String) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Parser.parse(html, "");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            
            Jsoup.parse(null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parse(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.Jsoup}
     * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.lang.String)}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseThrowsNCDFEWithNonEmptyString() {
        Jsoup.parse("XZb");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseInput(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parser.parseInput(html, baseUri);
 *  */
    @Test
    public void testParse_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.Jsoup.parse] produces [java.lang.NullPointerException]
            org.jsoup.Jsoup.parse(Jsoup.java:45) */
        Jsoup.parse(((String) null), ((String) null), ((Parser) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_2() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parser, "org.jsoup.parser.Parser", "maxErrors", 1);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        
        Jsoup.parse(((String) null), ((String) null), parser);
    }
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException2() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object state = getEnumConstantByName(htmlTreeBuilderStateClazz, "Text");
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parser, "org.jsoup.parser.Parser", "maxErrors", 1);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        
        Jsoup.parse(((String) null), ((String) null), parser);
    }
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parser.parseInput(html, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_11() throws Exception  {
        String string = "";
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object state = getEnumConstantByName(htmlTreeBuilderStateClazz, "Text");
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        
        Jsoup.parse(string, ((String) null), parser);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Parser.parse(html, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            String string = "";
            
            Jsoup.parse(string, ((String) null));
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String, java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParse2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            String string1 = "";
            
            Jsoup.parse(string, string1);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(org.jsoup.parser.Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.io.File, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.io.File,java.lang.String)}
 * @utbot.invokes {@link java.io.File#getAbsolutePath()}
 * @utbot.throwsException {@link java.lang.InternalError} in: return DataUtil.load(in, charsetName, in.getAbsolutePath());
 *  */
    @Test(expected = InternalError.class)
    public void testParse_ThrowInternalError() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        setField(file, "java.io.File", "prefixLength", -255);
        
        Jsoup.parse(file, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parse(java.io.File,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return DataUtil.load(in, charsetName, in.getAbsolutePath());
 *  */
    @Test
    public void testParse_ThrowNullPointerException1() throws IOException  {
        /* This test fails because method [org.jsoup.Jsoup.parse] produces [java.lang.NullPointerException]
            org.jsoup.Jsoup.parse(Jsoup.java:103) */
        Jsoup.parse(((File) null), ((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.io.File, java.lang.String)
    
    @Test
    public void testParse3() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        String path = "";
        setField(file, "java.io.File", "path", path);
        setField(file, "java.io.File", "prefixLength", 2);
        
        /* This test fails because method [org.jsoup.Jsoup.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            java.base/java.io.WinNTFileSystem.resolve(WinNTFileSystem.java:357)
            java.base/java.io.File.getAbsolutePath(File.java:561)
            org.jsoup.Jsoup.parse(Jsoup.java:103) */
        Jsoup.parse(file, ((String) null));
    }
    ///endregion
    
    ///region OTHER: SECURITY for method parse(java.io.File, java.lang.String)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testParse4() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        String path = "\u0000";
        setField(file, "java.io.File", "path", path);
        setField(file, "java.io.File", "prefixLength", 2);
        
        /* This test fails because method [org.jsoup.Jsoup.parse] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.dir" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.io.WinNTFileSystem.getUserPath(WinNTFileSystem.java:402)
            java.base/java.io.WinNTFileSystem.resolve(WinNTFileSystem.java:370)
            java.base/java.io.File.getAbsolutePath(File.java:561)
            org.jsoup.Jsoup.parse(Jsoup.java:103) */
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.File, java.lang.String)
    
    @Test(expected = NullPointerException.class)
    public void testParse5() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        setField(file, "java.io.File", "prefixLength", 3);
        
        Jsoup.parse(file, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.isValid
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isValid(java.lang.String, org.jsoup.safety.Whitelist)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#isValid(java.lang.String,org.jsoup.safety.Whitelist)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Cleaner(whitelist).isValid(parseBodyFragment(bodyHtml, ""));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsValid_ThrowIllegalArgumentException() {
        Jsoup.isValid(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isValid(java.lang.String, org.jsoup.safety.Whitelist)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsValid1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Whitelist whitelist = new Whitelist();
            
            Jsoup.isValid(null, whitelist);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(org.jsoup.parser.Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.parseBodyFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseBodyFragment(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Jsoup}
 * @utbot.methodUnderTest {@link org.jsoup.Jsoup#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Parser.parseBodyFragment(bodyHtml, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_ThrowIllegalArgumentException() {
        Jsoup.parseBodyFragment(null, null);
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
            
            Jsoup.parseBodyFragment(null, string);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(org.jsoup.parser.Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.Jsoup.parseBodyFragment
    
    ///region OTHER: ERROR SUITE for method parseBodyFragment(java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBodyFragment2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            
            Jsoup.parseBodyFragment(null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(org.jsoup.parser.Tag.class, "tags", prevTags);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1002968750231600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1002968750231600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1002968750239100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1002968750231600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1002968750239100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1002968751935000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1002968751935000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1002968751938100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1002968751935000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1002968751938100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1002968753535600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1002968753535600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1002968753538200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1002968753535600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1002968753538200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

