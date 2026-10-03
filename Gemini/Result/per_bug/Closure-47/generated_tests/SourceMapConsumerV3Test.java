package com.google.debugging.sourcemap;

import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.Before;

import java.util.Collection;

import static org.junit.Assert.*;

public class SourceMapConsumerV3Test {

    private SourceMapConsumerV3 consumer;

    @Before
    public void setUp() {
        consumer = new SourceMapConsumerV3();
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseInvalidJsonString() throws SourceMapParseException {
        consumer.parse("invalid-json");
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseWrongVersion() throws SourceMapParseException {
        String json = "{\"version\":2, \"file\":\"test.js\", \"lineCount\":1, \"mappings\":\"\", \"sources\":[], \"names\":[]}";
        consumer.parse(json);
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseEmptyFile() throws SourceMapParseException {
        String json = "{\"version\":3, \"file\":\"\", \"lineCount\":1, \"mappings\":\"\", \"sources\":[], \"names\":[]}";
        consumer.parse(json);
    }

    @Test
    public void testParseBasicValidSourceMap() throws SourceMapParseException {
        // Version 3 standard minimal map
        String json = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"out.js\",\n" +
                "  \"lineCount\": 1,\n" +
                "  \"mappings\": \"AAAA\",\n" +
                "  \"sources\": [\"in.js\"],\n" +
                "  \"names\": [\"foo\"]\n" +
                "}";
        consumer.parse(json);
        Collection<String> sources = consumer.getOriginalSources();
        assertNotNull(sources);
        assertTrue(sources.contains("in.js"));
    }

    @Test
    public void testGetMappingForLineOutOfBounds() throws SourceMapParseException {
        String json = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"out.js\",\n" +
                "  \"lineCount\": 1,\n" +
                "  \"mappings\": \"AAAA\",\n" +
                "  \"sources\": [\"in.js\"],\n" +
                "  \"names\": [\"foo\"]\n" +
                "}";
        consumer.parse(json);
        
        // Line out of bounds (Line 0 is normalized to -1, or line 5 > lines.size())
        OriginalMapping mapping = consumer.getMappingForLine(0, 1);
        assertNull(mapping);

        OriginalMapping mappingHigh = consumer.getMappingForLine(10, 1);
        assertNull(mappingHigh);
    }

    @Test
    public void testGetReverseMappingEmpty() throws SourceMapParseException {
        String json = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"out.js\",\n" +
                "  \"lineCount\": 1,\n" +
                "  \"mappings\": \"AAAA\",\n" +
                "  \"sources\": [\"in.js\"],\n" +
                "  \"names\": [\"foo\"]\n" +
                "}";
        consumer.parse(json);
        
        Collection<OriginalMapping> reverse = consumer.getReverseMapping("nonexistent.js", 1, 1);
        assertNotNull(reverse);
        assertTrue(reverse.isEmpty());
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseMetaMapInvalidVersion() throws SourceMapParseException {
        String json = "{\n" +
                "  \"version\": 2,\n" +
                "  \"file\": \"out.js\",\n" +
                "  \"sections\": []\n" +
                "}";
        consumer.parse(json);
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseMetaMapEmptyFile() throws SourceMapParseException {
        String json = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"\",\n" +
                "  \"sections\": []\n" +
                "}";
        consumer.parse(json);
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseMetaMapForbiddenFieldsPresent() throws SourceMapParseException {
        String json = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"out.js\",\n" +
                "  \"lineCount\": 1,\n" +
                "  \"sections\": []\n" +
                "}";
        consumer.parse(json);
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseMetaMapSectionBothMapAndUrl() throws SourceMapParseException {
        String json = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"out.js\",\n" +
                "  \"sections\": [\n" +
                "    {\n" +
                "      \"offset\": {\"line\": 0, \"column\": 0},\n" +
                "      \"url\": \"http://example.com/map\",\n" +
                "      \"map\": \"{}\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        consumer.parse(json);
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseMetaMapSectionNeitherMapNorUrl() throws SourceMapParseException {
        String json = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"out.js\",\n" +
                "  \"sections\": [\n" +
                "    {\n" +
                "      \"offset\": {\"line\": 0, \"column\": 0}\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        consumer.parse(json);
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseMetaMapUrlRetrievalNull() throws SourceMapParseException {
        String json = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"out.js\",\n" +
                "  \"sections\": [\n" +
                "    {\n" +
                "      \"offset\": {\"line\": 0, \"column\": 0},\n" +
                "      \"url\": \"http://example.com/missing\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        // Passing a supplier that returns null for the URL
        SourceMapSupplier supplier = new SourceMapSupplier() {
            @Override
            public String getSourceMap(String url) {
                return null;
            }
        };
        consumer.parse(json, supplier);
    }

    @Test
    public void testParseMetaMapWithUrlSuccess() throws SourceMapParseException {
        String indexMapJson = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"out.js\",\n" +
                "  \"sections\": [\n" +
                "    {\n" +
                "      \"offset\": {\"line\": 0, \"column\": 0},\n" +
                "      \"url\": \"http://example.com/submap\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        
        final String subMapJson = "{\n" +
                "  \"version\": 3,\n" +
                "  \"file\": \"sub.js\",\n" +
                "  \"lineCount\": 1,\n" +
                "  \"mappings\": \"AAAA\",\n" +
                "  \"sources\": [\"in.js\"],\n" +
                "  \"names\": [\"foo\"]\n" +
                "}";

        SourceMapSupplier supplier = new SourceMapSupplier() {
            @Override
            public String getSourceMap(String url) {
                if ("http://example.com/submap".equals(url)) {
                    return subMapJson;
                }
                return null;
            }
        };

        consumer.parse(indexMapJson, supplier);
        assertNotNull(consumer.getOriginalSources());
        assertTrue(consumer.getOriginalSources().contains("in.js"));
    }
}