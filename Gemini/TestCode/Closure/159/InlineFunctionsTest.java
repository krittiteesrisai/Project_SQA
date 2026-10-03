import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.common.base.Supplier;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for InlineFunctions (Closure-159b).
 */
public class InlineFunctionsTest {

    private AbstractCompiler compiler;
    private Supplier<String> supplier;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // Setup basic compiler options if needed
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);

        supplier = new Supplier<String>() {
            private int id = 0;
            @Override
            public String get() {
                return "compiler_temp_id_" + (id++);
            }
        };
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullCompiler() {
        new InlineFunctions(null, supplier, true, true, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullSupplier() {
        new InlineFunctions(compiler, null, true, true, true);
    }

    @Test
    public void testConstructorValidState() {
        InlineFunctions inf = new InlineFunctions(compiler, supplier, true, false, true);
        assertNotNull(inf);
    }

    @Test
    public void testGetOrCreateFunctionState() {
        InlineFunctions inf = new InlineFunctions(compiler, supplier, true, true, true);
        
        // Test branch: fs == null (creates new)
        Object fs1 = inf.getOrCreateFunctionState("testFunc");
        assertNotNull(fs1);

        // Test branch: fs != null (retrieves existing)
        Object fs2 = inf.getOrCreateFunctionState("testFunc");
        assertSame(fs1, fs2);
    }

    @Test
    public void testIsCandidateUsageVarAndFunction() {
        // VAR declaration parent
        Node nameNodeVar = Node.newString(Token.NAME, "myFunc");
        Node varNode = new Node(Token.VAR, nameNodeVar);
        assertTrue(InlineFunctions.isCandidateUsage(nameNodeVar));

        // FUNCTION declaration parent
        Node nameNodeFn = Node.newString(Token.NAME, "myFunc");
        Node fnNode = new Node(Token.FUNCTION, nameNodeFn);
        assertTrue(InlineFunctions.isCandidateUsage(nameNodeFn));
    }

    @Test
    public void testIsCandidateUsageCall() {
        // CALL parent where first child is the name
        Node nameNodeCall = Node.newString(Token.NAME, "myFunc");
        Node callNode = new Node(Token.CALL, nameNodeCall);
        assertTrue(InlineFunctions.isCandidateUsage(nameNodeCall));
    }

    @Test
    public void testIsCandidateUsageDotCall() {
        // Pattern: name.call(...) -> GETPROP(NAME, STRING("call")) inside a CALL
        Node nameNode = Node.newString(Token.NAME, "myFunc");
        Node stringNode = Node.newString(Token.STRING, "call");
        Node getPropNode = new Node(Token.GETPROP, nameNode, stringNode);
        
        Node callNode = new Node(Token.CALL, getPropNode, Node.newNumber(1.0));
        
        assertTrue(InlineFunctions.isCandidateUsage(nameNode));
    }

    @Test
    public void testIsCandidateUsageInvalid() {
        // General expression usage that is not a candidate
        Node nameNode = Node.newString(Token.NAME, "myFunc");
        Node assignNode = new Node(Token.ASSIGN, nameNode, Node.newNumber(1.0));
        
        assertFalse(InlineFunctions.isCandidateUsage(nameNode));
    }

    @Test
    public void testFunctionStateEdgeCases() {
        // Use reflection or direct package-private testing via InlineFunctions inner classes if accessible,
        // or test behaviors exposed through public/package methods.
        InlineFunctions inf = new InlineFunctions(compiler, supplier, true, true, true);
        
        // Validating FunctionState interactions through getOrCreateFunctionState
        // Since FunctionState is private static inside InlineFunctions, we interact via available hooks.
        assertNotNull(inf.getOrCreateFunctionState("targetFunc"));
    }
}