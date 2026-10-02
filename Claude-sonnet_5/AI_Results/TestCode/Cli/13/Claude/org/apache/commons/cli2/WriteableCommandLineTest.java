package org.apache.commons.cli2;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * ทดสอบ contract ของ interface WriteableCommandLine
 *
 * หมายเหตุสำคัญ: WriteableCommandLine เป็น interface ที่ไม่มี method body
 * ในตัวเอง (ไม่มี branch/condition ในซอร์สของ interface นี้โดยตรง)
 * เนื่องจากไม่มี concrete implementation ให้ในซอร์สที่กำหนด และ classpath
 * ไม่มี mocking framework จึงใช้ java.lang.reflect.Proxy สร้าง instance
 * แบบไดนามิกเพื่อทดสอบ:
 *   1) method signature เรียกใช้ได้ตรงตาม interface
 *   2) exception contract ที่ระบุไว้ใน Javadoc ของ interface (addSwitch)
 *   3) การส่งผ่าน argument (รวม boundary: null, empty)
 *
 * Behavior อื่น ๆ ที่ไม่ได้ระบุไว้ใน Javadoc ของ interface (เช่น addOption(null)
 * ควร throw exception หรือไม่) จะไม่ถูก assert เป็น "ต้องเป็นแบบนั้น" เนื่องจาก
 * ไม่มีการระบุไว้ในซอร์ส — จะทดสอบเพียงว่าเรียกได้และ argument ถูกส่งผ่านถูกต้อง
 */
public class WriteableCommandLineTest {

    private List<Object[]> callLog;
    private boolean switchAlreadyAdded;
    private WriteableCommandLine cmdLine;

    @Before
    public void setUp() {
        callLog = new ArrayList<Object[]>();
        switchAlreadyAdded = false;
        cmdLine = createWriteableCommandLineProxy();
    }

