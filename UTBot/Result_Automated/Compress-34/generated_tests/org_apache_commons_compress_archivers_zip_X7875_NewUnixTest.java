package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.math.BigInteger;
import java.lang.reflect.Method;
import java.util.zip.ZipException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_compress_archivers_zip_X7875_NewUnixTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X7875_NewUnix): True}
 * @utbot.returnsFrom {@code return version == xf.version && uid.equals(xf.uid) && gid.equals(xf.gid);}
 *  */
    @Test
    public void testEquals_VersionNotEqualsXfVersionAndUidEqualsAndGidEquals() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", 1);
        X7875_NewUnix x7875_NewUnix1 = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        
        boolean actual = x7875_NewUnix.equals(x7875_NewUnix1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X7875_NewUnix): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotONotInstanceOfX7875_NewUnix() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        
        boolean actual = x7875_NewUnix.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X7875_NewUnix): True}
 * @utbot.returnsFrom {@code return version == xf.version && uid.equals(xf.uid) && gid.equals(xf.gid);}
 *  */
    @Test
    public void testEquals_VersionEqualsXfVersionAndUidEqualsAndGidEquals() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", -255);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        X7875_NewUnix x7875_NewUnix1 = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid1, "java.math.BigInteger", "signum", 254);
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid1);
        
        boolean actual = x7875_NewUnix.equals(x7875_NewUnix1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X7875_NewUnix): True}
 * @utbot.returnsFrom {@code return version == xf.version && uid.equals(xf.uid) && gid.equals(xf.gid);}
 *  */
    @Test
    public void testEquals_VersionEqualsXfVersionAndUidEqualsAndGidEquals_1() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        X7875_NewUnix x7875_NewUnix1 = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        boolean actual = x7875_NewUnix.equals(x7875_NewUnix1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X7875_NewUnix): True}
 * @utbot.returnsFrom {@code return version == xf.version && uid.equals(xf.uid) && gid.equals(xf.gid);}
 *  */
    @Test
    public void testEquals_VersionNotEqualsXfVersionAndUidEqualsAndGidEquals_1() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        X7875_NewUnix x7875_NewUnix1 = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid1, "java.math.BigInteger", "signum", -255);
        setField(uid1, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid1);
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        
        boolean actual = x7875_NewUnix.equals(x7875_NewUnix1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#equals(java.lang.Object)}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return version == xf.version && uid.equals(xf.uid) && gid.equals(xf.gid);
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        X7875_NewUnix x7875_NewUnix1 = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.equals] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.equals(X7875_NewUnix.java:262) */
        x7875_NewUnix.equals(x7875_NewUnix1);
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#equals(java.lang.Object)}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return version == xf.version && uid.equals(xf.uid) && gid.equals(xf.gid);
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        X7875_NewUnix x7875_NewUnix1 = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid1, "java.math.BigInteger", "signum", -255);
        setField(uid1, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix1, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.equals] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.equals(X7875_NewUnix.java:262) */
        x7875_NewUnix.equals(x7875_NewUnix1);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method equals(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#equals(java.lang.Object)}
     */
    @Test(timeout = 1000L)
    public void testEquals() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        Object object = new Object();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        x7875_NewUnix.equals(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.toString
    
    ///region FUZZER: TIMEOUTS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#toString()}
     */
    @Test(timeout = 1000L)
    public void testToString() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        x7875_NewUnix.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        String actual = x7875_NewUnix.toString();
        
        String expected = "0x7875 Zip Extra Field: UID=0 GID=null";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString2() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.toString(X7875_NewUnix.java:249) */
        x7875_NewUnix.toString();
    }
    
    @Test
    public void testToString3() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", 1);
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", 1);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.toString] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.toString(BigInteger.java:4086)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.toString(X7875_NewUnix.java:249) */
        x7875_NewUnix.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.invokes {@link java.lang.Integer#rotateLeft(int,int)}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.returnsFrom {@code return hc;}
 *  */
    @Test
    public void testHashCode_BigIntegerHashCode() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(gid, "java.math.BigInteger", "signum", -255);
        int[] mag1 = {};
        setField(gid, "java.math.BigInteger", "mag", mag1);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        
        int actual = x7875_NewUnix.hashCode();
        
        assertEquals(314814585, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hc ^= Integer.rotateLeft(uid.hashCode(), 16);
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.hashCode(X7875_NewUnix.java:273) */
        x7875_NewUnix.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.invokes {@link java.lang.Integer#rotateLeft(int,int)}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hc ^= gid.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "version", -255);
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.hashCode(X7875_NewUnix.java:274) */
        x7875_NewUnix.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return super.clone();}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        
        X7875_NewUnix actual = ((X7875_NewUnix) x7875_NewUnix.clone());
        
        X7875_NewUnix expected = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        
        // org.apache.commons.compress.archivers.zip.X7875_NewUnix has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#reset()}
 *  */
    @Test
    public void testReset() throws Exception  {
        Class x7875NewUnixClazz = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        BigInteger prevONE_THOUSAND = ((BigInteger) getStaticFieldValue(x7875NewUnixClazz, "ONE_THOUSAND"));
        try {
            BigInteger oneThousand = ((BigInteger) createInstance("java.math.BigInteger"));
            setField(oneThousand, "java.math.BigInteger", "signum", 1);
            int[] mag = {1000};
            setField(oneThousand, "java.math.BigInteger", "mag", mag);
            setStaticField(x7875NewUnixClazz, "ONE_THOUSAND", oneThousand);
            X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
            
            BigInteger initialX7875_NewUnixUid = ((BigInteger) getFieldValue(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid"));
            
            Method resetMethod = x7875NewUnixClazz.getDeclaredMethod("reset");
            resetMethod.setAccessible(true);
            java.lang.Object[] resetMethodArguments = new java.lang.Object[0];
            resetMethod.invoke(x7875_NewUnix, resetMethodArguments);
            
            BigInteger finalX7875_NewUnixUid = ((BigInteger) getFieldValue(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid"));
            
            assertFalse(initialX7875_NewUnixUid == finalX7875_NewUnixUid);
        } finally {
            setStaticField(X7875_NewUnix.class, "ONE_THOUSAND", prevONE_THOUSAND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseFromLocalFileData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.version = signedByteToUnsignedInt(data[offset++]);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class x7875NewUnixClazz = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        BigInteger prevONE_THOUSAND = ((BigInteger) getStaticFieldValue(x7875NewUnixClazz, "ONE_THOUSAND"));
        try {
            BigInteger oneThousand = ((BigInteger) createInstance("java.math.BigInteger"));
            setField(oneThousand, "java.math.BigInteger", "signum", 1);
            int[] mag = {1000};
            setField(oneThousand, "java.math.BigInteger", "mag", mag);
            setStaticField(x7875NewUnixClazz, "ONE_THOUSAND", oneThousand);
            X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
            byte[] byteArray = {(byte) -127};
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
                org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData(X7875_NewUnix.java:208) */
            x7875_NewUnix.parseFromLocalFileData(byteArray, -256, -255);
        } finally {
            setStaticField(X7875_NewUnix.class, "ONE_THOUSAND", prevONE_THOUSAND);
        }
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.version = signedByteToUnsignedInt(data[offset++]);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowNullPointerException() throws Exception  {
        Class x7875NewUnixClazz = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        BigInteger prevONE_THOUSAND = ((BigInteger) getStaticFieldValue(x7875NewUnixClazz, "ONE_THOUSAND"));
        try {
            BigInteger oneThousand = ((BigInteger) createInstance("java.math.BigInteger"));
            setField(oneThousand, "java.math.BigInteger", "signum", 1);
            int[] mag = {1000};
            setField(oneThousand, "java.math.BigInteger", "mag", mag);
            setStaticField(x7875NewUnixClazz, "ONE_THOUSAND", oneThousand);
            X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData(X7875_NewUnix.java:208) */
            x7875_NewUnix.parseFromLocalFileData(null, -255, 0);
        } finally {
            setStaticField(X7875_NewUnix.class, "ONE_THOUSAND", prevONE_THOUSAND);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseFromLocalFileData([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#parseFromLocalFileData(byte[],int,int)}
     */
    @Test
    public void testParseFromLocalFileDataWithNonEmptyPrimitiveArray() throws ZipException  {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        x7875_NewUnix.parseFromLocalFileData(byteArray, 1, -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseFromLocalFileData([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#parseFromLocalFileData(byte[],int,int)}
     */
    @Test
    public void testParseFromLocalFileDataThrowsAIOOBEWithNonEmptyPrimitiveArrayAndCornerCases() throws ZipException  {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData(X7875_NewUnix.java:209) */
        x7875_NewUnix.parseFromLocalFileData(byteArray, 0, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromCentralDirectoryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseFromCentralDirectoryData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#parseFromCentralDirectoryData(byte[],int,int)}
 *  */
    @Test
    public void testParseFromCentralDirectoryData() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        
        x7875_NewUnix.parseFromCentralDirectoryData(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trimLeadingZeroesForceMinLength([B)
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#trimLeadingZeroesForceMinLength(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(byte b: array)} once
 * @utbot.returnsFrom {@code return trimmedArray;}
 *  */
    @Test
    public void testTrimLeadingZeroesForceMinLength_BNotEqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray);
        
        byte[] expected = {(byte) -127, (byte) -127};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#trimLeadingZeroesForceMinLength(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(byte b: array)} once
 * @utbot.returnsFrom {@code return trimmedArray;}
 *  */
    @Test
    public void testTrimLeadingZeroesForceMinLength_BEqualsZero() {
        byte[] byteArray = {(byte) 0};
        
        byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray);
        
        byte[] expected = {(byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#trimLeadingZeroesForceMinLength(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return array;}
 *  */
    @Test
    public void testTrimLeadingZeroesForceMinLength_ArrayEqualsNull() {
        byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLocalFileDataData()
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getLocalFileDataData()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] uidBytes = uid.toByteArray();
 *  */
    @Test
    public void testGetLocalFileDataData_ThrowNegativeArraySizeException() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -30);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData] produces [java.lang.NegativeArraySizeException: -2]
            java.base/java.math.BigInteger.toByteArray(BigInteger.java:4175)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData(X7875_NewUnix.java:156) */
        x7875_NewUnix.getLocalFileDataData();
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getLocalFileDataData()}
 * @utbot.invokes {@link java.math.BigInteger#toByteArray()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] gidBytes = gid.toByteArray();
 *  */
    @Test
    public void testGetLocalFileDataData_ThrowNegativeArraySizeException_1() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -14);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(gid, "java.math.BigInteger", "bitLengthPlusOne", -27);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData] produces [java.lang.NegativeArraySizeException: -2]
            java.base/java.math.BigInteger.toByteArray(BigInteger.java:4175)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData(X7875_NewUnix.java:157) */
        x7875_NewUnix.getLocalFileDataData();
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getLocalFileDataData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] uidBytes = uid.toByteArray();
 *  */
    @Test
    public void testGetLocalFileDataData_ThrowNullPointerException() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData(X7875_NewUnix.java:156) */
        x7875_NewUnix.getLocalFileDataData();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLocalFileDataData()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getLocalFileDataData()}
     */
    @Test
    public void testGetLocalFileDataData() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        byte[] actual = x7875_NewUnix.getLocalFileDataData();
        
        byte[] expected = {(byte) 1, (byte) 2, (byte) -24, (byte) 3, (byte) 2, (byte) -24, (byte) 3};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLocalFileDataData()
    
    @Test
    public void testGetLocalFileDataData1() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -12);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", uid);
        
        byte[] actual = x7875_NewUnix.getLocalFileDataData();
        
        byte[] expected = {(byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetLocalFileDataData2() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {128};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", uid);
        
        byte[] actual = x7875_NewUnix.getLocalFileDataData();
        
        byte[] expected = {(byte) 0, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE};
        
        assertArrayEquals(expected, actual);
        
        BigInteger x7875_NewUnixUid = ((BigInteger) getFieldValue(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid"));
        int finalX7875_NewUnixUidBitLengthPlusOne = ((Integer) getFieldValue(x7875_NewUnixUid, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(9, finalX7875_NewUnixUidBitLengthPlusOne);
    }
    
    @Test
    public void testGetLocalFileDataData3() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", uid);
        
        byte[] actual = x7875_NewUnix.getLocalFileDataData();
        
        byte[] expected = {(byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0};
        
        assertArrayEquals(expected, actual);
        
        BigInteger x7875_NewUnixUid = ((BigInteger) getFieldValue(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid"));
        int finalX7875_NewUnixUidBitLengthPlusOne = ((Integer) getFieldValue(x7875_NewUnixUid, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(1, finalX7875_NewUnixUidBitLengthPlusOne);
    }
    
    @Test
    public void testGetLocalFileDataData4() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -12);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(gid, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {
            Integer.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(gid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        
        byte[] actual = x7875_NewUnix.getLocalFileDataData();
        
        byte[] expected = new byte[40];
        expected[1] = (byte) 1;
        expected[3] = (byte) 36;
        expected[39] = java.lang.Byte.MIN_VALUE;
        
        assertArrayEquals(expected, actual);
        
        BigInteger x7875_NewUnixGid = ((BigInteger) getFieldValue(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid"));
        int finalX7875_NewUnixGidBitLengthPlusOne = ((Integer) getFieldValue(x7875_NewUnixGid, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(288, finalX7875_NewUnixGidBitLengthPlusOne);
    }
    
    @Test
    public void testGetLocalFileDataData5() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -12);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {
            32769, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(gid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        
        byte[] actual = x7875_NewUnix.getLocalFileDataData();
        
        byte[] expected = new byte[38];
        expected[1] = (byte) 1;
        expected[3] = (byte) 34;
        expected[36] = (byte) 1;
        expected[37] = java.lang.Byte.MIN_VALUE;
        
        assertArrayEquals(expected, actual);
        
        BigInteger x7875_NewUnixGid = ((BigInteger) getFieldValue(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid"));
        int finalX7875_NewUnixGidBitLengthPlusOne = ((Integer) getFieldValue(x7875_NewUnixGid, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(273, finalX7875_NewUnixGidBitLengthPlusOne);
    }
    
    @Test
    public void testGetLocalFileDataData6() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(gid, "java.math.BigInteger", "bitLengthPlusOne", -8);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        
        byte[] actual = x7875_NewUnix.getLocalFileDataData();
        
        byte[] expected = {(byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 0};
        
        assertArrayEquals(expected, actual);
        
        BigInteger x7875_NewUnixUid = ((BigInteger) getFieldValue(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid"));
        int finalX7875_NewUnixUidBitLengthPlusOne = ((Integer) getFieldValue(x7875_NewUnixUid, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(1, finalX7875_NewUnixUidBitLengthPlusOne);
    }
    
    @Test
    public void testGetLocalFileDataData7() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(gid, "java.math.BigInteger", "mag", mag1);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        
        byte[] actual = x7875_NewUnix.getLocalFileDataData();
        
        byte[] expected = {(byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 0};
        
        assertArrayEquals(expected, actual);
        
        BigInteger x7875_NewUnixUid = ((BigInteger) getFieldValue(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid"));
        int finalX7875_NewUnixUidBitLengthPlusOne = ((Integer) getFieldValue(x7875_NewUnixUid, "java.math.BigInteger", "bitLengthPlusOne"));
        BigInteger x7875_NewUnixGid = ((BigInteger) getFieldValue(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid"));
        int finalX7875_NewUnixGidBitLengthPlusOne = ((Integer) getFieldValue(x7875_NewUnixGid, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(1, finalX7875_NewUnixUidBitLengthPlusOne);
        
        assertEquals(257, finalX7875_NewUnixGidBitLengthPlusOne);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLocalFileDataData()
    
    @Test
    public void testGetLocalFileDataData8() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {
            65440, 4857, 4857, 4857, 4857, 4857, 4857, 0,
            0, 0
        };
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData(X7875_NewUnix.java:157) */
        x7875_NewUnix.getLocalFileDataData();
    }
    
    @Test
    public void testGetLocalFileDataData9() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -8);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(gid, "java.math.BigInteger", "bitLengthPlusOne", 240);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.getInt(BigInteger.java:4628)
            java.base/java.math.BigInteger.toByteArray(BigInteger.java:4179)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData(X7875_NewUnix.java:157) */
        x7875_NewUnix.getLocalFileDataData();
    }
    
    @Test
    public void testGetLocalFileDataData10() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {3};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        BigInteger gid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", gid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.bitLength(BigInteger.java:3701)
            java.base/java.math.BigInteger.toByteArray(BigInteger.java:4174)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData(X7875_NewUnix.java:157) */
        x7875_NewUnix.getLocalFileDataData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCentralDirectoryData()
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getCentralDirectoryData()}
 * @utbot.returnsFrom {@code return new byte[0];}
 *  */
    @Test
    public void testGetCentralDirectoryData_ReturnNewArrayOfByte() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        
        byte[] actual = x7875_NewUnix.getCentralDirectoryData();
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLocalFileDataLength()
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getLocalFileDataLength()}
 * @utbot.invokes {@link java.math.BigInteger#toByteArray()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: int uidSize = trimLeadingZeroesForceMinLength(uid.toByteArray()).length;
 *  */
    @Test
    public void testGetLocalFileDataLength_ThrowNegativeArraySizeException() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -30);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength] produces [java.lang.NegativeArraySizeException: -2]
            java.base/java.math.BigInteger.toByteArray(BigInteger.java:4175)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:132) */
        x7875_NewUnix.getLocalFileDataLength();
    }
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getLocalFileDataLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int uidSize = trimLeadingZeroesForceMinLength(uid.toByteArray()).length;
 *  */
    @Test
    public void testGetLocalFileDataLength_ThrowNullPointerException() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:132) */
        x7875_NewUnix.getLocalFileDataLength();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLocalFileDataLength()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getLocalFileDataLength()}
     */
    @Test
    public void testGetLocalFileDataLength() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        ZipShort actual = x7875_NewUnix.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(7);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLocalFileDataLength()
    
    @Test
    public void testGetLocalFileDataLength1() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -12);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:133) */
        x7875_NewUnix.getLocalFileDataLength();
    }
    
    @Test
    public void testGetLocalFileDataLength2() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {2097152, 1};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:133) */
        x7875_NewUnix.getLocalFileDataLength();
    }
    
    @Test
    public void testGetLocalFileDataLength3() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {32768, 4857, 4857, 4857, 4857, 4857, 4857, 4857};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:133) */
        x7875_NewUnix.getLocalFileDataLength();
    }
    
    @Test
    public void testGetLocalFileDataLength4() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", 240);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:133) */
        x7875_NewUnix.getLocalFileDataLength();
    }
    
    @Test
    public void testGetLocalFileDataLength5() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:133) */
        x7875_NewUnix.getLocalFileDataLength();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCentralDirectoryLength()
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getCentralDirectoryLength()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getLocalFileDataLength()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return getLocalFileDataLength();
 *  */
    @Test
    public void testGetCentralDirectoryLength_ThrowNegativeArraySizeException() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -30);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength] produces [java.lang.NegativeArraySizeException: -2]
            java.base/java.math.BigInteger.toByteArray(BigInteger.java:4175)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:132)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength(X7875_NewUnix.java:146) */
        x7875_NewUnix.getCentralDirectoryLength();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCentralDirectoryLength()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getCentralDirectoryLength()}
     */
    @Test
    public void testGetCentralDirectoryLength() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        ZipShort actual = x7875_NewUnix.getCentralDirectoryLength();
        
        ZipShort expected = new ZipShort(7);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCentralDirectoryLength()
    
    @Test
    public void testGetCentralDirectoryLength1() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", -12);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "gid", uid);
        
        ZipShort actual = x7875_NewUnix.getCentralDirectoryLength();
        
        ZipShort expected = new ZipShort(5);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCentralDirectoryLength()
    
    @Test
    public void testGetCentralDirectoryLength2() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {8192, 0, 0, 0, 0, 0, 0, 0};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:133)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength(X7875_NewUnix.java:146) */
        x7875_NewUnix.getCentralDirectoryLength();
    }
    
    @Test
    public void testGetCentralDirectoryLength3() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:133)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength(X7875_NewUnix.java:146) */
        x7875_NewUnix.getCentralDirectoryLength();
    }
    
    @Test
    public void testGetCentralDirectoryLength4() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(uid, "java.math.BigInteger", "bitLengthPlusOne", 240);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:133)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength(X7875_NewUnix.java:146) */
        x7875_NewUnix.getCentralDirectoryLength();
    }
    
    @Test
    public void testGetCentralDirectoryLength5() throws Exception  {
        X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        BigInteger uid = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {128, 0, 0, 0, 0, 0, 0, 0};
        setField(uid, "java.math.BigInteger", "mag", mag);
        setField(x7875_NewUnix, "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "uid", uid);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength(X7875_NewUnix.java:133)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength(X7875_NewUnix.java:146) */
        x7875_NewUnix.getCentralDirectoryLength();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.setUID
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setUID(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#setUID(long)}
     */
    @Test
    public void testSetUIDWithCornerCase() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        x7875_NewUnix.setUID(0L);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setUID(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#setUID(long)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetUIDThrowsIAE() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        x7875_NewUnix.setUID(-9223372036854775807L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.getHeaderId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHeaderId()
    
    /**
    @utbot.classUnderTest {@link X7875_NewUnix}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getHeaderId()}
 * @utbot.returnsFrom {@code return HEADER_ID;}
 *  */
    @Test
    public void testGetHeaderId_ReturnHEADER_ID() throws Exception  {
        Class x7875NewUnixClazz = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        ZipShort prevHEADER_ID = ((ZipShort) getStaticFieldValue(x7875NewUnixClazz, "HEADER_ID"));
        try {
            ZipShort headerId = new ZipShort(30837);
            setStaticField(x7875NewUnixClazz, "HEADER_ID", headerId);
            X7875_NewUnix x7875_NewUnix = ((X7875_NewUnix) createInstance("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
            
            ZipShort actual = x7875_NewUnix.getHeaderId();
            
            // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
            assertEquals(headerId, actual);
        } finally {
            setStaticField(X7875_NewUnix.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.getGID
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getGID()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getGID()}
     */
    @Test
    public void testGetGIDReturns1000() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        long actual = x7875_NewUnix.getGID();
        
        assertEquals(1000L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.getUID
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getUID()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#getUID()}
     */
    @Test
    public void testGetUIDReturns1000() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        long actual = x7875_NewUnix.getUID();
        
        assertEquals(1000L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X7875_NewUnix.setGID
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setGID(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#setGID(long)}
     */
    @Test
    public void testSetGIDWithCornerCase() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        x7875_NewUnix.setGID(0L);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setGID(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X7875_NewUnix#setGID(long)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetGIDThrowsIAE() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        
        x7875_NewUnix.setGID(-9223372036854775807L);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields975280819441200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields975280819441200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass975280819447500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975280819441200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975280819447500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields975280820069500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields975280820069500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass975280820071300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975280820069500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975280820071300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields975280821058300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields975280821058300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass975280821059700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975280821058300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975280821059700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields975280821782300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields975280821782300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass975280821783700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975280821782300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975280821783700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

