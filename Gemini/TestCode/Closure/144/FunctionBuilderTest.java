package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;

/**
 * JUnit 4 Test class for FunctionBuilder targeting high Branch/Condition coverage
 * and edge cases for Defects4J Closure-144b.
 */
public class FunctionBuilderTest extends TestCase {

    private JSTypeRegistry registry;
    private FunctionBuilder builder;

    @Before
    public void setUp() throws Exception {
        // สร้าง JSTypeRegistry จำลองเบื้องต้นสำหรับการทดสอบ
        // (ใช้ ErrorReporter ว่างๆ ตามโครงสร้างของ Rhino/Closure Compiler)
        this.registry = new JSTypeRegistry(new com.google.javascript.rhino.testing.TestErrorReporter());
        this.builder = new FunctionBuilder(registry);
    }

    @Test
    public void testDefaultBuild() {
        // ทดสอบการสร้างด้วยค่าเริ่มต้นทั้งหมด (Default states)
        FunctionType fnType = builder.build();
        assertNotNull("FunctionType built with defaults should not be null", fnType);
        assertFalse("Default should not be a constructor", fnType.isConstructor());
        assertFalse("Default should not be a native object type", fnType.isNativeObjectType());
    }

    @Test
    public void testAllSettersAndChaining() {
        // ทดสอบการเรียกใช้งานทุก Setter แบบ Chaining และตรวจสอบค่าที่ได้ผ่าน build()
        Node sourceNode = new Node(Token.FUNCTION);
        Node paramsNode = new Node(Token.PARAM_LIST);
        JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType typeOfThis = registry.createAnonymousObjectType();
        String funcName = "testFunc";
        String templateName = "T";

        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
        paramBuilder.addRequiredParams(returnType);

        FunctionType fnType = builder
                .withName(funcName)
                .withSourceNode(sourceNode)
                .withParams(paramBuilder)
                .withReturnType(returnType)
                .withTypeOfThis(typeOfThis)
                .withTemplateName(templateName)
                .forConstructor()
                .forNativeType() // package-private method inside the same package scope
                .build();

        assertNotNull(fnType);
        assertEquals("Function name should match", funcName, fnType.getReferenceName());
        assertEquals("Source node should match", sourceNode, fnType.getSource());
        assertEquals("Return type should match", returnType, fnType.getReturnType());
        assertEquals("Type of this should match", typeOfThis, fnType.getTypeOfThis());
        assertEquals("Template type name should match", templateName, fnType.getTemplateTypeName());
        assertTrue("Should be a constructor", fnType.isConstructor());
        assertTrue("Should be a native object type", fnType.isNativeObjectType());
    }

    @Test
    public void testInferredReturnTypeSetter() {
        // ทดสอบการตั้งค่า Return Type แบบ Inferred
        JSType returnType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        
        FunctionType fnType = builder
                .withInferredReturnType(returnType)
                .build();

        assertNotNull(fnType);
        assertEquals("Return type should match", returnType, fnType.getReturnType());
        assertTrue("Return type should be inferred", fnType.isReturnTypeInferred());
    }

    @Test
    public void testParamsNodeDirectly() {
        // ทดสอบการกำหนด parametersNode โดยตรงด้วย withParamsNode
        Node paramsNode = new Node(Token.PARAM_LIST);
        
        FunctionType fnType = builder
                .withParamsNode(paramsNode)
                .build();

        assertNotNull(fnType);
        assertEquals("Parameters node should match", paramsNode, fnType.getParametersNode());
    }

    @Test
    public void testNullInputsEdgeCases() {
        // ทดสอบการส่งค่า null เข้าไปใน Setter ทั้งหมดเพื่อตรวจสอบความทนทานต่อ Null/Edge cases
        FunctionType fnType = builder
                .withName(null)
                .withSourceNode(null)
                .withParamsNode(null)
                .withReturnType(null)
                .withTypeOfThis(null)
                .withTemplateName(null)
                .build();

        assertNotNull("Should build successfully even with null parameters", fnType);
        assertNull("Reference name should be null", fnType.getReferenceName());
    }

    @Test
    public void testCopyFromOtherFunction() {
        // ทดสอบการคัดลอกสถานะจาก FunctionType อื่น (copyFromOtherFunction)
        Node sourceNode = new Node(Token.FUNCTION);
        Node paramsNode = new Node(Token.PARAM_LIST);
        JSType returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ObjectType typeOfThis = registry.createAnonymousObjectType();

        // สร้าง FunctionType ต้นแบบ
        FunctionType originalFunc = new FunctionBuilder(registry)
                .withName("original")
                .withSourceNode(sourceNode)
                .withParamsNode(paramsNode)
                .withReturnType(returnType)
                .withTypeOfThis(typeOfThis)
                .withTemplateName("TemplateX")
                .forConstructor()
                .forNativeType()
                .build();

        // ใช้ Builder ใหม่คัดลอกข้อมูลจากตัวต้นแบบ
        FunctionType copiedFunc = new FunctionBuilder(registry)
                .copyFromOtherFunction(originalFunc)
                .build();

        assertNotNull(copiedFunc);
        assertEquals(originalFunc.getReferenceName(), copiedFunc.getReferenceName());
        assertEquals(originalFunc.getSource(), copiedFunc.getSource());
        assertEquals(originalFunc.getParametersNode(), copiedFunc.getParametersNode());
        assertEquals(originalFunc.getReturnType(), copiedFunc.getReturnType());
        assertEquals(originalFunc.getTypeOfThis(), copiedFunc.getTypeOfThis());
        assertEquals(originalFunc.getTemplateTypeName(), copiedFunc.getTemplateTypeName());
        assertEquals(originalFunc.isConstructor(), copiedFunc.isConstructor());
        assertEquals(originalFunc.isNativeObjectType(), copiedFunc.isNativeObjectType());
    }
}