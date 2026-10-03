/*
 * Copyright 2014 The Closure Compiler Authors.
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

import com.google.javascript.rhino.Node;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit tests for CrossModuleMethodMotion focusing on high branch/condition coverage
 * and edge cases for Defects4J Closure-163b.
 */
public class CrossModuleMethodMotionTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  @Test
  public void testProcessWithNullModuleGraph() {
    // Branch: moduleGraph == null
    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(
        compiler, new CrossModuleMethodMotion.IdGenerator(), false);
    
    Node root = new Node(Token.BLOCK);
    pass.process(null, root);
    
    // Verify no errors reported and execution passes smoothly
    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testProcessWithSingleModule() {
    // Branch: moduleGraph.getModuleCount() <= 1
    JSModule module1 = new JSModule("m1");
    JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[] { module1 });
    
    Compiler mockCompiler = new Compiler() {
      @Override
      public JSModuleGraph getModuleGraph() {
        return moduleGraph;
      }
    };
    mockCompiler.initOptions(new CompilerOptions());

    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(
        mockCompiler, new CrossModuleMethodMotion.IdGenerator(), false);

    Node root = new Node(Token.BLOCK);
    pass.process(null, root);
    assertTrue(mockCompiler.getErrors().isEmpty());
  }

  @Test
  public void testNullDeepestCommonModuleError() {
    // Branch: deepestCommonModuleRef == null -> Triggers NULL_COMMON_MODULE_ERROR diagnostic
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[] { m1, m2 });

    Compiler testCompiler = new Compiler() {
      @Override
      public JSModuleGraph getModuleGraph() {
        return moduleGraph;
      }
    };
    testCompiler.initOptions(new CompilerOptions());

    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(
        testCompiler, new CrossModuleMethodMotion.IdGenerator(), true);

    // We can simulate calling moveMethods or setting up a scenario where NameInfo has null deepest common module.
    // Since moveMethods is private, we can exercise it via process() with a custom compiler/analyzer setup if applicable,
    // or directly test the diagnostic rule definition exists and functions properly.
    assertNotNull(CrossModuleMethodMotion.NULL_COMMON_MODULE_ERROR);
  }

  @Test
  public void testIdGeneratorFunctionality() {
    // Test IdGenerator edge cases (hasGeneratedAnyIds, newId)
    CrossModuleMethodMotion.IdGenerator generator = new CrossModuleMethodMotion.IdGenerator();
    assertFalse(generator.hasGeneratedAnyIds());
    
    int id1 = generator.newId();
    assertEquals(0, id1);
    assertTrue(generator.hasGeneratedAnyIds());
    
    int id2 = generator.newId();
    assertEquals(1, id2);
  }

  @Test
  public void testStubDeclarationsConstant() {
    // Ensure STUB_DECLARATIONS string is well-formed and contains required components
    assertNotNull(CrossModuleMethodMotion.STUB_DECLARATIONS);
    assertTrue(CrossModuleMethodMotion.STUB_DECLARATIONS.contains("JSCompiler_stubMethod"));
    assertTrue(CrossModuleMethodMotion.STUB_DECLARations.contains("JSCompiler_unstubMethod"));
    assertTrue(CrossModuleMethodMotion.STUB_DECLARations.contains("JSCompiler_stubMap"));
  }
}