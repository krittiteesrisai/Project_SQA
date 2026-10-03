package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import org.junit.Test;

/**
 * Unit test suite for {@link SystemUtils} targeting high branch/condition coverage
 * and edge case detection.
 */
public class SystemUtilsTest {

    private static final float DELTA = 0.00001f;

    @Test
    public void testConstructor() {
        assertNotNull("Constructor should instantiate object for JavaBean compatibility", new SystemUtils());
    }

    // -----------------------------------------------------------------------
    // isJavaVersionMatch tests
    // -----------------------------------------------------------------------

    @Test
    public void testIsJavaVersionMatchNullVersion() {
        assertFalse(SystemUtils.isJavaVersionMatch(null, "1.5"));
    }

    @Test
    public void testIsJavaVersionMatchSuccess() {
        assertTrue(SystemUtils.isJavaVersionMatch("1.6.0_20", "1.6"));
        assertTrue(SystemUtils.isJavaVersionMatch("1.7.0", "1.7"));
    }

    @Test
    public void testIsJavaVersionMatchMismatch() {
        assertFalse(SystemUtils.isJavaVersionMatch("1.6.0_20", "1.5"));
        assertFalse(SystemUtils.isJavaVersionMatch("1.4.2", "1.5"));
    }

    // -----------------------------------------------------------------------
    // isOSNameMatch tests
    // -----------------------------------------------------------------------

    @Test
    public void testIsOSNameMatchNull() {
        assertFalse(SystemUtils.isOSNameMatch(null, "Windows"));
    }

    @Test
    public void testIsOSNameMatchValid() {
        assertTrue(SystemUtils.isOSNameMatch("Windows 7", "Windows"));
        assertTrue(SystemUtils.isOSNameMatch("Linux", "Lin"));
        assertFalse(SystemUtils.isOSNameMatch("Mac OS X", "Windows"));
    }

    // -----------------------------------------------------------------------
    // isOSMatch tests
    // -----------------------------------------------------------------------

    @Test
    public void testIsOSMatchNullHandling() {
        assertFalse("osName null should return false", 
                SystemUtils.isOSMatch(null, "6.1", "Windows", "6.1"));
        assertFalse("osVersion null should return false", 
                SystemUtils.isOSMatch("Windows 7", null, "Windows", "6.1"));
        assertFalse("both null should return false", 
                SystemUtils.isOSMatch(null, null, "Windows", "6.1"));
    }

    @Test
    public void testIsOSMatchConditions() {
        // True branch: both prefix matches
        assertTrue(SystemUtils.isOSMatch("Windows 7", "6.1.7601", "Windows", "6.1"));

        // Name mismatch, Version match
        assertFalse(SystemUtils.isOSMatch("Mac OS X", "6.1.7601", "Windows", "6.1"));

        // Name match, Version mismatch
        assertFalse(SystemUtils.isOSMatch("Windows XP", "5.1", "Windows", "6.1"));

        // Both mismatch
        assertFalse(SystemUtils.isOSMatch("Linux", "2.6.32", "Windows", "6.1"));
    }

    // -----------------------------------------------------------------------
    // toJavaVersionFloat tests
    // -----------------------------------------------------------------------

    @Test
    public void testToJavaVersionFloatNullAndEmpty() {
        assertEquals(0.0f, SystemUtils.toJavaVersionFloat(null), DELTA);
        assertEquals(0.0f, SystemUtils.toJavaVersionFloat(""), DELTA);
        assertEquals(0.0f, SystemUtils.toJavaVersionFloat("   "), DELTA);
        assertEquals(0.0f, SystemUtils.toJavaVersionFloat("abc"), DELTA);
    }

    @Test
    public void testToJavaVersionFloatSingleDigit() {
        assertEquals(1.0f, SystemUtils.toJavaVersionFloat("1"), DELTA);
        assertEquals(2.0f, SystemUtils.toJavaVersionFloat("2"), DELTA);
    }

    @Test
    public void testToJavaVersionFloatStandardVersions() {
        assertEquals(1.2f, SystemUtils.toJavaVersionFloat("1.2"), DELTA);
        assertEquals(1.31f, SystemUtils.toJavaVersionFloat("1.3.1"), DELTA);
        assertEquals(1.6f, SystemUtils.toJavaVersionFloat("1.6.0_20"), DELTA);
        assertEquals(1.5f, SystemUtils.toJavaVersionFloat("1.5.0-b04"), DELTA);
    }

