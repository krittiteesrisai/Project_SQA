package org.apache.commons.lang;

import org.junit.Test;
import org.apache.commons.lang.Entities.LookupEntityMap;
import org.apache.commons.lang.Entities.EntityMap;
import org.apache.commons.lang.Entities.PrimitiveEntityMap;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.io.Writer;
import java.io.IOException;
import java.io.FileWriter;
import java.io.StringWriter;
import java.io.BufferedWriter;
import java.nio.ReadOnlyBufferException;
import org.apache.commons.lang.Entities.ArrayEntityMap;
import java.util.LinkedHashMap;
import org.apache.commons.lang.Entities.BinaryEntityMap;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_lang_EntitiesTest {
    ///region Test suites for executable org.apache.commons.lang.Entities.entityName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method entityName(int)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.returnsFrom {@code return map.name(value);}
 *  */
    @Test
    public void testEntityName_ReturnMapName_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        java.lang.String[] lookupTable = {null};
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable", lookupTable);
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 1);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        String actual = entities.entityName(0);
        
        assertNull(actual);
        
        Entities.EntityMap entityMap = entities.map;
        java.lang.String[] entityMapMapLookupTable = ((java.lang.String[]) getFieldValue(entityMap, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable0 = ((String) get(entityMapMapLookupTable, 0));
        
        assertNull(finalEntitiesMapLookupTable0);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.returnsFrom {@code return map.name(value);}
 *  */
    @Test
    public void testEntityName_ReturnMapName() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", -254);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        String actual = entities.entityName(-254);
        
        assertNull(actual);
        
        Entities.EntityMap entityMap = entities.map;
        IntHashMap entityMapMapMapValueToName = ((IntHashMap) getFieldValue(entityMap, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMapMapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMapMapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable0 = get(entityMapMapMapValueToNameMapMapValueToNameTable, 0);
        
        assertNull(finalEntitiesMapMapValueToNameTable0);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.returnsFrom {@code return map.name(value);}
 *  */
    @Test
    public void testEntityName_ReturnMapName_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        String actual = entities.entityName(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.returnsFrom {@code return map.name(value);}
 *  */
    @Test
    public void testEntityName_ReturnMapName_3() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 30);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 5);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", -354596831);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        String actual = entities.entityName(30);
        
        assertNull(actual);
        
        Entities.EntityMap entityMap = entities.map;
        IntHashMap entityMapMapMapValueToName = ((IntHashMap) getFieldValue(entityMap, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMapMapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMapMapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable1 = get(entityMapMapMapValueToNameMapMapValueToNameTable, 1);
        Entities.EntityMap entityMap1 = entities.map;
        IntHashMap entityMap1MapMapValueToName = ((IntHashMap) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap1MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap1MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable2 = get(entityMap1MapMapValueToNameMapMapValueToNameTable, 2);
        Entities.EntityMap entityMap2 = entities.map;
        IntHashMap entityMap2MapMapValueToName = ((IntHashMap) getFieldValue(entityMap2, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap2MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap2MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable3 = get(entityMap2MapMapValueToNameMapMapValueToNameTable, 3);
        Entities.EntityMap entityMap3 = entities.map;
        IntHashMap entityMap3MapMapValueToName = ((IntHashMap) getFieldValue(entityMap3, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap3MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap3MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable4 = get(entityMap3MapMapValueToNameMapMapValueToNameTable, 4);
        
        assertNull(finalEntitiesMapMapValueToNameTable1);
        
        assertNull(finalEntitiesMapMapValueToNameTable2);
        
        assertNull(finalEntitiesMapMapValueToNameTable3);
        
        assertNull(finalEntitiesMapMapValueToNameTable4);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method entityName(int)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return map.name(value);
 *  */
    @Test
    public void testEntityName_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        java.lang.String[] lookupTable = {null, null};
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable", lookupTable);
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 128);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 2]
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:534)
            org.apache.commons.lang.Entities.entityName(Entities.java:766) */
        entities.entityName(127);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testEntityName_ThrowArithmeticException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", -200);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.get(IntHashMap.java:239)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:457)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:536)
            org.apache.commons.lang.Entities.entityName(Entities.java:766) */
        entities.entityName(-200);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return map.name(value);
 *  */
    @Test
    public void testEntityName_ThrowClassCastException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", -256);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", -256);
        int[] value = {};
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:457)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:536)
            org.apache.commons.lang.Entities.entityName(Entities.java:766) */
        entities.entityName(-256);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testEntityName_ThrowNegativeArraySizeException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", -128);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.NegativeArraySizeException: -128]
            org.apache.commons.lang.Entities$LookupEntityMap.createLookupTable(Entities.java:559)
            org.apache.commons.lang.Entities$LookupEntityMap.lookupTable(Entities.java:548)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:534)
            org.apache.commons.lang.Entities.entityName(Entities.java:766) */
        entities.entityName(-129);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return map.name(value);
 *  */
    @Test
    public void testEntityName_ThrowArithmeticException_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.get(IntHashMap.java:239)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:457)
            org.apache.commons.lang.Entities.entityName(Entities.java:766) */
        entities.entityName(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testEntityName_ThrowArithmeticException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 1);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.get(IntHashMap.java:239)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:457)
            org.apache.commons.lang.Entities$LookupEntityMap.createLookupTable(Entities.java:561)
            org.apache.commons.lang.Entities$LookupEntityMap.lookupTable(Entities.java:548)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:534)
            org.apache.commons.lang.Entities.entityName(Entities.java:766) */
        entities.entityName(0);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return map.name(value);
 *  */
    @Test
    public void testEntityName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 1);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 4);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 1);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:534)
            org.apache.commons.lang.Entities.entityName(Entities.java:766) */
        entities.entityName(Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return map.name(value);
 *  */
    @Test
    public void testEntityName_ThrowNullPointerException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.entityName(Entities.java:766) */
        entities.entityName(-255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method entityName(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.Entities}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityName(int)}
     */
    @Test
    public void testEntityName() {
        Entities entities = new Entities();
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        entities.map = map;
        
        String actual = entities.entityName(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method escape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testEscape_StringLength() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "";
        
        entities.escape(null, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method escape(java.io.Writer, java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#length()} once,
    ///     {@link java.lang.String#charAt(int)} once,
    ///     {@link org.apache.commons.lang.Entities#entityName(int)} once
    /// execute conditions:
    ///     {@code (entityName == null): True},
    ///     {@code (c > 0x7F): False}
    /// invoke:
    ///     {@link java.io.Writer#write(int)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 *  */
    @Test
    public void testEscape_IterateForLoop() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 32);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 4);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 65503);
        Object next = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(next, "org.apache.commons.lang.IntHashMap$Entry", "hash", 32);
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "next", next);
        table[0] = entry;
        Object entry1 = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        table[1] = entry1;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = " ";
        
        entities.escape(printWriter, string);
        
        Entities.EntityMap entityMap = entities.map;
        IntHashMap entityMapMapMapValueToName = ((IntHashMap) getFieldValue(entityMap, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMapMapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMapMapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable2 = get(entityMapMapMapValueToNameMapMapValueToNameTable, 2);
        Entities.EntityMap entityMap1 = entities.map;
        IntHashMap entityMap1MapMapValueToName = ((IntHashMap) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap1MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap1MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable3 = get(entityMap1MapMapValueToNameMapMapValueToNameTable, 3);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertNull(finalEntitiesMapMapValueToNameTable2);
        
        assertNull(finalEntitiesMapMapValueToNameTable3);
        
        assertTrue(finalPrintWriterTrouble);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 *  */
    @Test
    public void testEscape_IterateForLoop_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 64);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 64);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock1);
        String string = "@";
        
        entities.escape(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 *  */
    @Test
    public void testEscape_IterateForLoop_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 127);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 2);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "";
        
        entities.escape(printWriter, string);
        
        Entities.EntityMap entityMap = entities.map;
        IntHashMap entityMapMapMapValueToName = ((IntHashMap) getFieldValue(entityMap, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMapMapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMapMapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable0 = get(entityMapMapMapValueToNameMapMapValueToNameTable, 0);
        Entities.EntityMap entityMap1 = entities.map;
        IntHashMap entityMap1MapMapValueToName = ((IntHashMap) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap1MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap1MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable1 = get(entityMap1MapMapValueToNameMapMapValueToNameTable, 1);
        
        Writer printWriterOut = ((Writer) getFieldValue(printWriter, "java.io.PrintWriter", "out"));
        boolean finalPrintWriterOutTrouble = ((Boolean) getFieldValue(printWriterOut, "java.io.PrintWriter", "trouble"));
        
        assertNull(finalEntitiesMapMapValueToNameTable0);
        
        assertNull(finalEntitiesMapMapValueToNameTable1);
        
        assertTrue(finalPrintWriterOutTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String entityName = this.entityName(c);
 *  */
    @Test
    public void testEscape_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        java.lang.String[] lookupTable = {null, null};
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable", lookupTable);
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 64);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "?";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 63 out of bounds for length 2]
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:534)
            org.apache.commons.lang.Entities.entityName(Entities.java:766)
            org.apache.commons.lang.Entities.escape(Entities.java:829) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String entityName = this.entityName(c);
 *  */
    @Test
    public void testEscape_ThrowClassCastException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 37);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 37);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 37);
        byte[] value = {};
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "%";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:457)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:536)
            org.apache.commons.lang.Entities.entityName(Entities.java:766)
            org.apache.commons.lang.Entities.escape(Entities.java:829) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: String entityName = this.entityName(c);
 *  */
    @Test
    public void testEscape_ThrowArithmeticException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 34);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "\"";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.get(IntHashMap.java:239)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:457)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:536)
            org.apache.commons.lang.Entities.entityName(Entities.java:766)
            org.apache.commons.lang.Entities.escape(Entities.java:829) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: String entityName = this.entityName(c);
 *  */
    @Test
    public void testEscape_ThrowArithmeticException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 1);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.get(IntHashMap.java:239)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:457)
            org.apache.commons.lang.Entities$LookupEntityMap.createLookupTable(Entities.java:561)
            org.apache.commons.lang.Entities$LookupEntityMap.lookupTable(Entities.java:548)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:534)
            org.apache.commons.lang.Entities.entityName(Entities.java:766)
            org.apache.commons.lang.Entities.escape(Entities.java:829) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = str.length();
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:826) */
        entities.escape(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write('&');
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_5() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        java.lang.String[] lookupTable = new java.lang.String[9];
        String string = "";
        lookupTable[0] = string;
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable", lookupTable);
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 8);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string1 = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:839) */
        entities.escape(null, string1);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write(c);
 *  */
    @Test
    public void testEscape_ThrowNullPointerException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 2);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:836) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write('&');
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 32);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 4);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 32);
        String value = "";
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:839) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write(c);
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_3() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 64);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 64);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "@";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:836) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write("&#");
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_4() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 4096);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        Object next = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(next, "org.apache.commons.lang.IntHashMap$Entry", "hash", 4096);
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "next", next);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "\u1000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:832) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write('&');
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_6() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 1);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 3);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        String value = "";
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:839) */
        entities.escape(null, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method escape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: writer.write("&#");
 *  */
    @Test(expected = IOException.class)
    public void testEscape_ThrowIOException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 128);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        setField(anonymousWriter, "java.io.Writer$1", "closed", true);
        String string = "\u0080";
        
        entities.escape(anonymousWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: writer.write('&');
 *  */
    @Test(expected = IOException.class)
    public void testEscape_ThrowIOException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        java.lang.String[] lookupTable = new java.lang.String[9];
        String string = "";
        lookupTable[0] = string;
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable", lookupTable);
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 8);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string1 = "\u0000";
        
        entities.escape(fileWriter, string1);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: writer.write(c);
 *  */
    @Test(expected = IOException.class)
    public void testEscape_ThrowIOException_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 127);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "";
        
        entities.escape(fileWriter, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.escape
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.invokes org.apache.commons.lang.Entities#createStringWriter(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StringWriter stringWriter = createStringWriter(str);
 *  */
    @Test
    public void testEscape_ThrowNullPointerException1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.createStringWriter(Entities.java:884)
            org.apache.commons.lang.Entities.escape(Entities.java:797) */
        entities.escape(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.Entities}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
     */
    @Test
    public void testEscapeWithNonEmptyString() {
        Entities entities = new Entities();
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        entities.map = map;
        
        String actual = entities.escape("10");
        
        String expected = "10";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.unescape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescape_FirstAmpLessThanZero() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(stringWriter, "java.io.StringWriter", "buf", buf);
        String string = " ";
        
        entities.unescape(stringWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): False}
 * @utbot.invokes org.apache.commons.lang.Entities#doUnescape(java.io.Writer,java.lang.String,int)
 *  */
    @Test
    public void testUnescape_FirstAmpGreaterOrEqualZero() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "&";
        
        entities.unescape(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescape_FirstAmpLessThanZero_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = " ";
        
        entities.unescape(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): True}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write(str);
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.unescape(Entities.java:907) */
        entities.unescape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int firstAmp = str.indexOf('&');
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.unescape(Entities.java:905) */
        entities.unescape(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doUnescape(writer, str, firstAmp);
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException_3() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "&";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.doUnescape(Entities.java:928)
            org.apache.commons.lang.Entities.unescape(Entities.java:910) */
        entities.unescape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): True}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return;
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            org.apache.commons.lang.Entities.unescape(Entities.java:907) */
        entities.unescape(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doUnescape(writer, str, firstAmp);
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException_4() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        String string = "  &";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:223)
            org.apache.commons.lang.Entities.doUnescape(Entities.java:928)
            org.apache.commons.lang.Entities.unescape(Entities.java:910) */
        entities.unescape(bufferedWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method unescape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): False}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes org.apache.commons.lang.Entities#doUnescape(java.io.Writer,java.lang.String,int)
 * @utbot.throwsException {@link java.io.IOException} in: doUnescape(writer, str, firstAmp);
 *  */
    @Test(expected = IOException.class)
    public void testUnescape_ThrowIOException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " &";
        
        entities.unescape(fileWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: doUnescape(writer, str, firstAmp);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testUnescape_ThrowReadOnlyBufferException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " &";
        
        entities.unescape(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: doUnescape(writer, str, firstAmp);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testUnescape_ThrowReadOnlyBufferException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " &";
        
        entities.unescape(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: doUnescape(writer, str, firstAmp);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUnescape_ThrowIllegalStateException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " &";
        
        entities.unescape(fileWriter, string);
    }
    ///endregion
    
    ///region Errors report for unescape
    
    public void testUnescape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.unescape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testUnescape_FirstAmpLessThanZero1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = " ";
        
        String actual = entities.unescape(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): False}
 * @utbot.invokes org.apache.commons.lang.Entities#createStringWriter(java.lang.String)
 * @utbot.invokes org.apache.commons.lang.Entities#doUnescape(java.io.Writer,java.lang.String,int)
 * @utbot.invokes {@link java.io.StringWriter#toString()}
 * @utbot.returnsFrom {@code return stringWriter.toString();}
 *  */
    @Test
    public void testUnescape_FirstAmpGreaterOrEqualZero1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "         &";
        
        String actual = entities.unescape(string);
        
        String expected = "         &";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int firstAmp = str.indexOf('&');
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.unescape(Entities.java:861) */
        entities.unescape(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.fillWithHtml40Entities
    
    ///region FUZZER: ERROR SUITE for method fillWithHtml40Entities(org.apache.commons.lang.Entities)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.Entities}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#fillWithHtml40Entities(org.apache.commons.lang.Entities)}
     */
    @Test
    public void testFillWithHtml40EntitiesThrowsNPE() {
        /* This test fails because method [org.apache.commons.lang.Entities.fillWithHtml40Entities] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.fillWithHtml40Entities(Entities.java:399) */
        Entities.fillWithHtml40Entities(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.addEntities
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addEntities([[Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntities(java.lang.String[][])}
 *  */
    @Test
    public void testAddEntities() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        java.lang.String[][] stringArray = {};
        
        entities.addEntities(stringArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEntities([[Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntities(java.lang.String[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < entityArray.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: addEntity(entityArray[i][0], Integer.parseInt(entityArray[i][1]));
 *  */
    @Test
    public void testAddEntities_ThrowNumberFormatException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        java.lang.String[][] stringArray = new java.lang.String[1][];
        java.lang.String[] stringArray1 = new java.lang.String[2];
        String string = "";
        stringArray1[1] = string;
        stringArray[0] = stringArray1;
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntities] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:678)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang.Entities.addEntities(Entities.java:738) */
        entities.addEntities(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntities(java.lang.String[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < entityArray.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addEntity(entityArray[i][0], Integer.parseInt(entityArray[i][1]));
 *  */
    @Test
    public void testAddEntities_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        java.lang.String[][] stringArray = new java.lang.String[1][];
        java.lang.String[] stringArray1 = {};
        stringArray[0] = stringArray1;
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntities] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.Entities.addEntities(Entities.java:738) */
        entities.addEntities(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntities(java.lang.String[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < entityArray.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addEntity(entityArray[i][0], Integer.parseInt(entityArray[i][1]));
 *  */
    @Test
    public void testAddEntities_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        java.lang.String[][] stringArray = new java.lang.String[1][];
        java.lang.String[] stringArray1 = {null};
        stringArray[0] = stringArray1;
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntities] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang.Entities.addEntities(Entities.java:738) */
        entities.addEntities(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntities(java.lang.String[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < entityArray.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addEntity(entityArray[i][0], Integer.parseInt(entityArray[i][1]));
 *  */
    @Test
    public void testAddEntities_ThrowNullPointerException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        java.lang.String[][] stringArray = {null};
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntities] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.addEntities(Entities.java:738) */
        entities.addEntities(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntities(java.lang.String[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < entityArray.length; ++i)
 *  */
    @Test
    public void testAddEntities_ThrowNullPointerException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntities] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.addEntities(Entities.java:737) */
        entities.addEntities(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addEntities([[Ljava.lang.String;)
    
    @Test
    public void testAddEntities1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        java.lang.String[][] stringArray = new java.lang.String[9][];
        java.lang.String[] stringArray1 = {null, null, null, null, null, null, null, null, null, null};
        stringArray[0] = stringArray1;
        stringArray[1] = ((java.lang.String[]) null);
        stringArray[2] = ((java.lang.String[]) null);
        stringArray[3] = ((java.lang.String[]) null);
        stringArray[4] = ((java.lang.String[]) null);
        stringArray[5] = ((java.lang.String[]) null);
        stringArray[6] = ((java.lang.String[]) null);
        stringArray[7] = ((java.lang.String[]) null);
        stringArray[8] = ((java.lang.String[]) null);
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntities] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Integer.parseInt(Integer.java:630)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang.Entities.addEntities(Entities.java:738) */
        entities.addEntities(stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.entityValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method entityValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityValue(java.lang.String)}
 * @utbot.returnsFrom {@code return map.value(name);}
 *  */
    @Test
    public void testEntityValue_ReturnMapValue_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.ArrayEntityMap map = ((Entities.ArrayEntityMap) createInstance("org.apache.commons.lang.Entities$ArrayEntityMap"));
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        int actual = entities.entityValue(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityValue(java.lang.String)}
 * @utbot.returnsFrom {@code return map.value(name);}
 *  */
    @Test
    public void testEntityValue_ReturnMapValue_3() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.ArrayEntityMap map = ((Entities.ArrayEntityMap) createInstance("org.apache.commons.lang.Entities$ArrayEntityMap"));
        map.size = 1;
        java.lang.String[] names = new java.lang.String[1];
        String string = "";
        names[0] = string;
        map.names = names;
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        int actual = entities.entityValue(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityValue(java.lang.String)}
 * @utbot.returnsFrom {@code return map.value(name);}
 *  */
    @Test
    public void testEntityValue_ReturnMapValue() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "";
        
        int actual = entities.entityValue(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityValue(java.lang.String)}
 * @utbot.returnsFrom {@code return map.value(name);}
 *  */
    @Test
    public void testEntityValue_ReturnMapValue_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.ArrayEntityMap map = ((Entities.ArrayEntityMap) createInstance("org.apache.commons.lang.Entities$ArrayEntityMap"));
        map.size = 1;
        java.lang.String[] names = new java.lang.String[1];
        String string = "";
        names[0] = string;
        map.names = names;
        int[] values = {0};
        map.values = values;
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        int actual = entities.entityValue(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityValue(java.lang.String)}
 * @utbot.returnsFrom {@code return map.value(name);}
 *  */
    @Test
    public void testEntityValue_ReturnMapValue_4() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        Integer integer = 0;
        mapNameToValue.put(null, integer);
        Character character = '\u0000';
        mapNameToValue.put(character, integer);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        int actual = entities.entityValue(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method entityValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return map.value(name);
 *  */
    @Test
    public void testEntityValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.ArrayEntityMap map = ((Entities.ArrayEntityMap) createInstance("org.apache.commons.lang.Entities$ArrayEntityMap"));
        map.size = 1;
        java.lang.String[] names = {};
        map.names = names;
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.Entities$ArrayEntityMap.value(Entities.java:641)
            org.apache.commons.lang.Entities.entityValue(Entities.java:779) */
        entities.entityValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return map.value(name);
 *  */
    @Test
    public void testEntityValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.ArrayEntityMap map = ((Entities.ArrayEntityMap) createInstance("org.apache.commons.lang.Entities$ArrayEntityMap"));
        map.size = 1;
        java.lang.String[] names = new java.lang.String[1];
        String string = "";
        names[0] = string;
        map.names = names;
        int[] values = {};
        map.values = values;
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.Entities$ArrayEntityMap.value(Entities.java:642)
            org.apache.commons.lang.Entities.entityValue(Entities.java:779) */
        entities.entityValue(string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return map.value(name);
 *  */
    @Test
    public void testEntityValue_ThrowClassCastException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        mapNameToValue.put(null, object);
        Character character = '\u0000';
        mapNameToValue.put(character, object);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.value(Entities.java:468)
            org.apache.commons.lang.Entities.entityValue(Entities.java:779) */
        entities.entityValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#entityValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return map.value(name);
 *  */
    @Test
    public void testEntityValue_ThrowNullPointerException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityValue] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.entityValue(Entities.java:779) */
        entities.entityValue(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method entityValue(java.lang.String)
    
    @Test
    public void testEntityValue1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.ArrayEntityMap map = ((Entities.ArrayEntityMap) createInstance("org.apache.commons.lang.Entities$ArrayEntityMap"));
        map.size = 2;
        java.lang.String[] names = new java.lang.String[10];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        names[0] = string;
        names[1] = string;
        map.names = names;
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        int actual = entities.entityValue(string1);
        
        assertEquals(-1, actual);
        
        Entities.EntityMap entityMap = entities.map;
        java.lang.String[] entityMapMapNames = ((java.lang.String[]) getFieldValue(entityMap, "org.apache.commons.lang.Entities$ArrayEntityMap", "names"));
        String finalEntitiesMapNames2 = ((String) get(entityMapMapNames, 2));
        Entities.EntityMap entityMap1 = entities.map;
        java.lang.String[] entityMap1MapNames = ((java.lang.String[]) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$ArrayEntityMap", "names"));
        String finalEntitiesMapNames3 = ((String) get(entityMap1MapNames, 3));
        Entities.EntityMap entityMap2 = entities.map;
        java.lang.String[] entityMap2MapNames = ((java.lang.String[]) getFieldValue(entityMap2, "org.apache.commons.lang.Entities$ArrayEntityMap", "names"));
        String finalEntitiesMapNames4 = ((String) get(entityMap2MapNames, 4));
        Entities.EntityMap entityMap3 = entities.map;
        java.lang.String[] entityMap3MapNames = ((java.lang.String[]) getFieldValue(entityMap3, "org.apache.commons.lang.Entities$ArrayEntityMap", "names"));
        String finalEntitiesMapNames5 = ((String) get(entityMap3MapNames, 5));
        Entities.EntityMap entityMap4 = entities.map;
        java.lang.String[] entityMap4MapNames = ((java.lang.String[]) getFieldValue(entityMap4, "org.apache.commons.lang.Entities$ArrayEntityMap", "names"));
        String finalEntitiesMapNames6 = ((String) get(entityMap4MapNames, 6));
        Entities.EntityMap entityMap5 = entities.map;
        java.lang.String[] entityMap5MapNames = ((java.lang.String[]) getFieldValue(entityMap5, "org.apache.commons.lang.Entities$ArrayEntityMap", "names"));
        String finalEntitiesMapNames7 = ((String) get(entityMap5MapNames, 7));
        Entities.EntityMap entityMap6 = entities.map;
        java.lang.String[] entityMap6MapNames = ((java.lang.String[]) getFieldValue(entityMap6, "org.apache.commons.lang.Entities$ArrayEntityMap", "names"));
        String finalEntitiesMapNames8 = ((String) get(entityMap6MapNames, 8));
        Entities.EntityMap entityMap7 = entities.map;
        java.lang.String[] entityMap7MapNames = ((java.lang.String[]) getFieldValue(entityMap7, "org.apache.commons.lang.Entities$ArrayEntityMap", "names"));
        String finalEntitiesMapNames9 = ((String) get(entityMap7MapNames, 9));
        
        assertNull(finalEntitiesMapNames2);
        
        assertNull(finalEntitiesMapNames3);
        
        assertNull(finalEntitiesMapNames4);
        
        assertNull(finalEntitiesMapNames5);
        
        assertNull(finalEntitiesMapNames6);
        
        assertNull(finalEntitiesMapNames7);
        
        assertNull(finalEntitiesMapNames8);
        
        assertNull(finalEntitiesMapNames9);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method entityValue(java.lang.String)
    
    @Test
    public void testEntityValue2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.ArrayEntityMap map = ((Entities.ArrayEntityMap) createInstance("org.apache.commons.lang.Entities$ArrayEntityMap"));
        map.size = 1;
        java.lang.String[] names = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        names[0] = string;
        map.names = names;
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityValue] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities$ArrayEntityMap.value(Entities.java:642)
            org.apache.commons.lang.Entities.entityValue(Entities.java:779) */
        entities.entityValue(string1);
    }
    
    @Test
    public void testEntityValue3() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.BinaryEntityMap map = ((Entities.BinaryEntityMap) createInstance("org.apache.commons.lang.Entities$BinaryEntityMap"));
        map.size = 2;
        java.lang.String[] names = new java.lang.String[10];
        String string = "";
        names[0] = string;
        String string1 = "\u0000";
        names[1] = string1;
        map.names = names;
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string2 = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityValue] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities$ArrayEntityMap.value(Entities.java:642)
            org.apache.commons.lang.Entities.entityValue(Entities.java:779) */
        entities.entityValue(string2);
    }
    
    @Test
    public void testEntityValue4() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.BinaryEntityMap map = ((Entities.BinaryEntityMap) createInstance("org.apache.commons.lang.Entities$BinaryEntityMap"));
        map.size = 3;
        java.lang.String[] names = new java.lang.String[10];
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        names[0] = string;
        String string1 = "";
        names[1] = string1;
        map.names = names;
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string2 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityValue] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities$ArrayEntityMap.value(Entities.java:641)
            org.apache.commons.lang.Entities.entityValue(Entities.java:779) */
        entities.entityValue(string2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.addEntity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addEntity(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntity(java.lang.String,int)}
 *  */
    @Test
    public void testAddEntity() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 17);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 17);
        byte[][] value = {};
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        entities.addEntity(null, 17);
        
        Entities.EntityMap entityMap = entities.map;
        IntHashMap entityMapMapMapValueToName = ((IntHashMap) getFieldValue(entityMap, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMapMapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMapMapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object entityMapMapMapValueToNameMapMapValueToNameTableMapMapValueToNameTable0 = get(entityMapMapMapValueToNameMapMapValueToNameTable, 0);
        Object finalEntitiesMapMapValueToNameTable0Value = getFieldValue(entityMapMapMapValueToNameMapMapValueToNameTableMapMapValueToNameTable0, "org.apache.commons.lang.IntHashMap$Entry", "value");
        Entities.EntityMap entityMap1 = entities.map;
        IntHashMap entityMap1MapMapValueToName = ((IntHashMap) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap1MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap1MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable1 = get(entityMap1MapMapValueToNameMapMapValueToNameTable, 1);
        Entities.EntityMap entityMap2 = entities.map;
        IntHashMap entityMap2MapMapValueToName = ((IntHashMap) getFieldValue(entityMap2, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap2MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap2MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable2 = get(entityMap2MapMapValueToNameMapMapValueToNameTable, 2);
        Entities.EntityMap entityMap3 = entities.map;
        IntHashMap entityMap3MapMapValueToName = ((IntHashMap) getFieldValue(entityMap3, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap3MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap3MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable3 = get(entityMap3MapMapValueToNameMapMapValueToNameTable, 3);
        Entities.EntityMap entityMap4 = entities.map;
        IntHashMap entityMap4MapMapValueToName = ((IntHashMap) getFieldValue(entityMap4, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap4MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap4MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable4 = get(entityMap4MapMapValueToNameMapMapValueToNameTable, 4);
        Entities.EntityMap entityMap5 = entities.map;
        IntHashMap entityMap5MapMapValueToName = ((IntHashMap) getFieldValue(entityMap5, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap5MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap5MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable5 = get(entityMap5MapMapValueToNameMapMapValueToNameTable, 5);
        Entities.EntityMap entityMap6 = entities.map;
        IntHashMap entityMap6MapMapValueToName = ((IntHashMap) getFieldValue(entityMap6, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap6MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap6MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable6 = get(entityMap6MapMapValueToNameMapMapValueToNameTable, 6);
        Entities.EntityMap entityMap7 = entities.map;
        IntHashMap entityMap7MapMapValueToName = ((IntHashMap) getFieldValue(entityMap7, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap7MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap7MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable7 = get(entityMap7MapMapValueToNameMapMapValueToNameTable, 7);
        Entities.EntityMap entityMap8 = entities.map;
        IntHashMap entityMap8MapMapValueToName = ((IntHashMap) getFieldValue(entityMap8, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap8MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap8MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable8 = get(entityMap8MapMapValueToNameMapMapValueToNameTable, 8);
        Entities.EntityMap entityMap9 = entities.map;
        IntHashMap entityMap9MapMapValueToName = ((IntHashMap) getFieldValue(entityMap9, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap9MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap9MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable9 = get(entityMap9MapMapValueToNameMapMapValueToNameTable, 9);
        Entities.EntityMap entityMap10 = entities.map;
        IntHashMap entityMap10MapMapValueToName = ((IntHashMap) getFieldValue(entityMap10, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap10MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap10MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable10 = get(entityMap10MapMapValueToNameMapMapValueToNameTable, 10);
        Entities.EntityMap entityMap11 = entities.map;
        IntHashMap entityMap11MapMapValueToName = ((IntHashMap) getFieldValue(entityMap11, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap11MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap11MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable11 = get(entityMap11MapMapValueToNameMapMapValueToNameTable, 11);
        Entities.EntityMap entityMap12 = entities.map;
        IntHashMap entityMap12MapMapValueToName = ((IntHashMap) getFieldValue(entityMap12, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap12MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap12MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable12 = get(entityMap12MapMapValueToNameMapMapValueToNameTable, 12);
        Entities.EntityMap entityMap13 = entities.map;
        IntHashMap entityMap13MapMapValueToName = ((IntHashMap) getFieldValue(entityMap13, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap13MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap13MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable13 = get(entityMap13MapMapValueToNameMapMapValueToNameTable, 13);
        Entities.EntityMap entityMap14 = entities.map;
        IntHashMap entityMap14MapMapValueToName = ((IntHashMap) getFieldValue(entityMap14, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap14MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap14MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable14 = get(entityMap14MapMapValueToNameMapMapValueToNameTable, 14);
        Entities.EntityMap entityMap15 = entities.map;
        IntHashMap entityMap15MapMapValueToName = ((IntHashMap) getFieldValue(entityMap15, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap15MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap15MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable15 = get(entityMap15MapMapValueToNameMapMapValueToNameTable, 15);
        Entities.EntityMap entityMap16 = entities.map;
        IntHashMap entityMap16MapMapValueToName = ((IntHashMap) getFieldValue(entityMap16, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap16MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap16MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable16 = get(entityMap16MapMapValueToNameMapMapValueToNameTable, 16);
        
        assertNull(finalEntitiesMapMapValueToNameTable0Value);
        
        assertNull(finalEntitiesMapMapValueToNameTable1);
        
        assertNull(finalEntitiesMapMapValueToNameTable2);
        
        assertNull(finalEntitiesMapMapValueToNameTable3);
        
        assertNull(finalEntitiesMapMapValueToNameTable4);
        
        assertNull(finalEntitiesMapMapValueToNameTable5);
        
        assertNull(finalEntitiesMapMapValueToNameTable6);
        
        assertNull(finalEntitiesMapMapValueToNameTable7);
        
        assertNull(finalEntitiesMapMapValueToNameTable8);
        
        assertNull(finalEntitiesMapMapValueToNameTable9);
        
        assertNull(finalEntitiesMapMapValueToNameTable10);
        
        assertNull(finalEntitiesMapMapValueToNameTable11);
        
        assertNull(finalEntitiesMapMapValueToNameTable12);
        
        assertNull(finalEntitiesMapMapValueToNameTable13);
        
        assertNull(finalEntitiesMapMapValueToNameTable14);
        
        assertNull(finalEntitiesMapMapValueToNameTable15);
        
        assertNull(finalEntitiesMapMapValueToNameTable16);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntity(java.lang.String,int)}
 *  */
    @Test
    public void testAddEntity_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", -130);
        Object next = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(next, "org.apache.commons.lang.IntHashMap$Entry", "hash", 129);
        byte[] value = {};
        setField(next, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "next", next);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "";
        
        entities.addEntity(string, 129);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEntity(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntity(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.lang.Entities.EntityMap#add(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: map.add(name, value);
 *  */
    @Test
    public void testAddEntity_ThrowArithmeticException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntity] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.put(IntHashMap.java:298)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.add(Entities.java:450)
            org.apache.commons.lang.Entities.addEntity(Entities.java:753) */
        entities.addEntity(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntity(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: map.add(name, value);
 *  */
    @Test
    public void testAddEntity_ThrowNullPointerException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntity] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.addEntity(Entities.java:753) */
        entities.addEntity(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addEntity(java.lang.String, int)
    
    @Test
    public void testAddEntity1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "threshold", 1);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "";
        
        Entities.EntityMap entityMap = entities.map;
        IntHashMap entityMapMapMapValueToName = ((IntHashMap) getFieldValue(entityMap, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMapMapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMapMapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object initialEntitiesMapMapValueToNameTable0 = get(entityMapMapMapValueToNameMapMapValueToNameTable, 0);
        
        entities.addEntity(string, 0);
        
        Entities.EntityMap entityMap1 = entities.map;
        IntHashMap entityMap1MapMapValueToName = ((IntHashMap) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap1MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap1MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable0 = get(entityMap1MapMapValueToNameMapMapValueToNameTable, 0);
        Entities.EntityMap entityMap2 = entities.map;
        IntHashMap entityMap2MapMapValueToName = ((IntHashMap) getFieldValue(entityMap2, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        int finalEntitiesMapMapValueToNameCount = ((Integer) getFieldValue(entityMap2MapMapValueToName, "org.apache.commons.lang.IntHashMap", "count"));
        
        assertFalse(initialEntitiesMapMapValueToNameTable0 == finalEntitiesMapMapValueToNameTable0);
        
        assertEquals(1, finalEntitiesMapMapValueToNameCount);
    }
    
    @Test
    public void testAddEntity2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "threshold", 1);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        Entities.EntityMap entityMap = entities.map;
        IntHashMap entityMapMapMapValueToName = ((IntHashMap) getFieldValue(entityMap, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMapMapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMapMapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object initialEntitiesMapMapValueToNameTable0 = get(entityMapMapMapValueToNameMapMapValueToNameTable, 0);
        
        entities.addEntity(null, Integer.MIN_VALUE);
        
        Entities.EntityMap entityMap1 = entities.map;
        IntHashMap entityMap1MapMapValueToName = ((IntHashMap) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap1MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap1MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable0 = get(entityMap1MapMapValueToNameMapMapValueToNameTable, 0);
        Entities.EntityMap entityMap2 = entities.map;
        IntHashMap entityMap2MapMapValueToName = ((IntHashMap) getFieldValue(entityMap2, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        int finalEntitiesMapMapValueToNameCount = ((Integer) getFieldValue(entityMap2MapMapValueToName, "org.apache.commons.lang.IntHashMap", "count"));
        
        assertFalse(initialEntitiesMapMapValueToNameTable0 == finalEntitiesMapMapValueToNameTable0);
        
        assertEquals(1, finalEntitiesMapMapValueToNameCount);
    }
    
    @Test
    public void testAddEntity3() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "threshold", -2147483647);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "loadFactor", java.lang.Float.NaN);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        Entities.EntityMap entityMap = entities.map;
        IntHashMap entityMapMapMapValueToName = ((IntHashMap) getFieldValue(entityMap, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object initialEntitiesMapMapValueToNameTable = getFieldValue(entityMapMapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        
        entities.addEntity(null, 275742233);
        
        Entities.EntityMap entityMap1 = entities.map;
        IntHashMap entityMap1MapMapValueToName = ((IntHashMap) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object finalEntitiesMapMapValueToNameTable = getFieldValue(entityMap1MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Entities.EntityMap entityMap2 = entities.map;
        IntHashMap entityMap2MapMapValueToName = ((IntHashMap) getFieldValue(entityMap2, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        int finalEntitiesMapMapValueToNameCount = ((Integer) getFieldValue(entityMap2MapMapValueToName, "org.apache.commons.lang.IntHashMap", "count"));
        Entities.EntityMap entityMap3 = entities.map;
        IntHashMap entityMap3MapMapValueToName = ((IntHashMap) getFieldValue(entityMap3, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        int finalEntitiesMapMapValueToNameThreshold = ((Integer) getFieldValue(entityMap3MapMapValueToName, "org.apache.commons.lang.IntHashMap", "threshold"));
        
        assertFalse(initialEntitiesMapMapValueToNameTable == finalEntitiesMapMapValueToNameTable);
        
        assertEquals(1, finalEntitiesMapMapValueToNameCount);
        
        assertEquals(0, finalEntitiesMapMapValueToNameThreshold);
    }
    
    @Test
    public void testAddEntity4() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 10);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        table[9] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "threshold", -2147483647);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "loadFactor", java.lang.Float.NaN);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        Entities.EntityMap entityMap = entities.map;
        IntHashMap entityMapMapMapValueToName = ((IntHashMap) getFieldValue(entityMap, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object initialEntitiesMapMapValueToNameTable = getFieldValue(entityMapMapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        
        entities.addEntity(null, 75038088);
        
        Entities.EntityMap entityMap1 = entities.map;
        IntHashMap entityMap1MapMapValueToName = ((IntHashMap) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object finalEntitiesMapMapValueToNameTable = getFieldValue(entityMap1MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Entities.EntityMap entityMap2 = entities.map;
        IntHashMap entityMap2MapMapValueToName = ((IntHashMap) getFieldValue(entityMap2, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        int finalEntitiesMapMapValueToNameCount = ((Integer) getFieldValue(entityMap2MapMapValueToName, "org.apache.commons.lang.IntHashMap", "count"));
        Entities.EntityMap entityMap3 = entities.map;
        IntHashMap entityMap3MapMapValueToName = ((IntHashMap) getFieldValue(entityMap3, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        int finalEntitiesMapMapValueToNameThreshold = ((Integer) getFieldValue(entityMap3MapMapValueToName, "org.apache.commons.lang.IntHashMap", "threshold"));
        
        assertFalse(initialEntitiesMapMapValueToNameTable == finalEntitiesMapMapValueToNameTable);
        
        assertEquals(1, finalEntitiesMapMapValueToNameCount);
        
        assertEquals(0, finalEntitiesMapMapValueToNameThreshold);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addEntity(java.lang.String, int)
    
    @Test
    public void testAddEntity5() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        mapNameToValue.put(integer, object);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntity] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.add(Entities.java:450)
            org.apache.commons.lang.Entities.addEntity(Entities.java:753) */
        entities.addEntity(string, 0);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method addEntity(java.lang.String, int)
    
    @Test(timeout = 1000L)
    public void testAddEntity6() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 8);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        table[0] = entry;
        table[1] = entry;
        Object entry1 = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        table[2] = entry1;
        table[3] = entry;
        table[4] = entry;
        table[5] = entry;
        table[6] = entry;
        table[7] = entry1;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "threshold", -2147483647);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "loadFactor", java.lang.Float.NaN);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        entities.addEntity(string, 2);
    }
    
    @Test(timeout = 1000L)
    public void testAddEntity7() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 8);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        table[1] = entry;
        table[2] = entry;
        table[3] = entry;
        table[4] = entry;
        table[5] = entry;
        table[6] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "threshold", -2147483647);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "loadFactor", java.lang.Float.NaN);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        entities.addEntity(string, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.createStringWriter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createStringWriter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#createStringWriter(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return new StringWriter((int) (str.length() + (str.length() * 0.1)));}
 *  */
    @Test
    public void testCreateStringWriter_StringLength() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "";
        
        Class entitiesClazz = Class.forName("org.apache.commons.lang.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method createStringWriterMethod = entitiesClazz.getDeclaredMethod("createStringWriter", stringType);
        createStringWriterMethod.setAccessible(true);
        java.lang.Object[] createStringWriterMethodArguments = new java.lang.Object[1];
        createStringWriterMethodArguments[0] = string;
        StringWriter actual = ((StringWriter) createStringWriterMethod.invoke(entities, createStringWriterMethodArguments));
        
        StringWriter expected = ((StringWriter) createInstance("java.io.StringWriter"));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createStringWriter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#createStringWriter(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new StringWriter((int) (str.length() + (str.length() * 0.1)));
 *  */
    @Test
    public void testCreateStringWriter_ThrowNullPointerException() throws Throwable  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.createStringWriter] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.createStringWriter(Entities.java:884) */
        Class entitiesClazz = Class.forName("org.apache.commons.lang.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method createStringWriterMethod = entitiesClazz.getDeclaredMethod("createStringWriter", stringType);
        createStringWriterMethod.setAccessible(true);
        java.lang.Object[] createStringWriterMethodArguments = new java.lang.Object[1];
        createStringWriterMethodArguments[0] = ((Object) null);
        try {
            createStringWriterMethod.invoke(entities, createStringWriterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.doUnescape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doUnescape(java.io.Writer, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#doUnescape(java.io.Writer,java.lang.String,int)}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String,int,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testDoUnescape_StringLength() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "";
        
        Class entitiesClazz = Class.forName("org.apache.commons.lang.Entities");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method doUnescapeMethod = entitiesClazz.getDeclaredMethod("doUnescape", printWriterType, stringType, intType);
        doUnescapeMethod.setAccessible(true);
        java.lang.Object[] doUnescapeMethodArguments = new java.lang.Object[3];
        doUnescapeMethodArguments[0] = printWriter;
        doUnescapeMethodArguments[1] = string;
        doUnescapeMethodArguments[2] = 0;
        doUnescapeMethod.invoke(entities, doUnescapeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doUnescape(java.io.Writer, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#doUnescape(java.io.Writer,java.lang.String,int)}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write(str, 0, firstAmp);
 *  */
    @Test
    public void testDoUnescape_ThrowNullPointerException() throws Throwable  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.doUnescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.doUnescape(Entities.java:928) */
        Class entitiesClazz = Class.forName("org.apache.commons.lang.Entities");
        Class writerType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method doUnescapeMethod = entitiesClazz.getDeclaredMethod("doUnescape", writerType, stringType, intType);
        doUnescapeMethod.setAccessible(true);
        java.lang.Object[] doUnescapeMethodArguments = new java.lang.Object[3];
        doUnescapeMethodArguments[0] = ((Object) null);
        doUnescapeMethodArguments[1] = ((Object) null);
        doUnescapeMethodArguments[2] = -255;
        try {
            doUnescapeMethod.invoke(entities, doUnescapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#doUnescape(java.io.Writer,java.lang.String,int)}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDoUnescape_ThrowNullPointerException_1() throws Throwable  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.Entities.doUnescape] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            org.apache.commons.lang.Entities.doUnescape(Entities.java:928) */
        Class entitiesClazz = Class.forName("org.apache.commons.lang.Entities");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method doUnescapeMethod = entitiesClazz.getDeclaredMethod("doUnescape", printWriterType, stringType, intType);
        doUnescapeMethod.setAccessible(true);
        java.lang.Object[] doUnescapeMethodArguments = new java.lang.Object[3];
        doUnescapeMethodArguments[0] = printWriter;
        doUnescapeMethodArguments[1] = string;
        doUnescapeMethodArguments[2] = 2;
        try {
            doUnescapeMethod.invoke(entities, doUnescapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doUnescape(java.io.Writer, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#doUnescape(java.io.Writer,java.lang.String,int)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: writer.write(str, 0, firstAmp);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testDoUnescape_ThrowReadOnlyBufferException() throws Throwable  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\u0000";
        
        Class entitiesClazz = Class.forName("org.apache.commons.lang.Entities");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method doUnescapeMethod = entitiesClazz.getDeclaredMethod("doUnescape", printWriterType, stringType, intType);
        doUnescapeMethod.setAccessible(true);
        java.lang.Object[] doUnescapeMethodArguments = new java.lang.Object[3];
        doUnescapeMethodArguments[0] = printWriter;
        doUnescapeMethodArguments[1] = string;
        doUnescapeMethodArguments[2] = 1;
        try {
            doUnescapeMethod.invoke(entities, doUnescapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#doUnescape(java.io.Writer,java.lang.String,int)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: writer.write(str, 0, firstAmp);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testDoUnescape_ThrowReadOnlyBufferException_1() throws Throwable  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\u0000";
        
        Class entitiesClazz = Class.forName("org.apache.commons.lang.Entities");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method doUnescapeMethod = entitiesClazz.getDeclaredMethod("doUnescape", printWriterType, stringType, intType);
        doUnescapeMethod.setAccessible(true);
        java.lang.Object[] doUnescapeMethodArguments = new java.lang.Object[3];
        doUnescapeMethodArguments[0] = printWriter;
        doUnescapeMethodArguments[1] = string;
        doUnescapeMethodArguments[2] = 1;
        try {
            doUnescapeMethod.invoke(entities, doUnescapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#doUnescape(java.io.Writer,java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writer.write(str, 0, firstAmp);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDoUnescape_ThrowIllegalStateException() throws Throwable  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\u0000";
        
        Class entitiesClazz = Class.forName("org.apache.commons.lang.Entities");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method doUnescapeMethod = entitiesClazz.getDeclaredMethod("doUnescape", printWriterType, stringType, intType);
        doUnescapeMethod.setAccessible(true);
        java.lang.Object[] doUnescapeMethodArguments = new java.lang.Object[3];
        doUnescapeMethodArguments[0] = printWriter;
        doUnescapeMethodArguments[1] = string;
        doUnescapeMethodArguments[2] = 1;
        try {
            doUnescapeMethod.invoke(entities, doUnescapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for doUnescape
    
    public void testDoUnescape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 8 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.ISO_8859_1$Encoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaLangAccess sun.nio.cs.SingleByte.JLA accessible:
        module java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields654522923582600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields654522923582600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass654522923590900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields654522923582600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass654522923590900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields654522924439900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields654522924439900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass654522924444000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields654522924439900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass654522924444000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

