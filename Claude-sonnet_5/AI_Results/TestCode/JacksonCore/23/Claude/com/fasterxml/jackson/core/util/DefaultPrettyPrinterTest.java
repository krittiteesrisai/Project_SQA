package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;

import static org.junit.Assert.*;

public class DefaultPrettyPrinterTest {

    /**
     * Indenter ช่วยทดสอบ (ไม่ได้อยู่ใน source เดิม) ใช้ตรวจสอบ branch
     * isInline() true/false และ nesting level ที่ถูกส่งเข้ามาอย่างชัดเจน
     */
    static class MarkIndenter implements DefaultPrettyPrinter.Indenter {
        private final boolean inline;
        MarkIndenter(boolean inline) { this.inline = inline; }
        @Override
        public void writeIndentation(JsonGenerator g, int level) throws IOException {
            g.writeRaw("<" + level + ">");
        }
        @Override
        public boolean isInline() { return inline; }
    }

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private JsonGenerator newGen(StringWriter sw) throws IOException {
        return factory.createGenerator(sw);
    }

    // ---------------------------------------------------------------
    // Constructors & root separator
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor_RootSeparatorIsSingleSpace() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeRootValueSeparator(g);
        g.flush();
        assertEquals(" ", sw.toString());
    }

    @Test
    public void testConstructor_NullStringSeparator_NoOutput() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter((String) null);
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeRootValueSeparator(g);
        g.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testConstructor_CustomStringSeparator() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter("|");
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeRootValueSeparator(g);
        g.flush();
        assertEquals("|", sw.toString());
    }

    @Test
    public void testConstructor_SerializableStringSeparator() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter(new SerializedString("--"));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeRootValueSeparator(g);
        g.flush();
        assertEquals("--", sw.toString());
    }

    @Test
    public void testCopyConstructor_PreservesRootSeparatorAndState() throws IOException {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter("X");
        base.indentObjectsWith(new MarkIndenter(false));

        StringWriter swBase = new StringWriter();
        JsonGenerator gBase = newGen(swBase);
        base.writeStartObject(gBase); // nesting -> 1
        gBase.flush();

        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(base);

        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        copy.writeRootValueSeparator(g);
        g.flush();
        assertEquals("X", sw.toString());

        assertEquals(base._nesting, copy._nesting);
        assertSame(base._arrayIndenter, copy._arrayIndenter);
        assertSame(base._objectIndenter, copy._objectIndenter);
    }

    @Test
    public void testCopyConstructorWithSeparatorOverride() throws IOException {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();
        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(base, new SerializedString("Y"));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        copy.writeRootValueSeparator(g);
        g.flush();
        assertEquals("Y", sw.toString());
    }

    // ---------------------------------------------------------------
    // withRootSeparator
    // ---------------------------------------------------------------

    @Test
    public void testWithRootSeparator_SameReferenceIdentity_ReturnsSameInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withRootSeparator(pp._rootSeparator);
        assertSame(pp, pp2);
    }

    @Test
    public void testWithRootSeparator_EqualValueDifferentRef_ReturnsSameInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter(); // sep " "
        DefaultPrettyPrinter pp2 = pp.withRootSeparator(new SerializedString(" "));
        assertSame(pp, pp2);
    }

    @Test
    public void testWithRootSeparator_DifferentValue_ReturnsNewInstance() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withRootSeparator(new SerializedString("Z"));
        assertNotSame(pp, pp2);
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp2.writeRootValueSeparator(g);
        g.flush();
        assertEquals("Z", sw.toString());
    }

    @Test
    public void testWithRootSeparator_NullValue_ReturnsNewInstanceWithNoSeparator() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withRootSeparator((SerializableString) null);
        assertNotSame(pp, pp2);
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp2.writeRootValueSeparator(g);
        g.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testWithRootSeparatorString_NullAndNonNull() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();

        DefaultPrettyPrinter ppNull = pp.withRootSeparator((String) null);
        StringWriter sw1 = new StringWriter();
        JsonGenerator g1 = newGen(sw1);
        ppNull.writeRootValueSeparator(g1);
        g1.flush();
        assertEquals("", sw1.toString());

        DefaultPrettyPrinter ppVal = pp.withRootSeparator("Q");
        StringWriter sw2 = new StringWriter();
        JsonGenerator g2 = newGen(sw2);
        ppVal.writeRootValueSeparator(g2);
        g2.flush();
        assertEquals("Q", sw2.toString());
    }

    // ---------------------------------------------------------------
    // indentArraysWith / indentObjectsWith
    // ---------------------------------------------------------------

    @Test
    public void testIndentArraysWith_Null_SetsNopIndenter() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(null);
        assertSame(DefaultPrettyPrinter.NopIndenter.instance, pp._arrayIndenter);
    }

    @Test
    public void testIndentArraysWith_Custom() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.Indenter custom = new MarkIndenter(true);
        pp.indentArraysWith(custom);
        assertSame(custom, pp._arrayIndenter);
    }

    @Test
    public void testIndentObjectsWith_Null_SetsNopIndenter() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(null);
        assertSame(DefaultPrettyPrinter.NopIndenter.instance, pp._objectIndenter);
    }

    @Test
    public void testIndentObjectsWith_Custom() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.Indenter custom = new MarkIndenter(false);
        pp.indentObjectsWith(custom);
        assertSame(custom, pp._objectIndenter);
    }

    // ---------------------------------------------------------------
    // withArrayIndenter / withObjectIndenter
    // ---------------------------------------------------------------

    @Test
    public void testWithArrayIndenter_SameIndenter_ReturnsThis() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withArrayIndenter(DefaultPrettyPrinter.FixedSpaceIndenter.instance);
        assertSame(pp, pp2);
    }

    @Test
    public void testWithArrayIndenter_NullBecomesNop_NewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withArrayIndenter(null);
        assertNotSame(pp, pp2);
        assertSame(DefaultPrettyPrinter.NopIndenter.instance, pp2._arrayIndenter);
        assertSame(DefaultPrettyPrinter.FixedSpaceIndenter.instance, pp._arrayIndenter);
    }

    @Test
    public void testWithArrayIndenter_DifferentIndenter_NewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.Indenter custom = new MarkIndenter(false);
        DefaultPrettyPrinter pp2 = pp.withArrayIndenter(custom);
        assertNotSame(pp, pp2);
        assertSame(custom, pp2._arrayIndenter);
    }

    @Test
    public void testWithObjectIndenter_SameIndenter_ReturnsThis() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withObjectIndenter(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        assertSame(pp, pp2);
    }

    @Test
    public void testWithObjectIndenter_NullBecomesNop_NewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withObjectIndenter(null);
        assertNotSame(pp, pp2);
        assertSame(DefaultPrettyPrinter.NopIndenter.instance, pp2._objectIndenter);
    }

    @Test
    public void testWithObjectIndenter_DifferentIndenter_NewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.Indenter custom = new MarkIndenter(true);
        DefaultPrettyPrinter pp2 = pp.withObjectIndenter(custom);
        assertNotSame(pp, pp2);
        assertSame(custom, pp2._objectIndenter);
    }

    // ---------------------------------------------------------------
    // withSpacesInObjectEntries / withoutSpacesInObjectEntries
    // ---------------------------------------------------------------

    @Test
    public void testWithSpacesInObjectEntries_AlreadyTrue_ReturnsThis() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter(); // default true
        DefaultPrettyPrinter pp2 = pp.withSpacesInObjectEntries();
        assertSame(pp, pp2);
    }

    @Test
    public void testWithoutSpacesInObjectEntries_ChangesState_NewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withoutSpacesInObjectEntries();
        assertNotSame(pp, pp2);
        assertFalse(pp2._spacesInObjectEntries);
        assertTrue(pp._spacesInObjectEntries);
    }

    @Test
    public void testWithoutSpacesInObjectEntries_AlreadyFalse_ReturnsThis() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter().withoutSpacesInObjectEntries();
        DefaultPrettyPrinter pp2 = pp.withoutSpacesInObjectEntries();
        assertSame(pp, pp2);
    }

    @Test
    public void testWithSpacesInObjectEntries_FromFalse_NewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter().withoutSpacesInObjectEntries();
        DefaultPrettyPrinter pp2 = pp.withSpacesInObjectEntries();
        assertNotSame(pp, pp2);
        assertTrue(pp2._spacesInObjectEntries);
    }

    // ---------------------------------------------------------------
    // withSeparators
    // ---------------------------------------------------------------

    @Test
    public void testWithSeparators_MutatesAndReturnsThis() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        Separators seps = new Separators(':', ',', ';');
        DefaultPrettyPrinter pp2 = pp.withSeparators(seps);
        assertSame(pp, pp2);
        assertSame(seps, pp._separators);
        assertEquals(" : ", pp._objectFieldValueSeparatorWithSpaces);
    }

    // ---------------------------------------------------------------
    // createInstance
    // ---------------------------------------------------------------

    @Test
    public void testCreateInstance_ReturnsNewInstanceWithSameConfig() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter("R");
        DefaultPrettyPrinter created = pp.createInstance();
        assertNotSame(pp, created);
        assertEquals(DefaultPrettyPrinter.class, created.getClass());

        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        created.writeRootValueSeparator(g);
        g.flush();
        assertEquals("R", sw.toString());
    }

    // ---------------------------------------------------------------
    // writeStartObject / writeEndObject
    // ---------------------------------------------------------------

    @Test
    public void testWriteStartObject_NonInlineIndenter_IncrementsNesting() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartObject(g);
        g.flush();
        assertEquals("{", sw.toString());
        assertEquals(1, pp._nesting);
    }

    @Test
    public void testWriteStartObject_InlineIndenter_DoesNotIncrementNesting() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(new MarkIndenter(true));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartObject(g);
        g.flush();
        assertEquals("{", sw.toString());
        assertEquals(0, pp._nesting);
    }

    @Test
    public void testWriteEndObject_ZeroEntries_WritesSpaceThenBrace() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartObject(g);      // nesting -> 1
        pp.writeEndObject(g, 0);     // nesting -> 0, nrOfEntries==0 branch
        g.flush();
        assertEquals("{ }", sw.toString());
        assertEquals(0, pp._nesting);
    }

    @Test
    public void testWriteEndObject_NonZeroEntries_WritesIndentationThenBrace() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartObject(g);      // nesting -> 1
        pp.writeEndObject(g, 3);     // nesting -> 0, nrOfEntries>0 branch
        g.flush();
        assertEquals("{" + "<0>" + "}", sw.toString());
    }

    @Test
    public void testWriteEndObject_InlineIndenter_NestingUnaffected() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(new MarkIndenter(true));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartObject(g);
        pp.writeEndObject(g, 2);
        g.flush();
        assertEquals("{" + "<0>" + "}", sw.toString());
        assertEquals(0, pp._nesting);
    }

    // ---------------------------------------------------------------
    // beforeObjectEntries / writeObjectFieldValueSeparator / writeObjectEntrySeparator
    // ---------------------------------------------------------------

    @Test
    public void testBeforeObjectEntries_CallsIndenterWithCurrentNesting() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartObject(g); // nesting -> 1
        pp.beforeObjectEntries(g);
        g.flush();
        assertEquals("{" + "<1>", sw.toString());
    }

    @Test
    public void testWriteObjectFieldValueSeparator_SpacesEnabled_DefaultLength3() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeObjectFieldValueSeparator(g);
        g.flush();
        String out = sw.toString();
        assertEquals(3, out.length());
        assertTrue(out.startsWith(" "));
        assertTrue(out.endsWith(" "));
    }

    @Test
    public void testWriteObjectFieldValueSeparator_SpacesDisabled_DefaultLength1() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter().withoutSpacesInObjectEntries();
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeObjectFieldValueSeparator(g);
        g.flush();
        assertEquals(1, sw.toString().length());
    }

    @Test
    public void testWriteObjectFieldValueSeparator_CustomSeparators_SpacesEnabled() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.withSeparators(new Separators(':', ',', ';'));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeObjectFieldValueSeparator(g);
        g.flush();
        assertEquals(" : ", sw.toString());
    }

    @Test
    public void testWriteObjectFieldValueSeparator_CustomSeparators_SpacesDisabled() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter().withoutSpacesInObjectEntries();
        pp.withSeparators(new Separators(':', ',', ';'));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeObjectFieldValueSeparator(g);
        g.flush();
        assertEquals(":", sw.toString());
    }

    @Test
    public void testWriteObjectEntrySeparator_WritesSeparatorThenIndentation() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.withSeparators(new Separators(':', ',', ';'));
        pp.indentObjectsWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartObject(g); // nesting -> 1
        pp.writeObjectEntrySeparator(g);
        g.flush();
        assertEquals("{" + "," + "<1>", sw.toString());
    }

    // ---------------------------------------------------------------
    // writeStartArray / writeEndArray
    // ---------------------------------------------------------------

    @Test
    public void testWriteStartArray_NonInlineIndenter_IncrementsNesting() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartArray(g);
        g.flush();
        assertEquals("[", sw.toString());
        assertEquals(1, pp._nesting);
    }

    @Test
    public void testWriteStartArray_InlineIndenter_DoesNotIncrementNesting() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter(); // default FixedSpaceIndenter -> inline
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartArray(g);
        g.flush();
        assertEquals("[", sw.toString());
        assertEquals(0, pp._nesting);
    }

    @Test
    public void testWriteEndArray_ZeroValues_WritesSpaceThenBracket() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartArray(g); // nesting -> 1
        pp.writeEndArray(g, 0);
        g.flush();
        assertEquals("[ ]", sw.toString());
        assertEquals(0, pp._nesting);
    }

    @Test
    public void testWriteEndArray_NonZeroValues_WritesIndentationThenBracket() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartArray(g); // nesting -> 1
        pp.writeEndArray(g, 4);
        g.flush();
        assertEquals("[" + "<0>" + "]", sw.toString());
    }

    @Test
    public void testWriteEndArray_DefaultFixedSpaceIndenter_ZeroValues() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartArray(g);
        pp.writeEndArray(g, 0);
        g.flush();
        assertEquals("[ ]", sw.toString());
        assertEquals(0, pp._nesting);
    }

    @Test
    public void testWriteEndArray_DefaultFixedSpaceIndenter_NonZeroValues() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartArray(g);
        pp.writeEndArray(g, 2); // nrOfValues>0 -> FixedSpaceIndenter.writeIndentation -> ' '
        g.flush();
        assertEquals("[ ]", sw.toString());
    }

    // ---------------------------------------------------------------
    // beforeArrayValues / writeArrayValueSeparator
    // ---------------------------------------------------------------

    @Test
    public void testBeforeArrayValues_CallsIndenter() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartArray(g); // nesting -> 1
        pp.beforeArrayValues(g);
        g.flush();
        assertEquals("[" + "<1>", sw.toString());
    }

    @Test
    public void testWriteArrayValueSeparator_WritesSeparatorThenIndentation() throws IOException {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.withSeparators(new Separators(':', ',', ';'));
        pp.indentArraysWith(new MarkIndenter(false));
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        pp.writeStartArray(g); // nesting -> 1
        pp.writeArrayValueSeparator(g);
        g.flush();
        assertEquals("[" + ";" + "<1>", sw.toString());
    }

    // ---------------------------------------------------------------
    // Helper classes: NopIndenter / FixedSpaceIndenter
    // ---------------------------------------------------------------

    @Test
    public void testNopIndenter_IsInlineTrue_AndWritesNothing() throws IOException {
        DefaultPrettyPrinter.NopIndenter nop = DefaultPrettyPrinter.NopIndenter.instance;
        assertTrue(nop.isInline());
        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        nop.writeIndentation(g, 3);
        g.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testFixedSpaceIndenter_IsInlineTrue_AndWritesSingleSpace() throws IOException {
        DefaultPrettyPrinter.FixedSpaceIndenter fs = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        assertTrue(fs.isInline());

        StringWriter sw = new StringWriter();
        JsonGenerator g = newGen(sw);
        fs.writeIndentation(g, 0);
        g.flush();
        assertEquals(" ", sw.toString());

        StringWriter sw2 = new StringWriter();
        JsonGenerator g2 = newGen(sw2);
        fs.writeIndentation(g2, 10); // level ไม่ควรมีผลต่อผลลัพธ์
        g2.flush();
        assertEquals(" ", sw2.toString());
    }
}
