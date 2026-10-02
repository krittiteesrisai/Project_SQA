package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.List;
import com.google.debugging.sourcemap.SourceMapGeneratorV3;
import com.google.debugging.sourcemap.SourceMapGenerator;
import com.google.debugging.sourcemap.FilePosition;
import com.google.debugging.sourcemap.SourceMapGeneratorV2;
import com.google.debugging.sourcemap.SourceMapGeneratorV1;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.SourceMap.LocationMapping;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.io.IOException;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.SourceFile.OnDisk;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_SourceMapTest {
    ///region Test suites for executable com.google.javascript.jscomp.SourceMap.setPrefixMappings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPrefixMappings(java.util.List)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setPrefixMappings(java.util.List)}
 *  */
    @Test
    public void testSetPrefixMappings() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        
        sourceMap.setPrefixMappings(null);
        
        List finalSourceMapPrefixMappings = ((List) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "prefixMappings"));
        
        assertNull(finalSourceMapPrefixMappings);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceMap.setWrapperPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setWrapperPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setWrapperPrefix(java.lang.String)}
 *  */
    @Test
    public void testSetWrapperPrefix() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = "";
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition"));
        
        sourceMap.setWrapperPrefix(string);
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition"));
        
        assertFalse(initialSourceMapGeneratorPrefixPosition == finalSourceMapGeneratorPrefixPosition);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setWrapperPrefix(java.lang.String)}
 *  */
    @Test
    public void testSetWrapperPrefix_1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = "";
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition"));
        
        sourceMap.setWrapperPrefix(string);
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition"));
        
        assertFalse(initialSourceMapGeneratorPrefixPosition == finalSourceMapGeneratorPrefixPosition);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setWrapperPrefix(java.lang.String)}
 *  */
    @Test
    public void testSetWrapperPrefix_2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = " ";
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition"));
        
        sourceMap.setWrapperPrefix(string);
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition"));
        
        assertFalse(initialSourceMapGeneratorPrefixPosition == finalSourceMapGeneratorPrefixPosition);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setWrapperPrefix(java.lang.String)}
 *  */
    @Test
    public void testSetWrapperPrefix_3() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = "\n";
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition"));
        
        sourceMap.setWrapperPrefix(string);
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition"));
        
        assertFalse(initialSourceMapGeneratorPrefixPosition == finalSourceMapGeneratorPrefixPosition);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setWrapperPrefix(java.lang.String)}
 *  */
    @Test
    public void testSetWrapperPrefix_4() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = "\n";
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition"));
        
        sourceMap.setWrapperPrefix(string);
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition"));
        
        assertFalse(initialSourceMapGeneratorPrefixPosition == finalSourceMapGeneratorPrefixPosition);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setWrapperPrefix(java.lang.String)}
 *  */
    @Test
    public void testSetWrapperPrefix_5() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = "\u0000";
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition"));
        
        sourceMap.setWrapperPrefix(string);
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition"));
        
        assertFalse(initialSourceMapGeneratorPrefixPosition == finalSourceMapGeneratorPrefixPosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setWrapperPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setWrapperPrefix(java.lang.String)}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapGenerator#setWrapperPrefix(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.setWrapperPrefix(prefix);
 *  */
    @Test
    public void testSetWrapperPrefix_ThrowNullPointerException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.setWrapperPrefix] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.setWrapperPrefix(SourceMap.java:191) */
        sourceMap.setWrapperPrefix(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setWrapperPrefix(java.lang.String)
    
    @Test
    public void testSetWrapperPrefix1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = "\n\u0000\n\n\n\u0000";
        
        sourceMap.setWrapperPrefix(string);
    }
    
    @Test
    public void testSetWrapperPrefix2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = "\n\u0000\n\u0000\u0000\u0000";
        
        sourceMap.setWrapperPrefix(string);
    }
    
    @Test
    public void testSetWrapperPrefix3() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = "\u0000\u0000\n\u0000\u0000\u0000\u0000";
        
        sourceMap.setWrapperPrefix(string);
    }
    
    @Test
    public void testSetWrapperPrefix4() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        String string = "\u0000\n\n\n\n";
        
        sourceMap.setWrapperPrefix(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceMap.setStartingPosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setStartingPosition(int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 *  */
    @Test
    public void testSetStartingPosition() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "offsetPosition"));
        
        sourceMap.setStartingPosition(0, 0);
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "offsetPosition"));
        
        assertFalse(initialSourceMapGeneratorOffsetPosition == finalSourceMapGeneratorOffsetPosition);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 *  */
    @Test
    public void testSetStartingPosition_1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "offsetPosition"));
        
        sourceMap.setStartingPosition(0, 0);
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "offsetPosition"));
        
        assertFalse(initialSourceMapGeneratorOffsetPosition == finalSourceMapGeneratorOffsetPosition);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 *  */
    @Test
    public void testSetStartingPosition_2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV1 generator = ((SourceMapGeneratorV1) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV1", "offsetPosition"));
        
        sourceMap.setStartingPosition(0, 0);
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV1", "offsetPosition"));
        
        assertFalse(initialSourceMapGeneratorOffsetPosition == finalSourceMapGeneratorOffsetPosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setStartingPosition(int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapGenerator#setStartingPosition(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.setStartingPosition(offsetLine, offsetIndex);
 *  */
    @Test
    public void testSetStartingPosition_ThrowNullPointerException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.setStartingPosition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.setStartingPosition(SourceMap.java:187) */
        sourceMap.setStartingPosition(-255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setStartingPosition(int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.setStartingPosition(offsetLine, offsetIndex);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetStartingPosition_ThrowIllegalStateException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.setStartingPosition(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.setStartingPosition(offsetLine, offsetIndex);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetStartingPosition_ThrowIllegalStateException_1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.setStartingPosition(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.setStartingPosition(offsetLine, offsetIndex);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetStartingPosition_ThrowIllegalStateException_2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.setStartingPosition(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.setStartingPosition(offsetLine, offsetIndex);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetStartingPosition_ThrowIllegalStateException_3() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.setStartingPosition(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.setStartingPosition(offsetLine, offsetIndex);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetStartingPosition_ThrowIllegalStateException_4() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV1 generator = ((SourceMapGeneratorV1) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.setStartingPosition(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#setStartingPosition(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.setStartingPosition(offsetLine, offsetIndex);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetStartingPosition_ThrowIllegalStateException_5() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV1 generator = ((SourceMapGeneratorV1) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.setStartingPosition(-1, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceMap.fixupSourceLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fixupSourceLocation(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#fixupSourceLocation(java.lang.String)}
 * @utbot.executesCondition {@code (prefixMappings.isEmpty()): True}
 * @utbot.returnsFrom {@code return sourceFile;}
 *  */
    @Test
    public void testFixupSourceLocation_PrefixMappingsIsEmpty() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        ArrayList prefixMappings = new ArrayList();
        sourceMap.setPrefixMappings(prefixMappings);
        
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class stringType = Class.forName("java.lang.String");
        Method fixupSourceLocationMethod = sourceMapClazz.getDeclaredMethod("fixupSourceLocation", stringType);
        fixupSourceLocationMethod.setAccessible(true);
        java.lang.Object[] fixupSourceLocationMethodArguments = new java.lang.Object[1];
        fixupSourceLocationMethodArguments[0] = ((Object) null);
        String actual = ((String) fixupSourceLocationMethod.invoke(sourceMap, fixupSourceLocationMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#fixupSourceLocation(java.lang.String)}
 * @utbot.executesCondition {@code (prefixMappings.isEmpty()): False}
 * @utbot.executesCondition {@code (fixed != null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 *  */
    @Test
    public void testFixupSourceLocation_FixedNotEqualsNull() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        ArrayList prefixMappings = new ArrayList();
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        sourceMap.setPrefixMappings(prefixMappings);
        LinkedHashMap sourceLocationFixupCache = new LinkedHashMap();
        String string = "";
        sourceLocationFixupCache.put(null, string);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "sourceLocationFixupCache", sourceLocationFixupCache);
        
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class stringType = Class.forName("java.lang.String");
        Method fixupSourceLocationMethod = sourceMapClazz.getDeclaredMethod("fixupSourceLocation", stringType);
        fixupSourceLocationMethod.setAccessible(true);
        java.lang.Object[] fixupSourceLocationMethodArguments = new java.lang.Object[1];
        fixupSourceLocationMethodArguments[0] = ((Object) null);
        String actual = ((String) fixupSourceLocationMethod.invoke(sourceMap, fixupSourceLocationMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fixupSourceLocation(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#fixupSourceLocation(java.lang.String)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prefixMappings.isEmpty()
 *  */
    @Test
    public void testFixupSourceLocation_ThrowNullPointerException() throws Throwable  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.fixupSourceLocation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.fixupSourceLocation(SourceMap.java:150) */
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class stringType = Class.forName("java.lang.String");
        Method fixupSourceLocationMethod = sourceMapClazz.getDeclaredMethod("fixupSourceLocation", stringType);
        fixupSourceLocationMethod.setAccessible(true);
        java.lang.Object[] fixupSourceLocationMethodArguments = new java.lang.Object[1];
        fixupSourceLocationMethodArguments[0] = ((Object) null);
        try {
            fixupSourceLocationMethod.invoke(sourceMap, fixupSourceLocationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#fixupSourceLocation(java.lang.String)}
 * @utbot.executesCondition {@code (prefixMappings.isEmpty()): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String fixed = sourceLocationFixupCache.get(sourceFile);
 *  */
    @Test
    public void testFixupSourceLocation_ThrowNullPointerException_1() throws Throwable  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        ArrayList prefixMappings = new ArrayList();
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        sourceMap.setPrefixMappings(prefixMappings);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.fixupSourceLocation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.fixupSourceLocation(SourceMap.java:154) */
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class stringType = Class.forName("java.lang.String");
        Method fixupSourceLocationMethod = sourceMapClazz.getDeclaredMethod("fixupSourceLocation", stringType);
        fixupSourceLocationMethod.setAccessible(true);
        java.lang.Object[] fixupSourceLocationMethodArguments = new java.lang.Object[1];
        fixupSourceLocationMethodArguments[0] = ((Object) null);
        try {
            fixupSourceLocationMethod.invoke(sourceMap, fixupSourceLocationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#fixupSourceLocation(java.lang.String)}
 * @utbot.executesCondition {@code (prefixMappings.isEmpty()): False}
 * @utbot.executesCondition {@code (fixed != null): False}
 * @utbot.iterates iterate the loop {@code for(LocationMapping mapping: prefixMappings)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: sourceFile.startsWith(mapping.prefix)
 *  */
    @Test
    public void testFixupSourceLocation_ThrowNullPointerException_2() throws Throwable  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        ArrayList prefixMappings = new ArrayList();
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        sourceMap.setPrefixMappings(prefixMappings);
        LinkedHashMap sourceLocationFixupCache = new LinkedHashMap();
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "sourceLocationFixupCache", sourceLocationFixupCache);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.fixupSourceLocation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.fixupSourceLocation(SourceMap.java:161) */
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class stringType = Class.forName("java.lang.String");
        Method fixupSourceLocationMethod = sourceMapClazz.getDeclaredMethod("fixupSourceLocation", stringType);
        fixupSourceLocationMethod.setAccessible(true);
        java.lang.Object[] fixupSourceLocationMethodArguments = new java.lang.Object[1];
        fixupSourceLocationMethodArguments[0] = ((Object) null);
        try {
            fixupSourceLocationMethod.invoke(sourceMap, fixupSourceLocationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#fixupSourceLocation(java.lang.String)}
 * @utbot.executesCondition {@code (prefixMappings.isEmpty()): False}
 * @utbot.executesCondition {@code (fixed != null): False}
 * @utbot.iterates iterate the loop {@code for(LocationMapping mapping: prefixMappings)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: sourceFile.startsWith(mapping.prefix)
 *  */
    @Test
    public void testFixupSourceLocation_ThrowNullPointerException_3() throws Throwable  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        ArrayList prefixMappings = new ArrayList();
        SourceMap.LocationMapping locationMapping = ((SourceMap.LocationMapping) createInstance("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        String prefix = "";
        setField(locationMapping, "com.google.javascript.jscomp.SourceMap$LocationMapping", "prefix", prefix);
        prefixMappings.add(locationMapping);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        sourceMap.setPrefixMappings(prefixMappings);
        LinkedHashMap sourceLocationFixupCache = new LinkedHashMap();
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "sourceLocationFixupCache", sourceLocationFixupCache);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.fixupSourceLocation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.fixupSourceLocation(SourceMap.java:161) */
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class stringType = Class.forName("java.lang.String");
        Method fixupSourceLocationMethod = sourceMapClazz.getDeclaredMethod("fixupSourceLocation", stringType);
        fixupSourceLocationMethod.setAccessible(true);
        java.lang.Object[] fixupSourceLocationMethodArguments = new java.lang.Object[1];
        fixupSourceLocationMethodArguments[0] = ((Object) null);
        try {
            fixupSourceLocationMethod.invoke(sourceMap, fixupSourceLocationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceMap.validate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method validate(boolean)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#validate(boolean)}
 *  */
    @Test
    public void testValidate() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.validate(false);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#validate(boolean)}
 *  */
    @Test
    public void testValidate_1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.validate(false);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#validate(boolean)}
 *  */
    @Test
    public void testValidate_2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV1 generator = ((SourceMapGeneratorV1) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.validate(false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validate(boolean)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#validate(boolean)}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapGenerator#validate(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.validate(validate);
 *  */
    @Test
    public void testValidate_ThrowNullPointerException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.validate] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.validate(SourceMap.java:195) */
        sourceMap.validate(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceMap.appendTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendTo(java.lang.Appendable, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.appendTo(out, name);
 *  */
    @Test
    public void testAppendTo_ThrowNullPointerException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.appendTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.appendTo(SourceMap.java:178) */
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.appendTo(out, name);
 *  */
    @Test
    public void testAppendTo_ThrowNullPointerException_7() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.appendTo] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV3.prepMappings(SourceMapGeneratorV3.java:396)
            com.google.debugging.sourcemap.SourceMapGeneratorV3.appendTo(SourceMapGeneratorV3.java:276)
            com.google.javascript.jscomp.SourceMap.appendTo(SourceMap.java:178) */
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.appendTo(out, name);
 *  */
    @Test
    public void testAppendTo_ThrowNullPointerException_8() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.appendTo] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV2.prepMappings(SourceMapGeneratorV2.java:402)
            com.google.debugging.sourcemap.SourceMapGeneratorV2.appendTo(SourceMapGeneratorV2.java:274)
            com.google.javascript.jscomp.SourceMap.appendTo(SourceMap.java:178) */
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.appendTo(out, name);
 *  */
    @Test
    public void testAppendTo_ThrowNullPointerException_3() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.appendTo] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal.maybeVisitParent(SourceMapGeneratorV3.java:569)
            com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal.traverse(SourceMapGeneratorV3.java:506)
            com.google.debugging.sourcemap.SourceMapGeneratorV3.prepMappings(SourceMapGeneratorV3.java:380)
            com.google.debugging.sourcemap.SourceMapGeneratorV3.appendTo(SourceMapGeneratorV3.java:276)
            com.google.javascript.jscomp.SourceMap.appendTo(SourceMap.java:178) */
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.appendTo(out, name);
 *  */
    @Test
    public void testAppendTo_ThrowNullPointerException_4() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.appendTo] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV2$MappingTraversal.maybeVisitParent(SourceMapGeneratorV2.java:851)
            com.google.debugging.sourcemap.SourceMapGeneratorV2$MappingTraversal.traverse(SourceMapGeneratorV2.java:788)
            com.google.debugging.sourcemap.SourceMapGeneratorV2.prepMappings(SourceMapGeneratorV2.java:388)
            com.google.debugging.sourcemap.SourceMapGeneratorV2.appendTo(SourceMapGeneratorV2.java:274)
            com.google.javascript.jscomp.SourceMap.appendTo(SourceMap.java:178) */
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendTo_ThrowNullPointerException_1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        Object mapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping");
        mappings.add(mapping);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.appendTo] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal.getAdjustedLine(SourceMapGeneratorV3.java:523)
            com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal.maybeVisitParent(SourceMapGeneratorV3.java:569)
            com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal.traverse(SourceMapGeneratorV3.java:506)
            com.google.debugging.sourcemap.SourceMapGeneratorV3.prepMappings(SourceMapGeneratorV3.java:380)
            com.google.debugging.sourcemap.SourceMapGeneratorV3.appendTo(SourceMapGeneratorV3.java:276)
            com.google.javascript.jscomp.SourceMap.appendTo(SourceMap.java:178) */
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendTo_ThrowNullPointerException_5() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        Object mapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2$Mapping");
        mappings.add(mapping);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.appendTo] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV2$MappingTraversal.getAdjustedLine(SourceMapGeneratorV2.java:805)
            com.google.debugging.sourcemap.SourceMapGeneratorV2$MappingTraversal.maybeVisitParent(SourceMapGeneratorV2.java:851)
            com.google.debugging.sourcemap.SourceMapGeneratorV2$MappingTraversal.traverse(SourceMapGeneratorV2.java:788)
            com.google.debugging.sourcemap.SourceMapGeneratorV2.prepMappings(SourceMapGeneratorV2.java:388)
            com.google.debugging.sourcemap.SourceMapGeneratorV2.appendTo(SourceMapGeneratorV2.java:274)
            com.google.javascript.jscomp.SourceMap.appendTo(SourceMap.java:178) */
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendTo_ThrowNullPointerException_2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        Object mapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping");
        FilePosition startPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(mapping, "com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping", "startPosition", startPosition);
        mappings.add(mapping);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.appendTo] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal.getAdjustedLine(SourceMapGeneratorV3.java:523)
            com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal.maybeVisitParent(SourceMapGeneratorV3.java:569)
            com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal.traverse(SourceMapGeneratorV3.java:506)
            com.google.debugging.sourcemap.SourceMapGeneratorV3.prepMappings(SourceMapGeneratorV3.java:380)
            com.google.debugging.sourcemap.SourceMapGeneratorV3.appendTo(SourceMapGeneratorV3.java:276)
            com.google.javascript.jscomp.SourceMap.appendTo(SourceMap.java:178) */
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendTo_ThrowNullPointerException_6() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        Object mapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2$Mapping");
        FilePosition startPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(mapping, "com.google.debugging.sourcemap.SourceMapGeneratorV2$Mapping", "startPosition", startPosition);
        mappings.add(mapping);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.appendTo] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV2$MappingTraversal.getAdjustedLine(SourceMapGeneratorV2.java:805)
            com.google.debugging.sourcemap.SourceMapGeneratorV2$MappingTraversal.maybeVisitParent(SourceMapGeneratorV2.java:851)
            com.google.debugging.sourcemap.SourceMapGeneratorV2$MappingTraversal.traverse(SourceMapGeneratorV2.java:788)
            com.google.debugging.sourcemap.SourceMapGeneratorV2.prepMappings(SourceMapGeneratorV2.java:388)
            com.google.debugging.sourcemap.SourceMapGeneratorV2.appendTo(SourceMapGeneratorV2.java:274)
            com.google.javascript.jscomp.SourceMap.appendTo(SourceMap.java:178) */
        sourceMap.appendTo(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendTo(java.lang.Appendable, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.appendTo(out, name);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendTo_ThrowIllegalStateException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        Object mapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping");
        FilePosition startPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(startPosition, "com.google.debugging.sourcemap.FilePosition", "column", Integer.MAX_VALUE);
        setField(mapping, "com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping", "startPosition", startPosition);
        mappings.add(mapping);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        FilePosition prefixPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(prefixPosition, "com.google.debugging.sourcemap.FilePosition", "column", Integer.MIN_VALUE);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition", prefixPosition);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.appendTo(out, name);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendTo_ThrowIllegalStateException_1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        Object mapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping");
        FilePosition startPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(startPosition, "com.google.debugging.sourcemap.FilePosition", "line", 2);
        setField(startPosition, "com.google.debugging.sourcemap.FilePosition", "column", -1);
        setField(mapping, "com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping", "startPosition", startPosition);
        mappings.add(mapping);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        FilePosition prefixPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(prefixPosition, "com.google.debugging.sourcemap.FilePosition", "line", -2);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition", prefixPosition);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.appendTo(out, name);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendTo_ThrowIllegalStateException_2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        Object mapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2$Mapping");
        FilePosition startPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(startPosition, "com.google.debugging.sourcemap.FilePosition", "line", -3);
        setField(startPosition, "com.google.debugging.sourcemap.FilePosition", "column", -1);
        setField(mapping, "com.google.debugging.sourcemap.SourceMapGeneratorV2$Mapping", "startPosition", startPosition);
        mappings.add(mapping);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        FilePosition prefixPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(prefixPosition, "com.google.debugging.sourcemap.FilePosition", "line", 3);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition", prefixPosition);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.appendTo(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: generator.appendTo(out, name);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendTo_ThrowIllegalStateException_3() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        Object mapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2$Mapping");
        FilePosition startPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(startPosition, "com.google.debugging.sourcemap.FilePosition", "column", Integer.MAX_VALUE);
        setField(mapping, "com.google.debugging.sourcemap.SourceMapGeneratorV2$Mapping", "startPosition", startPosition);
        mappings.add(mapping);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        FilePosition prefixPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(prefixPosition, "com.google.debugging.sourcemap.FilePosition", "column", Integer.MIN_VALUE);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition", prefixPosition);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        sourceMap.appendTo(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method appendTo(java.lang.Appendable, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAppendTo_ThrowIOException() throws Throwable  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        FilePosition prefixPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition", prefixPosition);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class stringType = Class.forName("java.lang.String");
        Method appendToMethod = sourceMapClazz.getDeclaredMethod("appendTo", outputStreamWriterType, stringType);
        appendToMethod.setAccessible(true);
        java.lang.Object[] appendToMethodArguments = new java.lang.Object[2];
        appendToMethodArguments[0] = outputStreamWriter;
        appendToMethodArguments[1] = ((Object) null);
        try {
            appendToMethod.invoke(sourceMap, appendToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#appendTo(java.lang.Appendable,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAppendTo_ThrowIOException_1() throws Throwable  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        FilePosition prefixPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition", prefixPosition);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class stringType = Class.forName("java.lang.String");
        Method appendToMethod = sourceMapClazz.getDeclaredMethod("appendTo", outputStreamWriterType, stringType);
        appendToMethod.setAccessible(true);
        java.lang.Object[] appendToMethodArguments = new java.lang.Object[2];
        appendToMethodArguments[0] = outputStreamWriter;
        appendToMethodArguments[1] = ((Object) null);
        try {
            appendToMethod.invoke(sourceMap, appendToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceMap.reset
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reset()
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.reset();
 *  */
    @Test
    public void testReset_ThrowNullPointerException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.reset] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.reset(SourceMap.java:182) */
        sourceMap.reset();
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sourceLocationFixupCache.clear();
 *  */
    @Test
    public void testReset_ThrowNullPointerException_2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        LinkedHashMap sourceFileMap = new LinkedHashMap();
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "sourceFileMap", sourceFileMap);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "originalNameMap", sourceFileMap);
        String lastSourceFile = "";
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "lastSourceFile", lastSourceFile);
        Object lastMapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2$Mapping");
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "lastMapping", lastMapping);
        FilePosition offsetPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "offsetPosition", offsetPosition);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition", offsetPosition);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.reset] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.reset(SourceMap.java:183) */
        sourceMap.reset();
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sourceLocationFixupCache.clear();
 *  */
    @Test
    public void testReset_ThrowNullPointerException_1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        LinkedHashMap sourceFileMap = new LinkedHashMap();
        sourceFileMap.put(null, null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "sourceFileMap", sourceFileMap);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "originalNameMap", sourceFileMap);
        String lastSourceFile = "";
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "lastSourceFile", lastSourceFile);
        Object lastMapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping");
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "lastMapping", lastMapping);
        FilePosition offsetPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "offsetPosition", offsetPosition);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition", offsetPosition);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.reset] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.reset(SourceMap.java:183) */
        sourceMap.reset();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reset()
    
    @Test
    public void testReset1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        mappings.add(null);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        mappings.add(objectArray);
        mappings.add(objectArray);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        LinkedHashMap sourceFileMap = new LinkedHashMap();
        Integer integer = 0;
        sourceFileMap.put(null, integer);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "sourceFileMap", sourceFileMap);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "originalNameMap", sourceFileMap);
        String lastSourceFile = "";
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "lastSourceFile", lastSourceFile);
        Object lastMapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping");
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "lastMapping", lastMapping);
        FilePosition offsetPosition = ((FilePosition) createInstance("com.google.debugging.sourcemap.FilePosition"));
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "offsetPosition", offsetPosition);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "prefixPosition", offsetPosition);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        LinkedHashMap sourceLocationFixupCache = new LinkedHashMap();
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "sourceLocationFixupCache", sourceLocationFixupCache);
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "offsetPosition"));
        
        sourceMap.reset();
        
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        int finalSourceMapGeneratorLastSourceFileIndex = ((Integer) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "lastSourceFileIndex"));
        SourceMapGenerator sourceMapGenerator2 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        Object finalSourceMapGeneratorLastMapping = getFieldValue(sourceMapGenerator2, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "lastMapping");
        SourceMapGenerator sourceMapGenerator3 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator3, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "offsetPosition"));
        
        assertFalse(initialSourceMapGeneratorOffsetPosition == finalSourceMapGeneratorOffsetPosition);
        
        assertEquals(-1, finalSourceMapGeneratorLastSourceFileIndex);
        
        assertNull(finalSourceMapGeneratorLastMapping);
    }
    
    @Test
    public void testReset2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        LinkedHashMap sourceFileMap = new LinkedHashMap();
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "sourceFileMap", sourceFileMap);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "originalNameMap", sourceFileMap);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        LinkedHashMap sourceLocationFixupCache = new LinkedHashMap();
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "sourceLocationFixupCache", sourceLocationFixupCache);
        
        SourceMapGenerator sourceMapGenerator = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "offsetPosition"));
        SourceMapGenerator sourceMapGenerator1 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition initialSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator1, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition"));
        
        sourceMap.reset();
        
        SourceMapGenerator sourceMapGenerator2 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        int finalSourceMapGeneratorLastSourceFileIndex = ((Integer) getFieldValue(sourceMapGenerator2, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "lastSourceFileIndex"));
        SourceMapGenerator sourceMapGenerator3 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorOffsetPosition = ((FilePosition) getFieldValue(sourceMapGenerator3, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "offsetPosition"));
        SourceMapGenerator sourceMapGenerator4 = ((SourceMapGenerator) getFieldValue(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator"));
        FilePosition finalSourceMapGeneratorPrefixPosition = ((FilePosition) getFieldValue(sourceMapGenerator4, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "prefixPosition"));
        
        assertFalse(initialSourceMapGeneratorOffsetPosition == finalSourceMapGeneratorOffsetPosition);
        
        assertFalse(initialSourceMapGeneratorPrefixPosition == finalSourceMapGeneratorPrefixPosition);
        
        assertEquals(-1, finalSourceMapGeneratorLastSourceFileIndex);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reset()
    
    @Test
    public void testReset3() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV2 generator = ((SourceMapGeneratorV2) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        ArrayList mappings = new ArrayList();
        mappings.add(null);
        mappings.add(null);
        mappings.add(null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "mappings", mappings);
        LinkedHashMap sourceFileMap = new LinkedHashMap();
        Integer integer = 0;
        sourceFileMap.put(null, integer);
        String string = "";
        sourceFileMap.put(string, integer);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "sourceFileMap", sourceFileMap);
        Object lastMapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV2$Mapping");
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV2", "lastMapping", lastMapping);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.reset] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV2.reset(SourceMapGeneratorV2.java:98)
            com.google.javascript.jscomp.SourceMap.reset(SourceMap.java:182) */
        sourceMap.reset();
    }
    
    @Test
    public void testReset4() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMapGeneratorV3 generator = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        ArrayList mappings = new ArrayList();
        mappings.add(null);
        mappings.add(null);
        Object mapping = createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping");
        mappings.add(mapping);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "mappings", mappings);
        LinkedHashMap sourceFileMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Integer integer = 0;
        sourceFileMap.put(string, integer);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        sourceFileMap.put(string1, null);
        setField(generator, "com.google.debugging.sourcemap.SourceMapGeneratorV3", "sourceFileMap", sourceFileMap);
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "generator", generator);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.reset] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapGeneratorV3.reset(SourceMapGeneratorV3.java:99)
            com.google.javascript.jscomp.SourceMap.reset(SourceMap.java:182) */
        sourceMap.reset();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SourceMap.addMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addMapping(com.google.javascript.rhino.Node, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddMapping_Return() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        Node node = new Node(0);
        
        sourceMap.addMapping(node, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddMapping_Return_1() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        sourceMap.addMapping(node, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLineno()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddMapping_NodeGetLineno() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.OnDisk objectValue = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        sourceMap.addMapping(node, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddMapping_Return_2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SimpleSourceFile objectValue = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        sourceMap.addMapping(node, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addMapping(com.google.javascript.rhino.Node, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String sourceFile = node.getSourceFileName();
 *  */
    @Test
    public void testAddMapping_ThrowClassCastException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.addMapping] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.jstype.StaticSourceFile ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.StaticSourceFile is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1087)
            com.google.javascript.rhino.Node.getSourceFileName(Node.java:1081)
            com.google.javascript.jscomp.SourceMap.addMapping(SourceMap.java:121) */
        sourceMap.addMapping(node, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sourceFile = node.getSourceFileName();
 *  */
    @Test
    public void testAddMapping_ThrowNullPointerException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.addMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.addMapping(SourceMap.java:121) */
        sourceMap.addMapping(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sourceFile = fixupSourceLocation(sourceFile);
 *  */
    @Test
    public void testAddMapping_ThrowNullPointerException_1() throws Throwable  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", 1);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.addMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.fixupSourceLocation(SourceMap.java:150)
            com.google.javascript.jscomp.SourceMap.addMapping(SourceMap.java:130) */
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class filePositionType = Class.forName("com.google.debugging.sourcemap.FilePosition");
        Method addMappingMethod = sourceMapClazz.getDeclaredMethod("addMapping", numberNodeType, filePositionType, filePositionType);
        addMappingMethod.setAccessible(true);
        java.lang.Object[] addMappingMethodArguments = new java.lang.Object[3];
        addMappingMethodArguments[0] = numberNode;
        addMappingMethodArguments[1] = ((Object) null);
        addMappingMethodArguments[2] = ((Object) null);
        try {
            addMappingMethod.invoke(sourceMap, addMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getProp(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLineno()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getCharno()}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapGenerator#addMapping(java.lang.String,java.lang.String,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator.addMapping(sourceFile, originalName, new FilePosition(node.getLineno(), node.getCharno()), outputStartPosition, outputEndPosition);
 *  */
    @Test
    public void testAddMapping_ThrowNullPointerException_3() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        ArrayList prefixMappings = new ArrayList();
        sourceMap.setPrefixMappings(prefixMappings);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.OnDisk objectValue = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", 4);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.addMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.addMapping(SourceMap.java:139) */
        sourceMap.addMapping(node, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sourceFile = fixupSourceLocation(sourceFile);
 *  */
    @Test
    public void testAddMapping_ThrowNullPointerException_2() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        ArrayList prefixMappings = new ArrayList();
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        sourceMap.setPrefixMappings(prefixMappings);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", 1);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.addMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.fixupSourceLocation(SourceMap.java:154)
            com.google.javascript.jscomp.SourceMap.addMapping(SourceMap.java:130) */
        sourceMap.addMapping(node, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sourceFile = fixupSourceLocation(sourceFile);
 *  */
    @Test
    public void testAddMapping_ThrowNullPointerException_4() throws Throwable  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        ArrayList prefixMappings = new ArrayList();
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        prefixMappings.add(null);
        sourceMap.setPrefixMappings(prefixMappings);
        LinkedHashMap sourceLocationFixupCache = new LinkedHashMap();
        setField(sourceMap, "com.google.javascript.jscomp.SourceMap", "sourceLocationFixupCache", sourceLocationFixupCache);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", 1);
        
        /* This test fails because method [com.google.javascript.jscomp.SourceMap.addMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SourceMap.fixupSourceLocation(SourceMap.java:161)
            com.google.javascript.jscomp.SourceMap.addMapping(SourceMap.java:130) */
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class filePositionType = Class.forName("com.google.debugging.sourcemap.FilePosition");
        Method addMappingMethod = sourceMapClazz.getDeclaredMethod("addMapping", numberNodeType, filePositionType, filePositionType);
        addMappingMethod.setAccessible(true);
        java.lang.Object[] addMappingMethodArguments = new java.lang.Object[3];
        addMappingMethodArguments[0] = numberNode;
        addMappingMethodArguments[1] = ((Object) null);
        addMappingMethodArguments[2] = ((Object) null);
        try {
            addMappingMethod.invoke(sourceMap, addMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addMapping(com.google.javascript.rhino.Node, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)
    
    /**
    @utbot.classUnderTest {@link SourceMap}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SourceMap#addMapping(com.google.javascript.rhino.Node,com.google.debugging.sourcemap.FilePosition,com.google.debugging.sourcemap.FilePosition)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getSourceFileName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddMapping_ThrowUnsupportedOperationException() throws Exception  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        sourceMap.addMapping(node, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields890850828428600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields890850828428600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass890850828438200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields890850828428600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass890850828438200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields890850829238700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields890850829238700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass890850829242700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields890850829238700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass890850829242700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

