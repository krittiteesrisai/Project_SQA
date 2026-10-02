package org.apache.commons.csv;

import org.junit.Test;
import java.util.ArrayList;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.io.Writer;
import java.util.concurrent.atomic.LongAdder;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ReadOnlyBufferException;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_csv_CSVPrinterTest {
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.printRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printRecord(java.lang.Iterable)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Iterable)}
 *  */
    @Test
    public void testPrintRecord() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        ArrayList arrayList = new ArrayList();
        
        cSVPrinter.printRecord(arrayList);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Iterable)}
 *  */
    @Test
    public void testPrintRecord_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        ArrayList arrayList = new ArrayList();
        
        cSVPrinter.printRecord(arrayList);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Iterable)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVPrinter#println()}
 *  */
    @Test
    public void testPrintRecord_CSVPrinterPrintln() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = " ";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        ArrayList arrayList = new ArrayList();
        
        cSVPrinter.printRecord(arrayList);
        
        Appendable cSVPrinterOut = ((Appendable) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out"));
        boolean finalCSVPrinterOutTrouble = ((Boolean) getFieldValue(cSVPrinterOut, "java.io.PrintWriter", "trouble"));
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterOutTrouble);
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printRecord(java.lang.Iterable)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Object value: values)
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:351) */
        cSVPrinter.printRecord(((Iterable) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: print(value);
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        ArrayList arrayList = new ArrayList();
        Integer integer = Integer.MIN_VALUE;
        arrayList.add(integer);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:119)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:352) */
        cSVPrinter.printRecord(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: print(value);
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException_2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:352) */
        cSVPrinter.printRecord(arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.printRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printRecord([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Object[])}
 *  */
    @Test
    public void testPrintRecord1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {};
        
        cSVPrinter.printRecord(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 *  */
    @Test
    public void testPrintRecord_CSVPrinterPrint() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null};
        
        cSVPrinter.printRecord(objectArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printRecord([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Object value: values)
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:367) */
        cSVPrinter.printRecord(((java.lang.Object[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: print(value);
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException_11() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:119)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: print(value);
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException_5() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        Object out = createInstance("java.nio.ByteBufferAsCharBufferL");
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: print(value);
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException_21() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: print(value);
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException_3() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '-';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: print(value);
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException_4() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:165)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecord(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: print(value);
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException_6() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method printRecord([Ljava.lang.Object;)
    
    @Test
    public void testPrintRecord2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        cSVPrinter.printRecord(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecord3() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        cSVPrinter.printRecord(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecord4() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '-');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        cSVPrinter.printRecord(objectArray);
    }
    
    @Test
    public void testPrintRecord5() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        cSVPrinter.printRecord(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecord6() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\u0001";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        
        cSVPrinter.printRecord(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecord7() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        cSVPrinter.printRecord(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecord8() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        cSVPrinter.printRecord(objectArray);
        
        Appendable cSVPrinterOut = ((Appendable) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out"));
        boolean finalCSVPrinterOutTrouble = ((Boolean) getFieldValue(cSVPrinterOut, "java.io.PrintWriter", "trouble"));
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterOutTrouble);
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecord9() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\u0000";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
        
        cSVPrinter.printRecord(objectArray);
        
        Appendable cSVPrinterOut = ((Appendable) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out"));
        boolean finalCSVPrinterOutTrouble = ((Boolean) getFieldValue(cSVPrinterOut, "java.io.PrintWriter", "trouble"));
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterOutTrouble);
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printRecord([Ljava.lang.Object;)
    
    @Test
    public void testPrintRecord10() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NONE;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:139)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:196)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    @Test
    public void testPrintRecord11() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:244)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    @Test
    public void testPrintRecord12() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NONE;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:139)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:196)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    @Test
    public void testPrintRecord13() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    @Test
    public void testPrintRecord14() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    @Test
    public void testPrintRecord15() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.println(CSVPrinter.java:336)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:370) */
        cSVPrinter.printRecord(objectArray);
    }
    
    @Test
    public void testPrintRecord16() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '0');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    @Test
    public void testPrintRecord17() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368) */
        cSVPrinter.printRecord(objectArray);
    }
    
    @Test
    public void testPrintRecord18() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecord] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.println(CSVPrinter.java:336)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:370) */
        cSVPrinter.printRecord(objectArray);
    }
    ///endregion
    
    ///region Errors report for printRecord
    
    public void testPrintRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.printAndEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printAndEscape(java.lang.CharSequence, int, int)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 *  */
    @Test
    public void testPrintAndEscape() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", charSequenceType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = ((Object) null);
        printAndEscapeMethodArguments[1] = -1;
        printAndEscapeMethodArguments[2] = 0;
        printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 *  */
    @Test
    public void testPrintAndEscape_CEqualsLF() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "\n\u0000  ";
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printAndEscape(java.lang.CharSequence, int, int)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndEscape_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:142) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = -255;
        printAndEscapeMethodArguments[2] = 1;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getDelimiter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char delim = format.getDelimiter();
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:138) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", charSequenceType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = ((Object) null);
        printAndEscapeMethodArguments[1] = -255;
        printAndEscapeMethodArguments[2] = -255;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char escape = format.getEscape().charValue();
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_1() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:139) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", charSequenceType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = ((Object) null);
        printAndEscapeMethodArguments[1] = -255;
        printAndEscapeMethodArguments[2] = -255;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_2() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:142) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", charSequenceType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = ((Object) null);
        printAndEscapeMethodArguments[1] = -254;
        printAndEscapeMethodArguments[2] = 1;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(escape);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_3() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 1;
        printAndEscapeMethodArguments[2] = 1;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(escape);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_4() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 1;
        printAndEscapeMethodArguments[2] = 1;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(escape);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_5() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (if (pos > start) {
 *     out.append(value, start, pos);
 * }): True}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence,int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(value, start, pos);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_6() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escape = '_';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:165) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 1;
        printAndEscapeMethodArguments[2] = 1;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < end)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(value, start, pos);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_7() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", 'Q');
        Character escape = '\\';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = " \r          ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:146) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 35;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_8() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "\r\u0000  ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndEscape] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method printAndEscape(java.lang.CharSequence, int, int)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getDelimiter()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getEscape()}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: out.append(escape);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPrintAndEscape_ThrowIllegalStateException() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock1 = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "\r";
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndEscapeMethod = cSVPrinterClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[3];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        try {
            printAndEscapeMethod.invoke(cSVPrinter, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for printAndEscape
    
    public void testPrintAndEscape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.printRecords
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printRecords(java.sql.ResultSet)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.sql.ResultSet)}
 * @utbot.invokes {@link java.sql.ResultSet#getMetaData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int columnCount = resultSet.getMetaData().getColumnCount();
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:423) */
        cSVPrinter.printRecords(((ResultSet) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.printRecords
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printRecords(java.lang.Iterable)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Iterable)}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 *  */
    @Test
    public void testPrintRecords_IterableIterator() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        ArrayList arrayList = new ArrayList();
        
        cSVPrinter.printRecords(arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printRecords(java.lang.Iterable)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Object value: values)
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:382) */
        cSVPrinter.printRecords(((Iterable) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.printRecord((Object[]) value);
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException_3() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:119)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:388) */
        cSVPrinter.printRecords(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.printRecord((Object[]) value);
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:388) */
        cSVPrinter.printRecords(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.printRecord((Object[]) value);
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException_4() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:388) */
        cSVPrinter.printRecords(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.printRecord(value);
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException_5() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:388) */
        cSVPrinter.printRecords(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.printRecord((Object[]) value);
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException_2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:388) */
        cSVPrinter.printRecords(arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.printRecords
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printRecords([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Object[])}
 *  */
    @Test
    public void testPrintRecords() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        java.lang.Object[] objectArray = {};
        
        cSVPrinter.printRecords(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 *  */
    @Test
    public void testPrintRecords_ValueInstanceOfObject() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        cSVPrinter.printRecords(objectArray);
        
        Appendable cSVPrinterOut = ((Appendable) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out"));
        boolean finalCSVPrinterOutTrouble = ((Boolean) getFieldValue(cSVPrinterOut, "java.io.PrintWriter", "trouble"));
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterOutTrouble);
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printRecords([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Object value: values)
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:402) */
        cSVPrinter.printRecords(((java.lang.Object[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.printRecord((Object[]) value);
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException_31() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:119)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException_11() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.printRecord((Object[]) value);
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException_41() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '-';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:165)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printRecords(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object value: values)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.printRecord(value);
 *  */
    @Test
    public void testPrintRecords_ThrowNullPointerException_21() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method printRecords([Ljava.lang.Object;)
    
    @Test
    public void testPrintRecords1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        cSVPrinter.printRecords(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecords2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        cSVPrinter.printRecords(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecords3() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        objectArray[1] = ((Object) cSVPrinter);
        objectArray[2] = ((Object) cSVPrinter);
        objectArray[3] = ((Object) cSVPrinter);
        objectArray[4] = ((Object) cSVPrinter);
        objectArray[5] = ((Object) cSVPrinter);
        objectArray[6] = ((Object) cSVPrinter);
        objectArray[7] = ((Object) cSVPrinter);
        objectArray[8] = ((Object) cSVPrinter);
        
        cSVPrinter.printRecords(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        Object object1 = objectArray[1];
        boolean finalObjectArray1NewRecord = ((Boolean) getFieldValue(object1, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
        
        assertTrue(finalObjectArray1NewRecord);
    }
    
    @Test
    public void testPrintRecords4() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        cSVPrinter.printRecords(objectArray);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecords5() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\n";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords6() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(out1, "java.io.Writer", "lock", lock);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
        
        cSVPrinter.printRecords(objectArray);
        
        Appendable cSVPrinterOut = ((Appendable) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out"));
        Writer cSVPrinterOutOutOut = ((Writer) getFieldValue(cSVPrinterOut, "java.io.PrintWriter", "out"));
        boolean finalCSVPrinterOutOutTrouble = ((Boolean) getFieldValue(cSVPrinterOutOutOut, "java.io.PrintWriter", "trouble"));
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterOutOutTrouble);
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrintRecords7() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '-');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        cSVPrinter.printRecords(objectArray);
        
        Appendable cSVPrinterOut = ((Appendable) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out"));
        boolean finalCSVPrinterOutTrouble = ((Boolean) getFieldValue(cSVPrinterOut, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalCSVPrinterOutTrouble);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printRecords([Ljava.lang.Object;)
    
    @Test
    public void testPrintRecords8() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords9() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        objectArray[1] = ((Object) cSVPrinter);
        objectArray[2] = ((Object) cSVPrinter);
        objectArray[3] = ((Object) cSVPrinter);
        objectArray[4] = ((Object) cSVPrinter);
        objectArray[5] = ((Object) cSVPrinter);
        objectArray[6] = ((Object) cSVPrinter);
        objectArray[7] = ((Object) cSVPrinter);
        objectArray[8] = ((Object) cSVPrinter);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:187)
            java.base/java.io.Writer.append(Writer.java:389)
            java.base/java.io.Writer.append(Writer.java:51)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords10() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NONE;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        objectArray[2] = object1;
        objectArray[3] = object1;
        objectArray[4] = object1;
        objectArray[5] = object1;
        objectArray[6] = object1;
        objectArray[7] = object1;
        objectArray[8] = object1;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:139)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:196)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords11() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NONE;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:139)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:196)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords12() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords13() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords14() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:237)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:229)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:76)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:165)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords15() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:237)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:229)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:76)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords16() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords17() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '0';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        objectArray[2] = object1;
        objectArray[3] = object1;
        objectArray[4] = object1;
        objectArray[5] = object1;
        objectArray[6] = object1;
        objectArray[7] = object1;
        objectArray[8] = object1;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:165)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords18() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        objectArray[1] = ((Object) cSVPrinter);
        objectArray[2] = ((Object) cSVPrinter);
        objectArray[3] = ((Object) cSVPrinter);
        objectArray[4] = ((Object) cSVPrinter);
        objectArray[5] = ((Object) cSVPrinter);
        objectArray[6] = ((Object) cSVPrinter);
        objectArray[7] = ((Object) cSVPrinter);
        objectArray[8] = ((Object) cSVPrinter);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords19() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\u0001";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:165)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords20() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\n";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords21() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords22() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\u0000";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords23() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\r";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords24() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '0');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:146)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords25() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords26() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        objectArray[1] = ((Object) cSVPrinter);
        objectArray[2] = ((Object) cSVPrinter);
        objectArray[3] = ((Object) cSVPrinter);
        objectArray[4] = ((Object) cSVPrinter);
        objectArray[5] = ((Object) cSVPrinter);
        objectArray[6] = ((Object) cSVPrinter);
        objectArray[7] = ((Object) cSVPrinter);
        objectArray[8] = ((Object) cSVPrinter);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    
    @Test
    public void testPrintRecords27() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\u0000";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printRecords] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:368)
            org.apache.commons.csv.CSVPrinter.printRecords(CSVPrinter.java:408) */
        cSVPrinter.printRecords(objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.printAndQuote
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndQuote_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:208) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): False}
 * @utbot.executesCondition {@code (newRecord): True}
 * @utbot.executesCondition {@code (c < '0'): False}
 * @utbot.executesCondition {@code (c > '9'): True}
 * @utbot.executesCondition {@code (c < 'A'): False}
 * @utbot.executesCondition {@code (c > 'Z'): True}
 * @utbot.executesCondition {@code (c < 'a'): False}
 * @utbot.executesCondition {@code (c > 'z'): False}
 * @utbot.executesCondition {@code (c <= COMMENT): False}
 * @utbot.executesCondition {@code (!quote): True}
 * @utbot.invokes {@link java.lang.CharSequence#charAt(int)}
 * @utbot.invokes {@link java.lang.CharSequence#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndQuote_ThrowStringIndexOutOfBoundsException_2() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "                                a ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483648]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:231) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 32;
        printAndQuoteMethodArguments[3] = 2147483617;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): True}
 * @utbot.executesCondition {@code (newRecord): True}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: final char c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndQuote_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147450868]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:264) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = -2147450868;
        printAndQuoteMethodArguments[3] = -2147483647;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): True}
 * @utbot.executesCondition {@code (newRecord): False}
 * @utbot.executesCondition {@code (!quote): True}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence,int,int)}
 * @utbot.invokes {@link java.io.PrintWriter#append(java.lang.CharSequence,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: out.append(value, start, end);
 *  */
    @Test
    public void testPrintAndQuote_ThrowStringIndexOutOfBoundsException_3() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        String string = "";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end -1, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.subSequence(String.java:2749)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:244) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = -1;
        printAndQuoteMethodArguments[3] = 0;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char delimChar = format.getDelimiter();
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:180) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = -255;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char quoteChar = format.getQuoteChar().charValue();
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_1() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:181) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = -255;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(quotePolicy)
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_9() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NON_NUMERIC;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = 0;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(quotePolicy)
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_10() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.ALL;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = 0;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_2() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '@');
        Character quoteChar = '@';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:208) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): True}
 * @utbot.executesCondition {@code (newRecord): True}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_6() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '@');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:264) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -2147483428;
        printAndQuoteMethodArguments[3] = -1874853887;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): False}
 * @utbot.executesCondition {@code (quote = !(object instanceof Number);): False}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence,int,int)}
 * @utbot.activatesSwitch {@code switch(quotePolicy) case: NON_NUMERIC}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(value, start, end);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_11() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NON_NUMERIC;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        LongAdder longAdder = new LongAdder();
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:254) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class longAdderType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", longAdderType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = longAdder;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 1;
        printAndQuoteMethodArguments[3] = -255;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): False}
 * @utbot.executesCondition {@code (newRecord): True}
 * @utbot.executesCondition {@code (c < '0'): False}
 * @utbot.executesCondition {@code (c > '9'): True}
 * @utbot.executesCondition {@code (c < 'A'): True}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(quoteChar);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_3() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "@";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): False}
 * @utbot.executesCondition {@code (newRecord): True}
 * @utbot.executesCondition {@code (c < '0'): False}
 * @utbot.executesCondition {@code (c > '9'): True}
 * @utbot.executesCondition {@code (c < 'A'): False}
 * @utbot.executesCondition {@code (c > 'Z'): True}
 * @utbot.executesCondition {@code (c < 'a'): False}
 * @utbot.executesCondition {@code (c > 'z'): True}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(quoteChar);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_4() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "{";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): False}
 * @utbot.executesCondition {@code (newRecord): True}
 * @utbot.executesCondition {@code (c < '0'): False}
 * @utbot.executesCondition {@code (c > '9'): True}
 * @utbot.executesCondition {@code (c < 'A'): False}
 * @utbot.executesCondition {@code (c > 'Z'): True}
 * @utbot.executesCondition {@code (c < 'a'): True}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(quoteChar);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_5() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "`";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): False}
 * @utbot.executesCondition {@code (newRecord): True}
 * @utbot.executesCondition {@code (c < '0'): False}
 * @utbot.executesCondition {@code (c > '9'): True}
 * @utbot.executesCondition {@code (c < 'A'): False}
 * @utbot.executesCondition {@code (c > 'Z'): True}
 * @utbot.executesCondition {@code (c < 'a'): False}
 * @utbot.executesCondition {@code (c > 'z'): False}
 * @utbot.executesCondition {@code (c <= COMMENT): False}
 * @utbot.executesCondition {@code (c == CR): False}
 * @utbot.executesCondition {@code (c == quoteChar): True}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(quoteChar);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_7() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = 'a';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "a ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (quotePolicy == null): True}
 * @utbot.executesCondition {@code (len <= 0): False}
 * @utbot.executesCondition {@code (newRecord): True}
 * @utbot.executesCondition {@code (c < '0'): False}
 * @utbot.executesCondition {@code (c > '9'): False}
 * @utbot.executesCondition {@code (c > 'Z'): False}
 * @utbot.executesCondition {@code (c > 'z'): False}
 * @utbot.executesCondition {@code (c <= COMMENT): False}
 * @utbot.executesCondition {@code (c == CR): False}
 * @utbot.executesCondition {@code (c == quoteChar): False}
 * @utbot.executesCondition {@code (c == delimChar): True}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.iterates iterate the loop {@code while(pos < end)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(quoteChar);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_8() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '0');
        Character quoteChar = 'O';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "0 ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)
    
    @Test
    public void testPrintAndQuote1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        String string = "`";
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
    }
    
    @Test
    public void testPrintAndQuote2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        String string = "{";
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
    }
    
    @Test
    public void testPrintAndQuote3() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = 'a';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        String string = "a";
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
    }
    
    @Test
    public void testPrintAndQuote4() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Object object = new Object();
        String string = "\u0004";
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
    }
    
    @Test
    public void testPrintAndQuote5() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        String string = "@";
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
    }
    
    @Test
    public void testPrintAndQuote6() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        String string = "\u0000";
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
    }
    
    @Test
    public void testPrintAndQuote7() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = -2147483647;
        printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
    }
    
    @Test
    public void testPrintAndQuote8() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 32;
        printAndQuoteMethodArguments[3] = 2147483617;
        printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)
    
    @Test
    public void testPrintAndQuote9() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.MINIMAL;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483647, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.subSequence(String.java:2749)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:244) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = -2147483647;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote10() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NONE;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:139)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:196) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote11() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        String string = "k";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:244) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote12() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NON_NUMERIC;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:254) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class integerType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", integerType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = integer;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote13() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.MINIMAL;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = -2147483647;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote14() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:244) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote15() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Object object = new Object();
        String string = "\u0004";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote16() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out1 = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        StringWriter out2 = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(out1, "java.io.BufferedWriter", "out", out2);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Object object = new Object();
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printAndQuote] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:131)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printAndQuoteMethod = cSVPrinterClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[4];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        try {
            printAndQuoteMethod.invoke(cSVPrinter, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.printComment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printComment(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.executesCondition {@code (!format.isCommentingEnabled()): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testPrintComment_NotFormatIsCommentingEnabled() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.printComment(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.executesCondition {@code (!format.isCommentingEnabled()): False}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getCommentStart()}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.invokes {@link java.lang.Appendable#append(char)}
 * @utbot.invokes {@link java.lang.Appendable#append(char)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVPrinter#println()}
 *  */
    @Test
    public void testPrintComment_NewRecord() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentStart = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "";
        
        cSVPrinter.printComment(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printComment(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#isCommentingEnabled()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !format.isCommentingEnabled()
 *  */
    @Test
    public void testPrintComment_ThrowNullPointerException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printComment] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printComment(CSVPrinter.java:298) */
        cSVPrinter.printComment(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.executesCondition {@code (!format.isCommentingEnabled()): False}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.invokes {@link java.lang.Appendable#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < comment.length(); i++)
 *  */
    @Test
    public void testPrintComment_ThrowNullPointerException_4() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentStart = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printComment] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printComment(CSVPrinter.java:306) */
        cSVPrinter.printComment(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.executesCondition {@code (!format.isCommentingEnabled()): False}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(format.getCommentStart().charValue());
 *  */
    @Test
    public void testPrintComment_ThrowNullPointerException_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentStart = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printComment] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printComment(CSVPrinter.java:304) */
        cSVPrinter.printComment(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.executesCondition {@code (!format.isCommentingEnabled()): False}
 * @utbot.executesCondition {@code (!newRecord): True}
 * @utbot.invokes {@link org.apache.commons.csv.CSVPrinter#println()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(format.getCommentStart().charValue());
 *  */
    @Test
    public void testPrintComment_ThrowNullPointerException_3() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentStart = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printComment] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printComment(CSVPrinter.java:304) */
        cSVPrinter.printComment(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.executesCondition {@code (!format.isCommentingEnabled()): False}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.invokes {@link java.lang.Appendable#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPrintComment_ThrowNullPointerException_2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentStart = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.printComment] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printComment(CSVPrinter.java:304) */
        cSVPrinter.printComment(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method printComment(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.executesCondition {@code (!format.isCommentingEnabled()): False}
 * @utbot.executesCondition {@code (!newRecord): True}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#isCommentingEnabled()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVPrinter#println()}
 * @utbot.throwsException {@link java.io.IOException} in: println();
 *  */
    @Test(expected = IOException.class)
    public void testPrintComment_ThrowIOException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentStart = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.printComment(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method printComment(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: out.append(format.getCommentStart().charValue());
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testPrintComment_ThrowReadOnlyBufferException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out1 = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentStart = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        cSVPrinter.printComment(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#printComment(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: out.append(format.getCommentStart().charValue());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPrintComment_ThrowIllegalStateException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out1 = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentStart = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        cSVPrinter.printComment(null);
    }
    ///endregion
    
    ///region Errors report for printComment
    
    public void testPrintComment_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.getOut
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOut()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#getOut()}
 * @utbot.returnsFrom {@code return this.out;}
 *  */
    @Test
    public void testGetOut_ReturnThisOut() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        Appendable actual = cSVPrinter.getOut();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.println
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method println()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#println()}
 *  */
    @Test
    public void testPrintln() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.println();
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#println()}
 *  */
    @Test
    public void testPrintln_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.println();
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#println()}
 *  */
    @Test
    public void testPrintln_2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.println();
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertTrue(finalCSVPrinterNewRecord);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method println()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#println()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String recordSeparator = format.getRecordSeparator();
 *  */
    @Test
    public void testPrintln_ThrowNullPointerException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.println] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.println(CSVPrinter.java:334) */
        cSVPrinter.println();
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#println()}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(recordSeparator);
 *  */
    @Test
    public void testPrintln_ThrowNullPointerException_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.println] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.println(CSVPrinter.java:336) */
        cSVPrinter.println();
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#println()}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPrintln_ThrowNullPointerException_2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = " ";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.println] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.println(CSVPrinter.java:336) */
        cSVPrinter.println();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method println()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#println()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getRecordSeparator()}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPrintln_ThrowIOException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.println();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method println()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#println()}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testPrintln_ThrowReadOnlyBufferException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = " ";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.println();
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#println()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPrintln_ThrowIllegalStateException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = " ";
        setField(format, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.println();
    }
    ///endregion
    
    ///region Errors report for println
    
    public void testPrintln_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.flush
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flush()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#flush()}
 * @utbot.executesCondition {@code (out instanceof Flushable): False}
 *  */
    @Test
    public void testFlush_NotOutNotInstanceOfFlushable() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        cSVPrinter.flush();
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#flush()}
 * @utbot.executesCondition {@code (out instanceof Flushable): True}
 *  */
    @Test
    public void testFlush_OutInstanceOfFlushable() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.flush();
        
        Appendable cSVPrinterOut = ((Appendable) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out"));
        boolean finalCSVPrinterOutTrouble = ((Boolean) getFieldValue(cSVPrinterOut, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalCSVPrinterOutTrouble);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#flush()}
 * @utbot.executesCondition {@code (out instanceof Flushable): True}
 *  */
    @Test
    public void testFlush_OutInstanceOfFlushable_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.flush();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flush()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#flush()}
 * @utbot.executesCondition {@code (out instanceof Flushable): True}
 * @utbot.invokes {@link java.io.Flushable#flush()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFlush_ThrowNullPointerException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.flush] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.flush(PrintWriter.java:394)
            org.apache.commons.csv.CSVPrinter.flush(CSVPrinter.java:90) */
        cSVPrinter.flush();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method flush()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#flush()}
 * @utbot.executesCondition {@code (out instanceof Flushable): True}
 * @utbot.invokes {@link java.io.Flushable#flush()}
 * @utbot.throwsException {@link java.io.IOException} in: ((Flushable) out).flush();
 *  */
    @Test(expected = IOException.class)
    public void testFlush_ThrowIOException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.flush();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method flush()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#flush()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: ((Flushable) out).flush();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFlush_ThrowIndexOutOfBoundsException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        ObjectOutputStream out2 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 256);
        setField(out2, "java.io.ObjectOutputStream", "bout", bout);
        setField(se, "sun.nio.cs.StreamEncoder", "out", out2);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.flush();
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#flush()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: ((Flushable) out).flush();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFlush_ThrowIndexOutOfBoundsException_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        ObjectOutputStream out2 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        setField(out2, "java.io.ObjectOutputStream", "bout", bout);
        setField(se, "sun.nio.cs.StreamEncoder", "out", out2);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.flush();
    }
    ///endregion
    
    ///region Errors report for flush
    
    public void testFlush_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.print
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method print(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String nullString = format.getNullString();
 *  */
    @Test
    public void testPrint_ThrowNullPointerException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:106) */
        cSVPrinter.print(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, strValue, 0, strValue.length());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:119)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(integer);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, strValue, 0, strValue.length());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_6() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        String nullString = " ";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, strValue, 0, strValue.length());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_7() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, strValue, 0, strValue.length());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = " ";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, strValue, 0, strValue.length());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_3() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\r";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, strValue, 0, strValue.length());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_4() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFA0');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "_";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:165)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, strValue, 0, strValue.length());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_5() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFDF');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = " ";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method print(java.lang.Object)
    
    @Test
    public void testPrint1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Integer integer = Integer.MIN_VALUE;
        
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint2() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Integer integer = Integer.MIN_VALUE;
        
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint3() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Integer integer = Integer.MIN_VALUE;
        
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint4() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint5() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint6() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\n";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        cSVPrinter.print(null);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertFalse(finalCSVPrinterNewRecord);
    }
    
    @Test
    public void testPrint7() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint8() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint9() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint10() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        cSVPrinter.print(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method print(java.lang.Object)
    
    @Test
    public void testPrint11() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        Character character = '\u0100';
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(character);
    }
    
    @Test
    public void testPrint12() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint13() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint14() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NONE;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:139)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:196)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint15() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(out1, "java.io.PrintWriter", "out", out);
        setField(out1, "java.io.Writer", "lock", out);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint16() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:244)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint17() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint18() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NONE;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:139)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:196)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint19() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Quote quotePolicy = Quote.NONE;
        setField(format, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:139)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:196)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint20() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(integer);
    }
    
    @Test
    public void testPrint21() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\u0001\u0000";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:146)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint22() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint23() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:121)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint24() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint25() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint26() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:237)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:229)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:76)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint27() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint28() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint29() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    
    @Test
    public void testPrint30() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        String nullString = "\n";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:111) */
        cSVPrinter.print(null);
    }
    ///endregion
    
    ///region Errors report for print
    
    public void testPrint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.print
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method print(java.lang.Object, java.lang.CharSequence, int, int)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 *  */
    @Test
    public void testPrint_NewRecord() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -1;
        printMethodArguments[3] = 0;
        printMethod.invoke(cSVPrinter, printMethodArguments);
        
        boolean finalCSVPrinterNewRecord = ((Boolean) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        
        assertFalse(finalCSVPrinterNewRecord);
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): True}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getDelimiter()}
 * @utbot.invokes {@link java.lang.Appendable#append(char)}
 *  */
    @Test
    public void testPrint_NotNewRecord() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -1;
        printMethodArguments[3] = 0;
        printMethod.invoke(cSVPrinter, printMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method print(java.lang.Object, java.lang.CharSequence, int, int)
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (format.isQuoting()): False}
 * @utbot.executesCondition {@code (format.isEscaping()): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: printAndEscape(value, offset, len);
 *  */
    @Test
    public void testPrint_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:142)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, stringType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = string;
        printMethodArguments[2] = -255;
        printMethodArguments[3] = 1;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (format.isQuoting()): False}
 * @utbot.executesCondition {@code (format.isEscaping()): False}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: out.append(value, offset, offset + len);
 *  */
    @Test
    public void testPrint_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.StringIndexOutOfBoundsException: begin 2, end -253, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.subSequence(String.java:2749)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, stringType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = string;
        printMethodArguments[2] = 2;
        printMethodArguments[3] = -255;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: format.isQuoting()
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_11() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:119) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -255;
        printMethodArguments[3] = -255;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(format.getDelimiter());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_21() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -255;
        printMethodArguments[3] = -255;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): True}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getDelimiter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(format.getDelimiter());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException1() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -255;
        printMethodArguments[3] = -255;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (format.isQuoting()): False}
 * @utbot.executesCondition {@code (format.isEscaping()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_51() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:142)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -254;
        printMethodArguments[3] = 1;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (format.isQuoting()): False}
 * @utbot.executesCondition {@code (format.isEscaping()): False}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(value, offset, offset + len);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_41() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -255;
        printMethodArguments[3] = -255;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (format.isQuoting()): False}
 * @utbot.executesCondition {@code (format.isEscaping()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_61() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "\u0000\r";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, stringType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = string;
        printMethodArguments[2] = 1;
        printMethodArguments[3] = 1;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (format.isQuoting()): False}
 * @utbot.executesCondition {@code (format.isEscaping()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_71() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "\u0000\n";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, stringType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = string;
        printMethodArguments[2] = 1;
        printMethodArguments[3] = 1;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (format.isQuoting()): False}
 * @utbot.executesCondition {@code (format.isEscaping()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_8() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "\r\u0000";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, stringType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = string;
        printMethodArguments[2] = 1;
        printMethodArguments[3] = 1;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (format.isQuoting()): False}
 * @utbot.executesCondition {@code (format.isEscaping()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_9() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFDF');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "\r ";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:154)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, stringType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = string;
        printMethodArguments[2] = 1;
        printMethodArguments[3] = 1;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (format.isQuoting()): False}
 * @utbot.executesCondition {@code (format.isEscaping()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_10() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        String string = "\u0000\uFFDF";
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:165)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, stringType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = string;
        printMethodArguments[2] = 1;
        printMethodArguments[3] = 1;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#print(java.lang.Object,java.lang.CharSequence,int,int)}
 * @utbot.executesCondition {@code (!newRecord): True}
 * @utbot.executesCondition {@code (format.isQuoting()): True}
 * @utbot.executesCondition {@code (format.isEscaping()): True}
 * @utbot.invokes {@link java.lang.Appendable#append(char)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#isEscaping()}
 * @utbot.invokes org.apache.commons.csv.CSVPrinter#printAndEscape(java.lang.CharSequence,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_31() throws Throwable  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = '\u0000';
        setField(format, "org.apache.commons.csv.CSVFormat", "escape", escape);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "format", format);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:117) */
        Class cSVPrinterClazz = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Method printMethod = cSVPrinterClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[4];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -1;
        printMethodArguments[3] = 0;
        try {
            printMethod.invoke(cSVPrinter, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVPrinter.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#close()}
 * @utbot.executesCondition {@code (out instanceof Closeable): False}
 *  */
    @Test
    public void testClose_NotOutNotInstanceOfCloseable() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        
        cSVPrinter.close();
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#close()}
 * @utbot.executesCondition {@code (out instanceof Closeable): True}
 *  */
    @Test
    public void testClose_OutInstanceOfCloseable() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.close();
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#close()}
 * @utbot.executesCondition {@code (out instanceof Closeable): True}
 *  */
    @Test
    public void testClose_OutInstanceOfCloseable_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.close();
        
        Appendable cSVPrinterOut = ((Appendable) getFieldValue(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out"));
        Writer finalCSVPrinterOutOut = ((Writer) getFieldValue(cSVPrinterOut, "java.io.PrintWriter", "out"));
        
        assertNull(finalCSVPrinterOutOut);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#close()}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testClose_ThrowReadOnlyBufferException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.close();
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#close()}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testClose_ThrowReadOnlyBufferException_1() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.close();
    }
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#close()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testClose_ThrowIllegalStateException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 3);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object lcb = createInstance("java.nio.HeapCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        cSVPrinter.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link CSVPrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVPrinter#close()}
 * @utbot.executesCondition {@code (out instanceof Closeable): True}
 * @utbot.invokes {@link java.io.Closeable#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        CSVPrinter cSVPrinter = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(cSVPrinter, "org.apache.commons.csv.CSVPrinter", "out", out);
        
        /* This test fails because method [org.apache.commons.csv.CSVPrinter.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.close(PrintWriter.java:412)
            org.apache.commons.csv.CSVPrinter.close(CSVPrinter.java:78) */
        cSVPrinter.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields965222368780000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields965222368780000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass965222368822700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields965222368780000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass965222368822700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields965222369149400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields965222369149400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass965222369151600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields965222369149400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass965222369151600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

