package com.fasterxml.jackson.dataformat.xml.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class ToXmlGeneratorTest {

    private ByteArrayOutputStream out;
    private ToXmlGenerator generator;
    private IOContext ioContext;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter sw = xmlOutputFactory.createXMLStreamWriter(out, "UTF-8");
        
        BufferRecycler recycler = new BufferRecycler();
        ioContext = new IOContext(recycler, sw, false);
        
        int stdFeatures = JsonGenerator.Feature.collectDefaults();
        int xmlFeatures = ToXmlGenerator.Feature.collectDefaults();
        
        ObjectMapper mapper = new ObjectMapper(new XmlFactory());
        generator = new ToXmlGenerator(ioContext, stdFeatures, xmlFeatures, mapper, sw);
    }

    @After
    public void tearDown() throws Exception {
        if (generator != null) {
            try {
                generator.close();
            } catch (Exception e) {
                // Ignore
            }
        }
    }

    @Test
    public void testInitGeneratorXml11() throws IOException {
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_1_1);
        generator.initGenerator();
        generator.initGenerator(); // Test already initialized branch
        assertTrue(out.toString("UTF-8").contains("version=\"1.1\""));
    }

    @Test
    public void testInitGeneratorDeclaration() throws IOException {
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        generator.setPrettyPrinter(new DefaultXmlPrettyPrinter());
        generator.initGenerator();
        assertTrue(out.toString("UTF-8").contains("version=\"1.0\""));
    }

    @Test
    public void testInitGeneratorNone() throws IOException {
        generator.disable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        generator.disable(ToXmlGenerator.Feature.WRITE_XML_1_1);
        generator.initGenerator();
        assertEquals("", out.toString("UTF-8").trim());
    }

    @Test
    public void testSetNextNameIfMissing() {
        QName name1 = new QName("local1");
        QName name2 = new QName("local2");
        
        assertTrue(generator.setNextNameIfMissing(name1));
        assertFalse(generator.setNextNameIfMissing(name2));
    }

    @Test
    public void testWrappedValueLifecycle() throws IOException {
        QName wrapper = new QName("wrapper");
        QName wrapped = new QName("wrapped");
        
        generator.startWrappedValue(wrapper, wrapped);
        generator.finishWrappedValue(wrapper, wrapped);
    }

    @Test
    public void testObjectAndArrayContexts() throws IOException {
        generator.writeStartObject();
        generator.setNextName(new QName("itemArray"));
        generator.writeStartArray();
        generator.writeEndArray();
        generator.writeEndObject();
    }

    @Test(expected = IOException.class)
    public void testInvalidEndArray() throws IOException {
        generator.writeEndArray();
    }

    @Test(expected = IOException.class)
    public void testInvalidEndObject() throws IOException {
        generator.writeEndObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteMissingNameString() throws IOException {
        generator.writeString("test");
    }

    @Test
    public void testAttributeAndUnwrappedString() throws IOException {
        generator.setNextName(new QName("attr"));
        generator.setNextIsAttribute(true);
        generator.writeString("val");

        generator.setNextName(new QName("elem"));
        generator.setNextIsUnwrapped(true);
        generator.setNextIsCData(true);
        generator.writeString("cdataVal");
    }

    @Test
    public void testStringCharArrayVariants() throws IOException {
        generator.setNextName(new QName("elem"));
        char[] chars = "hello world".toCharArray();
        generator.writeString(chars, 0, 5);

        generator.setNextName(new QName("attr2"));
        generator.setNextIsAttribute(true);
        generator.writeString(chars, 6, 5);
        
        generator.setNextName(new QName("elemUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.setNextIsCData(true);
        generator.writeString(chars, 0, 5);
    }

    @Test
    public void testRawValues() throws IOException {
        generator.setNextName(new QName("rawElem"));
        generator.writeRawValue("123");

        generator.setNextName(new QName("rawElem2"));
        generator.writeRawValue("abcde", 1, 3);

        generator.setNextName(new QName("rawElem3"));
        generator.writeRawValue("charArray".toCharArray(), 0, 4);

        generator.setNextName(new QName("rawAttr"));
        generator.setNextIsAttribute(true);
        generator.writeRawValue("attrVal");

        generator.writeRaw("rawText");
        generator.writeRaw("rawTextOffset", 0, 3);
        generator.writeRaw("rawChars".toCharArray(), 0, 3);
        generator.writeRaw('X');
    }

    @Test
    public void testWriteBinary() throws IOException {
        generator.writeBinary(null, null, 0, 0); // null check

        byte[] data = new byte[]{1, 2, 3, 4, 5};
        generator.setNextName(new QName("binaryAttr"));
        generator.setNextIsAttribute(true);
        generator.writeBinary(null, data, 1, 3);

        generator.setNextName(new QName("binaryUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.writeBinary(null, data, 0, 5);

        generator.setNextName(new QName("binaryElem"));
        generator.writeBinary(null, data, 0, 5);
    }

    @Test
    public void testPrimitivesWriting() throws IOException {
        // Boolean
        generator.setNextName(new QName("bAttr"));
        generator.setNextIsAttribute(true);
        generator.writeBoolean(true);

        generator.setNextName(new QName("bUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.writeBoolean(false);

        generator.setNextName(new QName("bElem"));
        generator.writeBoolean(true);

        // Null
        generator.setNextName(new QName("nAttr"));
        generator.setNextIsAttribute(true);
        generator.writeNull();

        generator.setNextName(new QName("nUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.writeNull();

        generator.setNextName(new QName("nElem"));
        generator.writeNull();

        // Numbers (Int)
        generator.setNextName(new QName("iAttr"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(10);

        generator.setNextName(new QName("iUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(20);

        generator.setNextName(new QName("iElem"));
        generator.writeNumber(30);

        // Numbers (Long)
        generator.setNextName(new QName("lAttr"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(100L);

        generator.setNextName(new QName("lUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(200L);

        generator.setNextName(new QName("lElem"));
        generator.writeNumber(300L);

        // Numbers (Double)
        generator.setNextName(new QName("dAttr"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(1.1d);

        generator.setNextName(new QName("dUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(2.2d);

        generator.setNextName(new QName("dElem"));
        generator.writeNumber(3.3d);

        // Numbers (Float)
        generator.setNextName(new QName("fAttr"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(1.1f);

        generator.setNextName(new QName("fUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(2.2f);

        generator.setNextName(new QName("fElem"));
        generator.writeNumber(3.3f);
    }

    @Test
    public void testWriteBigDecimalAndBigInteger() throws IOException {
        generator.writeNumber((BigDecimal) null);
        generator.writeNumber((BigInteger) null);

        generator.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        generator.setNextName(new QName("decPlainAttr"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(new BigDecimal("123.456"));

        generator.setNextName(new QName("decPlainUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(new BigDecimal("789.012"));

        generator.disable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        generator.setNextName(new QName("decAttr"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(new BigDecimal("1.1"));

        generator.setNextName(new QName("decElem"));
        generator.writeNumber(new BigDecimal("2.2"));

        // BigInteger
        generator.setNextName(new QName("bigIntAttr"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(BigInteger.TEN);

        generator.setNextName(new QName("bigIntUnwrapped"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(BigInteger.ONE);

        generator.setNextName(new QName("bigIntElem"));
        generator.writeNumber(BigInteger.ZERO);
        
        generator.writeNumber("500");
    }

    @Test
    public void testFlushAndCloseFeatures() throws IOException {
        generator.enable(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM);
        generator.enable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        generator.writeStartArray(); // Leave open to trigger auto-close
        generator.flush();
        generator.close();
    }
    
    @Test
    public void testGettersAndSetters() {
        assertNotNull(generator.getOutputTarget());
        assertEquals(-1, generator.getOutputBuffered());
        assertNotNull(generator.getFormatFeatures());
        assertNotNull(generator.getStaxWriter());
        assertTrue(generator.canWriteFormattedNumbers());
        
        generator.overrideFormatFeatures(1, 1);
        generator.setPrettyPrinter(new DefaultXmlPrettyPrinter());
        generator.setNextIsCData(false);
        generator.writeFieldName(com.fasterxml.jackson.core.io.SerializedString.class.cast(null)); //ผ่านทาง interface หากรองรับ หรือเทสวิธัอื่น
    }
}