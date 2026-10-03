package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class SimpleAbstractTypeResolverTest {

    // --- Tests for addMapping ---

    @Test(expected = IllegalArgumentException.class)
    public void testAddMapping_SameClassThrowsException() {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        // Edge Case: superType และ subType เป็นคลาสเดียวกัน
        resolver.addMapping(List.class, (Class) List.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMapping_NotSubclassThrowsException() {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        // Edge Case: subType ไม่ใช่ Subclass ของ superType (Collection ไม่ใช่ Subtype ของ List)
        resolver.addMapping(List.class, (Class) Collection.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMapping_SuperTypeNotAbstractThrowsException() {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        // Edge Case: superType (ArrayList) ไม่ใช่ Abstract class
        resolver.addMapping((Class) ArrayList.class, LinkedList.class);
    }

    @Test
    public void testAddMapping_SuccessAndChaining() {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        // Happy Path: superType เป็น Abstract (Collection) และ subType เป็น Subclass ที่ถูกต้อง (LinkedList)
        SimpleAbstractTypeResolver chained = resolver.addMapping(Collection.class, LinkedList.class);
        
        assertSame("Method chaining should return the same instance", resolver, chained);
    }

    // --- Tests for findTypeMapping ---

    @Test
    public void testFindTypeMapping_NotFound() {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        JavaType type = typeFactory.constructType(List.class);

        // ค้นหาประเภทที่ยังไม่ได้ลงทะเบียนแมปไว้ ต้องได้ null
        JavaType result = resolver.findTypeMapping(null, type);
        assertNull(result);
    }

    @Test
    public void testFindTypeMapping_Success() {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(Collection.class, LinkedList.class);

        TypeFactory typeFactory = TypeFactory.defaultInstance();
        JavaType type = typeFactory.constructType(Collection.class);

        // ค้นหาประเภทที่ลงทะเบียนไว้ ต้องได้ JavaType ที่แคบลงเป็น LinkedList
        JavaType result = resolver.findTypeMapping(null, type);
        assertNotNull(result);
        assertEquals(LinkedList.class, result.getRawClass());
    }

    // --- Tests for resolveAbstractType ---

    @Test
    public void testResolveAbstractType_AlwaysNull() {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        JavaType type = typeFactory.constructType(Collection.class);

        // resolveAbstractType ควรคืนค่า null เสมอตามข้อกำหนด
        JavaType result = resolver.resolveAbstractType(null, type);
        assertNull(result);
    }
}