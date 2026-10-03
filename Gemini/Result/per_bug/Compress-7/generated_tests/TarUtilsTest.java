/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.compress.archivers.tar;

import junit.framework.TestCase;

/**
 * Comprehensive JUnit 4 (JUnit 3 compatible runner for Defects4J env) test suite 
 * for TarUtils targeting high branch/condition coverage and edge cases.
 */
public class TarUtilsTest extends TestCase {

    public TarUtilsTest(String name) {
        super(name);
    }

    // --- parseOctal Tests ---

    public void testParseOctalNormal() {
        byte[] buffer = "0000755 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(493L, result); // 755 in octal = 493 in decimal
    }

    public void testParseOctalLeadingSpacesAndZeros() {
        byte[] buffer = "  0123 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83L, result); // 123 in octal = 83 in decimal
    }

    public void testParseOctalWithNullByte() {
        byte[] buffer = new byte[] { '0', '1', '2', 0, '3', '4' };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(10L, result); // Stops at NUL ('012' = 10)
    }

    public void testParseOctalOnlySpaces() {
        byte[] buffer = "   ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    public void testParseOctalInvalidDigit8() {
        byte[] buffer = "0128".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException for invalid octal digit '8'");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid octal digit"));
        }
    }

    public void testParseOctalInvalidAlpha() {
        byte[] buffer = "012A".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException for non-octal character");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid octal digit"));
        }
    }

    // --- parseName Tests ---

    public void testParseNameNormal() {
        byte[] buffer = "testfile.txt\0\0".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("testfile.txt", name);
    }

    public void testParseNameNoNullByte() {
        byte[] buffer = "abcdefg".getBytes();
        String name = TarUtils.parseName(buffer, 0, 4);
        assertEquals("abcd", name);
    }

    public void testParseNameEmpty() {
        byte[] buffer = new byte[] { 0, 0, 0 };
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("", name);
    }

    // --- formatNameBytes Tests ---

    public void testFormatNameBytesShortName() {
        byte[] buf = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("foo", buf, 2, 5);
        assertEquals(7, nextOffset);
        assertEquals('f', buf[2]);
        assertEquals('o', buf[3]);
        assertEquals('o', buf[4]);
        assertEquals(0, buf[5]);
        assertEquals(0, buf[6]);
    }

    public void testFormatNameBytesLongNameTruncation() {
        byte[] buf = new byte[4];
        int nextOffset = TarUtils.formatNameBytes("toolong", buf, 0, 4);
        assertEquals(4, nextOffset);
        assertEquals("tool", new String(buf));
    }

    // --- formatUnsignedOctalString Tests ---

    public void testFormatUnsignedOctalStringZero() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertEquals("0000", new String(buf));
    }

    public void testFormatUnsignedOctalStringNormal() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(123L, buf, 0, 6);
        assertEquals("000173", new String(buf)); // 123 decimal = 173 octal
    }

    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buf = new byte[2];
        try {
            TarUtils.formatUnsignedOctalString(512L, buf, 0, 2); // 512 = 1000 octal (too large for 2 chars)
            fail("Expected IllegalArgumentException due to buffer overflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit in octal number buffer"));
        }
    }

    // --- formatOctalBytes / formatLongOctalBytes / formatCheckSumOctalBytes Tests ---

    public void testFormatOctalBytes() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatOctalBytes(100L, buf, 0, 8);
        assertEquals(8, offset);
        // length 8 -> idx = 6. Octal 100 is "144". Format: [0,0,0,1,4,4, ' ', \0]
        assertEquals(' ', buf[6]);
        assertEquals(0, buf[7]);
    }

    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatLongOctalBytes(100L, buf, 0, 8);
        assertEquals(8, offset);
        // length 8 -> idx = 7. Format: [0,0,0,0,1,4,4, ' ']
        assertEquals(' ', buf[7]);
    }

    public void testFormatCheckSumOctalBytes() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatCheckSumOctalBytes(100L, buf, 0, 8);
        assertEquals(8, offset);
        // length 8 -> idx = 6. Format: [0,0,0,1,4,4, \0, ' ']
        assertEquals(0, buf[6]);
        assertEquals(' ', buf[7]);
    }

    // --- computeCheckSum Tests ---

    public void testComputeCheckSum() {
        byte[] buf = new byte[] { 1, 2, 3, (byte) 255 };
        long sum = TarUtils.computeCheckSum(buf);
        // 1 + 2 + 3 + 255 = 261
        assertEquals(261L, sum);
    }
}