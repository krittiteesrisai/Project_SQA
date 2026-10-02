package org.apache.commons.jxpath.ri;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.NamespaceResolver; // import ตามข้อกำหนด (ซ้ำกับ package แต่ไม่ error)
import org.apache.commons.jxpath.ri.model.NodePointer;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;

/**
 * Unit tests for {@link NamespaceResolver}.
 *
 * หมายเหตุทั่วไป:
 * - คลาสนี้ไม่มี mocking framework สำหรับ abstract class NodePointer ใน classpath ที่กำหนด
 *   จึงใช้ NodePointer จริงที่ได้จาก JXPathContext (bean ปกติ / JDOM element)
 * - พฤติกรรมภายในของ JDOMNodePointer / bean NodePointer (เช่น namespaceIterator(),
 *   getNamespaceURI(String)) ไม่ได้อยู่ใน source ของ NamespaceResolver ที่ให้มา
 *   จึงถือเป็น "สมมติฐาน" และมีคอมเมนต์กำกับไว้ในแต่ละเทสที่เกี่ยวข้อง
 */
public class NamespaceResolverTest {

    private NamespaceResolver resolver;

    @Before
    public void setUp() {
        resolver = new NamespaceResolver();
    }

    // ---------------------------------------------------------------
    // Helper: pointer จาก bean ปกติ (ไม่มี namespace)
    // สมมติฐาน: NodePointer ของ bean ที่ไม่รองรับ namespace จะคืนค่า null จาก
    // namespaceIterator()/getNamespaceURI(String) ซึ่งสอดคล้องกับการเช็ค
    // "if (ni != null)" และ "if (uri == null && pointer != null)" ใน source จริง
    // (เป็นพฤติกรรม default ที่ implied จากการออกแบบ API แต่ไม่ได้ระบุไว้ตรง ๆ ใน source ที่ให้มา)
    // ---------------------------------------------------------------
    private NodePointer createBeanNodePointer() {
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer p = context.getContextPointer();
        return (NodePointer) p;
    }

    // =================================================================
    // Constructor
    // =================================================================

    @Test
    public void testDefaultConstructor_noParent_noPointer_returnsNull() {
        assertFalse(resolver.isSealed());
        assertNull(resolver.getNamespaceContextPointer());
    }

