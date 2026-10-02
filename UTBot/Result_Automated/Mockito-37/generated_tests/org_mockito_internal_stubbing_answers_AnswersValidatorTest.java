package org.mockito.internal.stubbing.answers;

import org.junit.Test;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.SerializableMockitoMethod;
import org.mockito.exceptions.base.MockitoException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_mockito_internal_stubbing_answers_AnswersValidatorTest {
    ///region Test suites for executable org.mockito.internal.stubbing.answers.AnswersValidator.validate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method validate(org.mockito.stubbing.Answer, org.mockito.internal.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validate(org.mockito.stubbing.Answer,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (answer instanceof ThrowsException): False}
 * @utbot.executesCondition {@code (answer instanceof Returns): False}
 * @utbot.executesCondition {@code (answer instanceof DoesNothing): False}
 *  */
    @Test
    public void testValidate_NotAnswerNotInstanceOfDoesNothing() {
        AnswersValidator answersValidator = new AnswersValidator();
        
        answersValidator.validate(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validate(org.mockito.stubbing.Answer, org.mockito.internal.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validate(org.mockito.stubbing.Answer,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (answer instanceof ThrowsException): True}
 * @utbot.executesCondition {@code (answer instanceof Returns): False}
 * @utbot.executesCondition {@code (answer instanceof DoesNothing): False}
 * @utbot.invokes org.mockito.internal.stubbing.answers.AnswersValidator#validateException(org.mockito.internal.stubbing.answers.ThrowsException,org.mockito.internal.invocation.Invocation)
 * @utbot.throwsException {@link java.lang.IllegalAccessError} 
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testValidate_ThrowIllegalAccessError() throws Exception  {
        AnswersValidator answersValidator = new AnswersValidator();
        ThrowsException throwsException = ((ThrowsException) createInstance("org.mockito.internal.stubbing.answers.ThrowsException"));
        NumberFormatException throwable = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        setField(throwsException, "org.mockito.internal.stubbing.answers.ThrowsException", "throwable", throwable);
        
        answersValidator.validate(throwsException, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validate(org.mockito.stubbing.Answer,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (answer instanceof ThrowsException): False}
 * @utbot.executesCondition {@code (answer instanceof Returns): True}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: validateReturnValue((Returns) answer, invocation);
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testValidate_ThrowIllegalAccessError_1() throws Exception  {
        AnswersValidator answersValidator = ((AnswersValidator) createInstance("org.mockito.internal.stubbing.answers.AnswersValidator"));
        Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
        setField(answersValidator, "org.mockito.internal.stubbing.answers.AnswersValidator", "reporter", reporter);
        Returns returns = new Returns(null);
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        Class returnType = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType", returnType);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        answersValidator.validate(returns, invocation);
    }
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validate(org.mockito.stubbing.Answer,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (answer instanceof ThrowsException): False}
 * @utbot.executesCondition {@code (answer instanceof Returns): False}
 * @utbot.executesCondition {@code (answer instanceof DoesNothing): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validateDoNothing((DoesNothing) answer, invocation);
 *  */
    @Test
    public void testValidate_ThrowNullPointerException_1() {
        AnswersValidator answersValidator = new AnswersValidator();
        DoesNothing doesNothing = new DoesNothing();
        
        /* This test fails because method [org.mockito.internal.stubbing.answers.AnswersValidator.validate] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.answers.AnswersValidator.validateDoNothing(AnswersValidator.java:32)
            org.mockito.internal.stubbing.answers.AnswersValidator.validate(AnswersValidator.java:25) */
        answersValidator.validate(doesNothing, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validate(org.mockito.stubbing.Answer,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (answer instanceof ThrowsException): False}
 * @utbot.executesCondition {@code (answer instanceof Returns): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validateReturnValue((Returns) answer, invocation);
 *  */
    @Test
    public void testValidate_ThrowNullPointerException() {
        AnswersValidator answersValidator = new AnswersValidator();
        Returns returns = new Returns(null);
        
        /* This test fails because method [org.mockito.internal.stubbing.answers.AnswersValidator.validate] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.answers.AnswersValidator.validateReturnValue(AnswersValidator.java:38)
            org.mockito.internal.stubbing.answers.AnswersValidator.validate(AnswersValidator.java:21) */
        answersValidator.validate(returns, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validate(org.mockito.stubbing.Answer,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (answer instanceof ThrowsException): False}
 * @utbot.executesCondition {@code (answer instanceof Returns): False}
 * @utbot.executesCondition {@code (answer instanceof DoesNothing): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validateDoNothing((DoesNothing) answer, invocation);
 *  */
    @Test
    public void testValidate_ThrowNullPointerException_2() throws Exception  {
        AnswersValidator answersValidator = ((AnswersValidator) createInstance("org.mockito.internal.stubbing.answers.AnswersValidator"));
        DoesNothing doesNothing = new DoesNothing();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        /* This test fails because method [org.mockito.internal.stubbing.answers.AnswersValidator.validate] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.answers.AnswersValidator.validateDoNothing(AnswersValidator.java:33)
            org.mockito.internal.stubbing.answers.AnswersValidator.validate(AnswersValidator.java:25) */
        answersValidator.validate(doesNothing, invocation);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method validate(org.mockito.stubbing.Answer, org.mockito.internal.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validate(org.mockito.stubbing.Answer,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (answer instanceof ThrowsException): False}
 * @utbot.executesCondition {@code (answer instanceof Returns): False}
 * @utbot.executesCondition {@code (answer instanceof DoesNothing): True}
 * @utbot.invokes org.mockito.internal.stubbing.answers.AnswersValidator#validateDoNothing(org.mockito.internal.stubbing.answers.DoesNothing,org.mockito.internal.invocation.Invocation)
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} 
 *  */
    @Test(expected = MockitoException.class)
    public void testValidate_ThrowMockitoException() throws Exception  {
        AnswersValidator answersValidator = new AnswersValidator();
        DoesNothing doesNothing = new DoesNothing();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        Class returnType = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType", returnType);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        answersValidator.validate(doesNothing, invocation);
    }
    ///endregion
    
    ///region Errors report for validate
    
    public void testValidate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.answers.AnswersValidator.validateException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validateException(org.mockito.internal.stubbing.answers.ThrowsException, org.mockito.internal.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validateException(org.mockito.internal.stubbing.answers.ThrowsException,org.mockito.internal.invocation.Invocation)}
 * @utbot.invokes {@link org.mockito.internal.stubbing.answers.ThrowsException#getThrowable()}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: Throwable throwable = answer.getThrowable();
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testValidateException_ThrowIllegalAccessError() throws Throwable  {
        AnswersValidator answersValidator = new AnswersValidator();
        
        Class answersValidatorClazz = Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator");
        Class throwsExceptionType = Class.forName("org.mockito.internal.stubbing.answers.ThrowsException");
        Class invocationType = Class.forName("org.mockito.internal.invocation.Invocation");
        Method validateExceptionMethod = answersValidatorClazz.getDeclaredMethod("validateException", throwsExceptionType, invocationType);
        validateExceptionMethod.setAccessible(true);
        java.lang.Object[] validateExceptionMethodArguments = new java.lang.Object[2];
        validateExceptionMethodArguments[0] = ((Object) null);
        validateExceptionMethodArguments[1] = ((Object) null);
        try {
            validateExceptionMethod.invoke(answersValidator, validateExceptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.answers.AnswersValidator.validateDoNothing
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validateDoNothing(org.mockito.internal.stubbing.answers.DoesNothing, org.mockito.internal.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validateDoNothing(org.mockito.internal.stubbing.answers.DoesNothing,org.mockito.internal.invocation.Invocation)}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#isVoid()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !invocation.isVoid()
 *  */
    @Test
    public void testValidateDoNothing_ThrowNullPointerException() throws Throwable  {
        AnswersValidator answersValidator = new AnswersValidator();
        
        /* This test fails because method [org.mockito.internal.stubbing.answers.AnswersValidator.validateDoNothing] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.answers.AnswersValidator.validateDoNothing(AnswersValidator.java:32) */
        Class answersValidatorClazz = Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator");
        Class doesNothingType = Class.forName("org.mockito.internal.stubbing.answers.DoesNothing");
        Class invocationType = Class.forName("org.mockito.internal.invocation.Invocation");
        Method validateDoNothingMethod = answersValidatorClazz.getDeclaredMethod("validateDoNothing", doesNothingType, invocationType);
        validateDoNothingMethod.setAccessible(true);
        java.lang.Object[] validateDoNothingMethodArguments = new java.lang.Object[2];
        validateDoNothingMethodArguments[0] = ((Object) null);
        validateDoNothingMethodArguments[1] = ((Object) null);
        try {
            validateDoNothingMethod.invoke(answersValidator, validateDoNothingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validateDoNothing(org.mockito.internal.stubbing.answers.DoesNothing,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (!invocation.isVoid()): True}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#isVoid()}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#onlyVoidMethodsCanBeSetToDoNothing()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reporter.onlyVoidMethodsCanBeSetToDoNothing();
 *  */
    @Test
    public void testValidateDoNothing_ThrowNullPointerException_1() throws Throwable  {
        AnswersValidator answersValidator = ((AnswersValidator) createInstance("org.mockito.internal.stubbing.answers.AnswersValidator"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        /* This test fails because method [org.mockito.internal.stubbing.answers.AnswersValidator.validateDoNothing] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.answers.AnswersValidator.validateDoNothing(AnswersValidator.java:33) */
        Class answersValidatorClazz = Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator");
        Class doesNothingType = Class.forName("org.mockito.internal.stubbing.answers.DoesNothing");
        Class invocationType = Class.forName("org.mockito.internal.invocation.Invocation");
        Method validateDoNothingMethod = answersValidatorClazz.getDeclaredMethod("validateDoNothing", doesNothingType, invocationType);
        validateDoNothingMethod.setAccessible(true);
        java.lang.Object[] validateDoNothingMethodArguments = new java.lang.Object[2];
        validateDoNothingMethodArguments[0] = ((Object) null);
        validateDoNothingMethodArguments[1] = invocation;
        try {
            validateDoNothingMethod.invoke(answersValidator, validateDoNothingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method validateDoNothing(org.mockito.internal.stubbing.answers.DoesNothing, org.mockito.internal.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validateDoNothing(org.mockito.internal.stubbing.answers.DoesNothing,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (!invocation.isVoid()): False}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#isVoid()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} 
 *  */
    @Test(expected = MockitoException.class)
    public void testValidateDoNothing_ThrowMockitoException() throws Throwable  {
        AnswersValidator answersValidator = new AnswersValidator();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        Class returnType = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType", returnType);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        Class answersValidatorClazz = Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator");
        Class doesNothingType = Class.forName("org.mockito.internal.stubbing.answers.DoesNothing");
        Class invocationType = Class.forName("org.mockito.internal.invocation.Invocation");
        Method validateDoNothingMethod = answersValidatorClazz.getDeclaredMethod("validateDoNothing", doesNothingType, invocationType);
        validateDoNothingMethod.setAccessible(true);
        java.lang.Object[] validateDoNothingMethodArguments = new java.lang.Object[2];
        validateDoNothingMethodArguments[0] = ((Object) null);
        validateDoNothingMethodArguments[1] = invocation;
        try {
            validateDoNothingMethod.invoke(answersValidator, validateDoNothingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.answers.AnswersValidator.validateReturnValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validateReturnValue(org.mockito.internal.stubbing.answers.Returns, org.mockito.internal.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validateReturnValue(org.mockito.internal.stubbing.answers.Returns,org.mockito.internal.invocation.Invocation)}
 * @utbot.executesCondition {@code (invocation.isVoid()): True}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#isVoid()}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#cannotStubVoidMethodWithAReturnValue()}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: reporter.cannotStubVoidMethodWithAReturnValue();
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testValidateReturnValue_ThrowIllegalAccessError() throws Throwable  {
        AnswersValidator answersValidator = ((AnswersValidator) createInstance("org.mockito.internal.stubbing.answers.AnswersValidator"));
        Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
        setField(answersValidator, "org.mockito.internal.stubbing.answers.AnswersValidator", "reporter", reporter);
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        Class returnType = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType", returnType);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        Class answersValidatorClazz = Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator");
        Class returnsType = Class.forName("org.mockito.internal.stubbing.answers.Returns");
        Class invocationType = Class.forName("org.mockito.internal.invocation.Invocation");
        Method validateReturnValueMethod = answersValidatorClazz.getDeclaredMethod("validateReturnValue", returnsType, invocationType);
        validateReturnValueMethod.setAccessible(true);
        java.lang.Object[] validateReturnValueMethodArguments = new java.lang.Object[2];
        validateReturnValueMethodArguments[0] = ((Object) null);
        validateReturnValueMethodArguments[1] = invocation;
        try {
            validateReturnValueMethod.invoke(answersValidator, validateReturnValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnswersValidator}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.AnswersValidator#validateReturnValue(org.mockito.internal.stubbing.answers.Returns,org.mockito.internal.invocation.Invocation)}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#isVoid()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: invocation.isVoid()
 *  */
    @Test
    public void testValidateReturnValue_ThrowNullPointerException() throws Throwable  {
        AnswersValidator answersValidator = new AnswersValidator();
        
        /* This test fails because method [org.mockito.internal.stubbing.answers.AnswersValidator.validateReturnValue] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.answers.AnswersValidator.validateReturnValue(AnswersValidator.java:38) */
        Class answersValidatorClazz = Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator");
        Class returnsType = Class.forName("org.mockito.internal.stubbing.answers.Returns");
        Class invocationType = Class.forName("org.mockito.internal.invocation.Invocation");
        Method validateReturnValueMethod = answersValidatorClazz.getDeclaredMethod("validateReturnValue", returnsType, invocationType);
        validateReturnValueMethod.setAccessible(true);
        java.lang.Object[] validateReturnValueMethodArguments = new java.lang.Object[2];
        validateReturnValueMethodArguments[0] = ((Object) null);
        validateReturnValueMethodArguments[1] = ((Object) null);
        try {
            validateReturnValueMethod.invoke(answersValidator, validateReturnValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1129501221148300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1129501221148300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1129501221153900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1129501221148300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1129501221153900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

