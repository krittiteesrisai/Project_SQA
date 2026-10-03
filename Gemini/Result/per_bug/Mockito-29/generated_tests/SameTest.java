package org.mockito.internal.matchers;

import org.hamcrest.StringDescription;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SameTest {

    // ==========================================
    // 1. Tests for matches(Object actual)
    // ==========================================

    @Test
    public void testMatches_SameInstance_ShouldReturnTrue() {
        Object obj = new Object();
        Same matcher = new Same(obj);

        assertTrue("Should return true when comparing the exact same object reference", matcher.matches(obj));
    }

    @Test
    public void testMatches_BothNull_ShouldReturnTrue() {
        Same matcher = new Same(null);

        assertTrue("Should return true when both wanted and actual are null", matcher.matches(null));
    }

    @Test
    public void testMatches_EqualValuesDifferentInstances_ShouldReturnFalse() {
        String str1 = new String("defects4j");
        String str2 = new String("defects4j");
        Same matcher = new Same(str1);

        assertFalse("Should return false for different instances even if values are equal", matcher.matches(str2));
    }

    @Test
    public void testMatches_WantedNullActualNonNull_ShouldReturnFalse() {
        Same matcher = new Same(null);

        assertFalse("Should return false when wanted is null but actual is non-null", matcher.matches("non-null"));
    }

    @Test
    public void testMatches_WantedNonNullActualNull_ShouldReturnFalse() {
        Same matcher = new Same("non-null");

        assertFalse("Should return false when wanted is non-null but actual is null", matcher.matches(null));
    }

    @Test
    public void testMatches_DifferentTypesAndValues_ShouldReturnFalse() {
        Same matcher = new Same(100);

        assertFalse("Should return false when comparing different types", matcher.matches("100"));
    }

    // ==========================================
    // 2. Tests for describeTo & appendQuoting
    // ==========================================

    @Test
    public void testDescribeTo_StringInstance_ShouldAppendDoubleQuotes() {
        Same matcher = new Same("hello");
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        assertEquals("same(\"hello\")", description.toString());
    }

    @Test
    public void testDescribeTo_EmptyString_ShouldAppendDoubleQuotesWithEmptyContent() {
        Same matcher = new Same("");
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        assertEquals("same(\"\")", description.toString());
    }

    @Test
    public void testDescribeTo_CharacterInstance_ShouldAppendSingleQuotes() {
        Same matcher = new Same('Z');
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        assertEquals("same('Z')", description.toString());
    }

    @Test
    public void testDescribeTo_OtherObject_ShouldNotAppendQuotes() {
        Integer number = 12345;
        Same matcher = new Same(number);
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        assertEquals("same(12345)", description.toString());
    }

    @Test
    public void testDescribeTo_CustomObjectWithToString_ShouldRenderCorrectly() {
        Object custom = new Object() {
            @Override
            public String toString() {
                return "custom_object";
            }
        };
        Same matcher = new Same(custom);
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        assertEquals("same(custom_object)", description.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testDescribeTo_NullWanted_ExposesDefects4JMockito29Bug() {
        // Defects4J Mockito-29b Bug: Calling describeTo when wanted is null causes NullPointerException
        Same matcher = new Same(null);
        StringDescription description = new StringDescription();

        matcher.describeTo(description);
    }

    // ==========================================
    // 3. Tests for Serialization / Boundary Limits
    // ==========================================

    @Test
    public void testSerialization_RoundTrip() throws Exception {
        Same original = new Same("serializedString");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Same deserialized = (Same) ois.readObject();
        ois.close();

        assertNotNull("Deserialized object should not be null", deserialized);
        StringDescription description = new StringDescription();
        deserialized.describeTo(description);
        assertEquals("same(\"serializedString\")", description.toString());
    }
}