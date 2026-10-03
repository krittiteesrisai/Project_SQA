package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.List;

public class OptionTest extends TestCase {

    public OptionTest(String name) {
        super(name);
    }

    public void testConstructorAndGetters() {
        Option option = new Option("a", "alpha", true, "Description");
        assertEquals("a", option.getOpt());
        assertEquals("alpha", option.getLongOpt());
        assertEquals("Description", option.getDescription());
        assertTrue(option.hasArg());
        assertTrue(option.hasLongOpt());
        assertEquals('a', option.getId());
        assertEquals("[ option: a alpha [ARG] :: Description ]", option.toString());
    }

    public void testConstructorWithNullOpt() {
        Option option = new Option(null, "longOnly", false, "Desc");
        assertNull(option.getOpt());
        assertEquals("longOnly", option.getLongOpt());
        assertEquals("longOnly", option.getKey());
    }

    public void testInvalidOptionCharacter() {
        try {
            new Option(" ", "Description");
            fail("Expected IllegalArgumentException for invalid option character");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    public void testIdWithLongOptOnly() {
        Option option = new Option(null, "longopt", true, "desc");
        assertEquals('l', option.getId());
    }

    public void testSettersAndBasicProperties() {
        Option option = new Option("b", "beta", false, "Desc");
        
        option.setRequired(true);
        assertTrue(option.isRequired());

        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());

        option.setArgName("argName");
        assertTrue(option.hasArgName());
        assertEquals("argName", option.getArgName());

        option.setType(String.class);
        assertEquals(String.class, option.getType());
        
        assertTrue(option.toString().contains("java.lang.String"));
    }

    public void testHasArgAndHasArgsVariants() {
        Option option = new Option("c", "char", false, "desc");
        assertFalse(option.hasArg());
        assertFalse(option.hasArgs());

        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArg());
        assertTrue(option.hasArgs());
        assertTrue(option.toString().contains("[ARG...]"));

        option.setArgs(2);
        assertTrue(option.hasArg());
        assertTrue(option.hasArgs());

        option.setArgs(1);
        assertTrue(option.hasArg());
        assertFalse(option.hasArgs());
    }

    public void testAddValueForProcessingUninitialized() {
        Option option = new Option("d", "desc");
        // numberOfArgs is UNINITIALIZED (-1) by default for basic constructor without hasArg
        try {
            option.addValueForProcessing("val");
            fail("Expected RuntimeException due to uninitialized args");
        } catch (RuntimeException e) {
            assertEquals("NO_ARGS_ALLOWED", e.getMessage());
        }
    }

    public void testValueProcessingWithSeparator() {
        Option option = new Option("e", true, "desc");
        option.setArgs(3);
        option.setValueSeparator('=');
        assertTrue(option.hasValueSeparator());
        assertEquals('=', option.getValueSeparator());

        option.addValueForProcessing("v1=v2=v3=v4");
        
        String[] values = option.getValues();
        assertNotNull(values);
        assertEquals(3, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
        assertEquals("v3=v4", values[2]);
    }

    public void testValueProcessingListLimitExceeded() {
        Option option = new Option("f", true, "desc");
        option.setArgs(1);
        
        try {
            option.addValueForProcessing("val1");
            option.addValueForProcessing("val2");
            fail("Expected RuntimeException when list is full");
        } catch (RuntimeException e) {
            assertEquals("Cannot add value, list full.", e.getMessage());
        }
    }

    public void testGetValuesAndGetValuesListEdgeCases() {
        Option option = new Option("g", true, "desc");
        assertNull(option.getValue());
        assertNull(option.getValue(0));
        assertNull(option.getValues());
        
        option.addValueForProcessing("valA");
        assertEquals("valA", option.getValue());
        assertEquals("valA", option.getValue(0));
        assertEquals("valA", option.getValue("defaultVal"));
        
        List list = option.getValuesList();
        assertNotNull(list);
        assertEquals(1, list.size());

        option.clearValues();
        assertNull(option.getValue());
        assertNull(option.getValues());
    }

    public void testGetValueWithDefaultWhenEmpty() {
        Option option = new Option("h", true, "desc");
        assertEquals("fallback", option.getValue("fallback"));
    }

    public void testRequiresArgBranches() {
        Option option = new Option("i", true, "desc");
        assertTrue(option.requiresArg());

        option.setOptionalArg(true);
        assertFalse(option.requiresArg());

        option.setOptionalArg(false);
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.requiresArg());

        option.addValueForProcessing("val1");
        assertFalse(option.requiresArg());
    }

    public void testEqualsAndHashCode() {
        Option o1 = new Option("a", "alpha", true, "desc");
        Option o2 = new Option("a", "alpha", true, "desc");
        Option o3 = new Option("b", "beta", true, "desc");
        Option o4 = new Option(null, "alpha", true, "desc");

        assertEquals(o1, o1);
        assertEquals(o1, o2);
        assertEquals(o1.hashCode(), o2.hashCode());

        assertFalse(o1.equals(null));
        assertFalse(o1.equals("some string"));
        assertFalse(o1.equals(o3));
        assertFalse(o1.equals(o4));

        Option o5 = new Option(null, null, true, "desc");
        Option o6 = new Option(null, null, true, "desc");
        assertEquals(o5, o6);
        assertEquals(o5.hashCode(), o6.hashCode());
    }

    public void testCloneOperation() {
        Option option = new Option("j", "gamma", true, "desc");
        option.addValueForProcessing("val1");

        Option cloned = (Option) option.clone();
        assertEquals(option.getOpt(), cloned.getOpt());
        assertEquals(option.getLongOpt(), cloned.getLongOpt());
        assertEquals(1, cloned.getValues().length);
        assertEquals("val1", cloned.getValue());
    }

    public void testUnsupportedAddValue() {
        Option option = new Option("k", "desc");
        try {
            option.addValue("test");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }
}