    @Test
    public void testConstructorWithParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        assertNull(child.getNamespaceContextPointer());
    }

    // =================================================================
    // registerNamespace()
    // =================================================================

    @Test
    public void testRegisterNamespace_notSealed_storesAndRetrievable() {
        resolver.registerNamespace("a", "urn:a");
        assertEquals("urn:a", resolver.getNamespaceURI("a"));
    }

    @Test(expected = IllegalStateException.class)
    public void testRegisterNamespace_whenSealed_throwsIllegalStateException() {
        resolver.seal();
        resolver.registerNamespace("a", "urn:a");
    }

    @Test
    public void testRegisterNamespace_withNullPrefix_boundaryCase() {
        resolver.registerNamespace(null, "urn:nullprefix");
        assertEquals("urn:nullprefix", resolver.getNamespaceURI(null));
    }

    @Test
    public void testRegisterNamespace_withEmptyPrefix_boundaryCase() {
        resolver.registerNamespace("", "urn:default");
        assertEquals("urn:default", resolver.getNamespaceURI(""));
    }

    // =================================================================
    // setNamespaceContextPointer() / getNamespaceContextPointer()
    // =================================================================

    @Test
    public void testGetNamespaceContextPointer_ownPointerSet_returnsOwn() {
        NodePointer ptr = createBeanNodePointer();
        resolver.setNamespaceContextPointer(ptr);
        assertSame(ptr, resolver.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceContextPointer_ownNull_delegatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NodePointer parentPtr = createBeanNodePointer();
        parent.setNamespaceContextPointer(parentPtr);
        NamespaceResolver child = new NamespaceResolver(parent);

        assertSame(parentPtr, child.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceContextPointer_ownNull_noParent_returnsNull() {
        assertNull(resolver.getNamespaceContextPointer());
    }

    // =================================================================
    // getNamespaceURI()
    // =================================================================

    @Test
    public void testGetNamespaceURI_foundInOwnMap() {
        resolver.registerNamespace("x", "urn:x");
        assertEquals("urn:x", resolver.getNamespaceURI("x"));
    }

    @Test
    public void testGetNamespaceURI_notFound_noPointer_noParent_returnsNull() {
        assertNull(resolver.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURI_nullPrefix_boundary() {
        assertNull(resolver.getNamespaceURI(null));
    }

    @Test
    public void testGetNamespaceURI_notFoundLocally_delegatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("p", "urn:parent");
        NamespaceResolver child = new NamespaceResolver(parent);

        assertEquals("urn:parent", child.getNamespaceURI("p"));
    }

    @Test
    public void testGetNamespaceURI_notInMap_pointerAlsoReturnsNull_noParent() {
        // pointer != null แต่เป็น bean pointer ที่ไม่มี namespace -> คาดว่า uri ยังเป็น null
        NodePointer ptr = createBeanNodePointer();
        resolver.setNamespaceContextPointer(ptr);
        assertNull(resolver.getNamespaceURI("anything"));
    }

    @Test
    public void testGetNamespaceURI_usesPointer_whenNotInOwnMap() {
        // หมายเหตุ: พึ่งพาพฤติกรรมจริงของ JDOMNodePointer.getNamespaceURI(String)
        // (ไม่ได้อยู่ใน source ของ NamespaceResolver ที่ให้มา เป็นสมมติฐานอิงมาตรฐาน XML namespace scope)
        Namespace ns1 = Namespace.getNamespace("ns1", "urn:ns1");
        Element root = new Element("root", ns1);
        JXPathContext context = JXPathContext.newContext(root);
        NodePointer ptr = (NodePointer) context.getContextPointer();

        resolver.setNamespaceContextPointer(ptr);
        assertEquals("urn:ns1", resolver.getNamespaceURI("ns1"));
    }

    @Test
    public void testGetNamespaceURI_ownMapTakesPrecedenceOverPointer() {
        // ทดสอบว่าถ้าพบใน namespaceMap แล้ว จะไม่เรียก pointer เลย (short-circuit)
        Namespace ns1 = Namespace.getNamespace("ns1", "urn:from-pointer");
        Element root = new Element("root", ns1);
        JXPathContext context = JXPathContext.newContext(root);
        NodePointer ptr = (NodePointer) context.getContextPointer();

        resolver.setNamespaceContextPointer(ptr);
        resolver.registerNamespace("ns1", "urn:from-map");

        assertEquals("urn:from-map", resolver.getNamespaceURI("ns1"));
    }

    // =================================================================
    // getPrefix()
    // =================================================================

    // *** Fault-detection test สำหรับ defect ที่รู้จัก (JxPath-13): ***
    // getPrefix() เรียก pointer.namespaceIterator() โดยไม่เช็ค null ก่อน
    @Test(expected = NullPointerException.class)
    public void testGetPrefix_withNullPointer_throwsNPE_knownDefect() {
        // ไม่ได้เรียก setNamespaceContextPointer() -> pointer เป็น null
        resolver.getPrefix("urn:any");
    }

    @Test
    public void testGetPrefix_foundInOwnMap_withNiNullBranch() {
        // ni == null (bean pointer ไม่รองรับ namespace) -> ข้าม loop แต่ยังหาพบจาก namespaceMap
        resolver.registerNamespace("x", "urn:x");
        NodePointer ptr = createBeanNodePointer();
        resolver.setNamespaceContextPointer(ptr);

        assertEquals("x", resolver.getPrefix("urn:x"));
    }

    @Test
    public void testGetPrefix_notFound_noParent_returnsNull() {
        NodePointer ptr = createBeanNodePointer();
        resolver.setNamespaceContextPointer(ptr);
        assertNull(resolver.getPrefix("urn:none"));
    }

    @Test
    public void testGetPrefix_withNullNamespaceURI_boundary() {
        NodePointer ptr = createBeanNodePointer();
        resolver.setNamespaceContextPointer(ptr);
        assertNull(resolver.getPrefix(null));
    }

    @Test
    public void testGetPrefix_notFoundLocally_delegatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("p", "urn:parent");
        parent.setNamespaceContextPointer(createBeanNodePointer());

        NamespaceResolver child = new NamespaceResolver(parent);
        child.setNamespaceContextPointer(createBeanNodePointer());

        assertEquals("p", child.getPrefix("urn:parent"));
    }

    @Test
    public void testGetPrefix_usesCachedReverseMap_doesNotRebuild() {
        // ทดสอบ branch "reverseMap == null" (true แล้ว false ในครั้งถัดไป)
        // โดยอาศัยการเข้าถึง field แบบ package-private (white-box)
        NodePointer ptr = createBeanNodePointer();
        resolver.setNamespaceContextPointer(ptr);
        resolver.registerNamespace("x", "urn:x");

        // เรียกครั้งแรก -> reverseMap == null -> ถูกสร้างใหม่ (branch TRUE)
        assertEquals("x", resolver.getPrefix("urn:x"));
        assertNotNull(resolver.reverseMap);

        // แก้ namespaceMap โดยตรง (ข้าม registerNamespace เพื่อไม่ reset reverseMap)
        resolver.namespaceMap.put("z", "urn:z");

        // เรียกครั้งที่สอง -> reverseMap != null -> ไม่ rebuild (branch FALSE)
        // จึงไม่พบ "urn:z" ที่เพิ่งเพิ่มเข้าไป
        assertNull(resolver.getPrefix("urn:z"));
    }

    @Test
    public void testGetPrefix_skipsEmptyPrefixNamespaceNode() {
        // หมายเหตุ: อิง behavior ของ JDOMNodePointer.namespaceIterator() (ไม่ได้อยู่ใน
        // source ที่ให้มา) แต่โค้ดต้นฉบับมี condition ชัดเจนว่า
        // if (!"".equals(prefix)) { reverseMap.put(...) } ดังนั้น namespace ที่มี prefix
        // เป็นค่าว่าง (default namespace) ต้องไม่ถูกเก็บลง reverseMap
        Namespace defaultNs = Namespace.getNamespace("urn:default-ns"); // prefix == ""
        Element root = new Element("root", defaultNs);
        JXPathContext context = JXPathContext.newContext(root);
        NodePointer ptr = (NodePointer) context.getContextPointer();

        NamespaceResolver localResolver = new NamespaceResolver();
        localResolver.setNamespaceContextPointer(ptr);

        assertNull(localResolver.getPrefix("urn:default-ns"));
    }

    @Test
    public void testGetPrefix_loopAddsNonEmptyPrefixFromNamespaceIterator() {
        // หมายเหตุ: อิง behavior จริงของ JDOMNodePointer.namespaceIterator()/getName()
        // ซึ่งไม่ได้อยู่ใน source ของ NamespaceResolver (สมมติฐานตามแบบ XPath namespace axis)
        Namespace ns1 = Namespace.getNamespace("ns1", "urn:ns1");
        Element root = new Element("root", ns1);
        Document doc = new Document(root);
        JXPathContext context = JXPathContext.newContext(root);
        NodePointer ptr = (NodePointer) context.getContextPointer();

        NamespaceResolver localResolver = new NamespaceResolver();
        localResolver.setNamespaceContextPointer(ptr);

        String prefix = localResolver.getPrefix("urn:ns1");
        assertEquals("ns1", prefix);
    }

    // =================================================================
    // isSealed() / seal()
    // =================================================================

    @Test
    public void testIsSealed_initiallyFalse() {
        assertFalse(resolver.isSealed());
    }

    @Test
    public void testSeal_setsSealedTrue_noParent() {
        resolver.seal();
        assertTrue(resolver.isSealed());
    }

    @Test
    public void testSeal_propagatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);

        child.seal();

        assertTrue(child.isSealed());
        assertTrue(parent.isSealed());
    }

    // =================================================================
    // clone()
    // =================================================================

    @Test
    public void testClone_resetsSealedToFalse() {
        resolver.seal();
        assertTrue(resolver.isSealed());

        NamespaceResolver clone = (NamespaceResolver) resolver.clone();

        assertFalse(clone.isSealed());
        assertTrue(resolver.isSealed()); // ต้นฉบับยังคง sealed อยู่
    }

    @Test
    public void testClone_returnsDifferentInstance() {
        NamespaceResolver clone = (NamespaceResolver) resolver.clone();
        assertNotSame(resolver, clone);
    }

    // หมายเหตุ: branch "catch (CloneNotSupportedException e)" ใน clone()
    // ไม่สามารถถูกทดสอบให้เกิดขึ้นจริงได้ เพราะ NamespaceResolver implements Cloneable
    // อย่างถูกต้อง ทำให้ super.clone() ไม่ throw exception นี้ในสภาวะปกติ
    // (dead/unreachable branch ในทางปฏิบัติ จึงไม่ได้เขียนเทสสำหรับ branch นี้)
}
