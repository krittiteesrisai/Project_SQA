package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.util.RootNameLookup;

public class SerializationConfigTest {

    private SerializationConfig createDefaultConfig() {
        BaseSettings base = MapperConfig.getBaseSettings();
        SubtypeResolver str = new SubtypeResolver();
        SimpleMixInResolver mixins = new SimpleMixInResolver(null);
        RootNameLookup rootNames = new RootNameLookup();
        return new SerializationConfig(base, str, mixins, rootNames);
    }

    @Test
    public void testDateFormatHandling() {
        SerializationConfig config = createDefaultConfig();
        
        // Branch: df != null -> disables WRITE_DATES_AS_TIMESTAMPS
        SerializationConfig configWithDate = config.with(new SimpleDateFormat("yyyy-MM-dd"));
        assertFalse(configWithDate.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));

        // Branch: df == null -> enables WRITE_DATES_AS_TIMESTAMPS
        SerializationConfig configWithoutDate = configWithDate.with((java.text.DateFormat) null);
        assertTrue(configWithoutDate.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));
    }

    @Test
    public void testWithRootNameEdgeCases() {
        SerializationConfig config = createDefaultConfig();
        PropertyName name = new PropertyName("testRoot");
        SerializationConfig configWithName = config.withRootName(name);

        // Branch: rootName == null && _rootName == null -> returns 'this'
        assertSame(config, config.withRootName(null));

        // Branch: rootName.equals(_rootName) -> returns 'this'
        assertSame(configWithName, configWithName.withRootName(name));

        // Branch: rootName == null && _rootName != null -> creates new config
        assertNotSame(configWithName, configWithName.withRootName(null));

        // Branch: normal new root name
        assertNotSame(config, configWithName);
    }

    @Test
    public void testFeatureFluentMethodsOptimization() {
        SerializationConfig config = createDefaultConfig();
        
        // Test MapperFeature optimization (same flags return 'this')
        SerializationConfig sameConfig = config.with(MapperFeature.USE_ANNOTATIONS);
        assertSame(config, sameConfig);

        // Test SerializationFeature optimization
        SerializationConfig sameSer = config.without(SerializationFeature.INDENT_OUTPUT);
        assertSame(config, sameSer);
        
        // Test changing feature
        SerializationConfig diffSer = config.with(SerializationFeature.INDENT_OUTPUT);
        assertNotSame(config, diffSer);
        assertTrue(diffSer.isEnabled(SerializationFeature.INDENT_OUTPUT));
        
        // Test multiple features
        SerializationConfig multiSer = config.with(SerializationFeature.INDENT_OUTPUT, SerializationFeature.CLOSE_CLOSEABLE);
        assertTrue(multiSer.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertTrue(multiSer.isEnabled(SerializationFeature.CLOSE_CLOSEABLE));

        SerializationConfig withoutMulti = multiSer.without(SerializationFeature.INDENT_OUTPUT, SerializationFeature.CLOSE_CLOSEABLE);
        assertFalse(withoutMulti.isEnabled(SerializationFeature.INDENT_OUTPUT));

        SerializationConfig featuresOpt = config.withFeatures(SerializationFeature.INDENT_OUTPUT);
        assertNotSame(config, featuresOpt);
        
        SerializationConfig withoutFeaturesOpt = featuresOpt.withoutFeatures(SerializationFeature.INDENT_OUTPUT);
        assertNotSame(featuresOpt, withoutFeaturesOpt);
    }

    @Test
    public void testJsonGeneratorFeatureManagement() {
        SerializationConfig config = createDefaultConfig();
        JsonGenerator.Feature feat = JsonGenerator.Feature.AUTO_CLOSE_TARGET;

        // Enable feature
        SerializationConfig withGen = config.with(feat);
        assertNotSame(config, withGen);
        assertTrue(withGen.isEnabled(feat, new JsonFactory()));

        // Enable features array
        SerializationConfig withGenFeatures = config.withFeatures(feat);
        assertNotSame(config, withGenFeatures);

        // Disable feature
        SerializationConfig withoutGen = config.without(feat);
        assertNotSame(config, withoutGen);
        assertFalse(withoutGen.isEnabled(feat, new JsonFactory()));

        SerializationConfig withoutGenFeatures = withoutGen.withoutFeatures(feat);
        assertNotSame(withoutGen, withoutGenFeatures);
    }

    @Test
    public void testFormatFeatureManagement() {
        // Create a dummy FormatFeature since standard ones might not be directly instantiable without specific modules
        com.fasterxml.jackson.core.FormatFeature dummyFormatFeat = new com.fasterxml.jackson.core.FormatFeature() {
            @Override public boolean enabledIn(int flags) { return (flags & getMask()) != 0; }
            @Override public int getMask() { return 1; }
        };

        SerializationConfig config = createDefaultConfig();
        
        SerializationConfig withF = config.with(dummyFormatFeat);
        assertNotSame(config, withF);

        SerializationConfig withFeaturesF = config.withFeatures(dummyFormatFeat);
        assertNotSame(config, withFeaturesF);

        SerializationConfig withoutF = config.without(dummyFormatFeat);
        assertNotSame(config, withoutF);

        SerializationConfig withoutFeaturesF = config.withoutFeatures(dummyFormatFeat);
        assertNotSame(config, withoutFeaturesF);
    }

    @Test
    public void testOtherConfigMethods() {
        SerializationConfig config = createDefaultConfig();

        // FilterProvider
        FilterProvider fp = org.mockito.Mockito.mock(FilterProvider.class);
        SerializationConfig configWithFp = config.withFilters(fp);
        assertEquals(fp, configWithFp.getFilterProvider());
        assertSame(configWithFp, configWithFp.withFilters(fp)); // optimization check

        // Inclusion
        SerializationConfig configInc = config.withPropertyInclusion(JsonInclude.Value.empty());
        assertSame(config, configInc); // same value optimization

        SerializationConfig configIncNew = config.withPropertyInclusion(JsonInclude.Value.forInclude(JsonInclude.Include.NON_NULL));
        assertNotSame(config, configIncNew);

        // Deprecated inclusion
        assertNotNull(config.getSerializationInclusion());

        // PrettyPrinter
        PrettyPrinter pp = org.mockito.Mockito.mock(PrettyPrinter.class);
        SerializationConfig configPp = config.withDefaultPrettyPrinter(pp);
        assertSame(configPp, configPp.withDefaultPrettyPrinter(pp));
        assertNotSame(config, configPp);

        // View
        Class<?> view = Object.class;
        SerializationConfig configView = config.withView(view);
        assertSame(configView, configView.withView(view));
        assertNotSame(config, configView);
    }

    @Test
    public void testConstructDefaultPrettyPrinterInstantiatable() {
        // Test PrettyPrinter that implements Instantiatable
        class InstantiatablePrettyPrinter extends com.fasterxml.jackson.core.util.DefaultPrettyPrinter implements Instantiatable<PrettyPrinter> {
            @Override
            public PrettyPrinter createInstance() {
                return new InstantiatablePrettyPrinter();
            }
        }

        SerializationConfig config = createDefaultConfig().withDefaultPrettyPrinter(new InstantiatablePrettyPrinter());
        PrettyPrinter constructed = config.constructDefaultPrettyPrinter();
        assertNotNull(constructed);
    }

    @Test
    public void testInitializeJsonGenerator() {
        JsonFactory factory = new JsonFactory();
        
        // Setup config with INDENT_OUTPUT and WRITE_BIGDECIMAL_AS_PLAIN
        SerializationConfig config = createDefaultConfig()
                .with(SerializationFeature.INDENT_OUTPUT)
                .with(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN);

        // Test generation initialization using a real generator to trigger branches securely
        try (java.io.StringWriter sw = new java.io.StringWriter();
             JsonGenerator g = factory.createGenerator(sw)) {
            
            // Ensure pretty printer is null initially to test the branch inside initialize
            g.setPrettyPrinter(null);
            
            config.initialize(g);
            assertNotNull(g.getPrettyPrinter());
        } catch (Exception e) {
            fail("Initialization threw exception: " + e.getMessage());
        }
    }

    @Test
    public void testGettersAndIntrospections() {
        SerializationConfig config = createDefaultConfig();
        
        // USE_ANNOTATIONS disabled branch
        SerializationConfig noAnnConfig = config.without(MapperFeature.USE_ANNOTATIONS);
        assertNotNull(noAnnConfig.getAnnotationIntrospector());

        // Default visibility checker overrides
        SerializationConfig hiddenConfig = config
                .without(MapperFeature.AUTO_DETECT_GETTERS)
                .without(MapperFeature.AUTO_DETECT_IS_GETTERS)
                .without(MapperFeature.AUTO_DETECT_FIELDS);
        assertNotNull(hiddenConfig.getDefaultVisibilityChecker());

        // Root wrapping
        assertFalse(config.useRootWrapping());
        SerializationConfig wrappedConfig = config.withRootName(new PropertyName("root"));
        assertTrue(wrappedConfig.useRootWrapping());

        // toString
        assertNotNull(config.toString());
    }
}