    // -----------------------------------------------------------------------
    // toJavaVersionInt tests
    // -----------------------------------------------------------------------

    @Test
    public void testToJavaVersionIntNullAndEmpty() {
        assertEquals(0.0f, SystemUtils.toJavaVersionInt(null), DELTA);
        assertEquals(0.0f, SystemUtils.toJavaVersionInt(""), DELTA);
        assertEquals(0.0f, SystemUtils.toJavaVersionInt("non-numeric"), DELTA);
    }

    @Test
    public void testToJavaVersionIntSingleAndMultiSegments() {
        assertEquals(100.0f, SystemUtils.toJavaVersionInt("1"), DELTA);
        assertEquals(120.0f, SystemUtils.toJavaVersionInt("1.2"), DELTA);
        assertEquals(131.0f, SystemUtils.toJavaVersionInt("1.3.1"), DELTA);
        assertEquals(160.0f, SystemUtils.toJavaVersionInt("1.6.0_20"), DELTA);
        assertEquals(150.0f, SystemUtils.toJavaVersionInt("1.5.0-b04"), DELTA);
    }

    // -----------------------------------------------------------------------
    // toJavaVersionIntArray tests
    // -----------------------------------------------------------------------

    @Test
    public void testToJavaVersionIntArrayEdgeCases() {
        assertArrayEquals(new int[0], SystemUtils.toJavaVersionIntArray(null));
        assertArrayEquals(new int[0], SystemUtils.toJavaVersionIntArray(""));
        assertArrayEquals(new int[0], SystemUtils.toJavaVersionIntArray("ABC"));
    }

    @Test
    public void testToJavaVersionIntArrayValidInputs() {
        assertArrayEquals(new int[] {1}, SystemUtils.toJavaVersionIntArray("1"));
        assertArrayEquals(new int[] {1, 2}, SystemUtils.toJavaVersionIntArray("1.2"));
        assertArrayEquals(new int[] {1, 3, 1}, SystemUtils.toJavaVersionIntArray("1.3.1"));
        assertArrayEquals(new int[] {1, 5, 0, 21}, SystemUtils.toJavaVersionIntArray("1.5.0_21"));
        assertArrayEquals(new int[] {2, 0, 0, 1}, SystemUtils.toJavaVersionIntArray("2.0.0.1"));
    }

    // -----------------------------------------------------------------------
    // isJavaVersionAtLeast tests
    // -----------------------------------------------------------------------

    @Test
    public void testIsJavaVersionAtLeastFloat() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(0.0f));
        assertTrue(SystemUtils.isJavaVersionAtLeast(1.1f));
        assertFalse(SystemUtils.isJavaVersionAtLeast(100.0f));
    }

    @Test
    public void testIsJavaVersionAtLeastInt() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(0));
        assertTrue(SystemUtils.isJavaVersionAtLeast(110));
        assertFalse(SystemUtils.isJavaVersionAtLeast(10000));
    }

    // -----------------------------------------------------------------------
    // File / Directory getters & Headless tests
    // -----------------------------------------------------------------------

    @Test
    public void testDirectoryGetters() {
        File javaHome = SystemUtils.getJavaHome();
        assertNotNull(javaHome);
        assertEquals(System.getProperty("java.home"), javaHome.getPath());

        File tmpDir = SystemUtils.getJavaIoTmpDir();
        assertNotNull(tmpDir);
        assertEquals(System.getProperty("java.io.tmpdir"), tmpDir.getPath());

        File userDir = SystemUtils.getUserDir();
        assertNotNull(userDir);
        assertEquals(System.getProperty("user.dir"), userDir.getPath());

        File userHome = SystemUtils.getUserHome();
        assertNotNull(userHome);
        assertEquals(System.getProperty("user.home"), userHome.getPath());
    }

    @Test
    public void testIsJavaAwtHeadless() {
        String expectedProperty = System.getProperty("java.awt.headless");
        boolean expected = "true".equals(expectedProperty);
        assertEquals(expected, SystemUtils.isJavaAwtHeadless());
    }

    // -----------------------------------------------------------------------
    // System property constants sanity check
    // -----------------------------------------------------------------------

    @Test
    public void testConstantsLoaded() {
        assertNotNull(SystemUtils.FILE_SEPARATOR);
        assertNotNull(SystemUtils.LINE_SEPARATOR);
        assertNotNull(SystemUtils.PATH_SEPARATOR);
        assertNotNull(SystemUtils.JAVA_VERSION);
    }
}