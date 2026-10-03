package com.google.javascript.rhino;

import com.google.javascript.rhino.JSDocInfo.Visibility;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for JSDocInfoBuilder (Closure-106b).
 * Focuses on high branch/condition coverage and edge cases.
 */
public class JSDocInfoBuilderTest {

    private JSDocInfoBuilder builder;

    @Before
    public void setUp() {
        builder = new JSDocInfoBuilder(true);
    }

    @Test
    public void testInitialState() {
        assertFalse(builder.isPopulated());
        assertFalse(builder.isPopulatedWithFileOverview());
        assertFalse(builder.isDescriptionRecorded());
        assertFalse(builder.isConstructorRecorded());
        assertFalse(builder.isInterfaceRecorded());
        assertNull(builder.build("testSource"));
    }

    @Test
    public void testBuildWithPopulation() {
        assertTrue(builder.recordConstancy());
        assertTrue(builder.isPopulated());

        JSDocInfo info = builder.build("source.js");
        assertNotNull(info);
        assertFalse(builder.isPopulated());
        assertNull(builder.build("source2.js")); // Second build when not populated returns null
    }

    @Test
    public void testPopulateDefaultsVisibility() {
        assertTrue(builder.recordConstancy());
        JSDocInfo info = builder.build("source.js");
        assertNotNull(info);
        // Verify default visibility is INHERITED when not explicitly set
        assertEquals(Visibility.INHERITED, info.getVisibility());
    }

    @Test
    public void testRecordVisibilityEdgeCases() {
        assertTrue(builder.recordVisibility(Visibility.PRIVATE));
        // Recording visibility again should return false because it's already defined
        assertFalse(builder.recordVisibility(Visibility.PUBLIC));
    }

    @Test
    public void testRecordTypeAndConflicts() {
        // Mocking JSTypeExpression via Node or standard instantiation if possible.
        // Since JSTypeExpression wraps a Node, we can pass a dummy Node.
        Node dummyNode = new Node(Token.EMPTY);
        JSTypeExpression typeExpr = new JSTypeExpression(dummyNode, "source");

        // Null type edge case
        assertFalse(builder.recordType(null));

        // Valid type recording
        assertTrue(builder.recordType(typeExpr));
        assertTrue(builder.isPopulated());

        // Trying to record another type-related tag when singleton type exists
        JSDocInfoBuilder builder2 = new JSDocInfoBuilder(false);
        assertTrue(builder2.recordType(typeExpr));
        // recordReturnType should fail because type is already set (singleton type tag exists)
        assertFalse(builder2.recordReturnType(typeExpr));
    }

    @Test
    public void testRecordTypedef() {
        Node dummyNode = new Node(Token.EMPTY);
        JSTypeExpression typeExpr = new JSTypeExpression(dummyNode, "source");

        assertFalse(builder.recordTypedef(null));
        assertTrue(builder.recordTypedef(typeExpr));
        assertTrue(builder.isPopulated());
    }

    @Test
    public void testRecordReturnTypeAndDescription() {
        Node dummyNode = new Node(Token.EMPTY);
        JSTypeExpression typeExpr = new JSTypeExpression(dummyNode, "source");

        assertFalse(builder.recordReturnType(null));
        assertTrue(builder.recordReturnType(typeExpr));
        assertTrue(builder.isPopulated());

        assertTrue(builder.recordReturnDescription("Returns a value"));
    }

    @Test
    public void testRecordDefineType() {
        Node dummyNode = new Node(Token.EMPTY);
        JSTypeExpression typeExpr = new JSTypeExpression(dummyNode, "source");

        assertFalse(builder.recordDefineType(null));
        assertTrue(builder.recordDefineType(typeExpr));
        // Defining again should fail due to constancy/define flags set
        assertFalse(builder.recordDefineType(typeExpr));
    }

    @Test
    public void testRecordEnumParameterType() {
        Node dummyNode = new Node(Token.EMPTY);
        JSTypeExpression typeExpr = new JSTypeExpression(dummyNode, "source");

        assertFalse(builder.recordEnumParameterType(null));
        assertTrue(builder.recordEnumParameterType(typeExpr));
    }

    @Test
    public void testRecordThisTypeAndBaseType() {
        Node dummyNode = new Node(Token.EMPTY);
        JSTypeExpression typeExpr = new JSTypeExpression(dummyNode, "source");

        assertFalse(builder.recordThisType(null));
        assertTrue(builder.recordThisType(typeExpr));
        // Duplicate this type
        assertFalse(builder.recordThisType(typeExpr));

        assertFalse(builder.recordBaseType(null));
        assertTrue(builder.recordBaseType(typeExpr));
        // Duplicate base type
        assertFalse(builder.recordBaseType(typeExpr));
    }

