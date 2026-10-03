package org.mockito.internal.stubbing.answers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationBuilder;
import org.mockito.stubbing.Answer;
import org.mockito.invocation.InvocationOnMock;

import java.io.IOException;

import static org.junit.Assert.fail;

public class AnswersValidatorTest {

    private AnswersValidator validator;

    @Before
    public void setUp() {
        validator = new AnswersValidator();
    }

    // ==========================================
    // Tests for ThrowsException
    // ==========================================

    @Test(expected = MockitoException.class)
    public void testValidateException_NullThrowable_ThrowsMockitoException() {
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        validator.validate(new ThrowsException(null), invocation);
    }

    @Test
    public void testValidateException_RuntimeException_IsValid() {
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        validator.validate(new ThrowsException(new RuntimeException("Test RuntimeException")), invocation);
    }

    @Test
    public void testValidateException_Error_IsValid() {
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        validator.validate(new ThrowsException(new Error("Test Error")), invocation);
    }

    @Test
    public void testValidateException_ValidCheckedException_IsValid() {
        Invocation invocation = new InvocationBuilder().method("canThrowException").toInvocation();
        validator.validate(new ThrowsException(new Exception("Checked Exception")), invocation);
    }

    @Test(expected = MockitoException.class)
    public void testValidateException_InvalidCheckedException_ThrowsMockitoException() {
        // simpleMethod does not declare IOException
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        validator.validate(new ThrowsException(new IOException("Undeclared Checked Exception")), invocation);
    }

    // ==========================================
    // Tests for DoesNothing
    // ==========================================

    @Test
    public void testValidateDoNothing_VoidMethod_IsValid() {
        Invocation invocation = new InvocationBuilder().method("voidMethod").toInvocation();
        validator.validate(new DoesNothing(), invocation);
    }

    @Test(expected = MockitoException.class)
    public void testValidateDoNothing_NonVoidMethod_ThrowsMockitoException() {
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        validator.validate(new DoesNothing(), invocation);
    }

    // ==========================================
    // Tests for Returns
    // ==========================================

    @Test(expected = MockitoException.class)
    public void testValidateReturnValue_VoidMethodWithReturnValue_ThrowsMockitoException() {
        Invocation invocation = new InvocationBuilder().method("voidMethod").toInvocation();
        validator.validate(new Returns("someValue"), invocation);
    }

    @Test(expected = MockitoException.class)
    public void testValidateReturnValue_ReturnsNullOnPrimitiveMethod_ThrowsMockitoException() {
        Invocation invocation = new InvocationBuilder().method("booleanReturningMethod").toInvocation();
        validator.validate(new Returns(null), invocation);
    }

    @Test
    public void testValidateReturnValue_ReturnsNullOnObjectMethod_IsValid() {
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        validator.validate(new Returns(null), invocation);
    }

    @Test(expected = MockitoException.class)
    public void testValidateReturnValue_IncompatibleReturnType_ThrowsMockitoException() {
        // simpleMethod returns String, but we pass Integer (123)
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        validator.validate(new Returns(123), invocation);
    }

    @Test
    public void testValidateReturnValue_CompatibleReturnType_IsValid() {
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        validator.validate(new Returns("validString"), invocation);
    }

    // ==========================================
    // Tests for Other Answer Types / Edge Cases
    // ==========================================

    @Test
    public void testValidate_CustomAnswer_PassesSilently() {
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        Answer<Object> customAnswer = new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) {
                return "custom";
            }
        };
        validator.validate(customAnswer, invocation);
    }

    @Test
    public void testValidate_NullAnswer_PassesSilently() {
        Invocation invocation = new InvocationBuilder().method("simpleMethod").toInvocation();
        validator.validate(null, invocation);
    }
}