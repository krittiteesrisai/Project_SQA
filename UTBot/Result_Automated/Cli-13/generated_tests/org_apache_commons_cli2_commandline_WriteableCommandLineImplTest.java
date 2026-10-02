package org.apache.commons.cli2.commandline;

import org.junit.Test;
import java.util.Properties;
import java.util.HashMap;
import sun.security.provider.Sun;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.cli2.option.GroupImpl;
import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashSet;
import org.apache.commons.cli2.option.SourceDestArgument;
import java.lang.reflect.Method;
import org.apache.commons.cli2.option.Command;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.Option;
import java.util.LinkedHashMap;
import java.security.Provider;
import org.junit.Ignore;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.option.Switch;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_cli2_commandline_WriteableCommandLineImplTest {
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperty(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return properties.getProperty(property, defaultValue);}
 *  */
    @Test
    public void testGetProperty_ReturnPropertiesGetProperty() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        String actual = writeableCommandLineImpl.getProperty(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return properties.getProperty(property, defaultValue);}
 *  */
    @Test
    public void testGetProperty_ReturnPropertiesGetProperty_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Sun properties = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(properties, "java.security.Provider", "initialized", true);
        HashMap map = new HashMap();
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        String string = "";
        
        String actual = writeableCommandLineImpl.getProperty(string, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return properties.getProperty(property, defaultValue);}
 *  */
    @Test
    public void testGetProperty_ReturnPropertiesGetProperty_2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        Properties defaults = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        setField(defaults, "java.util.Properties", "map", map);
        setField(properties, "java.util.Properties", "defaults", defaults);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        String actual = writeableCommandLineImpl.getProperty(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return properties.getProperty(property, defaultValue);}
 *  */
    @Test
    public void testGetProperty_ReturnPropertiesGetProperty_3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        String actual = writeableCommandLineImpl.getProperty(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return properties.getProperty(property, defaultValue);}
 *  */
    @Test
    public void testGetProperty_ReturnPropertiesGetProperty_4() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        map.put(character, object);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        String actual = writeableCommandLineImpl.getProperty(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return properties.getProperty(property, defaultValue);}
 *  */
    @Test
    public void testGetProperty_ReturnPropertiesGetProperty_5() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        String string = " ";
        
        String actual = writeableCommandLineImpl.getProperty(string, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return properties.getProperty(property, defaultValue);}
 *  */
    @Test
    public void testGetProperty_ReturnPropertiesGetProperty_6() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        String string = "";
        map.put(null, string);
        Integer integer = 0;
        map.put(integer, string);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        String actual = writeableCommandLineImpl.getProperty(null, null);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return properties.getProperty(property, defaultValue);}
 *  */
    @Test
    public void testGetProperty_ReturnPropertiesGetProperty_7() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Integer integer = 0;
        String string = "";
        map.put(integer, string);
        map.put(null, string);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        String actual = writeableCommandLineImpl.getProperty(null, null);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperty(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.util.Properties#getProperty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return properties.getProperty(property, defaultValue);
 *  */
    @Test
    public void testGetProperty_ThrowIllegalStateException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Sun properties = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty] produces [java.lang.IllegalStateException]
            java.base/java.security.Provider.checkInitialized(Provider.java:809)
            java.base/java.security.Provider.getProperty(Provider.java:803)
            java.base/java.util.Properties.getProperty(Properties.java:1122)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(WriteableCommandLineImpl.java:161) */
        writeableCommandLineImpl.getProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return properties.getProperty(property, defaultValue);
 *  */
    @Test
    public void testGetProperty_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(WriteableCommandLineImpl.java:161) */
        writeableCommandLineImpl.getProperty(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getProperty(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.util.Properties#getProperty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return properties.getProperty(property, defaultValue);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetProperty_ThrowIllegalStateException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        Sun defaults = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(properties, "java.util.Properties", "defaults", defaults);
        HashMap map = new HashMap();
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        writeableCommandLineImpl.getProperty(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#toString()}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testToString_ReturnBufferToString() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList normalised = new ArrayList();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "normalised", normalised);
        
        String actual = writeableCommandLineImpl.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#toString()}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = normalised.iterator(); i.hasNext(); )} once
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testToString_ArgIndexOfLessThanZero() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList normalised = new ArrayList();
        String string = "\u0000";
        normalised.add(string);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "normalised", normalised);
        
        String actual = writeableCommandLineImpl.toString();
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#toString()}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = normalised.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final String arg = (String) i.next();
 *  */
    @Test
    public void testToString_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList normalised = new ArrayList();
        Object object = createInstance("java.lang.Object");
        normalised.add(object);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "normalised", normalised);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString(WriteableCommandLineImpl.java:185) */
        writeableCommandLineImpl.toString();
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#toString()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Iterator i = normalised.iterator(); i.hasNext(); )
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString(WriteableCommandLineImpl.java:184) */
        writeableCommandLineImpl.toString();
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#toString()}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = normalised.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: arg.indexOf(' ') >= 0
 *  */
    @Test
    public void testToString_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList normalised = new ArrayList();
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "normalised", normalised);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString(WriteableCommandLineImpl.java:187) */
        writeableCommandLineImpl.toString();
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#toString()}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = normalised.iterator(); i.hasNext(); )} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} when: arg.indexOf(' ') >= 0
 *  */
    @Test
    public void testToString_ThrowNullPointerException_2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList normalised = new ArrayList();
        String string = "";
        normalised.add(string);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        normalised.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "normalised", normalised);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString(WriteableCommandLineImpl.java:187) */
        writeableCommandLineImpl.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperties()
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperties()}
 * @utbot.invokes {@link java.util.Properties#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableSet(properties.keySet());
 *  */
    @Test
    public void testGetProperties_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(WriteableCommandLineImpl.java:165) */
        writeableCommandLineImpl.getProperties();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getProperties()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperties()}
     */
    @Test
    public void testGetProperties() {
        List list = emptyList();
        GroupImpl groupImpl = new GroupImpl(list, "-3", "abc", Integer.MIN_VALUE, Integer.MAX_VALUE);
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        linkedList.add(object);
        Object object1 = new Object();
        linkedList.add(object1);
        Object object2 = new Object();
        linkedList.add(object2);
        Object object3 = new Object();
        linkedList.add(object3);
        Object object4 = new Object();
        linkedList.add(object4);
        WriteableCommandLineImpl writeableCommandLineImpl = new WriteableCommandLineImpl(groupImpl, linkedList);
        
        Set actual = writeableCommandLineImpl.getProperties();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getProperties()
    
    @Test
    public void testGetProperties1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties] produces [java.lang.NullPointerException]
            java.base/java.util.Properties.keySet(Properties.java:1326)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(WriteableCommandLineImpl.java:165) */
        writeableCommandLineImpl.getProperties();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOption(org.apache.commons.cli2.Option)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#hasOption(org.apache.commons.cli2.Option)}
 * @utbot.returnsFrom {@code return present;}
 *  */
    @Test
    public void testHasOption_ReturnPresent() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Method hasOptionMethod = writeableCommandLineImplClazz.getDeclaredMethod("hasOption", sourceDestArgumentType);
        hasOptionMethod.setAccessible(true);
        java.lang.Object[] hasOptionMethodArguments = new java.lang.Object[1];
        hasOptionMethodArguments[0] = sourceDestArgument;
        boolean actual = ((Boolean) hasOptionMethod.invoke(writeableCommandLineImpl, hasOptionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#hasOption(org.apache.commons.cli2.Option)}
 * @utbot.returnsFrom {@code return present;}
 *  */
    @Test
    public void testHasOption_ReturnPresent_2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        options.add(sourceDestArgument);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        SourceDestArgument sourceDestArgument1 = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        setField(sourceDestArgument1, "org.apache.commons.cli2.option.OptionImpl", "id", -1);
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgument1Type = Class.forName("org.apache.commons.cli2.Option");
        Method hasOptionMethod = writeableCommandLineImplClazz.getDeclaredMethod("hasOption", sourceDestArgument1Type);
        hasOptionMethod.setAccessible(true);
        java.lang.Object[] hasOptionMethodArguments = new java.lang.Object[1];
        hasOptionMethodArguments[0] = sourceDestArgument1;
        boolean actual = ((Boolean) hasOptionMethod.invoke(writeableCommandLineImpl, hasOptionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#hasOption(org.apache.commons.cli2.Option)}
 * @utbot.returnsFrom {@code return present;}
 *  */
    @Test
    public void testHasOption_ReturnPresent_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Method hasOptionMethod = writeableCommandLineImplClazz.getDeclaredMethod("hasOption", sourceDestArgumentType);
        hasOptionMethod.setAccessible(true);
        java.lang.Object[] hasOptionMethodArguments = new java.lang.Object[1];
        hasOptionMethodArguments[0] = sourceDestArgument;
        boolean actual = ((Boolean) hasOptionMethod.invoke(writeableCommandLineImpl, hasOptionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#hasOption(org.apache.commons.cli2.Option)}
 * @utbot.returnsFrom {@code return present;}
 *  */
    @Test
    public void testHasOption_ReturnPresent_3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        String preferredName = "";
        setField(command, "org.apache.commons.cli2.option.Command", "preferredName", preferredName);
        options.add(command);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        boolean actual = writeableCommandLineImpl.hasOption(groupImpl);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#hasOption(org.apache.commons.cli2.Option)}
 * @utbot.returnsFrom {@code return present;}
 *  */
    @Test
    public void testHasOption_ReturnPresent_4() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String name = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        options.add(argumentImpl);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "name", name);
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "description", name);
        
        boolean actual = writeableCommandLineImpl.hasOption(groupImpl);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#hasOption(org.apache.commons.cli2.Option)}
 * @utbot.returnsFrom {@code return present;}
 *  */
    @Test
    public void testHasOption_ReturnPresent_5() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        options.add(argumentImpl);
        options.add(null);
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        ArgumentImpl argumentImpl1 = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        
        boolean actual = writeableCommandLineImpl.hasOption(argumentImpl1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasOption(org.apache.commons.cli2.Option)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#hasOption(org.apache.commons.cli2.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean present = options.contains(option);
 *  */
    @Test
    public void testHasOption_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption(WriteableCommandLineImpl.java:100) */
        writeableCommandLineImpl.hasOption(((Option) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#hasOption(org.apache.commons.cli2.Option)}
 * @utbot.invokes {@link java.util.List#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return present;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return present;
 *  */
    @Test
    public void testHasOption_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String description = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "description", description);
        options.add(argumentImpl);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "description", description);
        LinkedHashSet prefixes = new LinkedHashSet();
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "prefixes", prefixes);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.getTriggers(GroupImpl.java:153)
            org.apache.commons.cli2.option.OptionImpl.equals(OptionImpl.java:79)
            java.base/java.util.ArrayList.indexOfRange(ArrayList.java:299)
            java.base/java.util.ArrayList.indexOf(ArrayList.java:286)
            java.base/java.util.ArrayList.contains(ArrayList.java:275)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption(WriteableCommandLineImpl.java:100) */
        writeableCommandLineImpl.hasOption(groupImpl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptions()
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getOptions()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(options);}
 *  */
    @Test
    public void testGetOptions_CollectionsUnmodifiableList() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        
        List actual = writeableCommandLineImpl.getOptions();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValues(org.apache.commons.cli2.Option, java.util.List)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return valueList;}
 *  */
    @Test
    public void testGetValues_ValueListEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", values);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        List actual = writeableCommandLineImpl.getValues(groupImpl, ((List) null));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.executesCondition {@code (valueList.isEmpty()): False}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.returnsFrom {@code return valueList;}
 *  */
    @Test
    public void testGetValues_ValueListNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
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
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method getValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getValues", sourceDestArgumentType, arrayListType);
        getValuesMethod.setAccessible(true);
        java.lang.Object[] getValuesMethodArguments = new java.lang.Object[2];
        getValuesMethodArguments[0] = sourceDestArgument;
        getValuesMethodArguments[1] = arrayList;
        ArrayList actual = ((ArrayList) getValuesMethod.invoke(writeableCommandLineImpl, getValuesMethodArguments));
        
        assertTrue(deepEquals(arrayList, actual));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.executesCondition {@code (valueList.isEmpty()): False}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.executesCondition {@code (valueList.isEmpty()): False}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.returnsFrom {@code return valueList;}
 *  */
    @Test
    public void testGetValues_NotValueListIsEmpty() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
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
        values.put(null, arrayList);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        
        ArrayList actual = ((ArrayList) writeableCommandLineImpl.getValues(((Option) null), ((List) null)));
        
        assertTrue(deepEquals(arrayList, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValues(org.apache.commons.cli2.Option, java.util.List)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List valueList = (List) values.get(option);
 *  */
    @Test
    public void testGetValues_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        values.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.List (java.lang.Object and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:112) */
        writeableCommandLineImpl.getValues(((Option) null), ((List) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List valueList = (List) values.get(option);
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:112) */
        writeableCommandLineImpl.getValues(((Option) null), ((List) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: valueList = (List) this.defaultValues.get(option);
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:121) */
        writeableCommandLineImpl.getValues(groupImpl, ((List) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.executesCondition {@code (valueList.isEmpty()): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: valueList = (List) this.defaultValues.get(option);
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException_2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:121) */
        writeableCommandLineImpl.getValues(groupImpl, ((List) arrayList));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: valueList = (List) this.defaultValues.get(option);
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException_3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        values.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:112) */
        writeableCommandLineImpl.getValues(argumentImpl, ((List) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.executesCondition {@code (valueList.isEmpty()): True}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: valueList = (List) this.defaultValues.get(option);
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException_4() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        values.put(null, arrayList);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:121) */
        writeableCommandLineImpl.getValues(((Option) null), ((List) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addProperty(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testAddProperty() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        writeableCommandLineImpl.addProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testAddProperty_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        writeableCommandLineImpl.addProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testAddProperty_2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        map.put(character, object);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        writeableCommandLineImpl.addProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testAddProperty_3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        map.put(null, null);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        String string = " ";
        
        writeableCommandLineImpl.addProperty(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testAddProperty_4() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        map.put(null, null);
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        writeableCommandLineImpl.addProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testAddProperty_5() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        map.put(null, null);
        setField(properties, "java.util.Properties", "map", map);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        
        writeableCommandLineImpl.addProperty(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addProperty(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.util.Properties#setProperty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: properties.setProperty(property, value);
 *  */
    @Test
    public void testAddProperty_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:156) */
        writeableCommandLineImpl.addProperty(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addProperty(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(java.lang.String,java.lang.String)}
     */
    @Test
    public void testAddPropertyWithNonEmptyStrings() {
        List list = emptyList();
        GroupImpl groupImpl = new GroupImpl(list, "-3", "", 1, Integer.MAX_VALUE);
        LinkedList linkedList = new LinkedList();
        WriteableCommandLineImpl writeableCommandLineImpl = new WriteableCommandLineImpl(groupImpl, linkedList);
        
        writeableCommandLineImpl.addProperty("10", "0");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addProperty(java.lang.String, java.lang.String)
    
    @Test
    public void testAddProperty1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Provider properties = ((Provider) createInstance("sun.security.jca.ProviderList$1"));
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.IllegalStateException]
            java.base/java.security.Provider.checkInitialized(Provider.java:809)
            java.base/java.security.Provider.check(Provider.java:814)
            java.base/java.security.Provider.put(Provider.java:472)
            java.base/java.util.Properties.setProperty(Properties.java:229)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:156) */
        writeableCommandLineImpl.addProperty(null, string);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method addProperty(java.lang.String, java.lang.String)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testAddProperty2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Provider properties = ((Provider) createInstance("sun.security.jca.ProviderList$1"));
        setField(properties, "java.security.Provider", "initialized", true);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "properties", properties);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.security.AccessControlException: access denied ("java.security.SecurityPermission" "putProviderProperty.null")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkSecurityAccess(SecurityManager.java:1531)
            java.base/java.security.Provider.check(Provider.java:818)
            java.base/java.security.Provider.put(Provider.java:472)
            java.base/java.util.Properties.setProperty(Properties.java:229)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:156) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return (Option) nameToOption.get(trigger);}
 *  */
    @Test
    public void testGetOption_MapGet() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap nameToOption = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "nameToOption", nameToOption);
        
        Option actual = writeableCommandLineImpl.getOption(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Option) nameToOption.get(trigger);
 *  */
    @Test
    public void testGetOption_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap nameToOption = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        nameToOption.put(null, object);
        Character character = '\u0000';
        Object object1 = createInstance("java.lang.Object");
        nameToOption.put(character, object1);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "nameToOption", nameToOption);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli2.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli2.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption(WriteableCommandLineImpl.java:106) */
        writeableCommandLineImpl.getOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Option) nameToOption.get(trigger);
 *  */
    @Test
    public void testGetOption_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption(WriteableCommandLineImpl.java:106) */
        writeableCommandLineImpl.getOption(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefaultValues(org.apache.commons.cli2.Option, java.util.List)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): True}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 *  */
    @Test
    public void testSetDefaultValues_DefaultsEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        
        writeableCommandLineImpl.setDefaultValues(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): False}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSetDefaultValues_DefaultsNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        ArrayList arrayList = new ArrayList();
        
        writeableCommandLineImpl.setDefaultValues(null, arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefaultValues(org.apache.commons.cli2.Option, java.util.List)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultValues.remove(option);
 *  */
    @Test
    public void testSetDefaultValues_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:212) */
        writeableCommandLineImpl.setDefaultValues(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultValues.put(option, defaults);
 *  */
    @Test
    public void testSetDefaultValues_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:214) */
        writeableCommandLineImpl.setDefaultValues(null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): True}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetDefaultValues_ThrowNullPointerException_2() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultValues.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.remove(HashMap.java:797)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:212) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class listType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", sourceDestArgumentType, listType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = sourceDestArgument;
        setDefaultValuesMethodArguments[1] = ((Object) null);
        try {
            setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): False}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetDefaultValues_ThrowNullPointerException_3() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        defaultValues.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:214) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", sourceDestArgumentType, arrayListType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = sourceDestArgument;
        setDefaultValuesMethodArguments[1] = arrayList;
        try {
            setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): True}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 *  */
    @Test
    public void testSetDefaultSwitch_DefaultSwitchEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        
        writeableCommandLineImpl.setDefaultSwitch(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): False}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSetDefaultSwitch_DefaultSwitchNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        Boolean boolean1 = false;
        
        writeableCommandLineImpl.setDefaultSwitch(null, boolean1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultSwitches.remove(option);
 *  */
    @Test
    public void testSetDefaultSwitch_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:221) */
        writeableCommandLineImpl.setDefaultSwitch(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultSwitches.put(option, defaultSwitch);
 *  */
    @Test
    public void testSetDefaultSwitch_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:223) */
        writeableCommandLineImpl.setDefaultSwitch(null, boolean1);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): True}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetDefaultSwitch_ThrowNullPointerException_2() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.remove(HashMap.java:797)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:221) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class booleanType = Class.forName("java.lang.Boolean");
        Method setDefaultSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultSwitch", sourceDestArgumentType, booleanType);
        setDefaultSwitchMethod.setAccessible(true);
        java.lang.Object[] setDefaultSwitchMethodArguments = new java.lang.Object[2];
        setDefaultSwitchMethodArguments[0] = sourceDestArgument;
        setDefaultSwitchMethodArguments[1] = ((Object) null);
        try {
            setDefaultSwitchMethod.invoke(writeableCommandLineImpl, setDefaultSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): False}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetDefaultSwitch_ThrowNullPointerException_3() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:223) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method setDefaultSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultSwitch", sourceDestArgumentType, boolean1Type);
        setDefaultSwitchMethod.setAccessible(true);
        java.lang.Object[] setDefaultSwitchMethodArguments = new java.lang.Object[2];
        setDefaultSwitchMethodArguments[0] = sourceDestArgument;
        setDefaultSwitchMethodArguments[1] = boolean1;
        try {
            setDefaultSwitchMethod.invoke(writeableCommandLineImpl, setDefaultSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    @Test
    public void testSetDefaultSwitch1() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:223) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class propertyOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method setDefaultSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultSwitch", propertyOptionType, boolean1Type);
        setDefaultSwitchMethod.setAccessible(true);
        java.lang.Object[] setDefaultSwitchMethodArguments = new java.lang.Object[2];
        setDefaultSwitchMethodArguments[0] = propertyOption;
        setDefaultSwitchMethodArguments[1] = boolean1;
        try {
            setDefaultSwitchMethod.invoke(writeableCommandLineImpl, setDefaultSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetDefaultSwitch2() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.remove(HashMap.java:797)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:221) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class propertyOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class booleanType = Class.forName("java.lang.Boolean");
        Method setDefaultSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultSwitch", propertyOptionType, booleanType);
        setDefaultSwitchMethod.setAccessible(true);
        java.lang.Object[] setDefaultSwitchMethodArguments = new java.lang.Object[2];
        setDefaultSwitchMethodArguments[0] = propertyOption;
        setDefaultSwitchMethodArguments[1] = ((Object) null);
        try {
            setDefaultSwitchMethod.invoke(writeableCommandLineImpl, setDefaultSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetDefaultSwitch3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.remove(HashMap.java:797)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:221) */
        writeableCommandLineImpl.setDefaultSwitch(groupImpl, null);
    }
    
    @Test
    public void testSetDefaultSwitch4() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(integer, object);
        defaultSwitches.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:223) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class defaultOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method setDefaultSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultSwitch", defaultOptionType, boolean1Type);
        setDefaultSwitchMethod.setAccessible(true);
        java.lang.Object[] setDefaultSwitchMethodArguments = new java.lang.Object[2];
        setDefaultSwitchMethodArguments[0] = defaultOption;
        setDefaultSwitchMethodArguments[1] = boolean1;
        try {
            setDefaultSwitchMethod.invoke(writeableCommandLineImpl, setDefaultSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetDefaultSwitch5() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(character, object);
        Object object1 = createInstance("java.lang.Object");
        defaultSwitches.put(null, object1);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:223) */
        writeableCommandLineImpl.setDefaultSwitch(groupImpl, boolean1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method looksLikeOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#looksLikeOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeOption_ReturnFalse() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashSet prefixes = new LinkedHashSet();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "prefixes", prefixes);
        
        boolean actual = writeableCommandLineImpl.looksLikeOption(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method looksLikeOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#looksLikeOption(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = prefixes.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final String prefix = (String) i.next();
 *  */
    @Test
    public void testLooksLikeOption_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashSet prefixes = new LinkedHashSet();
        Integer integer = 0;
        prefixes.add(integer);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "prefixes", prefixes);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(WriteableCommandLineImpl.java:170) */
        writeableCommandLineImpl.looksLikeOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#looksLikeOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Iterator i = prefixes.iterator(); i.hasNext(); )
 *  */
    @Test
    public void testLooksLikeOption_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(WriteableCommandLineImpl.java:169) */
        writeableCommandLineImpl.looksLikeOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#looksLikeOption(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = prefixes.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: trigger.startsWith(prefix)
 *  */
    @Test
    public void testLooksLikeOption_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashSet prefixes = new LinkedHashSet();
        prefixes.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "prefixes", prefixes);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(WriteableCommandLineImpl.java:172) */
        writeableCommandLineImpl.looksLikeOption(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method looksLikeOption(java.lang.String)
    
    @Test
    public void testLooksLikeOption1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashSet prefixes = new LinkedHashSet();
        prefixes.add(null);
        Character character = '\u0000';
        prefixes.add(character);
        Object object = createInstance("java.lang.Object");
        prefixes.add(object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "prefixes", prefixes);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption] produces [java.lang.NullPointerException]
            java.base/java.lang.String.startsWith(String.java:2261)
            java.base/java.lang.String.startsWith(String.java:2304)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(WriteableCommandLineImpl.java:172) */
        writeableCommandLineImpl.looksLikeOption(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getNormalised
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNormalised()
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getNormalised()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(normalised);}
 *  */
    @Test
    public void testGetNormalised_CollectionsUnmodifiableList() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList normalised = new ArrayList();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "normalised", normalised);
        
        List actual = writeableCommandLineImpl.getNormalised();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addOption(org.apache.commons.cli2.Option)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addOption(org.apache.commons.cli2.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: options.add(option);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:64) */
        writeableCommandLineImpl.addOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addOption(org.apache.commons.cli2.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameToOption.put(option.getPreferredName(), option);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        options.add(null);
        options.add(null);
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        LinkedHashMap nameToOption = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "nameToOption", nameToOption);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:65) */
        writeableCommandLineImpl.addOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addOption(org.apache.commons.cli2.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameToOption.put(option.getPreferredName(), option);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        options.add(null);
        options.add(null);
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String name = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:65) */
        writeableCommandLineImpl.addOption(argumentImpl);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addOption(org.apache.commons.cli2.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameToOption.put(option.getPreferredName(), option);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        options.add(null);
        options.add(null);
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String name = "";
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "name", name);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:65) */
        writeableCommandLineImpl.addOption(groupImpl);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addOption(org.apache.commons.cli2.Option)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addOption(org.apache.commons.cli2.Option)}
     */
    @Test
    public void testAddOption() {
        List list = emptyList();
        GroupImpl groupImpl = new GroupImpl(list, "#$\\\"'", "-3", -1, Integer.MAX_VALUE);
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        linkedList.add(object);
        Object object1 = new Object();
        linkedList.add(object1);
        WriteableCommandLineImpl writeableCommandLineImpl = new WriteableCommandLineImpl(groupImpl, linkedList);
        List list1 = emptyList();
        GroupImpl groupImpl1 = new GroupImpl(list1, "10", "abc", 1, 0);
        
        writeableCommandLineImpl.addOption(groupImpl1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addOption(org.apache.commons.cli2.Option)
    
    @Test
    public void testAddOption1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        LinkedHashMap nameToOption = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        nameToOption.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "nameToOption", nameToOption);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        
        writeableCommandLineImpl.addOption(argumentImpl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addOption(org.apache.commons.cli2.Option)
    
    @Test
    public void testAddOption2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        LinkedHashMap nameToOption = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        nameToOption.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "nameToOption", nameToOption);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.getTriggers(GroupImpl.java:153)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:67) */
        writeableCommandLineImpl.addOption(groupImpl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.returnsFrom {@code return bool;}
 *  */
    @Test
    public void testGetSwitch_BoolEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        Boolean boolean1 = false;
        
        Boolean actual = writeableCommandLineImpl.getSwitch(argumentImpl, boolean1);
        
        assertEquals(boolean1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.returnsFrom {@code return bool;}
 *  */
    @Test
    public void testGetSwitch_BoolNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        Boolean boolean1 = false;
        switches.put(null, boolean1);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        
        Boolean actual = writeableCommandLineImpl.getSwitch(((Option) null), ((Boolean) null));
        
        assertEquals(boolean1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Boolean bool = (Boolean) switches.get(option);
 *  */
    @Test
    public void testGetSwitch_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        switches.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Boolean (java.lang.Object and java.lang.Boolean are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:139) */
        writeableCommandLineImpl.getSwitch(((Option) null), ((Boolean) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Boolean bool = (Boolean) switches.get(option);
 *  */
    @Test
    public void testGetSwitch_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:139) */
        writeableCommandLineImpl.getSwitch(((Option) null), ((Boolean) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bool = (Boolean) this.defaultSwitches.get(option);
 *  */
    @Test
    public void testGetSwitch_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:148) */
        writeableCommandLineImpl.getSwitch(groupImpl, ((Boolean) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.returnsFrom {@code return bool;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return bool;
 *  */
    @Test
    public void testGetSwitch_ThrowNullPointerException_2() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        switches.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:139) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method getSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("getSwitch", sourceDestArgumentType, boolean1Type);
        getSwitchMethod.setAccessible(true);
        java.lang.Object[] getSwitchMethodArguments = new java.lang.Object[2];
        getSwitchMethodArguments[0] = sourceDestArgument;
        getSwitchMethodArguments[1] = boolean1;
        try {
            getSwitchMethod.invoke(writeableCommandLineImpl, getSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.returnsFrom {@code return bool;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return bool;
 *  */
    @Test
    public void testGetSwitch_ThrowNullPointerException_3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        Character character = '\u0001';
        Object object = createInstance("java.lang.Object");
        switches.put(character, object);
        Character character1 = '\u0000';
        switches.put(character1, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:139) */
        writeableCommandLineImpl.getSwitch(groupImpl, boolean1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    @Test
    public void testGetSwitch1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", switches);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        
        Boolean actual = writeableCommandLineImpl.getSwitch(argumentImpl, ((Boolean) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    @Test
    public void testGetSwitch2() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        switches.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", switches);
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:139) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class commandType = Class.forName("org.apache.commons.cli2.Option");
        Class booleanType = Class.forName("java.lang.Boolean");
        Method getSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("getSwitch", commandType, booleanType);
        getSwitchMethod.setAccessible(true);
        java.lang.Object[] getSwitchMethodArguments = new java.lang.Object[2];
        getSwitchMethodArguments[0] = command;
        getSwitchMethodArguments[1] = ((Object) null);
        try {
            getSwitchMethod.invoke(writeableCommandLineImpl, getSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetSwitch3() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        switches.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:139) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class propertyOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class booleanType = Class.forName("java.lang.Boolean");
        Method getSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("getSwitch", propertyOptionType, booleanType);
        getSwitchMethod.setAccessible(true);
        java.lang.Object[] getSwitchMethodArguments = new java.lang.Object[2];
        getSwitchMethodArguments[0] = propertyOption;
        getSwitchMethodArguments[1] = ((Object) null);
        try {
            getSwitchMethod.invoke(writeableCommandLineImpl, getSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetSwitch4() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        switches.put(null, object);
        Integer integer = 0;
        switches.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        Switch switch1 = ((Switch) createInstance("org.apache.commons.cli2.option.Switch"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:104)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:139) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class switch1Type = Class.forName("org.apache.commons.cli2.Option");
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method getSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("getSwitch", switch1Type, boolean1Type);
        getSwitchMethod.setAccessible(true);
        java.lang.Object[] getSwitchMethodArguments = new java.lang.Object[2];
        getSwitchMethodArguments[0] = switch1;
        getSwitchMethodArguments[1] = boolean1;
        try {
            getSwitchMethod.invoke(writeableCommandLineImpl, getSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetSwitch5() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        Character character = '\u0001';
        Object object = createInstance("java.lang.Object");
        switches.put(character, object);
        Character character1 = '\u0000';
        switches.put(character1, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:98)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:139) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class defaultOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class booleanType = Class.forName("java.lang.Boolean");
        Method getSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("getSwitch", defaultOptionType, booleanType);
        getSwitchMethod.setAccessible(true);
        java.lang.Object[] getSwitchMethodArguments = new java.lang.Object[2];
        getSwitchMethodArguments[0] = defaultOption;
        getSwitchMethodArguments[1] = ((Object) null);
        try {
            getSwitchMethod.invoke(writeableCommandLineImpl, getSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptionTriggers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptionTriggers()
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getOptionTriggers()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableSet(java.util.Set)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableSet(nameToOption.keySet());}
 *  */
    @Test
    public void testGetOptionTriggers_CollectionsUnmodifiableSet() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap nameToOption = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "nameToOption", nameToOption);
        
        Set actual = writeableCommandLineImpl.getOptionTriggers();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOptionTriggers()
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getOptionTriggers()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableSet(nameToOption.keySet());
 *  */
    @Test
    public void testGetOptionTriggers_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptionTriggers] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptionTriggers(WriteableCommandLineImpl.java:206) */
        writeableCommandLineImpl.getOptionTriggers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addValue(org.apache.commons.cli2.Option, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addValue(org.apache.commons.cli2.Option,java.lang.Object)}
 * @utbot.executesCondition {@code (option instanceof Argument): False}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testAddValue_ValueListNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        values.put(null, arrayList);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        
        writeableCommandLineImpl.addValue(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addValue(org.apache.commons.cli2.Option, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addValue(org.apache.commons.cli2.Option,java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List valueList = (List) values.get(option);
 *  */
    @Test
    public void testAddValue_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        values.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.List (java.lang.Object and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue(WriteableCommandLineImpl.java:78) */
        writeableCommandLineImpl.addValue(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addValue(org.apache.commons.cli2.Option,java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List valueList = (List) values.get(option);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue(WriteableCommandLineImpl.java:78) */
        writeableCommandLineImpl.addValue(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields849427348312900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields849427348312900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass849427348318800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields849427348312900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass849427348318800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