    @Test
    public void testRecordParameters() {
        Node dummyNode = new Node(Token.EMPTY);
        JSTypeExpression typeExpr = new JSTypeExpression(dummyNode, "source");

        assertTrue(builder.recordParameter("param1", typeExpr));
        assertTrue(builder.hasParameter("param1"));
        // Duplicate parameter name should return false via declareParam
        assertFalse(builder.recordParameter("param1", typeExpr));

        assertTrue(builder.recordParameterDescription("param1", "A test parameter"));
    }

    @Test
    public void testRecordThrowTypeAndDescription() {
        Node dummyNode = new Node(Token.EMPTY);
        JSTypeExpression typeExpr = new JSTypeExpression(dummyNode, "source");

        assertTrue(builder.recordThrowType(typeExpr));
        assertTrue(builder.recordThrowDescription(typeExpr, "Throws exception"));
    }

    @Test
    public void testMarkersAndAnnotations() {
        // Without active marker (currentMarker == null)
        builder.markText("some text", 1, 0, 1, 10);
        builder.markTypeNode(new Node(Token.EMPTY), 1, 0, 5, true);
        builder.markName("name", 1, 0);

        // With active marker
        builder.markAnnotation("param", 1, 0);
        builder.markText("text", 1, 5, 1, 10);
        builder.markTypeNode(new Node(Token.EMPTY), 1, 12, 15, false);
        builder.markName("name", 1, 16);
    }

    @Test
    public void testBlockAndFileOverviewDescriptions() {
        assertTrue(builder.recordBlockDescription("Block desc"));
        assertTrue(builder.isDescriptionRecorded());

        assertTrue(builder.recordFileOverview("File overview desc"));
        // Requires isPopulated() && currentInfo.hasFileOverview()
        assertTrue(builder.isPopulatedWithFileOverview());
    }

    @Test
    public void testAuthorsReferencesVersionsSuppressions() {
        assertTrue(builder.addAuthor("Author Name"));
        assertTrue(builder.addReference("http://example.com"));
        assertTrue(builder.recordVersion("1.0.0"));
        assertTrue(builder.recordDeprecationReason("Deprecated reason"));

        Set<String> suppressions = new HashSet<String>();
        suppressions.add("checkTypes");
        assertTrue(builder.recordSuppressions(suppressions));

        // Test duplicates / invalid state
        assertFalse(builder.addAuthor("Author Name")); // Depending on implementation, or test multiple calls
        assertFalse(builder.recordVersion("1.0.0"));
    }

    @Test
    public void testFlagsAndBooleans() {
        assertTrue(builder.recordConstancy());
        assertFalse(builder.recordConstancy()); // Already constant

        assertTrue(builder.recordDescription("Valid description"));
        assertFalse(builder.recordDescription(null)); // Null description edge case
        assertFalse(builder.recordDescription("Duplicate description"));

        assertTrue(builder.recordHiddenness());
        assertFalse(builder.recordHiddenness());

        assertTrue(builder.recordNoTypeCheck());
        assertFalse(builder.recordNoTypeCheck());

        assertTrue(builder.recordPreserveTry());
        assertFalse(builder.recordPreserveTry());

        assertTrue(builder.recordOverride());
        assertFalse(builder.recordOverride());

        assertTrue(builder.recordNoAlias());
        assertFalse(builder.recordNoAlias());

        assertTrue(builder.recordDeprecated());
        assertFalse(builder.recordDeprecated());

        assertTrue(builder.recordExport());
        assertFalse(builder.recordExport());

        assertTrue(builder.recordNoShadow());
        assertFalse(builder.recordNoShadow());

        assertTrue(builder.recordImplicitCast());
        assertFalse(builder.recordImplicitCast());

        assertTrue(builder.recordNoSideEffects());
        assertFalse(builder.recordNoSideEffects());
    }

    @Test
    public void testConstructorAndInterfaceCompatibility() {
        assertTrue(builder.recordConstructor());
        assertFalse(builder.isInterfaceRecorded());
        assertTrue(builder.isConstructorRecorded());

        // Trying to record interface when constructor is already recorded should fail
        JSDocInfoBuilder builder2 = new JSDocInfoBuilder(false);
        assertTrue(builder2.recordInterface());
        assertTrue(builder2.isInterfaceRecorded());
        assertFalse(builder2.recordConstructor());
    }

    @Test
    public void testImplementedInterface() {
        Node dummyNode = new Node(Token.EMPTY);
        JSTypeExpression typeExpr = new JSTypeExpression(dummyNode, "source");

        assertTrue(builder.recordImplementedInterface(typeExpr));
    }
}