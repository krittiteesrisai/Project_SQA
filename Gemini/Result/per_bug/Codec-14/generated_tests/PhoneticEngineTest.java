package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.Test;

public class PhoneticEngineTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowsExceptionWhenRuleTypeIsRules() {
        // Trigger: ruleType == RuleType.RULES
        new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true);
    }

    @Test
    public void testConstructorValid() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 10);
        assertEquals(NameType.GENERIC, engine.getNameType());
        assertEquals(RuleType.EXACT, engine.getRuleType());
        assertTrue(!engine.isConcat());
        assertEquals(10, engine.getMaxPhonemes());
        assertNotNull(engine.getLang());
    }

    @Test(expected = NullPointerException.class)
    public void testApplyFinalRulesThrowsNullPointerException() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        
        // Use reflection to test private applyFinalRules method with null finalRules
        Method method = PhoneticEngine.class.getDeclaredMethod("applyFinalRules", 
                PhoneticEngine.PhonemeBuilder.class, Map.class);
        method.setAccessible(true);
        
        LanguageSet langSet = LanguageSet.from(Collections.singleton("en"));
        PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langSet);
        
        try {
            method.invoke(engine, builder, null);
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (e.getCause() instanceof NullPointerException) {
                throw (NullPointerException) e.getCause();
            }
            throw e;
        }
    }

    @Test
    public void testApplyFinalRulesEmptyMap() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        
        Method method = PhoneticEngine.class.getDeclaredMethod("applyFinalRules", 
                PhoneticEngine.PhonemeBuilder.class, Map.class);
        method.setAccessible(true);
        
        LanguageSet langSet = LanguageSet.from(Collections.singleton("en"));
        PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langSet);
        builder.append("test");
        
        Map<String, List<Rule>> emptyRules = Collections.emptyMap();
        Object result = method.invoke(engine, builder, emptyRules);
        
        assertNotNull(result);
    }

    @Test
    public void testEncodeGenericNameWithApostrophe() {
        // Trigger: GENERIC NameType with d' prefix (e.g., d'artagnan)
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        String result = engine.encode("d'artagnan");
        assertNotNull(result);
        assertTrue(result.contains("-"));
    }

    @Test
    public void testEncodeGenericNameWithPrefix() {
        // Trigger: GENERIC NameType with prefix like "de "
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        String result = engine.encode("de la raphael");
        assertNotNull(result);
        assertTrue(result.contains("-"));
    }

    @Test
    public void testEncodeSephardicNameType() {
        // Trigger: SEPHARDIC switch case branch (removes prefixes & splits by apostrophe)
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.EXACT, false);
        String result = engine.encode("al-da'silva");
        assertNotNull(result);
    }

    @Test
    public void testEncodeAshkenaziNameType() {
        // Trigger: ASHKENAZI switch case branch (removes prefixes)
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, true);
        String result = engine.encode("ben-smith");
        assertNotNull(result);
    }

    @Test
    public void testEncodeMultiWordWithoutConcat() {
        // Trigger: words2.size() > 1 and concat == false (encodes each word separately with hyphens)
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        String result = engine.encode("john smith");
        assertNotNull(result);
        assertTrue(result.contains("-"));
    }

    @Test
    public void testEncodeSingleWordWithoutConcat() {
        // Trigger: words2.size() == 1 and concat == false
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        String result = engine.encode("smith");
        assertNotNull(result);
    }
}