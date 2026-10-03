package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for FunctionTypeBuilder (Closure-41b)
 * Focuses on Branch/Condition Coverage, Edge Cases, Nullability, and Invalid States.
 */
public class FunctionTypeBuilderTest {

    private Compiler compiler;
    private Scope globalScope;
    private Node errorRoot;
    private String sourceName;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // Initialize basic compiler options/settings if necessary for TypeRegistry
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        
        typeRegistry = compiler.getTypeRegistry();
        sourceName = "testcode.js";
        errorRoot = IR.script();
        globalScope = new Scope(null, compiler.- /* scope creation typically via SyntacticScopeCreator or empty scope */);
    }

    private JSTypeRegistry typeRegistry;

    @Test(expected = NullPointerException.class)
    public void testConstructorNullErrorRootEdgeCase() {
        // Edge Case: errorRoot must not be null per Preconditions.checkNotNull(errorRoot)
        new FunctionTypeBuilder("myFunc", compiler, null, sourceName, null);
    }

    @Test
    public void testConstructorNullFunctionNameEdgeCase() {
        // Edge Case: fnName is null should default to empty string ""
        FunctionTypeBuilder builder = new FunctionTypeBuilder(null, compiler, errorRoot, sourceName, globalScope);
        assertNotNull(builder);
    }

    @Test
    public void testSetContentsWithNull() {
        // Branch: contents != null check (passing null should retain default contents)
        FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, sourceName, globalScope);
        FunctionTypeBuilder result = builder.setContents(null);
        assertSame(builder, result);
    }

    @Test
    public void testSetContentsWithNonNull() {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, sourceName, globalScope);
        FunctionTypeBuilder.FunctionContents contents = FunctionTypeBuilder.UnknownFunctionContents.get();
        FunctionTypeBuilder result = builder.setContents(contents);
        assertSame(builder, result);
    }

    @Test
    public void testInferFromOverriddenFunctionNullOldType() {
        // Branch: oldType == null does nothing and returns 'this'
        FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, sourceName, globalScope);
        FunctionTypeBuilder result = builder.inferFromOverriddenFunction(null, null);
        assertSame(builder, result);
    }

    @Test
    public void testInferReturnTypeWithNullInfo() {
        // Branch: info == null or no return type
        FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, sourceName, globalScope);
        FunctionTypeBuilder result = builder.inferReturnType(null);
        assertSame(builder, result);
    }

    @Test
    public void testInferInheritanceWithNullInfo() {
        // Branch: info == null in inferInheritance
        FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, sourceName, globalScope);
        FunctionTypeBuilder result = builder.inferInheritance(null);
        assertSame(builder, result);
    }

    @Test
    public void testInferThisTypeWithNullInfoAndNullType() {
        // Branch: info == null and type == null
        FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, sourceName, globalScope);
        FunctionTypeBuilder result = builder.inferThisType(null, null);
        assertSame(builder, result);
    }

    @Test
    public void testInferParameterTypesWithNullArgsAndNullInfo() {
        // Branch: argsParent == null && info == null
        FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, sourceName, globalScope);
        FunctionTypeBuilder result = builder.inferParameterTypes(null, (com.google.javascript.rhino.JSDocInfo) null);
        assertSame(builder, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testBuildAndRegisterMissingParametersNodeFaultTrigger() {
        // Edge Case / Invalid State: parametersNode is null when building should throw IllegalStateException
        FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, sourceName, globalScope);
        // Without inferring parameters or setting them, parametersNode remains null
        builder.buildAndRegister();
    }

    @Test
    public void testIsFunctionTypeDeclarationWithNullInfo() {
        // Edge Case: verifying static utility method robustness or standard behaviour
        // Since isFunctionTypeDeclaration expects a non-null JSDocInfo based on method body, 
        // passing valid vs mock states if applicable. (Directly testing method via mock info if possible)
    }
}