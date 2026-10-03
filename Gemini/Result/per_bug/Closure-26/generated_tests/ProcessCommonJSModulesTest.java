package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 Test Suite for ProcessCommonJSModules (Closure-26b)
 */
public class ProcessCommonJSModulesTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // Setup basic compiler options/environment if necessary
    }

    @Test
    public void testToModuleNameBasic() {
        String filename = "." + File.separator + "my-module.js";
        String moduleName = ProcessCommonJSModules.toModuleName(filename);
        assertEquals("module$my_module", moduleName);
    }

    @Test
    public void testToModuleNameWithSubdirectoryAndSeparator() {
        String filename = "dir" + File.separator + "sub" + File.separator + "file.js";
        String moduleName = ProcessCommonJSModules.toModuleName(filename);
        assertEquals("module$dir$sub$file", moduleName);
    }

    @Test
    public void testToModuleNameRelativeAddressingCurrentDir() {
        String required = "." + File.separator + "utils.js";
        String current = "dir" + File.separator + "main.js";
        String moduleName = ProcessCommonJSModules.toModuleName(required, current);
        assertEquals("module$dir$utils", moduleName);
    }

    @Test
    public void testToModuleNameRelativeAddressingParentDir() {
        String required = ".." + File.separator + "common" + File.separator + "base.js";
        String current = "dir" + File.separator + "sub" + File.separator + "main.js";
        String moduleName = ProcessCommonJSModules.toModuleName(required, current);
        assertEquals("module$dir$common$base", moduleName);
    }

    @Test(expected = RuntimeException.class)
    public void testToModuleNameInvalidUriSyntax() {
        // Triggers URISyntaxException via malformed URI strings
        ProcessCommonJSModules.toModuleName("http://[invalid-uri", "file.js");
    }

    @Test
    public void testConstructorPrefixHandlingWithoutSeparator() {
        // Tests branch where filenamePrefix does not end with File.separator
        ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, "prefix", false);
        assertNotNull(pass);
    }

    @Test
    public void testConstructorPrefixHandlingWithSeparator() {
        // Tests branch where filenamePrefix ends with File.separator
        ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, "prefix" + File.separator, true);
        assertNotNull(pass);
    }

    @Test
    public void testProcessPassExecutionWithoutReportDependencies() {
        ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, ".", false);
        Node root = new Node(Token.SCRIPT);
        pass.process(null, root);
        assertNull(pass.getModule());
    }

    @Test
    public void testProcessPassExecutionWithReportDependencies() {
        ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, ".", true);
        Node root = new Node(Token.SCRIPT);
        CompilerInput input = new CompilerInput(new JSSourceFile("test.js", ""));
        root.setInputId(input.getInputId());
        
        // Mocking basic traversal setup
        compiler.init(null, new Node(Token.BLOCK), null);
        
        pass.process(null, root);
        assertNotNull(pass.getModule());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultipleScriptNodesThrowsPreconditionException() {
        ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, ".", false);
        Node root = new Node(Token.BLOCK);
        Node script1 = new Node(Token.SCRIPT);
        Node script2 = new Node(Token.SCRIPT);
        root.addChildToBack(script1);
        root.addChildToBack(script2);

        compiler.init(null, root, null);
        pass.process(null, root);
    }

    @Test
    public void testGuessCJSModuleName() {
        ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, "src" + File.separator, false);
        String guessed = pass.guessCJSModuleName("src" + File.separator + "index.js");
        assertEquals("module$index", guessed);
    }
}