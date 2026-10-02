package org.apache.commons.lang3;

import org.apache.commons.lang3.SystemUtils; // คลาสเป้าหมาย (อยู่ package เดียวกัน - import เพื่อความชัดเจน)

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;

/**
 * Unit tests for {@link SystemUtils} (Defects4J Lang-29b).
 *
 * หมายเหตุสำคัญ:
 * - Fields ส่วนใหญ่เป็น public static final ที่ initialize ตอน class-load จาก System properties จริง
 *   ไม่สามารถ mock/เปลี่ยนค่าได้โดยไม่ใช้ reflection แบบ unsafe ดังนั้น test ด้านล่าง
 *   เน้นเทส logic methods (package-private) โดยตรงด้วยอินพุตที่กำหนดเอง
 * - บาง branch ที่ "unreachable" ผ่าน public/package API (เช่น javaVersions==null ใน toVersionInt/toVersionFloat)
 *   ไม่สามารถ cover ได้ เนื่องจาก toJavaVersionIntArray ไม่เคย return null -> ระบุไว้ในคอมเมนต์
 */
public class SystemUtilsTest {

    // ---------------------------------------------------------------
    // isJavaVersionMatch(String version, String versionPrefix)
    // ---------------------------------------------------------------

    @Test
    public void testIsJavaVersionMatch_NullVersion_ReturnsFalse() {
        // branch: version == null -> true
        assertFalse(SystemUtils.isJavaVersionMatch(null, "1.6"));
    }

    @Test
    public void testIsJavaVersionMatch_Matches_ReturnsTrue() {
        // branch: version == null -> false, startsWith -> true
        assertTrue(SystemUtils.isJavaVersionMatch("1.6.0_23", "1.6"));
    }

    @Test
    public void testIsJavaVersionMatch_NoMatch_ReturnsFalse() {
        // branch: version == null -> false, startsWith -> false
        assertFalse(SystemUtils.isJavaVersionMatch("1.6.0_23", "1.7"));
    }

    @Test
    public void testIsJavaVersionMatch_EmptyPrefix_ReturnsTrue() {
        // boundary: startsWith("") ย่อมเป็น true เสมอ
        assertTrue(SystemUtils.isJavaVersionMatch("1.6.0", ""));
    }

    // ---------------------------------------------------------------
    // isOSMatch(osName, osVersion, osNamePrefix, osVersionPrefix)
    // ---------------------------------------------------------------

    @Test
    public void testIsOSMatch_NullOsName_ReturnsFalse() {
        // branch: osName == null -> true
        assertFalse(SystemUtils.isOSMatch(null, "5.1", "Windows", "5.1"));
    }

    @Test
    public void testIsOSMatch_NullOsVersion_ReturnsFalse() {
        // branch: osName != null but osVersion == null -> true
        assertFalse(SystemUtils.isOSMatch("Windows XP", null, "Windows", "5.1"));
    }

    @Test
    public void testIsOSMatch_BothMatch_ReturnsTrue() {
        // branch: null check false, name startsWith true, version startsWith true
        assertTrue(SystemUtils.isOSMatch("Windows XP", "5.1.2600", "Windows", "5.1"));
    }

    @Test
    public void testIsOSMatch_NameMismatch_ReturnsFalse() {
        // branch: name startsWith -> false (short-circuit, version ไม่ถูกเช็คจริง)
        assertFalse(SystemUtils.isOSMatch("Linux", "5.1", "Windows", "5.1"));
    }

    @Test
    public void testIsOSMatch_VersionMismatch_ReturnsFalse() {
        // branch: name startsWith -> true, version startsWith -> false
        assertFalse(SystemUtils.isOSMatch("Windows XP", "6.0", "Windows", "5.1"));
    }

    // ---------------------------------------------------------------
    // isOSNameMatch(osName, osNamePrefix)
    // ---------------------------------------------------------------

    @Test
    public void testIsOSNameMatch_Null_ReturnsFalse() {
        // branch: osName == null -> true
        assertFalse(SystemUtils.isOSNameMatch(null, "Windows"));
    }

    @Test
    public void testIsOSNameMatch_Matches_ReturnsTrue() {
        assertTrue(SystemUtils.isOSNameMatch("Windows 7", "Windows"));
    }

    @Test
    public void testIsOSNameMatch_NoMatch_ReturnsFalse() {
        assertFalse(SystemUtils.isOSNameMatch("Linux", "Windows"));
    }

    // ---------------------------------------------------------------
    // toJavaVersionIntArray(String version)  -- limit = Integer.MAX_VALUE
    // ---------------------------------------------------------------

    @Test
    public void testToJavaVersionIntArray_Null_ReturnsEmptyArray() {
        // branch: version == null -> true -> ArrayUtils.EMPTY_INT_ARRAY
        assertArrayEquals(new int[0], SystemUtils.toJavaVersionIntArray(null));
    }

