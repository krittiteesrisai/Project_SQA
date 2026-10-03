package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnsafeAllocatorTest {

    // Dummy class สำหรับทดสอบการสร้างอินสแตนซ์
    public static class SampleClass {
        public boolean constructorCalled = false;
        public SampleClass() {
            this.constructorCalled = true;
        }
    }

    @Test
    public void testCreateAndGetInstance() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        assertNotNull("Allocator should not be null", allocator);

        // ทดสอบว่า newInstance สามารถสร้างอ็อบเจกต์ได้โดยไม่เรียก Constructor ปกติ
        SampleClass instance = allocator.newInstance(SampleClass.class);
        assertNotNull("Instantiated object should not be null", instance);
        assertFalse("Constructor should NOT be invoked by UnsafeAllocator", instance.constructorCalled);
    }

    @Test(expected = Exception.class)
    public void testNewInstanceWithNullClass() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        assertNotNull(allocator);
        // การส่ง null ควรทำให้เกิด Exception (เช่น NullPointerException จาก reflection)
        allocator.newInstance(null);
    }

    @Test
    public void testMultipleCreations() {
        // ตรวจสอบความเสถียรของการเรียก create() ซ้ำๆ
        UnsafeAllocator allocator1 = UnsafeAllocator.create();
        UnsafeAllocator allocator2 = UnsafeAllocator.create();
        assertNotNull(allocator1);
        assertNotNull(allocator2);
    }
}