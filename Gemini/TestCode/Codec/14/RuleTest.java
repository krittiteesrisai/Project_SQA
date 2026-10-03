package org.apache.commons.codec.language.bm;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RuleTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPatternAndContextMatchesNegativeIndex() {
        Rule rule = new Rule("abc", "", "", new Rule.Phoneme("test", Languages.ANY_LANGUAGE));
        rule.patternAndContextMatches("abcdef", -1);
    }

    @Test
    public void testPatternAndContextMatchesExceedsLength() {
        Rule rule = new Rule("abcdef", "", "", new Rule.Phoneme("test", Languages.ANY_LANGUAGE));
        boolean result = rule.patternAndContextMatches("abc", 0);
        assertFalse(result);
    }

    @Test
    public void testPatternAndContextMatchesPatternMismatch() {
        Rule rule = new Rule("xyz", "", "", new Rule.Phoneme("test", Languages.ANY_LANGUAGE));
        boolean result = rule.patternAndContextMatches("abcdef", 0);
        assertFalse(result);
    }

    @Test
    public void testPatternAndContextMatchesSuccess() {
        // ใช้ RPattern ALL_STRINGS_RMATCHER สำหรับ context ว่าง เพื่อให้ผ่านง่ายที่สุด
        Rule rule = new Rule("def", "", "", new Rule.Phoneme("test", Languages.ANY_LANGUAGE));
        boolean result = rule.patternAndContextMatches("abcdef", 3);
        assertTrue(result);
    }

    @Test
    public void testPatternAndContextMatchesWithContexts() {
        // ทดสอบ Left และ Right Context ที่ซับซ้อนขึ้น
        Rule rule = new Rule("cde", "ab", "fg", new Rule.Phoneme("test", Languages.ANY_LANGUAGE));
        boolean result = rule.patternAndContextMatches("abcdefg", 2);
        assertTrue(result);

        // Right context ผิด
        boolean resultWrongR = rule.patternAndContextMatches("abcdefX", 2);
        assertFalse(resultWrongR);

        // Left context ผิด
        boolean resultWrongL = rule.patternAndContextMatches("XXcdefg", 2);
        assertFalse(resultWrongL);
    }

    @Test
    public void testPhonemeComparator() {
        Rule.Phoneme p1 = new Rule.Phoneme("abc", Languages.ANY_LANGUAGE);
        Rule.Phoneme p2 = new Rule.Phoneme("abd", Languages.ANY_LANGUAGE);
        Rule.Phoneme p3 = new Rule.Phoneme("ab", Languages.ANY_LANGUAGE);
        Rule.Phoneme p4 = new Rule.Phoneme("abc", Languages.ANY_LANGUAGE);

        // c < d -> ติดลบ
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p2) < 0);
        // d > c -> เป็นบวก
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p2, p1) > 0);
        // p3 สั้นกว่า p1 -> ติดลบ
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p3, p1) < 0);
        // p1 ยาวกว่า p3 -> เป็นบวก
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p3) > 0);
        // เท่ากัน -> 0
        assertEquals(0, Rule.Phoneme.COMPARATOR.compare(p1, p4));
    }

    @Test
    public void testPhonemeConstructorsAndMethods() {
        Rule.Phoneme pLeft = new Rule.Phoneme("foo", Languages.ANY_LANGUAGE);
        Rule.Phoneme pRight = new Rule.Phoneme("bar", Languages.ANY_LANGUAGE);
        
        Rule.Phoneme combined = new Rule.Phoneme(pLeft, pRight);
        assertEquals("foobar", combined.getPhonemeText().toString());

        Rule.Phoneme combinedWithLang = new Rule.Phoneme(pLeft, pRight, Languages.ANY_LANGUAGE);
        assertEquals("foobar", combinedWithLang.getPhonemeText().toString());
        assertNotNull(combinedWithLang.getLanguages());

        combinedWithLang.append("baz");
        assertEquals("foobarbaz", combinedWithLang.getPhonemeText().toString());

        assertNotNull(combinedWithLang.getPhonemes());
        assertTrue(combinedWithLang.toString().contains("foobarbaz"));
    }

    @Test
    public void testPhonemeList() {
        Rule.Phoneme p1 = new Rule.Phoneme("a", Languages.ANY_LANGUAGE);
        Rule.Phoneme p2 = new Rule.Phoneme("b", Languages.ANY_LANGUAGE);
        Rule.PhonemeList list = new Rule.PhonemeList(Arrays.asList(p1, p2));

        assertEquals(2, list.getPhonemes().size());
    }

    @Test
    public void testGetInstanceMethods() {
        // ทดสอบดึง Rules ตาม NameType, RuleType และ String Language
        List<Rule> rules = Rule.getInstance(NameType.ASHKENAZI, RuleType.RULES, "common");
        assertNotNull(rules);

        Map<String, List<Rule>> ruleMap = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.RULES, "common");
        assertNotNull(ruleMap);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceMapInvalidLanguage() {
        // ทดสอบกรณีไม่พบ Rules จะต้องโยน IllegalArgumentException
        Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.RULES, "nonexistentlang_xyz");
    }

    @Test
    public void testRPatternEdgeCases() {
        // ทดสอบรูปแบบต่างๆ ของ RPattern ผ่านการสร้าง Rule (ทางอ้อมผ่านรูปแบบ Regex ต่างๆ ที่รองรับในคลาส Rule)
        Rule exactMatch = new Rule("a", "^", "$", new Rule.Phoneme("t", Languages.ANY_LANGUAGE));
        assertTrue(exactMatch.patternAndContextMatches("a", 0));
        assertFalse(exactMatch.patternAndContextMatches("ab", 0));

        Rule emptyMatch = new Rule("", "^", "$", new Rule.Phoneme("t", Languages.ANY_LANGUAGE));
        assertTrue(emptyMatch.patternAndContextMatches("", 0));

        Rule boxMatch = new Rule("a", "[bc]", "", new Rule.Phoneme("t", Languages.ANY_LANGUAGE));
        // ทดสอบกลไกภายในที่เรียกใช้ RPattern แบบ box []
        assertNotNull(boxMatch.getLContext());
        assertNotNull(boxMatch.getRContext());
    }
}