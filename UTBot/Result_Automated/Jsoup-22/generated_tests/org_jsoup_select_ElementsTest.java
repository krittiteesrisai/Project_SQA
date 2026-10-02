package org.jsoup.select;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Attributes;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.jsoup.select.Selector.SelectorParseException;
import java.lang.reflect.Method;
import org.jsoup.select.Evaluator.AttributeWithValueMatching;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.select.Evaluator.Matches;
import org.jsoup.nodes.DataNode;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_jsoup_select_ElementsTest {
    ///region Test suites for executable org.jsoup.select.Elements.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#add(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.returnsFrom {@code return contents.add(element);}
 *  */
    @Test
    public void testAdd_ListAdd() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.add(((Element) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#add(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean add(Element element) {
 *     return contents.add(element);
 * }
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.add] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.add(Elements.java:496) */
        elements.add(((Element) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(int, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#add(int,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.List#add(int,java.lang.Object)}
 * @utbot.returnsFrom {@code public void add(int index, Element element) {
 *     contents.add(index, element);
 * }}
 *  */
    @Test
    public void testAdd_ListAdd1() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        elements.add(0, ((Element) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(int, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#add(int,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.List#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: public void add(int index, Element element) {
 *     contents.add(index, element);
 * }
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.add] produces [java.lang.IndexOutOfBoundsException: Index: 6, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.jsoup.select.Elements.add(Elements.java:520) */
        elements.add(6, ((Element) null));
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#add(int,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.List#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public void add(int index, Element element) {
 *     contents.add(index, element);
 * }
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.add] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.add(Elements.java:520) */
        elements.add(-255, ((Element) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return contents.remove(o);}
 *  */
    @Test
    public void testRemove_ListRemove() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        byte[] byteArray = {};
        
        boolean actual = elements.remove(byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean remove(Object o) {
 *     return contents.remove(o);
 * }
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.remove] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.remove(Elements.java:498) */
        elements.remove(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRemove_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.remove();
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} twice
 * @utbot.throwsException {@link java.util.ConcurrentModificationException} in: element.remove();
 *  */
    @Test
    public void testRemove_ThrowConcurrentModificationException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", arrayList);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.remove] produces [java.util.ConcurrentModificationException]
            java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
            java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
            org.jsoup.select.Elements.remove(Elements.java:387) */
        elements.remove();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: element.remove();
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", arrayList);
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        setField(document, "org.jsoup.nodes.Node", "siblingIndex", 1073741824);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.remove] produces [java.lang.IndexOutOfBoundsException: Index 1073741824 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:402)
            org.jsoup.nodes.Node.remove(Node.java:246)
            org.jsoup.select.Elements.remove(Elements.java:388) */
        elements.remove();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testRemove_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.remove] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.remove(Elements.java:387) */
        elements.remove();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.remove();
 *  */
    @Test
    public void testRemove_ThrowNullPointerException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", arrayList);
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.remove] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:434)
            org.jsoup.nodes.Node.removeChild(Node.java:403)
            org.jsoup.nodes.Node.remove(Node.java:246)
            org.jsoup.select.Elements.remove(Elements.java:388) */
        elements.remove();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.remove();
 *  */
    @Test
    public void testRemove_ThrowNullPointerException1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.remove] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.remove(Elements.java:388) */
        elements.remove();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.remove();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemove_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.remove();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method remove()
    
    @Test
    public void testRemove1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", arrayList);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.remove();
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(int)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.returnsFrom {@code return contents.remove(index);}
 *  */
    @Test
    public void testRemove_ListRemove1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        Element actual = elements.remove(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(int)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: public Element remove(int index) {
 *     return contents.remove(index);
 * }
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException1() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.remove] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.select.Elements.remove(Elements.java:522) */
        elements.remove(0);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#remove(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public Element remove(int index) {
 *     return contents.remove(index);
 * }
 *  */
    @Test
    public void testRemove_ThrowNullPointerException2() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.remove] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.remove(Elements.java:522) */
        elements.remove(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(int)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return contents.get(index);}
 *  */
    @Test
    public void testGet_ListGet() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        Element actual = elements.get(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(int)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: public Element get(int index) {
 *     return contents.get(index);
 * }
 *  */
    @Test
    public void testGet_ThrowIndexOutOfBoundsException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.get] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.select.Elements.get(Elements.java:516) */
        elements.get(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public Element get(int index) {
 *     return contents.get(index);
 * }
 *  */
    @Test
    public void testGet_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.get] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.get(Elements.java:516) */
        elements.get(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#equals(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return contents.equals(o);}
 *  */
    @Test
    public void testEquals_ListEquals() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.equals(arrayList);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#equals(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean equals(Object o) {
 *     return contents.equals(o);
 * }
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.equals] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.equals(Elements.java:512) */
        elements.equals(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toString()}
 * @utbot.invokes {@link org.jsoup.select.Elements#outerHtml()}
 * @utbot.returnsFrom {@code return outerHtml();}
 *  */
    @Test
    public void testToString_ElementsOuterHtml() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        String actual = elements.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toString()}
 * @utbot.invokes {@link org.jsoup.select.Elements#outerHtml()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return outerHtml();
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1071)
            org.jsoup.nodes.Element.html(Element.java:1066)
            org.jsoup.nodes.Document.outerHtml(Document.java:178)
            org.jsoup.select.Elements.outerHtml(Elements.java:225)
            org.jsoup.select.Elements.toString(Elements.java:237) */
        elements.toString();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.select.Elements}
     * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toString()}
     */
    @Test
    public void testToStringThrowsNPE() {
        Elements elements = new Elements();
        elements.add(((Object) null));
        elements.add(((Object) null));
        elements.add(((Object) null));
        
        /* This test fails because method [org.jsoup.select.Elements.toString] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.outerHtml(Elements.java:225)
            org.jsoup.select.Elements.toString(Elements.java:237) */
        elements.toString();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) element);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.select.Elements.outerHtml(Elements.java:225)
            org.jsoup.select.Elements.toString(Elements.java:237) */
        elements.toString();
    }
    
    @Test
    public void testToString2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) element);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.select.Elements.outerHtml(Elements.java:225)
            org.jsoup.select.Elements.toString(Elements.java:237) */
        elements.toString();
    }
    
    @Test
    public void testToString3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Node", "childNodes", arrayList);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Element.html(Element.java:1072)
            org.jsoup.nodes.Element.html(Element.java:1066)
            org.jsoup.nodes.Document.outerHtml(Document.java:178)
            org.jsoup.select.Elements.outerHtml(Elements.java:225)
            org.jsoup.select.Elements.toString(Elements.java:237) */
        elements.toString();
    }
    
    @Test
    public void testToString4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.select.Elements.outerHtml(Elements.java:225)
            org.jsoup.select.Elements.toString(Elements.java:237) */
        elements.toString();
    }
    
    @Test
    public void testToString5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        Comment parentNode1 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        Comment parentNode2 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        Document parentNode3 = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(parentNode2, "org.jsoup.nodes.Node", "parentNode", parentNode3);
        setField(parentNode1, "org.jsoup.nodes.Node", "parentNode", parentNode2);
        setField(parentNode, "org.jsoup.nodes.Node", "parentNode", parentNode1);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.select.Elements.outerHtml(Elements.java:225)
            org.jsoup.select.Elements.toString(Elements.java:237) */
        elements.toString();
    }
    
    @Test
    public void testToString6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        Comment parentNode1 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        setField(parentNode, "org.jsoup.nodes.Node", "parentNode", parentNode1);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.select.Elements.outerHtml(Elements.java:225)
            org.jsoup.select.Elements.toString(Elements.java:237) */
        elements.toString();
    }
    
    @Test
    public void testToString7() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1072)
            org.jsoup.nodes.Element.html(Element.java:1066)
            org.jsoup.nodes.Document.outerHtml(Document.java:178)
            org.jsoup.select.Elements.outerHtml(Elements.java:225)
            org.jsoup.select.Elements.toString(Elements.java:237) */
        elements.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#append(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.append(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#append(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.append] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.append(Elements.java:287) */
        elements.append(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#append(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.append(html);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.append] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.append(Elements.java:288) */
        elements.append(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#append(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.append(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.append(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#append(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.append(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.append(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.returnsFrom {@code return contents.hashCode();}
 *  */
    @Test
    public void testHashCode_ListHashCode() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        int actual = elements.hashCode();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public int hashCode() {
 *     return contents.hashCode();
 * }
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.hashCode] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hashCode(Elements.java:514) */
        elements.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#clone()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return new Elements(elements);}
 *  */
    @Test
    public void testClone_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.clone();
        
        ArrayList arrayList1 = new ArrayList();
        Elements expected = new Elements(((List) arrayList1));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#clone()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element e: contents)
 *  */
    @Test
    public void testClone_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.clone] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.clone(Elements.java:39) */
        elements.clone();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#clone()}
 * @utbot.iterates iterate the loop {@code for(Element e: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: elements.add(e.clone());
 *  */
    @Test
    public void testClone_ThrowNullPointerException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.clone] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.doClone(Node.java:581)
            org.jsoup.nodes.Node.clone(Node.java:566)
            org.jsoup.nodes.Element.clone(Element.java:1106)
            org.jsoup.nodes.Document.clone(Document.java:199)
            org.jsoup.nodes.Document.clone(Document.java:16)
            org.jsoup.select.Elements.clone(Elements.java:40) */
        elements.clone();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#clone()}
 * @utbot.iterates iterate the loop {@code for(Element e: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: elements.add(e.clone());
 *  */
    @Test
    public void testClone_ThrowNullPointerException_3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.clone] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.doClone(Node.java:581)
            org.jsoup.nodes.Node.clone(Node.java:566)
            org.jsoup.nodes.Element.clone(Element.java:1106)
            org.jsoup.select.Elements.clone(Elements.java:40) */
        elements.clone();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#clone()}
 * @utbot.iterates iterate the loop {@code for(Element e: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: elements.add(e.clone());
 *  */
    @Test
    public void testClone_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.clone] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.clone(Elements.java:40) */
        elements.clone();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#indexOf(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return contents.indexOf(o);}
 *  */
    @Test
    public void testIndexOf_ListIndexOf() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        byte[][] byteArray = {};
        
        int actual = elements.indexOf(byteArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#indexOf(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public int indexOf(Object o) {
 *     return contents.indexOf(o);
 * }
 *  */
    @Test
    public void testIndexOf_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.indexOf] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.indexOf(Elements.java:524) */
        elements.indexOf(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.returnsFrom {@code public void clear() {
 *     contents.clear();
 * }}
 *  */
    @Test
    public void testClear_ListClear() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public void clear() {
 *     contents.clear();
 * }
 *  */
    @Test
    public void testClear_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.clear] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.clear(Elements.java:510) */
        elements.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.wrap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrap(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#wrap(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWrap_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        String string = " ";
        
        Elements actual = elements.wrap(string);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrap(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testWrap_ThrowClassCastException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = " ";
        
        /* This test fails because method [org.jsoup.select.Elements.wrap] produces [java.lang.ClassCastException: class org.jsoup.nodes.Comment cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.Comment and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.parent(Element.java:24)
            org.jsoup.nodes.Node.wrap(Node.java:316)
            org.jsoup.nodes.Element.wrap(Element.java:425)
            org.jsoup.select.Elements.wrap(Elements.java:331) */
        elements.wrap(string);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testWrap_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        String string = " ";
        
        /* This test fails because method [org.jsoup.select.Elements.wrap] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.wrap(Elements.java:330) */
        elements.wrap(string);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.wrap(html);
 *  */
    @Test
    public void testWrap_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = " ";
        
        /* This test fails because method [org.jsoup.select.Elements.wrap] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.wrap(Elements.java:331) */
        elements.wrap(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrap(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException() {
        Elements elements = new Elements();
        
        elements.wrap(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException_1() {
        Elements elements = new Elements();
        String string = "";
        
        elements.wrap(string);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException_3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = " ";
        
        elements.wrap(string);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = " ";
        
        elements.wrap(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wrap(java.lang.String)
    
    @Test
    public void testWrap1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        String baseUri = "";
        element.setBaseUri(baseUri);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.select.Elements.wrap] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.parser.HtmlTreeBuilder.parseFragment(HtmlTreeBuilder.java:52)
            org.jsoup.parser.Parser.parseFragment(Parser.java:105)
            org.jsoup.nodes.Node.wrap(Node.java:317)
            org.jsoup.nodes.Element.wrap(Element.java:425)
            org.jsoup.select.Elements.wrap(Elements.java:331) */
        elements.wrap(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#lastIndexOf(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#lastIndexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return contents.lastIndexOf(o);}
 *  */
    @Test
    public void testLastIndexOf_ListLastIndexOf() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        short[] shortArray = {};
        
        int actual = elements.lastIndexOf(shortArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastIndexOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#lastIndexOf(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#lastIndexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public int lastIndexOf(Object o) {
 *     return contents.lastIndexOf(o);
 * }
 *  */
    @Test
    public void testLastIndexOf_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.lastIndexOf] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.lastIndexOf(Elements.java:526) */
        elements.lastIndexOf(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#isEmpty()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.returnsFrom {@code return contents.isEmpty();}
 *  */
    @Test
    public void testIsEmpty_ListIsEmpty() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.isEmpty();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#isEmpty()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean isEmpty() {
 *     return contents.isEmpty();
 * }
 *  */
    @Test
    public void testIsEmpty_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.isEmpty] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.isEmpty(Elements.java:486) */
        elements.isEmpty();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#size()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return contents.size();}
 *  */
    @Test
    public void testSize_ListSize() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        int actual = elements.size();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#size()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: // implements List<Element> delegates:
 * public int size() {
 *     return contents.size();
 * }
 *  */
    @Test
    public void testSize_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.size] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.size(Elements.java:484) */
        elements.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.subList
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subList(int, int)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#subList(int,int)}
 * @utbot.invokes {@link java.util.List#subList(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public List<Element> subList(int fromIndex, int toIndex) {
 *     return contents.subList(fromIndex, toIndex);
 * }
 *  */
    @Test
    public void testSubList_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.subList] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.subList(Elements.java:532) */
        elements.subList(-255, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method subList(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.select.Elements}
     * @utbot.methodUnderTest {@link org.jsoup.select.Elements#subList(int,int)}
     */
    @Test
    public void testSubListThrowsIOOBEWithCornerCase() {
        Elements elements = new Elements();
        elements.add(((Object) null));
        elements.add(((Object) null));
        elements.add(((Object) null));
        
        /* This test fails because method [org.jsoup.select.Elements.subList] produces [java.lang.IndexOutOfBoundsException: fromIndex = -1]
            java.base/java.util.AbstractList.subListRangeCheck(AbstractList.java:505)
            java.base/java.util.ArrayList.subList(ArrayList.java:1108)
            org.jsoup.select.Elements.subList(Elements.java:532) */
        elements.subList(-1, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subList(int, int)
    
    @Test
    public void testSubList1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        List actual = elements.subList(0, 0);
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toArray(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.returnsFrom {@code return contents.toArray(a);}
 *  */
    @Test
    public void testToArray_ListToArray() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = elements.toArray(objectArray);
        
        int objectArraySize = objectArray.length;
        assertEquals(objectArraySize, actual.length);
        assertTrue(deepEquals(objectArray, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toArray([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toArray(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public <T> T[] toArray(T[] a) {
 *     return contents.toArray(a);
 * }
 *  */
    @Test
    public void testToArray_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.toArray] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.toArray(Elements.java:494) */
        elements.toArray(((java.lang.Object[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toArray(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public <T> T[] toArray(T[] a) {
 *     return contents.toArray(a);
 * }
 *  */
    @Test
    public void testToArray_ThrowNullPointerException_1() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toArray] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.toArray(ArrayList.java:398)
            org.jsoup.select.Elements.toArray(Elements.java:494) */
        elements.toArray(((java.lang.Object[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toArray()}
 * @utbot.invokes {@link java.util.List#toArray()}
 * @utbot.returnsFrom {@code return contents.toArray();}
 *  */
    @Test
    public void testToArray_ListToArray1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        java.lang.Object[] actual = elements.toArray();
        
        java.lang.Object[] expected = {null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toArray()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toArray()}
 * @utbot.invokes {@link java.util.List#toArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public Object[] toArray() {
 *     return contents.toArray();
 * }
 *  */
    @Test
    public void testToArray_ThrowNullPointerException1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.toArray] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.toArray(Elements.java:492) */
        elements.toArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#iterator()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return contents.iterator();}
 *  */
    @Test
    public void testIterator_ListIterator() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        Object actual = elements.iterator();
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#iterator()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public Iterator<Element> iterator() {
 *     return contents.iterator();
 * }
 *  */
    @Test
    public void testIterator_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.iterator] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.iterator(Elements.java:490) */
        elements.iterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.val
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method val()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#val()}
 * @utbot.invokes {@link org.jsoup.select.Elements#size()}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testVal_ElementsSize() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        String actual = elements.val();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method val()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#val()}
 * @utbot.invokes {@link org.jsoup.select.Elements#size()}
 * @utbot.invokes {@link org.jsoup.select.Elements#first()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#val()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return first().val();
 *  */
    @Test
    public void testVal_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.val] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.val(Elements.java:156) */
        elements.val();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method val()
    
    @Test
    public void testVal1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "te\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        String actual = elements.val();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testVal2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "te\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        String actual = elements.val();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method val()
    
    @Test
    public void testVal3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "text\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:73)
            org.jsoup.nodes.Element.val(Element.java:1019)
            org.jsoup.select.Elements.val(Elements.java:156) */
        elements.val();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.val
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method val(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#val(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testVal_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.val(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method val(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#val(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testVal_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.val] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.val(Elements.java:167) */
        elements.val(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#val(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.val(value);
 *  */
    @Test
    public void testVal_ThrowNullPointerException1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.val] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.val(Elements.java:168) */
        elements.val(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method val(java.lang.String)
    
    @Test
    public void testVal4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        setField(document, "org.jsoup.nodes.Node", "childNodes", arrayList);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:95)
            org.jsoup.nodes.Element.attr(Element.java:119)
            org.jsoup.nodes.Element.val(Element.java:1031)
            org.jsoup.select.Elements.val(Elements.java:168) */
        elements.val(null);
    }
    
    @Test
    public void testVal5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.val] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.val(Elements.java:168) */
        elements.val(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method val(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testVal6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.val(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#contains(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return contents.contains(o);}
 *  */
    @Test
    public void testContains_ListContains() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        byte[] byteArray = {};
        
        boolean actual = elements.contains(byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#contains(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean contains(Object o) {
 *     return contents.contains(o);
 * }
 *  */
    @Test
    public void testContains_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.contains] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.contains(Elements.java:488) */
        elements.contains(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.last
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method last()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#last()}
 * @utbot.executesCondition {@code (contents.isEmpty()): True}
 * @utbot.returnsFrom {@code return contents.isEmpty() ? null : contents.get(contents.size() - 1);}
 *  */
    @Test
    public void testLast_ContentsIsEmpty() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Element actual = elements.last();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#last()}
 * @utbot.executesCondition {@code (contents.isEmpty()): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return contents.isEmpty() ? null : contents.get(contents.size() - 1);}
 *  */
    @Test
    public void testLast_NotContentsIsEmpty() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        Element actual = elements.last();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method last()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#last()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: contents.isEmpty()
 *  */
    @Test
    public void testLast_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.last] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.last(Elements.java:466) */
        elements.last();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.addAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#addAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.List#addAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean addAll(Collection<? extends Element> c) {
 *     return contents.addAll(c);
 * }
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.addAll] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.addAll(Elements.java:502) */
        elements.addAll(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll(java.util.Collection)
    
    @Test
    public void testAddAll1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Elements elements = ((Elements) createInstance("org.jsoup.select.Elements"));
        setField(elements, "org.jsoup.select.Elements", "contents", arrayList);
        arrayList.add(elements);
        arrayList.add(elements);
        Elements elements1 = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        boolean actual = elements1.addAll(hashSet);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.addAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(int, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#addAll(int,java.util.Collection)}
 * @utbot.invokes {@link java.util.List#addAll(int,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: public boolean addAll(int index, Collection<? extends Element> c) {
 *     return contents.addAll(index, c);
 * }
 *  */
    @Test
    public void testAddAll_ThrowIndexOutOfBoundsException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.addAll] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.addAll(ArrayList.java:700)
            org.jsoup.select.Elements.addAll(Elements.java:504) */
        elements.addAll(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#addAll(int,java.util.Collection)}
 * @utbot.invokes {@link java.util.List#addAll(int,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean addAll(int index, Collection<? extends Element> c) {
 *     return contents.addAll(index, c);
 * }
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.addAll] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.addAll(Elements.java:504) */
        elements.addAll(-255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll(int, java.util.Collection)
    
    @Test
    public void testAddAll2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        
        boolean actual = elements.addAll(2, hashSet);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.empty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method empty()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#empty()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEmpty_Return() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.empty();
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#empty()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEmpty_ElementEmpty() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.empty();
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method empty()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#empty()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testEmpty_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.empty] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.empty(Elements.java:368) */
        elements.empty();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#empty()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.empty();
 *  */
    @Test
    public void testEmpty_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.empty] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.empty(Elements.java:369) */
        elements.empty();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.first
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method first()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#first()}
 * @utbot.executesCondition {@code (contents.isEmpty()): True}
 * @utbot.returnsFrom {@code return contents.isEmpty() ? null : contents.get(0);}
 *  */
    @Test
    public void testFirst_ContentsIsEmpty() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Element actual = elements.first();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#first()}
 * @utbot.executesCondition {@code (contents.isEmpty()): False}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return contents.isEmpty() ? null : contents.get(0);}
 *  */
    @Test
    public void testFirst_NotContentsIsEmpty() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        Element actual = elements.first();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method first()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#first()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: contents.isEmpty()
 *  */
    @Test
    public void testFirst_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.first] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.first(Elements.java:458) */
        elements.first();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.addClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#addClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddClass_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.addClass(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#addClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testAddClass_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.addClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.addClass(Elements.java:106) */
        elements.addClass(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#addClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.addClass(className);
 *  */
    @Test
    public void testAddClass_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.addClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.addClass(Elements.java:107) */
        elements.addClass(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#addClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.addClass(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.addClass(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addClass(java.lang.String)
    
    @Test
    public void testAddClass1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(document, "org.jsoup.nodes.Element", "classNames", classNames);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.addClass] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:33)
            org.jsoup.helper.StringUtil.join(StringUtil.java:20)
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.addClass(Element.java:973)
            org.jsoup.select.Elements.addClass(Elements.java:107) */
        elements.addClass(string);
    }
    
    @Test
    public void testAddClass2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.addClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.addClass(Elements.java:107) */
        elements.addClass(string);
    }
    
    @Test
    public void testAddClass3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.addClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.addClass(Elements.java:107) */
        elements.addClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(int, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#set(int,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.List#set(int,java.lang.Object)}
 * @utbot.returnsFrom {@code return contents.set(index, element);}
 *  */
    @Test
    public void testSet_ListSet() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        Element actual = elements.set(0, ((Element) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(int, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#set(int,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.List#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: public Element set(int index, Element element) {
 *     return contents.set(index, element);
 * }
 *  */
    @Test
    public void testSet_ThrowIndexOutOfBoundsException() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.set] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.set(ArrayList.java:441)
            org.jsoup.select.Elements.set(Elements.java:518) */
        elements.set(0, ((Element) null));
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#set(int,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.List#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public Element set(int index, Element element) {
 *     return contents.set(index, element);
 * }
 *  */
    @Test
    public void testSet_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.set] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.set(Elements.java:518) */
        elements.set(-255, ((Element) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.parents
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parents()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#parents()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return new Elements(combo);}
 *  */
    @Test
    public void testParents_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.parents();
        
        ArrayList arrayList1 = new ArrayList();
        Elements expected = new Elements(((List) arrayList1));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parents()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#parents()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testParents_ThrowClassCastException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.parents] produces [java.lang.ClassCastException: class org.jsoup.nodes.Comment cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.Comment and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.accumulateParents(Element.java:156)
            org.jsoup.nodes.Element.parents(Element.java:151)
            org.jsoup.select.Elements.parents(Elements.java:447) */
        elements.parents();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#parents()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element e: contents)
 *  */
    @Test
    public void testParents_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.parents] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.parents(Elements.java:446) */
        elements.parents();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#parents()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: combo.addAll(e.parents());
 *  */
    @Test
    public void testParents_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.parents] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.parents(Elements.java:447) */
        elements.parents();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#parents()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: combo.addAll(e.parents());
 *  */
    @Test
    public void testParents_ThrowNullPointerException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.parents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:157)
            org.jsoup.nodes.Element.parents(Element.java:151)
            org.jsoup.select.Elements.parents(Elements.java:447) */
        elements.parents();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parents()
    
    @Test
    public void testParents1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(tag);
        arrayList.add(tag);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.parents] produces [java.lang.ClassCastException: class org.jsoup.parser.Tag cannot be cast to class org.jsoup.nodes.Element (org.jsoup.parser.Tag and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.select.Elements.parents(Elements.java:446) */
        elements.parents();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testParents2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        setField(parentNode, "org.jsoup.nodes.Node", "parentNode", parentNode);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.parents();
    }
    
    @Test
    public void testParents3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.parents] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.parents(Elements.java:447) */
        elements.parents();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.unwrap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unwrap()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#unwrap()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testUnwrap_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.unwrap();
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unwrap()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#unwrap()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testUnwrap_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.unwrap] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.unwrap(Elements.java:350) */
        elements.unwrap();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#unwrap()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.unwrap();
 *  */
    @Test
    public void testUnwrap_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.unwrap] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.unwrap(Elements.java:351) */
        elements.unwrap();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unwrap()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#unwrap()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.unwrap();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.unwrap();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unwrap()
    
    @Test
    public void testUnwrap1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.unwrap] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:433)
            org.jsoup.nodes.Node.addChildren(Node.java:423)
            org.jsoup.nodes.Node.unwrap(Node.java:356)
            org.jsoup.select.Elements.unwrap(Elements.java:351) */
        elements.unwrap();
    }
    
    @Test
    public void testUnwrap2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        childNodes.add(xmlDeclaration);
        childNodes.add(element);
        childNodes.add(element);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.unwrap] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:402)
            org.jsoup.nodes.Node.reparentChild(Node.java:428)
            org.jsoup.nodes.Node.addChildren(Node.java:420)
            org.jsoup.nodes.Node.unwrap(Node.java:356)
            org.jsoup.select.Elements.unwrap(Elements.java:351) */
        elements.unwrap();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unwrap()
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        setField(element, "org.jsoup.nodes.Node", "childNodes", arrayList);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.unwrap();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.attr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testAttr_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        String actual = elements.attr(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testAttr_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.attr(Elements.java:55) */
        elements.attr(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: element.hasAttr(attributeKey)
 *  */
    @Test
    public void testAttr_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.attr(Elements.java:56) */
        elements.attr(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: element.hasAttr(attributeKey)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.attr(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method attr(java.lang.String)
    
    @Test
    public void testAttr1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) document);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        Elements elements = new Elements(((List) arrayList));
        String string = "K\u0000";
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:112)
            org.jsoup.select.Elements.attr(Elements.java:56) */
        elements.attr(string);
    }
    
    @Test
    public void testAttr2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.attr(Elements.java:56) */
        elements.attr(string);
    }
    
    @Test
    public void testAttr3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "K";
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.attr(Elements.java:56) */
        elements.attr(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.attr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAttr_ListIterator1() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.attr(null, null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testAttr_ThrowNullPointerException_11() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.attr(Elements.java:82) */
        elements.attr(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.attr(attributeKey, attributeValue);
 *  */
    @Test
    public void testAttr_ThrowNullPointerException1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.attr(Elements.java:83) */
        elements.attr(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.attr(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.attr(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.attr(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = " ";
        
        elements.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.attr(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.attr(string, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method attr(java.lang.String, java.lang.String)
    
    @Test
    public void testAttr4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        Elements elements = ((Elements) createInstance("org.jsoup.select.Elements"));
        setField(elements, "org.jsoup.select.Elements", "contents", arrayList);
        arrayList.add(elements);
        arrayList.add(elements);
        Elements elements1 = new Elements(((List) arrayList));
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        String string1 = "";
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.ClassCastException: class org.jsoup.select.Elements cannot be cast to class org.jsoup.nodes.Element (org.jsoup.select.Elements and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.select.Elements.attr(Elements.java:82) */
        elements1.attr(string, string1);
    }
    
    @Test
    public void testAttr5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(element);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element1);
        arrayList.add(element1);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001!\u0001";
        String string1 = "";
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:95)
            org.jsoup.nodes.Element.attr(Element.java:119)
            org.jsoup.select.Elements.attr(Elements.java:83) */
        elements.attr(string, string1);
    }
    
    @Test
    public void testAttr6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001";
        String string1 = "";
        
        /* This test fails because method [org.jsoup.select.Elements.attr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.attr(Elements.java:83) */
        elements.attr(string, string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.is
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method is(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#is(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Elements children = select(query);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIs_ThrowIllegalArgumentException() {
        Elements elements = new Elements();
        
        elements.is(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#is(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Elements children = select(query);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIs_ThrowIllegalArgumentException_1() {
        Elements elements = new Elements();
        String string = "";
        
        elements.is(string);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method is(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.select.Elements}
     * @utbot.methodUnderTest {@link org.jsoup.select.Elements#is(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIsThrowsIAEWithNonEmptyString() {
        Elements elements = new Elements();
        elements.add(((Object) null));
        elements.add(((Object) null));
        elements.add(((Object) null));
        
        elements.is("cab");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method is(java.lang.String)
    
    @Test
    public void testIs1() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0000";
        
        boolean actual = elements.is(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method is(java.lang.String)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testIs2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        elements.is(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIs3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001\u0000";
        
        elements.is(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method is(java.lang.String)
    
    @Test
    public void testIs4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001\u0101\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        
        /* This test fails because method [org.jsoup.select.Elements.is] produces [java.lang.NullPointerException] */
        elements.is(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.eq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method eq(int)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#eq(int)}
 * @utbot.executesCondition {@code (contents.size() > index): True}
 * @utbot.invokes {@link org.jsoup.select.Elements#get(int)}
 * @utbot.returnsFrom {@code return contents.size() > index ? new Elements(get(index)) : new Elements();}
 *  */
    @Test
    public void testEq_ContentsSizeGreaterThanIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.eq(0);
        
        List list = new ArrayList();
        list.add(null);
        Elements expected = new Elements(list);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#eq(int)}
 * @utbot.executesCondition {@code (contents.size() > index): False}
 * @utbot.returnsFrom {@code return contents.size() > index ? new Elements(get(index)) : new Elements();}
 *  */
    @Test
    public void testEq_ContentsSizeLessOrEqualIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.eq(3);
        
        ArrayList arrayList1 = new ArrayList();
        Elements expected = new Elements(((List) arrayList1));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method eq(int)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#eq(int)}
 * @utbot.executesCondition {@code (contents.size() > index): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link org.jsoup.select.Elements#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: new Elements(get(index))
 *  */
    @Test
    public void testEq_ThrowIndexOutOfBoundsException() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.eq] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.select.Elements.get(Elements.java:516)
            org.jsoup.select.Elements.eq(Elements.java:427) */
        elements.eq(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#eq(int)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: contents.size() > index
 *  */
    @Test
    public void testEq_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.eq] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.eq(Elements.java:427) */
        elements.eq(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.removeAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.List#removeAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return contents.removeAll(c);}
 *  */
    @Test
    public void testRemoveAll_ListRemoveAll() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.removeAll(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.List#removeAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean removeAll(Collection<?> c) {
 *     return contents.removeAll(c);
 * }
 *  */
    @Test
    public void testRemoveAll_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.removeAll] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.removeAll(Elements.java:506) */
        elements.removeAll(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeAll(java.util.Collection)
    
    @Test
    public void testRemoveAll1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        boolean actual = elements.removeAll(hashSet);
        
        assertTrue(actual);
    }
    
    @Test
    public void testRemoveAll2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        Character character = '\uFFFF';
        hashSet.add(character);
        Character character1 = '\u0000';
        hashSet.add(character1);
        
        boolean actual = elements.removeAll(hashSet);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeAll(java.util.Collection)
    
    @Test(expected = StackOverflowError.class)
    public void testRemoveAll3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Elements elements = ((Elements) createInstance("org.jsoup.select.Elements"));
        setField(elements, "org.jsoup.select.Elements", "contents", arrayList);
        arrayList.add(elements);
        arrayList.add(elements);
        Elements elements1 = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        
        elements1.removeAll(hashSet);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRemoveAll4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Elements elements = ((Elements) createInstance("org.jsoup.select.Elements"));
        setField(elements, "org.jsoup.select.Elements", "contents", arrayList);
        arrayList.add(elements);
        arrayList.add(elements);
        Elements elements1 = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        
        elements1.removeAll(hashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.retainAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method retainAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#retainAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.List#retainAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return contents.retainAll(c);}
 *  */
    @Test
    public void testRetainAll_ListRetainAll() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.retainAll(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method retainAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#retainAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean retainAll(Collection<?> c) {
 *     return contents.retainAll(c);
 * }
 *  */
    @Test
    public void testRetainAll_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.retainAll] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.retainAll(Elements.java:508) */
        elements.retainAll(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#retainAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.List#retainAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return contents.retainAll(c);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return contents.retainAll(c);
 *  */
    @Test
    public void testRetainAll_ThrowNullPointerException_1() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.retainAll] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.ArrayList.batchRemove(ArrayList.java:816)
            java.base/java.util.ArrayList.retainAll(ArrayList.java:811)
            org.jsoup.select.Elements.retainAll(Elements.java:508) */
        elements.retainAll(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method retainAll(java.util.Collection)
    
    @Test
    public void testRetainAll1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        
        boolean actual = elements.retainAll(hashSet);
        
        assertTrue(actual);
    }
    
    @Test
    public void testRetainAll2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        
        boolean actual = elements.retainAll(hashSet);
        
        assertTrue(actual);
    }
    
    @Test
    public void testRetainAll3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        Elements elements = ((Elements) createInstance("org.jsoup.select.Elements"));
        setField(elements, "org.jsoup.select.Elements", "contents", arrayList);
        arrayList.add(elements);
        arrayList.add(elements);
        Elements elements1 = new Elements(((List) arrayList));
        
        boolean actual = elements1.retainAll(arrayList);
        
        assertFalse(actual);
    }
    
    @Test
    public void testRetainAll4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element1);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) element);
        objectArray[1] = ((Object) element1);
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        Elements elements = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        Integer integer = -1;
        hashSet.add(integer);
        Integer integer1 = 0;
        hashSet.add(integer1);
        
        boolean actual = elements.retainAll(hashSet);
        
        assertTrue(actual);
    }
    
    @Test
    public void testRetainAll5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element1);
        arrayList.add(element1);
        Elements elements = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Object object = new Object();
        hashSet.add(object);
        hashSet.add(element1);
        
        boolean actual = elements.retainAll(hashSet);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method retainAll(java.util.Collection)
    
    @Test(expected = StackOverflowError.class)
    public void testRetainAll6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        Elements elements = ((Elements) createInstance("org.jsoup.select.Elements"));
        setField(elements, "org.jsoup.select.Elements", "contents", arrayList);
        arrayList.add(elements);
        Elements elements1 = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        hashSet.add(character);
        
        elements1.retainAll(hashSet);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRetainAll7() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        Elements elements = ((Elements) createInstance("org.jsoup.select.Elements"));
        setField(elements, "org.jsoup.select.Elements", "contents", arrayList);
        arrayList.add(elements);
        Elements elements1 = new Elements(((List) arrayList));
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Integer integer = 0;
        hashSet.add(integer);
        
        elements1.retainAll(hashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.listIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listIterator(int)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#listIterator(int)}
 * @utbot.invokes {@link java.util.List#listIterator(int)}
 * @utbot.returnsFrom {@code return contents.listIterator(index);}
 *  */
    @Test
    public void testListIterator_ListListIterator() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Object actual = elements.listIterator(0);
        
        Object expected = createInstance("java.util.ArrayList$ListItr");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method listIterator(int)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#listIterator(int)}
 * @utbot.invokes {@link java.util.List#listIterator(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: public ListIterator<Element> listIterator(int index) {
 *     return contents.listIterator(index);
 * }
 *  */
    @Test
    public void testListIterator_ThrowIndexOutOfBoundsException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.listIterator] produces [java.lang.IndexOutOfBoundsException: Index: 6, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.listIterator(ArrayList.java:923)
            org.jsoup.select.Elements.listIterator(Elements.java:530) */
        elements.listIterator(6);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#listIterator(int)}
 * @utbot.invokes {@link java.util.List#listIterator(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public ListIterator<Element> listIterator(int index) {
 *     return contents.listIterator(index);
 * }
 *  */
    @Test
    public void testListIterator_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.listIterator] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.listIterator(Elements.java:530) */
        elements.listIterator(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.listIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listIterator()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#listIterator()}
 * @utbot.invokes {@link java.util.List#listIterator()}
 * @utbot.returnsFrom {@code return contents.listIterator();}
 *  */
    @Test
    public void testListIterator_ListListIterator1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        Object actual = elements.listIterator();
        
        Object expected = createInstance("java.util.ArrayList$ListItr");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method listIterator()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#listIterator()}
 * @utbot.invokes {@link java.util.List#listIterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public ListIterator<Element> listIterator() {
 *     return contents.listIterator();
 * }
 *  */
    @Test
    public void testListIterator_ThrowNullPointerException1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.listIterator] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.listIterator(Elements.java:528) */
        elements.listIterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.containsAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#containsAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.List#containsAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return contents.containsAll(c);}
 *  */
    @Test
    public void testContainsAll_ListContainsAll() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        ArrayList arrayList1 = new ArrayList();
        
        boolean actual = elements.containsAll(arrayList1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#containsAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.List#containsAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public boolean containsAll(Collection<?> c) {
 *     return contents.containsAll(c);
 * }
 *  */
    @Test
    public void testContainsAll_ThrowNullPointerException() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.containsAll] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.containsAll(Elements.java:500) */
        elements.containsAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.before
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method before(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#before(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testBefore_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.before(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method before(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testBefore_ThrowClassCastException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.before] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.parent(Element.java:24)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:303)
            org.jsoup.nodes.Node.before(Node.java:256)
            org.jsoup.nodes.Element.before(Element.java:371)
            org.jsoup.select.Elements.before(Elements.java:301) */
        elements.before(string);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testBefore_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.before] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.before(Elements.java:300) */
        elements.before(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.before(html);
 *  */
    @Test
    public void testBefore_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.before] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.before(Elements.java:301) */
        elements.before(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method before(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.before(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.before(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.before(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.before(string);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.before(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.before(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.after
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method after(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#after(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAfter_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.after(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method after(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testAfter_ThrowClassCastException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.after] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.parent(Element.java:24)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:303)
            org.jsoup.nodes.Node.after(Node.java:281)
            org.jsoup.nodes.Element.after(Element.java:394)
            org.jsoup.select.Elements.after(Elements.java:314) */
        elements.after(string);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testAfter_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.after] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.after(Elements.java:313) */
        elements.after(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.after(html);
 *  */
    @Test
    public void testAfter_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.after] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.after(Elements.java:314) */
        elements.after(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method after(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.after(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.after(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.after(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.after(string);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.after(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.after(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.prepend
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method prepend(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#prepend(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPrepend_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.prepend(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method prepend(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#prepend(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testPrepend_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.prepend] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.prepend(Elements.java:274) */
        elements.prepend(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#prepend(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.prepend(html);
 *  */
    @Test
    public void testPrepend_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.prepend] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.prepend(Elements.java:275) */
        elements.prepend(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prepend(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#prepend(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.prepend(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.prepend(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#prepend(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.prepend(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_ThrowIllegalArgumentException_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.prepend(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method prepend(java.lang.String)
    
    @Test
    public void testPrepend1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String baseUri = "";
        document.setBaseUri(baseUri);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.prepend] produces [java.lang.NullPointerException] */
        elements.prepend(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.text
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method text()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#text()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testText_StringBuilderToString() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        String actual = elements.text();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method text()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#text()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testText_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.text] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.text(Elements.java:182) */
        elements.text();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#text()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(element.text());
 *  */
    @Test
    public void testText_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.text] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.text(Elements.java:185) */
        elements.text();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#text()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(element.text());
 *  */
    @Test
    public void testText_ThrowNullPointerException_3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796)
            org.jsoup.nodes.Element.text(Element.java:791)
            org.jsoup.select.Elements.text(Elements.java:185) */
        elements.text();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#text()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(element.text());
 *  */
    @Test
    public void testText_ThrowNullPointerException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796)
            org.jsoup.nodes.Element.text(Element.java:791)
            org.jsoup.select.Elements.text(Elements.java:185) */
        elements.text();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method text()
    
    @Test(expected = StackOverflowError.class)
    public void testText1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        setField(document, "org.jsoup.nodes.Node", "childNodes", arrayList);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        elements.text();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testText2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        setField(document, "org.jsoup.nodes.Node", "childNodes", arrayList);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        elements.text();
    }
    
    @Test
    public void testText3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:798)
            org.jsoup.nodes.Element.text(Element.java:791)
            org.jsoup.select.Elements.text(Elements.java:185) */
        elements.text();
    }
    
    @Test
    public void testText4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.text] produces [java.lang.NullPointerException] */
        elements.text();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.not
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method not(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#not(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Elements out = Selector.select(query, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNot_ThrowIllegalArgumentException() {
        Elements elements = new Elements();
        
        elements.not(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#not(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Elements out = Selector.select(query, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNot_ThrowIllegalArgumentException_1() {
        Elements elements = new Elements();
        String string = "";
        
        elements.not(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method not(java.lang.String)
    
    @Test
    public void testNot1() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0000";
        
        Elements actual = elements.not(string);
        
        ArrayList arrayList1 = new ArrayList();
        Elements expected = new Elements(((List) arrayList1));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method not(java.lang.String)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testNot2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001\u0001";
        
        elements.not(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNot3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001";
        
        elements.not(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNot4() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "!!";
        
        elements.not(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method not(java.lang.String)
    
    @Test
    public void testNot5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001\u0101\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        
        /* This test fails because method [org.jsoup.select.Elements.not] produces [java.lang.NullPointerException] */
        elements.not(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.tagName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tagName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#tagName(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testTagName_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.tagName(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tagName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#tagName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testTagName_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.tagName] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.tagName(Elements.java:248) */
        elements.tagName(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#tagName(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.tagName(tagName);
 *  */
    @Test
    public void testTagName_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.tagName] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.tagName(Elements.java:249) */
        elements.tagName(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tagName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#tagName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.tagName(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTagName_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.tagName(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#tagName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.tagName(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTagName_ThrowIllegalArgumentException_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.tagName(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tagName(java.lang.String)
    
    @Test
    public void testTagName1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001\u0001!\u0000\u0000\u0000\u0000\u0001";
        
        Elements actual = elements.tagName(string);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tagName(java.lang.String)
    
    @Test
    public void testTagName2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) document);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001@\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        
        /* This test fails because method [org.jsoup.select.Elements.tagName] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jsoup.nodes.Element ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.select.Elements.tagName(Elements.java:248) */
        elements.tagName(string);
    }
    
    @Test
    public void testTagName3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        /* This test fails because method [org.jsoup.select.Elements.tagName] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.tagName(Elements.java:249) */
        elements.tagName(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tagName(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testTagName4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001";
        
        elements.tagName(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.traverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverse(org.jsoup.select.NodeVisitor)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#traverse(org.jsoup.select.NodeVisitor)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testTraverse_ListIterator() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        Object formattingVisitor = createInstance("org.jsoup.examples.HtmlToPlainText$FormattingVisitor");
        
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class formattingVisitorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", formattingVisitorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = formattingVisitor;
        Elements actual = ((Elements) traverseMethod.invoke(elements, traverseMethodArguments));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverse(org.jsoup.select.NodeVisitor)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#traverse(org.jsoup.select.NodeVisitor)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(nodeVisitor);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTraverse_ThrowIllegalArgumentException() {
        Elements elements = new Elements();
        
        elements.traverse(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#traverse(org.jsoup.select.NodeVisitor)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: traversor.traverse(el);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTraverse_ThrowIllegalArgumentException_1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object accumulator = createInstance("org.jsoup.select.Collector$Accumulator");
        Document root = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(accumulator, "org.jsoup.select.Collector$Accumulator", "root", root);
        Evaluator.AttributeWithValueMatching eval = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        setField(accumulator, "org.jsoup.select.Collector$Accumulator", "eval", eval);
        
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class accumulatorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", accumulatorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = accumulator;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverse(org.jsoup.select.NodeVisitor)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#traverse(org.jsoup.select.NodeVisitor)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: traversor.traverse(el);
 *  */
    @Test
    public void testTraverse_ThrowClassCastException() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object outerHtmlVisitor = createInstance("org.jsoup.nodes.Node$OuterHtmlVisitor");
        StringBuilder accum = new StringBuilder("\u0000");
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "accum", accum);
        Document.OutputSettings out = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(out, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "out", out);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.ClassCastException: class org.jsoup.nodes.Comment cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.Comment and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1036)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Elements.traverse(Elements.java:478) */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class outerHtmlVisitorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", outerHtmlVisitorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = outerHtmlVisitor;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#traverse(org.jsoup.select.NodeVisitor)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element el: contents)
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException() throws Throwable  {
        Elements elements = new Elements(((List) null));
        Object formattingVisitor = createInstance("org.jsoup.examples.HtmlToPlainText$FormattingVisitor");
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.traverse(Elements.java:477) */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class formattingVisitorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", formattingVisitorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = formattingVisitor;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverse(org.jsoup.select.NodeVisitor)
    
    @Test
    public void testTraverse1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object accumulator = createInstance("org.jsoup.select.Collector$Accumulator");
        
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class accumulatorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", accumulatorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = accumulator;
        Elements actual = ((Elements) traverseMethod.invoke(elements, traverseMethodArguments));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverse(org.jsoup.select.NodeVisitor)
    
    @Test
    public void testTraverse2() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object outerHtmlVisitor = createInstance("org.jsoup.nodes.Node$OuterHtmlVisitor");
        StringBuilder accum = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "accum", accum);
        Document.OutputSettings out = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "out", out);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException] */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class outerHtmlVisitorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", outerHtmlVisitorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = outerHtmlVisitor;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse3() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object outerHtmlVisitor = createInstance("org.jsoup.nodes.Node$OuterHtmlVisitor");
        StringBuilder accum = new StringBuilder("\u0000");
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "accum", accum);
        Document.OutputSettings out = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(out, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "out", out);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Elements.traverse(Elements.java:478) */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class outerHtmlVisitorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", outerHtmlVisitorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = outerHtmlVisitor;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse4() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object accumulator = createInstance("org.jsoup.select.Collector$Accumulator");
        Evaluator.AttributeWithValueMatching eval = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        String key = "\u2000";
        eval.key = key;
        setField(accumulator, "org.jsoup.select.Collector$Accumulator", "eval", eval);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:112)
            org.jsoup.select.Evaluator$AttributeWithValueMatching.matches(Evaluator.java:254)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Elements.traverse(Elements.java:478) */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class accumulatorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", accumulatorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = accumulator;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse5() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object outerHtmlVisitor = createInstance("org.jsoup.nodes.Node$OuterHtmlVisitor");
        StringBuilder accum = new StringBuilder("\u0000\u0000\u0000");
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "accum", accum);
        Document.OutputSettings out = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(out, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "out", out);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Elements.traverse(Elements.java:478) */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class outerHtmlVisitorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", outerHtmlVisitorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = outerHtmlVisitor;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse6() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object outerHtmlVisitor = createInstance("org.jsoup.nodes.Node$OuterHtmlVisitor");
        StringBuilder accum = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "accum", accum);
        Document.OutputSettings out = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(out, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "out", out);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Elements.traverse(Elements.java:478) */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class outerHtmlVisitorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", outerHtmlVisitorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = outerHtmlVisitor;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse7() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object accumulator = createInstance("org.jsoup.select.Collector$Accumulator");
        Evaluator.Matches eval = ((Evaluator.Matches) createInstance("org.jsoup.select.Evaluator$Matches"));
        setField(accumulator, "org.jsoup.select.Collector$Accumulator", "eval", eval);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException] */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class accumulatorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", accumulatorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = accumulator;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse8() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object outerHtmlVisitor = createInstance("org.jsoup.nodes.Node$OuterHtmlVisitor");
        StringBuilder accum = new StringBuilder("");
        setField(outerHtmlVisitor, "org.jsoup.nodes.Node$OuterHtmlVisitor", "accum", accum);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Elements.traverse(Elements.java:478) */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class outerHtmlVisitorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", outerHtmlVisitorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = outerHtmlVisitor;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse9() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object accumulator = createInstance("org.jsoup.select.Collector$Accumulator");
        Evaluator.Matches eval = ((Evaluator.Matches) createInstance("org.jsoup.select.Evaluator$Matches"));
        setField(accumulator, "org.jsoup.select.Collector$Accumulator", "eval", eval);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796)
            org.jsoup.nodes.Element.text(Element.java:791)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:423)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Elements.traverse(Elements.java:478) */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class accumulatorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", accumulatorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = accumulator;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse10() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        Object accumulator = createInstance("org.jsoup.select.Collector$Accumulator");
        Evaluator.Matches eval = ((Evaluator.Matches) createInstance("org.jsoup.select.Evaluator$Matches"));
        setField(accumulator, "org.jsoup.select.Collector$Accumulator", "eval", eval);
        
        /* This test fails because method [org.jsoup.select.Elements.traverse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:798)
            org.jsoup.nodes.Element.text(Element.java:791)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:423)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Elements.traverse(Elements.java:478) */
        Class elementsClazz = Class.forName("org.jsoup.select.Elements");
        Class accumulatorType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = elementsClazz.getDeclaredMethod("traverse", accumulatorType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = accumulator;
        try {
            traverseMethod.invoke(elements, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.toggleClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toggleClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toggleClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testToggleClass_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.toggleClass(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toggleClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toggleClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testToggleClass_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.toggleClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.toggleClass(Elements.java:130) */
        elements.toggleClass(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toggleClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.toggleClass(className);
 *  */
    @Test
    public void testToggleClass_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.toggleClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.toggleClass(Elements.java:131) */
        elements.toggleClass(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toggleClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#toggleClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.toggleClass(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.toggleClass(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toggleClass(java.lang.String)
    
    @Test
    public void testToggleClass1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.toggleClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.toggleClass(Elements.java:131) */
        elements.toggleClass(string);
    }
    
    @Test
    public void testToggleClass2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.toggleClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.toggleClass(Elements.java:131) */
        elements.toggleClass(string);
    }
    
    @Test
    public void testToggleClass3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(document, "org.jsoup.nodes.Element", "classNames", classNames);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.toggleClass] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:33)
            org.jsoup.helper.StringUtil.join(StringUtil.java:20)
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.toggleClass(Element.java:1006)
            org.jsoup.select.Elements.toggleClass(Elements.java:131) */
        elements.toggleClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.hasClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasClass(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasClass_ReturnFalse() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.hasClass(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasClass(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasClass_ReturnFalse_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(document, "org.jsoup.nodes.Element", "classNames", classNames);
        arrayList.add(document);
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.hasClass(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasClass(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasClass_ReturnFalse_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(document, "org.jsoup.nodes.Element", "classNames", classNames);
        arrayList.add(document);
        Elements elements = new Elements(((List) arrayList));
        String string = " ";
        
        boolean actual = elements.hasClass(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasClass(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testHasClass_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasClass(Elements.java:142) */
        elements.hasClass(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: element.hasClass(className)
 *  */
    @Test
    public void testHasClass_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasClass(Elements.java:143) */
        elements.hasClass(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.String)
    
    @Test
    public void testHasClass1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        boolean actual = elements.hasClass(string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testHasClass2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        boolean actual = elements.hasClass(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasClass(java.lang.String)
    
    @Test
    public void testHasClass3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(document, "org.jsoup.nodes.Element", "classNames", classNames);
        arrayList.add(document);
        arrayList.add(document);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasClass(Elements.java:143) */
        elements.hasClass(null);
    }
    
    @Test
    public void testHasClass4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(document, "org.jsoup.nodes.Element", "classNames", classNames);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:73)
            org.jsoup.nodes.Element.className(Element.java:921)
            org.jsoup.nodes.Element.classNames(Element.java:932)
            org.jsoup.nodes.Element.hasClass(Element.java:955)
            org.jsoup.select.Elements.hasClass(Elements.java:143) */
        elements.hasClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.hasText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasText()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasText()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasText_ReturnFalse() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.hasText();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasText()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasText_ReturnFalse_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.hasText();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasText()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testHasText_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.hasText] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasText(Elements.java:191) */
        elements.hasText();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasText()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: element.hasText()
 *  */
    @Test
    public void testHasText_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.hasText] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasText(Elements.java:192) */
        elements.hasText();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasText()
    
    @Test
    public void testHasText1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "\u0000";
        setField(textNode, "org.jsoup.nodes.TextNode", "text", text);
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.hasText();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasText()
    
    @Test(expected = StackOverflowError.class)
    public void testHasText2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Node", "childNodes", arrayList);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.hasText();
    }
    
    @Test
    public void testHasText3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        childNodes.add(xmlDeclaration);
        Object object = createInstance("java.lang.Object");
        childNodes.add(object);
        childNodes.add(object);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.hasText] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jsoup.nodes.Node (java.lang.Object is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.nodes.Element.hasText(Element.java:879)
            org.jsoup.select.Elements.hasText(Elements.java:192) */
        elements.hasText();
    }
    
    @Test
    public void testHasText4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes1 = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        childNodes.add(element);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) document);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.hasText] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jsoup.nodes.Element ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.select.Elements.hasText(Elements.java:191) */
        elements.hasText();
    }
    
    @Test
    public void testHasText5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.hasText] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasText(Elements.java:192) */
        elements.hasText();
    }
    
    @Test
    public void testHasText6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes);
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.hasText] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasText(Elements.java:192) */
        elements.hasText();
    }
    
    @Test
    public void testHasText7() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes);
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.hasText] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasText(Elements.java:192) */
        elements.hasText();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#html()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testHtml_StringBuilderToString() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        String actual = elements.html();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#html()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.html(Elements.java:206) */
        elements.html();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#html()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(element.html());
 *  */
    @Test
    public void testHtml_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.html(Elements.java:209) */
        elements.html();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#html()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(element.html());
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1071)
            org.jsoup.nodes.Element.html(Element.java:1066)
            org.jsoup.select.Elements.html(Elements.java:209) */
        elements.html();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html()
    
    @Test
    public void testHtml1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1071)
            org.jsoup.nodes.Element.html(Element.java:1066)
            org.jsoup.select.Elements.html(Elements.java:209) */
        elements.html();
    }
    
    @Test
    public void testHtml2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Node", "childNodes", arrayList);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException] */
        elements.html();
    }
    
    @Test
    public void testHtml3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element1);
        arrayList.add(element1);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException] */
        elements.html();
    }
    
    @Test
    public void testHtml4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        childNodes.add(element);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element1);
        arrayList.add(element1);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException] */
        elements.html();
    }
    
    @Test
    public void testHtml5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1072)
            org.jsoup.nodes.Element.html(Element.java:1066)
            org.jsoup.select.Elements.html(Elements.java:209) */
        elements.html();
    }
    
    @Test
    public void testHtml6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(parentNode, "org.jsoup.nodes.Node", "parentNode", parentNode1);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        childNodes.add(element);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element1);
        arrayList.add(element1);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException] */
        elements.html();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#html(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testHtml_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.html(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#html(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_11() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.html(Elements.java:261) */
        elements.html(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#html(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.html(html);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.html] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.html(Elements.java:262) */
        elements.html(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#html(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.html(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHtml_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Node", "childNodes", arrayList);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.html(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml7() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.html(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.outerHtml
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outerHtml()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#outerHtml()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testOuterHtml_StringBuilderToString() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        String actual = elements.outerHtml();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtml()
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#outerHtml()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testOuterHtml_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.outerHtml(Elements.java:222) */
        elements.outerHtml();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#outerHtml()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(element.outerHtml());
 *  */
    @Test
    public void testOuterHtml_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.outerHtml(Elements.java:225) */
        elements.outerHtml();
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#outerHtml()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(element.outerHtml());
 *  */
    @Test
    public void testOuterHtml_ThrowNullPointerException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1071)
            org.jsoup.nodes.Element.html(Element.java:1066)
            org.jsoup.nodes.Document.outerHtml(Document.java:178)
            org.jsoup.select.Elements.outerHtml(Elements.java:225) */
        elements.outerHtml();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method outerHtml()
    
    @Test
    public void testOuterHtml1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Node", "childNodes", arrayList);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.outerHtml] produces [java.lang.NullPointerException] */
        elements.outerHtml();
    }
    
    @Test
    public void testOuterHtml2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) element);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.outerHtml] produces [java.lang.NullPointerException] */
        elements.outerHtml();
    }
    
    @Test
    public void testOuterHtml3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Comment parentNode1 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        setField(parentNode, "org.jsoup.nodes.Node", "parentNode", parentNode1);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element1);
        arrayList.add(element1);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.outerHtml] produces [java.lang.NullPointerException] */
        elements.outerHtml();
    }
    
    @Test
    public void testOuterHtml4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.select.Elements.outerHtml(Elements.java:225) */
        elements.outerHtml();
    }
    
    @Test
    public void testOuterHtml5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1072)
            org.jsoup.nodes.Element.html(Element.java:1066)
            org.jsoup.nodes.Document.outerHtml(Document.java:178)
            org.jsoup.select.Elements.outerHtml(Elements.java:225) */
        elements.outerHtml();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.select
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#select(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Selector.select(query, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException() {
        Elements elements = new Elements();
        
        elements.select(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#select(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Selector.select(query, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException_1() {
        Elements elements = new Elements();
        String string = "";
        
        elements.select(string);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.select.Elements}
     * @utbot.methodUnderTest {@link org.jsoup.select.Elements#select(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSelectThrowsIAEWithNonEmptyString() {
        Elements elements = new Elements();
        elements.add(((Object) null));
        elements.add(((Object) null));
        elements.add(((Object) null));
        
        elements.select("cab");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method select(java.lang.String)
    
    @Test
    public void testSelect1() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0000";
        
        Elements actual = elements.select(string);
        
        ArrayList arrayList1 = new ArrayList();
        Elements expected = new Elements(((List) arrayList1));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        Elements elements = ((Elements) createInstance("org.jsoup.select.Elements"));
        setField(elements, "org.jsoup.select.Elements", "contents", arrayList);
        arrayList.add(elements);
        arrayList.add(elements);
        Elements elements1 = new Elements(((List) arrayList));
        String string = "!\u0000\u0000\u0001\u0001";
        
        elements1.select(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSelect3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001";
        
        elements.select(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method select(java.lang.String)
    
    @Test
    public void testSelect4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0001\u0001\u0101\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        
        /* This test fails because method [org.jsoup.select.Elements.select] produces [java.lang.NullPointerException] */
        elements.select(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.removeAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeAttr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRemoveAttr_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.removeAttr(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testRemoveAttr_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.removeAttr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.removeAttr(Elements.java:94) */
        elements.removeAttr(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeAttr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.removeAttr(attributeKey);
 *  */
    @Test
    public void testRemoveAttr_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.removeAttr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.removeAttr(Elements.java:95) */
        elements.removeAttr(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.removeAttr(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.removeAttr(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.removeAttr(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_ThrowIllegalArgumentException_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        elements.removeAttr(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeAttr(java.lang.String)
    
    @Test
    public void testRemoveAttr1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) document);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        Elements elements = new Elements(((List) arrayList));
        String string = "K";
        
        /* This test fails because method [org.jsoup.select.Elements.removeAttr] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jsoup.nodes.Element ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.select.Elements.removeAttr(Elements.java:94) */
        elements.removeAttr(string);
    }
    
    @Test
    public void testRemoveAttr2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0000K";
        
        /* This test fails because method [org.jsoup.select.Elements.removeAttr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.removeAttr(Elements.java:95) */
        elements.removeAttr(string);
    }
    
    @Test
    public void testRemoveAttr3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.select.Elements.removeAttr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.removeAttr(Elements.java:95) */
        elements.removeAttr(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.removeClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRemoveClass_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        Elements actual = elements.removeClass(null);
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elements, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testRemoveClass_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.removeClass(Elements.java:118) */
        elements.removeClass(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.removeClass(className);
 *  */
    @Test
    public void testRemoveClass_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.removeClass(Elements.java:119) */
        elements.removeClass(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#removeClass(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: element.removeClass(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClass_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.removeClass(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeClass(java.lang.String)
    
    @Test
    public void testRemoveClass1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(document, "org.jsoup.nodes.Element", "classNames", classNames);
        arrayList.add(document);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        arrayList.add(element);
        arrayList.add(element);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:33)
            org.jsoup.helper.StringUtil.join(StringUtil.java:20)
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.removeClass(Element.java:988)
            org.jsoup.select.Elements.removeClass(Elements.java:119) */
        elements.removeClass(string);
    }
    
    @Test
    public void testRemoveClass2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(document, "org.jsoup.nodes.Element", "classNames", classNames);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.removeClass(Element.java:988)
            org.jsoup.select.Elements.removeClass(Elements.java:119) */
        elements.removeClass(string);
    }
    
    @Test
    public void testRemoveClass3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.removeClass(Elements.java:119) */
        elements.removeClass(string);
    }
    
    @Test
    public void testRemoveClass4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        String string = "";
        
        /* This test fails because method [org.jsoup.select.Elements.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.removeClass(Elements.java:119) */
        elements.removeClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.select.Elements.hasAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasAttr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasAttr_ListIterator() {
        ArrayList arrayList = new ArrayList();
        Elements elements = new Elements(((List) arrayList));
        
        boolean actual = elements.hasAttr(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasAttr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element element: contents)
 *  */
    @Test
    public void testHasAttr_ThrowNullPointerException_1() {
        Elements elements = new Elements(((List) null));
        
        /* This test fails because method [org.jsoup.select.Elements.hasAttr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasAttr(Elements.java:68) */
        elements.hasAttr(null);
    }
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasAttr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: element.hasAttr(attributeKey)
 *  */
    @Test
    public void testHasAttr_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.select.Elements.hasAttr] produces [java.lang.NullPointerException]
            org.jsoup.select.Elements.hasAttr(Elements.java:69) */
        elements.hasAttr(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Elements}
 * @utbot.methodUnderTest {@link org.jsoup.select.Elements#hasAttr(java.lang.String)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Element element: contents)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: element.hasAttr(attributeKey)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_ThrowIllegalArgumentException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        elements.hasAttr(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasAttr(java.lang.String)
    
    @Test
    public void testHasAttr1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) document);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        Elements elements = new Elements(((List) arrayList));
        String string = "K[\u0000";
        
        /* This test fails because method [org.jsoup.select.Elements.hasAttr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:112)
            org.jsoup.select.Elements.hasAttr(Elements.java:69) */
        elements.hasAttr(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields995953217514000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields995953217514000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass995953217521200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields995953217514000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass995953217521200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