    // ---------------------------------------------------------------
    // Proxy factory สำหรับ WriteableCommandLine
    // ---------------------------------------------------------------
    private WriteableCommandLine createWriteableCommandLineProxy() {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) {
                String name = method.getName();
                callLog.add(new Object[] { name, args });

                if ("addSwitch".equals(name)) {
                    // ตาม Javadoc: "throws IllegalStateException if the switch
                    // has already been added" -> นี่คือ contract ที่ระบุไว้จริง
                    if (switchAlreadyAdded) {
                        throw new IllegalStateException("switch already added");
                    }
                    switchAlreadyAdded = true;
                    return null;
                }
                // เมธอดอื่น ๆ ทั้งหมด (addOption, addValue, setDefaultValues,
                // setDefaultSwitch, addProperty, looksLikeOption, และเมธอดที่
                // สืบทอดมาจาก CommandLine ที่ไม่ทราบ signature แน่ชัด)
                // -> คืนค่า default ตาม return type เท่านั้น ไม่ implement
                //    behavior เพิ่มเติมที่ไม่มีระบุในซอร์ส
                if ("looksLikeOption".equals(name)) {
                    // จำลองแบบขั้นต่ำที่สุดตามชื่อเมธอด "looks like option"
                    // เพื่อให้มี true/false สองสาขาให้ทดสอบ boolean return
                    // (นี่เป็นสมมติฐานเพื่อทดสอบ boundary เท่านั้น ระบุคอมเมนต์
                    //  กำกับไว้ว่าเป็นการจำลอง ไม่ใช่ behavior จริงจาก implementation)
                    String arg = (String) args[0];
                    return Boolean.valueOf(arg != null && arg.startsWith("-"));
                }
                return defaultValueFor(method.getReturnType());
            }
        };
        return (WriteableCommandLine) Proxy.newProxyInstance(
                WriteableCommandLine.class.getClassLoader(),
                new Class[] { WriteableCommandLine.class },
                handler);
    }

    // ---------------------------------------------------------------
    // Proxy factory สำหรับ Option (ใช้เป็น non-null argument เท่านั้น
    // ไม่ implement behavior เฉพาะใด ๆ ของ Option)
    // ---------------------------------------------------------------
    private Option createDummyOption() {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) {
                return defaultValueFor(method.getReturnType());
            }
        };
        return (Option) Proxy.newProxyInstance(
                Option.class.getClassLoader(),
                new Class[] { Option.class },
                handler);
    }

    private static Object defaultValueFor(Class<?> returnType) {
        if (returnType == boolean.class) return Boolean.FALSE;
        if (returnType == byte.class) return Byte.valueOf((byte) 0);
        if (returnType == short.class) return Short.valueOf((short) 0);
        if (returnType == int.class) return Integer.valueOf(0);
        if (returnType == long.class) return Long.valueOf(0L);
        if (returnType == float.class) return Float.valueOf(0f);
        if (returnType == double.class) return Double.valueOf(0d);
        if (returnType == char.class) return Character.valueOf('\0');
        return null; // void, Object, array, ฯลฯ
    }

    // =================================================================
    // addOption(Option)
    // =================================================================

    @Test
    public void testAddOption_withValidOption() {
        Option option = createDummyOption();
        cmdLine.addOption(option);
        assertEquals(1, callLog.size());
        assertEquals("addOption", callLog.get(0)[0]);
    }

    @Test
    public void testAddOption_withNullOption() {
        // boundary: null argument - ตรวจสอบว่าเรียกได้โดยไม่ throw
        // (interface ไม่ได้ระบุ null-check contract)
        cmdLine.addOption(null);
        assertEquals(1, callLog.size());
    }

    // =================================================================
    // addValue(Option, Object)
    // =================================================================

    @Test
    public void testAddValue_withValidOptionAndValue() {
        Option option = createDummyOption();
        cmdLine.addValue(option, "value1");
        Object[] args = (Object[]) callLog.get(0)[1];
        assertEquals(option, args[0]);
        assertEquals("value1", args[1]);
    }

    @Test
    public void testAddValue_withNullValue() {
        // boundary: value เป็น null
        Option option = createDummyOption();
        cmdLine.addValue(option, null);
        Object[] args = (Object[]) callLog.get(0)[1];
        assertNull(args[1]);
    }

    @Test
    public void testAddValue_withNullOption() {
        cmdLine.addValue(null, "value1");
        Object[] args = (Object[]) callLog.get(0)[1];
        assertNull(args[0]);
    }

    // =================================================================
    // setDefaultValues(Option, List)
    // =================================================================

    @Test
    public void testSetDefaultValues_withEmptyList() {
        Option option = createDummyOption();
        List defaults = new ArrayList();
        cmdLine.setDefaultValues(option, defaults);
        Object[] args = (Object[]) callLog.get(0)[1];
        assertTrue(((List) args[1]).isEmpty());
    }

    @Test
    public void testSetDefaultValues_withNonEmptyList() {
        Option option = createDummyOption();
        List defaults = new ArrayList();
        defaults.add("d1");
        defaults.add("d2");
        cmdLine.setDefaultValues(option, defaults);
        Object[] args = (Object[]) callLog.get(0)[1];
        assertEquals(2, ((List) args[1]).size());
    }

    @Test
    public void testSetDefaultValues_withNullList() {
        // boundary: null list
        Option option = createDummyOption();
        cmdLine.setDefaultValues(option, null);
        Object[] args = (Object[]) callLog.get(0)[1];
        assertNull(args[1]);
    }

    // =================================================================
    // addSwitch(Option, boolean) - throws IllegalStateException
    // =================================================================

    @Test
    public void testAddSwitch_firstCall_true_doesNotThrow() {
        Option option = createDummyOption();
        cmdLine.addSwitch(option, true);
        assertEquals(1, callLog.size());
    }

    @Test
    public void testAddSwitch_firstCall_false_doesNotThrow() {
        Option option = createDummyOption();
        cmdLine.addSwitch(option, false);
        assertEquals(1, callLog.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_secondCall_throwsIllegalStateException() {
        // Javadoc: "throws IllegalStateException if the switch has already
        // been added" -> เรียกครั้งที่สองต้อง throw
        Option option = createDummyOption();
        cmdLine.addSwitch(option, true);
        cmdLine.addSwitch(option, false);
    }

    @Test
    public void testAddSwitch_withNullOption_firstCallDoesNotThrow() {
        // boundary: option เป็น null, ยังไม่เคย add switch มาก่อน
        cmdLine.addSwitch(null, true);
        assertEquals(1, callLog.size());
    }

    // =================================================================
    // setDefaultSwitch(Option, Boolean)
    // =================================================================

    @Test
    public void testSetDefaultSwitch_withTrue() {
        Option option = createDummyOption();
        cmdLine.setDefaultSwitch(option, Boolean.TRUE);
        Object[] args = (Object[]) callLog.get(0)[1];
        assertEquals(Boolean.TRUE, args[1]);
    }

    @Test
    public void testSetDefaultSwitch_withFalse() {
        Option option = createDummyOption();
        cmdLine.setDefaultSwitch(option, Boolean.FALSE);
        Object[] args = (Object[]) callLog.get(0)[1];
        assertEquals(Boolean.FALSE, args[1]);
    }

    @Test
    public void testSetDefaultSwitch_withNullBoolean() {
        // boundary: defaultSwitch เป็น null (ไม่กำหนดค่า default)
        Option option = createDummyOption();
        cmdLine.setDefaultSwitch(option, null);
        Object[] args = (Object[]) callLog.get(0)[1];
        assertNull(args[1]);
    }

    // =================================================================
    // addProperty(String, String)
    // =================================================================

    @Test
    public void testAddProperty_withValidNameAndValue() {
        cmdLine.addProperty("propName", "propValue");
        Object[] args = (Object[]) callLog.get(0)[1];
        assertEquals("propName", args[0]);
        assertEquals("propValue", args[1]);
    }

    @Test
    public void testAddProperty_withEmptyStringValue() {
        // boundary: ค่าว่าง ""
        cmdLine.addProperty("propName", "");
        Object[] args = (Object[]) callLog.get(0)[1];
        assertEquals("", args[1]);
    }

    @Test
    public void testAddProperty_withEmptyPropertyName() {
        cmdLine.addProperty("", "value");
        Object[] args = (Object[]) callLog.get(0)[1];
        assertEquals("", args[0]);
    }

    @Test
    public void testAddProperty_withNullPropertyName() {
        // มัลฟอร์ม/boundary: property name = null
        cmdLine.addProperty(null, "value");
        Object[] args = (Object[]) callLog.get(0)[1];
        assertNull(args[0]);
    }

    @Test
    public void testAddProperty_withNullValue() {
        cmdLine.addProperty("propName", null);
        Object[] args = (Object[]) callLog.get(0)[1];
        assertNull(args[1]);
    }

    // =================================================================
    // looksLikeOption(String) -> boolean
    // =================================================================

    @Test
    public void testLooksLikeOption_withDashPrefix_returnsTrue() {
        assertTrue(cmdLine.looksLikeOption("-o"));
    }

    @Test
    public void testLooksLikeOption_withoutDashPrefix_returnsFalse() {
        assertFalse(cmdLine.looksLikeOption("value"));
    }

    @Test
    public void testLooksLikeOption_withEmptyString_returnsFalse() {
        // boundary: string ว่าง
        assertFalse(cmdLine.looksLikeOption(""));
    }

    @Test
    public void testLooksLikeOption_withNull_doesNotThrow() {
        // boundary: null argument - ตรวจสอบว่า proxy จัดการได้โดยไม่ throw
        assertFalse(cmdLine.looksLikeOption(null));
    }
}
