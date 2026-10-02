package org.jsoup.nodes;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public final class org_jsoup_nodes_EntitiesTest {
    ///region Test suites for executable org.jsoup.nodes.Entities.escape
    
    ///region Errors report for escape
    
    public void testEscape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 86 occurrences of:
        // Concrete execution failed
        
        // 14 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.escape
    
    ///region Errors report for escape
    
    public void testEscape_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 23 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.unescape
    
    ///region Errors report for unescape
    
    public void testUnescape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.unescape
    
    ///region Errors report for unescape
    
    public void testUnescape_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.isNamedEntity
    
    ///region Errors report for isNamedEntity
    
    public void testIsNamedEntity_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.getCharacterByName
    
    ///region Errors report for getCharacterByName
    
    public void testGetCharacterByName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.toCharacterKey
    
    ///region OTHER: ERROR SUITE for method toCharacterKey(java.util.Map)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey1() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string, character);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey2() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string, character);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey3() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string, character);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey4() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string, character);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey5() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string, character);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey6() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        Character character = '\u0000';
        linkedHashMap.put(string, character);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey7() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string, null);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey8() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string, null);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey9() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000";
        linkedHashMap.put(string, null);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey10() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string, null);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToCharacterKey11() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string, null);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Character character = '\u0000';
        linkedHashMap.put(string1, character);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method toCharacterKeyMethod = entitiesClazz.getDeclaredMethod("toCharacterKey", linkedHashMapType);
        toCharacterKeyMethod.setAccessible(true);
        java.lang.Object[] toCharacterKeyMethodArguments = new java.lang.Object[1];
        toCharacterKeyMethodArguments[0] = linkedHashMap;
        try {
            toCharacterKeyMethod.invoke(null, toCharacterKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for toCharacterKey
    
    public void testToCharacterKey_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 4 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.loadEntities
    
    ///region OTHER: ERROR SUITE for method loadEntities(java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities1() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities2() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities3() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities4() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities5() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities6() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities7() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities8() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities9() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities10() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities11() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for loadEntities
    
    public void testLoadEntities_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
        // 7 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
    }
    ///endregion
    
    ///endregion
}

