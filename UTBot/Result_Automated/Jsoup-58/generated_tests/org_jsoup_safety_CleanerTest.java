package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import java.util.ArrayList;
import org.jsoup.safety.Whitelist.TagName;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.nodes.FormElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_jsoup_safety_CleanerTest {
    ///region Test suites for executable org.jsoup.safety.Cleaner.clean
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clean(org.jsoup.nodes.Document)
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#clean(org.jsoup.nodes.Document)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(dirtyDocument);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClean_ThrowIllegalArgumentException() throws Exception  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        
        cleaner.clean(null);
    }
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#clean(org.jsoup.nodes.Document)}
 * @utbot.invokes {@link org.jsoup.nodes.Document#baseUri()}
 * @utbot.invokes {@link org.jsoup.nodes.Document#createShell(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Document clean = Document.createShell(dirtyDocument.baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClean_ThrowIllegalArgumentException_1() throws Exception  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        cleaner.clean(document);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Cleaner.isValid
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isValid(org.jsoup.nodes.Document)
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#isValid(org.jsoup.nodes.Document)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(dirtyDocument);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsValid_ThrowIllegalArgumentException() throws Exception  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        
        cleaner.isValid(null);
    }
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#isValid(org.jsoup.nodes.Document)}
 * @utbot.invokes {@link org.jsoup.nodes.Document#baseUri()}
 * @utbot.invokes {@link org.jsoup.nodes.Document#createShell(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Document clean = Document.createShell(dirtyDocument.baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsValid_ThrowIllegalArgumentException_1() throws Exception  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        cleaner.isValid(document);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Cleaner.copySafeNodes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copySafeNodes(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#copySafeNodes(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return cleaningVisitor.numDiscarded;}
 *  */
    @Test
    public void testCopySafeNodes_ReturnCleaningVisitorNumDiscarded() throws Exception  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        
        Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method copySafeNodesMethod = cleanerClazz.getDeclaredMethod("copySafeNodes", elementType, elementType);
        copySafeNodesMethod.setAccessible(true);
        java.lang.Object[] copySafeNodesMethodArguments = new java.lang.Object[2];
        copySafeNodesMethodArguments[0] = ((Object) null);
        copySafeNodesMethodArguments[1] = ((Object) null);
        int actual = ((Integer) copySafeNodesMethod.invoke(cleaner, copySafeNodesMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#copySafeNodes(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return cleaningVisitor.numDiscarded;}
 *  */
    @Test
    public void testCopySafeNodes_ReturnCleaningVisitorNumDiscarded_2() throws Exception  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        setField(cleaner, "org.jsoup.safety.Cleaner", "whitelist", whitelist);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method copySafeNodesMethod = cleanerClazz.getDeclaredMethod("copySafeNodes", elementType, elementType);
        copySafeNodesMethod.setAccessible(true);
        java.lang.Object[] copySafeNodesMethodArguments = new java.lang.Object[2];
        copySafeNodesMethodArguments[0] = element;
        copySafeNodesMethodArguments[1] = ((Object) null);
        int actual = ((Integer) copySafeNodesMethod.invoke(cleaner, copySafeNodesMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#copySafeNodes(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return cleaningVisitor.numDiscarded;}
 *  */
    @Test
    public void testCopySafeNodes_ReturnCleaningVisitorNumDiscarded_1() throws Exception  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        setField(cleaner, "org.jsoup.safety.Cleaner", "whitelist", whitelist);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method copySafeNodesMethod = cleanerClazz.getDeclaredMethod("copySafeNodes", elementType, elementType);
        copySafeNodesMethod.setAccessible(true);
        java.lang.Object[] copySafeNodesMethodArguments = new java.lang.Object[2];
        copySafeNodesMethodArguments[0] = element;
        copySafeNodesMethodArguments[1] = ((Object) null);
        int actual = ((Integer) copySafeNodesMethod.invoke(cleaner, copySafeNodesMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#copySafeNodes(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return cleaningVisitor.numDiscarded;}
 *  */
    @Test
    public void testCopySafeNodes_ReturnCleaningVisitorNumDiscarded_4() throws Exception  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        tagNames.add(null);
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        setField(cleaner, "org.jsoup.safety.Cleaner", "whitelist", whitelist);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method copySafeNodesMethod = cleanerClazz.getDeclaredMethod("copySafeNodes", elementType, elementType);
        copySafeNodesMethod.setAccessible(true);
        java.lang.Object[] copySafeNodesMethodArguments = new java.lang.Object[2];
        copySafeNodesMethodArguments[0] = element;
        copySafeNodesMethodArguments[1] = ((Object) null);
        int actual = ((Integer) copySafeNodesMethod.invoke(cleaner, copySafeNodesMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#copySafeNodes(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return cleaningVisitor.numDiscarded;}
 *  */
    @Test
    public void testCopySafeNodes_ReturnCleaningVisitorNumDiscarded_3() throws Exception  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        tagNames.add(tagName);
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        setField(cleaner, "org.jsoup.safety.Cleaner", "whitelist", whitelist);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method copySafeNodesMethod = cleanerClazz.getDeclaredMethod("copySafeNodes", elementType, elementType);
        copySafeNodesMethod.setAccessible(true);
        java.lang.Object[] copySafeNodesMethodArguments = new java.lang.Object[2];
        copySafeNodesMethodArguments[0] = element;
        copySafeNodesMethodArguments[1] = ((Object) null);
        int actual = ((Integer) copySafeNodesMethod.invoke(cleaner, copySafeNodesMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copySafeNodes(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#copySafeNodes(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopySafeNodes_ThrowIllegalArgumentException() throws Throwable  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        setField(cleaner, "org.jsoup.safety.Cleaner", "whitelist", whitelist);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method copySafeNodesMethod = cleanerClazz.getDeclaredMethod("copySafeNodes", elementType, elementType);
        copySafeNodesMethod.setAccessible(true);
        java.lang.Object[] copySafeNodesMethodArguments = new java.lang.Object[2];
        copySafeNodesMethodArguments[0] = element;
        copySafeNodesMethodArguments[1] = ((Object) null);
        try {
            copySafeNodesMethod.invoke(cleaner, copySafeNodesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#copySafeNodes(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.safety.Cleaner.CleaningVisitor#access$300(org.jsoup.safety.Cleaner.CleaningVisitor)}
 * @utbot.returnsFrom {@code return cleaningVisitor.numDiscarded;}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return cleaningVisitor.numDiscarded;
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopySafeNodes_ThrowIllegalArgumentException_1() throws Throwable  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        tagNames.add(tagName);
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        setField(cleaner, "org.jsoup.safety.Cleaner", "whitelist", whitelist);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
        Class documentType = Class.forName("org.jsoup.nodes.Element");
        Method copySafeNodesMethod = cleanerClazz.getDeclaredMethod("copySafeNodes", documentType, documentType);
        copySafeNodesMethod.setAccessible(true);
        java.lang.Object[] copySafeNodesMethodArguments = new java.lang.Object[2];
        copySafeNodesMethodArguments[0] = document;
        copySafeNodesMethodArguments[1] = ((Object) null);
        try {
            copySafeNodesMethod.invoke(cleaner, copySafeNodesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copySafeNodes(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#copySafeNodes(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCopySafeNodes_ThrowIndexOutOfBoundsException() throws Throwable  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        setField(cleaner, "org.jsoup.safety.Cleaner", "whitelist", whitelist);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(element, "org.jsoup.nodes.Node", "siblingIndex", -2);
        
        /* This test fails because method [org.jsoup.safety.Cleaner.copySafeNodes] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Node.nextSibling(Node.java:503)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:36)
            org.jsoup.safety.Cleaner.copySafeNodes(Cleaner.java:132) */
        Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method copySafeNodesMethod = cleanerClazz.getDeclaredMethod("copySafeNodes", elementType, elementType);
        copySafeNodesMethod.setAccessible(true);
        java.lang.Object[] copySafeNodesMethodArguments = new java.lang.Object[2];
        copySafeNodesMethodArguments[0] = element;
        copySafeNodesMethodArguments[1] = ((Object) null);
        try {
            copySafeNodesMethod.invoke(cleaner, copySafeNodesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Cleaner.createSafeElement
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createSafeElement(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#createSafeElement(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sourceTag = sourceEl.tagName();
 *  */
    @Test
    public void testCreateSafeElement_ThrowNullPointerException() throws Throwable  {
        Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
        
        /* This test fails because method [org.jsoup.safety.Cleaner.createSafeElement] produces [java.lang.NullPointerException]
            org.jsoup.safety.Cleaner.createSafeElement(Cleaner.java:137) */
        Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method createSafeElementMethod = cleanerClazz.getDeclaredMethod("createSafeElement", elementType);
        createSafeElementMethod.setAccessible(true);
        java.lang.Object[] createSafeElementMethodArguments = new java.lang.Object[1];
        createSafeElementMethodArguments[0] = ((Object) null);
        try {
            createSafeElementMethod.invoke(cleaner, createSafeElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createSafeElement(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Cleaner}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Cleaner#createSafeElement(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element dest = new Element(Tag.valueOf(sourceTag), sourceEl.baseUri(), destAttrs);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateSafeElement_ThrowIllegalArgumentException() throws Throwable  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            Cleaner cleaner = ((Cleaner) createInstance("org.jsoup.safety.Cleaner"));
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
            
            Class cleanerClazz = Class.forName("org.jsoup.safety.Cleaner");
            Class formElementType = Class.forName("org.jsoup.nodes.Element");
            Method createSafeElementMethod = cleanerClazz.getDeclaredMethod("createSafeElement", formElementType);
            createSafeElementMethod.setAccessible(true);
            java.lang.Object[] createSafeElementMethodArguments = new java.lang.Object[1];
            createSafeElementMethodArguments[0] = formElement;
            try {
                createSafeElementMethod.invoke(cleaner, createSafeElementMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1003224504682400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1003224504682400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1003224504688500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003224504682400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003224504688500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1003224504993300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1003224504993300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1003224504994900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1003224504993300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1003224504994900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

