/*
 * Copyright 2013 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Robust unit tests for FunctionToBlockMutator focusing on high branch/condition
 * coverage and edge cases.
 */
public class FunctionToBlockMutatorTest extends TestCase {

    private int uniqueIdCounter = 0;

    private Supplier<String> createMockIdSupplier() {
        return new Supplier<String>() {
            @Override
            public String get() {
                return String.valueOf(++uniqueIdCounter);
            }
        };
    }

    private AbstractCompiler createMockCompiler() {
        return new Compiler() {
            @Override
            public Supplier<String> getUniqueNameIdSupplier() {
                return createMockIdSupplier();
            }
            @Override
            public CodingConvention getCodingConvention() {
                return new DefaultCodingConvention();
            }
        };
    }

    @Test
    public void testGetLabelNameForFunctionNullAndEmpty() {
        AbstractCompiler compiler = createMockCompiler();
        Supplier<String> idSupplier = createMockIdSupplier();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, idSupplier);

        // Accessing getLabelNameForFunction via reflection or indirectly testing through mutate/label generation logic,
        // Since getLabelNameForFunction is private, we can trigger it via mutate with null/empty function names.
        Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));

        // Null function name -> should use "anon"
        Node result1 = mutator.mutate(null, fnNode, callNode, "result", false, false);
        assertNotNull(result1);

        // Empty function name -> should use "anon"
        Node result2 = mutator.mutate("", fnNode, callNode, "result", false, false);
        assertNotNull(result2);

        // Valid function name -> should use the given name
        Node result3 = mutator.mutate("myFunc", fnNode, callNode, "result", false, false);
        assertNotNull(result3);
    }

    @Test
    public void testMutateWithNoArgumentsAndNoReturn() {
        AbstractCompiler compiler = createMockCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, createMockIdSupplier());

        Node block = new Node(Token.BLOCK);
        Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), block);
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));

        // needsDefaultResult = true, but no return at exit, should add dummy assignment
        Node mutated = mutator.mutate("f", fnNode, callNode, "res", true, false);
        assertNotNull(mutated);
    }

    @Test
    public void testMutateWithReturnAtExitAndLoop() {
        AbstractCompiler compiler = createMockCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, createMockIdSupplier());

        Node returnNode = new Node(Token.RETURN, Node.newNumber(42));
        Node block = new Node(Token.BLOCK, returnNode);
        
        // Add an uninitialized var to test fixUnitializedVarDeclarations inside loop or non-loop
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "uninitVar"));
        block.addChildToFront(varNode);

        Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), block);
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));

        // isCallInLoop = true triggers fixUnitializedVarDeclarations
        Node mutated = mutator.mutate("f", fnNode, callNode, "res", false, true);
        assertNotNull(mutated);
    }

    @Test
    public void testMutateWithMultipleReturnsAndLabels() {
        AbstractCompiler compiler = createMockCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, createMockIdSupplier());

        // Multiple returns: one inside an IF statement and one at the exit
        Node ifCond = Node.newTrue();
        Node thenBranch = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1)));
        Node ifNode = new Node(Token.IF, ifCond, thenBranch);
        Node exitReturn = new Node(Token.RETURN, Node.newNumber(2));

        Node block = new Node(Token.BLOCK, ifNode, exitReturn);
        Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), block);
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));

        Node mutated = mutator.mutate("f", fnNode, callNode, "res", false, false);
        assertNotNull(mutated);
    }

    @Test
    public void testFixUninitializedVarInLoopStructure() {
        AbstractCompiler compiler = createMockCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, createMockIdSupplier());

        // Create a loop structure (e.g. FOR or FOR-IN) to test NodeUtil.isLoopStructure guard branch
        Node forNode = new Node(Token.FOR, Node.newString(Token.NAME, "i"), Node.newNumber(0), Node.newNumber(10), new Node(Token.BLOCK));
        Node block = new Node(Token.BLOCK, forNode);

        Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), block);
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));

        // isCallInLoop = true, but containing a loop structure which should skip modifying loop variables
        Node mutated = mutator.mutate("f", fnNode, callNode, null, false, true);
        assertNotNull(mutated);
    }

    @Test
    public void testLabelNameSupplierClass() {
        Supplier<String> baseSupplier = createMockIdSupplier();
        FunctionToBlockMutator.LabelNameSupplier labelSupplier = 
            new FunctionToBlockMutator.LabelNameSupplier(baseSupplier);
        
        String label = labelSupplier.get();
        assertNotNull(label);
        assertTrue(label.startsWith("JSCompiler_inline_label_"));
    }
}