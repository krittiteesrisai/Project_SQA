package org.apache.commons.lang;

import org.junit.Test;
import org.apache.commons.lang.Entities.LookupEntityMap;
import java.io.PrintWriter;
import org.apache.commons.lang.Entities.EntityMap;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import org.apache.commons.lang.Entities.PrimitiveEntityMap;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import org.apache.commons.lang.Entities.ArrayEntityMap;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ReadOnlyBufferException;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang_EntitiesTest {
    ///region Test suites for executable org.apache.commons.lang.Entities.escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testEscape() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "";
        
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 *  */
    @Test
    public void testEscape_CLessOrEqual0x7F() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 32);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 4);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 32);
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
    public void testEscape_CLessOrEqual0x7F_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 127);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
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
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "";
        
        entities.escape(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
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
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:511)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:787) */
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
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 32);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 32);
        byte[] value = {};
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:513)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:787) */
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
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:513)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:787) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String entityName = this.entityName(c);
 *  */
    @Test
    public void testEscape_ThrowClassCastException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 1);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        int[] value = {};
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.createLookupTable(Entities.java:535)
            org.apache.commons.lang.Entities$LookupEntityMap.lookupTable(Entities.java:524)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:511)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:787) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = str.length();
 *  */
    @Test
    public void testEscape_ThrowNullPointerException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:784) */
        entities.escape(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write('&');
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_4() throws Exception  {
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
            org.apache.commons.lang.Entities.escape(Entities.java:797) */
        entities.escape(null, string1);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write('&');
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_1() throws Exception  {
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
            org.apache.commons.lang.Entities.escape(Entities.java:797) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write(c);
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_2() throws Exception  {
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
            org.apache.commons.lang.Entities.escape(Entities.java:794) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write("&#");
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_3() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 512);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 512);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "\u0200";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:790) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write(c);
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_7() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 2);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:794) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write(c);
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_6() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 1);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 1);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:794) */
        entities.escape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_5() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        java.lang.String[] lookupTable = new java.lang.String[40];
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable", lookupTable);
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 16);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\u000F";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.Entities.escape(Entities.java:794) */
        entities.escape(printWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method escape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: writer.write(c);
 *  */
    @Test(expected = IOException.class)
    public void testEscape_ThrowIOException_1() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: writer.write(c);
 *  */
    @Test(expected = IOException.class)
    public void testEscape_ThrowIOException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 127);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 65408);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(bufferedWriter, "java.io.Writer", "lock", lock);
        String string = "";
        
        entities.escape(bufferedWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: writer.write('&');
 *  */
    @Test(expected = IOException.class)
    public void testEscape_ThrowIOException_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 32);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 32);
        String value = "";
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " ";
        
        entities.escape(fileWriter, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testEscape_IterateForLoop() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "";
        
        String actual = entities.escape(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testEscape_ChLessOrEqual0x7F() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        java.lang.String[] lookupTable = new java.lang.String[40];
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable", lookupTable);
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 16);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "\u000F";
        
        String actual = entities.escape(string);
        
        String expected = "\u000F";
        
        assertEquals(expected, actual);
        
        Entities.EntityMap entityMap = entities.map;
        java.lang.String[] entityMapMapLookupTable = ((java.lang.String[]) getFieldValue(entityMap, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable0 = ((String) get(entityMapMapLookupTable, 0));
        Entities.EntityMap entityMap1 = entities.map;
        java.lang.String[] entityMap1MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap1, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable1 = ((String) get(entityMap1MapLookupTable, 1));
        Entities.EntityMap entityMap2 = entities.map;
        java.lang.String[] entityMap2MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap2, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable2 = ((String) get(entityMap2MapLookupTable, 2));
        Entities.EntityMap entityMap3 = entities.map;
        java.lang.String[] entityMap3MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap3, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable3 = ((String) get(entityMap3MapLookupTable, 3));
        Entities.EntityMap entityMap4 = entities.map;
        java.lang.String[] entityMap4MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap4, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable4 = ((String) get(entityMap4MapLookupTable, 4));
        Entities.EntityMap entityMap5 = entities.map;
        java.lang.String[] entityMap5MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap5, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable5 = ((String) get(entityMap5MapLookupTable, 5));
        Entities.EntityMap entityMap6 = entities.map;
        java.lang.String[] entityMap6MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap6, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable6 = ((String) get(entityMap6MapLookupTable, 6));
        Entities.EntityMap entityMap7 = entities.map;
        java.lang.String[] entityMap7MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap7, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable7 = ((String) get(entityMap7MapLookupTable, 7));
        Entities.EntityMap entityMap8 = entities.map;
        java.lang.String[] entityMap8MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap8, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable8 = ((String) get(entityMap8MapLookupTable, 8));
        Entities.EntityMap entityMap9 = entities.map;
        java.lang.String[] entityMap9MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap9, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable9 = ((String) get(entityMap9MapLookupTable, 9));
        Entities.EntityMap entityMap10 = entities.map;
        java.lang.String[] entityMap10MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap10, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable10 = ((String) get(entityMap10MapLookupTable, 10));
        Entities.EntityMap entityMap11 = entities.map;
        java.lang.String[] entityMap11MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap11, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable11 = ((String) get(entityMap11MapLookupTable, 11));
        Entities.EntityMap entityMap12 = entities.map;
        java.lang.String[] entityMap12MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap12, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable12 = ((String) get(entityMap12MapLookupTable, 12));
        Entities.EntityMap entityMap13 = entities.map;
        java.lang.String[] entityMap13MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap13, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable13 = ((String) get(entityMap13MapLookupTable, 13));
        Entities.EntityMap entityMap14 = entities.map;
        java.lang.String[] entityMap14MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap14, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable14 = ((String) get(entityMap14MapLookupTable, 14));
        Entities.EntityMap entityMap15 = entities.map;
        java.lang.String[] entityMap15MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap15, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable15 = ((String) get(entityMap15MapLookupTable, 15));
        Entities.EntityMap entityMap16 = entities.map;
        java.lang.String[] entityMap16MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap16, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable16 = ((String) get(entityMap16MapLookupTable, 16));
        Entities.EntityMap entityMap17 = entities.map;
        java.lang.String[] entityMap17MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap17, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable17 = ((String) get(entityMap17MapLookupTable, 17));
        Entities.EntityMap entityMap18 = entities.map;
        java.lang.String[] entityMap18MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap18, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable18 = ((String) get(entityMap18MapLookupTable, 18));
        Entities.EntityMap entityMap19 = entities.map;
        java.lang.String[] entityMap19MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap19, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable19 = ((String) get(entityMap19MapLookupTable, 19));
        Entities.EntityMap entityMap20 = entities.map;
        java.lang.String[] entityMap20MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap20, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable20 = ((String) get(entityMap20MapLookupTable, 20));
        Entities.EntityMap entityMap21 = entities.map;
        java.lang.String[] entityMap21MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap21, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable21 = ((String) get(entityMap21MapLookupTable, 21));
        Entities.EntityMap entityMap22 = entities.map;
        java.lang.String[] entityMap22MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap22, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable22 = ((String) get(entityMap22MapLookupTable, 22));
        Entities.EntityMap entityMap23 = entities.map;
        java.lang.String[] entityMap23MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap23, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable23 = ((String) get(entityMap23MapLookupTable, 23));
        Entities.EntityMap entityMap24 = entities.map;
        java.lang.String[] entityMap24MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap24, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable24 = ((String) get(entityMap24MapLookupTable, 24));
        Entities.EntityMap entityMap25 = entities.map;
        java.lang.String[] entityMap25MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap25, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable25 = ((String) get(entityMap25MapLookupTable, 25));
        Entities.EntityMap entityMap26 = entities.map;
        java.lang.String[] entityMap26MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap26, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable26 = ((String) get(entityMap26MapLookupTable, 26));
        Entities.EntityMap entityMap27 = entities.map;
        java.lang.String[] entityMap27MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap27, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable27 = ((String) get(entityMap27MapLookupTable, 27));
        Entities.EntityMap entityMap28 = entities.map;
        java.lang.String[] entityMap28MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap28, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable28 = ((String) get(entityMap28MapLookupTable, 28));
        Entities.EntityMap entityMap29 = entities.map;
        java.lang.String[] entityMap29MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap29, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable29 = ((String) get(entityMap29MapLookupTable, 29));
        Entities.EntityMap entityMap30 = entities.map;
        java.lang.String[] entityMap30MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap30, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable30 = ((String) get(entityMap30MapLookupTable, 30));
        Entities.EntityMap entityMap31 = entities.map;
        java.lang.String[] entityMap31MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap31, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable31 = ((String) get(entityMap31MapLookupTable, 31));
        Entities.EntityMap entityMap32 = entities.map;
        java.lang.String[] entityMap32MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap32, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable32 = ((String) get(entityMap32MapLookupTable, 32));
        Entities.EntityMap entityMap33 = entities.map;
        java.lang.String[] entityMap33MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap33, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable33 = ((String) get(entityMap33MapLookupTable, 33));
        Entities.EntityMap entityMap34 = entities.map;
        java.lang.String[] entityMap34MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap34, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable34 = ((String) get(entityMap34MapLookupTable, 34));
        Entities.EntityMap entityMap35 = entities.map;
        java.lang.String[] entityMap35MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap35, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable35 = ((String) get(entityMap35MapLookupTable, 35));
        Entities.EntityMap entityMap36 = entities.map;
        java.lang.String[] entityMap36MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap36, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable36 = ((String) get(entityMap36MapLookupTable, 36));
        Entities.EntityMap entityMap37 = entities.map;
        java.lang.String[] entityMap37MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap37, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable37 = ((String) get(entityMap37MapLookupTable, 37));
        Entities.EntityMap entityMap38 = entities.map;
        java.lang.String[] entityMap38MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap38, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable38 = ((String) get(entityMap38MapLookupTable, 38));
        Entities.EntityMap entityMap39 = entities.map;
        java.lang.String[] entityMap39MapLookupTable = ((java.lang.String[]) getFieldValue(entityMap39, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable"));
        String finalEntitiesMapLookupTable39 = ((String) get(entityMap39MapLookupTable, 39));
        
        assertNull(finalEntitiesMapLookupTable0);
        
        assertNull(finalEntitiesMapLookupTable1);
        
        assertNull(finalEntitiesMapLookupTable2);
        
        assertNull(finalEntitiesMapLookupTable3);
        
        assertNull(finalEntitiesMapLookupTable4);
        
        assertNull(finalEntitiesMapLookupTable5);
        
        assertNull(finalEntitiesMapLookupTable6);
        
        assertNull(finalEntitiesMapLookupTable7);
        
        assertNull(finalEntitiesMapLookupTable8);
        
        assertNull(finalEntitiesMapLookupTable9);
        
        assertNull(finalEntitiesMapLookupTable10);
        
        assertNull(finalEntitiesMapLookupTable11);
        
        assertNull(finalEntitiesMapLookupTable12);
        
        assertNull(finalEntitiesMapLookupTable13);
        
        assertNull(finalEntitiesMapLookupTable14);
        
        assertNull(finalEntitiesMapLookupTable15);
        
        assertNull(finalEntitiesMapLookupTable16);
        
        assertNull(finalEntitiesMapLookupTable17);
        
        assertNull(finalEntitiesMapLookupTable18);
        
        assertNull(finalEntitiesMapLookupTable19);
        
        assertNull(finalEntitiesMapLookupTable20);
        
        assertNull(finalEntitiesMapLookupTable21);
        
        assertNull(finalEntitiesMapLookupTable22);
        
        assertNull(finalEntitiesMapLookupTable23);
        
        assertNull(finalEntitiesMapLookupTable24);
        
        assertNull(finalEntitiesMapLookupTable25);
        
        assertNull(finalEntitiesMapLookupTable26);
        
        assertNull(finalEntitiesMapLookupTable27);
        
        assertNull(finalEntitiesMapLookupTable28);
        
        assertNull(finalEntitiesMapLookupTable29);
        
        assertNull(finalEntitiesMapLookupTable30);
        
        assertNull(finalEntitiesMapLookupTable31);
        
        assertNull(finalEntitiesMapLookupTable32);
        
        assertNull(finalEntitiesMapLookupTable33);
        
        assertNull(finalEntitiesMapLookupTable34);
        
        assertNull(finalEntitiesMapLookupTable35);
        
        assertNull(finalEntitiesMapLookupTable36);
        
        assertNull(finalEntitiesMapLookupTable37);
        
        assertNull(finalEntitiesMapLookupTable38);
        
        assertNull(finalEntitiesMapLookupTable39);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testEscape_ChLessOrEqual0x7F_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 32);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 16);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 32);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = " ";
        
        String actual = entities.escape(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
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
        Entities.EntityMap entityMap4 = entities.map;
        IntHashMap entityMap4MapMapValueToName = ((IntHashMap) getFieldValue(entityMap4, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap4MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap4MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable5 = get(entityMap4MapMapValueToNameMapMapValueToNameTable, 5);
        Entities.EntityMap entityMap5 = entities.map;
        IntHashMap entityMap5MapMapValueToName = ((IntHashMap) getFieldValue(entityMap5, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap5MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap5MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable6 = get(entityMap5MapMapValueToNameMapMapValueToNameTable, 6);
        Entities.EntityMap entityMap6 = entities.map;
        IntHashMap entityMap6MapMapValueToName = ((IntHashMap) getFieldValue(entityMap6, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap6MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap6MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable7 = get(entityMap6MapMapValueToNameMapMapValueToNameTable, 7);
        Entities.EntityMap entityMap7 = entities.map;
        IntHashMap entityMap7MapMapValueToName = ((IntHashMap) getFieldValue(entityMap7, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap7MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap7MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable8 = get(entityMap7MapMapValueToNameMapMapValueToNameTable, 8);
        Entities.EntityMap entityMap8 = entities.map;
        IntHashMap entityMap8MapMapValueToName = ((IntHashMap) getFieldValue(entityMap8, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap8MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap8MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable9 = get(entityMap8MapMapValueToNameMapMapValueToNameTable, 9);
        Entities.EntityMap entityMap9 = entities.map;
        IntHashMap entityMap9MapMapValueToName = ((IntHashMap) getFieldValue(entityMap9, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap9MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap9MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable10 = get(entityMap9MapMapValueToNameMapMapValueToNameTable, 10);
        Entities.EntityMap entityMap10 = entities.map;
        IntHashMap entityMap10MapMapValueToName = ((IntHashMap) getFieldValue(entityMap10, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap10MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap10MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable11 = get(entityMap10MapMapValueToNameMapMapValueToNameTable, 11);
        Entities.EntityMap entityMap11 = entities.map;
        IntHashMap entityMap11MapMapValueToName = ((IntHashMap) getFieldValue(entityMap11, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap11MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap11MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable12 = get(entityMap11MapMapValueToNameMapMapValueToNameTable, 12);
        Entities.EntityMap entityMap12 = entities.map;
        IntHashMap entityMap12MapMapValueToName = ((IntHashMap) getFieldValue(entityMap12, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap12MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap12MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable13 = get(entityMap12MapMapValueToNameMapMapValueToNameTable, 13);
        Entities.EntityMap entityMap13 = entities.map;
        IntHashMap entityMap13MapMapValueToName = ((IntHashMap) getFieldValue(entityMap13, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap13MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap13MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable14 = get(entityMap13MapMapValueToNameMapMapValueToNameTable, 14);
        Entities.EntityMap entityMap14 = entities.map;
        IntHashMap entityMap14MapMapValueToName = ((IntHashMap) getFieldValue(entityMap14, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap14MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap14MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable15 = get(entityMap14MapMapValueToNameMapMapValueToNameTable, 15);
        
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
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testEscape_ChLessOrEqual0x7F_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 32);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 16);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 65503);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = " ";
        
        String actual = entities.escape(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
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
        Entities.EntityMap entityMap4 = entities.map;
        IntHashMap entityMap4MapMapValueToName = ((IntHashMap) getFieldValue(entityMap4, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap4MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap4MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable5 = get(entityMap4MapMapValueToNameMapMapValueToNameTable, 5);
        Entities.EntityMap entityMap5 = entities.map;
        IntHashMap entityMap5MapMapValueToName = ((IntHashMap) getFieldValue(entityMap5, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap5MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap5MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable6 = get(entityMap5MapMapValueToNameMapMapValueToNameTable, 6);
        Entities.EntityMap entityMap6 = entities.map;
        IntHashMap entityMap6MapMapValueToName = ((IntHashMap) getFieldValue(entityMap6, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap6MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap6MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable7 = get(entityMap6MapMapValueToNameMapMapValueToNameTable, 7);
        Entities.EntityMap entityMap7 = entities.map;
        IntHashMap entityMap7MapMapValueToName = ((IntHashMap) getFieldValue(entityMap7, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap7MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap7MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable8 = get(entityMap7MapMapValueToNameMapMapValueToNameTable, 8);
        Entities.EntityMap entityMap8 = entities.map;
        IntHashMap entityMap8MapMapValueToName = ((IntHashMap) getFieldValue(entityMap8, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap8MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap8MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable9 = get(entityMap8MapMapValueToNameMapMapValueToNameTable, 9);
        Entities.EntityMap entityMap9 = entities.map;
        IntHashMap entityMap9MapMapValueToName = ((IntHashMap) getFieldValue(entityMap9, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap9MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap9MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable10 = get(entityMap9MapMapValueToNameMapMapValueToNameTable, 10);
        Entities.EntityMap entityMap10 = entities.map;
        IntHashMap entityMap10MapMapValueToName = ((IntHashMap) getFieldValue(entityMap10, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap10MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap10MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable11 = get(entityMap10MapMapValueToNameMapMapValueToNameTable, 11);
        Entities.EntityMap entityMap11 = entities.map;
        IntHashMap entityMap11MapMapValueToName = ((IntHashMap) getFieldValue(entityMap11, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap11MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap11MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable12 = get(entityMap11MapMapValueToNameMapMapValueToNameTable, 12);
        Entities.EntityMap entityMap12 = entities.map;
        IntHashMap entityMap12MapMapValueToName = ((IntHashMap) getFieldValue(entityMap12, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap12MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap12MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable13 = get(entityMap12MapMapValueToNameMapMapValueToNameTable, 13);
        Entities.EntityMap entityMap13 = entities.map;
        IntHashMap entityMap13MapMapValueToName = ((IntHashMap) getFieldValue(entityMap13, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap13MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap13MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable14 = get(entityMap13MapMapValueToNameMapMapValueToNameTable, 14);
        Entities.EntityMap entityMap14 = entities.map;
        IntHashMap entityMap14MapMapValueToName = ((IntHashMap) getFieldValue(entityMap14, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName"));
        Object entityMap14MapMapValueToNameMapMapValueToNameTable = getFieldValue(entityMap14MapMapValueToName, "org.apache.commons.lang.IntHashMap", "table");
        Object finalEntitiesMapMapValueToNameTable15 = get(entityMap14MapMapValueToNameMapMapValueToNameTable, 15);
        
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
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String entityName = this.entityName(ch);
 *  */
    @Test
    public void testEscape_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        java.lang.String[] lookupTable = {null, null};
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "lookupTable", lookupTable);
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 128);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 2]
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:511)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:751) */
        entities.escape(string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String entityName = this.entityName(ch);
 *  */
    @Test
    public void testEscape_ThrowClassCastException1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 32);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 65503);
        Object next = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(next, "org.apache.commons.lang.IntHashMap$Entry", "hash", 32);
        int[] value = {};
        setField(next, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "next", next);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:513)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:751) */
        entities.escape(string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: String entityName = this.entityName(ch);
 *  */
    @Test
    public void testEscape_ThrowArithmeticException1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 96);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "`";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.get(IntHashMap.java:239)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:513)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:751) */
        entities.escape(string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: String entityName = this.entityName(ch);
 *  */
    @Test
    public void testEscape_ThrowArithmeticException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.get(IntHashMap.java:239)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:751) */
        entities.escape(string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testEscape_ThrowArithmeticException_2() throws Exception  {
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
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.createLookupTable(Entities.java:535)
            org.apache.commons.lang.Entities$LookupEntityMap.lookupTable(Entities.java:524)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:511)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:751) */
        entities.escape(string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < str.length(); ++i)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testEscape_ThrowClassCastException_11() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", 32);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 1);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 1);
        int[] value = {};
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        Object next = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "next", next);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        String string = "\u001F";
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.createLookupTable(Entities.java:535)
            org.apache.commons.lang.Entities$LookupEntityMap.lookupTable(Entities.java:524)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:511)
            org.apache.commons.lang.Entities.entityName(Entities.java:723)
            org.apache.commons.lang.Entities.escape(Entities.java:751) */
        entities.escape(string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StringBuffer buf = new StringBuffer(str.length() * 2);
 *  */
    @Test
    public void testEscape_ThrowNullPointerException1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.escape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.escape(Entities.java:747) */
        entities.escape(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.Entities}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#escape(java.lang.String)}
     */
    @Test
    public void testEscapeWithBlankString() {
        Entities entities = new Entities();
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap(4098);
        entities.map = map;
        
        String actual = entities.escape("\n\t\r");
        
        String expected = "\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.unescape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testUnescape_StringIndexOf() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "";
        
        String actual = entities.unescape(string);
        
        assertEquals(string, actual);
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
    public void testUnescape_ThrowNullPointerException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.unescape(Entities.java:814) */
        entities.unescape(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unescape(java.lang.String)
    
    @Test
    public void testUnescape1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "  && ";
        
        String actual = entities.unescape(string);
        
        String expected = "  && ";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescape2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "\u0000\u0000&&;\u0000";
        
        String actual = entities.unescape(string);
        
        String expected = "\u0000\u0000&&;\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescape3() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "\u0000\u0000&;&\u0000\u0000\u0000\u0000\u0000";
        
        String actual = entities.unescape(string);
        
        String expected = "\u0000\u0000&;&\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unescape(java.lang.String)
    
    @Test
    public void testUnescape4() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "\u0000\u0000&\u0000\u0000;";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.entityValue(Entities.java:733)
            org.apache.commons.lang.Entities.unescape(Entities.java:855) */
        entities.unescape(string);
    }
    
    @Test
    public void testUnescape5() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "\u0000\u0000&\u0000;\u0000&";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.entityValue(Entities.java:733)
            org.apache.commons.lang.Entities.unescape(Entities.java:855) */
        entities.unescape(string);
    }
    
    @Test
    public void testUnescape6() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "\u0000&\u0000&\u0000;";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.entityValue(Entities.java:733)
            org.apache.commons.lang.Entities.unescape(Entities.java:855) */
        entities.unescape(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.Entities.unescape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescape_Return() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("\u0000");
        setField(stringWriter, "java.io.StringWriter", "buf", buf);
        String string = "";
        
        entities.unescape(stringWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescape_Return_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "";
        
        entities.unescape(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescape_Return_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.BufferedWriter", "out", out1);
        char[] cb = {'\u0000'};
        setField(out, "java.io.BufferedWriter", "cb", cb);
        setField(out, "java.io.BufferedWriter", "nChars", 1073741825);
        setField(out, "java.io.BufferedWriter", "nextChar", 1073741823);
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = " @";
        
        entities.unescape(printWriter, string);
        
        Writer printWriterOut = ((Writer) getFieldValue(printWriter, "java.io.PrintWriter", "out"));
        int finalPrintWriterOutNextChar = ((Integer) getFieldValue(printWriterOut, "java.io.BufferedWriter", "nextChar"));
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertEquals(1073741825, finalPrintWriterOutNextChar);
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int firstAmp = string.indexOf('&');
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.unescape(Entities.java:885) */
        entities.unescape(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): True}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write(string);
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException_1() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.unescape(Entities.java:887) */
        entities.unescape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): False}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writer.write(string, 0, firstAmp);
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException_3() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        String string = "&";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.unescape(Entities.java:891) */
        entities.unescape(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): False}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = firstAmp; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException_4() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "&";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            org.apache.commons.lang.Entities.unescape(Entities.java:891) */
        entities.unescape(printWriter, string);
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
    public void testUnescape_ThrowNullPointerException_2() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(out, "java.io.BufferedWriter", "out", out1);
        setField(out, "java.io.BufferedWriter", "nextChar", -2);
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:229)
            java.base/java.io.PrintWriter.write(PrintWriter.java:541)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            org.apache.commons.lang.Entities.unescape(Entities.java:887) */
        entities.unescape(printWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method unescape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (firstAmp < 0): False}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writer.write(string, 0, firstAmp);
 *  */
    @Test(expected = IOException.class)
    public void testUnescape_ThrowIOException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "&";
        
        entities.unescape(fileWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescape(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: writer.write(string, 0, firstAmp);
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
        String string = "  &";
        
        entities.unescape(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writer.write(string, 0, firstAmp);
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
        String string = "@ &";
        
        entities.unescape(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#unescape(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: writer.write(string, 0, firstAmp);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testUnescape_ThrowReadOnlyBufferException_1() throws Exception  {
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
        String string = " &";
        
        entities.unescape(printWriter, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unescape(java.io.Writer, java.lang.String)
    
    @Test
    public void testUnescape7() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.Entities.unescape] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            org.apache.commons.lang.Entities.unescape(Entities.java:887) */
        entities.unescape(printWriter, string);
    }
    ///endregion
    
    ///region Errors report for unescape
    
    public void testUnescape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 11 occurrences of:
        // Concrete execution failed
        
        // 5 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
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
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", -177298367);
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
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:511)
            org.apache.commons.lang.Entities.entityName(Entities.java:723) */
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
        setField(map, "org.apache.commons.lang.Entities$LookupEntityMap", "LOOKUP_TABLE_SIZE", -208);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.get(IntHashMap.java:239)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:513)
            org.apache.commons.lang.Entities.entityName(Entities.java:723) */
        entities.entityName(-208);
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
        byte[] value = {};
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:513)
            org.apache.commons.lang.Entities.entityName(Entities.java:723) */
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
            org.apache.commons.lang.Entities$LookupEntityMap.createLookupTable(Entities.java:533)
            org.apache.commons.lang.Entities$LookupEntityMap.lookupTable(Entities.java:524)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:511)
            org.apache.commons.lang.Entities.entityName(Entities.java:723) */
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
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities.entityName(Entities.java:723) */
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
            org.apache.commons.lang.Entities$PrimitiveEntityMap.name(Entities.java:435)
            org.apache.commons.lang.Entities$LookupEntityMap.createLookupTable(Entities.java:535)
            org.apache.commons.lang.Entities$LookupEntityMap.lookupTable(Entities.java:524)
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:511)
            org.apache.commons.lang.Entities.entityName(Entities.java:723) */
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
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 36);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 1);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.lang.Entities$LookupEntityMap.name(Entities.java:511)
            org.apache.commons.lang.Entities.entityName(Entities.java:723) */
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
            org.apache.commons.lang.Entities.entityName(Entities.java:723) */
        entities.entityName(-255);
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
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 9);
        Object entry = createInstance("org.apache.commons.lang.IntHashMap$Entry");
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "hash", 9);
        byte[] value = {};
        setField(entry, "org.apache.commons.lang.IntHashMap$Entry", "value", value);
        table[0] = entry;
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        entities.addEntity(null, 9);
        
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
        
        assertNull(finalEntitiesMapMapValueToNameTable0Value);
        
        assertNull(finalEntitiesMapMapValueToNameTable1);
        
        assertNull(finalEntitiesMapMapValueToNameTable2);
        
        assertNull(finalEntitiesMapMapValueToNameTable3);
        
        assertNull(finalEntitiesMapMapValueToNameTable4);
        
        assertNull(finalEntitiesMapMapValueToNameTable5);
        
        assertNull(finalEntitiesMapMapValueToNameTable6);
        
        assertNull(finalEntitiesMapMapValueToNameTable7);
        
        assertNull(finalEntitiesMapMapValueToNameTable8);
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
        short[] value = {};
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
        Entities.PrimitiveEntityMap map = ((Entities.PrimitiveEntityMap) createInstance("org.apache.commons.lang.Entities$PrimitiveEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        IntHashMap mapValueToName = ((IntHashMap) createInstance("org.apache.commons.lang.IntHashMap"));
        java.lang.Object[] table = createArray("org.apache.commons.lang.IntHashMap$Entry", 0);
        setField(mapValueToName, "org.apache.commons.lang.IntHashMap", "table", table);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapValueToName", mapValueToName);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntity] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.IntHashMap.put(IntHashMap.java:298)
            org.apache.commons.lang.Entities$PrimitiveEntityMap.add(Entities.java:428)
            org.apache.commons.lang.Entities.addEntity(Entities.java:713) */
        entities.addEntity(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntity(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.lang.Entities.EntityMap#add(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: map.add(name, value);
 *  */
    @Test
    public void testAddEntity_ThrowNullPointerException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntity] produces [java.lang.NullPointerException]
            org.apache.commons.lang.Entities.addEntity(Entities.java:713) */
        entities.addEntity(null, -255);
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
        Entities.LookupEntityMap map = ((Entities.LookupEntityMap) createInstance("org.apache.commons.lang.Entities$LookupEntityMap"));
        LinkedHashMap mapNameToValue = new LinkedHashMap();
        Integer integer = 0;
        mapNameToValue.put(null, integer);
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        mapNameToValue.put(character, object);
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
            org.apache.commons.lang.Entities$ArrayEntityMap.value(Entities.java:610)
            org.apache.commons.lang.Entities.entityValue(Entities.java:733) */
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
            org.apache.commons.lang.Entities$ArrayEntityMap.value(Entities.java:611)
            org.apache.commons.lang.Entities.entityValue(Entities.java:733) */
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
        Object object1 = createInstance("java.lang.Object");
        mapNameToValue.put(character, object1);
        setField(map, "org.apache.commons.lang.Entities$PrimitiveEntityMap", "mapNameToValue", mapNameToValue);
        setField(entities, "org.apache.commons.lang.Entities", "map", map);
        
        /* This test fails because method [org.apache.commons.lang.Entities.entityValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            org.apache.commons.lang.Entities$PrimitiveEntityMap.value(Entities.java:446)
            org.apache.commons.lang.Entities.entityValue(Entities.java:733) */
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
            org.apache.commons.lang.Entities.entityValue(Entities.java:733) */
        entities.entityValue(null);
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addEntity(entityArray[i][0], Integer.parseInt(entityArray[i][1]));
 *  */
    @Test
    public void testAddEntities_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Entities entities = ((Entities) createInstance("org.apache.commons.lang.Entities"));
        java.lang.String[][] stringArray = new java.lang.String[1][];
        java.lang.String[] stringArray1 = {};
        stringArray[0] = stringArray1;
        
        /* This test fails because method [org.apache.commons.lang.Entities.addEntities] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.Entities.addEntities(Entities.java:702) */
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
            org.apache.commons.lang.Entities.addEntities(Entities.java:702) */
        entities.addEntities(stringArray);
    }
    
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
            org.apache.commons.lang.Entities.addEntities(Entities.java:702) */
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
            org.apache.commons.lang.Entities.addEntities(Entities.java:702) */
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
            org.apache.commons.lang.Entities.addEntities(Entities.java:701) */
        entities.addEntities(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addEntities([[Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.Entities}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.Entities#addEntities(java.lang.String[][])}
     */
    @Test
    public void testAddEntitiesWithNonEmptyObjectArray() {
        Entities entities = new Entities();
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap(0);
        entities.map = map;
        java.lang.String[][] stringArray = new java.lang.String[3][];
        java.lang.String[] stringArray1 = {"XZ", "-3", "XZ", "abc"};
        stringArray[0] = stringArray1;
        java.lang.String[] stringArray2 = {"\n\t\r", "10", ""};
        stringArray[1] = stringArray2;
        java.lang.String[] stringArray3 = {"", "-3", "#$\\\"'"};
        stringArray[2] = stringArray3;
        
        entities.addEntities(stringArray);
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
            org.apache.commons.lang.Entities.addEntities(Entities.java:702) */
        entities.addEntities(stringArray);
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
            org.apache.commons.lang.Entities.fillWithHtml40Entities(Entities.java:388) */
        Entities.fillWithHtml40Entities(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields666248615614100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields666248615614100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass666248615624800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields666248615614100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass666248615624800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields666248618579400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields666248618579400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass666248618583900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields666248618579400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass666248618583900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