    @Test
    public void testToJavaVersionIntArray_SimpleVersion() {
        // รูปแบบปกติ: "1.6.0" -> [1,6,0]
        assertArrayEquals(new int[]{1, 6, 0}, SystemUtils.toJavaVersionIntArray("1.6.0"));
    }

    @Test
    public void testToJavaVersionIntArray_WithUnderscorePatch() {
        // "1.6.0_23" -> ทุก token เป็นตัวเลข ไม่มี empty token
        assertArrayEquals(new int[]{1, 6, 0, 23}, SystemUtils.toJavaVersionIntArray("1.6.0_23"));
    }

    @Test
    public void testToJavaVersionIntArray_LeadingDot_EmptyLeadingToken() {
        // ".1.2" -> split ให้ tokens ["","1","2"] (empty token ถูก skip เพราะ s.length()>0 == false)
        // ผลลัพธ์: array ขนาด 3 (จาก strings.length) แต่ assign จริงแค่ 2 ค่า ตำแหน่งที่ 3 เป็นค่า default 0
        // -> แสดง behavior ของโค้ดจริง (อาจเป็นพฤติกรรมที่ไม่ตรงความคาดหวัง แต่เป็นไปตาม source)
        assertArrayEquals(new int[]{1, 2, 0}, SystemUtils.toJavaVersionIntArray(".1.2"));
    }

    @Test
    public void testToJavaVersionIntArray_DoubleDot_MiddleEmptyToken() {
        // "1..6" -> tokens = ["1","","6"] -> empty token กลางถูก skip
        assertArrayEquals(new int[]{1, 6, 0}, SystemUtils.toJavaVersionIntArray("1..6"));
    }

    @Test
    public void testToJavaVersionIntArray_AllNonDigitChars_ReturnsEmptyArray() {
        // "abc" -> ทุก char เป็น non-digit, split ด้วย limit=0 (default) ตัด trailing empty ทั้งหมด
        // -> ได้ array ว่าง -> ints length 0
        assertArrayEquals(new int[0], SystemUtils.toJavaVersionIntArray("abc"));
    }

    @Test
    public void testToJavaVersionIntArray_EmptyString() {
        // "" -> split คืน [""] (1 element) -> s.length()==0 -> ints = new int[1] คงค่า default 0
        assertArrayEquals(new int[]{0}, SystemUtils.toJavaVersionIntArray(""));
    }

    // ---------------------------------------------------------------
    // toJavaVersionFloat(String version) -- ใช้ limit = JAVA_VERSION_TRIM_SIZE(3) ภายใน
    // ---------------------------------------------------------------

    @Test
    public void testToJavaVersionFloat_Null_ReturnsZero() {
        // toJavaVersionIntArray(null)->empty array -> toVersionFloat: length==0 -> return 0f
        assertEquals(0f, SystemUtils.toJavaVersionFloat(null), 0.0001f);
    }

    @Test
    public void testToJavaVersionFloat_SingleElement_ReturnsThatNumber() {
        // branch: javaVersions.length == 1 -> return javaVersions[0]
        assertEquals(7f, SystemUtils.toJavaVersionFloat("7"), 0.0001f);
    }

    @Test
    public void testToJavaVersionFloat_MultiElement_BuildsDecimal() {
        // branch: length > 1 -> builder "1." + "6" + "0" = "1.60" -> 1.6f
        assertEquals(1.6f, SystemUtils.toJavaVersionFloat("1.6.0"), 0.0001f);
    }

    @Test
    public void testToJavaVersionFloat_TrimToThreeGroups() {
        // "1.6.0.99" มี 4 groups แต่ limit=3 -> ใช้แค่ [1,6,0] เท่ากับ "1.6.0"
        assertEquals(1.6f, SystemUtils.toJavaVersionFloat("1.6.0.99"), 0.0001f);
    }

    // ---------------------------------------------------------------
    // toJavaVersionInt(String version) -- method ประกาศ return type เป็น float (ตามซอร์ส)
    // ---------------------------------------------------------------

    @Test
    public void testToJavaVersionInt_Null_ReturnsZero() {
        assertEquals(0f, SystemUtils.toJavaVersionInt(null), 0.0001f);
    }

    @Test
    public void testToJavaVersionInt_ThreeGroups() {
        // len>=1,len>=2,len>=3 ทุก branch true: 1*100 + 6*10 + 0 = 160
        assertEquals(160f, SystemUtils.toJavaVersionInt("1.6.0"), 0.0001f);
    }

    @Test
    public void testToJavaVersionInt_TwoGroupsOnly() {
        // branch len>=3 เป็น false: 1*100 + 6*10 = 160 (ไม่มี += ตัวที่ 3)
        assertEquals(160f, SystemUtils.toJavaVersionInt("1.6"), 0.0001f);
    }

    @Test
    public void testToJavaVersionInt_OneGroupOnly() {
        // branch len>=2, len>=3 เป็น false ทั้งคู่: เหลือแค่ len>=1 -> 1*100
        assertEquals(100f, SystemUtils.toJavaVersionInt("1"), 0.0001f);
    }

