package org.apache.commons.cli2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

import org.junit.Test;

// import คลาสเป้าหมาย (แม้อยู่ package เดียวกัน ระบุไว้ชัดเจนตามข้อกำหนด)
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.CommandLine;

/**
 * หมายเหตุ:
 * WriteableCommandLine เป็น interface ล้วน ๆ ไม่มี logic (if/else/loop) ในซอร์สที่ให้มา
 * และ superinterface (CommandLine) ก็ไม่มีซอร์สให้ จึงไม่สามารถเขียน
 * anonymous/stub implementation ที่ compile ได้โดยไม่ "เดา" method ของ CommandLine
 * และ classpath ที่กำหนดก็ไม่มี mocking library
 *
 * ดังนั้นชุดทดสอบนี้จึงทดสอบ "contract" ของ interface ผ่าน reflection
 * โดยยึดตาม method signature ที่ปรากฏจริงในซอร์สโค้ดเท่านั้น
 * (ครอบคลุม boundary/null/malformed-input ผ่านการเรียก reflection API เอง)
 */
public class WriteableCommandLineTest {

    private static final Class TARGET = WriteableCommandLine.class;

    // ---------- โครงสร้างพื้นฐานของ interface ----------

    @Test
    public void testIsInterface() {
        assertTrue("WriteableCommandLine ต้องเป็น interface", TARGET.isInterface());
        assertTrue(Modifier.isInterface(TARGET.getModifiers()));
    }

    @Test
    public void testExtendsCommandLine() {
        Class[] interfaces = TARGET.getInterfaces();
        boolean found = false;
        for (int i = 0; i < interfaces.length; i++) {
            if (interfaces[i].equals(CommandLine.class)) {
                found = true;
            }
        }
        assertTrue("WriteableCommandLine ต้อง extends CommandLine", found);
    }

    @Test
    public void testDeclaredMethodCountMatchesSource() {
        // นับ method ที่ประกาศในซอร์ส: addOption, addValue, getUndefaultedValues,
        // setDefaultValues, addSwitch, setDefaultSwitch,
        // addProperty(Option,String,String), addProperty(String,String), looksLikeOption
        Method[] methods = TARGET.getDeclaredMethods();
        assertEquals(9, methods.length);
    }

    // ---------- ตรวจ signature รายเมธอด (ตามซอร์สจริง) ----------

    @Test
    public void testAddOptionSignature() throws Exception {
        Method m = TARGET.getMethod("addOption", new Class[] { Option.class });
        assertEquals(Void.TYPE, m.getReturnType());
        assertTrue(Modifier.isAbstract(m.getModifiers()));
        assertEquals(0, m.getExceptionTypes().length); // ไม่มี throws ในซอร์ส
    }

    @Test
    public void testAddValueSignature() throws Exception {
        Method m = TARGET.getMethod("addValue", new Class[] { Option.class, Object.class });
        assertEquals(Void.TYPE, m.getReturnType());
    }

    @Test
    public void testGetUndefaultedValuesSignature() throws Exception {
        Method m = TARGET.getMethod("getUndefaultedValues", new Class[] { Option.class });
        assertEquals(List.class, m.getReturnType());
    }

    @Test
    public void testSetDefaultValuesSignature() throws Exception {
        Method m = TARGET.getMethod("setDefaultValues", new Class[] { Option.class, List.class });
        assertEquals(Void.TYPE, m.getReturnType());
    }

    @Test
    public void testAddSwitchSignatureAndDeclaredException() throws Exception {
        Method m = TARGET.getMethod("addSwitch", new Class[] { Option.class, boolean.class });
        assertEquals(Void.TYPE, m.getReturnType());

        Class[] exceptions = m.getExceptionTypes();
        boolean hasIllegalState = false;
        for (int i = 0; i < exceptions.length; i++) {
            if (exceptions[i].equals(IllegalStateException.class)) {
                hasIllegalState = true;
            }
        }
        assertTrue("addSwitch ต้อง declare throws IllegalStateException ตาม Javadoc",
                   hasIllegalState);
    }

    @Test
    public void testSetDefaultSwitchSignature() throws Exception {
        Method m = TARGET.getMethod("setDefaultSwitch", new Class[] { Option.class, Boolean.class });
        assertEquals(Void.TYPE, m.getReturnType());
    }

    @Test
    public void testAddPropertyWithOptionSignature() throws Exception {
        Method m = TARGET.getMethod("addProperty",
                new Class[] { Option.class, String.class, String.class });
        assertEquals(Void.TYPE, m.getReturnType());
    }

    @Test
    public void testAddPropertyDefaultSignature() throws Exception {
        Method m = TARGET.getMethod("addProperty", new Class[] { String.class, String.class });
        assertEquals(Void.TYPE, m.getReturnType());
    }

    @Test
    public void testLooksLikeOptionSignature() throws Exception {
        Method m = TARGET.getMethod("looksLikeOption", new Class[] { String.class });
        assertEquals(boolean.class, m.getReturnType());
    }

    // ---------- กรณี malformed / boundary / null (ผ่าน reflection API) ----------

    @Test(expected = NoSuchMethodException.class)
    public void testNoOverloadWithWrongArgumentType() throws Exception {
        // ทดสอบ input ผิดรูปแบบ: ไม่มี addOption(String) เพราะซอร์สรับเฉพาะ Option
        TARGET.getMethod("addOption", new Class[] { String.class });
    }

    @Test(expected = NoSuchMethodException.class)
    public void testNoMethodWithTypoName() throws Exception {
        // ทดสอบ input ผิดรูปแบบ: ชื่อ method พิมพ์ผิด ไม่มีอยู่ในซอร์ส
        TARGET.getMethod("addOptionn", new Class[] { Option.class });
    }

    @Test(expected = NullPointerException.class)
    public void testGetMethodWithNullNameThrowsNPE() throws Exception {
        // boundary/null-case: getMethod ด้วยชื่อ null ต้อง throw NPE (พฤติกรรมของ java.lang.Class)
        TARGET.getMethod(null, new Class[] { Option.class });
    }

    @Test
    public void testGetMethodWithEmptyParamArrayOnNoArgMethodFails() {
        // boundary-case: ไม่มี method ใดใน interface ที่ไม่รับพารามิเตอร์เลย
        // (ทุก method ในซอร์สมีอย่างน้อย 1 พารามิเตอร์) -> ต้อง throw
        try {
            TARGET.getMethod("looksLikeOption", new Class[0]);
            fail("ควร throw NoSuchMethodException เพราะ looksLikeOption ต้องมี 1 parameter");
        } catch (NoSuchMethodException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testAddPropertyOverloadsAreDistinctByParamCount() throws Exception {
        // ตรวจว่า addProperty มี 2 overload ตามซอร์ส (2 พารามิเตอร์ และ 3 พารามิเตอร์)
        Method twoArg = TARGET.getMethod("addProperty", new Class[] { String.class, String.class });
        Method threeArg = TARGET.getMethod("addProperty",
                new Class[] { Option.class, String.class, String.class });
        assertEquals(2, twoArg.getParameterTypes().length);
        assertEquals(3, threeArg.getParameterTypes().length);
        assertFalse(twoArg.equals(threeArg));
    }
}
