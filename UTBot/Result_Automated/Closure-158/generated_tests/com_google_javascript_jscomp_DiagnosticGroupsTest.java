package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_DiagnosticGroupsTest {
    ///region Test suites for executable com.google.javascript.jscomp.DiagnosticGroups.forName
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method forName(java.lang.String)
    
    @Test
    public void testForName1() {
        DiagnosticGroups diagnosticGroups = new DiagnosticGroups();
        String string = "";
        
        DiagnosticGroup actual = diagnosticGroups.forName(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DiagnosticGroups.getRegisteredGroups
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRegisteredGroups()
    
    @Test
    public void testGetRegisteredGroups1() throws Exception  {
        DiagnosticGroups diagnosticGroups = new DiagnosticGroups();
        
        Map actual = diagnosticGroups.getRegisteredGroups();
        
        Map expected = new LinkedHashMap();
        String string = "nonStandardJsDocs";
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types = new LinkedHashSet();
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key = "JSC_BAD_JSDOC_ANNOTATION";
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "key", key);
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        CheckLevel defaultLevel = CheckLevel.WARNING;
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType.level = defaultLevel;
        types.add(diagnosticType);
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "name", string);
        expected.put(string, diagnosticGroup);
        String string1 = "strictModuleDepCheck";
        DiagnosticGroup diagnosticGroup1 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types1 = new LinkedHashSet();
        DiagnosticType diagnosticType1 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key1 = "JSC_STRICT_MODULE_DEPENDENCY";
        setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "key", key1);
        MessageFormat format1 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "format", format1);
        CheckLevel defaultLevel1 = CheckLevel.OFF;
        setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType1.level = defaultLevel1;
        types1.add(diagnosticType1);
        DiagnosticType diagnosticType2 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key2 = "JSC_STRICT_MODULE_DEP_QNAME";
        setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "key", key2);
        MessageFormat format2 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "format", format2);
        setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType2.level = defaultLevel1;
        types1.add(diagnosticType2);
        setField(diagnosticGroup1, "com.google.javascript.jscomp.DiagnosticGroup", "types", types1);
        setField(diagnosticGroup1, "com.google.javascript.jscomp.DiagnosticGroup", "name", string1);
        expected.put(string1, diagnosticGroup1);
        String string2 = "typeInvalidation";
        DiagnosticGroup diagnosticGroup2 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types2 = new LinkedHashSet();
        DiagnosticType diagnosticType3 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key3 = "JSC_INVALIDATION";
        setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "key", key3);
        MessageFormat format3 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "format", format3);
        setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType3.level = defaultLevel1;
        types2.add(diagnosticType3);
        setField(diagnosticGroup2, "com.google.javascript.jscomp.DiagnosticGroup", "types", types2);
        setField(diagnosticGroup2, "com.google.javascript.jscomp.DiagnosticGroup", "name", string2);
        expected.put(string2, diagnosticGroup2);
        String string3 = "visibility";
        DiagnosticGroup diagnosticGroup3 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types3 = new LinkedHashSet();
        DiagnosticType diagnosticType4 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key4 = "JSC_BAD_PRIVATE_GLOBAL_ACCESS";
        setField(diagnosticType4, "com.google.javascript.jscomp.DiagnosticType", "key", key4);
        MessageFormat format4 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType4, "com.google.javascript.jscomp.DiagnosticType", "format", format4);
        setField(diagnosticType4, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType4.level = defaultLevel1;
        types3.add(diagnosticType4);
        DiagnosticType diagnosticType5 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key5 = "JSC_BAD_PRIVATE_PROPERTY_ACCESS";
        setField(diagnosticType5, "com.google.javascript.jscomp.DiagnosticType", "key", key5);
        MessageFormat format5 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType5, "com.google.javascript.jscomp.DiagnosticType", "format", format5);
        setField(diagnosticType5, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType5.level = defaultLevel1;
        types3.add(diagnosticType5);
        DiagnosticType diagnosticType6 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key6 = "JSC_BAD_PROTECTED_PROPERTY_ACCESS";
        setField(diagnosticType6, "com.google.javascript.jscomp.DiagnosticType", "key", key6);
        MessageFormat format6 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType6, "com.google.javascript.jscomp.DiagnosticType", "format", format6);
        setField(diagnosticType6, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType6.level = defaultLevel1;
        types3.add(diagnosticType6);
        DiagnosticType diagnosticType7 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key7 = "JSC_PRIVATE_OVERRIDE";
        setField(diagnosticType7, "com.google.javascript.jscomp.DiagnosticType", "key", key7);
        MessageFormat format7 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType7, "com.google.javascript.jscomp.DiagnosticType", "format", format7);
        setField(diagnosticType7, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType7.level = defaultLevel1;
        types3.add(diagnosticType7);
        DiagnosticType diagnosticType8 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key8 = "JSC_VISIBILITY_MISMATCH";
        setField(diagnosticType8, "com.google.javascript.jscomp.DiagnosticType", "key", key8);
        MessageFormat format8 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType8, "com.google.javascript.jscomp.DiagnosticType", "format", format8);
        setField(diagnosticType8, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType8.level = defaultLevel1;
        types3.add(diagnosticType8);
        setField(diagnosticGroup3, "com.google.javascript.jscomp.DiagnosticGroup", "types", types3);
        setField(diagnosticGroup3, "com.google.javascript.jscomp.DiagnosticGroup", "name", string3);
        expected.put(string3, diagnosticGroup3);
        String string4 = "invalidCasts";
        DiagnosticGroup diagnosticGroup4 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types4 = new LinkedHashSet();
        DiagnosticType diagnosticType9 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key9 = "JSC_INVALID_CAST";
        setField(diagnosticType9, "com.google.javascript.jscomp.DiagnosticType", "key", key9);
        MessageFormat format9 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType9, "com.google.javascript.jscomp.DiagnosticType", "format", format9);
        setField(diagnosticType9, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType9.level = defaultLevel;
        types4.add(diagnosticType9);
        setField(diagnosticGroup4, "com.google.javascript.jscomp.DiagnosticGroup", "types", types4);
        setField(diagnosticGroup4, "com.google.javascript.jscomp.DiagnosticGroup", "name", string4);
        expected.put(string4, diagnosticGroup4);
        String string5 = "fileoverviewTags";
        DiagnosticGroup diagnosticGroup5 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types5 = new LinkedHashSet();
        DiagnosticType diagnosticType10 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key10 = "JSC_EXTRA_FILEOVERVIEW";
        setField(diagnosticType10, "com.google.javascript.jscomp.DiagnosticType", "key", key10);
        MessageFormat format10 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType10, "com.google.javascript.jscomp.DiagnosticType", "format", format10);
        setField(diagnosticType10, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType10.level = defaultLevel;
        types5.add(diagnosticType10);
        setField(diagnosticGroup5, "com.google.javascript.jscomp.DiagnosticGroup", "types", types5);
        setField(diagnosticGroup5, "com.google.javascript.jscomp.DiagnosticGroup", "name", string5);
        expected.put(string5, diagnosticGroup5);
        String string6 = "uselessCode";
        DiagnosticGroup diagnosticGroup6 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types6 = new LinkedHashSet();
        DiagnosticType diagnosticType11 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key11 = "JSC_USELESS_CODE";
        setField(diagnosticType11, "com.google.javascript.jscomp.DiagnosticType", "key", key11);
        MessageFormat format11 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType11, "com.google.javascript.jscomp.DiagnosticType", "format", format11);
        setField(diagnosticType11, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType11.level = defaultLevel;
        types6.add(diagnosticType11);
        DiagnosticType diagnosticType12 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key12 = "JSC_UNREACHABLE_CODE";
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "key", key12);
        MessageFormat format12 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "format", format12);
        CheckLevel defaultLevel2 = CheckLevel.ERROR;
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType12.level = defaultLevel2;
        types6.add(diagnosticType12);
        setField(diagnosticGroup6, "com.google.javascript.jscomp.DiagnosticGroup", "types", types6);
        setField(diagnosticGroup6, "com.google.javascript.jscomp.DiagnosticGroup", "name", string6);
        expected.put(string6, diagnosticGroup6);
        String string7 = "deprecated";
        DiagnosticGroup diagnosticGroup7 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types7 = new LinkedHashSet();
        DiagnosticType diagnosticType13 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key13 = "JSC_DEPRECATED_VAR";
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "key", key13);
        MessageFormat format13 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "format", format13);
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType13.level = defaultLevel1;
        types7.add(diagnosticType13);
        DiagnosticType diagnosticType14 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key14 = "JSC_DEPRECATED_VAR_REASON";
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "key", key14);
        MessageFormat format14 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "format", format14);
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType14.level = defaultLevel1;
        types7.add(diagnosticType14);
        DiagnosticType diagnosticType15 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key15 = "JSC_DEPRECATED_PROP";
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "key", key15);
        MessageFormat format15 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "format", format15);
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType15.level = defaultLevel1;
        types7.add(diagnosticType15);
        DiagnosticType diagnosticType16 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key16 = "JSC_DEPRECATED_PROP_REASON";
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "key", key16);
        MessageFormat format16 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "format", format16);
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType16.level = defaultLevel1;
        types7.add(diagnosticType16);
        DiagnosticType diagnosticType17 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key17 = "JSC_DEPRECATED_CLASS";
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "key", key17);
        MessageFormat format17 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "format", format17);
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType17.level = defaultLevel1;
        types7.add(diagnosticType17);
        DiagnosticType diagnosticType18 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key18 = "JSC_DEPRECATED_CLASS_REASON";
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "key", key18);
        MessageFormat format18 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "format", format18);
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType18.level = defaultLevel1;
        types7.add(diagnosticType18);
        setField(diagnosticGroup7, "com.google.javascript.jscomp.DiagnosticGroup", "types", types7);
        setField(diagnosticGroup7, "com.google.javascript.jscomp.DiagnosticGroup", "name", string7);
        expected.put(string7, diagnosticGroup7);
        String string8 = "unknownDefines";
        DiagnosticGroup diagnosticGroup8 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types8 = new LinkedHashSet();
        DiagnosticType diagnosticType19 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key19 = "JSC_UNKNOWN_DEFINE_WARNING";
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "key", key19);
        MessageFormat format19 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "format", format19);
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType19.level = defaultLevel;
        types8.add(diagnosticType19);
        setField(diagnosticGroup8, "com.google.javascript.jscomp.DiagnosticGroup", "types", types8);
        setField(diagnosticGroup8, "com.google.javascript.jscomp.DiagnosticGroup", "name", string8);
        expected.put(string8, diagnosticGroup8);
        String string9 = "undefinedVars";
        DiagnosticGroup diagnosticGroup9 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types9 = new LinkedHashSet();
        DiagnosticType diagnosticType20 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key20 = "JSC_UNDEFINED_VARIABLE";
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "key", key20);
        MessageFormat format20 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "format", format20);
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType20.level = defaultLevel2;
        types9.add(diagnosticType20);
        setField(diagnosticGroup9, "com.google.javascript.jscomp.DiagnosticGroup", "types", types9);
        setField(diagnosticGroup9, "com.google.javascript.jscomp.DiagnosticGroup", "name", string9);
        expected.put(string9, diagnosticGroup9);
        String string10 = "constantProperty";
        DiagnosticGroup diagnosticGroup10 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types10 = new LinkedHashSet();
        DiagnosticType diagnosticType21 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key21 = "JSC_CONSTANT_PROPERTY_REASSIGNED_VALUE";
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "key", key21);
        MessageFormat format21 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "format", format21);
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType21.level = defaultLevel;
        types10.add(diagnosticType21);
        setField(diagnosticGroup10, "com.google.javascript.jscomp.DiagnosticGroup", "types", types10);
        setField(diagnosticGroup10, "com.google.javascript.jscomp.DiagnosticGroup", "name", string10);
        expected.put(string10, diagnosticGroup10);
        String string11 = "\n\t\r";
        DiagnosticGroup diagnosticGroup11 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types11 = new LinkedHashSet();
        setField(diagnosticGroup11, "com.google.javascript.jscomp.DiagnosticGroup", "types", types11);
        String name = "";
        setField(diagnosticGroup11, "com.google.javascript.jscomp.DiagnosticGroup", "name", name);
        expected.put(string11, diagnosticGroup11);
        String string12 = "tweakValidation";
        DiagnosticGroup diagnosticGroup12 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types12 = new LinkedHashSet();
        DiagnosticType diagnosticType22 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key22 = "JSC_INVALID_TWEAK_DEFAULT_VALUE_WARNING";
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "key", key22);
        MessageFormat format22 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "format", format22);
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType22.level = defaultLevel;
        types12.add(diagnosticType22);
        DiagnosticType diagnosticType23 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key23 = "JSC_TWEAK_WRONG_GETTER_TYPE_WARNING";
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "key", key23);
        MessageFormat format23 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "format", format23);
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType23.level = defaultLevel;
        types12.add(diagnosticType23);
        DiagnosticType diagnosticType24 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key24 = "JSC_UNKNOWN_TWEAK_WARNING";
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "key", key24);
        MessageFormat format24 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "format", format24);
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType24.level = defaultLevel;
        types12.add(diagnosticType24);
        setField(diagnosticGroup12, "com.google.javascript.jscomp.DiagnosticGroup", "types", types12);
        setField(diagnosticGroup12, "com.google.javascript.jscomp.DiagnosticGroup", "name", string12);
        expected.put(string12, diagnosticGroup12);
        String string13 = "globalThis";
        DiagnosticGroup diagnosticGroup13 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types13 = new LinkedHashSet();
        DiagnosticType diagnosticType25 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key25 = "JSC_USED_GLOBAL_THIS";
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "key", key25);
        MessageFormat format25 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "format", format25);
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType25.level = defaultLevel;
        types13.add(diagnosticType25);
        setField(diagnosticGroup13, "com.google.javascript.jscomp.DiagnosticGroup", "types", types13);
        setField(diagnosticGroup13, "com.google.javascript.jscomp.DiagnosticGroup", "name", string13);
        expected.put(string13, diagnosticGroup13);
        String string14 = "checkRegExp";
        DiagnosticGroup diagnosticGroup14 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types14 = new LinkedHashSet();
        DiagnosticType diagnosticType26 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key26 = "JSC_REGEXP_REFERENCE";
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "key", key26);
        MessageFormat format26 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "format", format26);
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType26.level = defaultLevel;
        types14.add(diagnosticType26);
        setField(diagnosticGroup14, "com.google.javascript.jscomp.DiagnosticGroup", "types", types14);
        setField(diagnosticGroup14, "com.google.javascript.jscomp.DiagnosticGroup", "name", string14);
        expected.put(string14, diagnosticGroup14);
        String string15 = "checkTypes";
        DiagnosticGroup diagnosticGroup15 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types15 = new LinkedHashSet();
        DiagnosticType diagnosticType27 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key27 = "JSC_INTERFACE_FUNCTION_NOT_EMPTY";
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "key", key27);
        MessageFormat format27 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "format", format27);
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType27.level = defaultLevel;
        types15.add(diagnosticType27);
        DiagnosticType diagnosticType28 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key28 = "JSC_DETERMINISTIC_TEST_NO_RESULT";
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "key", key28);
        MessageFormat format28 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "format", format28);
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType28.level = defaultLevel;
        types15.add(diagnosticType28);
        DiagnosticType diagnosticType29 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key29 = "JSC_WRONG_ARGUMENT_COUNT";
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "key", key29);
        MessageFormat format29 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "format", format29);
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType29.level = defaultLevel;
        types15.add(diagnosticType29);
        DiagnosticType diagnosticType30 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key30 = "JSC_CONSTRUCTOR_NOT_CALLABLE";
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "key", key30);
        MessageFormat format30 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "format", format30);
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType30.level = defaultLevel;
        types15.add(diagnosticType30);
        DiagnosticType diagnosticType31 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key31 = "JSC_UNKNOWN_OVERRIDE";
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "key", key31);
        MessageFormat format31 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "format", format31);
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType31.level = defaultLevel;
        types15.add(diagnosticType31);
        DiagnosticType diagnosticType32 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key32 = "JSC_BAD_TYPE_FOR_BIT_OPERATION";
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "key", key32);
        MessageFormat format32 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "format", format32);
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType32.level = defaultLevel;
        types15.add(diagnosticType32);
        DiagnosticType diagnosticType33 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key33 = "JSC_DETERMINISTIC_TEST";
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "key", key33);
        MessageFormat format33 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "format", format33);
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType33.level = defaultLevel;
        types15.add(diagnosticType33);
        DiagnosticType diagnosticType34 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key34 = "JSC_INEXISTENT_PROPERTY";
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "key", key34);
        MessageFormat format34 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "format", format34);
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType34.level = defaultLevel1;
        types15.add(diagnosticType34);
        DiagnosticType diagnosticType35 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key35 = "JSC_HIDDEN_SUPERCLASS_PROPERTY";
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "key", key35);
        MessageFormat format35 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "format", format35);
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType35.level = defaultLevel;
        types15.add(diagnosticType35);
        DiagnosticType diagnosticType36 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key36 = "JSC_IFACE_INITIALIZER_NOT_IFACE";
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "key", key36);
        MessageFormat format36 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "format", format36);
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType36.level = defaultLevel;
        types15.add(diagnosticType36);
        DiagnosticType diagnosticType37 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key37 = "JSC_MISSING_EXTENDS_TAG";
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "key", key37);
        MessageFormat format37 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "format", format37);
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType37.level = defaultLevel;
        types15.add(diagnosticType37);
        DiagnosticType diagnosticType38 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key38 = "JSC_ENUM_NOT_CONSTANT";
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "key", key38);
        MessageFormat format38 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "format", format38);
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType38.level = defaultLevel;
        types15.add(diagnosticType38);
        DiagnosticType diagnosticType39 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key39 = "JSC_INTERFACE_METHOD_NOT_IMPLEMENTED";
        setField(diagnosticType39, "com.google.javascript.jscomp.DiagnosticType", "key", key39);
        MessageFormat format39 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType39, "com.google.javascript.jscomp.DiagnosticType", "format", format39);
        setField(diagnosticType39, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType39.level = defaultLevel;
        types15.add(diagnosticType39);
        types15.add(diagnosticType9);
        DiagnosticType diagnosticType40 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key40 = "JSC_HIDDEN_SUPERCLASS_PROPERTY_MISMATCH";
        setField(diagnosticType40, "com.google.javascript.jscomp.DiagnosticType", "key", key40);
        MessageFormat format40 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType40, "com.google.javascript.jscomp.DiagnosticType", "format", format40);
        setField(diagnosticType40, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType40.level = defaultLevel;
        types15.add(diagnosticType40);
        DiagnosticType diagnosticType41 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key41 = "JSC_UNKNOWN_LENDS";
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "key", key41);
        MessageFormat format41 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "format", format41);
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType41.level = defaultLevel;
        types15.add(diagnosticType41);
        DiagnosticType diagnosticType42 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key42 = "JSC_INEXISTENT_ENUM_ELEMENT";
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "key", key42);
        MessageFormat format42 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "format", format42);
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType42.level = defaultLevel;
        types15.add(diagnosticType42);
        DiagnosticType diagnosticType43 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key43 = "JSC_IMPLEMENTS_NON_INTERFACE";
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "key", key43);
        MessageFormat format43 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "format", format43);
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType43.level = defaultLevel;
        types15.add(diagnosticType43);
        DiagnosticType diagnosticType44 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key44 = "JSC_HIDDEN_INTERFACE_PROPERTY";
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "key", key44);
        MessageFormat format44 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "format", format44);
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType44.level = defaultLevel;
        types15.add(diagnosticType44);
        DiagnosticType diagnosticType45 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key45 = "JSC_INTERFACE_METHOD_OVERRIDE";
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "key", key45);
        MessageFormat format45 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "format", format45);
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType45.level = defaultLevel;
        types15.add(diagnosticType45);
        DiagnosticType diagnosticType46 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key46 = "JSC_CONFLICTING_EXTENDED_TYPE";
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "key", key46);
        MessageFormat format46 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "format", format46);
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType46.level = defaultLevel;
        types15.add(diagnosticType46);
        DiagnosticType diagnosticType47 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key47 = "JSC_DUP_VAR_DECLARATION";
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "key", key47);
        MessageFormat format47 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "format", format47);
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType47.level = defaultLevel;
        types15.add(diagnosticType47);
        DiagnosticType diagnosticType48 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key48 = "JSC_CTOR_INITIALIZER_NOT_CTOR";
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "key", key48);
        MessageFormat format48 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "format", format48);
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType48.level = defaultLevel;
        types15.add(diagnosticType48);
        DiagnosticType diagnosticType49 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key49 = "JSC_THIS_TYPE_NON_OBJECT";
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "key", key49);
        MessageFormat format49 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "format", format49);
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType49.level = defaultLevel;
        types15.add(diagnosticType49);
        DiagnosticType diagnosticType50 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key50 = "JSC_HIDDEN_PROPERTY_MISMATCH";
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "key", key50);
        MessageFormat format50 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "format", format50);
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType50.level = defaultLevel;
        types15.add(diagnosticType50);
        DiagnosticType diagnosticType51 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key51 = "JSC_NOT_A_CONSTRUCTOR";
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "key", key51);
        MessageFormat format51 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "format", format51);
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType51.level = defaultLevel;
        types15.add(diagnosticType51);
        DiagnosticType diagnosticType52 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key52 = "JSC_UNRESOLVED_TYPE";
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "key", key52);
        MessageFormat format52 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "format", format52);
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType52.level = defaultLevel;
        types15.add(diagnosticType52);
        DiagnosticType diagnosticType53 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key53 = "JSC_NOT_FUNCTION_TYPE";
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "key", key53);
        MessageFormat format53 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "format", format53);
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType53.level = defaultLevel;
        types15.add(diagnosticType53);
        DiagnosticType diagnosticType54 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key54 = "JSC_LENDS_ON_NON_OBJECT";
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "key", key54);
        MessageFormat format54 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "format", format54);
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType54.level = defaultLevel;
        types15.add(diagnosticType54);
        DiagnosticType diagnosticType55 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key55 = "JSC_ILLEGAL_IMPLICIT_CAST";
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "key", key55);
        MessageFormat format55 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "format", format55);
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType55.level = defaultLevel;
        types15.add(diagnosticType55);
        DiagnosticType diagnosticType56 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key56 = "JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH";
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "key", key56);
        MessageFormat format56 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "format", format56);
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType56.level = defaultLevel;
        types15.add(diagnosticType56);
        DiagnosticType diagnosticType57 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key57 = "JSC_MULTIPLE_VAR_DEF";
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "key", key57);
        MessageFormat format57 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "format", format57);
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType57.level = defaultLevel;
        types15.add(diagnosticType57);
        DiagnosticType diagnosticType58 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key58 = "JSC_TYPE_MISMATCH";
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "key", key58);
        MessageFormat format58 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "format", format58);
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType58.level = defaultLevel;
        types15.add(diagnosticType58);
        DiagnosticType diagnosticType59 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key59 = "JSC_FUNCTION_MASKS_VARIABLE";
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "key", key59);
        MessageFormat format59 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "format", format59);
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType59.level = defaultLevel;
        types15.add(diagnosticType59);
        DiagnosticType diagnosticType60 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key60 = "JSC_INVALID_INTERFACE_MEMBER_DECLARATION";
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "key", key60);
        MessageFormat format60 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "format", format60);
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType60.level = defaultLevel;
        types15.add(diagnosticType60);
        DiagnosticType diagnosticType61 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key61 = "JSC_UNKNOWN_EXPR_TYPE";
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "key", key61);
        MessageFormat format61 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "format", format61);
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType61.level = defaultLevel;
        types15.add(diagnosticType61);
        DiagnosticType diagnosticType62 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key62 = "JSC_ENUM_DUP";
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "key", key62);
        MessageFormat format62 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "format", format62);
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType62.level = defaultLevel2;
        types15.add(diagnosticType62);
        DiagnosticType diagnosticType63 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key63 = "JSC_TYPE_PARSE_ERROR";
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "key", key63);
        MessageFormat format63 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "format", format63);
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType63.level = defaultLevel;
        types15.add(diagnosticType63);
        setField(diagnosticGroup15, "com.google.javascript.jscomp.DiagnosticGroup", "types", types15);
        setField(diagnosticGroup15, "com.google.javascript.jscomp.DiagnosticGroup", "name", string15);
        expected.put(string15, diagnosticGroup15);
        String string16 = "internetExplorerChecks";
        DiagnosticGroup diagnosticGroup16 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types16 = new LinkedHashSet();
        DiagnosticType diagnosticType64 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key64 = "JSC_TRAILING_COMMA";
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "key", key64);
        MessageFormat format64 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "format", format64);
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType64.level = defaultLevel2;
        types16.add(diagnosticType64);
        setField(diagnosticGroup16, "com.google.javascript.jscomp.DiagnosticGroup", "types", types16);
        setField(diagnosticGroup16, "com.google.javascript.jscomp.DiagnosticGroup", "name", string16);
        expected.put(string16, diagnosticGroup16);
        String string17 = "\n\t\r?";
        DiagnosticGroup diagnosticGroup17 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types17 = new LinkedHashSet();
        setField(diagnosticGroup17, "com.google.javascript.jscomp.DiagnosticGroup", "types", types17);
        setField(diagnosticGroup17, "com.google.javascript.jscomp.DiagnosticGroup", "name", string17);
        expected.put(string17, diagnosticGroup17);
        String string18 = "ambiguousFunctionDecl";
        DiagnosticGroup diagnosticGroup18 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types18 = new LinkedHashSet();
        DiagnosticType diagnosticType65 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key65 = "AMBIGUOUS_FUNCTION_DECL";
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "key", key65);
        MessageFormat format65 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "format", format65);
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType65.level = defaultLevel1;
        types18.add(diagnosticType65);
        setField(diagnosticGroup18, "com.google.javascript.jscomp.DiagnosticGroup", "types", types18);
        setField(diagnosticGroup18, "com.google.javascript.jscomp.DiagnosticGroup", "name", string18);
        expected.put(string18, diagnosticGroup18);
        String string19 = "missingProperties";
        DiagnosticGroup diagnosticGroup19 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types19 = new LinkedHashSet();
        types19.add(diagnosticType34);
        setField(diagnosticGroup19, "com.google.javascript.jscomp.DiagnosticGroup", "types", types19);
        setField(diagnosticGroup19, "com.google.javascript.jscomp.DiagnosticGroup", "name", string19);
        expected.put(string19, diagnosticGroup19);
        String string20 = "checkVars";
        DiagnosticGroup diagnosticGroup20 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types20 = new LinkedHashSet();
        types20.add(diagnosticType20);
        DiagnosticType diagnosticType66 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key66 = "JSC_VAR_MULTIPLY_DECLARED_ERROR";
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "key", key66);
        MessageFormat format66 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "format", format66);
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType66.level = defaultLevel2;
        types20.add(diagnosticType66);
        setField(diagnosticGroup20, "com.google.javascript.jscomp.DiagnosticGroup", "types", types20);
        setField(diagnosticGroup20, "com.google.javascript.jscomp.DiagnosticGroup", "name", string20);
        expected.put(string20, diagnosticGroup20);
        String string21 = "accessControls";
        DiagnosticGroup diagnosticGroup21 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types21 = new LinkedHashSet();
        types21.add(diagnosticType15);
        types21.add(diagnosticType16);
        types21.add(diagnosticType4);
        types21.add(diagnosticType17);
        types21.add(diagnosticType18);
        types21.add(diagnosticType14);
        types21.add(diagnosticType8);
        types21.add(diagnosticType6);
        types21.add(diagnosticType13);
        types21.add(diagnosticType5);
        types21.add(diagnosticType7);
        setField(diagnosticGroup21, "com.google.javascript.jscomp.DiagnosticGroup", "types", types21);
        setField(diagnosticGroup21, "com.google.javascript.jscomp.DiagnosticGroup", "name", string21);
        expected.put(string21, diagnosticGroup21);
        String string22 = "externsValidation";
        DiagnosticGroup diagnosticGroup22 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types22 = new LinkedHashSet();
        DiagnosticType diagnosticType67 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key67 = "JSC_NAME_REFERENCE_IN_EXTERNS";
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "key", key67);
        MessageFormat format67 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "format", format67);
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType67.level = defaultLevel;
        types22.add(diagnosticType67);
        DiagnosticType diagnosticType68 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key68 = "JSC_UNDEFINED_EXTERN_VAR_ERROR";
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "key", key68);
        MessageFormat format68 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "format", format68);
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType68.level = defaultLevel;
        types22.add(diagnosticType68);
        setField(diagnosticGroup22, "com.google.javascript.jscomp.DiagnosticGroup", "types", types22);
        setField(diagnosticGroup22, "com.google.javascript.jscomp.DiagnosticGroup", "name", string22);
        expected.put(string22, diagnosticGroup22);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DiagnosticGroups.registerGroup
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method registerGroup(java.lang.String, [Lcom.google.javascript.jscomp.DiagnosticType;)
    
    /**
    @utbot.classUnderTest {@link DiagnosticGroups}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups#registerGroup(java.lang.String,com.google.javascript.jscomp.DiagnosticType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DiagnosticGroup group = new DiagnosticGroup(name, types);
 *  */
    @Test
    public void testRegisterGroup_ThrowNullPointerException() {
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray = {null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.DiagnosticGroups.registerGroup] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableSet.construct(ImmutableSet.java:167)
            com.google.common.collect.ImmutableSet.copyFromCollection(ImmutableSet.java:360)
            com.google.common.collect.ImmutableSet.copyOf(ImmutableSet.java:344)
            com.google.javascript.jscomp.DiagnosticGroup.<init>(DiagnosticGroup.java:46)
            com.google.javascript.jscomp.DiagnosticGroups.registerGroup(DiagnosticGroups.java:44) */
        DiagnosticGroups.registerGroup(((String) null), diagnosticTypeArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method registerGroup(java.lang.String, [Lcom.google.javascript.jscomp.DiagnosticType;)
    
    /**
    @utbot.classUnderTest {@link DiagnosticGroups}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups#registerGroup(java.lang.String,com.google.javascript.jscomp.DiagnosticType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testRegisterGroup_ThrowNullPointerException_1() {
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray = {null};
        
        DiagnosticGroups.registerGroup(((String) null), diagnosticTypeArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method registerGroup(java.lang.String, [Lcom.google.javascript.jscomp.DiagnosticType;)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups#registerGroup(java.lang.String,com.google.javascript.jscomp.DiagnosticType[])}
     */
    @Test
    public void testRegisterGroupWithNonEmptyStringAndEmptyObjectArray() throws Exception  {
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray = {};
        
        DiagnosticGroup actual = DiagnosticGroups.registerGroup("\n\t\r?", diagnosticTypeArray);
        
        DiagnosticGroup expected = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types = new LinkedHashSet();
        setField(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        String name = "\n\t\r?";
        setField(expected, "com.google.javascript.jscomp.DiagnosticGroup", "name", name);
        
        Set expectedTypes = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
        Set actualTypes = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
        assertTrue(deepEquals(expectedTypes, actualTypes));
        
        String expectedName = ((String) getFieldValue(expected, "com.google.javascript.jscomp.DiagnosticGroup", "name"));
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "name"));
        assertEquals(expectedName, actualName);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method registerGroup(java.lang.String, [Lcom.google.javascript.jscomp.DiagnosticType;)
    
    @Test
    public void testRegisterGroup1() throws Exception  {
        Class emptyImmutableSetClazz = Class.forName("com.google.common.collect.EmptyImmutableSet");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableSetClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableSet");
            setStaticField(emptyImmutableSetClazz, "INSTANCE", instance);
            com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray = {};
            
            DiagnosticGroup actual = DiagnosticGroups.registerGroup(((String) null), diagnosticTypeArray);
            
            DiagnosticGroup expected = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
            Set types = new LinkedHashSet();
            setField(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
            
            Set expectedTypes = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
            Set actualTypes = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
            assertTrue(deepEquals(expectedTypes, actualTypes));
            
            String actualName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "name"));
            assertNull(actualName);
            
        } finally {
            setStaticField(emptyImmutableSetClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DiagnosticGroups.registerGroup
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method registerGroup(java.lang.String, [Lcom.google.javascript.jscomp.DiagnosticGroup;)
    
    /**
    @utbot.classUnderTest {@link DiagnosticGroups}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups#registerGroup(java.lang.String,com.google.javascript.jscomp.DiagnosticGroup[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DiagnosticGroup group = new DiagnosticGroup(name, groups);
 *  */
    @Test
    public void testRegisterGroup_ThrowNullPointerException1() throws Exception  {
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray = new com.google.javascript.jscomp.DiagnosticGroup[1];
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        diagnosticGroupArray[0] = diagnosticGroup;
        
        /* This test fails because method [com.google.javascript.jscomp.DiagnosticGroups.registerGroup] produces [java.lang.NullPointerException]
            java.base/java.util.AbstractCollection.addAll(AbstractCollection.java:335)
            com.google.javascript.jscomp.DiagnosticGroup.<init>(DiagnosticGroup.java:90)
            com.google.javascript.jscomp.DiagnosticGroups.registerGroup(DiagnosticGroups.java:51) */
        DiagnosticGroups.registerGroup(((String) null), diagnosticGroupArray);
    }
    
    /**
    @utbot.classUnderTest {@link DiagnosticGroups}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups#registerGroup(java.lang.String,com.google.javascript.jscomp.DiagnosticGroup[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DiagnosticGroup group = new DiagnosticGroup(name, groups);
 *  */
    @Test
    public void testRegisterGroup_ThrowNullPointerException_11() throws Exception  {
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray = new com.google.javascript.jscomp.DiagnosticGroup[2];
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        diagnosticGroupArray[0] = diagnosticGroup;
        DiagnosticGroup diagnosticGroup1 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        diagnosticGroupArray[1] = diagnosticGroup1;
        
        /* This test fails because method [com.google.javascript.jscomp.DiagnosticGroups.registerGroup] produces [java.lang.NullPointerException]
            java.base/java.util.AbstractCollection.addAll(AbstractCollection.java:335)
            com.google.javascript.jscomp.DiagnosticGroup.<init>(DiagnosticGroup.java:90)
            com.google.javascript.jscomp.DiagnosticGroups.registerGroup(DiagnosticGroups.java:51) */
        DiagnosticGroups.registerGroup(((String) null), diagnosticGroupArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method registerGroup(java.lang.String, [Lcom.google.javascript.jscomp.DiagnosticGroup;)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups#registerGroup(java.lang.String,com.google.javascript.jscomp.DiagnosticGroup[])}
     */
    @Test
    public void testRegisterGroupWithBlankStringAndNonEmptyObjectArray() throws Exception  {
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray = new com.google.javascript.jscomp.DiagnosticGroup[3];
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray1 = new com.google.javascript.jscomp.DiagnosticGroup[5];
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray2 = {};
        DiagnosticGroup diagnosticGroup = new DiagnosticGroup(diagnosticGroupArray2);
        diagnosticGroupArray1[0] = diagnosticGroup;
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray = {};
        DiagnosticGroup diagnosticGroup1 = new DiagnosticGroup(diagnosticTypeArray);
        diagnosticGroupArray1[1] = diagnosticGroup1;
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray1 = {};
        DiagnosticGroup diagnosticGroup2 = new DiagnosticGroup(diagnosticTypeArray1);
        diagnosticGroupArray1[2] = diagnosticGroup2;
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray2 = {};
        DiagnosticGroup diagnosticGroup3 = new DiagnosticGroup("abc", diagnosticTypeArray2);
        diagnosticGroupArray1[3] = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray3 = {};
        DiagnosticGroup diagnosticGroup4 = new DiagnosticGroup(diagnosticTypeArray3);
        diagnosticGroupArray1[4] = diagnosticGroup4;
        DiagnosticGroup diagnosticGroup5 = new DiagnosticGroup(diagnosticGroupArray1);
        diagnosticGroupArray[0] = diagnosticGroup5;
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray4 = {};
        DiagnosticGroup diagnosticGroup6 = new DiagnosticGroup(diagnosticTypeArray4);
        diagnosticGroupArray[1] = diagnosticGroup6;
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray3 = new com.google.javascript.jscomp.DiagnosticGroup[5];
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray4 = {};
        DiagnosticGroup diagnosticGroup7 = new DiagnosticGroup(diagnosticGroupArray4);
        diagnosticGroupArray3[0] = diagnosticGroup7;
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray5 = {};
        DiagnosticGroup diagnosticGroup8 = new DiagnosticGroup("\n\t\r", diagnosticGroupArray5);
        diagnosticGroupArray3[1] = diagnosticGroup8;
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray5 = {};
        DiagnosticGroup diagnosticGroup9 = new DiagnosticGroup(diagnosticTypeArray5);
        diagnosticGroupArray3[2] = diagnosticGroup9;
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray6 = {};
        DiagnosticGroup diagnosticGroup10 = new DiagnosticGroup(diagnosticGroupArray6);
        diagnosticGroupArray3[3] = diagnosticGroup10;
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray6 = {};
        DiagnosticGroup diagnosticGroup11 = new DiagnosticGroup("abc", diagnosticTypeArray6);
        diagnosticGroupArray3[4] = diagnosticGroup11;
        DiagnosticGroup diagnosticGroup12 = new DiagnosticGroup("", diagnosticGroupArray3);
        diagnosticGroupArray[2] = diagnosticGroup12;
        
        DiagnosticGroup actual = DiagnosticGroups.registerGroup("\n\t\r", diagnosticGroupArray);
        
        DiagnosticGroup expected = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types = new LinkedHashSet();
        setField(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        String name = "\n\t\r";
        setField(expected, "com.google.javascript.jscomp.DiagnosticGroup", "name", name);
        
        Set expectedTypes = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
        Set actualTypes = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
        assertTrue(deepEquals(expectedTypes, actualTypes));
        
        String expectedName = ((String) getFieldValue(expected, "com.google.javascript.jscomp.DiagnosticGroup", "name"));
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "name"));
        assertEquals(expectedName, actualName);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method registerGroup(java.lang.String, [Lcom.google.javascript.jscomp.DiagnosticGroup;)
    
    @Test
    public void testRegisterGroup2() throws Exception  {
        Class emptyImmutableSetClazz = Class.forName("com.google.common.collect.EmptyImmutableSet");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableSetClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableSet");
            setStaticField(emptyImmutableSetClazz, "INSTANCE", instance);
            com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray = {};
            
            DiagnosticGroup actual = DiagnosticGroups.registerGroup(((String) null), diagnosticGroupArray);
            
            DiagnosticGroup expected = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
            Set types = new LinkedHashSet();
            setField(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
            
            Set expectedTypes = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
            Set actualTypes = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
            assertTrue(deepEquals(expectedTypes, actualTypes));
            
            String actualName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "name"));
            assertNull(actualName);
            
        } finally {
            setStaticField(emptyImmutableSetClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testRegisterGroup3() throws Exception  {
        Class emptyImmutableSetClazz = Class.forName("com.google.common.collect.EmptyImmutableSet");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableSetClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableSet");
            setStaticField(emptyImmutableSetClazz, "INSTANCE", instance);
            com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray = new com.google.javascript.jscomp.DiagnosticGroup[1];
            DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
            LinkedHashSet types = new LinkedHashSet();
            setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
            diagnosticGroupArray[0] = diagnosticGroup;
            
            DiagnosticGroup actual = DiagnosticGroups.registerGroup(((String) null), diagnosticGroupArray);
            
            DiagnosticGroup expected = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
            Set types1 = new LinkedHashSet();
            setField(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types", types1);
            
            Set expectedTypes = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
            Set actualTypes = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
            assertTrue(deepEquals(expectedTypes, actualTypes));
            
            String actualName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "name"));
            assertNull(actualName);
            
        } finally {
            setStaticField(emptyImmutableSetClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testRegisterGroup4() throws Exception  {
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray = new com.google.javascript.jscomp.DiagnosticGroup[1];
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        types.add(diagnosticType);
        DiagnosticType diagnosticType1 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        types.add(diagnosticType1);
        types.add(diagnosticType1);
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        diagnosticGroupArray[0] = diagnosticGroup;
        
        DiagnosticGroup actual = DiagnosticGroups.registerGroup(((String) null), diagnosticGroupArray);
        
        DiagnosticGroup expected = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types1 = new LinkedHashSet();
        types1.add(diagnosticType);
        types1.add(diagnosticType1);
        setField(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types", types1);
        
        Set expectedTypes = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
        Set actualTypes = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
        assertTrue(deepEquals(expectedTypes, actualTypes));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "name"));
        assertNull(actualName);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method registerGroup(java.lang.String, [Lcom.google.javascript.jscomp.DiagnosticGroup;)
    
    @Test
    public void testRegisterGroup5() throws Exception  {
        String string = "";
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray = new com.google.javascript.jscomp.DiagnosticGroup[9];
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        types.add(diagnosticType);
        DiagnosticType diagnosticType1 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        types.add(diagnosticType1);
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        diagnosticGroupArray[0] = diagnosticGroup;
        
        /* This test fails because method [com.google.javascript.jscomp.DiagnosticGroups.registerGroup] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DiagnosticGroup.<init>(DiagnosticGroup.java:90)
            com.google.javascript.jscomp.DiagnosticGroups.registerGroup(DiagnosticGroups.java:51) */
        DiagnosticGroups.registerGroup(string, diagnosticGroupArray);
    }
    
    @Test
    public void testRegisterGroup6() throws Exception  {
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray = new com.google.javascript.jscomp.DiagnosticGroup[10];
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        diagnosticGroupArray[0] = diagnosticGroup;
        DiagnosticGroup diagnosticGroup1 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types1 = new LinkedHashSet();
        setField(diagnosticGroup1, "com.google.javascript.jscomp.DiagnosticGroup", "types", types1);
        diagnosticGroupArray[1] = diagnosticGroup1;
        
        /* This test fails because method [com.google.javascript.jscomp.DiagnosticGroups.registerGroup] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DiagnosticGroup.<init>(DiagnosticGroup.java:90)
            com.google.javascript.jscomp.DiagnosticGroups.registerGroup(DiagnosticGroups.java:51) */
        DiagnosticGroups.registerGroup(((String) null), diagnosticGroupArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DiagnosticGroups.registerGroup
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method registerGroup(java.lang.String, com.google.javascript.jscomp.DiagnosticGroup)
    
    @Test
    public void testRegisterGroup7() throws Exception  {
        String string = "";
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        
        DiagnosticGroup actual = DiagnosticGroups.registerGroup(string, diagnosticGroup);
        
        Set actualTypes = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "types"));
        assertNull(actualTypes);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DiagnosticGroup", "name"));
        assertNull(actualName);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DiagnosticGroups.setWarningLevels
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setWarningLevels(com.google.javascript.jscomp.CompilerOptions, java.util.List, com.google.javascript.jscomp.CheckLevel)
    
    /**
    @utbot.classUnderTest {@link DiagnosticGroups}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups#setWarningLevels(com.google.javascript.jscomp.CompilerOptions,java.util.List,com.google.javascript.jscomp.CheckLevel)}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testSetWarningLevels_ListIterator() {
        DiagnosticGroups diagnosticGroups = new DiagnosticGroups();
        ArrayList arrayList = new ArrayList();
        
        diagnosticGroups.setWarningLevels(null, arrayList, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setWarningLevels(com.google.javascript.jscomp.CompilerOptions, java.util.List, com.google.javascript.jscomp.CheckLevel)
    
    /**
    @utbot.classUnderTest {@link DiagnosticGroups}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups#setWarningLevels(com.google.javascript.jscomp.CompilerOptions,java.util.List,com.google.javascript.jscomp.CheckLevel)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String name: diagnosticGroups)
 *  */
    @Test
    public void testSetWarningLevels_ThrowNullPointerException() {
        DiagnosticGroups diagnosticGroups = new DiagnosticGroups();
        
        /* This test fails because method [com.google.javascript.jscomp.DiagnosticGroups.setWarningLevels] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DiagnosticGroups.setWarningLevels(DiagnosticGroups.java:187) */
        diagnosticGroups.setWarningLevels(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setWarningLevels(com.google.javascript.jscomp.CompilerOptions, java.util.List, com.google.javascript.jscomp.CheckLevel)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DiagnosticGroups#setWarningLevels(com.google.javascript.jscomp.CompilerOptions,java.util.List,com.google.javascript.jscomp.CheckLevel)}
     */
    @Test(expected = NullPointerException.class)
    public void testSetWarningLevelsThrowsNPE() {
        DiagnosticGroups diagnosticGroups = new DiagnosticGroups();
        LinkedList linkedList = new LinkedList();
        linkedList.add("abc");
        linkedList.add("\n\t\r");
        linkedList.add("-3");
        linkedList.add("XZ");
        linkedList.add("10");
        CheckLevel checkLevel = CheckLevel.OFF;
        
        diagnosticGroups.setWarningLevels(null, linkedList, checkLevel);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setWarningLevels(com.google.javascript.jscomp.CompilerOptions, java.util.List, com.google.javascript.jscomp.CheckLevel)
    
    @Test
    public void testSetWarningLevels1() {
        DiagnosticGroups diagnosticGroups = new DiagnosticGroups();
        ArrayList arrayList = new ArrayList();
        String string = "";
        arrayList.add(string);
        arrayList.add(null);
        arrayList.add(null);
        CheckLevel checkLevel = CheckLevel.OFF;
        
        /* This test fails because method [com.google.javascript.jscomp.DiagnosticGroups.setWarningLevels] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DiagnosticGroups.setWarningLevels(DiagnosticGroups.java:190) */
        diagnosticGroups.setWarningLevels(null, arrayList, checkLevel);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields914796613400900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields914796613400900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass914796613407600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914796613400900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914796613407600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields914796621688700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields914796621688700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass914796621693000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914796621688700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914796621693000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields914796622553400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields914796622553400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass914796622557300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914796622553400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914796622557300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields914796623263300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields914796623263300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass914796623266400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914796623263300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914796623266400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

