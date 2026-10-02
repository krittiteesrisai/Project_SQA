package org.apache.commons.cli2.option;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.LinkedHashSet;
import org.junit.Ignore;
import java.util.ArrayList;
import java.util.ListIterator;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.Option;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_cli2_option_OptionImplTest {
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#equals(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_RightEqualsNull_1() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        int[] intArray = {};
        
        Class optionImplClazz = Class.forName("org.apache.commons.cli2.option.OptionImpl");
        Class intArrayType = Class.forName("java.lang.Object");
        Method equalsMethod = optionImplClazz.getDeclaredMethod("equals", intArrayType, intArrayType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[2];
        equalsMethodArguments[0] = ((Object) intArray);
        equalsMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalsMethod.invoke(sourceDestArgument, equalsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#equals(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (left == null): True}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (left == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_LeftEqualsNull() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        byte[] byteArray = {};
        
        Class optionImplClazz = Class.forName("org.apache.commons.cli2.option.OptionImpl");
        Class objectType = Class.forName("java.lang.Object");
        Method equalsMethod = optionImplClazz.getDeclaredMethod("equals", objectType, objectType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[2];
        equalsMethodArguments[0] = ((Object) null);
        equalsMethodArguments[1] = ((Object) byteArray);
        boolean actual = ((Boolean) equalsMethod.invoke(command, equalsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#equals(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return left.equals(right);}
 *  */
    @Test
    public void testEquals_RightNotEqualsNull() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        Integer integer = 0;
        byte[] byteArray = {};
        
        Class optionImplClazz = Class.forName("org.apache.commons.cli2.option.OptionImpl");
        Class integerType = Class.forName("java.lang.Object");
        Method equalsMethod = optionImplClazz.getDeclaredMethod("equals", integerType, integerType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[2];
        equalsMethodArguments[0] = integer;
        equalsMethodArguments[1] = ((Object) byteArray);
        boolean actual = ((Boolean) equalsMethod.invoke(command, equalsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#equals(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (left == null): True}
 * @utbot.executesCondition {@code (right == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_RightEqualsNull() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class optionImplClazz = Class.forName("org.apache.commons.cli2.option.OptionImpl");
        Class objectType = Class.forName("java.lang.Object");
        Method equalsMethod = optionImplClazz.getDeclaredMethod("equals", objectType, objectType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[2];
        equalsMethodArguments[0] = ((Object) null);
        equalsMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalsMethod.invoke(sourceDestArgument, equalsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (thatObj instanceof OptionImpl): True}
 * @utbot.returnsFrom {@code return (getId() == that.getId()) && equals(getPreferredName(), that.getPreferredName()) && equals(getDescription(), that.getDescription()) && equals(getPrefixes(), that.getPrefixes()) && equals(getTriggers(), that.getTriggers());}
 *  */
    @Test
    public void testEquals_ThatObjInstanceOfOptionImpl() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        setField(sourceDestArgument, "org.apache.commons.cli2.option.OptionImpl", "id", 1);
        Switch switch1 = ((Switch) createInstance("org.apache.commons.cli2.option.Switch"));
        
        boolean actual = sourceDestArgument.equals(switch1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (thatObj instanceof OptionImpl): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotThatObjNotInstanceOfOptionImpl() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        boolean actual = sourceDestArgument.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (thatObj instanceof OptionImpl): True}
 * @utbot.invokes {@link org.apache.commons.cli2.option.OptionImpl#getPreferredName()}
 * @utbot.invokes {@link org.apache.commons.cli2.option.OptionImpl#getPreferredName()}
 * @utbot.invokes org.apache.commons.cli2.option.OptionImpl#equals(java.lang.Object,java.lang.Object)
 * @utbot.invokes {@link org.apache.commons.cli2.option.OptionImpl#getDescription()}
 * @utbot.invokes {@link org.apache.commons.cli2.option.OptionImpl#getDescription()}
 * @utbot.invokes org.apache.commons.cli2.option.OptionImpl#equals(java.lang.Object,java.lang.Object)
 * @utbot.returnsFrom {@code return (getId() == that.getId()) && equals(getPreferredName(), that.getPreferredName()) && equals(getDescription(), that.getDescription()) && equals(getPrefixes(), that.getPrefixes()) && equals(getTriggers(), that.getTriggers());}
 *  */
    @Test
    public void testEquals_OptionImplEquals() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(argumentImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        String description = "";
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "description", description);
        setField(sourceDestArgument, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        boolean actual = argumentImpl.equals(sourceDestArgument);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(argumentImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        boolean actual = groupImpl.equals(argumentImpl);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        Switch switch1 = ((Switch) createInstance("org.apache.commons.cli2.option.Switch"));
        setField(switch1, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(argumentImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        boolean actual = switch1.equals(argumentImpl);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(argumentImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        Switch switch1 = ((Switch) createInstance("org.apache.commons.cli2.option.Switch"));
        setField(switch1, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        boolean actual = argumentImpl.equals(switch1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals4() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(argumentImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        boolean actual = argumentImpl.equals(groupImpl);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals5() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        String preferredName = "\u0000\u0000\u0000\u0000\u0000";
        setField(command, "org.apache.commons.cli2.option.Command", "preferredName", preferredName);
        Command command1 = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        String preferredName1 = "\u0000\u0000\u0000\u0000\u0000";
        setField(command1, "org.apache.commons.cli2.option.Command", "preferredName", preferredName1);
        
        boolean actual = command.equals(command1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals6() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String name = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        String preferredName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(command, "org.apache.commons.cli2.option.Command", "preferredName", preferredName);
        
        boolean actual = argumentImpl.equals(command);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals7() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String name = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        setField(defaultOption, "org.apache.commons.cli2.option.DefaultOption", "preferredName", name);
        
        boolean actual = argumentImpl.equals(defaultOption);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals8() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String name = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        String description = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "description", description);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "description", name);
        
        boolean actual = argumentImpl.equals(sourceDestArgument);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.toString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.option.OptionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#toString()}
     */
    @Test
    public void testToString() {
        PropertyOption propertyOption = new PropertyOption("3", "#$\\\"'", 0);
        
        String actual = propertyOption.toString();
        
        String expected = "3<property>=<value>";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.option.OptionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#toString()}
     */
    @Test
    public void testToString1() {
        PropertyOption propertyOption = new PropertyOption("3", "#$\\\"'", Integer.MIN_VALUE);
        
        String actual = propertyOption.toString();
        
        String expected = "3<property>=<value>";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString2() throws Exception  {
        Class displaySettingClazz = Class.forName("org.apache.commons.cli2.DisplaySetting");
        Set prevAll = ((Set) getStaticFieldValue(displaySettingClazz, "all"));
        try {
            LinkedHashSet all = new LinkedHashSet();
            setStaticField(displaySettingClazz, "all", all);
            SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
            
            /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.toString] produces [java.lang.NullPointerException]
                org.apache.commons.cli2.option.SourceDestArgument.appendUsage(SourceDestArgument.java:93)
                org.apache.commons.cli2.option.OptionImpl.toString(OptionImpl.java:62) */
            sourceDestArgument.toString();
        } finally {
            setStaticField(org.apache.commons.cli2.DisplaySetting.class, "all", prevAll);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.hashCode
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.option.OptionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#hashCode()}
     */
    @Test
    public void testHashCode() {
        PropertyOption propertyOption = new PropertyOption("3", "#$\\\"'", 1);
        
        int actual = propertyOption.hashCode();
        
        assertEquals(-1398920150, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        String name = "";
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "description", name);
        setField(sourceDestArgument, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        int actual = sourceDestArgument.hashCode();
        
        assertEquals(-477911055, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String name = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        setField(argumentImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        int actual = argumentImpl.hashCode();
        
        assertEquals(-12916515, actual);
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String description = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "description", description);
        setField(argumentImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        int actual = argumentImpl.hashCode();
        
        assertEquals(-12916515, actual);
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(argumentImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        int actual = argumentImpl.hashCode();
        
        assertEquals(-349095, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test
    public void testHashCode5() throws Exception  {
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:106) */
        groupImpl.hashCode();
    }
    
    @Test
    public void testHashCode6() throws Exception  {
        Switch switch1 = ((Switch) createInstance("org.apache.commons.cli2.option.Switch"));
        setField(switch1, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:106) */
        switch1.hashCode();
    }
    
    @Test
    public void testHashCode7() throws Exception  {
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        setField(defaultOption, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:106) */
        defaultOption.hashCode();
    }
    
    @Test
    public void testHashCode8() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        String preferredName = "";
        setField(command, "org.apache.commons.cli2.option.Command", "preferredName", preferredName);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107) */
        command.hashCode();
    }
    
    @Test
    public void testHashCode9() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107) */
        command.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.getId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getId()
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#getId()}
 * @utbot.returnsFrom {@code return id;}
 *  */
    @Test
    public void testGetId_ReturnId() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        setField(command, "org.apache.commons.cli2.option.OptionImpl", "id", -255);
        
        int actual = command.getId();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.defaults
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method defaults(org.apache.commons.cli2.WriteableCommandLine)
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#defaults(org.apache.commons.cli2.WriteableCommandLine)}
 *  */
    @Test
    public void testDefaults() throws Exception  {
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        
        defaultOption.defaults(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method defaults(org.apache.commons.cli2.WriteableCommandLine)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.option.OptionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#defaults(org.apache.commons.cli2.WriteableCommandLine)}
     */
    @Test
    public void testDefaults1() {
        PropertyOption propertyOption = new PropertyOption("XZ", "abc", 0);
        
        propertyOption.defaults(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.checkPrefix
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPrefix(java.util.Set, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#checkPrefix(java.util.Set,java.lang.String)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Iterator i = prefixes.iterator(); i.hasNext(); )
 *  */
    @Test
    public void testCheckPrefix_ThrowNullPointerException() throws Throwable  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefix] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.checkPrefix(OptionImpl.java:149) */
        Class optionImplClazz = Class.forName("org.apache.commons.cli2.option.OptionImpl");
        Class setType = Class.forName("java.util.Set");
        Class stringType = Class.forName("java.lang.String");
        Method checkPrefixMethod = optionImplClazz.getDeclaredMethod("checkPrefix", setType, stringType);
        checkPrefixMethod.setAccessible(true);
        java.lang.Object[] checkPrefixMethodArguments = new java.lang.Object[2];
        checkPrefixMethodArguments[0] = ((Object) null);
        checkPrefixMethodArguments[1] = ((Object) null);
        try {
            checkPrefixMethod.invoke(command, checkPrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkPrefix(java.util.Set, java.lang.String)
    
    @Test
    public void testCheckPrefix1() throws Throwable  {
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefix] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.option.OptionImpl.checkPrefix(OptionImpl.java:150) */
        Class optionImplClazz = Class.forName("org.apache.commons.cli2.option.OptionImpl");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class stringType = Class.forName("java.lang.String");
        Method checkPrefixMethod = optionImplClazz.getDeclaredMethod("checkPrefix", linkedHashSetType, stringType);
        checkPrefixMethod.setAccessible(true);
        java.lang.Object[] checkPrefixMethodArguments = new java.lang.Object[2];
        checkPrefixMethodArguments[0] = linkedHashSet;
        checkPrefixMethodArguments[1] = ((Object) null);
        try {
            checkPrefixMethod.invoke(defaultOption, checkPrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCheckPrefix2() throws Throwable  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefix] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.checkPrefix(OptionImpl.java:152) */
        Class optionImplClazz = Class.forName("org.apache.commons.cli2.option.OptionImpl");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class stringType = Class.forName("java.lang.String");
        Method checkPrefixMethod = optionImplClazz.getDeclaredMethod("checkPrefix", linkedHashSetType, stringType);
        checkPrefixMethod.setAccessible(true);
        java.lang.Object[] checkPrefixMethodArguments = new java.lang.Object[2];
        checkPrefixMethodArguments[0] = linkedHashSet;
        checkPrefixMethodArguments[1] = ((Object) null);
        try {
            checkPrefixMethod.invoke(argumentImpl, checkPrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SECURITY for method checkPrefix(java.util.Set, java.lang.String)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testCheckPrefix3() throws Exception  {
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefix] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "org.apache.commons.cli2.resource.bundle" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.cli2.resource.ResourceHelper.getResourceHelper(ResourceHelper.java:85)
            org.apache.commons.cli2.option.OptionImpl.checkPrefix(OptionImpl.java:157) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.canProcess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canProcess(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator)}
 * @utbot.returnsFrom {@code return canProcess(commandLine, argument);}
 *  */
    @Test
    public void testCanProcess_ReturnCanProcess_3() throws Exception  {
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        LinkedHashSet triggers = new LinkedHashSet();
        setField(defaultOption, "org.apache.commons.cli2.option.DefaultOption", "triggers", triggers);
        setField(defaultOption, "org.apache.commons.cli2.option.DefaultOption", "burstLength", 1);
        SourceDestArgument argument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        setField(argument, "org.apache.commons.cli2.option.ArgumentImpl", "initialSeparator", '\u0000');
        setField(defaultOption, "org.apache.commons.cli2.option.ParentImpl", "argument", argument);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        boolean actual = defaultOption.canProcess(((WriteableCommandLine) null), listIterator);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator)}
 * @utbot.returnsFrom {@code return canProcess(commandLine, argument);}
 *  */
    @Test
    public void testCanProcess_ReturnCanProcess() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        boolean actual = argumentImpl.canProcess(((WriteableCommandLine) null), listIterator);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator)}
 * @utbot.returnsFrom {@code return canProcess(commandLine, argument);}
 *  */
    @Test
    public void testCanProcess_ReturnCanProcess_1() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        ArgumentImpl source = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(sourceDestArgument, "org.apache.commons.cli2.option.SourceDestArgument", "source", source);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        boolean actual = sourceDestArgument.canProcess(((WriteableCommandLine) null), listIterator);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator)}
 * @utbot.returnsFrom {@code return canProcess(commandLine, argument);}
 *  */
    @Test
    public void testCanProcess_ReturnCanProcess_2() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        SourceDestArgument source = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        ArgumentImpl source1 = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(source, "org.apache.commons.cli2.option.SourceDestArgument", "source", source1);
        setField(sourceDestArgument, "org.apache.commons.cli2.option.SourceDestArgument", "source", source);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        boolean actual = sourceDestArgument.canProcess(((WriteableCommandLine) null), listIterator);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canProcess(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator)}
 * @utbot.invokes {@link java.util.ListIterator#hasNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: arguments.hasNext()
 *  */
    @Test
    public void testCanProcess_ThrowNullPointerException() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.canProcess] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.canProcess(OptionImpl.java:50) */
        command.canProcess(((WriteableCommandLine) null), ((ListIterator) null));
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator)}
 * @utbot.executesCondition {@code (arguments.hasNext()): False}
 * @utbot.returnsFrom {@code return false;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testCanProcess_ThrowNullPointerException_1() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.canProcess] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.SourceDestArgument.canProcess(SourceDestArgument.java:136)
            org.apache.commons.cli2.option.OptionImpl.canProcess(OptionImpl.java:54) */
        sourceDestArgument.canProcess(((WriteableCommandLine) null), listIterator);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#canProcess(org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator)}
 * @utbot.executesCondition {@code (arguments.hasNext()): True}
 * @utbot.invokes {@link java.util.ListIterator#next()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String argument = (String) arguments.next();
 *  */
    @Test
    public void testCanProcess_ThrowNullPointerException_2() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.canProcess] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.ParentImpl.canProcess(ParentImpl.java:103)
            org.apache.commons.cli2.option.OptionImpl.canProcess(OptionImpl.java:54) */
        command.canProcess(((WriteableCommandLine) null), listIterator);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method canProcess(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)
    
    @Test
    public void testCanProcess1() throws Exception  {
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        LinkedHashSet triggers = new LinkedHashSet();
        setField(defaultOption, "org.apache.commons.cli2.option.DefaultOption", "triggers", triggers);
        ArgumentImpl argument = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        setField(argument, "org.apache.commons.cli2.option.ArgumentImpl", "initialSeparator", '\u0001');
        setField(defaultOption, "org.apache.commons.cli2.option.ParentImpl", "argument", argument);
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(writeableCommandLineImpl);
        arrayList.add(writeableCommandLineImpl);
        arrayList.add(writeableCommandLineImpl);
        ListIterator listIterator = arrayList.listIterator();
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.canProcess] produces [java.lang.ClassCastException: class org.apache.commons.cli2.commandline.WriteableCommandLineImpl cannot be cast to class java.lang.String (org.apache.commons.cli2.commandline.WriteableCommandLineImpl is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7fa7457f; java.lang.String is in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.option.OptionImpl.canProcess(OptionImpl.java:51) */
        defaultOption.canProcess(((WriteableCommandLine) writeableCommandLineImpl), listIterator);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.isRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRequired()
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#isRequired()}
 * @utbot.returnsFrom {@code return required;}
 *  */
    @Test
    public void testIsRequired_ReturnRequired() throws Exception  {
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        
        boolean actual = defaultOption.isRequired();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.findOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#findOption(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindOption_ReturnNull_1() throws Exception  {
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        
        Option actual = argumentImpl.findOption(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#findOption(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindOption_ReturnNull() throws Exception  {
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        String optionString = "";
        setField(propertyOption, "org.apache.commons.cli2.option.PropertyOption", "optionString", optionString);
        
        Option actual = propertyOption.findOption(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#findOption(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testFindOption_Return() throws Exception  {
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        String optionString = "";
        setField(propertyOption, "org.apache.commons.cli2.option.PropertyOption", "optionString", optionString);
        
        PropertyOption actual = ((PropertyOption) propertyOption.findOption(optionString));
        
        String propertyOptionOptionString = ((String) getFieldValue(propertyOption, "org.apache.commons.cli2.option.PropertyOption", "optionString"));
        String actualOptionString = ((String) getFieldValue(actual, "org.apache.commons.cli2.option.PropertyOption", "optionString"));
        assertEquals(propertyOptionOptionString, actualOptionString);
        
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
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#findOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: getTriggers().contains(trigger)
 *  */
    @Test
    public void testFindOption_ThrowNullPointerException() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.findOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.findOption(OptionImpl.java:113) */
        command.findOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#findOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: getTriggers().contains(trigger)
 *  */
    @Test
    public void testFindOption_ThrowNullPointerException_1() throws Exception  {
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.findOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.findOption(OptionImpl.java:113) */
        defaultOption.findOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#findOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: getTriggers().contains(trigger)
 *  */
    @Test
    public void testFindOption_ThrowNullPointerException_2() throws Exception  {
        Switch switch1 = ((Switch) createInstance("org.apache.commons.cli2.option.Switch"));
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.findOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.findOption(OptionImpl.java:113) */
        switch1.findOption(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.option.OptionImpl.checkPrefixes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkPrefixes(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#checkPrefixes(java.util.Set)}
 * @utbot.invokes {@link java.util.Set#isEmpty()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckPrefixes_SetIsEmpty() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        command.checkPrefixes(linkedHashSet);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPrefixes(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#checkPrefixes(java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: checkPrefix(prefixes, getPreferredName());
 *  */
    @Test
    public void testCheckPrefixes_ThrowClassCastException() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        String preferredName = "";
        setField(command, "org.apache.commons.cli2.option.Command", "preferredName", preferredName);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefixes] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.option.OptionImpl.checkPrefix(OptionImpl.java:150)
            org.apache.commons.cli2.option.OptionImpl.checkPrefixes(OptionImpl.java:137) */
        command.checkPrefixes(linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#checkPrefixes(java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: checkPrefix(prefixes, getPreferredName());
 *  */
    @Test
    public void testCheckPrefixes_ThrowClassCastException_1() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        String name = "";
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        linkedHashSet.add(null);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefixes] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class java.lang.String (java.lang.Character and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.option.OptionImpl.checkPrefix(OptionImpl.java:150)
            org.apache.commons.cli2.option.OptionImpl.checkPrefixes(OptionImpl.java:137) */
        sourceDestArgument.checkPrefixes(linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#checkPrefixes(java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prefixes.isEmpty()
 *  */
    @Test
    public void testCheckPrefixes_ThrowNullPointerException() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefixes] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.checkPrefixes(OptionImpl.java:132) */
        command.checkPrefixes(null);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#checkPrefixes(java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkPrefix(prefixes, getPreferredName());
 *  */
    @Test
    public void testCheckPrefixes_ThrowNullPointerException_1() throws Exception  {
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefixes] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.checkPrefix(OptionImpl.java:152)
            org.apache.commons.cli2.option.OptionImpl.checkPrefixes(OptionImpl.java:137) */
        command.checkPrefixes(linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#checkPrefixes(java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkPrefix(prefixes, getPreferredName());
 *  */
    @Test
    public void testCheckPrefixes_ThrowNullPointerException_2() throws Exception  {
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefixes] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.checkPrefix(OptionImpl.java:152)
            org.apache.commons.cli2.option.OptionImpl.checkPrefixes(OptionImpl.java:137) */
        sourceDestArgument.checkPrefixes(linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link OptionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.option.OptionImpl#checkPrefixes(java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkPrefix(prefixes, getPreferredName());
 *  */
    @Test
    public void testCheckPrefixes_ThrowNullPointerException_3() throws Exception  {
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        Integer integer = 0;
        linkedHashSet.add(integer);
        Character character = '\u0000';
        linkedHashSet.add(character);
        
        /* This test fails because method [org.apache.commons.cli2.option.OptionImpl.checkPrefixes] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.checkPrefix(OptionImpl.java:152)
            org.apache.commons.cli2.option.OptionImpl.checkPrefixes(OptionImpl.java:137) */
        defaultOption.checkPrefixes(linkedHashSet);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields850534464703600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields850534464703600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass850534464708300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields850534464703600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass850534464708300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields850534465113600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields850534465113600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass850534465114800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields850534465113600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass850534465114800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields850534465908900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields850534465908900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass850534465910200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields850534465908900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass850534465910200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields850534466630100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields850534466630100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass850534466631400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields850534466630100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass850534466631400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

