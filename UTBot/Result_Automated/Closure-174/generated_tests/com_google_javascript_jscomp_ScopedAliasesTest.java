package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

public final class com_google_javascript_jscomp_ScopedAliasesTest {
    ///region Test suites for executable com.google.javascript.jscomp.ScopedAliases.process
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        ScopedAliases scopedAliases = ((ScopedAliases) createInstance("com.google.javascript.jscomp.ScopedAliases"));
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:133)
            com.google.javascript.jscomp.ScopedAliases.process(ScopedAliases.java:127) */
        scopedAliases.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ScopedAliases.hotSwapScript
    
    ///region OTHER: ERROR SUITE for method hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testHotSwapScript1() throws Exception  {
        ScopedAliases scopedAliases = ((ScopedAliases) createInstance("com.google.javascript.jscomp.ScopedAliases"));
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:133) */
        scopedAliases.hotSwapScript(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

