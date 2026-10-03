package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenStreamTest {

    // --- Tests for isKeyword ---

    @Test(expected = NullPointerException.class)
    public void testIsKeyword_Null() {
        TokenStream.isKeyword(null);
    }

    @Test
    public void testIsKeyword_InvalidLength() {
        assertFalse(TokenStream.isKeyword(""));
        assertFalse(TokenStream.isKeyword("a"));
        assertFalse(TokenStream.isKeyword("toolongkeyword"));
    }

    @Test
    public void testIsKeyword_Length2() {
        // 'if', 'in', 'do' -> true
        assertTrue(TokenStream.isKeyword("if"));
        assertTrue(TokenStream.isKeyword("in"));
        assertTrue(TokenStream.isKeyword("do"));
        // false branches
        assertFalse(TokenStream.isKeyword("io"));
        assertFalse(TokenStream.isKeyword("ix"));
        assertFalse(TokenStream.isKeyword("xx"));
    }

    @Test
    public void testIsKeyword_Length3() {
        // 'for', 'int', 'new', 'try', 'var' -> true
        assertTrue(TokenStream.isKeyword("for"));
        assertTrue(TokenStream.isKeyword("int"));
        assertTrue(TokenStream.isKeyword("new"));
        assertTrue(TokenStream.isKeyword("try"));
        assertTrue(TokenStream.isKeyword("var"));
        // false branches
        assertFalse(TokenStream.isKeyword("fax"));
        assertFalse(TokenStream.isKeyword("imm"));
        assertFalse(TokenStream.isKeyword("not"));
        assertFalse(TokenStream.isKeyword("tox"));
        assertFalse(TokenStream.isKeyword("vax"));
        assertFalse(TokenStream.isKeyword("foo"));
    }

    @Test
    public void testIsKeyword_Length4() {
        // 'byte', 'case', 'char', 'else', 'enum', 'goto', 'long', 'null', 'test', 'this', 'void', 'with' -> true
        assertTrue(TokenStream.isKeyword("byte"));
        assertTrue(TokenStream.isKeyword("case"));
        assertTrue(TokenStream.isKeyword("char"));
        assertTrue(TokenStream.isKeyword("else"));
        assertTrue(TokenStream.isKeyword("enum"));
        assertTrue(TokenStream.isKeyword("goto"));
        assertTrue(TokenStream.isKeyword("long"));
        assertTrue(TokenStream.isKeyword("null"));
        assertTrue(TokenStream.isKeyword("test"));
        assertTrue(TokenStream.isKeyword("this"));
        assertTrue(TokenStream.isKeyword("void"));
        assertTrue(TokenStream.isKeyword("with"));
        // false branches
        assertFalse(TokenStream.isKeyword("bxyz"));
        assertFalse(TokenStream.isKeyword("caxz"));
        assertFalse(TokenStream.isKeyword("caxr"));
        assertFalse(TokenStream.isKeyword("elxx"));
        assertFalse(TokenStream.isKeyword("enxx"));
        assertFalse(TokenStream.isKeyword("gxxx"));
        assertFalse(TokenStream.isKeyword("lxxx"));
        assertFalse(TokenStream.isKeyword("nxxx"));
        assertFalse(TokenStream.isKeyword("texx"));
        assertFalse(TokenStream.isKeyword("tsxz"));
        assertFalse(TokenStream.isKeyword("vxxx"));
        assertFalse(TokenStream.isKeyword("wxxx"));
    }

    @Test
    public void testIsKeyword_Length5() {
        // 'class', 'break', 'while', 'false', 'const', 'final', 'float', 'short', 'super', 'throw', 'catch' -> true
        assertTrue(TokenStream.isKeyword("class"));
        assertTrue(TokenStream.isKeyword("break"));
        assertTrue(TokenStream.isKeyword("while"));
        assertTrue(TokenStream.isKeyword("false"));
        assertTrue(TokenStream.isKeyword("const"));
        assertTrue(TokenStream.isKeyword("final"));
        assertTrue(TokenStream.isKeyword("float"));
        assertTrue(TokenStream.isKeyword("short"));
        assertTrue(TokenStream.isKeyword("super"));
        assertTrue(TokenStream.isKeyword("throw"));
        assertTrue(TokenStream.isKeyword("catch"));
        // false branches
        assertFalse(TokenStream.isKeyword("cxxxx"));
        assertFalse(TokenStream.isKeyword("bxُوا"));
        assertFalse(TokenStream.isKeyword("co.st"));
        assertFalse(TokenStream.isKeyword("fa.al"));
        assertFalse(TokenStream.isKeyword("fl.at"));
        assertFalse(TokenStream.isKeyword("sh.rt"));
    }

    @Test
    public void testIsKeyword_Length6() {
        // 'native', 'delete', 'return', 'throws', 'import', 'double', 'static', 'public', 'switch', 'export', 'typeof' -> true
        assertTrue(TokenStream.isKeyword("native"));
        assertTrue(TokenStream.isKeyword("delete"));
        assertTrue(TokenStream.isKeyword("return"));
        assertTrue(TokenStream.isKeyword("throws"));
        assertTrue(TokenStream.isKeyword("import"));
        assertTrue(TokenStream.isKeyword("double"));
        assertTrue(TokenStream.isKeyword("static"));
        assertTrue(TokenStream.isKeyword("public"));
        assertTrue(TokenStream.isKeyword("switch"));
        assertTrue(TokenStream.isKeyword("export"));
        assertTrue(TokenStream.isKeyword("typeof"));
        // false branches
        assertFalse(TokenStream.isKeyword("nxxxxx"));
        assertFalse(TokenStream.isKeyword("dxxxxx"));
        assertFalse(TokenStream.isKeyword("oxxxxxx"));
    }

    @Test
    public void testIsKeyword_Length7() {
        // 'package', 'default', 'finally', 'boolean', 'private', 'extends' -> true
        assertTrue(TokenStream.isKeyword("package"));
        assertTrue(TokenStream.isKeyword("default"));
        assertTrue(TokenStream.isKeyword("finally"));
        assertTrue(TokenStream.isKeyword("boolean"));
        assertTrue(TokenStream.isKeyword("private"));
        assertTrue(TokenStream.isKeyword("extends"));
        // false branches
        assertFalse(TokenStream.isKeyword("pxxxxxx"));
        assertFalse(TokenStream.isKeyword("dxxxxxxx"));
    }

    @Test
    public void testIsKeyword_Length8() {
        // 'abstract', 'continue', 'debugger', 'function', 'volatile' -> true
        assertTrue(TokenStream.isKeyword("abstract"));
        assertTrue(TokenStream.isKeyword("continue"));
        assertTrue(TokenStream.isKeyword("debugger"));
        assertTrue(TokenStream.isKeyword("function"));
        assertTrue(TokenStream.isKeyword("volatile"));
        // false branches
        assertFalse(TokenStream.isKeyword("axxxxxxx"));
    }

    @Test
    public void testIsKeyword_Length9() {
        // 'interface', 'protected', 'transient' -> true
        assertTrue(TokenStream.isKeyword("interface"));
        assertTrue(TokenStream.isKeyword("protected"));
        assertTrue(TokenStream.isKeyword("transient"));
        // false branches
        assertFalse(TokenStream.isKeyword("ixxxxxxxx"));
        assertFalse(TokenStream.isKeyword("pxxxxxxxx"));
        assertFalse(TokenStream.isKeyword("txxxxxxxx"));
    }

    @Test
    public void testIsKeyword_Length10() {
        // 'implements', 'instanceof' -> true
        assertTrue(TokenStream.isKeyword("implements"));
        assertTrue(TokenStream.isKeyword("instanceof"));
        // false branches
        assertFalse(TokenStream.isKeyword("ixxxxxxxxxx"));
        assertFalse(TokenStream.isKeyword("nxxxxxxxxxx"));
    }

    @Test
    public void testIsKeyword_Length12() {
        // 'synchronized' -> true
        assertTrue(TokenStream.isKeyword("synchronized"));
        // false branches
        assertFalse(TokenStream.isKeyword("sxxxxxxxxxxxx"));
    }

    // --- Tests for isJSIdentifier ---

    @Test(expected = NullPointerException.class)
    public void testIsJSIdentifier_Null() {
        TokenStream.isJSIdentifier(null);
    }

    @Test
    public void testIsJSIdentifier_Empty() {
        assertFalse(TokenStream.isJSIdentifier(""));
    }

    @Test
    public void testIsJSIdentifier_InvalidStart() {
        // Starts with a digit
        assertFalse(TokenStream.isJSIdentifier("123var"));
        // Starts with a symbol
        assertFalse(TokenStream.isJSIdentifier("$var")); // Depending on Java identifier start, $ is valid, let's use invalid like '-'
        assertFalse(TokenStream.isJSIdentifier("-var"));
    }

    @Test
    public void testIsJSIdentifier_InvalidPart() {
        // Valid start, but contains invalid character in the middle/end
        assertFalse(TokenStream.isJSIdentifier("my-var"));
        assertFalse(TokenStream.isJSIdentifier("var.name"));
    }

    @Test
    public void testIsJSIdentifier_Valid() {
        assertTrue(TokenStream.isJSIdentifier("myVar"));
        assertTrue(TokenStream.isJSIdentifier("_hidden"));
        assertTrue(TokenStream.isJSIdentifier("$special"));
        assertTrue(TokenStream.isJSIdentifier("variable123"));
    }
}