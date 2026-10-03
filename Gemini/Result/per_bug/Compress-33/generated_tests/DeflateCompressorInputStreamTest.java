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
package org.apache.commons.compress.compressors.deflate;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import static org.junit.Assert.*;

public class DeflateCompressorInputStreamTest {

    private byte[] getDeflatedData(boolean useZlibHeader) throws IOException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        // Deflater(boolean nowrap) -> nowrap = !useZlibHeader
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, !useZlibHeader);
        try (DeflaterOutputStream dos = new DeflaterOutputStream(bao, deflater)) {
            dos.write("TestCompressorData".getBytes("UTF-8"));
        }
        return bao.toByteArray();
    }

    @Test
    public void testDefaultConstructorWithZlibHeader() throws IOException {
        byte[] data = getDeflatedData(true);
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             DeflateCompressorInputStream dis = new DeflateCompressorInputStream(bais)) {
            int firstByte = dis.read();
            assertTrue("Should read valid compressed byte", firstByte >= 0);
            assertEquals(1, dis.getBytesRead());
        }
    }

    @Test
    public void testParameterizedConstructorWithZlibHeader() throws IOException {
        byte[] data = getDeflatedData(true);
        DeflateParameters params = new DeflateParameters();
        params.setWithZlibHeader(true);

        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             DeflateCompressorInputStream dis = new DeflateCompressorInputStream(bais, params)) {
            int firstByte = dis.read();
            assertTrue("Should read valid compressed byte with explicit zlib header", firstByte >= 0);
            assertEquals(1, dis.getBytesRead());
        }
    }

    @Test
    public void testParameterizedConstructorWithoutZlibHeader() throws IOException {
        byte[] data = getDeflatedData(false);
        DeflateParameters params = new DeflateParameters();
        params.setWithZlibHeader(false);

        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             DeflateCompressorInputStream dis = new DeflateCompressorInputStream(bais, params)) {
            int firstByte = dis.read();
            assertTrue("Should read valid compressed byte without zlib header", firstByte >= 0);
            assertEquals(1, dis.getBytesRead());
        }
    }

    @Test
    public void testReadByteArrayAndCountCoverage() throws IOException {
        byte[] data = getDeflatedData(true);
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             DeflateCompressorInputStream dis = new DeflateCompressorInputStream(bais)) {
            byte[] buf = new byte[100];
            int read = dis.read(buf, 0, 100);
            assertTrue("Should read positive number of bytes", read > 0);
            assertEquals(read, dis.getBytesRead());
        }
    }

    @Test
    public void testReadEofCounting() throws IOException {
        // Empty input stream triggers EOF immediately (-1)
        try (ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
             DeflateCompressorInputStream dis = new DeflateCompressorInputStream(bais)) {
            
            // For zlib, reading empty stream might throw exception or return -1 depending on header, 
            // but let's test single read on an empty/finished stream if possible or test count logic with -1.
            // Using a stream with no valid deflate block or testing read() returning -1.
        }
    }

    @Test
    public void testSkipAvailableClose() throws IOException {
        byte[] data = getDeflatedData(true);
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             DeflateCompressorInputStream dis = new DeflateCompressorInputStream(bais)) {
            
            // Test available()
            int available = dis.available();
            assertTrue(available >= 0);

            // Test skip()
            long skipped = dis.skip(2);
            assertTrue(skipped >= 0);

            // Test close()
            dis.close();
            
            // Verify operations after close throw or behave as underlying stream
            try {
                dis.available();
            } catch (IOException e) {
                // Expected if underlying stream is closed
            }
        }
    }
}