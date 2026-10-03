package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.DupDetector;
import com.fasterxml.jackson.core.JsonGenerationException;
import org.junit.Test;

import static org.junit.Assert.*;

public class JsonWriteContextTest {

    @Test
    public void testRootContextCreationAndValues() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        assertNull(root.getParent());
        assertNull(root.getCurrentName());
        assertNull(root.getCurrentValue());
        assertNull(root.getDupDetector());
        assertEquals("/", root.toString());

        // Test root context writeValue (Index transitions)
        // First write: index becomes 0, returns STATUS_OK_AS_IS (0)
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, root.writeValue());
        // Subsequent writes: index >= 0, returns STATUS_OK_AFTER_SPACE (3)
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, root.writeValue());
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, root.writeValue());

        // Test setCurrentValue and getCurrentValue
        root.setValue("RootVal");
        assertEquals("RootVal", root.getCurrentValue());
    }

    @Test
    public void testArrayContextCreationAndReuse() {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        
        // _child == null branch
        JsonWriteContext arrayCtxt = root.createChildArrayContext();
        assertNotNull(arrayCtxt);
        assertEquals(JsonWriteContext.TYPE_ARRAY, arrayCtxt.getType());
        assertEquals(root, arrayCtxt.getParent());
        assertEquals("[-1]", arrayCtxt.toString());

        // Test array writeValue
        // First element: index < 0 -> STATUS_OK_AS_IS
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, arrayCtxt.writeValue());
        assertEquals("[0]", arrayCtxt.toString());

        // Second element: index >= 0 -> STATUS_OK_AFTER_COMMA
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, arrayCtxt.writeValue());
        assertEquals("[1]", arrayCtxt.toString());

        // _child != null branch (reuse child slot)
        JsonWriteContext arrayCtxtReused = root.createChildArrayContext();
        assertSame(arrayCtxt, arrayCtxtReused);
        assertEquals("[-1]", arrayCtxtReused.toString()); // reset applied
    }

    @Test
    public void testObjectContextAndFieldWriting() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        
        // _child == null branch for object
        JsonWriteContext objCtxt = root.createChildObjectContext();
        assertNotNull(objCtxt);
        assertEquals(JsonWriteContext.TYPE_OBJECT, objCtxt.getType());
        assertEquals("{?}", objCtxt.toString());

        // Write first field name (index < 0 -> STATUS_OK_AS_IS)
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, objCtxt.writeFieldName("field1"));
        assertEquals("field1", objCtxt.getCurrentName());
        assertEquals("{\"field1\"}", objCtxt.toString());

        // Try writing second field name without value -> should trigger _gotName == true branch
        assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, objCtxt.writeFieldName("field2"));

        // Call writeValue() -> resets _gotName, increments index, returns STATUS_OK_AFTER_COLON
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, objCtxt.writeValue());

        // Write field name when index >= 0 -> STATUS_OK_AFTER_COMMA
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, objCtxt.writeFieldName("field2"));

        // _child != null branch reuse for object
        JsonWriteContext objCtxtReused = root.createChildObjectContext();
        assertSame(objCtxt, objCtxtReused);
        assertEquals("{?}", objCtxtReused.toString());
    }

    @Test
    public void testDuplicateDetectionInObject() throws Exception {
        DupDetector detector = DupDetector.rootDetector(null);
        JsonWriteContext root = JsonWriteContext.createRootContext(detector);
        JsonWriteContext objCtxt = root.createChildObjectContext();

        // First time writing "name" should succeed
        objCtxt.writeFieldName("name");
        objCtxt.writeValue();

        // Second time writing "name" should throw JsonGenerationException due to duplicate detection
        boolean exceptionThrown = false;
        try {
            objCtxt.writeFieldName("name");
        } catch (JsonGenerationException e) {
            exceptionThrown = true;
            assertTrue(e.getMessage().contains("Duplicate field 'name'"));
        }
        assertTrue("Expected JsonGenerationException for duplicate field", exceptionThrown);
    }

    @Test
    public void testWithDupDetectorAndReset() {
        DupDetector detector1 = DupDetector.rootDetector(null);
        DupDetector detector2 = DupDetector.rootDetector(null);

        JsonWriteContext context = JsonWriteContext.createRootContext(detector1);
        assertSame(detector1, context.getDupDetector());

        // Test withDupDetector
        context.withDupDetector(detector2);
        assertSame(detector2, context.getDupDetector());

        // Test reset functionality
        context.reset(JsonWriteContext.TYPE_ARRAY);
        assertEquals(JsonWriteContext.TYPE_ARRAY, context.getType());
        assertEquals(-1, context.getCurrentIndex());
        assertNull(context.getCurrentName());
        assertNull(context.getCurrentValue());
    }
}