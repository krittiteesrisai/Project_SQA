package org.apache.commons.cli2.option;

import org.junit.Test;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import org.junit.Ignore;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.List;
import org.apache.commons.cli2.Option;
import java.util.Set;
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.HashSet;
import java.lang.reflect.Method;
import org.apache.commons.cli2.WriteableCommandLine;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentSkipListMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static java.util.Collections.emptyList;

public final class org_apache_commons_cli2_option_GroupImplTest {
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.getDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDescription()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#getDescription()}
 * @utbot.returnsFrom {@code return description;}
 *  */
    @Test
    public void testGetDescription_ReturnDescription() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        String actual = groupImpl.getDescription();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.getPrefixes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrefixes()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#getPrefixes()}
 * @utbot.returnsFrom {@code return prefixes;}
 *  */
    @Test
    public void testGetPrefixes_ReturnPrefixes() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        LinkedHashSet prefixes = new LinkedHashSet();
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "prefixes", prefixes);
        
        LinkedHashSet actual = ((LinkedHashSet) groupImpl.getPrefixes());
        
        assertTrue(deepEquals(prefixes, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.validate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validate(org.apache.commons.cli2.WriteableCommandLine)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#validate(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = options.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Option option = (Option) i.next();
 *  */
    @Test
    public void testValidate_ThrowClassCastException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        Object object = createInstance("java.lang.Object");
        options.add(object);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.validate] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli2.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli2.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli2.option.GroupImpl.validate(GroupImpl.java:246) */
        groupImpl.validate(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#validate(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Iterator i = options.iterator(); i.hasNext(); )
 *  */
    @Test
    public void testValidate_ThrowNullPointerException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.validate] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.validate(GroupImpl.java:245) */
        groupImpl.validate(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#validate(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.executesCondition {@code (unexpected != null): False}
 * @utbot.executesCondition {@code (present < minimum): False}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Iterator i = anonymous.iterator(); i.hasNext(); )
 *  */
    @Test
    public void testValidate_ThrowNullPointerException_1() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.validate] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.validate(GroupImpl.java:278) */
        groupImpl.validate(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#validate(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = options.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: commandLine.hasOption(option)
 *  */
    @Test
    public void testValidate_ThrowNullPointerException_3() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        options.add(argumentImpl);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.validate] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.validate(GroupImpl.java:255) */
        groupImpl.validate(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#validate(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = options.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean validate = option.isRequired() || option instanceof Group;
 *  */
    @Test
    public void testValidate_ThrowNullPointerException_2() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.validate] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.validate(GroupImpl.java:249) */
        groupImpl.validate(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SECURITY for method validate(org.apache.commons.cli2.WriteableCommandLine)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#validate(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.executesCondition {@code (unexpected != null): False}
 * @utbot.executesCondition {@code (present < minimum): True}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.ExceptionInInitializerError} when: present < minimum
 *  */
    @Test(expected = ExceptionInInitializerError.class)
    @Ignore(value = "Disabled due to sandbox")
    public void testValidate_ThrowExceptionInInitializerError() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
        
        groupImpl.validate(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method validate(org.apache.commons.cli2.WriteableCommandLine)
    
    @Test
    public void testValidate1() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "minimum", 1);
        options.add(sourceDestArgument);
        Object object = createInstance("java.lang.Object");
        options.add(object);
        options.add(object);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.validate] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:123)
            org.apache.commons.cli2.commandline.CommandLineImpl.getValues(CommandLineImpl.java:47)
            org.apache.commons.cli2.option.SourceDestArgument.validate(SourceDestArgument.java:115)
            org.apache.commons.cli2.option.ArgumentImpl.validate(ArgumentImpl.java:232)
            org.apache.commons.cli2.option.GroupImpl.validate(GroupImpl.java:251) */
        groupImpl.validate(writeableCommandLineImpl);
    }
    
    @Test
    public void testValidate2() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "minimum", 1);
        options.add(sourceDestArgument);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", values);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.validate] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.SourceDestArgument.validate(SourceDestArgument.java:117)
            org.apache.commons.cli2.option.ArgumentImpl.validate(ArgumentImpl.java:232)
            org.apache.commons.cli2.option.GroupImpl.validate(GroupImpl.java:251) */
        groupImpl.validate(writeableCommandLineImpl);
    }
    
    @Test
    public void testValidate3() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "minimum", 1);
        options.add(argumentImpl);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        values.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.validate] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:114)
            org.apache.commons.cli2.commandline.CommandLineImpl.getValues(CommandLineImpl.java:47)
            org.apache.commons.cli2.option.ArgumentImpl.validate(ArgumentImpl.java:238)
            org.apache.commons.cli2.option.ArgumentImpl.validate(ArgumentImpl.java:232)
            org.apache.commons.cli2.option.GroupImpl.validate(GroupImpl.java:251) */
        groupImpl.validate(writeableCommandLineImpl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.defaults
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method defaults(org.apache.commons.cli2.WriteableCommandLine)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#defaults(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.invokes {@link org.apache.commons.cli2.option.OptionImpl#defaults(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testDefaults_OptionImplDefaults() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "anonymous", options);
        
        groupImpl.defaults(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method defaults(org.apache.commons.cli2.WriteableCommandLine)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#defaults(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = options.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Option option = (Option) i.next();
 *  */
    @Test
    public void testDefaults_ThrowClassCastException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        Object object = createInstance("java.lang.Object");
        options.add(object);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.defaults] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli2.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli2.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli2.option.GroupImpl.defaults(GroupImpl.java:480) */
        groupImpl.defaults(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#defaults(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Iterator i = options.iterator(); i.hasNext(); )
 *  */
    @Test
    public void testDefaults_ThrowNullPointerException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.defaults] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.defaults(GroupImpl.java:479) */
        groupImpl.defaults(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#defaults(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Iterator i = anonymous.iterator(); i.hasNext(); )
 *  */
    @Test
    public void testDefaults_ThrowNullPointerException_1() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.defaults] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.defaults(GroupImpl.java:484) */
        groupImpl.defaults(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#defaults(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = options.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Iterator i = anonymous.iterator(); i.hasNext(); )
 *  */
    @Test
    public void testDefaults_ThrowNullPointerException_3() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        ArrayList defaultValues = new ArrayList();
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "defaultValues", defaultValues);
        options.add(sourceDestArgument);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues1 = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues1);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.defaults] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:251)
            org.apache.commons.cli2.option.ArgumentImpl.defaultValues(ArgumentImpl.java:373)
            org.apache.commons.cli2.option.ArgumentImpl.defaults(ArgumentImpl.java:368)
            org.apache.commons.cli2.option.GroupImpl.defaults(GroupImpl.java:481) */
        groupImpl.defaults(writeableCommandLineImpl);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#defaults(org.apache.commons.cli2.WriteableCommandLine)}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = options.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: option.defaults(commandLine);
 *  */
    @Test
    public void testDefaults_ThrowNullPointerException_2() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.defaults] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.defaults(GroupImpl.java:481) */
        groupImpl.defaults(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.process
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#process(org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator)}
 *  */
    @Test
    public void testProcess_ArgumentsHasNext() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        groupImpl.process(null, listIterator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#process(org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(arguments.hasNext())
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.process] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.process(GroupImpl.java:162) */
        groupImpl.process(null, null);
    }
    ///endregion
    
    ///region Errors report for process
    
    public void testProcess_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.getMinimum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinimum()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#getMinimum()}
 * @utbot.returnsFrom {@code return minimum;}
 *  */
    @Test
    public void testGetMinimum_ReturnMinimum() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", -255);
        
        int actual = groupImpl.getMinimum();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.getMaximum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaximum()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#getMaximum()}
 * @utbot.returnsFrom {@code return maximum;}
 *  */
    @Test
    public void testGetMaximum_ReturnMaximum() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "maximum", -255);
        
        int actual = groupImpl.getMaximum();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.getOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptions()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#getOptions()}
 * @utbot.returnsFrom {@code return options;}
 *  */
    @Test
    public void testGetOptions_ReturnOptions() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        List actual = groupImpl.getOptions();
        
        assertNull(actual);
        
        List finalGroupImplOptions = ((List) getFieldValue(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options"));
        
        assertNull(finalGroupImplOptions);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.getAnonymous
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnonymous()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#getAnonymous()}
 * @utbot.returnsFrom {@code return anonymous;}
 *  */
    @Test
    public void testGetAnonymous_ReturnAnonymous() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList anonymous = new ArrayList();
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "anonymous", anonymous);
        
        ArrayList actual = ((ArrayList) groupImpl.getAnonymous());
        
        assertTrue(deepEquals(anonymous, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.findOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#findOption(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindOption_IHasNext() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        Option actual = groupImpl.findOption(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#findOption(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while(i.hasNext())} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindOption_FoundEqualsNull() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        options.add(argumentImpl);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        Option actual = groupImpl.findOption(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#findOption(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while(i.hasNext())} once
 *  */
    @Test
    public void testFindOption_FoundNotEqualsNull() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        options.add(propertyOption);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        PropertyOption actual = ((PropertyOption) groupImpl.findOption(null));
        
        String actualOptionString = ((String) getFieldValue(actual, "org.apache.commons.cli2.option.PropertyOption", "optionString"));
        assertNull(actualOptionString);
        
        String actualDescription = actual.getDescription();
        assertNull(actualDescription);
        
        Set actualPrefixes = actual.getPrefixes();
        assertNull(actualPrefixes);
        
        int propertyOptionId = propertyOption.getId();
        int actualId = actual.getId();
        assertEquals(propertyOptionId, actualId);
        
        boolean actualRequired = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.option.OptionImpl", "required"));
        assertFalse(actualRequired);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#findOption(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while(i.hasNext())} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Option option = (Option) i.next();
 *  */
    @Test
    public void testFindOption_ThrowClassCastException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        Object object = createInstance("java.lang.Object");
        options.add(object);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.findOption] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli2.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli2.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli2.option.GroupImpl.findOption(GroupImpl.java:453) */
        groupImpl.findOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#findOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Iterator i = getOptions().iterator();
 *  */
    @Test
    public void testFindOption_ThrowNullPointerException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.findOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.findOption(GroupImpl.java:450) */
        groupImpl.findOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#findOption(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while(i.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return found;
 *  */
    @Test
    public void testFindOption_ThrowNullPointerException_2() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        options.add(sourceDestArgument);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.findOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.findOption(GroupImpl.java:454) */
        groupImpl.findOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#findOption(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while(i.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Option found = option.findOption(trigger);
 *  */
    @Test
    public void testFindOption_ThrowNullPointerException_1() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList options = new ArrayList();
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.findOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.findOption(GroupImpl.java:454) */
        groupImpl.findOption(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.getTriggers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTriggers()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#getTriggers()}
 * @utbot.invokes {@link java.util.SortedMap#keySet()}
 * @utbot.returnsFrom {@code return optionMap.keySet();}
 *  */
    @Test
    public void testGetTriggers_SortedMapKeySet() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        TreeMap optionMap = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        setField(optionMap, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "optionMap", optionMap);
        
        Object actual = groupImpl.getTriggers();
        
        NavigableMap actualM = ((NavigableMap) getFieldValue(actual, "java.util.TreeMap$KeySet", "m"));
        assertNull(actualM);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTriggers()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#getTriggers()}
 * @utbot.invokes {@link java.util.SortedMap#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optionMap.keySet();
 *  */
    @Test
    public void testGetTriggers_ThrowNullPointerException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.getTriggers] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.getTriggers(GroupImpl.java:153) */
        groupImpl.getTriggers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.isRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRequired()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#isRequired()}
 * @utbot.returnsFrom {@code return getMinimum() > 0;}
 *  */
    @Test
    public void testIsRequired_GetMinimumLessOrEqualZero() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        boolean actual = groupImpl.isRequired();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#isRequired()}
 * @utbot.returnsFrom {@code return getMinimum() > 0;}
 *  */
    @Test
    public void testIsRequired_GetMinimumGreaterThanZero() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
        
        boolean actual = groupImpl.isRequired();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.getPreferredName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPreferredName()
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#getPreferredName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetPreferredName_ReturnName() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        String actual = groupImpl.getPreferredName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.helpLines
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method helpLines(int, java.util.Set, java.util.Comparator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.option.GroupImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#helpLines(int,java.util.Set,java.util.Comparator)}
     */
    @Test
    public void testHelpLines() {
        List list = emptyList();
        GroupImpl groupImpl = new GroupImpl(list, "-3", "#$\\\"'", 1, Integer.MAX_VALUE);
        HashSet hashSet = new HashSet();
        Object object = new Object();
        hashSet.add(object);
        Object object1 = new Object();
        hashSet.add(object1);
        Object object2 = new Object();
        hashSet.add(object2);
        Object object3 = new Object();
        hashSet.add(object3);
        Object object4 = new Object();
        hashSet.add(object4);
        
        ArrayList actual = ((ArrayList) groupImpl.helpLines(-2143289344, hashSet, null));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.option.GroupImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#helpLines(int,java.util.Set,java.util.Comparator)}
     */
    @Test
    public void testHelpLines1() {
        List list = emptyList();
        GroupImpl groupImpl = new GroupImpl(list, "-3", "#$\\\"'", 1, Integer.MAX_VALUE);
        HashSet hashSet = new HashSet();
        Object object = new Object();
        hashSet.add(object);
        Object object1 = new Object();
        hashSet.add(object1);
        Object object2 = new Object();
        hashSet.add(object2);
        Object object3 = new Object();
        hashSet.add(object3);
        Object object4 = new Object();
        hashSet.add(object4);
        
        ArrayList actual = ((ArrayList) groupImpl.helpLines(-2143289344, hashSet, null));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.appendUsage
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator, java.lang.String)
    
    @Test
    public void testAppendUsage1() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String name = "";
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "name", name);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        groupImpl.appendUsage(stringBuffer, linkedHashSet, null, null);
    }
    
    @Test
    public void testAppendUsage2() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String name = "";
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "name", name);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        groupImpl.appendUsage(stringBuffer, linkedHashSet, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator, java.lang.String)
    
    @Test
    public void testAppendUsage3() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:357) */
        groupImpl.appendUsage(stringBuffer, linkedHashSet, null, null);
    }
    
    @Test
    public void testAppendUsage4() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:357) */
        groupImpl.appendUsage(stringBuffer, linkedHashSet, null, null);
    }
    
    @Test
    public void testAppendUsage5() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:357) */
        groupImpl.appendUsage(stringBuffer, linkedHashSet, null, null);
    }
    
    @Test
    public void testAppendUsage6() throws Throwable  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 1;
        linkedHashSet.add(integer);
        Integer integer1 = 0;
        linkedHashSet.add(integer1);
        linkedHashSet.add(integer1);
        Object naturalOrder = createInstance("java.util.Arrays$NaturalOrder");
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:352) */
        Class groupImplClazz = Class.forName("org.apache.commons.cli2.option.GroupImpl");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class naturalOrderType = Class.forName("java.util.Comparator");
        Class stringType = Class.forName("java.lang.String");
        Method appendUsageMethod = groupImplClazz.getDeclaredMethod("appendUsage", stringBufferType, linkedHashSetType, naturalOrderType, stringType);
        appendUsageMethod.setAccessible(true);
        java.lang.Object[] appendUsageMethodArguments = new java.lang.Object[4];
        appendUsageMethodArguments[0] = stringBuffer;
        appendUsageMethodArguments[1] = linkedHashSet;
        appendUsageMethodArguments[2] = naturalOrder;
        appendUsageMethodArguments[3] = string;
        try {
            appendUsageMethod.invoke(groupImpl, appendUsageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendUsage7() throws Exception  {
        Class displaySettingClazz = Class.forName("org.apache.commons.cli2.DisplaySetting");
        Set prevAll = ((Set) getStaticFieldValue(displaySettingClazz, "all"));
        try {
            LinkedHashSet all = new LinkedHashSet();
            setStaticField(displaySettingClazz, "all", all);
            GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
            String name = "";
            setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "name", name);
            setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Character character = '\u0000';
            linkedHashSet.add(character);
            
            /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
                org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:327) */
            groupImpl.appendUsage(null, linkedHashSet, null, null);
        } finally {
            setStaticField(org.apache.commons.cli2.DisplaySetting.class, "all", prevAll);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.appendUsage
    
    ///region FUZZER: ERROR SUITE for method appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.option.GroupImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#appendUsage(java.lang.StringBuffer,java.util.Set,java.util.Comparator)}
     */
    @Test
    public void testAppendUsageThrowsNPE() {
        List list = emptyList();
        GroupImpl groupImpl = new GroupImpl(list, "#$\\\"'", "10", 2147483645, 1);
        StringBuffer stringBuffer = new StringBuffer("-3");
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            java.base/java.util.HashSet.<init>(HashSet.java:120)
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:302)
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:295) */
        groupImpl.appendUsage(stringBuffer, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)
    
    @Test
    public void testAppendUsage8() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String name = "";
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "name", name);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        
        groupImpl.appendUsage(stringBuffer, linkedHashSet, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)
    
    @Test
    public void testAppendUsage9() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:357)
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:295) */
        groupImpl.appendUsage(stringBuffer, linkedHashSet, null);
    }
    
    @Test
    public void testAppendUsage10() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String name = "";
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "name", name);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:327)
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:295) */
        groupImpl.appendUsage(null, linkedHashSet, null);
    }
    
    @Test
    public void testAppendUsage11() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:357)
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:295) */
        groupImpl.appendUsage(stringBuffer, linkedHashSet, null);
    }
    
    @Test
    public void testAppendUsage12() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String name = "";
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "name", name);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:327)
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:295) */
        groupImpl.appendUsage(null, linkedHashSet, null);
    }
    
    @Test
    public void testAppendUsage13() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "minimum", 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.appendUsage] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:357)
            org.apache.commons.cli2.option.GroupImpl.appendUsage(GroupImpl.java:295) */
        groupImpl.appendUsage(null, linkedHashSet, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.GroupImpl.canProcess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.lang.String)}
 * @utbot.executesCondition {@code (arg == null): True}
 *  */
    @Test
    public void testCanProcess_ArgEqualsNull() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        boolean actual = groupImpl.canProcess(((WriteableCommandLine) null), ((String) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.lang.String)}
 * @utbot.invokes {@link java.util.SortedMap#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: optionMap.containsKey(arg)
 *  */
    @Test
    public void testCanProcess_ThrowClassCastException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        TreeMap optionMap = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(optionMap, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        int[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(optionMap, "java.util.TreeMap", "root", root);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "optionMap", optionMap);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.canProcess] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class sun.security.x509.AVA (java.lang.String and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
            java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.containsKey(TreeMap.java:233)
            org.apache.commons.cli2.option.GroupImpl.canProcess(GroupImpl.java:120) */
        groupImpl.canProcess(((WriteableCommandLine) null), string);
    }
    
    /**
    @utbot.classUnderTest {@link GroupImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.lang.String)}
 * @utbot.invokes {@link java.util.SortedMap#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: optionMap.containsKey(arg)
 *  */
    @Test
    public void testCanProcess_ThrowNullPointerException() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.canProcess] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.canProcess(GroupImpl.java:120) */
        groupImpl.canProcess(((WriteableCommandLine) null), string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.option.GroupImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.GroupImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.lang.String)}
     */
    @Test
    public void testCanProcessReturnsFalseWithNonEmptyString() {
        List list = emptyList();
        GroupImpl groupImpl = new GroupImpl(list, "", "#$\\\"'", Integer.MIN_VALUE, Integer.MAX_VALUE);
        List list1 = emptyList();
        GroupImpl groupImpl1 = new GroupImpl(list1, "\n\t\r", "\n\t\r", Integer.MAX_VALUE, Integer.MIN_VALUE);
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        linkedList.add(object);
        Object object1 = new Object();
        linkedList.add(object1);
        WriteableCommandLineImpl writeableCommandLineImpl = new WriteableCommandLineImpl(groupImpl1, linkedList);
        
        boolean actual = groupImpl.canProcess(((WriteableCommandLine) writeableCommandLineImpl), "XZ");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)
    
    @Test
    public void testCanProcess1() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        Object optionMap = createInstance("java.util.Collections$UnmodifiableNavigableMap");
        LinkedHashMap m = new LinkedHashMap();
        setField(optionMap, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "optionMap", optionMap);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.canProcess] produces [java.lang.NullPointerException]
            java.base/java.util.Collections$UnmodifiableSortedMap.tailMap(Collections.java:1860)
            org.apache.commons.cli2.option.GroupImpl.canProcess(GroupImpl.java:125) */
        groupImpl.canProcess(((WriteableCommandLine) null), string);
    }
    
    @Test
    public void testCanProcess2() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        Object optionMap = createInstance("java.util.Collections$UnmodifiableNavigableMap");
        ConcurrentSkipListMap sm = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        setField(optionMap, "java.util.Collections$UnmodifiableSortedMap", "sm", sm);
        LinkedHashMap m = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        m.put(integer, object);
        Character character = '\u0000';
        m.put(character, object);
        setField(optionMap, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "optionMap", optionMap);
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.option.GroupImpl.canProcess] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(WriteableCommandLineImpl.java:206)
            org.apache.commons.cli2.option.GroupImpl.canProcess(GroupImpl.java:136) */
        groupImpl.canProcess(((WriteableCommandLine) writeableCommandLineImpl), string);
    }
    ///endregion
    
    ///region Errors report for canProcess
    
    public void testCanProcess_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Failed requirement.
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields849905762201600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields849905762201600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass849905762209400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields849905762201600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass849905762209400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields849905765673000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields849905765673000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass849905765677600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields849905765673000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass849905765677600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields849905765991700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields849905765991700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass849905765993500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields849905765991700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass849905765993500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields849905766555200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields849905766555200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass849905766557900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields849905766555200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass849905766557900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

