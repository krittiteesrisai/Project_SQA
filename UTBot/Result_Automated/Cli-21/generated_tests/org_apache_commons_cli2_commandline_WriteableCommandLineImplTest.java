package org.apache.commons.cli2.commandline;

import org.junit.Test;
import java.util.LinkedHashMap;
import org.apache.commons.cli2.option.SourceDestArgument;
import java.lang.reflect.Method;
import sun.security.rsa.SunRsaSign;
import org.apache.commons.cli2.option.GroupImpl;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import org.apache.commons.cli2.option.ArgumentImpl;
import com.sun.crypto.provider.SunJCE;
import java.util.Properties;
import org.apache.commons.cli2.option.Switch;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.Command;
import java.util.List;
import sun.security.provider.Sun;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.option.PropertyOption;
import java.util.LinkedList;
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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.util.Collections.emptyList;

public final class org_apache_commons_cli2_commandline_WriteableCommandLineImplTest {
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return getProperty(new PropertyOption(), property);}
 *  */
    @Test
    public void testGetProperty_ReturnGetProperty() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        String actual = writeableCommandLineImpl.getProperty(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return getProperty(new PropertyOption(), property);}
 *  */
    @Test
    public void testGetProperty_ReturnGetProperty_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        String actual = writeableCommandLineImpl.getProperty(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(org.apache.commons.cli2.Option,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (properties == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetProperty_PropertiesEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class stringType = Class.forName("java.lang.String");
        Method getPropertyMethod = writeableCommandLineImplClazz.getDeclaredMethod("getProperty", sourceDestArgumentType, stringType, stringType);
        getPropertyMethod.setAccessible(true);
        java.lang.Object[] getPropertyMethodArguments = new java.lang.Object[3];
        getPropertyMethodArguments[0] = sourceDestArgument;
        getPropertyMethodArguments[1] = ((Object) null);
        getPropertyMethodArguments[2] = ((Object) null);
        String actual = ((String) getPropertyMethod.invoke(writeableCommandLineImpl, getPropertyMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(org.apache.commons.cli2.Option,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Properties properties = (Properties) optionToProperties.get(option);
 *  */
    @Test
    public void testGetProperty_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Properties (java.lang.Object and java.util.Properties are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(WriteableCommandLineImpl.java:202) */
        writeableCommandLineImpl.getProperty(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(org.apache.commons.cli2.Option,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (properties == null): False}
 * @utbot.invokes {@link java.util.Properties#getProperty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return properties.getProperty(property, defaultValue);
 *  */
    @Test
    public void testGetProperty_ThrowIllegalStateException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        SunRsaSign sunRsaSign = ((SunRsaSign) createInstance("sun.security.rsa.SunRsaSign"));
        optionToProperties.put(null, sunRsaSign);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty] produces [java.lang.IllegalStateException]
            java.base/java.security.Provider.checkInitialized(Provider.java:809)
            java.base/java.security.Provider.getProperty(Provider.java:803)
            java.base/java.util.Properties.getProperty(Properties.java:1122)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(WriteableCommandLineImpl.java:206) */
        writeableCommandLineImpl.getProperty(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(org.apache.commons.cli2.Option,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Properties properties = (Properties) optionToProperties.get(option);
 *  */
    @Test
    public void testGetProperty_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(WriteableCommandLineImpl.java:202) */
        writeableCommandLineImpl.getProperty(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperty(org.apache.commons.cli2.Option,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (properties == null): True}
 * @utbot.returnsFrom {@code return defaultValue;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return defaultValue;
 *  */
    @Test
    public void testGetProperty_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(WriteableCommandLineImpl.java:202) */
        writeableCommandLineImpl.getProperty(groupImpl, null, null);
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString(WriteableCommandLineImpl.java:253) */
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString(WriteableCommandLineImpl.java:252) */
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString(WriteableCommandLineImpl.java:255) */
        writeableCommandLineImpl.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperties()
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperties()}
 * @utbot.returnsFrom {@code return getProperties(new PropertyOption());}
 *  */
    @Test
    public void testGetProperties_ReturnGetProperties_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        Set actual = writeableCommandLineImpl.getProperties();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperties()}
 * @utbot.returnsFrom {@code return getProperties(new PropertyOption());}
 *  */
    @Test
    public void testGetProperties_ReturnGetProperties() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        optionToProperties.put(null, null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        Set actual = writeableCommandLineImpl.getProperties();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperties(org.apache.commons.cli2.Option)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperties(org.apache.commons.cli2.Option)}
 * @utbot.returnsFrom {@code return Collections.EMPTY_SET;}
 *  */
    @Test
    public void testGetProperties_ReturnCollectionsEMPTY_SET() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Method getPropertiesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getProperties", sourceDestArgumentType);
        getPropertiesMethod.setAccessible(true);
        java.lang.Object[] getPropertiesMethodArguments = new java.lang.Object[1];
        getPropertiesMethodArguments[0] = sourceDestArgument;
        Set actual = ((Set) getPropertiesMethod.invoke(writeableCommandLineImpl, getPropertiesMethodArguments));
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperties(org.apache.commons.cli2.Option)}
 * @utbot.returnsFrom {@code return Collections.EMPTY_SET;}
 *  */
    @Test
    public void testGetProperties_ReturnCollectionsEMPTY_SET_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        
        Set actual = writeableCommandLineImpl.getProperties(argumentImpl);
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperties(org.apache.commons.cli2.Option)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperties(org.apache.commons.cli2.Option)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Properties properties = (Properties) optionToProperties.get(option);
 *  */
    @Test
    public void testGetProperties_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Properties (java.lang.Object and java.util.Properties are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(WriteableCommandLineImpl.java:210) */
        writeableCommandLineImpl.getProperties(null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getProperties(org.apache.commons.cli2.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Properties properties = (Properties) optionToProperties.get(option);
 *  */
    @Test
    public void testGetProperties_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(WriteableCommandLineImpl.java:210) */
        writeableCommandLineImpl.getProperties(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getProperties(org.apache.commons.cli2.Option)
    
    @Test
    public void testGetProperties1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        SunJCE sunJCE = ((SunJCE) createInstance("com.sun.crypto.provider.SunJCE"));
        optionToProperties.put(null, sunJCE);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties] produces [java.lang.IllegalStateException]
            java.base/java.security.Provider.checkInitialized(Provider.java:809)
            java.base/java.security.Provider.keySet(Provider.java:438)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(WriteableCommandLineImpl.java:214) */
        writeableCommandLineImpl.getProperties(null);
    }
    
    @Test
    public void testGetProperties2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(WriteableCommandLineImpl.java:210) */
        writeableCommandLineImpl.getProperties(groupImpl);
    }
    
    @Test
    public void testGetProperties3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        optionToProperties.put(null, properties);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties] produces [java.lang.NullPointerException]
            java.base/java.util.Properties.keySet(Properties.java:1326)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(WriteableCommandLineImpl.java:214) */
        writeableCommandLineImpl.getProperties(null);
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
        Switch switch1 = ((Switch) createInstance("org.apache.commons.cli2.option.Switch"));
        options.add(switch1);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        setField(sourceDestArgument, "org.apache.commons.cli2.option.OptionImpl", "id", -1);
        
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
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        options.add(sourceDestArgument);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String name = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        
        boolean actual = writeableCommandLineImpl.hasOption(argumentImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasOption(org.apache.commons.cli2.Option)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#hasOption(org.apache.commons.cli2.Option)}
 * @utbot.invokes {@link java.util.List#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean present = options.contains(option);
 *  */
    @Test
    public void testHasOption_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption(WriteableCommandLineImpl.java:111) */
        writeableCommandLineImpl.hasOption(((Option) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasOption(org.apache.commons.cli2.Option)
    
    @Test
    public void testHasOption1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        Object object = createInstance("java.lang.Object");
        options.add(object);
        options.add(null);
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        boolean actual = writeableCommandLineImpl.hasOption(groupImpl);
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasOption2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        String name = "\u0000";
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        options.add(sourceDestArgument);
        options.add(writeableCommandLineImpl);
        options.add(writeableCommandLineImpl);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String name1 = "\u0000";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "name", name1);
        
        boolean actual = writeableCommandLineImpl.hasOption(argumentImpl);
        
        assertTrue(actual);
    }
    
    @Test
    public void testHasOption3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        String preferredName = "\u0000";
        setField(command, "org.apache.commons.cli2.option.Command", "preferredName", preferredName);
        options.add(command);
        options.add(null);
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String name = "\u0000";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "name", name);
        
        boolean actual = writeableCommandLineImpl.hasOption(argumentImpl);
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasOption4() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        String description = "";
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "description", description);
        options.add(sourceDestArgument);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) sourceDestArgument);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        options.add(objectArray);
        options.add(objectArray);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String description1 = "";
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "description", description1);
        
        boolean actual = writeableCommandLineImpl.hasOption(groupImpl);
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasOption5() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        options.add(sourceDestArgument);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        options.add(groupImpl);
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        String description = "";
        setField(argumentImpl, "org.apache.commons.cli2.option.ArgumentImpl", "description", description);
        
        boolean actual = writeableCommandLineImpl.hasOption(argumentImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasOption(org.apache.commons.cli2.Option)
    
    @Test
    public void testHasOption6() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        String description = "";
        setField(sourceDestArgument, "org.apache.commons.cli2.option.ArgumentImpl", "description", description);
        options.add(sourceDestArgument);
        options.add(null);
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "description", description);
        LinkedHashSet prefixes = new LinkedHashSet();
        setField(groupImpl, "org.apache.commons.cli2.option.GroupImpl", "prefixes", prefixes);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.getTriggers(GroupImpl.java:156)
            org.apache.commons.cli2.option.OptionImpl.equals(OptionImpl.java:80)
            java.base/java.util.ArrayList.indexOfRange(ArrayList.java:299)
            java.base/java.util.ArrayList.indexOf(ArrayList.java:286)
            java.base/java.util.ArrayList.contains(ArrayList.java:275)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption(WriteableCommandLineImpl.java:111) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Option) nameToOption.get(trigger);
 *  */
    @Test
    public void testGetOption_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption(WriteableCommandLineImpl.java:117) */
        writeableCommandLineImpl.getOption(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getOption(java.lang.String)
    
    @Test
    public void testGetOption1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap nameToOption = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        nameToOption.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "nameToOption", nameToOption);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli2.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli2.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @71eb66a3)]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption(WriteableCommandLineImpl.java:117) */
        writeableCommandLineImpl.getOption(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addProperty(java.lang.String, java.lang.String)
    
    @Test
    public void testAddProperty1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        String string = "";
        
        writeableCommandLineImpl.addProperty(string, string);
    }
    
    @Test
    public void testAddProperty2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Character character = '\u0000';
        optionToProperties.put(character, null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        String string = "";
        String string1 = "";
        
        writeableCommandLineImpl.addProperty(string, string1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addProperty(java.lang.String, java.lang.String)
    
    @Test
    public void testAddProperty3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.NullPointerException]
            java.base/java.util.concurrent.ConcurrentHashMap.putVal(ConcurrentHashMap.java:1011)
            java.base/java.util.concurrent.ConcurrentHashMap.put(ConcurrentHashMap.java:1006)
            java.base/java.util.Properties.put(Properties.java:1301)
            java.base/java.util.Properties.setProperty(Properties.java:229)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:192)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:196) */
        writeableCommandLineImpl.addProperty(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(org.apache.commons.cli2.Option,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Properties properties = (Properties) optionToProperties.get(option);
 *  */
    @Test
    public void testAddProperty_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Properties (java.lang.Object and java.util.Properties are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:187) */
        writeableCommandLineImpl.addProperty(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(org.apache.commons.cli2.Option,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Properties properties = (Properties) optionToProperties.get(option);
 *  */
    @Test
    public void testAddProperty_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:187) */
        writeableCommandLineImpl.addProperty(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addProperty(org.apache.commons.cli2.Option,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (properties == null): False}
 * @utbot.invokes {@link java.util.Properties#setProperty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddProperty_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        setField(properties, "java.util.Properties", "map", optionToProperties);
        optionToProperties.put(null, properties);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.NullPointerException]
            java.base/java.util.concurrent.ConcurrentHashMap.putVal(ConcurrentHashMap.java:1011)
            java.base/java.util.concurrent.ConcurrentHashMap.put(ConcurrentHashMap.java:1006)
            java.base/java.util.Properties.put(Properties.java:1301)
            java.base/java.util.Properties.setProperty(Properties.java:229)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:192) */
        writeableCommandLineImpl.addProperty(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)
    
    @Test
    public void testAddProperty4() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        String string = "";
        String string1 = "";
        
        writeableCommandLineImpl.addProperty(null, string, string1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)
    
    @Test
    public void testAddProperty5() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Sun sun = ((Sun) createInstance("sun.security.provider.Sun"));
        optionToProperties.put(null, sun);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.IllegalStateException]
            java.base/java.security.Provider.checkInitialized(Provider.java:809)
            java.base/java.security.Provider.check(Provider.java:814)
            java.base/java.security.Provider.put(Provider.java:472)
            java.base/java.util.Properties.setProperty(Properties.java:229)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:192) */
        writeableCommandLineImpl.addProperty(null, null, null);
    }
    
    @Test
    public void testAddProperty6() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:190) */
        writeableCommandLineImpl.addProperty(groupImpl, string, null);
    }
    
    @Test
    public void testAddProperty7() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:187) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class defaultOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class stringType = Class.forName("java.lang.String");
        Method addPropertyMethod = writeableCommandLineImplClazz.getDeclaredMethod("addProperty", defaultOptionType, stringType, stringType);
        addPropertyMethod.setAccessible(true);
        java.lang.Object[] addPropertyMethodArguments = new java.lang.Object[3];
        addPropertyMethodArguments[0] = defaultOption;
        addPropertyMethodArguments[1] = string;
        addPropertyMethodArguments[2] = ((Object) null);
        try {
            addPropertyMethod.invoke(writeableCommandLineImpl, addPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddProperty8() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap optionToProperties = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        optionToProperties.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "optionToProperties", optionToProperties);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(WriteableCommandLineImpl.java:187) */
        writeableCommandLineImpl.addProperty(groupImpl, string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValues(org.apache.commons.cli2.Option, java.util.List)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaultValues == null): True}
 * @utbot.executesCondition {@code (defaultValues != null): False}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return valueList == null ? Collections.EMPTY_LIST : valueList;}
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
 * @utbot.executesCondition {@code (defaultValues == null): False}
 * @utbot.executesCondition {@code (defaultValues != null): True}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.returnsFrom {@code return valueList == null ? Collections.EMPTY_LIST : valueList;}
 *  */
    @Test
    public void testGetValues_ValueListNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
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
        
        ArrayList actual = ((ArrayList) writeableCommandLineImpl.getValues(argumentImpl, ((List) arrayList)));
        
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:123) */
        writeableCommandLineImpl.getValues(((Option) null), ((List) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List valueList = (List) values.get(option);
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:123) */
        writeableCommandLineImpl.getValues(((Option) null), ((List) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaultValues == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultValues = (List) this.defaultValues.get(option);
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:127) */
        writeableCommandLineImpl.getValues(groupImpl, ((List) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaultValues == null): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultValues = (List) this.defaultValues.get(option);
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException_2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:127) */
        writeableCommandLineImpl.getValues(groupImpl, ((List) arrayList));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaultValues == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultValues = (List) this.defaultValues.get(option);
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException_3() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        values.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:127) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class listType = Class.forName("java.util.List");
        Method getValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getValues", sourceDestArgumentType, listType);
        getValuesMethod.setAccessible(true);
        java.lang.Object[] getValuesMethodArguments = new java.lang.Object[2];
        getValuesMethodArguments[0] = sourceDestArgument;
        getValuesMethodArguments[1] = ((Object) null);
        try {
            getValuesMethod.invoke(writeableCommandLineImpl, getValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValues(org.apache.commons.cli2.Option, java.util.List)
    
    @Test
    public void testGetValues1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", values);
        ArrayList arrayList = new ArrayList();
        
        List actual = writeableCommandLineImpl.getValues(((Option) null), ((List) arrayList));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetValues2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        values.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", values);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class listType = Class.forName("java.util.List");
        Method getValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getValues", sourceDestArgumentType, listType);
        getValuesMethod.setAccessible(true);
        java.lang.Object[] getValuesMethodArguments = new java.lang.Object[2];
        getValuesMethodArguments[0] = sourceDestArgument;
        getValuesMethodArguments[1] = ((Object) null);
        List actual = ((List) getValuesMethod.invoke(writeableCommandLineImpl, getValuesMethodArguments));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetValues3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        values.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        LinkedHashMap defaultValues = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class listType = Class.forName("java.util.List");
        Method getValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getValues", sourceDestArgumentType, listType);
        getValuesMethod.setAccessible(true);
        java.lang.Object[] getValuesMethodArguments = new java.lang.Object[2];
        getValuesMethodArguments[0] = sourceDestArgument;
        getValuesMethodArguments[1] = ((Object) null);
        List actual = ((List) getValuesMethod.invoke(writeableCommandLineImpl, getValuesMethodArguments));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValues(org.apache.commons.cli2.Option, java.util.List)
    
    @Test
    public void testGetValues4() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        values.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:127) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method getValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getValues", sourceDestArgumentType, arrayListType);
        getValuesMethod.setAccessible(true);
        java.lang.Object[] getValuesMethodArguments = new java.lang.Object[2];
        getValuesMethodArguments[0] = sourceDestArgument;
        getValuesMethodArguments[1] = arrayList;
        try {
            getValuesMethod.invoke(writeableCommandLineImpl, getValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetValues5() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        values.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        LinkedHashMap defaultValues = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(WriteableCommandLineImpl.java:123) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class propertyOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class listType = Class.forName("java.util.List");
        Method getValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getValues", propertyOptionType, listType);
        getValuesMethod.setAccessible(true);
        java.lang.Object[] getValuesMethodArguments = new java.lang.Object[2];
        getValuesMethodArguments[0] = propertyOption;
        getValuesMethodArguments[1] = ((Object) null);
        try {
            getValuesMethod.invoke(writeableCommandLineImpl, getValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUndefaultedValues(org.apache.commons.cli2.Option)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getUndefaultedValues(org.apache.commons.cli2.Option)}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.returnsFrom {@code return valueList;}
 *  */
    @Test
    public void testGetUndefaultedValues_ValueListEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Method getUndefaultedValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getUndefaultedValues", sourceDestArgumentType);
        getUndefaultedValuesMethod.setAccessible(true);
        java.lang.Object[] getUndefaultedValuesMethodArguments = new java.lang.Object[1];
        getUndefaultedValuesMethodArguments[0] = sourceDestArgument;
        List actual = ((List) getUndefaultedValuesMethod.invoke(writeableCommandLineImpl, getUndefaultedValuesMethodArguments));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getUndefaultedValues(org.apache.commons.cli2.Option)}
 * @utbot.executesCondition {@code (valueList == null): False}
 * @utbot.returnsFrom {@code return valueList;}
 *  */
    @Test
    public void testGetUndefaultedValues_ValueListNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        values.put(null, arrayList);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        
        ArrayList actual = ((ArrayList) writeableCommandLineImpl.getUndefaultedValues(null));
        
        assertTrue(deepEquals(arrayList, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getUndefaultedValues(org.apache.commons.cli2.Option)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getUndefaultedValues(org.apache.commons.cli2.Option)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List valueList = (List) values.get(option);
 *  */
    @Test
    public void testGetUndefaultedValues_ThrowClassCastException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        values.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.List (java.lang.Object and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues(WriteableCommandLineImpl.java:152) */
        writeableCommandLineImpl.getUndefaultedValues(null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getUndefaultedValues(org.apache.commons.cli2.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List valueList = (List) values.get(option);
 *  */
    @Test
    public void testGetUndefaultedValues_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues(WriteableCommandLineImpl.java:152) */
        writeableCommandLineImpl.getUndefaultedValues(null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getUndefaultedValues(org.apache.commons.cli2.Option)}
 * @utbot.executesCondition {@code (valueList == null): True}
 * @utbot.returnsFrom {@code return valueList;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return valueList;
 *  */
    @Test
    public void testGetUndefaultedValues_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        values.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues(WriteableCommandLineImpl.java:152) */
        writeableCommandLineImpl.getUndefaultedValues(groupImpl);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getUndefaultedValues(org.apache.commons.cli2.Option)
    
    @Test
    public void testGetUndefaultedValues1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        values.put(null, object);
        Long long1 = 0L;
        values.put(long1, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Method getUndefaultedValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getUndefaultedValues", sourceDestArgumentType);
        getUndefaultedValuesMethod.setAccessible(true);
        java.lang.Object[] getUndefaultedValuesMethodArguments = new java.lang.Object[1];
        getUndefaultedValuesMethodArguments[0] = sourceDestArgument;
        List actual = ((List) getUndefaultedValuesMethod.invoke(writeableCommandLineImpl, getUndefaultedValuesMethodArguments));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getUndefaultedValues(org.apache.commons.cli2.Option)
    
    @Test
    public void testGetUndefaultedValues2() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        values.put(null, object);
        Character character = '\u0000';
        values.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues(WriteableCommandLineImpl.java:152) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class propertyOptionType = Class.forName("org.apache.commons.cli2.Option");
        Method getUndefaultedValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getUndefaultedValues", propertyOptionType);
        getUndefaultedValuesMethod.setAccessible(true);
        java.lang.Object[] getUndefaultedValuesMethodArguments = new java.lang.Object[1];
        getUndefaultedValuesMethodArguments[0] = propertyOption;
        try {
            getUndefaultedValuesMethod.invoke(writeableCommandLineImpl, getUndefaultedValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetUndefaultedValues3() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap values = new LinkedHashMap();
        Integer integer = 1;
        Object object = createInstance("java.lang.Object");
        values.put(integer, object);
        Integer integer1 = 0;
        values.put(integer1, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "values", values);
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:108)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues(WriteableCommandLineImpl.java:152) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class commandType = Class.forName("org.apache.commons.cli2.Option");
        Method getUndefaultedValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("getUndefaultedValues", commandType);
        getUndefaultedValuesMethod.setAccessible(true);
        java.lang.Object[] getUndefaultedValuesMethodArguments = new java.lang.Object[1];
        getUndefaultedValuesMethodArguments[0] = command;
        try {
            getUndefaultedValuesMethod.invoke(writeableCommandLineImpl, getUndefaultedValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefaultValues(org.apache.commons.cli2.Option, java.util.List)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): True}
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
 *  */
    @Test
    public void testSetDefaultValues_DefaultsNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        ArrayList arrayList = new ArrayList();
        
        writeableCommandLineImpl.setDefaultValues(null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): True}
 *  */
    @Test
    public void testSetDefaultValues_DefaultsEqualsNull_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultValues.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class listType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", sourceDestArgumentType, listType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = sourceDestArgument;
        setDefaultValuesMethodArguments[1] = ((Object) null);
        setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): False}
 *  */
    @Test
    public void testSetDefaultValues_DefaultsNotEqualsNull_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        defaultValues.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        ArrayList arrayList = new ArrayList();
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", sourceDestArgumentType, arrayListType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = sourceDestArgument;
        setDefaultValuesMethodArguments[1] = arrayList;
        setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefaultValues(org.apache.commons.cli2.Option, java.util.List)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): True}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultValues.remove(option);
 *  */
    @Test
    public void testSetDefaultValues_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:280) */
        writeableCommandLineImpl.setDefaultValues(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultValues(org.apache.commons.cli2.Option,java.util.List)}
 * @utbot.executesCondition {@code (defaults == null): False}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultValues.put(option, defaults);
 *  */
    @Test
    public void testSetDefaultValues_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:282) */
        writeableCommandLineImpl.setDefaultValues(null, arrayList);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDefaultValues(org.apache.commons.cli2.Option, java.util.List)
    
    @Test
    public void testSetDefaultValues1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        ArrayList arrayList = new ArrayList();
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", sourceDestArgumentType, arrayListType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = sourceDestArgument;
        setDefaultValuesMethodArguments[1] = arrayList;
        setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
    }
    
    @Test
    public void testSetDefaultValues2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultValues.put(integer, object);
        Character character = '\u0000';
        defaultValues.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        
        writeableCommandLineImpl.setDefaultValues(argumentImpl, null);
    }
    
    @Test
    public void testSetDefaultValues3() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultValues.put(integer, object);
        Character character = '\u0000';
        defaultValues.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        ArrayList arrayList = new ArrayList();
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", sourceDestArgumentType, arrayListType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = sourceDestArgument;
        setDefaultValuesMethodArguments[1] = arrayList;
        setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDefaultValues(org.apache.commons.cli2.Option, java.util.List)
    
    @Test
    public void testSetDefaultValues4() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.remove(HashMap.java:797)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:280) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class propertyOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class listType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", propertyOptionType, listType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = propertyOption;
        setDefaultValuesMethodArguments[1] = ((Object) null);
        try {
            setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetDefaultValues5() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultValues.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:282) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class propertyOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", propertyOptionType, arrayListType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = propertyOption;
        setDefaultValuesMethodArguments[1] = arrayList;
        try {
            setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetDefaultValues6() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        defaultValues.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.remove(HashMap.java:797)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:280) */
        writeableCommandLineImpl.setDefaultValues(groupImpl, null);
    }
    
    @Test
    public void testSetDefaultValues7() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        defaultValues.put(null, object);
        Integer integer = 0;
        defaultValues.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        Command command = ((Command) createInstance("org.apache.commons.cli2.option.Command"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:108)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:282) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class commandType = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", commandType, arrayListType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = command;
        setDefaultValuesMethodArguments[1] = arrayList;
        try {
            setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetDefaultValues8() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        defaultValues.put(null, object);
        Character character = '\u0000';
        defaultValues.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        Switch switch1 = ((Switch) createInstance("org.apache.commons.cli2.option.Switch"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:282) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class switch1Type = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", switch1Type, arrayListType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = switch1;
        setDefaultValuesMethodArguments[1] = arrayList;
        try {
            setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetDefaultValues9() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultValues = new LinkedHashMap();
        Integer integer = 1;
        Object object = createInstance("java.lang.Object");
        defaultValues.put(integer, object);
        Integer integer1 = 0;
        defaultValues.put(integer1, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultValues", defaultValues);
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(WriteableCommandLineImpl.java:282) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class defaultOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class arrayListType = Class.forName("java.util.List");
        Method setDefaultValuesMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultValues", defaultOptionType, arrayListType);
        setDefaultValuesMethod.setAccessible(true);
        java.lang.Object[] setDefaultValuesMethodArguments = new java.lang.Object[2];
        setDefaultValuesMethodArguments[0] = defaultOption;
        setDefaultValuesMethodArguments[1] = arrayList;
        try {
            setDefaultValuesMethod.invoke(writeableCommandLineImpl, setDefaultValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addSwitch
    
    ///region OTHER: ERROR SUITE for method addSwitch(org.apache.commons.cli2.Option, boolean)
    
    @Test
    public void testAddSwitch1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        LinkedHashMap nameToOption = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        nameToOption.put(object, null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "nameToOption", nameToOption);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.GroupImpl.getTriggers(GroupImpl.java:156)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:71)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addSwitch(WriteableCommandLineImpl.java:101) */
        writeableCommandLineImpl.addSwitch(groupImpl, false);
    }
    
    @Test
    public void testAddSwitch2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        ArrayList options = new ArrayList();
        Object object = createInstance("java.lang.Object");
        options.add(object);
        options.add(null);
        options.add(null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "options", options);
        LinkedHashMap nameToOption = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "nameToOption", nameToOption);
        ArgumentImpl argumentImpl = ((ArgumentImpl) createInstance("org.apache.commons.cli2.option.ArgumentImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addSwitch(WriteableCommandLineImpl.java:103) */
        writeableCommandLineImpl.addSwitch(argumentImpl, false);
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(WriteableCommandLineImpl.java:238) */
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(WriteableCommandLineImpl.java:236) */
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(WriteableCommandLineImpl.java:240) */
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
        prefixes.add(character);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "prefixes", prefixes);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption] produces [java.lang.NullPointerException]
            java.base/java.lang.String.startsWith(String.java:2261)
            java.base/java.lang.String.startsWith(String.java:2304)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(WriteableCommandLineImpl.java:240) */
        writeableCommandLineImpl.looksLikeOption(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): True}
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
 *  */
    @Test
    public void testSetDefaultSwitch_DefaultSwitchNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        Boolean boolean1 = false;
        
        writeableCommandLineImpl.setDefaultSwitch(null, boolean1);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): True}
 *  */
    @Test
    public void testSetDefaultSwitch_DefaultSwitchEqualsNull_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class booleanType = Class.forName("java.lang.Boolean");
        Method setDefaultSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultSwitch", sourceDestArgumentType, booleanType);
        setDefaultSwitchMethod.setAccessible(true);
        java.lang.Object[] setDefaultSwitchMethodArguments = new java.lang.Object[2];
        setDefaultSwitchMethodArguments[0] = sourceDestArgument;
        setDefaultSwitchMethodArguments[1] = ((Object) null);
        setDefaultSwitchMethod.invoke(writeableCommandLineImpl, setDefaultSwitchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): False}
 *  */
    @Test
    public void testSetDefaultSwitch_DefaultSwitchNotEqualsNull_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        Boolean boolean1 = false;
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method setDefaultSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultSwitch", sourceDestArgumentType, boolean1Type);
        setDefaultSwitchMethod.setAccessible(true);
        java.lang.Object[] setDefaultSwitchMethodArguments = new java.lang.Object[2];
        setDefaultSwitchMethodArguments[0] = sourceDestArgument;
        setDefaultSwitchMethodArguments[1] = boolean1;
        setDefaultSwitchMethod.invoke(writeableCommandLineImpl, setDefaultSwitchMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): True}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultSwitches.remove(option);
 *  */
    @Test
    public void testSetDefaultSwitch_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:289) */
        writeableCommandLineImpl.setDefaultSwitch(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#setDefaultSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (defaultSwitch == null): False}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultSwitches.put(option, defaultSwitch);
 *  */
    @Test
    public void testSetDefaultSwitch_ThrowNullPointerException_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:291) */
        writeableCommandLineImpl.setDefaultSwitch(null, boolean1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    @Test
    public void testSetDefaultSwitch1() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(integer, object);
        defaultSwitches.put(null, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.remove(HashMap.java:797)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:289) */
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
    public void testSetDefaultSwitch2() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(integer, object);
        Character character = '\u0000';
        defaultSwitches.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        GroupImpl groupImpl = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:291) */
        writeableCommandLineImpl.setDefaultSwitch(groupImpl, boolean1);
    }
    
    @Test
    public void testSetDefaultSwitch3() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(character, object);
        Integer integer = 0;
        defaultSwitches.put(integer, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        Switch switch1 = ((Switch) createInstance("org.apache.commons.cli2.option.Switch"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:291) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class switch1Type = Class.forName("org.apache.commons.cli2.Option");
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method setDefaultSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultSwitch", switch1Type, boolean1Type);
        setDefaultSwitchMethod.setAccessible(true);
        java.lang.Object[] setDefaultSwitchMethodArguments = new java.lang.Object[2];
        setDefaultSwitchMethodArguments[0] = switch1;
        setDefaultSwitchMethodArguments[1] = boolean1;
        try {
            setDefaultSwitchMethod.invoke(writeableCommandLineImpl, setDefaultSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetDefaultSwitch4() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(character, object);
        Object object1 = createInstance("java.lang.Object");
        defaultSwitches.put(null, object1);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        PropertyOption propertyOption = ((PropertyOption) createInstance("org.apache.commons.cli2.option.PropertyOption"));
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:291) */
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
    public void testSetDefaultSwitch5() throws Throwable  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap defaultSwitches = new LinkedHashMap();
        Character character = '\u0001';
        Object object = createInstance("java.lang.Object");
        defaultSwitches.put(character, object);
        Character character1 = '\u0000';
        defaultSwitches.put(character1, null);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", defaultSwitches);
        DefaultOption defaultOption = ((DefaultOption) createInstance("org.apache.commons.cli2.option.DefaultOption"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.remove(HashMap.java:797)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(WriteableCommandLineImpl.java:289) */
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class defaultOptionType = Class.forName("org.apache.commons.cli2.Option");
        Class booleanType = Class.forName("java.lang.Boolean");
        Method setDefaultSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("setDefaultSwitch", defaultOptionType, booleanType);
        setDefaultSwitchMethod.setAccessible(true);
        java.lang.Object[] setDefaultSwitchMethodArguments = new java.lang.Object[2];
        setDefaultSwitchMethodArguments[0] = defaultOption;
        setDefaultSwitchMethodArguments[1] = ((Object) null);
        try {
            setDefaultSwitchMethod.invoke(writeableCommandLineImpl, setDefaultSwitchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.returnsFrom {@code return bool;}
 *  */
    @Test
    public void testGetSwitch_BoolNotEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        Boolean boolean1 = false;
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method getSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("getSwitch", sourceDestArgumentType, boolean1Type);
        getSwitchMethod.setAccessible(true);
        java.lang.Object[] getSwitchMethodArguments = new java.lang.Object[2];
        getSwitchMethodArguments[0] = sourceDestArgument;
        getSwitchMethodArguments[1] = boolean1;
        Boolean actual = ((Boolean) getSwitchMethod.invoke(writeableCommandLineImpl, getSwitchMethodArguments));
        
        assertEquals(boolean1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return bool;}
 *  */
    @Test
    public void testGetSwitch_BoolEqualsNull() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "defaultSwitches", switches);
        
        Boolean actual = writeableCommandLineImpl.getSwitch(((Option) null), ((Boolean) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): True}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.returnsFrom {@code return bool;}
 *  */
    @Test
    public void testGetSwitch_BoolNotEqualsNull_1() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        LinkedHashMap switches = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        switches.put(character, object);
        setField(writeableCommandLineImpl, "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "switches", switches);
        SourceDestArgument sourceDestArgument = ((SourceDestArgument) createInstance("org.apache.commons.cli2.option.SourceDestArgument"));
        Boolean boolean1 = false;
        
        Class writeableCommandLineImplClazz = Class.forName("org.apache.commons.cli2.commandline.WriteableCommandLineImpl");
        Class sourceDestArgumentType = Class.forName("org.apache.commons.cli2.Option");
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method getSwitchMethod = writeableCommandLineImplClazz.getDeclaredMethod("getSwitch", sourceDestArgumentType, boolean1Type);
        getSwitchMethod.setAccessible(true);
        java.lang.Object[] getSwitchMethodArguments = new java.lang.Object[2];
        getSwitchMethodArguments[0] = sourceDestArgument;
        getSwitchMethodArguments[1] = boolean1;
        Boolean actual = ((Boolean) getSwitchMethod.invoke(writeableCommandLineImpl, getSwitchMethodArguments));
        
        assertEquals(boolean1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.executesCondition {@code (bool == null): False}
 * @utbot.returnsFrom {@code return bool;}
 *  */
    @Test
    public void testGetSwitch_BoolNotEqualsNull_2() throws Exception  {
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:165) */
        writeableCommandLineImpl.getSwitch(((Option) null), ((Boolean) null));
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#getSwitch(org.apache.commons.cli2.Option,java.lang.Boolean)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Boolean bool = (Boolean) switches.get(option);
 *  */
    @Test
    public void testGetSwitch_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:165) */
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:174) */
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
    public void testGetSwitch_ThrowNullPointerException_2() throws Exception  {
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
            org.apache.commons.cli2.option.OptionImpl.hashCode(OptionImpl.java:107)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(WriteableCommandLineImpl.java:165) */
        writeableCommandLineImpl.getSwitch(groupImpl, boolean1);
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptionTriggers(WriteableCommandLineImpl.java:274) */
        writeableCommandLineImpl.getOptionTriggers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addOption(org.apache.commons.cli2.Option)
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addOption(org.apache.commons.cli2.Option)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: options.add(option);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException() throws Exception  {
        WriteableCommandLineImpl writeableCommandLineImpl = ((WriteableCommandLineImpl) createInstance("org.apache.commons.cli2.commandline.WriteableCommandLineImpl"));
        
        /* This test fails because method [org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:68) */
        writeableCommandLineImpl.addOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link WriteableCommandLineImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.commandline.WriteableCommandLineImpl#addOption(org.apache.commons.cli2.Option)}
 * @utbot.invokes {@link org.apache.commons.cli2.Option#getPreferredName()}
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:69) */
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:69) */
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(WriteableCommandLineImpl.java:69) */
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
        GroupImpl groupImpl = new GroupImpl(list, "#$\\\"'", "-3", -1, Integer.MAX_VALUE, true);
        groupImpl.setParent(null);
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        linkedList.add(object);
        Object object1 = new Object();
        linkedList.add(object1);
        WriteableCommandLineImpl writeableCommandLineImpl = new WriteableCommandLineImpl(groupImpl, linkedList);
        List list1 = emptyList();
        GroupImpl groupImpl1 = new GroupImpl(list1, "", "", Integer.MAX_VALUE, 256, false);
        LinkedList linkedList1 = new LinkedList();
        ArgumentImpl argumentImpl = new ArgumentImpl("\n\t\r", "10", -1, Integer.MAX_VALUE, '', '@', null, "", linkedList1, Integer.MAX_VALUE);
        argumentImpl.setParent(null);
        groupImpl1.setParent(argumentImpl);
        
        writeableCommandLineImpl.addOption(groupImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue
    
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue(WriteableCommandLineImpl.java:89) */
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
            org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue(WriteableCommandLineImpl.java:89) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields850708778906400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields850708778906400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass850708778911500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields850708778906400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass850708778911500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

