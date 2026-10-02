package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.CodeGenerator.Context;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.FunctionNode;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import com.google.javascript.rhino.jstype.JSType;
import java.io.IOException;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.io.PrintWriter;
import sun.nio.cs.SingleByte.Encoder;
import sun.nio.cs.SingleByte;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_jscomp_CodeGeneratorTest {
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#add(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#continueProcessing()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAdd_CodeConsumerContinueProcessing() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        
        codeGenerator.add(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#add(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = n.getType();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:81) */
        codeGenerator.add(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#add(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = n.getType();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_2() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:81) */
        codeGenerator.add(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#add(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !cc.continueProcessing()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:77) */
        codeGenerator.add(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context)
    
    @Test
    public void testAdd1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(117);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd2() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(64);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd3() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(43);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd4() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(41);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd5() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(42);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd6() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(44);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd7() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(118);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd8() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(116);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd9() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(83);
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        codeGenerator.add(scriptOrFnNode, context);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context)
    
    @Test
    public void testAdd10() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(65);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:81)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:266) */
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd11() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(47);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:249) */
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd12() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(110);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:81)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:600) */
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd13() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(37);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:443) */
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd14() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(108);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:81)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:464) */
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd15() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(30);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:1771)
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:1763)
            com.google.javascript.jscomp.NodeUtil.has(NodeUtil.java:1845)
            com.google.javascript.jscomp.NodeUtil.containsType(NodeUtil.java:1415)
            com.google.javascript.jscomp.NodeUtil.containsType(NodeUtil.java:1422)
            com.google.javascript.jscomp.NodeUtil.containsCall(NodeUtil.java:1185)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:539) */
        codeGenerator.add(node, context);
    }
    
    @Test
    public void testAdd16() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(77);
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:120) */
        codeGenerator.add(scriptOrFnNode, context);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context)
    /// Actual number of generated tests (115) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test(expected = Error.class)
    public void testAdd17() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(107);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd18() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(66);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd19() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(81);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd20() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(68);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd21() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(106);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd22() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(104);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd23() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(71);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testAdd24() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(38);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd25() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(56);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd26() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(121);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd27() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(34);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd28() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(80);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd29() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(53);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd30() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(59);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd31() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(55);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd32() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(115);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd33() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(75);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd34() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(102);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd35() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(35);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd36() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(113);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd37() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(58);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd38() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(73);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd39() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(36);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd40() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(78);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd41() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(31);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd42() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(79);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd43() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(49);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd44() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(60);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd45() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(74);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd46() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(98);
        
        codeGenerator.add(scriptOrFnNode, null);
    }
    
    @Test(expected = Error.class)
    public void testAdd47() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(0);
        CodeGenerator.Context context = CodeGenerator.Context.OTHER;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd48() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(84);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd49() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(119);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd50() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(67);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd51() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(114);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd52() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(33);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd53() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(48);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd54() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(50);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd55() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(120);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd56() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(82);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd57() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(99);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd58() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(40);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd59() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Node node = new Node(39);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        codeGenerator.add(node, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd60() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(57);
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        codeGenerator.add(scriptOrFnNode, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd61() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(112);
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        codeGenerator.add(scriptOrFnNode, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd62() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(61);
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        codeGenerator.add(scriptOrFnNode, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd63() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(70);
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        codeGenerator.add(scriptOrFnNode, context);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd64() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(69);
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        codeGenerator.add(scriptOrFnNode, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd65() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        codeGenerator.add(scriptOrFnNode, context);
    }
    
    @Test(expected = Error.class)
    public void testAdd66() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(72);
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        codeGenerator.add(scriptOrFnNode, context);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method add(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context)
    
    @Test(timeout = 1000L)
    public void testAdd67() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(84);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType, contextType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = stringNode;
        addMethodArguments[1] = ((Object) null);
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#add(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeGenerator#add(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context)}
 *  */
    @Test
    public void testAdd_CodeGeneratorAdd() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        
        codeGenerator.add(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(com.google.javascript.rhino.Node)
    
    @Test
    public void testAdd68() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(41);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcContinueProcessing = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing"));
        
        assertFalse(finalCodeGeneratorCcContinueProcessing);
    }
    
    @Test
    public void testAdd69() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(117);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcContinueProcessing = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing"));
        
        assertFalse(finalCodeGeneratorCcContinueProcessing);
    }
    
    @Test
    public void testAdd70() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(43);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcContinueProcessing = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing"));
        
        assertFalse(finalCodeGeneratorCcContinueProcessing);
    }
    
    @Test
    public void testAdd71() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
    }
    
    @Test
    public void testAdd72() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcContinueProcessing = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing"));
        
        assertFalse(finalCodeGeneratorCcContinueProcessing);
    }
    
    @Test
    public void testAdd73() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(116);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcContinueProcessing = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing"));
        
        assertFalse(finalCodeGeneratorCcContinueProcessing);
    }
    
    @Test
    public void testAdd74() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcContinueProcessing = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing"));
        
        assertFalse(finalCodeGeneratorCcContinueProcessing);
    }
    
    @Test
    public void testAdd75() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(44);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcContinueProcessing = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing"));
        
        assertFalse(finalCodeGeneratorCcContinueProcessing);
    }
    
    @Test
    public void testAdd76() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcContinueProcessing = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing"));
        
        assertFalse(finalCodeGeneratorCcContinueProcessing);
    }
    
    @Test
    public void testAdd77() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(83);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcContinueProcessing = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing"));
        
        assertFalse(finalCodeGeneratorCcContinueProcessing);
    }
    
    @Test
    public void testAdd78() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        addMethod.invoke(codeGenerator, addMethodArguments);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(com.google.javascript.rhino.Node)
    /// Actual number of generated tests (111) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test(expected = IllegalStateException.class)
    public void testAdd79() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(31);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd80() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(48);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd81() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd82() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(103);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd83() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(61);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd84() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(69);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd85() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd86() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd87() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd88() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(53);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd89() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(34);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd90() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(107);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd91() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(74);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd92() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(119);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd93() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(80);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd94() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(54);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd95() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(115);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd96() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(62);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd97() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(99);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd98() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(68);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd99() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(50);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd100() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(55);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd101() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(56);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd102() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd103() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(71);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd104() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(75);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd105() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd106() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(111);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd107() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(84);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd108() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(59);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd109() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(70);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd110() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(81);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd111() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(121);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd112() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(109);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd113() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd114() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(121);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd115() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(109);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd116() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(81);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd117() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(123);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd118() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(80);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd119() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(56);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd120() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(119);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd121() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(74);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd122() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(75);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd123() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(50);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd124() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(53);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd125() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(111);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd126() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(34);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAdd127() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(70);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAdd128() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(com.google.javascript.rhino.Node)
    
    @Test
    public void testAdd129() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.jsString(CodeGenerator.java:815)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:555)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd130() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(65);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:81)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:266)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd131() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:1771)
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:1763)
            com.google.javascript.jscomp.NodeUtil.has(NodeUtil.java:1845)
            com.google.javascript.jscomp.NodeUtil.containsType(NodeUtil.java:1415)
            com.google.javascript.jscomp.NodeUtil.containsType(NodeUtil.java:1422)
            com.google.javascript.jscomp.NodeUtil.containsCall(NodeUtil.java:1185)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:539)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd132() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLatin(NodeUtil.java:1616)
            com.google.javascript.jscomp.CodeGenerator.identifierEscape(CodeGenerator.java:925)
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:69)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:188)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd133() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(47);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:249)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd134() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:474)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd135() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:120)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd136() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(110);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:603)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd137() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "continueProcessing", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:443)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addMethod = codeGeneratorClazz.getDeclaredMethod("add", stringNodeType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = stringNode;
        try {
            addMethod.invoke(codeGenerator, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#add(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#add(java.lang.String)}
 *  */
    @Test
    public void testAdd_CodeConsumerAdd() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "";
        
        codeGenerator.add(string);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#add(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#add(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cc.add(str);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:65) */
        codeGenerator.add(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(java.lang.String)
    
    @Test
    public void testAdd138() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(cc, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "";
        
        codeGenerator.add(string);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        int finalCodeGeneratorCcSize = ((Integer) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        CodeConsumer codeGeneratorCc1 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        char finalCodeGeneratorCcLastChar = ((Character) getFieldValue(codeGeneratorCc1, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        CodeConsumer codeGeneratorCc2 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementNeedsEnded = ((Boolean) getFieldValue(codeGeneratorCc2, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertEquals(1, finalCodeGeneratorCcSize);
        
        assertEquals(';', finalCodeGeneratorCcLastChar);
        
        assertFalse(finalCodeGeneratorCcStatementNeedsEnded);
    }
    
    @Test
    public void testAdd139() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "_";
        
        codeGenerator.add(string);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        char finalCodeGeneratorCcLastChar = ((Character) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        CodeConsumer codeGeneratorCc1 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc1, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals('_', finalCodeGeneratorCcLastChar);
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    
    @Test
    public void testAdd140() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "$";
        
        codeGenerator.add(string);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        char finalCodeGeneratorCcLastChar = ((Character) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        CodeConsumer codeGeneratorCc1 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc1, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals('$', finalCodeGeneratorCcLastChar);
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    
    @Test
    public void testAdd141() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter");
        StringBuilder code = new StringBuilder("");
        setField(cc, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "code", code);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "_";
        
        codeGenerator.add(string);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(java.lang.String)
    
    @Test
    public void testAdd142() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "$";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter.getLastChar(CodePrinter.java:221)
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:219)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:65) */
        codeGenerator.add(string);
    }
    
    @Test
    public void testAdd143() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(cc, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.add] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:168)
            com.google.javascript.jscomp.CodeConsumer.maybeEndStatement(CodeConsumer.java:184)
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:211)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:65) */
        codeGenerator.add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.isOneExactlyFunctionOrDo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOneExactlyFunctionOrDo(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#isOneExactlyFunctionOrDo(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return (n.getType() == Token.FUNCTION || n.getType() == Token.DO);}
 *  */
    @Test
    public void testIsOneExactlyFunctionOrDo_NGetTypeEqualsTokenFUNCTIONOrNGetTypeEqualsTokenDO() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isOneExactlyFunctionOrDoMethod = codeGeneratorClazz.getDeclaredMethod("isOneExactlyFunctionOrDo", scriptOrFnNodeType);
        isOneExactlyFunctionOrDoMethod.setAccessible(true);
        java.lang.Object[] isOneExactlyFunctionOrDoMethodArguments = new java.lang.Object[1];
        isOneExactlyFunctionOrDoMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isOneExactlyFunctionOrDoMethod.invoke(codeGenerator, isOneExactlyFunctionOrDoMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#isOneExactlyFunctionOrDo(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return (n.getType() == Token.FUNCTION || n.getType() == Token.DO);}
 *  */
    @Test
    public void testIsOneExactlyFunctionOrDo_NGetTypeEqualsTokenFUNCTIONOrNGetTypeEqualsTokenDO_1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isOneExactlyFunctionOrDoMethod = codeGeneratorClazz.getDeclaredMethod("isOneExactlyFunctionOrDo", scriptOrFnNodeType);
        isOneExactlyFunctionOrDoMethod.setAccessible(true);
        java.lang.Object[] isOneExactlyFunctionOrDoMethodArguments = new java.lang.Object[1];
        isOneExactlyFunctionOrDoMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isOneExactlyFunctionOrDoMethod.invoke(codeGenerator, isOneExactlyFunctionOrDoMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#isOneExactlyFunctionOrDo(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return (n.getType() == Token.FUNCTION || n.getType() == Token.DO);}
 *  */
    @Test
    public void testIsOneExactlyFunctionOrDo_NGetTypeNotEqualsTokenFUNCTIONOrNGetTypeNotEqualsTokenDO() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isOneExactlyFunctionOrDoMethod = codeGeneratorClazz.getDeclaredMethod("isOneExactlyFunctionOrDo", scriptOrFnNodeType);
        isOneExactlyFunctionOrDoMethod.setAccessible(true);
        java.lang.Object[] isOneExactlyFunctionOrDoMethodArguments = new java.lang.Object[1];
        isOneExactlyFunctionOrDoMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isOneExactlyFunctionOrDoMethod.invoke(codeGenerator, isOneExactlyFunctionOrDoMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isOneExactlyFunctionOrDo(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#isOneExactlyFunctionOrDo(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (n.getType() == Token.FUNCTION || n.getType() == Token.DO);
 *  */
    @Test
    public void testIsOneExactlyFunctionOrDo_ThrowNullPointerException() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.isOneExactlyFunctionOrDo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.isOneExactlyFunctionOrDo(CodeGenerator.java:714) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isOneExactlyFunctionOrDoMethod = codeGeneratorClazz.getDeclaredMethod("isOneExactlyFunctionOrDo", nodeType);
        isOneExactlyFunctionOrDoMethod.setAccessible(true);
        java.lang.Object[] isOneExactlyFunctionOrDoMethodArguments = new java.lang.Object[1];
        isOneExactlyFunctionOrDoMethodArguments[0] = ((Object) null);
        try {
            isOneExactlyFunctionOrDoMethod.invoke(codeGenerator, isOneExactlyFunctionOrDoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.clearContextForNoInOperator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#clearContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.executesCondition {@code (context == Context.IN_FOR_INIT_CLAUSE): True}
 * @utbot.returnsFrom {@code return (context == Context.IN_FOR_INIT_CLAUSE ? Context.OTHER : context);}
 *  */
    @Test
    public void testClearContextForNoInOperator_ContextEqualsContextIN_FOR_INIT_CLAUSE() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method clearContextForNoInOperatorMethod = codeGeneratorClazz.getDeclaredMethod("clearContextForNoInOperator", contextType);
        clearContextForNoInOperatorMethod.setAccessible(true);
        java.lang.Object[] clearContextForNoInOperatorMethodArguments = new java.lang.Object[1];
        clearContextForNoInOperatorMethodArguments[0] = context;
        CodeGenerator.Context actual = ((CodeGenerator.Context) clearContextForNoInOperatorMethod.invoke(codeGenerator, clearContextForNoInOperatorMethodArguments));
        
        CodeGenerator.Context expected = CodeGenerator.Context.OTHER;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#clearContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.executesCondition {@code (context == Context.IN_FOR_INIT_CLAUSE): False}
 * @utbot.returnsFrom {@code return (context == Context.IN_FOR_INIT_CLAUSE ? Context.OTHER : context);}
 *  */
    @Test
    public void testClearContextForNoInOperator_ContextNotEqualsContextIN_FOR_INIT_CLAUSE() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method clearContextForNoInOperatorMethod = codeGeneratorClazz.getDeclaredMethod("clearContextForNoInOperator", contextType);
        clearContextForNoInOperatorMethod.setAccessible(true);
        java.lang.Object[] clearContextForNoInOperatorMethodArguments = new java.lang.Object[1];
        clearContextForNoInOperatorMethodArguments[0] = ((Object) null);
        CodeGenerator.Context actual = ((CodeGenerator.Context) clearContextForNoInOperatorMethod.invoke(codeGenerator, clearContextForNoInOperatorMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeToDoubleQuotedJsString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#escapeToDoubleQuotedJsString(java.lang.String)}
 * @utbot.returnsFrom {@code return strEscape(s, '"', "\\\"", "\'", "\\\\", null);}
 *  */
    @Test
    public void testEscapeToDoubleQuotedJsString_ReturnStrEscape() {
        String string = "";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\"";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#escapeToDoubleQuotedJsString(java.lang.String)}
 * @utbot.returnsFrom {@code return strEscape(s, '"', "\\\"", "\'", "\\\\", null);}
 *  */
    @Test
    public void testEscapeToDoubleQuotedJsString_ReturnStrEscape_1() {
        String string = ">";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\">\"";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#escapeToDoubleQuotedJsString(java.lang.String)}
 * @utbot.returnsFrom {@code return strEscape(s, '"', "\\\"", "\'", "\\\\", null);}
 *  */
    @Test
    public void testEscapeToDoubleQuotedJsString_ReturnStrEscape_2() {
        String string = "\"";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\"\"";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#escapeToDoubleQuotedJsString(java.lang.String)}
 * @utbot.returnsFrom {@code return strEscape(s, '"', "\\\"", "\'", "\\\\", null);}
 *  */
    @Test
    public void testEscapeToDoubleQuotedJsString_ReturnStrEscape_3() {
        String string = "\n";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n\"";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method escapeToDoubleQuotedJsString(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CodeGenerator}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#escapeToDoubleQuotedJsString(java.lang.String)}
     */
    @Test
    public void testEscapeToDoubleQuotedJsStringThrowsNPE() {
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.strEscape(CodeGenerator.java:867)
            com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(CodeGenerator.java:849) */
        CodeGenerator.escapeToDoubleQuotedJsString(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeToDoubleQuotedJsString(java.lang.String)
    /// Actual number of generated tests (55) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testEscapeToDoubleQuotedJsString1() {
        String string = "<\u8000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"<\\u8000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString2() {
        String string = ">\t";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\">\\t\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString3() {
        String string = "\"\r";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\"\\r\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString4() {
        String string = "\r\u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\r\\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString5() {
        String string = "\r\u0080";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\r\\u0080\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString6() {
        String string = ">\u0080";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\">\\u0080\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString7() {
        String string = "> ";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"> \"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString8() {
        String string = ">\u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\">\\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString9() {
        String string = "\" ";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\" \"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString10() {
        String string = "\"\u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\"\\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString11() {
        String string = "\"\u0080";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\"\\u0080\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString12() {
        String string = ">\r";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\">\\r\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString13() {
        String string = "\t";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\t\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString14() {
        String string = "\n\u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n\\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString15() {
        String string = "\n ";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n \"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString16() {
        String string = "\n\u0080";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n\\u0080\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString17() {
        String string = "\n'";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n'\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString18() {
        String string = "\n\r";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n\\r\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString19() {
        String string = "\n\\";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n\\\\\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString20() {
        String string = "\r>";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\r>\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString21() {
        String string = "<";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"<\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString22() {
        String string = "\r'";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\r'\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString23() {
        String string = " \u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\" \\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString24() {
        String string = " \r";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\" \\r\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString25() {
        String string = " <";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\" <\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString26() {
        String string = " \n";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\" \\n\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString27() {
        String string = " \u0080";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\" \\u0080\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString28() {
        String string = " \"";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\" \\\"\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString29() {
        String string = " '";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\" '\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString30() {
        String string = " \\";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\" \\\\\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString31() {
        String string = " \t";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\" \\t\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString32() {
        String string = ">\\";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\">\\\\\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString33() {
        String string = ">'";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\">'\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString34() {
        String string = "\">";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\">\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString35() {
        String string = "\t\u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\t\\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString36() {
        String string = "\\\u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\\\\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString37() {
        String string = "\"\n";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\"\\n\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString38() {
        String string = "\n\"";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n\\\"\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString39() {
        String string = "\n\n";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n\\n\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString40() {
        String string = "><\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"><\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString41() {
        String string = ">\n";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\">\\n\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString42() {
        String string = "\n>";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n>\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString43() {
        String string = "'\u0000";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"'\\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString44() {
        String string = "\r<";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\r<\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString45() {
        String string = "\n<";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\n<\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString46() {
        String string = "\"<";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\"<\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString47() {
        String string = "\"\t";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\\"\\t\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString48() {
        String string = "\r\\";
        
        String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
        
        String expected = "\"\\r\\\\\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString49() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        char[] prevHEX_CHARS = ((char[]) getStaticFieldValue(codeGeneratorClazz, "HEX_CHARS"));
        try {
            char[] hexChars = new char[16];
            hexChars[0] = '0';
            hexChars[1] = '1';
            hexChars[2] = '2';
            hexChars[3] = '3';
            hexChars[4] = '4';
            hexChars[5] = '5';
            hexChars[6] = '6';
            hexChars[7] = '7';
            hexChars[8] = '8';
            hexChars[9] = '9';
            hexChars[10] = 'a';
            hexChars[11] = 'b';
            hexChars[12] = 'c';
            hexChars[13] = 'd';
            hexChars[14] = 'e';
            hexChars[15] = 'f';
            setStaticField(codeGeneratorClazz, "HEX_CHARS", hexChars);
            String string = "\u0000";
            
            String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
            
            String expected = "\"\\u0000\"";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(CodeGenerator.class, "HEX_CHARS", prevHEX_CHARS);
        }
    }
    
    @Test
    public void testEscapeToDoubleQuotedJsString50() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        char[] prevHEX_CHARS = ((char[]) getStaticFieldValue(codeGeneratorClazz, "HEX_CHARS"));
        try {
            char[] hexChars = new char[16];
            hexChars[0] = '0';
            hexChars[1] = '1';
            hexChars[2] = '2';
            hexChars[3] = '3';
            hexChars[4] = '4';
            hexChars[5] = '5';
            hexChars[6] = '6';
            hexChars[7] = '7';
            hexChars[8] = '8';
            hexChars[9] = '9';
            hexChars[10] = 'a';
            hexChars[11] = 'b';
            hexChars[12] = 'c';
            hexChars[13] = 'd';
            hexChars[14] = 'e';
            hexChars[15] = 'f';
            setStaticField(codeGeneratorClazz, "HEX_CHARS", hexChars);
            String string = "\u0080";
            
            String actual = CodeGenerator.escapeToDoubleQuotedJsString(string);
            
            String expected = "\"\\u0080\"";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(CodeGenerator.class, "HEX_CHARS", prevHEX_CHARS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.getNonEmptyChildCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNonEmptyChildCount(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getNonEmptyChildCount(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return i;}
 *  */
    @Test
    public void testGetNonEmptyChildCount_ReturnI_1() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNonEmptyChildCountMethod = codeGeneratorClazz.getDeclaredMethod("getNonEmptyChildCount", functionNodeType, intType);
        getNonEmptyChildCountMethod.setAccessible(true);
        java.lang.Object[] getNonEmptyChildCountMethodArguments = new java.lang.Object[2];
        getNonEmptyChildCountMethodArguments[0] = functionNode;
        getNonEmptyChildCountMethodArguments[1] = 0;
        int actual = ((Integer) getNonEmptyChildCountMethod.invoke(null, getNonEmptyChildCountMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getNonEmptyChildCount(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return i;}
 *  */
    @Test
    public void testGetNonEmptyChildCount_ReturnI() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNonEmptyChildCountMethod = codeGeneratorClazz.getDeclaredMethod("getNonEmptyChildCount", scriptOrFnNodeType, intType);
        getNonEmptyChildCountMethod.setAccessible(true);
        java.lang.Object[] getNonEmptyChildCountMethodArguments = new java.lang.Object[2];
        getNonEmptyChildCountMethodArguments[0] = scriptOrFnNode;
        getNonEmptyChildCountMethodArguments[1] = -255;
        int actual = ((Integer) getNonEmptyChildCountMethod.invoke(null, getNonEmptyChildCountMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getNonEmptyChildCount(com.google.javascript.rhino.Node,int)}
 * @utbot.iterates iterate the loop {@code for(; c != null && i < maxCount; c = c.getNext())} once
 * @utbot.returnsFrom {@code return i;}
 *  */
    @Test
    public void testGetNonEmptyChildCount_CGetTypeEqualsTokenEMPTY() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(124);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNonEmptyChildCountMethod = codeGeneratorClazz.getDeclaredMethod("getNonEmptyChildCount", functionNodeType, intType);
        getNonEmptyChildCountMethod.setAccessible(true);
        java.lang.Object[] getNonEmptyChildCountMethodArguments = new java.lang.Object[2];
        getNonEmptyChildCountMethodArguments[0] = functionNode;
        getNonEmptyChildCountMethodArguments[1] = 1;
        int actual = ((Integer) getNonEmptyChildCountMethod.invoke(null, getNonEmptyChildCountMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getNonEmptyChildCount(com.google.javascript.rhino.Node,int)}
 * @utbot.iterates iterate the loop {@code for(; c != null && i < maxCount; c = c.getNext())} once
 * @utbot.returnsFrom {@code return i;}
 *  */
    @Test
    public void testGetNonEmptyChildCount_CGetTypeNotEqualsTokenEMPTY() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNonEmptyChildCountMethod = codeGeneratorClazz.getDeclaredMethod("getNonEmptyChildCount", functionNodeType, intType);
        getNonEmptyChildCountMethod.setAccessible(true);
        java.lang.Object[] getNonEmptyChildCountMethodArguments = new java.lang.Object[2];
        getNonEmptyChildCountMethodArguments[0] = functionNode;
        getNonEmptyChildCountMethodArguments[1] = 1;
        int actual = ((Integer) getNonEmptyChildCountMethod.invoke(null, getNonEmptyChildCountMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNonEmptyChildCount(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getNonEmptyChildCount(com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node c = n.getFirstChild();
 *  */
    @Test
    public void testGetNonEmptyChildCount_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.getNonEmptyChildCount] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.getNonEmptyChildCount(CodeGenerator.java:951) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNonEmptyChildCountMethod = codeGeneratorClazz.getDeclaredMethod("getNonEmptyChildCount", nodeType, intType);
        getNonEmptyChildCountMethod.setAccessible(true);
        java.lang.Object[] getNonEmptyChildCountMethodArguments = new java.lang.Object[2];
        getNonEmptyChildCountMethodArguments[0] = ((Object) null);
        getNonEmptyChildCountMethodArguments[1] = -255;
        try {
            getNonEmptyChildCountMethod.invoke(null, getNonEmptyChildCountMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.getFirstNonEmptyChild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFirstNonEmptyChild(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getFirstNonEmptyChild(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFirstNonEmptyChild_ReturnNull() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFirstNonEmptyChildMethod = codeGeneratorClazz.getDeclaredMethod("getFirstNonEmptyChild", scriptOrFnNodeType);
        getFirstNonEmptyChildMethod.setAccessible(true);
        java.lang.Object[] getFirstNonEmptyChildMethodArguments = new java.lang.Object[1];
        getFirstNonEmptyChildMethodArguments[0] = scriptOrFnNode;
        Node actual = ((Node) getFirstNonEmptyChildMethod.invoke(null, getFirstNonEmptyChildMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getFirstNonEmptyChild(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFirstNonEmptyChild_CGetTypeEqualsTokenEMPTY() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(124);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFirstNonEmptyChildMethod = codeGeneratorClazz.getDeclaredMethod("getFirstNonEmptyChild", functionNodeType);
        getFirstNonEmptyChildMethod.setAccessible(true);
        java.lang.Object[] getFirstNonEmptyChildMethodArguments = new java.lang.Object[1];
        getFirstNonEmptyChildMethodArguments[0] = functionNode;
        Node actual = ((Node) getFirstNonEmptyChildMethod.invoke(null, getFirstNonEmptyChildMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getFirstNonEmptyChild(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 *  */
    @Test
    public void testGetFirstNonEmptyChild_CGetTypeNotEqualsTokenEMPTY() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFirstNonEmptyChildMethod = codeGeneratorClazz.getDeclaredMethod("getFirstNonEmptyChild", functionNodeType);
        getFirstNonEmptyChildMethod.setAccessible(true);
        java.lang.Object[] getFirstNonEmptyChildMethodArguments = new java.lang.Object[1];
        getFirstNonEmptyChildMethodArguments[0] = functionNode;
        FunctionNode actual = ((FunctionNode) getFirstNonEmptyChildMethod.invoke(null, getFirstNonEmptyChildMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int firstItsFunctionType = ((Integer) getFieldValue(first, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(firstItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int firstEncodedSourceStart = first.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(firstEncodedSourceStart, actualEncodedSourceStart);
        
        int firstEncodedSourceEnd = first.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(firstEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int firstBaseLineno = first.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(firstBaseLineno, actualBaseLineno);
        
        int firstEndLineno = first.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(firstEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int firstVarStart = ((Integer) getFieldValue(first, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(firstVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int firstType = first.getType();
        int actualType = actual.getType();
        assertEquals(firstType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int firstSourcePosition = ((Integer) getFieldValue(first, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(firstSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFirstNonEmptyChild(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getFirstNonEmptyChild(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node c = n.getFirstChild(); c != null; c = c.getNext())
 *  */
    @Test
    public void testGetFirstNonEmptyChild_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.getFirstNonEmptyChild] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.getFirstNonEmptyChild(CodeGenerator.java:962) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFirstNonEmptyChildMethod = codeGeneratorClazz.getDeclaredMethod("getFirstNonEmptyChild", nodeType);
        getFirstNonEmptyChildMethod.setAccessible(true);
        java.lang.Object[] getFirstNonEmptyChildMethodArguments = new java.lang.Object[1];
        getFirstNonEmptyChildMethodArguments[0] = ((Object) null);
        try {
            getFirstNonEmptyChildMethod.invoke(null, getFirstNonEmptyChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.getContextForNonEmptyExpression
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContextForNonEmptyExpression(com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getContextForNonEmptyExpression(com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.executesCondition {@code (currentContext == Context.BEFORE_DANGLING_ELSE): True}
 * @utbot.returnsFrom {@code return currentContext == Context.BEFORE_DANGLING_ELSE ? Context.BEFORE_DANGLING_ELSE : Context.OTHER;}
 *  */
    @Test
    public void testGetContextForNonEmptyExpression_CurrentContextEqualsContextBEFORE_DANGLING_ELSE() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method getContextForNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("getContextForNonEmptyExpression", contextType);
        getContextForNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] getContextForNonEmptyExpressionMethodArguments = new java.lang.Object[1];
        getContextForNonEmptyExpressionMethodArguments[0] = context;
        CodeGenerator.Context actual = ((CodeGenerator.Context) getContextForNonEmptyExpressionMethod.invoke(codeGenerator, getContextForNonEmptyExpressionMethodArguments));
        
        assertEquals(context, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getContextForNonEmptyExpression(com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.executesCondition {@code (currentContext == Context.BEFORE_DANGLING_ELSE): False}
 * @utbot.returnsFrom {@code return currentContext == Context.BEFORE_DANGLING_ELSE ? Context.BEFORE_DANGLING_ELSE : Context.OTHER;}
 *  */
    @Test
    public void testGetContextForNonEmptyExpression_CurrentContextNotEqualsContextBEFORE_DANGLING_ELSE() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method getContextForNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("getContextForNonEmptyExpression", contextType);
        getContextForNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] getContextForNonEmptyExpressionMethodArguments = new java.lang.Object[1];
        getContextForNonEmptyExpressionMethodArguments[0] = ((Object) null);
        CodeGenerator.Context actual = ((CodeGenerator.Context) getContextForNonEmptyExpressionMethod.invoke(codeGenerator, getContextForNonEmptyExpressionMethodArguments));
        
        CodeGenerator.Context expected = CodeGenerator.Context.OTHER;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.getContextForNoInOperator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.executesCondition {@code (context == Context.IN_FOR_INIT_CLAUSE): True}
 * @utbot.returnsFrom {@code return (context == Context.IN_FOR_INIT_CLAUSE ? Context.IN_FOR_INIT_CLAUSE : Context.OTHER);}
 *  */
    @Test
    public void testGetContextForNoInOperator_ContextEqualsContextIN_FOR_INIT_CLAUSE() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        CodeGenerator.Context context = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method getContextForNoInOperatorMethod = codeGeneratorClazz.getDeclaredMethod("getContextForNoInOperator", contextType);
        getContextForNoInOperatorMethod.setAccessible(true);
        java.lang.Object[] getContextForNoInOperatorMethodArguments = new java.lang.Object[1];
        getContextForNoInOperatorMethodArguments[0] = context;
        CodeGenerator.Context actual = ((CodeGenerator.Context) getContextForNoInOperatorMethod.invoke(codeGenerator, getContextForNoInOperatorMethodArguments));
        
        assertEquals(context, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#getContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.executesCondition {@code (context == Context.IN_FOR_INIT_CLAUSE): False}
 * @utbot.returnsFrom {@code return (context == Context.IN_FOR_INIT_CLAUSE ? Context.IN_FOR_INIT_CLAUSE : Context.OTHER);}
 *  */
    @Test
    public void testGetContextForNoInOperator_ContextNotEqualsContextIN_FOR_INIT_CLAUSE() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method getContextForNoInOperatorMethod = codeGeneratorClazz.getDeclaredMethod("getContextForNoInOperator", contextType);
        getContextForNoInOperatorMethod.setAccessible(true);
        java.lang.Object[] getContextForNoInOperatorMethodArguments = new java.lang.Object[1];
        getContextForNoInOperatorMethodArguments[0] = ((Object) null);
        CodeGenerator.Context actual = ((CodeGenerator.Context) getContextForNoInOperatorMethod.invoke(codeGenerator, getContextForNoInOperatorMethodArguments));
        
        CodeGenerator.Context expected = CodeGenerator.Context.OTHER;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendHexJavaScriptRepresentation(int, java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#appendHexJavaScriptRepresentation(int,java.lang.Appendable)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append("\\u").append(HEX_CHARS[(codePoint >>> 12) & 0xf]).append(HEX_CHARS[(codePoint >>> 8) & 0xf]).append(HEX_CHARS[(codePoint >>> 4) & 0xf]).append(HEX_CHARS[codePoint & 0xf]);
 *  */
    @Test
    public void testAppendHexJavaScriptRepresentation_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(CodeGenerator.java:1043) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method appendHexJavaScriptRepresentationMethod = codeGeneratorClazz.getDeclaredMethod("appendHexJavaScriptRepresentation", intType, appendableType);
        appendHexJavaScriptRepresentationMethod.setAccessible(true);
        java.lang.Object[] appendHexJavaScriptRepresentationMethodArguments = new java.lang.Object[2];
        appendHexJavaScriptRepresentationMethodArguments[0] = 0;
        appendHexJavaScriptRepresentationMethodArguments[1] = ((Object) null);
        try {
            appendHexJavaScriptRepresentationMethod.invoke(null, appendHexJavaScriptRepresentationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#appendHexJavaScriptRepresentation(int,java.lang.Appendable)}
 * @utbot.executesCondition {@code (Character.isSupplementaryCodePoint(codePoint)): True}
 * @utbot.invokes {@link java.lang.Character#toChars(int)}
 * @utbot.triggersRecursion appendHexJavaScriptRepresentation, where the test invoke:
 *     {@link java.lang.Appendable#append(java.lang.CharSequence)} once,
 *     com.google.javascript.jscomp.CodeGenerator#appendHexJavaScriptRepresentation(int,java.lang.Appendable) once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendHexJavaScriptRepresentation(surrogates[0], out);
 *  */
    @Test
    public void testAppendHexJavaScriptRepresentation_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(CodeGenerator.java:1043)
            com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(CodeGenerator.java:1039) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method appendHexJavaScriptRepresentationMethod = codeGeneratorClazz.getDeclaredMethod("appendHexJavaScriptRepresentation", intType, appendableType);
        appendHexJavaScriptRepresentationMethod.setAccessible(true);
        java.lang.Object[] appendHexJavaScriptRepresentationMethodArguments = new java.lang.Object[2];
        appendHexJavaScriptRepresentationMethodArguments[0] = 1048576;
        appendHexJavaScriptRepresentationMethodArguments[1] = ((Object) null);
        try {
            appendHexJavaScriptRepresentationMethod.invoke(null, appendHexJavaScriptRepresentationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method appendHexJavaScriptRepresentation(int, java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#appendHexJavaScriptRepresentation(int,java.lang.Appendable)}
 * @utbot.executesCondition {@code (Character.isSupplementaryCodePoint(codePoint)): False}
 * @utbot.invokes {@link java.lang.Character#isSupplementaryCodePoint(int)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.io.IOException} in: out.append("\\u").append(HEX_CHARS[(codePoint >>> 12) & 0xf]).append(HEX_CHARS[(codePoint >>> 8) & 0xf]).append(HEX_CHARS[(codePoint >>> 4) & 0xf]).append(HEX_CHARS[codePoint & 0xf]);
 *  */
    @Test(expected = IOException.class)
    public void testAppendHexJavaScriptRepresentation_ThrowIOException() throws Throwable  {
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class intType = int.class;
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Method appendHexJavaScriptRepresentationMethod = codeGeneratorClazz.getDeclaredMethod("appendHexJavaScriptRepresentation", intType, outputStreamWriterType);
        appendHexJavaScriptRepresentationMethod.setAccessible(true);
        java.lang.Object[] appendHexJavaScriptRepresentationMethodArguments = new java.lang.Object[2];
        appendHexJavaScriptRepresentationMethodArguments[0] = 0;
        appendHexJavaScriptRepresentationMethodArguments[1] = outputStreamWriter;
        try {
            appendHexJavaScriptRepresentationMethod.invoke(null, appendHexJavaScriptRepresentationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendHexJavaScriptRepresentation(int, java.lang.Appendable)
    
    @Test
    public void testAppendHexJavaScriptRepresentation1() throws Throwable  {
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        char[] prevHEX_CHARS = ((char[]) getStaticFieldValue(codeGeneratorClazz, "HEX_CHARS"));
        try {
            char[] hexChars = new char[16];
            hexChars[0] = '0';
            hexChars[1] = '1';
            hexChars[2] = '2';
            hexChars[3] = '3';
            hexChars[4] = '4';
            hexChars[5] = '5';
            hexChars[6] = '6';
            hexChars[7] = '7';
            hexChars[8] = '8';
            hexChars[9] = '9';
            hexChars[10] = 'a';
            hexChars[11] = 'b';
            hexChars[12] = 'c';
            hexChars[13] = 'd';
            hexChars[14] = 'e';
            hexChars[15] = 'f';
            setStaticField(codeGeneratorClazz, "HEX_CHARS", hexChars);
            PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
            
            /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation] produces [java.lang.NullPointerException]
                java.base/java.io.PrintWriter.write(PrintWriter.java:539)
                java.base/java.io.PrintWriter.write(PrintWriter.java:558)
                java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
                java.base/java.io.PrintWriter.append(PrintWriter.java:61)
                com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(CodeGenerator.java:1043) */
            Class intType = int.class;
            Class printWriterType = Class.forName("java.lang.Appendable");
            Method appendHexJavaScriptRepresentationMethod = codeGeneratorClazz.getDeclaredMethod("appendHexJavaScriptRepresentation", intType, printWriterType);
            appendHexJavaScriptRepresentationMethod.setAccessible(true);
            java.lang.Object[] appendHexJavaScriptRepresentationMethodArguments = new java.lang.Object[2];
            appendHexJavaScriptRepresentationMethodArguments[0] = 0;
            appendHexJavaScriptRepresentationMethodArguments[1] = printWriter;
            try {
                appendHexJavaScriptRepresentationMethod.invoke(null, appendHexJavaScriptRepresentationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(CodeGenerator.class, "HEX_CHARS", prevHEX_CHARS);
        }
    }
    
    @Test
    public void testAppendHexJavaScriptRepresentation2() throws Throwable  {
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        char[] prevHEX_CHARS = ((char[]) getStaticFieldValue(codeGeneratorClazz, "HEX_CHARS"));
        try {
            char[] hexChars = new char[16];
            hexChars[0] = '0';
            hexChars[1] = '1';
            hexChars[2] = '2';
            hexChars[3] = '3';
            hexChars[4] = '4';
            hexChars[5] = '5';
            hexChars[6] = '6';
            hexChars[7] = '7';
            hexChars[8] = '8';
            hexChars[9] = '9';
            hexChars[10] = 'a';
            hexChars[11] = 'b';
            hexChars[12] = 'c';
            hexChars[13] = 'd';
            hexChars[14] = 'e';
            hexChars[15] = 'f';
            setStaticField(codeGeneratorClazz, "HEX_CHARS", hexChars);
            PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
            
            /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation] produces [java.lang.NullPointerException]
                java.base/java.io.PrintWriter.write(PrintWriter.java:539)
                java.base/java.io.PrintWriter.write(PrintWriter.java:558)
                java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
                java.base/java.io.PrintWriter.append(PrintWriter.java:61)
                com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(CodeGenerator.java:1043)
                com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(CodeGenerator.java:1039) */
            Class intType = int.class;
            Class printWriterType = Class.forName("java.lang.Appendable");
            Method appendHexJavaScriptRepresentationMethod = codeGeneratorClazz.getDeclaredMethod("appendHexJavaScriptRepresentation", intType, printWriterType);
            appendHexJavaScriptRepresentationMethod.setAccessible(true);
            java.lang.Object[] appendHexJavaScriptRepresentationMethodArguments = new java.lang.Object[2];
            appendHexJavaScriptRepresentationMethodArguments[0] = 1048576;
            appendHexJavaScriptRepresentationMethodArguments[1] = printWriter;
            try {
                appendHexJavaScriptRepresentationMethod.invoke(null, appendHexJavaScriptRepresentationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(CodeGenerator.class, "HEX_CHARS", prevHEX_CHARS);
        }
    }
    ///endregion
    
    ///region Errors report for appendHexJavaScriptRepresentation
    
    public void testAppendHexJavaScriptRepresentation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendHexJavaScriptRepresentation(java.lang.StringBuilder, char)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#appendHexJavaScriptRepresentation(java.lang.StringBuilder,char)}
 * @utbot.invokes com.google.javascript.jscomp.CodeGenerator#appendHexJavaScriptRepresentation(int,java.lang.Appendable)
 *  */
    @Test
    public void testAppendHexJavaScriptRepresentation_CodeGeneratorAppendHexJavaScriptRepresentation() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        char[] prevHEX_CHARS = ((char[]) getStaticFieldValue(codeGeneratorClazz, "HEX_CHARS"));
        try {
            char[] hexChars = new char[16];
            hexChars[0] = '0';
            hexChars[1] = '1';
            hexChars[2] = '2';
            hexChars[3] = '3';
            hexChars[4] = '4';
            hexChars[5] = '5';
            hexChars[6] = '6';
            hexChars[7] = '7';
            hexChars[8] = '8';
            hexChars[9] = '9';
            hexChars[10] = 'a';
            hexChars[11] = 'b';
            hexChars[12] = 'c';
            hexChars[13] = 'd';
            hexChars[14] = 'e';
            hexChars[15] = 'f';
            setStaticField(codeGeneratorClazz, "HEX_CHARS", hexChars);
            StringBuilder stringBuilder = new StringBuilder("                               ");
            
            Class stringBuilderType = Class.forName("java.lang.StringBuilder");
            Class charType = char.class;
            Method appendHexJavaScriptRepresentationMethod = codeGeneratorClazz.getDeclaredMethod("appendHexJavaScriptRepresentation", stringBuilderType, charType);
            appendHexJavaScriptRepresentationMethod.setAccessible(true);
            java.lang.Object[] appendHexJavaScriptRepresentationMethodArguments = new java.lang.Object[2];
            appendHexJavaScriptRepresentationMethodArguments[0] = stringBuilder;
            appendHexJavaScriptRepresentationMethodArguments[1] = '\u8000';
            appendHexJavaScriptRepresentationMethod.invoke(null, appendHexJavaScriptRepresentationMethodArguments);
        } finally {
            setStaticField(CodeGenerator.class, "HEX_CHARS", prevHEX_CHARS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendHexJavaScriptRepresentation(java.lang.StringBuilder, char)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#appendHexJavaScriptRepresentation(java.lang.StringBuilder,char)}
 * @utbot.invokes com.google.javascript.jscomp.CodeGenerator#appendHexJavaScriptRepresentation(int,java.lang.Appendable)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendHexJavaScriptRepresentation(c, sb);
 *  */
    @Test
    public void testAppendHexJavaScriptRepresentation_ThrowNullPointerException1() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(CodeGenerator.java:1043)
            com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(CodeGenerator.java:1016) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class charType = char.class;
        Method appendHexJavaScriptRepresentationMethod = codeGeneratorClazz.getDeclaredMethod("appendHexJavaScriptRepresentation", stringBuilderType, charType);
        appendHexJavaScriptRepresentationMethod.setAccessible(true);
        java.lang.Object[] appendHexJavaScriptRepresentationMethodArguments = new java.lang.Object[2];
        appendHexJavaScriptRepresentationMethodArguments[0] = ((Object) null);
        appendHexJavaScriptRepresentationMethodArguments[1] = '\u8000';
        try {
            appendHexJavaScriptRepresentationMethod.invoke(null, appendHexJavaScriptRepresentationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addNonEmptyExpression(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context, boolean)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addNonEmptyExpression(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context,boolean)}
 * @utbot.executesCondition {@code (!allowNonBlockChild): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !allowNonBlockChild && n.getType() != Token.BLOCK
 *  */
    @Test
    public void testAddNonEmptyExpression_ThrowNullPointerException() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression(CodeGenerator.java:654) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", nodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = ((Object) null);
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = false;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addNonEmptyExpression(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context,boolean)}
 * @utbot.executesCondition {@code (!allowNonBlockChild): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.BLOCK
 *  */
    @Test
    public void testAddNonEmptyExpression_ThrowNullPointerException_1() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression(CodeGenerator.java:660) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", nodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = ((Object) null);
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addNonEmptyExpression(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context,boolean)}
 * @utbot.executesCondition {@code (!allowNonBlockChild): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#endStatement(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cc.endStatement(true);
 *  */
    @Test
    public void testAddNonEmptyExpression_ThrowNullPointerException_3() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(124);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression(CodeGenerator.java:692) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addNonEmptyExpression(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context,boolean)}
 * @utbot.executesCondition {@code (!allowNonBlockChild): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: cc.shouldPreserveExtraBlocks()
 *  */
    @Test
    public void testAddNonEmptyExpression_ThrowNullPointerException_4() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression(CodeGenerator.java:663) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = false;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addNonEmptyExpression(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context,boolean)}
 * @utbot.executesCondition {@code (!allowNonBlockChild): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: cc.shouldPreserveExtraBlocks()
 *  */
    @Test
    public void testAddNonEmptyExpression_ThrowNullPointerException_2() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(124);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression(CodeGenerator.java:663) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addNonEmptyExpression(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context, boolean)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addNonEmptyExpression(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context,boolean)}
 * @utbot.executesCondition {@code (!allowNonBlockChild): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.Error} when: !allowNonBlockChild && n.getType() != Token.BLOCK
 *  */
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression_ThrowError() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = false;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addNonEmptyExpression(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context, boolean)
    
    @Test
    public void testAddNonEmptyExpression1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(64);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
    }
    
    @Test
    public void testAddNonEmptyExpression2() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(63);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addNonEmptyExpression(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context, boolean)
    
    @Test
    public void testAddNonEmptyExpression3() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:120)
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression(CodeGenerator.java:694) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddNonEmptyExpression4() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(77);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:120)
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyExpression(CodeGenerator.java:694) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addNonEmptyExpression(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator$Context, boolean)
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression5() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(34);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression6() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(66);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression7() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(18);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression8() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression9() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(11);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression10() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(24);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression11() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(88);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression12() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression13() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression14() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(35);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression15() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(107);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression16() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(104);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression17() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(56);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression18() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(93);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression19() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression20() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression21() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(78);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression22() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(79);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression23() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(50);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression24() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(46);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression25() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(89);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression26() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression27() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(25);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression28() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(27);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression29() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(23);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression30() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(58);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression31() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(92);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression32() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(97);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression33() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(96);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression34() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(81);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression35() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(51);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression36() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(111);
        CodeGenerator.Context context = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression37() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(16);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression38() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(10);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        CodeGenerator.Context context = CodeGenerator.Context.PRESERVE_BLOCK;
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = context;
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression39() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(62);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression40() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(72);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression41() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(31);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddNonEmptyExpression42() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(12);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testAddNonEmptyExpression43() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(70);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Class booleanType = boolean.class;
        Method addNonEmptyExpressionMethod = codeGeneratorClazz.getDeclaredMethod("addNonEmptyExpression", functionNodeType, contextType, booleanType);
        addNonEmptyExpressionMethod.setAccessible(true);
        java.lang.Object[] addNonEmptyExpressionMethodArguments = new java.lang.Object[3];
        addNonEmptyExpressionMethodArguments[0] = functionNode;
        addNonEmptyExpressionMethodArguments[1] = ((Object) null);
        addNonEmptyExpressionMethodArguments[2] = true;
        try {
            addNonEmptyExpressionMethod.invoke(codeGenerator, addNonEmptyExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addList(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addList(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeGenerator#addList(com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator.Context)}
 *  */
    @Test
    public void testAddList_CodeGeneratorAddList() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        codeGenerator.addList(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addList(com.google.javascript.rhino.Node, boolean, com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addList(com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator.Context)}
 *  */
    @Test
    public void testAddList() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        codeGenerator.addList(null, false, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addList(com.google.javascript.rhino.Node, [I)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addList(com.google.javascript.rhino.Node,int[])}
 *  */
    @Test
    public void testAddList1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        codeGenerator.addList(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addList(com.google.javascript.rhino.Node, [I)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addList(com.google.javascript.rhino.Node,int[])}
 * @utbot.iterates iterate the loop {@code while(skipIndexes != null && nextSkipSlot < skipIndexes.length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cc.listSeparator();
 *  */
    @Test
    public void testAddList_ThrowNullPointerException() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        int[] intArray = {0};
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addList] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addList(CodeGenerator.java:783) */
        codeGenerator.addList(functionNode, intArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addExpr
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addExpr(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, Context.OTHER);
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(36);
        
        codeGenerator.addExpr(scriptOrFnNode, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, Context.OTHER);
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(78);
        
        codeGenerator.addExpr(scriptOrFnNode, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, Context.OTHER);
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_2() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(107);
        
        codeGenerator.addExpr(scriptOrFnNode, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, Context.OTHER);
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_3() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(54);
        
        codeGenerator.addExpr(scriptOrFnNode, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, Context.OTHER);
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_4() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        
        codeGenerator.addExpr(scriptOrFnNode, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, Context.OTHER);
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_5() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(8);
        
        codeGenerator.addExpr(scriptOrFnNode, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, Context.OTHER);
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_6() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(48);
        
        codeGenerator.addExpr(scriptOrFnNode, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, Context.OTHER);
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_7() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(117);
        
        codeGenerator.addExpr(scriptOrFnNode, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addExpr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addExpr(com.google.javascript.rhino.Node, int, com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.executesCondition {@code (context == Context.IN_FOR_INIT_CLAUSE): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#precedence(int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeGenerator#add(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator.Context)}
 *  */
    @Test
    public void testAddExpr_ContextNotEqualsContextIN_FOR_INIT_CLAUSE() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(100);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = 3;
        addExprMethodArguments[2] = ((Object) null);
        addExprMethod.invoke(codeGenerator, addExprMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addExpr(com.google.javascript.rhino.Node, int, com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test
    public void testAddExpr_ThrowNullPointerException() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addExpr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:735) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", nodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = ((Object) null);
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addExpr(com.google.javascript.rhino.Node, int, com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError1() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(82);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_11() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_21() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(5);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_31() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(72);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_41() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(123);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_51() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(106);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_61() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(104);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_71() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(54);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_8() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(7);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_9() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(119);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_10() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(84);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_111() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_12() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(111);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_13() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(49);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_14() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(121);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} when: (NodeUtil.precedence(n.getType()) < minPrecedence) || ((context == Context.IN_FOR_INIT_CLAUSE) && (n.getType() == Token.IN))
 *  */
    @Test(expected = Error.class)
    public void testAddExpr_ThrowError_15() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(109);
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class contextType = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Method addExprMethod = codeGeneratorClazz.getDeclaredMethod("addExpr", scriptOrFnNodeType, intType, contextType);
        addExprMethod.setAccessible(true);
        java.lang.Object[] addExprMethodArguments = new java.lang.Object[3];
        addExprMethodArguments[0] = scriptOrFnNode;
        addExprMethodArguments[1] = -255;
        addExprMethodArguments[2] = ((Object) null);
        try {
            addExprMethod.invoke(codeGenerator, addExprMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addIdentifier
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addIdentifier(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addIdentifier(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeGenerator#identifierEscape(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#addIdentifier(java.lang.String)}
 *  */
    @Test
    public void testAddIdentifier_CodeConsumerAddIdentifier() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addIdentifier(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addIdentifier(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cc.addIdentifier(identifierEscape(identifier));
 *  */
    @Test
    public void testAddIdentifier_ThrowNullPointerException() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:69) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        try {
            addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addIdentifier(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cc.addIdentifier(identifierEscape(identifier));
 *  */
    @Test
    public void testAddIdentifier_ThrowNullPointerException_1() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:69) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        try {
            addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addIdentifier(java.lang.String)
    
    @Test
    public void testAddIdentifier1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '_');
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "$";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        char finalCodeGeneratorCcLastChar = ((Character) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar"));
        CodeConsumer codeGeneratorCc1 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc1, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals('$', finalCodeGeneratorCcLastChar);
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    
    @Test
    public void testAddIdentifier2() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(cc, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "\u0000";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        int finalCodeGeneratorCcSize = ((Integer) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "size"));
        CodeConsumer codeGeneratorCc1 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementNeedsEnded = ((Boolean) getFieldValue(codeGeneratorCc1, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertEquals(2, finalCodeGeneratorCcSize);
        
        assertFalse(finalCodeGeneratorCcStatementNeedsEnded);
    }
    
    @Test
    public void testAddIdentifier3() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "\u0000\u0000";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
    }
    
    @Test
    public void testAddIdentifier4() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "last", '\u0000');
        setField(cc, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "\u0000";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        int finalCodeGeneratorCcCost = ((Integer) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "cost"));
        CodeConsumer codeGeneratorCc1 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        char finalCodeGeneratorCcLast = ((Character) getFieldValue(codeGeneratorCc1, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "last"));
        CodeConsumer codeGeneratorCc2 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementNeedsEnded = ((Boolean) getFieldValue(codeGeneratorCc2, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertEquals(3, finalCodeGeneratorCcCost);
        
        assertEquals('b', finalCodeGeneratorCcLast);
        
        assertFalse(finalCodeGeneratorCcStatementNeedsEnded);
    }
    
    @Test
    public void testAddIdentifier5() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "\u0000\u0000";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    
    @Test
    public void testAddIdentifier6() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "\u0000\u0000";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementNeedsEnded = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        
        assertFalse(finalCodeGeneratorCcStatementNeedsEnded);
    }
    
    @Test
    public void testAddIdentifier7() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "maxCost", Integer.MAX_VALUE);
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "cost", -3);
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "last", '\u0000');
        setField(cc, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        int finalCodeGeneratorCcCost = ((Integer) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "cost"));
        CodeConsumer codeGeneratorCc1 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        char finalCodeGeneratorCcLast = ((Character) getFieldValue(codeGeneratorCc1, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "last"));
        CodeConsumer codeGeneratorCc2 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementNeedsEnded = ((Boolean) getFieldValue(codeGeneratorCc2, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        CodeConsumer codeGeneratorCc3 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc3, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals(0, finalCodeGeneratorCcCost);
        
        assertEquals('b', finalCodeGeneratorCcLast);
        
        assertFalse(finalCodeGeneratorCcStatementNeedsEnded);
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    
    @Test
    public void testAddIdentifier8() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(cc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "last", '\u0000');
        setField(cc, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        int finalCodeGeneratorCcCost = ((Integer) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "cost"));
        CodeConsumer codeGeneratorCc1 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        char finalCodeGeneratorCcLast = ((Character) getFieldValue(codeGeneratorCc1, "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator", "last"));
        CodeConsumer codeGeneratorCc2 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementNeedsEnded = ((Boolean) getFieldValue(codeGeneratorCc2, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded"));
        CodeConsumer codeGeneratorCc3 = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc3, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertEquals(3, finalCodeGeneratorCcCost);
        
        assertEquals('b', finalCodeGeneratorCcLast);
        
        assertFalse(finalCodeGeneratorCcStatementNeedsEnded);
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    
    @Test
    public void testAddIdentifier9() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter");
        StringBuilder code = new StringBuilder("");
        setField(cc, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "code", code);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "_";
        
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        
        CodeConsumer codeGeneratorCc = ((CodeConsumer) getFieldValue(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc"));
        boolean finalCodeGeneratorCcStatementStarted = ((Boolean) getFieldValue(codeGeneratorCc, "com.google.javascript.jscomp.CodeConsumer", "statementStarted"));
        
        assertTrue(finalCodeGeneratorCcStatementStarted);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addIdentifier(java.lang.String)
    
    @Test
    public void testAddIdentifier10() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        String string = "\u0080";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:69) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        try {
            addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddIdentifier11() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        String string = "\u0000\u0080";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:69) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        try {
            addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddIdentifier12() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:69) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        try {
            addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddIdentifier13() throws Throwable  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(cc, "com.google.javascript.jscomp.CodeConsumer", "statementNeedsEnded", true);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        String string = "\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addIdentifier] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:168)
            com.google.javascript.jscomp.CodeConsumer.maybeEndStatement(CodeConsumer.java:184)
            com.google.javascript.jscomp.CodeConsumer.add(CodeConsumer.java:211)
            com.google.javascript.jscomp.CodeConsumer.addIdentifier(CodeConsumer.java:91)
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:69) */
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class stringType = Class.forName("java.lang.String");
        Method addIdentifierMethod = codeGeneratorClazz.getDeclaredMethod("addIdentifier", stringType);
        addIdentifierMethod.setAccessible(true);
        java.lang.Object[] addIdentifierMethodArguments = new java.lang.Object[1];
        addIdentifierMethodArguments[0] = string;
        try {
            addIdentifierMethod.invoke(codeGenerator, addIdentifierMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addLeftExpr
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addLeftExpr(com.google.javascript.rhino.Node, int, com.google.javascript.jscomp.CodeGenerator$Context)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addLeftExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, context);
 *  */
    @Test(expected = Error.class)
    public void testAddLeftExpr_ThrowError() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(36);
        
        codeGenerator.addLeftExpr(scriptOrFnNode, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addLeftExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, context);
 *  */
    @Test(expected = Error.class)
    public void testAddLeftExpr_ThrowError_1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(61);
        
        codeGenerator.addLeftExpr(scriptOrFnNode, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addLeftExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, context);
 *  */
    @Test(expected = Error.class)
    public void testAddLeftExpr_ThrowError_2() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(74);
        
        codeGenerator.addLeftExpr(scriptOrFnNode, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addLeftExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, context);
 *  */
    @Test(expected = Error.class)
    public void testAddLeftExpr_ThrowError_3() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(106);
        
        codeGenerator.addLeftExpr(scriptOrFnNode, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addLeftExpr(com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator.Context)}
 * @utbot.throwsException {@link java.lang.Error} in: addExpr(n, minPrecedence, context);
 *  */
    @Test(expected = Error.class)
    public void testAddLeftExpr_ThrowError_4() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(69);
        
        codeGenerator.addLeftExpr(scriptOrFnNode, -255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addCaseBody
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addCaseBody(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addCaseBody(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeConsumer#beginCaseBody()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cc.beginCaseBody();
 *  */
    @Test
    public void testAddCaseBody_ThrowNullPointerException() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addCaseBody] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addCaseBody(CodeGenerator.java:799) */
        codeGenerator.addCaseBody(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addCaseBody(com.google.javascript.rhino.Node)
    
    @Test
    public void testAddCaseBody1() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter");
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(cc, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "code", code);
        setField(cc, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "lineLength", 1);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addCaseBody] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:81)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73)
            com.google.javascript.jscomp.CodeGenerator.addCaseBody(CodeGenerator.java:800) */
        codeGenerator.addCaseBody(null);
    }
    
    @Test
    public void testAddCaseBody2() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter");
        StringBuilder code = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(cc, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "code", code);
        setField(cc, "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter", "indent", -2147483647);
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addCaseBody] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:81)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:73)
            com.google.javascript.jscomp.CodeGenerator.addCaseBody(CodeGenerator.java:800) */
        codeGenerator.addCaseBody(null);
    }
    
    @Test
    public void testAddCaseBody3() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "trackGzippedSize", true);
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.addCaseBody] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter.append(PerformanceTracker.java:168)
            com.google.javascript.jscomp.CodeConsumer.beginCaseBody(CodeConsumer.java:204)
            com.google.javascript.jscomp.CodeGenerator.addCaseBody(CodeGenerator.java:799) */
        codeGenerator.addCaseBody(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addCaseBody(com.google.javascript.rhino.Node)
    
    @Test(expected = Error.class)
    public void testAddCaseBody4() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter");
        setField(cc, "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter", "lastChar", '\u0000');
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        codeGenerator.addCaseBody(functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.regexpEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method regexpEscape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String)}
 * @utbot.returnsFrom {@code return regexpEscape(s, null);}
 *  */
    @Test
    public void testRegexpEscape_ReturnRegexpEscape() {
        String string = "";
        
        String actual = CodeGenerator.regexpEscape(string);
        
        String expected = "//";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String)}
 * @utbot.returnsFrom {@code return regexpEscape(s, null);}
 *  */
    @Test
    public void testRegexpEscape_ReturnRegexpEscape_1() {
        String string = "\t";
        
        String actual = CodeGenerator.regexpEscape(string);
        
        String expected = "/\\t/";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String)}
 * @utbot.returnsFrom {@code return regexpEscape(s, null);}
 *  */
    @Test
    public void testRegexpEscape_ReturnRegexpEscape_2() {
        String string = "\"";
        
        String actual = CodeGenerator.regexpEscape(string);
        
        String expected = "/\"/";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String)}
 * @utbot.returnsFrom {@code return regexpEscape(s, null);}
 *  */
    @Test
    public void testRegexpEscape_ReturnRegexpEscape_3() {
        String string = "\\";
        
        String actual = CodeGenerator.regexpEscape(string);
        
        String expected = "/\\/";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String)}
 * @utbot.returnsFrom {@code return regexpEscape(s, null);}
 *  */
    @Test
    public void testRegexpEscape_ReturnRegexpEscape_4() {
        String string = ">";
        
        String actual = CodeGenerator.regexpEscape(string);
        
        String expected = "/>/";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method regexpEscape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CodeGenerator}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String)}
     */
    @Test
    public void testRegexpEscapeWithNonEmptyString() {
        String actual = CodeGenerator.regexpEscape("\u0014\n\t\r");
        
        String expected = "/\\u0014\\n\\t\\r/";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.regexpEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method regexpEscape(java.lang.String, java.nio.charset.CharsetEncoder)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeGenerator#strEscape(java.lang.String,char,java.lang.String,java.lang.String,java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.returnsFrom {@code return strEscape(s, '/', "\"", "'", "\\", outputCharsetEncoder);}
 *  */
    @Test
    public void testRegexpEscape_CodeGeneratorStrEscape() {
        String string = "";
        
        String actual = CodeGenerator.regexpEscape(string, null);
        
        String expected = "//";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method regexpEscape(java.lang.String, java.nio.charset.CharsetEncoder)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRegexpEscape_ThrowIndexOutOfBoundsException() throws Exception  {
        String string = " ";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.regexpEscape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        CodeGenerator.regexpEscape(string, encoder);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRegexpEscape_ThrowIndexOutOfBoundsException_1() throws Exception  {
        String string = "^";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\u0000'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.regexpEscape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        CodeGenerator.regexpEscape(string, encoder);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRegexpEscape_ThrowIndexOutOfBoundsException_2() throws Exception  {
        String string = "> ";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.regexpEscape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        CodeGenerator.regexpEscape(string, encoder);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method regexpEscape(java.lang.String, java.nio.charset.CharsetEncoder)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CodeGenerator}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String,java.nio.charset.CharsetEncoder)}
     */
    @Test
    public void testRegexpEscapeThrowsNPE() {
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.regexpEscape] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.strEscape(CodeGenerator.java:867)
            com.google.javascript.jscomp.CodeGenerator.regexpEscape(CodeGenerator.java:842) */
        CodeGenerator.regexpEscape(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.jsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method jsString(java.lang.String, java.nio.charset.CharsetEncoder)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#jsString(java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.executesCondition {@code (singleq < doubleq): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeGenerator#strEscape(java.lang.String,char,java.lang.String,java.lang.String,java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.returnsFrom {@code return strEscape(s, quote, doublequote, singlequote, "\\\\", outputCharsetEncoder);}
 *  */
    @Test
    public void testJsString_SingleqGreaterOrEqualDoubleq() {
        String string = "";
        
        String actual = CodeGenerator.jsString(string, null);
        
        String expected = "\"\"";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method jsString(java.lang.String, java.nio.charset.CharsetEncoder)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#jsString(java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.executesCondition {@code (singleq < doubleq): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return strEscape(s, quote, doublequote, singlequote, "\\\\", outputCharsetEncoder);
 *  */
    @Test
    public void testJsString_ThrowIndexOutOfBoundsException() throws Exception  {
        String string = " ";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.jsString] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        CodeGenerator.jsString(string, encoder);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#jsString(java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.executesCondition {@code (singleq < doubleq): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return strEscape(s, quote, doublequote, singlequote, "\\\\", outputCharsetEncoder);
 *  */
    @Test
    public void testJsString_ThrowIndexOutOfBoundsException_1() throws Exception  {
        String string = "@";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC0'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.jsString] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        CodeGenerator.jsString(string, encoder);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#jsString(java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.executesCondition {@code (singleq < doubleq): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return strEscape(s, quote, doublequote, singlequote, "\\\\", outputCharsetEncoder);
 *  */
    @Test
    public void testJsString_ThrowIndexOutOfBoundsException_2() throws Exception  {
        String string = " \"";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.jsString] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        CodeGenerator.jsString(string, encoder);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#jsString(java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < s.length(); i++)
 *  */
    @Test
    public void testJsString_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.jsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.jsString(CodeGenerator.java:815) */
        CodeGenerator.jsString(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method jsString(java.lang.String, java.nio.charset.CharsetEncoder)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CodeGenerator}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#jsString(java.lang.String,java.nio.charset.CharsetEncoder)}
     */
    @Test
    public void testJsStringWithNonEmptyString() {
        String actual = CodeGenerator.jsString("\\\\", null);
        
        String expected = "\"\\\\\\\\\"";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.addAllSiblings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAllSiblings(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addAllSiblings(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testAddAllSiblings() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        
        codeGenerator.addAllSiblings(null);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#addAllSiblings(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(Node c = n; c != null; c = c.getNext())} once
 *  */
    @Test
    public void testAddAllSiblings_CodeGeneratorAdd() throws Exception  {
        CodeGenerator codeGenerator = ((CodeGenerator) createInstance("com.google.javascript.jscomp.CodeGenerator"));
        Object cc = createInstance("com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator");
        setField(codeGenerator, "com.google.javascript.jscomp.CodeGenerator", "cc", cc);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        codeGenerator.addAllSiblings(functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.identifierEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method identifierEscape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#identifierEscape(java.lang.String)}
 * @utbot.returnsFrom {@code return s;}
 *  */
    @Test
    public void testIdentifierEscape_ReturnS() {
        String string = "";
        
        String actual = CodeGenerator.identifierEscape(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#identifierEscape(java.lang.String)}
 * @utbot.returnsFrom {@code return s;}
 *  */
    @Test
    public void testIdentifierEscape_ReturnS_1() {
        String string = "";
        
        String actual = CodeGenerator.identifierEscape(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method identifierEscape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CodeGenerator}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#identifierEscape(java.lang.String)}
     */
    @Test
    public void testIdentifierEscapeWithNonEmptyString() {
        String actual = CodeGenerator.identifierEscape("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method identifierEscape(java.lang.String)
    
    @Test
    public void testIdentifierEscape1() {
        String string = "  \u0000\u0080";
        
        String actual = CodeGenerator.identifierEscape(string);
        
        String expected = "  \\u0000\\u0080";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testIdentifierEscape2() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        String actual = CodeGenerator.identifierEscape(string);
        
        assertEquals(string, actual);
    }
    
    @Test
    public void testIdentifierEscape3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        char[] prevHEX_CHARS = ((char[]) getStaticFieldValue(codeGeneratorClazz, "HEX_CHARS"));
        try {
            char[] hexChars = new char[16];
            hexChars[0] = '0';
            hexChars[1] = '1';
            hexChars[2] = '2';
            hexChars[3] = '3';
            hexChars[4] = '4';
            hexChars[5] = '5';
            hexChars[6] = '6';
            hexChars[7] = '7';
            hexChars[8] = '8';
            hexChars[9] = '9';
            hexChars[10] = 'a';
            hexChars[11] = 'b';
            hexChars[12] = 'c';
            hexChars[13] = 'd';
            hexChars[14] = 'e';
            hexChars[15] = 'f';
            setStaticField(codeGeneratorClazz, "HEX_CHARS", hexChars);
            String string = "\u0080\u0000";
            
            String actual = CodeGenerator.identifierEscape(string);
            
            String expected = "\\u0080\\u0000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(CodeGenerator.class, "HEX_CHARS", prevHEX_CHARS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CodeGenerator.strEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method strEscape(java.lang.String, char, java.lang.String, java.lang.String, java.lang.String, java.nio.charset.CharsetEncoder)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#strEscape(java.lang.String,char,java.lang.String,java.lang.String,java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); i++)} once
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testStrEscape_StringBuilderToString() {
        String string = "";
        
        String actual = CodeGenerator.strEscape(string, ' ', null, null, null, null);
        
        String expected = "  ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method strEscape(java.lang.String, char, java.lang.String, java.lang.String, java.lang.String, java.nio.charset.CharsetEncoder)
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#strEscape(java.lang.String,char,java.lang.String,java.lang.String,java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: outputCharsetEncoder.canEncode(c)
 *  */
    @Test
    public void testStrEscape_ThrowIndexOutOfBoundsException() throws Exception  {
        String string = "@";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC0'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.strEscape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        CodeGenerator.strEscape(string, ' ', null, null, null, encoder);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#strEscape(java.lang.String,char,java.lang.String,java.lang.String,java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: outputCharsetEncoder.canEncode(c)
 *  */
    @Test
    public void testStrEscape_ThrowIndexOutOfBoundsException_1() throws Exception  {
        String string = " ";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.strEscape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        CodeGenerator.strEscape(string, ' ', null, null, null, encoder);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#strEscape(java.lang.String,char,java.lang.String,java.lang.String,java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: outputCharsetEncoder.canEncode(c)
 *  */
    @Test
    public void testStrEscape_ThrowIndexOutOfBoundsException_2() throws Exception  {
        String string = "\\@";
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC0'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.strEscape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        CodeGenerator.strEscape(string, ' ', null, null, null, encoder);
    }
    
    /**
    @utbot.classUnderTest {@link CodeGenerator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodeGenerator#strEscape(java.lang.String,char,java.lang.String,java.lang.String,java.lang.String,java.nio.charset.CharsetEncoder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < s.length(); i++)
 *  */
    @Test
    public void testStrEscape_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.CodeGenerator.strEscape] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.strEscape(CodeGenerator.java:867) */
        CodeGenerator.strEscape(null, ' ', null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method strEscape(java.lang.String, char, java.lang.String, java.lang.String, java.lang.String, java.nio.charset.CharsetEncoder)
    
    @Test
    public void testStrEscape1() {
        String string = " \\";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000 null\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape2() {
        String string = " '";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000 null\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape3() {
        String string = " >";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000 >\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape4() {
        String string = " \u0000";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, string, string, null);
        
        String expected = "\u0000 \\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape5() {
        String string = "<K\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000<K\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape6() {
        String string = "\\\u0000";
        String string1 = "";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', string1, null, null, null);
        
        String expected = "\u0000null\\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape7() {
        String string = "\\\u0080";
        String string1 = "";
        String string2 = "";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', string1, string2, null, null);
        
        String expected = "\u0000null\\u0080\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape8() {
        String string = "\\ ";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000null \u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape9() {
        String string = "\r";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000\\r\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape10() {
        String string = "\t";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000\\t\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape11() {
        String string = "\\\t";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000null\\t\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape12() {
        String string = "\\\r";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000null\\r\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape13() {
        String string = "\\\\";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000nullnull\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape14() {
        String string = "'";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000null\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape15() {
        String string = "\"";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000null\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape16() {
        String string = "\\>";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000null>\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape17() {
        String string = "\\\n";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000null\\n\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape18() {
        String string = "\\\"";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000nullnull\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape19() {
        String string = "\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', string, null, null, null);
        
        String expected = "\u0000\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape20() {
        String string = "\\<";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000null<\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape21() {
        String string = "\\";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, string1, string1, null);
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape22() {
        String string = "\\'";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000nullnull\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape23() {
        String string = ">";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000>\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape24() {
        String string = "\n";
        
        String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
        
        String expected = "\u0000\\n\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStrEscape25() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        char[] prevHEX_CHARS = ((char[]) getStaticFieldValue(codeGeneratorClazz, "HEX_CHARS"));
        try {
            char[] hexChars = new char[16];
            hexChars[0] = '0';
            hexChars[1] = '1';
            hexChars[2] = '2';
            hexChars[3] = '3';
            hexChars[4] = '4';
            hexChars[5] = '5';
            hexChars[6] = '6';
            hexChars[7] = '7';
            hexChars[8] = '8';
            hexChars[9] = '9';
            hexChars[10] = 'a';
            hexChars[11] = 'b';
            hexChars[12] = 'c';
            hexChars[13] = 'd';
            hexChars[14] = 'e';
            hexChars[15] = 'f';
            setStaticField(codeGeneratorClazz, "HEX_CHARS", hexChars);
            String string = "\u0080";
            
            String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
            
            String expected = "\u0000\\u0080\u0000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(CodeGenerator.class, "HEX_CHARS", prevHEX_CHARS);
        }
    }
    
    @Test
    public void testStrEscape26() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class codeGeneratorClazz = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        char[] prevHEX_CHARS = ((char[]) getStaticFieldValue(codeGeneratorClazz, "HEX_CHARS"));
        try {
            char[] hexChars = new char[16];
            hexChars[0] = '0';
            hexChars[1] = '1';
            hexChars[2] = '2';
            hexChars[3] = '3';
            hexChars[4] = '4';
            hexChars[5] = '5';
            hexChars[6] = '6';
            hexChars[7] = '7';
            hexChars[8] = '8';
            hexChars[9] = '9';
            hexChars[10] = 'a';
            hexChars[11] = 'b';
            hexChars[12] = 'c';
            hexChars[13] = 'd';
            hexChars[14] = 'e';
            hexChars[15] = 'f';
            setStaticField(codeGeneratorClazz, "HEX_CHARS", hexChars);
            String string = "\u0000";
            
            String actual = CodeGenerator.strEscape(string, '\u0000', null, null, null, null);
            
            String expected = "\u0000\\u0000\u0000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(CodeGenerator.class, "HEX_CHARS", prevHEX_CHARS);
        }
    }
    ///endregion
    
    ///region Errors report for strEscape
    
    public void testStrEscape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields911503583281500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields911503583281500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass911503583288900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911503583281500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911503583288900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields911503583803800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields911503583803800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass911503583806300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911503583803800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911503583806300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields911503584549800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields911503584549800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass911503584551700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911503584549800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911503584551700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields911503585032100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields911503585032100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass911503585034100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911503585032100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911503585034100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