    @Test
    public void testToJavaVersionInt_TrimToThreeGroups() {
        // "1.3.1.99" -> ใช้แค่ 3 groups แรก -> เท่ากับ "1.3.1" -> 131
        assertEquals(131f, SystemUtils.toJavaVersionInt("1.3.1.99"), 0.0001f);
    }

    // ---------------------------------------------------------------
    // isJavaVersionAtLeast(float) / isJavaVersionAtLeast(int)
    // ใช้ static field จริงของ runtime (ไม่สามารถ mock ได้)
    // ---------------------------------------------------------------

    @Test
    public void testIsJavaVersionAtLeastFloat_LowerBound_True() {
        // branch: JAVA_VERSION_FLOAT >= requiredVersion -> true เมื่อ required ต่ำมาก
        assertTrue(SystemUtils.isJavaVersionAtLeast(0f));
    }

    @Test
    public void testIsJavaVersionAtLeastFloat_UpperBound_False() {
        // branch: false เมื่อ required สูงเกินจริง
        assertFalse(SystemUtils.isJavaVersionAtLeast(Float.MAX_VALUE));
    }

    @Test
    public void testIsJavaVersionAtLeastInt_LowerBound_True() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(0));
    }

    @Test
    public void testIsJavaVersionAtLeastInt_UpperBound_False() {
        assertFalse(SystemUtils.isJavaVersionAtLeast(Integer.MAX_VALUE));
    }

    // ---------------------------------------------------------------
    // isJavaAwtHeadless()
    // field JAVA_AWT_HEADLESS เป็น final ขึ้นกับ environment จริง
    // ทดสอบว่าผลลัพธ์ตรงกับตรรกะของ method (ครอบคลุมทั้ง 2 branch ของ ternary
    // โดยอ้างอิงค่า field ปัจจุบัน ไม่ force เปลี่ยนค่า เพราะ final-static)
    // ---------------------------------------------------------------

    @Test
    public void testIsJavaAwtHeadless_ConsistentWithField() {
        boolean expected = SystemUtils.JAVA_AWT_HEADLESS != null
                && SystemUtils.JAVA_AWT_HEADLESS.equals(Boolean.TRUE.toString());
        assertEquals(expected, SystemUtils.isJavaAwtHeadless());
    }

    // ---------------------------------------------------------------
    // getJavaHome / getJavaIoTmpDir / getUserDir / getUserHome
    // ---------------------------------------------------------------

    @Test
    public void testGetJavaHome_MatchesSystemProperty() {
        File expected = new File(System.getProperty("java.home"));
        assertEquals(expected, SystemUtils.getJavaHome());
    }

    @Test
    public void testGetJavaIoTmpDir_MatchesSystemProperty() {
        File expected = new File(System.getProperty("java.io.tmpdir"));
        assertEquals(expected, SystemUtils.getJavaIoTmpDir());
    }

    @Test
    public void testGetUserDir_MatchesSystemProperty() {
        File expected = new File(System.getProperty("user.dir"));
        assertEquals(expected, SystemUtils.getUserDir());
    }

    @Test
    public void testGetUserHome_MatchesSystemProperty() {
        File expected = new File(System.getProperty("user.home"));
        assertEquals(expected, SystemUtils.getUserHome());
    }

    // ---------------------------------------------------------------
    // USER_COUNTRY ternary: getSystemProperty("user.country")==null ? user.region : user.country
    // ---------------------------------------------------------------

    @Test
    public void testUserCountry_TernaryLogicConsistency() {
        String country = System.getProperty("user.country");
        String expected = (country == null) ? System.getProperty("user.region") : country;
        assertEquals(expected, SystemUtils.USER_COUNTRY);
    }

    // ---------------------------------------------------------------
    // JAVA_VERSION_TRIMMED (ผ่าน field, เนื่องจาก getJavaVersionTrimmed() เป็น private)
    // ---------------------------------------------------------------

    @Test
    public void testJavaVersionTrimmed_StartsWithDigitWhenJavaVersionNotNull() {
        if (SystemUtils.JAVA_VERSION != null) {
            assertNotNull(SystemUtils.JAVA_VERSION_TRIMMED);
            char firstChar = SystemUtils.JAVA_VERSION_TRIMMED.charAt(0);
            assertTrue(firstChar >= '0' && firstChar <= '9');
        } else {
            // branch: JAVA_VERSION == null -> ควรได้ null (ไม่สามารถบังคับให้เกิดในเทสนี้ได้
            // เนื่องจาก field เป็น final/initialize ตอน class-load)
            assertNull(SystemUtils.JAVA_VERSION_TRIMMED);
        }
    }

    // ---------------------------------------------------------------
    // Constructor (public, สำหรับ JavaBean tools)
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_CreatesInstance() {
        SystemUtils instance = new SystemUtils();
        assertNotNull(instance);
    }
}
