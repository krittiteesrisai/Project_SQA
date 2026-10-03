package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ObjectMapperTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testDefaultTypeResolverBuilder_ObjectAndNonConcrete() {
        // ทดสอบ DefaultTyping.OBJECT_AND_NON_CONCRETE กับคลาสที่เป็น Object, Abstract, Concrete และ TreeNode
        ObjectMapper.DefaultTypeResolverBuilder typer = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);

        JavaType objectType = objectMapper.constructType(Object.class);
        JavaType stringType = objectMapper.constructType(String.class);
        JavaType listType = objectMapper.constructType(List.class); // Abstract/Interface
        JavaType treeNodeType = objectMapper.constructType(ObjectNode.class); // TreeNode subclass (Issue #88)

        assertTrue("Object.class should use type", typer.useForType(objectType));
        assertFalse("String.class (concrete final) should not use type", typer.useForType(stringType));
        assertTrue("List.class (abstract/interface) should use type", typer.useForType(listType));
        assertFalse("TreeNode subclass should not use type per Issue #88", typer.useForType(treeNodeType));
    }

    @Test
    public void testDefaultTypeResolverBuilder_NonConcreteAndArrays() {
        // ทดสอบ DefaultTyping.NON_CONCRETE_AND_ARRAYS (ครอบคลุม loop isArrayType)
        ObjectMapper.DefaultTypeResolverBuilder typer = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);

        JavaType stringArrayType = objectMapper.constructType(String[].class);
        JavaType objectArrayType = objectMapper.constructType(Object[].class);

        assertFalse("Array of final concrete types should not trigger type", typer.useForType(stringArrayType));
        assertTrue("Array of Object should trigger type", typer.useForType(objectArrayType));
    }

    @Test
    public void testDefaultTypeResolverBuilder_NonFinal() {
        // ทดสอบ DefaultTyping.NON_FINAL
        ObjectMapper.DefaultTypeResolverBuilder typer = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);

        JavaType finalClassType = objectMapper.constructType(String.class); // Final
        JavaType nonFinalClassType = objectMapper.constructType(NonFinalDummy.class); // Non-final
        JavaType treeNodeType = objectMapper.constructType(ObjectNode.class); // TreeNode

        assertFalse("Final class should not use type", typer.useForType(finalClassType));
        assertTrue("Non-final class should use type", typer.useForType(nonFinalClassType));
        assertFalse("TreeNode should not use type", typer.useForType(treeNodeType));
    }

    @Test
    public void testDefaultTypeResolverBuilder_DefaultJavaLangObject() {
        // ทดสอบ Default กรณีอื่นๆ (เช่น JAVA_LANG_OBJECT)
        ObjectMapper.DefaultTypeResolverBuilder typer = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);

        JavaType objectType = objectMapper.constructType(Object.class);
        JavaType stringType = objectMapper.constructType(String.class);

        assertTrue(typer.useForType(objectType));
        assertFalse(typer.useForType(stringType));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_NullType_ThrowsException() throws Exception {
        // Edge Case: ส่ง null เข้าไปใน acceptJsonFormatVisitor ต้องโยน IllegalArgumentException
        objectMapper.acceptJsonFormatVisitor((JavaType) null, null);
    }

    @Test
    public void testCopyAndInvalidCopy() {
        // ทดสอบ Copy Constructor และการทำงานของคลาสลูกที่ไม่ได้ override copy()
        ObjectMapper copied = objectMapper.copy();
        assertNotNull(copied);
    }

    @Test(expected = IllegalStateException.class)
    public void testCheckInvalidCopy_ThrowsIllegalStateException() {
        // จำลองสถานการณ์เรียก _checkInvalidCopy เมื่อคลาสไม่ตรงกัน
        InvalidCopyObjectMapper invalidMapper = new InvalidCopyObjectMapper();
        invalidMapper.triggerInvalidCopy();
    }

    // --- Helper classes สำหรับทดสอบ ---
    public static class NonFinalDummy {
        public String field;
    }

    public static class InvalidCopyObjectMapper extends ObjectMapper {
        public void triggerInvalidCopy() {
            _checkInvalidCopy(ObjectMapper.class);
        }
    }
}