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
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;

import java.util.Date;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class X5455_ExtendedTimestampTest {

    @Test
    public void testHeaderId() {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        assertEquals(new ZipShort(0x5455), extra.getHeaderId());
    }

    @Test
    public void testDefaultState() {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        assertEquals(0, extra.getFlags());
        assertFalse(extra.isBit0_modifyTimePresent());
        assertFalse(extra.isBit1_accessTimePresent());
        assertFalse(extra.isBit2_createTimePresent());
        assertNull(extra.getModifyTime());
        assertNull(extra.getAccessTime());
        assertNull(extra.getCreateTime());
        assertNull(extra.getModifyJavaTime());
        assertNull(extra.getAccessJavaTime());
        assertNull(extra.getCreateJavaTime());
        assertEquals(1, extra.getLocalFileDataLength().getValue());
        assertEquals(1, extra.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testSetFlagsAndBits() {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        // Set all 3 bits (binary: 00000111 = 7)
        extra.setFlags((byte) 7);
        assertEquals(7, extra.getFlags());
        assertTrue(extra.isBit0_modifyTimePresent());
        assertTrue(extra.isBit1_accessTimePresent());
        assertTrue(extra.isBit2_createTimePresent());

        // Set flags with only bit 1
        extra.setFlags(X5455_ExtendedTimestamp.ACCESS_TIME_BIT);
        assertFalse(extra.isBit0_modifyTimePresent());
        assertTrue(extra.isBit1_accessTimePresent());
        assertFalse(extra.isBit2_createTimePresent());
    }

    @Test
    public void testTimestampsAndDecoupledFlags() {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        ZipLong time = new ZipLong(123456789L);

        extra.setModifyTime(time);
        assertTrue(extra.isBit0_modifyTimePresent());
        assertEquals(time, extra.getModifyTime());

        extra.setAccessTime(time);
        assertTrue(extra.isBit1_accessTimePresent());
        assertEquals(time, extra.getAccessTime());

        extra.setCreateTime(time);
        assertTrue(extra.isBit2_createTimePresent());
        assertEquals(time, extra.getCreateTime());

        // Test setting to null (should clear bits)
        extra.setModifyTime(null);
        assertFalse(extra.isBit0_modifyTimePresent());
        assertNull(extra.getModifyTime());

        extra.setAccessTime(null);
        assertFalse(extra.isBit1_accessTimePresent());
        assertNull(extra.getAccessTime());

        extra.setCreateTime(null);
        assertFalse(extra.isBit2_createTimePresent());
        assertNull(extra.getCreateTime());
    }

    @Test
    public void testJavaDateSettersAndGetters() {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        Date date = new Date(1000000000L); // milliseconds

        extra.setModifyJavaTime(date);
        extra.setAccessJavaTime(date);
        extra.setCreateJavaTime(date);

        assertNotNull(extra.getModifyJavaTime());
        assertNotNull(extra.getAccessJavaTime());
        assertNotNull(extra.getCreateJavaTime());

        // Test null dates
        extra.setModifyJavaTime(null);
        extra.setAccessJavaTime(null);
        extra.setCreateJavaTime(null);

        assertNull(extra.getModifyJavaTime());
        assertNull(extra.getAccessJavaTime());
        assertNull(extra.getCreateJavaTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimestampTooLargeForSigned32Bit() {
        // 0x100000000L is 2^32, which exceeds signed 32-bit integer limits in unixTimeToZipLong
        Date invalidDate = new Date(0x100000000L * 1000L);
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        extra.setModifyJavaTime(invalidDate);
    }

    @Test
    public void testLocalFileDataLengthAndDataEdgeCases() {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        ZipLong time = new ZipLong(1111);

        // Case 1: Only modify time present, but access/create flags true with null values
        extra.setFlags((byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT | 
                              X5455_ExtendedTimestamp.ACCESS_TIME_BIT | 
                              X5455_ExtendedTimestamp.CREATE_TIME_BIT));
        extra.setModifyTime(time);
        // accessTime and createTime are left as null
        
        // Length should only count 1 (flag byte) + 4 (modifyTime) because accessTime & createTime are null
        assertEquals(5, extra.getLocalFileDataLength().getValue());
        assertEquals(5, extra.getCentralDirectoryLength().getValue());

        byte[] localData = extra.getLocalFileDataData();
        assertEquals(5, localData.length);
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, localData[0]); // bit 1,2 flags might be set in byte but not written due to null check, wait: 
        // Let's check getLocalFileDataData logic: data[0] |= MODIFY_TIME_BIT happens inside if, but flags byte itself starts at 0.

        byte[] centralData = extra.getCentralDirectoryData();
        assertEquals(5, centralData.length);
    }

    @Test
    public void testLocalFileDataDataComplete() {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        ZipLong time = new ZipLong(500);
        extra.setModifyTime(time);
        extra.setAccessTime(time);
        extra.setCreateTime(time);

        // Length: 1 byte flag + 3 * 4 bytes = 13 bytes
        assertEquals(13, extra.getLocalFileDataLength().getValue());
        assertEquals(5, extra.getCentralDirectoryLength().getValue());

        byte[] localData = extra.getLocalFileDataData();
        assertEquals(13, localData.length);

        byte[] centralData = extra.getCentralDirectoryData();
        assertEquals(5, centralData.length);
    }

    @Test
    public void testParseFromLocalFileDataAndCentralDirectory() throws ZipException {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        // Construct raw data: flags = 7 (all present), modify=10, access=20, create=30
        byte[] data = new byte[] {
            (byte) 7,
            (byte) 10, 0, 0, 0,
            (byte) 20, 0, 0, 0,
            (byte) 30, 0, 0, 0
        };

        extra.parseFromLocalFileData(data, 0, data.length);
        assertTrue(extra.isBit0_modifyTimePresent());
        assertTrue(extra.isBit1_accessTimePresent());
        assertTrue(extra.isBit2_createTimePresent());
        assertEquals(10, extra.getModifyTime().getValue());
        assertEquals(20, extra.getAccessTime().getValue());
        assertEquals(30, extra.getCreateTime().getValue());

        // Test parsing central directory data (shorter data, e.g., only flags + modify)
        byte[] centralData = new byte[] {
            (byte) 7, // flags claim all 3, but length is only 5 (simulating central directory restriction)
            (byte) 99, 0, 0, 0
        };
        extra.parseFromCentralDirectoryData(centralData, 0, centralData.length);
        assertTrue(extra.isBit0_modifyTimePresent());
        assertTrue(extra.isBit1_accessTimePresent()); // flag is set
        assertTrue(extra.isBit2_createTimePresent()); // flag is set
        assertEquals(99, extra.getModifyTime().getValue());
        assertNull(extra.getAccessTime()); // truncated due to buffer length check (offset + 4 <= len)
        assertNull(extra.getCreateTime()); // truncated
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        extra.setModifyTime(new ZipLong(123));
        X5455_ExtendedTimestamp cloned = (X5455_ExtendedTimestamp) extra.clone();
        assertEquals(extra, cloned);
        assertNotSame(extra, cloned);
    }

    @Test
    public void testEqualsAndHashCode() {
        X5455_ExtendedTimestamp e1 = new X5455_ExtendedTimestamp();
        X5455_ExtendedTimestamp e2 = new X5455_ExtendedTimestamp();

        // 1. Reflexive and empty equality
        assertEquals(e1, e1);
        assertEquals(e1, e2);
        assertEquals(e1.hashCode(), e2.hashCode());

        // 2. Non-instance comparison
        assertNotEquals(e1, "some-string");
        assertNotEquals(e1, null);

        // 3. Modify time differences
        e1.setModifyTime(new ZipLong(100));
        assertNotEquals(e1, e2);

        e2.setModifyTime(new ZipLong(100));
        assertEquals(e1, e2);
        assertEquals(e1.hashCode(), e2.hashCode());

        // 4. Access time differences (exercises rotateLeft hashCode branch)
        e1.setAccessTime(new ZipLong(200));
        assertNotEquals(e1, e2);

        e2.setAccessTime(new ZipLong(200));
        assertEquals(e1, e2);
        assertEquals(e1.hashCode(), e2.hashCode());

        // 5. Create time differences (exercises rotateLeft hashCode branch)
        e1.setCreateTime(new ZipLong(300));
        assertNotEquals(e1, e2);

        e2.setCreateTime(new ZipLong(300));
        assertEquals(e1, e2);
        assertEquals(e1.hashCode(), e2.hashCode());
        
        // 6. Flags difference only (last 3 bits matter)
        e1.setFlags((byte) 1);
        e2.setFlags((byte) 2);
        // Clear times to isolate flag check if needed, or test combined
        e1.setModifyTime(null); e1.setAccessTime(null); e1.setCreateTime(null);
        e2.setModifyTime(null); e2.setAccessTime(null); e2.setCreateTime(null);
        e1.setFlags((byte) 1);
        e2.setFlags((byte) 2);
        assertNotEquals(e1, e2);
    }

    @Test
    public void testToStringRepresentation() {
        X5455_ExtendedTimestamp extra = new X5455_ExtendedTimestamp();
        assertNotNull(extra.toString());

        extra.setModifyTime(new ZipLong(12345));
        extra.setAccessTime(new ZipLong(12346));
        extra.setCreateTime(new ZipLong(12347));
        String str = extra.toString();
        assertTrue(str.contains("Modify:"));
        assertTrue(str.contains("Access:"));
        assertTrue(str.contains("Create:"));
    }
}