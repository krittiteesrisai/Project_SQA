package com.google.javascript.rhino;

import org.junit.Test;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import java.util.ArrayList;
import com.google.javascript.rhino.JSDocInfo.Marker;
import com.google.javascript.rhino.JSDocInfo.StringPosition;
import com.google.javascript.rhino.JSDocInfo.TypePosition;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.Set;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_rhino_JSDocInfoBuilderTest {
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.build
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method build(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#build(java.lang.String)}
 * @utbot.executesCondition {@code (populated): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testBuild_NotPopulated() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        JSDocInfo actual = jSDocInfoBuilder.build(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#build(java.lang.String)}
 * @utbot.executesCondition {@code (populated): True}
 * @utbot.returnsFrom {@code return built;}
 *  */
    @Test
    public void testBuild_Populated() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.PRIVATE;
        currentInfo.setVisibility(visibility);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated", true);
        
        JSDocInfo initialJSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        
        JSDocInfo actual = jSDocInfoBuilder.build(null);
        
        Object actualInfo = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "info");
        assertNull(actualInfo);
        
        Object actualDocumentation = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "documentation");
        assertNull(actualDocumentation);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        JSDocInfo.Visibility currentInfoVisibility = currentInfo.getVisibility();
        JSDocInfo.Visibility actualVisibility = actual.getVisibility();
        assertEquals(currentInfoVisibility, actualVisibility);
        
        int currentInfoBitset = ((Integer) getFieldValue(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        int actualBitset = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        assertEquals(currentInfoBitset, actualBitset);
        
        JSTypeExpression actualType = actual.getType();
        assertNull(actualType);
        
        JSTypeExpression actualThisType = actual.getThisType();
        assertNull(actualThisType);
        
        boolean actualIncludeDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation"));
        assertFalse(actualIncludeDocumentation);
        
        JSDocInfo finalJSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfo == finalJSDocInfoBuilderCurrentInfo);
        
        assertFalse(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#build(java.lang.String)}
 * @utbot.executesCondition {@code (populated): True}
 * @utbot.returnsFrom {@code return built;}
 *  */
    @Test
    public void testBuild_Populated_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated", true);
        
        JSDocInfo initialJSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        
        JSDocInfo actual = jSDocInfoBuilder.build(null);
        
        Object actualInfo = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "info");
        assertNull(actualInfo);
        
        Object actualDocumentation = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "documentation");
        assertNull(actualDocumentation);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        JSDocInfo.Visibility currentInfoVisibility = currentInfo.getVisibility();
        JSDocInfo.Visibility actualVisibility = actual.getVisibility();
        assertEquals(currentInfoVisibility, actualVisibility);
        
        int currentInfoBitset = ((Integer) getFieldValue(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        int actualBitset = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        assertEquals(currentInfoBitset, actualBitset);
        
        JSTypeExpression actualType = actual.getType();
        assertNull(actualType);
        
        JSTypeExpression actualThisType = actual.getThisType();
        assertNull(actualThisType);
        
        boolean actualIncludeDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation"));
        assertFalse(actualIncludeDocumentation);
        
        JSDocInfo finalJSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfo == finalJSDocInfoBuilderCurrentInfo);
        
        assertFalse(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method build(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#build(java.lang.String)}
 * @utbot.executesCondition {@code (populated): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setSourceName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: built.setSourceName(sourceName);
 *  */
    @Test
    public void testBuild_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated", true);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.build] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.build(JSDocInfoBuilder.java:110) */
        jSDocInfoBuilder.build(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.addReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addReference(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addReference(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAddReference_ReturnTrue_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.addReference(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addReference(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAddReference_ReturnTrue() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        boolean actual = jSDocInfoBuilder.addReference(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "documentation");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoDocumentation == finalJSDocInfoBuilderCurrentInfoDocumentation);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addReference(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAddReference_ReturnTrue_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.addReference(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addReference(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAddReference_ReturnTrue_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        ArrayList sees = new ArrayList();
        sees.add(null);
        sees.add(null);
        sees.add(null);
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "sees", sees);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.addReference(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addReference(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addReference(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#documentReference(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.documentReference(reference)
 *  */
    @Test
    public void testAddReference_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.addReference] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.addReference(JSDocInfoBuilder.java:302) */
        jSDocInfoBuilder.addReference(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordThrowType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordThrowType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordThrowType_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordThrowType(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordThrowType_ReturnFalse_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordThrowType(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordThrowType_ReturnFalse_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordThrowType(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordThrowType_ReturnTrue() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        boolean actual = jSDocInfoBuilder.recordThrowType(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoInfo == finalJSDocInfoBuilderCurrentInfoInfo);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordThrowType_ReturnTrue_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList thrownTypes = new ArrayList();
        thrownTypes.add(null);
        thrownTypes.add(null);
        thrownTypes.add(null);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "thrownTypes", thrownTypes);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordThrowType(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordThrowType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !hasAnySingletonTypeTags()
 *  */
    @Test
    public void testRecordThrowType_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordThrowType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags(JSDocInfoBuilder.java:765)
            com.google.javascript.rhino.JSDocInfoBuilder.recordThrowType(JSDocInfoBuilder.java:261) */
        jSDocInfoBuilder.recordThrowType(null);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method recordThrowType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowType(com.google.javascript.rhino.JSTypeExpression)}
     */
    @Test(timeout = 1000L)
    public void testRecordThrowType() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(false);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        jSDocInfoBuilder.recordThrowType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.markText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markText(java.lang.String, int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markText(java.lang.String,int,int,int,int)}
 * @utbot.executesCondition {@code (currentMarker != null): False}
 *  */
    @Test
    public void testMarkText_CurrentMarkerEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        jSDocInfoBuilder.markText(null, -255, -255, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markText(java.lang.String,int,int,int,int)}
 * @utbot.executesCondition {@code (currentMarker != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo.StringPosition#setItem(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo.StringPosition#setPositionInformation(int,int,int,int)}
 *  */
    @Test
    public void testMarkText_CurrentMarkerNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo.Marker currentMarker = ((JSDocInfo.Marker) createInstance("com.google.javascript.rhino.JSDocInfo$Marker"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker", currentMarker);
        
        JSDocInfo.Marker jSDocInfoBuilderCurrentMarker = ((JSDocInfo.Marker) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker"));
        JSDocInfo.StringPosition initialJSDocInfoBuilderCurrentMarkerDescription = ((JSDocInfo.StringPosition) getFieldValue(jSDocInfoBuilderCurrentMarker, "com.google.javascript.rhino.JSDocInfo$Marker", "description"));
        
        jSDocInfoBuilder.markText(null, -255, -255, -255, -255);
        
        JSDocInfo.Marker jSDocInfoBuilderCurrentMarker1 = ((JSDocInfo.Marker) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker"));
        JSDocInfo.StringPosition finalJSDocInfoBuilderCurrentMarkerDescription = ((JSDocInfo.StringPosition) getFieldValue(jSDocInfoBuilderCurrentMarker1, "com.google.javascript.rhino.JSDocInfo$Marker", "description"));
        
        assertFalse(initialJSDocInfoBuilderCurrentMarkerDescription == finalJSDocInfoBuilderCurrentMarkerDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markAnnotation(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markAnnotation(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (marker != null): False}
 *  */
    @Test
    public void testMarkAnnotation_MarkerEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        jSDocInfoBuilder.markAnnotation(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markAnnotation(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (marker != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo.StringPosition#setItem(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo.StringPosition#setPositionInformation(int,int,int,int)}
 *  */
    @Test
    public void testMarkAnnotation_MarkerNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        ArrayList markers = new ArrayList();
        markers.add(null);
        markers.add(null);
        markers.add(null);
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "markers", markers);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSDocInfo.Marker currentMarker = ((JSDocInfo.Marker) createInstance("com.google.javascript.rhino.JSDocInfo$Marker"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker", currentMarker);
        String string = "";
        
        JSDocInfo.Marker initialJSDocInfoBuilderCurrentMarker = ((JSDocInfo.Marker) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker"));
        
        jSDocInfoBuilder.markAnnotation(string, -255, -255);
        
        JSDocInfo.Marker finalJSDocInfoBuilderCurrentMarker = ((JSDocInfo.Marker) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker"));
        
        assertFalse(initialJSDocInfoBuilderCurrentMarker == finalJSDocInfoBuilderCurrentMarker);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method markAnnotation(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markAnnotation(java.lang.String,int,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#addMarker()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo.Marker marker = currentInfo.addMarker();
 *  */
    @Test
    public void testMarkAnnotation_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation(JSDocInfoBuilder.java:132) */
        jSDocInfoBuilder.markAnnotation(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markAnnotation(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (marker != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: charno + annotation.length()
 *  */
    @Test
    public void testMarkAnnotation_ThrowNullPointerException_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation(JSDocInfoBuilder.java:138) */
        jSDocInfoBuilder.markAnnotation(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markAnnotation(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (marker != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: charno + annotation.length()
 *  */
    @Test
    public void testMarkAnnotation_ThrowNullPointerException_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation(JSDocInfoBuilder.java:138) */
        jSDocInfoBuilder.markAnnotation(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markAnnotation(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (marker != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: charno + annotation.length()
 *  */
    @Test
    public void testMarkAnnotation_ThrowNullPointerException_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        ArrayList markers = new ArrayList();
        markers.add(null);
        markers.add(null);
        markers.add(null);
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "markers", markers);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.markAnnotation(JSDocInfoBuilder.java:138) */
        jSDocInfoBuilder.markAnnotation(null, -255, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method markAnnotation(java.lang.String, int, int)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markAnnotation(java.lang.String,int,int)}
     */
    @Test
    public void testMarkAnnotationWithNonEmptyString() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(true);
        
        jSDocInfoBuilder.markAnnotation("3-", -1, -1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.isPopulated
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPopulated()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isPopulated()}
 * @utbot.returnsFrom {@code return populated;}
 *  */
    @Test
    public void testIsPopulated_ReturnPopulated() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        boolean actual = jSDocInfoBuilder.isPopulated();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.markTypeNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markTypeNode(com.google.javascript.rhino.Node, int, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markTypeNode(com.google.javascript.rhino.Node,int,int,int,boolean)}
 * @utbot.executesCondition {@code (currentMarker != null): False}
 *  */
    @Test
    public void testMarkTypeNode_CurrentMarkerEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        jSDocInfoBuilder.markTypeNode(null, -255, -255, -255, false);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markTypeNode(com.google.javascript.rhino.Node,int,int,int,boolean)}
 * @utbot.executesCondition {@code (currentMarker != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo.TypePosition#setItem(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo.TypePosition#setPositionInformation(int,int,int,int)}
 *  */
    @Test
    public void testMarkTypeNode_CurrentMarkerNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo.Marker currentMarker = ((JSDocInfo.Marker) createInstance("com.google.javascript.rhino.JSDocInfo$Marker"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker", currentMarker);
        
        JSDocInfo.Marker jSDocInfoBuilderCurrentMarker = ((JSDocInfo.Marker) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker"));
        JSDocInfo.TypePosition initialJSDocInfoBuilderCurrentMarkerType = ((JSDocInfo.TypePosition) getFieldValue(jSDocInfoBuilderCurrentMarker, "com.google.javascript.rhino.JSDocInfo$Marker", "type"));
        
        jSDocInfoBuilder.markTypeNode(null, -255, -255, -255, false);
        
        JSDocInfo.Marker jSDocInfoBuilderCurrentMarker1 = ((JSDocInfo.Marker) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker"));
        JSDocInfo.TypePosition finalJSDocInfoBuilderCurrentMarkerType = ((JSDocInfo.TypePosition) getFieldValue(jSDocInfoBuilderCurrentMarker1, "com.google.javascript.rhino.JSDocInfo$Marker", "type"));
        
        assertFalse(initialJSDocInfoBuilderCurrentMarkerType == finalJSDocInfoBuilderCurrentMarkerType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.addAuthor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAuthor(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addAuthor(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAddAuthor_ReturnTrue_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.addAuthor(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addAuthor(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAddAuthor_ReturnTrue() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        boolean actual = jSDocInfoBuilder.addAuthor(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "documentation");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoDocumentation == finalJSDocInfoBuilderCurrentInfoDocumentation);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addAuthor(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAddAuthor_ReturnTrue_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.addAuthor(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addAuthor(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAddAuthor_ReturnTrue_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        ArrayList authors = new ArrayList();
        authors.add(null);
        authors.add(null);
        authors.add(null);
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "authors", authors);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.addAuthor(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAuthor(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#addAuthor(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#documentAuthor(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.documentAuthor(author)
 *  */
    @Test
    public void testAddAuthor_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.addAuthor] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.addAuthor(JSDocInfoBuilder.java:289) */
        jSDocInfoBuilder.addAuthor(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.populateDefaults
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method populateDefaults(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#populateDefaults(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info.getVisibility() == null): False}
 *  */
    @Test
    public void testPopulateDefaults_InfoGetVisibilityNotEqualsNull() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.PRIVATE;
        jSDocInfo.setVisibility(visibility);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method populateDefaultsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("populateDefaults", jSDocInfoType);
        populateDefaultsMethod.setAccessible(true);
        java.lang.Object[] populateDefaultsMethodArguments = new java.lang.Object[1];
        populateDefaultsMethodArguments[0] = jSDocInfo;
        populateDefaultsMethod.invoke(null, populateDefaultsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#populateDefaults(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info.getVisibility() == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setVisibility(com.google.javascript.rhino.JSDocInfo.Visibility)}
 *  */
    @Test
    public void testPopulateDefaults_InfoGetVisibilityEqualsNull() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        JSDocInfo.Visibility initialJSDocInfoVisibility = ((JSDocInfo.Visibility) getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "visibility"));
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method populateDefaultsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("populateDefaults", jSDocInfoType);
        populateDefaultsMethod.setAccessible(true);
        java.lang.Object[] populateDefaultsMethodArguments = new java.lang.Object[1];
        populateDefaultsMethodArguments[0] = jSDocInfo;
        populateDefaultsMethod.invoke(null, populateDefaultsMethodArguments);
        
        JSDocInfo.Visibility finalJSDocInfoVisibility = ((JSDocInfo.Visibility) getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "visibility"));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method populateDefaults(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#populateDefaults(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getVisibility()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: info.getVisibility() == null
 *  */
    @Test
    public void testPopulateDefaults_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.populateDefaults] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.populateDefaults(JSDocInfoBuilder.java:122) */
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method populateDefaultsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("populateDefaults", jSDocInfoType);
        populateDefaultsMethod.setAccessible(true);
        java.lang.Object[] populateDefaultsMethodArguments = new java.lang.Object[1];
        populateDefaultsMethodArguments[0] = ((Object) null);
        try {
            populateDefaultsMethod.invoke(null, populateDefaultsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordParameter(java.lang.String, com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameter(java.lang.String,com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordParameter_HasAnySingletonTypeTags() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordParameter(null, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameter(java.lang.String,com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordParameter_HasAnySingletonTypeTags_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordParameter(null, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameter(java.lang.String,com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordParameter_HasAnySingletonTypeTags_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordParameter(null, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameter(java.lang.String,com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (currentInfo.declareParam(type, parameterName)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordParameter_CurrentInfoDeclareParam() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        String string = "";
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        boolean actual = jSDocInfoBuilder.recordParameter(string, null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoInfo == finalJSDocInfoBuilderCurrentInfoInfo);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameter(java.lang.String,com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (currentInfo.declareParam(type, parameterName)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordParameter_NotCurrentInfoDeclareParam() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        String string = "";
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        parameters.put(string, jSTypeExpression);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordParameter(string, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordParameter(java.lang.String, com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameter(java.lang.String,com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !hasAnySingletonTypeTags() && currentInfo.declareParam(type, parameterName)
 *  */
    @Test
    public void testRecordParameter_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags(JSDocInfoBuilder.java:765)
            com.google.javascript.rhino.JSDocInfoBuilder.recordParameter(JSDocInfoBuilder.java:218) */
        jSDocInfoBuilder.recordParameter(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordVisibility
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordVisibility(com.google.javascript.rhino.JSDocInfo$Visibility)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordVisibility(com.google.javascript.rhino.JSDocInfo.Visibility)}
 * @utbot.executesCondition {@code (currentInfo.getVisibility() == null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordVisibility_CurrentInfoGetVisibilityNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.PUBLIC;
        currentInfo.setVisibility(visibility);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordVisibility(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordVisibility(com.google.javascript.rhino.JSDocInfo.Visibility)}
 * @utbot.executesCondition {@code (currentInfo.getVisibility() == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setVisibility(com.google.javascript.rhino.JSDocInfo.Visibility)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordVisibility_CurrentInfoGetVisibilityEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordVisibility(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordVisibility(com.google.javascript.rhino.JSDocInfo$Visibility)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordVisibility(com.google.javascript.rhino.JSDocInfo.Visibility)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getVisibility()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.getVisibility() == null
 *  */
    @Test
    public void testRecordVisibility_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordVisibility] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordVisibility(JSDocInfoBuilder.java:202) */
        jSDocInfoBuilder.recordVisibility(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.markName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markName(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markName(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (currentMarker != null): False}
 *  */
    @Test
    public void testMarkName_CurrentMarkerEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        jSDocInfoBuilder.markName(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markName(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (currentMarker != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo.StringPosition#setItem(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo.StringPosition#setPositionInformation(int,int,int,int)}
 *  */
    @Test
    public void testMarkName_CurrentMarkerNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo.Marker currentMarker = ((JSDocInfo.Marker) createInstance("com.google.javascript.rhino.JSDocInfo$Marker"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker", currentMarker);
        String string = " ";
        
        JSDocInfo.Marker jSDocInfoBuilderCurrentMarker = ((JSDocInfo.Marker) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker"));
        JSDocInfo.StringPosition initialJSDocInfoBuilderCurrentMarkerName = ((JSDocInfo.StringPosition) getFieldValue(jSDocInfoBuilderCurrentMarker, "com.google.javascript.rhino.JSDocInfo$Marker", "name"));
        
        jSDocInfoBuilder.markName(string, -255, -255);
        
        JSDocInfo.Marker jSDocInfoBuilderCurrentMarker1 = ((JSDocInfo.Marker) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker"));
        JSDocInfo.StringPosition finalJSDocInfoBuilderCurrentMarkerName = ((JSDocInfo.StringPosition) getFieldValue(jSDocInfoBuilderCurrentMarker1, "com.google.javascript.rhino.JSDocInfo$Marker", "name"));
        
        assertFalse(initialJSDocInfoBuilderCurrentMarkerName == finalJSDocInfoBuilderCurrentMarkerName);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method markName(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#markName(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (currentMarker != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo.StringPosition#setItem(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lineno
 *  */
    @Test
    public void testMarkName_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo.Marker currentMarker = ((JSDocInfo.Marker) createInstance("com.google.javascript.rhino.JSDocInfo$Marker"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentMarker", currentMarker);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.markName] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.markName(JSDocInfoBuilder.java:179) */
        jSDocInfoBuilder.markName(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecated
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordDeprecated()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDeprecated()}
 * @utbot.executesCondition {@code (!currentInfo.isDeprecated()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setDeprecated(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordDeprecated_NotCurrentInfoIsDeprecated() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordDeprecated();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(257, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDeprecated()}
 * @utbot.executesCondition {@code (!currentInfo.isDeprecated()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDeprecated_CurrentInfoIsDeprecated() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordDeprecated();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordDeprecated()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDeprecated()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isDeprecated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isDeprecated()
 *  */
    @Test
    public void testRecordDeprecated_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecated] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecated(JSDocInfoBuilder.java:634) */
        jSDocInfoBuilder.recordDeprecated();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordNoAlias
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordNoAlias()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoAlias()}
 * @utbot.executesCondition {@code (!currentInfo.isNoAlias()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setNoAlias(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordNoAlias_NotCurrentInfoIsNoAlias() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordNoAlias();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(-127, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoAlias()}
 * @utbot.executesCondition {@code (!currentInfo.isNoAlias()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordNoAlias_CurrentInfoIsNoAlias() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -127);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordNoAlias();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordNoAlias()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoAlias()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isNoAlias()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isNoAlias()
 *  */
    @Test
    public void testRecordNoAlias_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordNoAlias] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordNoAlias(JSDocInfoBuilder.java:620) */
        jSDocInfoBuilder.recordNoAlias();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordImplicitCast
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordImplicitCast()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplicitCast()}
 * @utbot.executesCondition {@code (!currentInfo.isImplicitCast()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setImplicitCast(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordImplicitCast_NotCurrentInfoIsImplicitCast() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordImplicitCast();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(8193, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplicitCast()}
 * @utbot.executesCondition {@code (!currentInfo.isImplicitCast()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordImplicitCast_CurrentInfoIsImplicitCast() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordImplicitCast();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordImplicitCast()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplicitCast()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isImplicitCast()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isImplicitCast()
 *  */
    @Test
    public void testRecordImplicitCast_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordImplicitCast] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordImplicitCast(JSDocInfoBuilder.java:695) */
        jSDocInfoBuilder.recordImplicitCast();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordVersion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordVersion(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordVersion(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordVersion_ReturnTrue_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordVersion(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordVersion(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordVersion_ReturnTrue() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        boolean actual = jSDocInfoBuilder.recordVersion(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "documentation");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoDocumentation == finalJSDocInfoBuilderCurrentInfoDocumentation);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordVersion(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordVersion_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        String version = "";
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "version", version);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordVersion(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordVersion(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordVersion_ReturnTrue_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordVersion(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordVersion(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordVersion(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#documentVersion(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.documentVersion(version)
 *  */
    @Test
    public void testRecordVersion_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordVersion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordVersion(JSDocInfoBuilder.java:314) */
        jSDocInfoBuilder.recordVersion(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordPreserveTry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordPreserveTry()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordPreserveTry()}
 * @utbot.executesCondition {@code (!currentInfo.shouldPreserveTry()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setShouldPreserveTry(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordPreserveTry_NotCurrentInfoShouldPreserveTry() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordPreserveTry();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(-239, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordPreserveTry()}
 * @utbot.executesCondition {@code (!currentInfo.shouldPreserveTry()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordPreserveTry_CurrentInfoShouldPreserveTry() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -239);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordPreserveTry();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordPreserveTry()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordPreserveTry()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#shouldPreserveTry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.shouldPreserveTry()
 *  */
    @Test
    public void testRecordPreserveTry_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordPreserveTry] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordPreserveTry(JSDocInfoBuilder.java:592) */
        jSDocInfoBuilder.recordPreserveTry();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordNoShadow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordNoShadow()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoShadow()}
 * @utbot.executesCondition {@code (!currentInfo.isNoShadow()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setNoShadow(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordNoShadow_NotCurrentInfoIsNoShadow() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordNoShadow();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(2049, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoShadow()}
 * @utbot.executesCondition {@code (!currentInfo.isNoShadow()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordNoShadow_CurrentInfoIsNoShadow() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordNoShadow();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordNoShadow()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoShadow()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isNoShadow()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isNoShadow()
 *  */
    @Test
    public void testRecordNoShadow_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordNoShadow] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordNoShadow(JSDocInfoBuilder.java:681) */
        jSDocInfoBuilder.recordNoShadow();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method recordType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_TypeEqualsNull() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(false);
        
        boolean actual = jSDocInfoBuilder.recordType(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_TypeNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_TypeNotEqualsNull_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_TypeNotEqualsNull_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_TypeNotEqualsNull_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_TypeNotEqualsNull_4() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        String string = "";
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        parameters.put(string, jSTypeExpression);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression1 = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordType_JSDocInfoSetType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression initialJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "type"));
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfo1CurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfo1CurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        JSDocInfo jSDocInfoBuilderCurrentInfo2 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo2, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        JSDocInfo jSDocInfoBuilderCurrentInfo3 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression finalJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo3, "com.google.javascript.rhino.JSDocInfo", "type"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoType == finalJSDocInfoBuilderCurrentInfoType);
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
        
        assertEquals(536870913, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method recordType(com.google.javascript.rhino.JSTypeExpression)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (type != null): True}
    /// invoke:
    ///     com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags() twice
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        currentInfo.setThisType(thisType);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_ReturnFalse_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_ReturnFalse_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordType_ReturnFalse_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type != null && !hasAnyTypeRelatedTags()
 *  */
    @Test
    public void testRecordType_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnyTypeRelatedTags(JSDocInfoBuilder.java:750)
            com.google.javascript.rhino.JSDocInfoBuilder.recordType(JSDocInfoBuilder.java:353) */
        jSDocInfoBuilder.recordType(jSTypeExpression);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method recordType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: currentInfo.setType(type);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRecordType_ThrowIllegalStateException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        jSDocInfoBuilder.recordType(jSTypeExpression);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordInterface
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method recordInterface()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordInterface()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setInterface(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordInterface_NotCurrentInfoIsConstructor() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordInterface();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(513, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method recordInterface()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags() once
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordInterface()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordInterface_HasAnySingletonTypeTags() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordInterface();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordInterface()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordInterface_CurrentInfoIsConstructor() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordInterface();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordInterface()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isInterface()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordInterface_CurrentInfoIsConstructor_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordInterface();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordInterface()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordInterface_HasAnySingletonTypeTags_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordInterface();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordInterface()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordInterface_HasAnySingletonTypeTags_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordInterface();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordInterface()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordInterface()}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !hasAnySingletonTypeTags() && !currentInfo.isConstructor() && !currentInfo.isInterface()
 *  */
    @Test
    public void testRecordInterface_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordInterface] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags(JSDocInfoBuilder.java:765)
            com.google.javascript.rhino.JSDocInfoBuilder.recordInterface(JSDocInfoBuilder.java:652) */
        jSDocInfoBuilder.recordInterface();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordConstancy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordConstancy()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstancy()}
 * @utbot.executesCondition {@code (!currentInfo.isConstant()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setConstant(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordConstancy_NotCurrentInfoIsConstant() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordConstancy();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(-253, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstancy()}
 * @utbot.executesCondition {@code (!currentInfo.isConstant()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordConstancy_CurrentInfoIsConstant() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordConstancy();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstancy()}
 * @utbot.executesCondition {@code (!currentInfo.isConstant()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordConstancy_CurrentInfoIsConstant_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -250);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordConstancy();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordConstancy()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstancy()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isConstant()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isConstant()
 *  */
    @Test
    public void testRecordConstancy_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordConstancy] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordConstancy(JSDocInfoBuilder.java:486) */
        jSDocInfoBuilder.recordConstancy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordHiddenness
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordHiddenness()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordHiddenness()}
 * @utbot.executesCondition {@code (!currentInfo.isHidden()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setHidden(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordHiddenness_NotCurrentInfoIsHidden() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordHiddenness();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(-247, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordHiddenness()}
 * @utbot.executesCondition {@code (!currentInfo.isHidden()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordHiddenness_CurrentInfoIsHidden() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -247);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordHiddenness();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordHiddenness()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordHiddenness()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isHidden()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isHidden()
 *  */
    @Test
    public void testRecordHiddenness_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordHiddenness] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordHiddenness(JSDocInfoBuilder.java:534) */
        jSDocInfoBuilder.recordHiddenness();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordThisType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method recordThisType(com.google.javascript.rhino.JSTypeExpression)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThisType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordThisType_TypeEqualsNull() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(false);
        
        boolean actual = jSDocInfoBuilder.recordThisType(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThisType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordThisType_HasAnySingletonTypeTags() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordThisType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThisType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordThisType_HasAnySingletonTypeTags_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordThisType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThisType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordThisType_HasAnySingletonTypeTags_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordThisType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThisType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (!currentInfo.hasThisType()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasThisType()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordThisType_CurrentInfoHasThisType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        currentInfo.setThisType(thisType);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordThisType(jSTypeExpression);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method recordThisType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThisType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (!currentInfo.hasThisType()): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasThisType()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setThisType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordThisType_NotCurrentInfoHasThisType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression initialJSDocInfoBuilderCurrentInfoThisType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "thisType"));
        
        boolean actual = jSDocInfoBuilder.recordThisType(jSTypeExpression);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression finalJSDocInfoBuilderCurrentInfoThisType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "thisType"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoThisType == finalJSDocInfoBuilderCurrentInfoThisType);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordThisType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThisType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type != null && !hasAnySingletonTypeTags() && !currentInfo.hasThisType()
 *  */
    @Test
    public void testRecordThisType_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags(JSDocInfoBuilder.java:765)
            com.google.javascript.rhino.JSDocInfoBuilder.recordThisType(JSDocInfoBuilder.java:451) */
        jSDocInfoBuilder.recordThisType(jSTypeExpression);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordTypedef
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method recordTypedef(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_TypeEqualsNull() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(false);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_TypeNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_TypeNotEqualsNull_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_TypeNotEqualsNull_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_TypeNotEqualsNull_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_TypeNotEqualsNull_4() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        String string = "";
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        parameters.put(string, jSTypeExpression);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression1 = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setTypedefType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordTypedef_JSDocInfoSetTypedefType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression initialJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "type"));
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfo1CurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfo1CurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        JSDocInfo jSDocInfoBuilderCurrentInfo2 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo2, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        JSDocInfo jSDocInfoBuilderCurrentInfo3 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression finalJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo3, "com.google.javascript.rhino.JSDocInfo", "type"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoType == finalJSDocInfoBuilderCurrentInfoType);
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
        
        assertEquals(-2147483647, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method recordTypedef(com.google.javascript.rhino.JSTypeExpression)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (type != null): True}
    /// invoke:
    ///     com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags() twice
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        currentInfo.setThisType(thisType);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_ReturnFalse_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_ReturnFalse_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTypedef_ReturnFalse_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordTypedef(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordTypedef(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type != null && !hasAnyTypeRelatedTags()
 *  */
    @Test
    public void testRecordTypedef_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordTypedef] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnyTypeRelatedTags(JSDocInfoBuilder.java:750)
            com.google.javascript.rhino.JSDocInfoBuilder.recordTypedef(JSDocInfoBuilder.java:367) */
        jSDocInfoBuilder.recordTypedef(jSTypeExpression);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method recordTypedef(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTypedef(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setTypedefType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: currentInfo.setTypedefType(type);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRecordTypedef_ThrowIllegalStateException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        jSDocInfoBuilder.recordTypedef(jSTypeExpression);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordDefineType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method recordDefineType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_TypeEqualsNull() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(false);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_TypeNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_TypeNotEqualsNull_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -250);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_TypeNotEqualsNull_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_TypeNotEqualsNull_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -248);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_TypeNotEqualsNull_4() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_TypeNotEqualsNull_5() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 8);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_TypeNotEqualsNull_6() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        String string = "";
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        parameters.put(string, jSTypeExpression);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 8);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression1 = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setDefine(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordDefineType_JSDocInfoSetDefine() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 8);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression initialJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "type"));
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfo1CurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfo1CurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        JSDocInfo jSDocInfoBuilderCurrentInfo2 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo2, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        JSDocInfo jSDocInfoBuilderCurrentInfo3 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression finalJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo3, "com.google.javascript.rhino.JSDocInfo", "type"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoType == finalJSDocInfoBuilderCurrentInfoType);
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
        
        assertEquals(536870924, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method recordDefineType(com.google.javascript.rhino.JSTypeExpression)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (type != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.JSDocInfo#isConstant()} twice,
    ///     {@link com.google.javascript.rhino.JSDocInfo#isDefine()} twice
    /// execute conditions:
    ///     {@code (!currentInfo.isDefine()): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)} twice
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_ReturnFalse_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 8);
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        currentInfo.setThisType(thisType);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_ReturnFalse_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483384);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDefineType_ReturnFalse_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordDefineType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordDefineType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isConstant()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !currentInfo.isConstant()
 *  */
    @Test
    public void testRecordDefineType_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordDefineType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordDefineType(JSDocInfoBuilder.java:416) */
        jSDocInfoBuilder.recordDefineType(jSTypeExpression);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method recordDefineType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDefineType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isConstant()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isDefine()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfoBuilder#recordType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: recordType(type)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRecordDefineType_ThrowIllegalStateException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        jSDocInfoBuilder.recordDefineType(jSTypeExpression);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordFileOverview
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordFileOverview(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordFileOverview(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordFileOverview_ReturnTrue_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordFileOverview(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordFileOverview(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordFileOverview_ReturnTrue() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        boolean actual = jSDocInfoBuilder.recordFileOverview(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "documentation");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoDocumentation == finalJSDocInfoBuilderCurrentInfoDocumentation);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordFileOverview(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordFileOverview_ReturnTrue_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordFileOverview(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordFileOverview(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordFileOverview_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        String fileOverview = "";
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "fileOverview", fileOverview);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordFileOverview(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordFileOverview(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordFileOverview(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#documentFileOverview(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.documentFileOverview(description)
 *  */
    @Test
    public void testRecordFileOverview_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordFileOverview] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordFileOverview(JSDocInfoBuilder.java:518) */
        jSDocInfoBuilder.recordFileOverview(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordOverride
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordOverride()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordOverride()}
 * @utbot.executesCondition {@code (!currentInfo.isOverride()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setOverride(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordOverride_NotCurrentInfoIsOverride() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordOverride();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(-191, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordOverride()}
 * @utbot.executesCondition {@code (!currentInfo.isOverride()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordOverride_CurrentInfoIsOverride() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -191);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordOverride();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordOverride()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordOverride()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isOverride()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isOverride()
 *  */
    @Test
    public void testRecordOverride_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordOverride] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordOverride(JSDocInfoBuilder.java:606) */
        jSDocInfoBuilder.recordOverride();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.hasParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasParameter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasParameter(java.lang.String)}
 * @utbot.returnsFrom {@code return currentInfo.hasParameter(name);}
 *  */
    @Test
    public void testHasParameter_ReturnCurrentInfoHasParameter() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.hasParameter(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasParameter(java.lang.String)}
 * @utbot.returnsFrom {@code return currentInfo.hasParameter(name);}
 *  */
    @Test
    public void testHasParameter_ReturnCurrentInfoHasParameter_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.hasParameter(null);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasParameter(java.lang.String)}
 * @utbot.returnsFrom {@code return currentInfo.hasParameter(name);}
 *  */
    @Test
    public void testHasParameter_ReturnCurrentInfoHasParameter_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        String string = "";
        
        boolean actual = jSDocInfoBuilder.hasParameter(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasParameter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasParameter(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasParameter(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentInfo.hasParameter(name);
 *  */
    @Test
    public void testHasParameter_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.hasParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasParameter(JSDocInfoBuilder.java:730) */
        jSDocInfoBuilder.hasParameter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordExport
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordExport()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordExport()}
 * @utbot.executesCondition {@code (!currentInfo.isExport()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setExport(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordExport_NotCurrentInfoIsExport() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordExport();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(1025, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordExport()}
 * @utbot.executesCondition {@code (!currentInfo.isExport()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordExport_CurrentInfoIsExport() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordExport();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordExport()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordExport()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isExport()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isExport()
 *  */
    @Test
    public void testRecordExport_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordExport] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordExport(JSDocInfoBuilder.java:667) */
        jSDocInfoBuilder.recordExport();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDescription(java.lang.String)}
 * @utbot.executesCondition {@code (description != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDescription_DescriptionEqualsNull() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(false);
        
        boolean actual = jSDocInfoBuilder.recordDescription(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDescription(java.lang.String)}
 * @utbot.executesCondition {@code (description != null): True}
 * @utbot.executesCondition {@code (currentInfo.getDescription() == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordDescription_CurrentInfoGetDescriptionEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        String string = "";
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        boolean actual = jSDocInfoBuilder.recordDescription(string);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoInfo == finalJSDocInfoBuilderCurrentInfoInfo);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDescription(java.lang.String)}
 * @utbot.executesCondition {@code (description != null): True}
 * @utbot.executesCondition {@code (currentInfo.getDescription() == null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDescription_CurrentInfoGetDescriptionNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String description = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "description", description);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        String string = "";
        
        boolean actual = jSDocInfoBuilder.recordDescription(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDescription(java.lang.String)}
 * @utbot.executesCondition {@code (description != null): True}
 * @utbot.executesCondition {@code (currentInfo.getDescription() == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordDescription_CurrentInfoGetDescriptionEqualsNull_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        String string = "";
        
        boolean actual = jSDocInfoBuilder.recordDescription(string);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDescription(java.lang.String)}
 * @utbot.executesCondition {@code (description != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getDescription()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: description != null && currentInfo.getDescription() == null
 *  */
    @Test
    public void testRecordDescription_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        String string = "";
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordDescription(JSDocInfoBuilder.java:502) */
        jSDocInfoBuilder.recordDescription(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordReturnType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method recordReturnType(com.google.javascript.rhino.JSTypeExpression)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordReturnType_JsTypeEqualsNull() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(false);
        
        boolean actual = jSDocInfoBuilder.recordReturnType(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.executesCondition {@code (currentInfo.getReturnType() == null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordReturnType_HasAnySingletonTypeTags() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordReturnType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.executesCondition {@code (currentInfo.getReturnType() == null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordReturnType_HasAnySingletonTypeTags_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordReturnType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.executesCondition {@code (currentInfo.getReturnType() == null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordReturnType_HasAnySingletonTypeTags_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordReturnType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.executesCondition {@code (currentInfo.getReturnType() == null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordReturnType_CurrentInfoGetReturnTypeNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        currentInfo.setType(type);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordReturnType(jSTypeExpression);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method recordReturnType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.executesCondition {@code (currentInfo.getReturnType() == null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getReturnType()}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordReturnType_NotHasAnySingletonTypeTags() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression initialJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "type"));
        
        boolean actual = jSDocInfoBuilder.recordReturnType(jSTypeExpression);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        JSDocInfo jSDocInfoBuilderCurrentInfo2 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression finalJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo2, "com.google.javascript.rhino.JSDocInfo", "type"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoType == finalJSDocInfoBuilderCurrentInfoType);
        
        assertEquals(1073741825, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordReturnType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jsType != null && currentInfo.getReturnType() == null && !hasAnySingletonTypeTags()
 *  */
    @Test
    public void testRecordReturnType_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordReturnType(JSDocInfoBuilder.java:382) */
        jSDocInfoBuilder.recordReturnType(jSTypeExpression);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method recordReturnType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.executesCondition {@code (currentInfo.getReturnType() == null): True}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getReturnType()}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setReturnType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: currentInfo.setReturnType(jsType);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRecordReturnType_ThrowIllegalStateException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        jSDocInfoBuilder.recordReturnType(jSTypeExpression);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordNoTypeCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordNoTypeCheck()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoTypeCheck()}
 * @utbot.executesCondition {@code (!currentInfo.isNoTypeCheck()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setNoCheck(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordNoTypeCheck_NotCurrentInfoIsNoTypeCheck() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordNoTypeCheck();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(-223, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoTypeCheck()}
 * @utbot.executesCondition {@code (!currentInfo.isNoTypeCheck()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordNoTypeCheck_CurrentInfoIsNoTypeCheck() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -223);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordNoTypeCheck();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordNoTypeCheck()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoTypeCheck()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isNoTypeCheck()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isNoTypeCheck()
 *  */
    @Test
    public void testRecordNoTypeCheck_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordNoTypeCheck] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordNoTypeCheck(JSDocInfoBuilder.java:551) */
        jSDocInfoBuilder.recordNoTypeCheck();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordBaseType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordBaseType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBaseType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordBaseType_JsTypeEqualsNull() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(false);
        
        boolean actual = jSDocInfoBuilder.recordBaseType(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBaseType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordBaseType_JsTypeNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordBaseType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBaseType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordBaseType_JsTypeNotEqualsNull_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordBaseType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBaseType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordBaseType_JsTypeNotEqualsNull_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordBaseType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBaseType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordBaseType_JsTypeNotEqualsNull_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordBaseType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBaseType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordBaseType_JsTypeNotEqualsNull_5() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        boolean actual = jSDocInfoBuilder.recordBaseType(jSTypeExpression);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoInfo == finalJSDocInfoBuilderCurrentInfoInfo);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBaseType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordBaseType_JsTypeNotEqualsNull_4() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        JSTypeExpression initialJSDocInfoBuilderCurrentInfoInfoBaseType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType"));
        
        boolean actual = jSDocInfoBuilder.recordBaseType(jSTypeExpression);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfo1CurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        JSTypeExpression finalJSDocInfoBuilderCurrentInfoInfoBaseType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo1CurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoInfoBaseType == finalJSDocInfoBuilderCurrentInfoInfoBaseType);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordBaseType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBaseType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (jsType != null): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jsType != null && !hasAnySingletonTypeTags() && !currentInfo.hasBaseType()
 *  */
    @Test
    public void testRecordBaseType_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordBaseType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags(JSDocInfoBuilder.java:765)
            com.google.javascript.rhino.JSDocInfoBuilder.recordBaseType(JSDocInfoBuilder.java:468) */
        jSDocInfoBuilder.recordBaseType(jSTypeExpression);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordSuppressions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordSuppressions(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordSuppressions(java.util.Set)}
 * @utbot.executesCondition {@code (currentInfo.setSuppressions(suppressions)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordSuppressions_CurrentInfoSetSuppressions() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        boolean actual = jSDocInfoBuilder.recordSuppressions(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoInfo == finalJSDocInfoBuilderCurrentInfoInfo);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordSuppressions(java.util.Set)}
 * @utbot.executesCondition {@code (currentInfo.setSuppressions(suppressions)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordSuppressions_NotCurrentInfoSetSuppressions() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashSet suppressions = new LinkedHashSet();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "suppressions", suppressions);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordSuppressions(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordSuppressions(java.util.Set)}
 * @utbot.executesCondition {@code (currentInfo.setSuppressions(suppressions)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordSuppressions_CurrentInfoSetSuppressions_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordSuppressions(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Set finalJSDocInfoBuilderCurrentInfoInfoSuppressions = ((Set) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "suppressions"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoSuppressions);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordSuppressions(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordSuppressions(java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setSuppressions(java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.setSuppressions(suppressions)
 *  */
    @Test
    public void testRecordSuppressions_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordSuppressions] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordSuppressions(JSDocInfoBuilder.java:338) */
        jSDocInfoBuilder.recordSuppressions(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method recordConstructor()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstructor()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setConstructor(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordConstructor_NotCurrentInfoIsConstructor() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordConstructor();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(3, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method recordConstructor()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags() once
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstructor()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordConstructor_HasAnySingletonTypeTags() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordConstructor();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstructor()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordConstructor_CurrentInfoIsConstructor() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordConstructor();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstructor()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): True}
 * @utbot.executesCondition {@code (!currentInfo.isConstructor()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isInterface()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordConstructor_CurrentInfoIsConstructor_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordConstructor();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstructor()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordConstructor_HasAnySingletonTypeTags_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordConstructor();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstructor()}
 * @utbot.executesCondition {@code (!hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordConstructor_HasAnySingletonTypeTags_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordConstructor();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordConstructor()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordConstructor()}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !hasAnySingletonTypeTags() && !currentInfo.isConstructor() && !currentInfo.isInterface()
 *  */
    @Test
    public void testRecordConstructor_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags(JSDocInfoBuilder.java:765)
            com.google.javascript.rhino.JSDocInfoBuilder.recordConstructor(JSDocInfoBuilder.java:569) */
        jSDocInfoBuilder.recordConstructor();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecationReason
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordDeprecationReason(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDeprecationReason(java.lang.String)}
 * @utbot.executesCondition {@code (currentInfo.setDeprecationReason(reason)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordDeprecationReason_CurrentInfoSetDeprecationReason() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        boolean actual = jSDocInfoBuilder.recordDeprecationReason(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoInfo == finalJSDocInfoBuilderCurrentInfoInfo);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDeprecationReason(java.lang.String)}
 * @utbot.executesCondition {@code (currentInfo.setDeprecationReason(reason)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordDeprecationReason_NotCurrentInfoSetDeprecationReason() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String deprecated = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "deprecated", deprecated);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordDeprecationReason(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDeprecationReason(java.lang.String)}
 * @utbot.executesCondition {@code (currentInfo.setDeprecationReason(reason)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordDeprecationReason_CurrentInfoSetDeprecationReason_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordDeprecationReason(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordDeprecationReason(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordDeprecationReason(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setDeprecationReason(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.setDeprecationReason(reason)
 *  */
    @Test
    public void testRecordDeprecationReason_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecationReason] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordDeprecationReason(JSDocInfoBuilder.java:326) */
        jSDocInfoBuilder.recordDeprecationReason(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordNoSideEffects
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordNoSideEffects()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoSideEffects()}
 * @utbot.executesCondition {@code (!currentInfo.isNoSideEffects()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setNoSideEffects(boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordNoSideEffects_NotCurrentInfoIsNoSideEffects() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordNoSideEffects();
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertEquals(16385, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoSideEffects()}
 * @utbot.executesCondition {@code (!currentInfo.isNoSideEffects()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordNoSideEffects_CurrentInfoIsNoSideEffects() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordNoSideEffects();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordNoSideEffects()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordNoSideEffects()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isNoSideEffects()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !currentInfo.isNoSideEffects()
 *  */
    @Test
    public void testRecordNoSideEffects_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordNoSideEffects] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordNoSideEffects(JSDocInfoBuilder.java:709) */
        jSDocInfoBuilder.recordNoSideEffects();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.isInterfaceRecorded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInterfaceRecorded()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isInterfaceRecorded()}
 * @utbot.returnsFrom {@code return currentInfo.isInterface();}
 *  */
    @Test
    public void testIsInterfaceRecorded_ReturnCurrentInfoIsInterface() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.isInterfaceRecorded();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isInterfaceRecorded()}
 * @utbot.returnsFrom {@code return currentInfo.isInterface();}
 *  */
    @Test
    public void testIsInterfaceRecorded_ReturnCurrentInfoIsInterface_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.isInterfaceRecorded();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInterfaceRecorded()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isInterfaceRecorded()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isInterface()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentInfo.isInterface();
 *  */
    @Test
    public void testIsInterfaceRecorded_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.isInterfaceRecorded] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.isInterfaceRecorded(JSDocInfoBuilder.java:723) */
        jSDocInfoBuilder.isInterfaceRecorded();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.isDescriptionRecorded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDescriptionRecorded()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isDescriptionRecorded()}
 * @utbot.returnsFrom {@code return currentInfo.getDescription() != null;}
 *  */
    @Test
    public void testIsDescriptionRecorded_CurrentInfoGetDescriptionEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.isDescriptionRecorded();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isDescriptionRecorded()}
 * @utbot.returnsFrom {@code return currentInfo.getDescription() != null;}
 *  */
    @Test
    public void testIsDescriptionRecorded_CurrentInfoGetDescriptionEqualsNull_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.isDescriptionRecorded();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isDescriptionRecorded()}
 * @utbot.returnsFrom {@code return currentInfo.getDescription() != null;}
 *  */
    @Test
    public void testIsDescriptionRecorded_CurrentInfoGetDescriptionNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String description = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "description", description);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.isDescriptionRecorded();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDescriptionRecorded()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isDescriptionRecorded()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getDescription()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentInfo.getDescription() != null;
 *  */
    @Test
    public void testIsDescriptionRecorded_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.isDescriptionRecorded] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.isDescriptionRecorded(JSDocInfoBuilder.java:94) */
        jSDocInfoBuilder.isDescriptionRecorded();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordParameterDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordParameterDescription(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameterDescription(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordParameterDescription_ReturnTrue_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordParameterDescription(null, null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameterDescription(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordParameterDescription_ReturnTrue() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        boolean actual = jSDocInfoBuilder.recordParameterDescription(null, null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "documentation");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoDocumentation == finalJSDocInfoBuilderCurrentInfoDocumentation);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameterDescription(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordParameterDescription_ReturnTrue_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        LinkedHashMap parameters = new LinkedHashMap();
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "parameters", parameters);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        String string = "";
        
        boolean actual = jSDocInfoBuilder.recordParameterDescription(string, null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameterDescription(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordParameterDescription_ReturnTrue_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordParameterDescription(null, null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameterDescription(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordParameterDescription_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        LinkedHashMap parameters = new LinkedHashMap();
        String string = "";
        parameters.put(string, string);
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "parameters", parameters);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordParameterDescription(string, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordParameterDescription(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordParameterDescription(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#documentParam(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.documentParam(parameterName, description)
 *  */
    @Test
    public void testRecordParameterDescription_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordParameterDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordParameterDescription(JSDocInfoBuilder.java:234) */
        jSDocInfoBuilder.recordParameterDescription(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordTemplateTypeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordTemplateTypeName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTemplateTypeName(java.lang.String)}
 * @utbot.executesCondition {@code (currentInfo.declareTemplateTypeName(name)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordTemplateTypeName_CurrentInfoDeclareTemplateTypeName() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        boolean actual = jSDocInfoBuilder.recordTemplateTypeName(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoInfo == finalJSDocInfoBuilderCurrentInfoInfo);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTemplateTypeName(java.lang.String)}
 * @utbot.executesCondition {@code (currentInfo.declareTemplateTypeName(name)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordTemplateTypeName_NotCurrentInfoDeclareTemplateTypeName() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String templateTypeName = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "templateTypeName", templateTypeName);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordTemplateTypeName(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTemplateTypeName(java.lang.String)}
 * @utbot.executesCondition {@code (currentInfo.declareTemplateTypeName(name)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordTemplateTypeName_CurrentInfoDeclareTemplateTypeName_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordTemplateTypeName(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordTemplateTypeName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordTemplateTypeName(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#declareTemplateTypeName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.declareTemplateTypeName(name)
 *  */
    @Test
    public void testRecordTemplateTypeName_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordTemplateTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordTemplateTypeName(JSDocInfoBuilder.java:249) */
        jSDocInfoBuilder.recordTemplateTypeName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.isPopulatedWithFileOverview
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPopulatedWithFileOverview()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isPopulatedWithFileOverview()}
 * @utbot.returnsFrom {@code return isPopulated() && currentInfo.hasFileOverview();}
 *  */
    @Test
    public void testIsPopulatedWithFileOverview_IsPopulatedAndCurrentInfoHasFileOverview() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        boolean actual = jSDocInfoBuilder.isPopulatedWithFileOverview();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isPopulatedWithFileOverview()}
 * @utbot.returnsFrom {@code return isPopulated() && currentInfo.hasFileOverview();}
 *  */
    @Test
    public void testIsPopulatedWithFileOverview_IsPopulatedAndCurrentInfoHasFileOverview_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated", true);
        
        boolean actual = jSDocInfoBuilder.isPopulatedWithFileOverview();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isPopulatedWithFileOverview()}
 * @utbot.returnsFrom {@code return isPopulated() && currentInfo.hasFileOverview();}
 *  */
    @Test
    public void testIsPopulatedWithFileOverview_IsPopulatedAndCurrentInfoHasFileOverview_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated", true);
        
        boolean actual = jSDocInfoBuilder.isPopulatedWithFileOverview();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPopulatedWithFileOverview()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isPopulatedWithFileOverview()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfoBuilder#isPopulated()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasFileOverview()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isPopulated() && currentInfo.hasFileOverview();
 *  */
    @Test
    public void testIsPopulatedWithFileOverview_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated", true);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.isPopulatedWithFileOverview] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.isPopulatedWithFileOverview(JSDocInfoBuilder.java:87) */
        jSDocInfoBuilder.isPopulatedWithFileOverview();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordThrowDescription(com.google.javascript.rhino.JSTypeExpression, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowDescription(com.google.javascript.rhino.JSTypeExpression,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordThrowDescription_ReturnTrue() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordThrowDescription(null, null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowDescription(com.google.javascript.rhino.JSTypeExpression,java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordThrowDescription_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        LinkedHashMap throwsDescriptions = new LinkedHashMap();
        throwsDescriptions.put(null, null);
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "throwsDescriptions", throwsDescriptions);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordThrowDescription(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordThrowDescription(com.google.javascript.rhino.JSTypeExpression, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordThrowDescription(com.google.javascript.rhino.JSTypeExpression,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#documentThrows(com.google.javascript.rhino.JSTypeExpression,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.documentThrows(type, description)
 *  */
    @Test
    public void testRecordThrowDescription_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(JSDocInfoBuilder.java:276) */
        jSDocInfoBuilder.recordThrowDescription(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method recordThrowDescription(com.google.javascript.rhino.JSTypeExpression, java.lang.String)
    
    @Test
    public void testRecordThrowDescription1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        boolean actual = jSDocInfoBuilder.recordThrowDescription(null, null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoDocumentation == finalJSDocInfoBuilderCurrentInfoDocumentation);
    }
    
    @Test
    public void testRecordThrowDescription2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        LinkedHashMap throwsDescriptions = new LinkedHashMap();
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "throwsDescriptions", throwsDescriptions);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordThrowDescription(null, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testRecordThrowDescription3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordThrowDescription(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method recordThrowDescription(com.google.javascript.rhino.JSTypeExpression, java.lang.String)
    
    @Test
    public void testRecordThrowDescription4() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSTypeExpression.hashCode(JSTypeExpression.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            com.google.javascript.rhino.JSDocInfo.documentThrows(JSDocInfo.java:558)
            com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(JSDocInfoBuilder.java:276) */
        jSDocInfoBuilder.recordThrowDescription(jSTypeExpression, null);
    }
    
    @Test
    public void testRecordThrowDescription5() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        LinkedHashMap throwsDescriptions = new LinkedHashMap();
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "throwsDescriptions", throwsDescriptions);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSTypeExpression.hashCode(JSTypeExpression.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            com.google.javascript.rhino.JSDocInfo.documentThrows(JSDocInfo.java:558)
            com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(JSDocInfoBuilder.java:276) */
        jSDocInfoBuilder.recordThrowDescription(jSTypeExpression, null);
    }
    
    @Test
    public void testRecordThrowDescription6() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSTypeExpression.hashCode(JSTypeExpression.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            com.google.javascript.rhino.JSDocInfo.documentThrows(JSDocInfo.java:558)
            com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(JSDocInfoBuilder.java:276) */
        jSDocInfoBuilder.recordThrowDescription(jSTypeExpression, null);
    }
    
    @Test
    public void testRecordThrowDescription7() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        LinkedHashMap throwsDescriptions = new LinkedHashMap();
        String string = "";
        throwsDescriptions.put(null, string);
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "throwsDescriptions", throwsDescriptions);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        String string1 = "";
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSTypeExpression.hashCode(JSTypeExpression.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.containsKey(HashMap.java:594)
            com.google.javascript.rhino.JSDocInfo.documentThrows(JSDocInfo.java:557)
            com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(JSDocInfoBuilder.java:276) */
        jSDocInfoBuilder.recordThrowDescription(jSTypeExpression, string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordReturnDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordReturnDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnDescription(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordReturnDescription_ReturnTrue_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordReturnDescription(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnDescription(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordReturnDescription_ReturnTrue() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        boolean actual = jSDocInfoBuilder.recordReturnDescription(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "documentation");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoDocumentation == finalJSDocInfoBuilderCurrentInfoDocumentation);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnDescription(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordReturnDescription_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        String returnDescription = "";
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "returnDescription", returnDescription);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordReturnDescription(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnDescription(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordReturnDescription_ReturnTrue_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordReturnDescription(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordReturnDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordReturnDescription(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#documentReturn(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.documentReturn(description)
 *  */
    @Test
    public void testRecordReturnDescription_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordReturnDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordReturnDescription(JSDocInfoBuilder.java:399) */
        jSDocInfoBuilder.recordReturnDescription(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordEnumParameterType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_TypeEqualsNull() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(false);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_TypeNotEqualsNull() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_TypeNotEqualsNull_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_TypeNotEqualsNull_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_TypeNotEqualsNull_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_TypeNotEqualsNull_4() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        String string = "";
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        parameters.put(string, jSTypeExpression);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression1 = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordEnumParameterType_JSDocInfoSetEnumParameterType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression initialJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "type"));
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfo1CurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfo1CurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        JSDocInfo jSDocInfoBuilderCurrentInfo2 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        int finalJSDocInfoBuilderCurrentInfoBitset = ((Integer) getFieldValue(jSDocInfoBuilderCurrentInfo2, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        JSDocInfo jSDocInfoBuilderCurrentInfo3 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        JSTypeExpression finalJSDocInfoBuilderCurrentInfoType = ((JSTypeExpression) getFieldValue(jSDocInfoBuilderCurrentInfo3, "com.google.javascript.rhino.JSDocInfo", "type"));
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoType == finalJSDocInfoBuilderCurrentInfoType);
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
        
        assertEquals(1610612737, finalJSDocInfoBuilderCurrentInfoBitset);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (type != null): True}
    /// invoke:
    ///     com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags() twice
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        currentInfo.setThisType(thisType);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_ReturnFalse_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_ReturnFalse_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordEnumParameterType_ReturnFalse_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
        
        assertFalse(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type != null && !hasAnyTypeRelatedTags()
 *  */
    @Test
    public void testRecordEnumParameterType_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordEnumParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnyTypeRelatedTags(JSDocInfoBuilder.java:750)
            com.google.javascript.rhino.JSDocInfoBuilder.recordEnumParameterType(JSDocInfoBuilder.java:434) */
        jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#setEnumParameterType(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: currentInfo.setEnumParameterType(type);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRecordEnumParameterType_ThrowIllegalStateException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        jSDocInfoBuilder.recordEnumParameterType(jSTypeExpression);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.isConstructorRecorded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isConstructorRecorded()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isConstructorRecorded()}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor();}
 *  */
    @Test
    public void testIsConstructorRecorded_ReturnCurrentInfoIsConstructor() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.isConstructorRecorded();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isConstructorRecorded()}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor();}
 *  */
    @Test
    public void testIsConstructorRecorded_ReturnCurrentInfoIsConstructor_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.isConstructorRecorded();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isConstructorRecorded()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#isConstructorRecorded()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentInfo.isConstructor();
 *  */
    @Test
    public void testIsConstructorRecorded_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.isConstructorRecorded] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.isConstructorRecorded(JSDocInfoBuilder.java:584) */
        jSDocInfoBuilder.isConstructorRecorded();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordBlockDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordBlockDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBlockDescription(java.lang.String)}
 * @utbot.executesCondition {@code (parseDocumentation): False}
 * @utbot.returnsFrom {@code return currentInfo.documentBlock(description);}
 *  */
    @Test
    public void testRecordBlockDescription_NotParseDocumentation() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordBlockDescription(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBlockDescription(java.lang.String)}
 * @utbot.executesCondition {@code (parseDocumentation): False}
 * @utbot.returnsFrom {@code return currentInfo.documentBlock(description);}
 *  */
    @Test
    public void testRecordBlockDescription_NotParseDocumentation_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        boolean actual = jSDocInfoBuilder.recordBlockDescription(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoDocumentation = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "documentation");
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoDocumentation == finalJSDocInfoBuilderCurrentInfoDocumentation);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBlockDescription(java.lang.String)}
 * @utbot.executesCondition {@code (parseDocumentation): False}
 * @utbot.returnsFrom {@code return currentInfo.documentBlock(description);}
 *  */
    @Test
    public void testRecordBlockDescription_NotParseDocumentation_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        String blockDescription = "";
        setField(documentation, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation", "blockDescription", blockDescription);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordBlockDescription(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBlockDescription(java.lang.String)}
 * @utbot.executesCondition {@code (parseDocumentation): True}
 * @utbot.returnsFrom {@code return currentInfo.documentBlock(description);}
 *  */
    @Test
    public void testRecordBlockDescription_ParseDocumentation() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object documentation = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "documentation", documentation);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation", true);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "parseDocumentation", true);
        
        boolean actual = jSDocInfoBuilder.recordBlockDescription(null);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordBlockDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBlockDescription(java.lang.String)}
 * @utbot.executesCondition {@code (parseDocumentation): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentInfo.documentBlock(description);
 *  */
    @Test
    public void testRecordBlockDescription_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordBlockDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordBlockDescription(JSDocInfoBuilder.java:192) */
        jSDocInfoBuilder.recordBlockDescription(null);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBlockDescription(java.lang.String)}
 * @utbot.executesCondition {@code (parseDocumentation): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentInfo.documentBlock(description);
 *  */
    @Test
    public void testRecordBlockDescription_ThrowNullPointerException_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "parseDocumentation", true);
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordBlockDescription] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordBlockDescription(JSDocInfoBuilder.java:192) */
        jSDocInfoBuilder.recordBlockDescription(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method recordBlockDescription(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordBlockDescription(java.lang.String)}
     */
    @Test
    public void testRecordBlockDescriptionReturnsTrueWithNonEmptyString() {
        JSDocInfoBuilder jSDocInfoBuilder = new JSDocInfoBuilder(true);
        
        boolean actual = jSDocInfoBuilder.recordBlockDescription("-\uFFF43");
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.hasAnyTypeRelatedTags
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAnyTypeRelatedTags()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_CurrentInfoIsConstructorOrCurrentInfoIsInterfaceOrCurrentInfoGetParameterCountLessOrEqualZeroOrCurrentInfoHasReturnTypeOrCurrentInfoHasBaseTypeOrCurrentInfoHasThisTypeOrHasAnySingletonTypeTags() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.executesCondition {@code (currentInfo.isInterface()): False}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_NotCurrentInfoIsInterface() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.executesCondition {@code (currentInfo.isInterface()): True}
 * @utbot.executesCondition {@code (currentInfo.getParameterCount() > 0): False}
 * @utbot.executesCondition {@code (currentInfo.hasReturnType()): False}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_NotCurrentInfoHasReturnType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.executesCondition {@code (currentInfo.isInterface()): True}
 * @utbot.executesCondition {@code (currentInfo.getParameterCount() > 0): False}
 * @utbot.executesCondition {@code (currentInfo.hasReturnType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasBaseType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasThisType()): False}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_NotCurrentInfoHasThisType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        currentInfo.setThisType(thisType);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.executesCondition {@code (currentInfo.isInterface()): True}
 * @utbot.executesCondition {@code (currentInfo.getParameterCount() > 0): False}
 * @utbot.executesCondition {@code (currentInfo.hasReturnType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasBaseType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasThisType()): True}
 * @utbot.executesCondition {@code (hasAnySingletonTypeTags()): False}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_NotHasAnySingletonTypeTags() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.executesCondition {@code (currentInfo.isInterface()): True}
 * @utbot.executesCondition {@code (currentInfo.getParameterCount() > 0): False}
 * @utbot.executesCondition {@code (currentInfo.hasReturnType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasBaseType()): False}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_NotCurrentInfoHasBaseType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object jSDocInfoBuilderCurrentInfoCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoBuilderCurrentInfoInfoParameters = ((Map) getFieldValue(jSDocInfoBuilderCurrentInfoCurrentInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoBuilderCurrentInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.executesCondition {@code (currentInfo.isInterface()): True}
 * @utbot.executesCondition {@code (currentInfo.getParameterCount() > 0): False}
 * @utbot.executesCondition {@code (currentInfo.hasReturnType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasBaseType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasThisType()): True}
 * @utbot.executesCondition {@code (hasAnySingletonTypeTags()): True}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_HasAnySingletonTypeTags() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.executesCondition {@code (currentInfo.isInterface()): True}
 * @utbot.executesCondition {@code (currentInfo.getParameterCount() > 0): False}
 * @utbot.executesCondition {@code (currentInfo.hasReturnType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasBaseType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasThisType()): True}
 * @utbot.executesCondition {@code (hasAnySingletonTypeTags()): True}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_HasAnySingletonTypeTags_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.executesCondition {@code (currentInfo.isInterface()): True}
 * @utbot.executesCondition {@code (currentInfo.getParameterCount() > 0): False}
 * @utbot.executesCondition {@code (currentInfo.hasReturnType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasBaseType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasThisType()): True}
 * @utbot.executesCondition {@code (hasAnySingletonTypeTags()): True}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_HasAnySingletonTypeTags_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.executesCondition {@code (currentInfo.isInterface()): True}
 * @utbot.executesCondition {@code (currentInfo.getParameterCount() > 0): True}
 * @utbot.returnsFrom {@code return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();}
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_CurrentInfoGetParameterCountGreaterThanZero() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        String string = "";
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        parameters.put(string, jSTypeExpression);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAnyTypeRelatedTags()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnyTypeRelatedTags()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentInfo.isConstructor() || currentInfo.isInterface() || currentInfo.getParameterCount() > 0 || currentInfo.hasReturnType() || currentInfo.hasBaseType() || currentInfo.hasThisType() || hasAnySingletonTypeTags();
 *  */
    @Test
    public void testHasAnyTypeRelatedTags_ThrowNullPointerException() throws Throwable  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.hasAnyTypeRelatedTags] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnyTypeRelatedTags(JSDocInfoBuilder.java:750) */
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnyTypeRelatedTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnyTypeRelatedTags");
        hasAnyTypeRelatedTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnyTypeRelatedTagsMethodArguments = new java.lang.Object[0];
        try {
            hasAnyTypeRelatedTagsMethod.invoke(jSDocInfoBuilder, hasAnyTypeRelatedTagsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.recordImplementedInterface
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordImplementedInterface_ReturnTrue() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object initialJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        boolean actual = jSDocInfoBuilder.recordImplementedInterface(null);
        
        assertTrue(actual);
        
        JSDocInfo jSDocInfoBuilderCurrentInfo1 = ((JSDocInfo) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo"));
        Object finalJSDocInfoBuilderCurrentInfoInfo = getFieldValue(jSDocInfoBuilderCurrentInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertFalse(initialJSDocInfoBuilderCurrentInfoInfo == finalJSDocInfoBuilderCurrentInfoInfo);
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordImplementedInterface_ReturnTrue_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordImplementedInterface(jSTypeExpression);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordImplementedInterface_ReturnTrue_2() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordImplementedInterface(jSTypeExpression);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordImplementedInterface_ReturnFalse() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        boolean actual = jSDocInfoBuilder.recordImplementedInterface(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordImplementedInterface_ReturnTrue_3() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        implementedInterfaces.add(null);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        JSTypeExpression jSTypeExpression = new JSTypeExpression(null, null, null);
        
        boolean actual = jSDocInfoBuilder.recordImplementedInterface(jSTypeExpression);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRecordImplementedInterface_ReturnTrue_4() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        ScriptOrFnNode root = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        root.type = 255;
        setField(jSTypeExpression, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        implementedInterfaces.add(jSTypeExpression);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        Node node = new Node(-256);
        JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node, null, null);
        
        boolean actual = jSDocInfoBuilder.recordImplementedInterface(jSTypeExpression1);
        
        assertTrue(actual);
        
        boolean finalJSDocInfoBuilderPopulated = ((Boolean) getFieldValue(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "populated"));
        
        assertTrue(finalJSDocInfoBuilderPopulated);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRecordImplementedInterface_ReturnFalse_1() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.type = -255;
        setField(jSTypeExpression, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        implementedInterfaces.add(jSTypeExpression);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.type = -255;
        JSTypeExpression jSTypeExpression1 = new JSTypeExpression(scriptOrFnNode, null, null);
        
        boolean actual = jSDocInfoBuilder.recordImplementedInterface(jSTypeExpression1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#addImplementedInterface(com.google.javascript.rhino.JSTypeExpression)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentInfo.addImplementedInterface(interfaceName)
 *  */
    @Test
    public void testRecordImplementedInterface_ThrowNullPointerException() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.recordImplementedInterface] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.recordImplementedInterface(JSDocInfoBuilder.java:737) */
        jSDocInfoBuilder.recordImplementedInterface(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAnySingletonTypeTags()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()}
 * @utbot.executesCondition {@code (currentInfo.hasTypedefType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasEnumParameterType()): False}
 * @utbot.returnsFrom {@code return currentInfo.hasType() || currentInfo.hasTypedefType() || currentInfo.hasEnumParameterType();}
 *  */
    @Test
    public void testHasAnySingletonTypeTags_NotCurrentInfoHasEnumParameterType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnySingletonTypeTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnySingletonTypeTags");
        hasAnySingletonTypeTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnySingletonTypeTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnySingletonTypeTagsMethod.invoke(jSDocInfoBuilder, hasAnySingletonTypeTagsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()}
 * @utbot.executesCondition {@code (currentInfo.hasTypedefType()): True}
 * @utbot.executesCondition {@code (currentInfo.hasEnumParameterType()): True}
 * @utbot.returnsFrom {@code return currentInfo.hasType() || currentInfo.hasTypedefType() || currentInfo.hasEnumParameterType();}
 *  */
    @Test
    public void testHasAnySingletonTypeTags_CurrentInfoHasEnumParameterType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnySingletonTypeTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnySingletonTypeTags");
        hasAnySingletonTypeTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnySingletonTypeTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnySingletonTypeTagsMethod.invoke(jSDocInfoBuilder, hasAnySingletonTypeTagsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()}
 * @utbot.returnsFrom {@code return currentInfo.hasType() || currentInfo.hasTypedefType() || currentInfo.hasEnumParameterType();}
 *  */
    @Test
    public void testHasAnySingletonTypeTags_CurrentInfoHasTypeOrCurrentInfoHasTypedefTypeOrCurrentInfoHasEnumParameterType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnySingletonTypeTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnySingletonTypeTags");
        hasAnySingletonTypeTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnySingletonTypeTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnySingletonTypeTagsMethod.invoke(jSDocInfoBuilder, hasAnySingletonTypeTagsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()}
 * @utbot.executesCondition {@code (currentInfo.hasTypedefType()): False}
 * @utbot.returnsFrom {@code return currentInfo.hasType() || currentInfo.hasTypedefType() || currentInfo.hasEnumParameterType();}
 *  */
    @Test
    public void testHasAnySingletonTypeTags_NotCurrentInfoHasTypedefType() throws Exception  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        JSDocInfo currentInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(currentInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -2147483391);
        setField(jSDocInfoBuilder, "com.google.javascript.rhino.JSDocInfoBuilder", "currentInfo", currentInfo);
        
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnySingletonTypeTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnySingletonTypeTags");
        hasAnySingletonTypeTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnySingletonTypeTagsMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasAnySingletonTypeTagsMethod.invoke(jSDocInfoBuilder, hasAnySingletonTypeTagsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAnySingletonTypeTags()
    
    /**
    @utbot.classUnderTest {@link JSDocInfoBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.JSDocInfoBuilder#hasAnySingletonTypeTags()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentInfo.hasType() || currentInfo.hasTypedefType() || currentInfo.hasEnumParameterType();
 *  */
    @Test
    public void testHasAnySingletonTypeTags_ThrowNullPointerException() throws Throwable  {
        JSDocInfoBuilder jSDocInfoBuilder = ((JSDocInfoBuilder) createInstance("com.google.javascript.rhino.JSDocInfoBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSDocInfoBuilder.hasAnySingletonTypeTags(JSDocInfoBuilder.java:765) */
        Class jSDocInfoBuilderClazz = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Method hasAnySingletonTypeTagsMethod = jSDocInfoBuilderClazz.getDeclaredMethod("hasAnySingletonTypeTags");
        hasAnySingletonTypeTagsMethod.setAccessible(true);
        java.lang.Object[] hasAnySingletonTypeTagsMethodArguments = new java.lang.Object[0];
        try {
            hasAnySingletonTypeTagsMethod.invoke(jSDocInfoBuilder, hasAnySingletonTypeTagsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields936643239256100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields936643239256100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass936643239260500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936643239256100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936643239260500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields936643239751600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields936643239751600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass936643239753000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936643239751600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936643239753000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

