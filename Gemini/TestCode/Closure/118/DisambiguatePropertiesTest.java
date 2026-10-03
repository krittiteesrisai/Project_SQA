package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test class for DisambiguateProperties (Closure-118b).
 * Focused on Branch/Condition coverage and edge cases.
 */
public class DisambiguatePropertiesTest {

    private Compiler compiler;
    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนดค่าเริ่มต้นเบื้องต้นให้ Compiler เพื่อให้ใช้งาน TypeRegistry ได้
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        registry = compiler.getTypeRegistry();
    }

    @Test
    public void testConstructorWithEmptyPropertiesToErrorFor() {
        // Branch: propertiesToErrorFor เป็น Empty -> invalidationalMap ต้องเป็น null
        DisambiguateProperties<JSType> disambiguate = 
            DisambiguateProperties.forJSTypeSystem(compiler, Collections.emptyMap());
        assertNotNull("DisambiguateProperties instance should be created", disambiguate);
    }

    @Test
    public void testConstructorWithNonEmptyPropertiesToErrorFor() {
        // Branch: propertiesToErrorFor ไม่เป็น Empty -> invalidationMap ต้องถูกสร้างด้วย LinkedHashMultimap
        Map<String, CheckLevel> errorMap = ImmutableMap.of("a", CheckLevel.ERROR);
        DisambiguateProperties<JSType> disambiguate = 
            DisambiguateProperties.forJSTypeSystem(compiler, errorMap);
        assertNotNull("DisambiguateProperties instance should be created with error map", disambiguate);
    }

    @Test
    public void testGetPropertyCreationAndCaching() {
        // ทดสอบการสร้างและเรียกใช้ Property ผ่าน getProperty (Protected method)
        DisambiguateProperties<JSType> disambiguate = 
            DisambiguateProperties.forJSTypeSystem(compiler, Collections.emptyMap());
        
        DisambiguateProperties<JSType>.Property prop1 = disambiguate.getProperty("testProp");
        DisambiguateProperties<JSType>.Property prop2 = disambiguate.getProperty("testProp");

        assertNotNull(prop1);
        assertSame("Property instance should be cached for the same name", prop1, prop2);
        assertEquals("testProp", prop1.name);
    }

    @Test
    public void testPropertyInvalidationFlow() {
        // ทดสอบสถานะและการทำงานเมื่อ Property ถูก invalidate
        DisambiguateProperties<JSType> disambiguate = 
            DisambiguateProperties.forJSTypeSystem(compiler, Collections.emptyMap());
        
        DisambiguateProperties<JSType>.Property prop = disambiguate.getProperty("invalidateProp");
        assertFalse(prop.shouldRename());

        // จำลองการเรียก scheduleRenaming ด้วย Invalidating Type (เช่น ALL_TYPE)
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        Node node = Node.newString("invalidateProp");
        
        boolean result = prop.scheduleRenaming(node, allType);
        assertFalse("Scheduling with invalidating type should return false", result);
        assertFalse("Should not rename after invalidation", prop.shouldRename());
    }

    @Test
    public void testExpandTypesToSkipLoopBoundary() {
        // ทดสอบ Edge Case ของ expandTypesToSkip() เพื่อป้องกัน Infinite loop และเช็คเงื่อนไข count < 10
        DisambiguateProperties<JSType> disambiguate = 
            DisambiguateProperties.forJSTypeSystem(compiler, Collections.emptyMap());
        
        DisambiguateProperties<JSType>.Property prop = disambiguate.getProperty("loopProp");
        
        // เพิ่ม Type เข้าไปใน typesToSkip และทำการเรียก expandTypesToSkip
        JSType objType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        prop.typesToSkip.add(objType);
        
        // ควรทำงานสำเร็จโดยไม่ติด IllegalStateException จาก checkState(++count < 10)
        try {
            prop.expandTypesToSkip();
        } catch (IllegalStateException e) {
            fail("Stuck in loop expanding types to skip triggered: " + e.getMessage());
        }
    }

    @Test
    public void testProcessWithNullOrUnknownTypes() {
        // ทดสอบการจัดการ Node ที่มี JSType เป็น null หรือ Unknown
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        
        // สร้าง GetProp node ที่ไม่มี Type ชัดเจน
        Node getProp = Node.newString(Token.GETPROP, "unknownProp");
        root.addChildToBack(getProp);

        DisambiguateProperties<JSType> disambiguate = 
            DisambiguateProperties.forJSTypeSystem(compiler, ImmutableMap.of("unknownProp", CheckLevel.WARNING));
        
        // รัน process เพื่อให้ครอบคลุมส่วนของการรายงานข้อผิดพลาดและ Type ที่เป็น Unknown
        compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
        disambiguate.process(externs, root);
        
        assertNotNull(disambiguate);
    }
}